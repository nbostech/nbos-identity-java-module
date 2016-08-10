package com.nbos.capi.modules.identity.v0;

import com.nbos.capi.api.v0.models.RestMessage;
import com.nbos.capi.api.v0.models.TokenApiModel;
import com.nbos.capi.modules.identity.v0.models.LoginModel;
import com.nbos.capi.modules.identity.v0.models.MemberApiModel;
import com.nbos.capi.modules.identity.v0.models.MemberSignupModel;
import com.nbos.capi.modules.identity.v0.models.NewMemberApiModel;
import com.nbos.capi.modules.identity.v0.models.ResetPasswordModel;
import com.nbos.capi.modules.identity.v0.models.SocialConnectApiModel;
import com.nbos.capi.modules.identity.v0.models.SocialConnectUrlResponse;
import com.nbos.capi.modules.identity.v0.models.UpdatePasswordApiModel;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;


public interface IdentityRemoteApi {

    String baseIdentityUrl = "/api/identity/v0";
    String tokenUrl = "/oauth/token";
    String loginUrl = baseIdentityUrl + "/auth/login";
    String signupUrl = baseIdentityUrl + "/users/signup";
    String connectUrl = baseIdentityUrl + "/auth/social/{connectService}/connect";
    String authorizeUrl = baseIdentityUrl + "/auth/social/{authorizeService}/authorize";
    String profileUrl = baseIdentityUrl + "/users/{uuid}";
    String forgotUrl = baseIdentityUrl + "/auth/forgotPassword";
    String changeUrl = baseIdentityUrl + "/auth/changePassword";
    String logoutUrl = baseIdentityUrl + "/auth/logout";
    String socialLoginUrl = baseIdentityUrl + "/auth/social/{loginService}/login";


    @FormUrlEncoded
    @POST(tokenUrl)
    Call<TokenApiModel> getToken(@Field("client_id") String clientId, @Field("client_secret") String clientSecret, @Field("grant_type") String grantType);

    @POST(tokenUrl)
    Call<TokenApiModel> refreshAccessToken(@Field("client_id") String clientId, @Field("client_secret") String clientSecret, @Field("grant_type") String grantType, @Field("refresh_token") String refreshToken);

    @POST(loginUrl)
    Call<NewMemberApiModel> login(@Header("Authorization") String authorization, @Body LoginModel login);

    @POST(signupUrl)
    Call<NewMemberApiModel> signup(@Header("Authorization") String authorization, @Body MemberSignupModel memberSignupModel);

    @POST(forgotUrl)
    Call<RestMessage> resetCredentials(@Header("Authorization") String authorization, @Body ResetPasswordModel resetPasswordModel);

    @POST(changeUrl)
    Call<RestMessage> updateCredentials(@Header("Authorization") String authorization, @Body UpdatePasswordApiModel changePassword);

    @GET(socialLoginUrl)
    Call<SocialConnectUrlResponse> socialWebViewLogin(@Header("Authorization") String authorization, @Path("loginService") String connectService);

    @GET(authorizeUrl)
    Call<NewMemberApiModel> authorize(@Header("Authorization") String authorization, @Path("authorizeService") String connectService, @Query("code") String code, @Query("state") String state);

    @POST(connectUrl)
    Call<NewMemberApiModel> connect(@Header("Authorization") String authorization, @Path("connectService") String connectService, @Body SocialConnectApiModel socialConnectApiModel);

    @GET(logoutUrl)
    Call<RestMessage> logout(@Header("Authorization") String authorization);

    @GET(profileUrl)
    Call<MemberApiModel> getMemberDetails(@Header("Authorization") String authorization, @Path("uuid") String uuid);

    @PUT(profileUrl)
    Call<MemberApiModel> updateMemberDetails(@Header("Authorization") String authorization, @Path("uuid") String uuid, @Body MemberApiModel memberApiModel);

}
