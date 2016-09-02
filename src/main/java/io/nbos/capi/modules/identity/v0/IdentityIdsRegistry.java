package io.nbos.capi.modules.identity.v0;

import io.nbos.capi.modules.ids.v0.IDS;


/**
 * Created by vivekkiran on 6/16/16.
 */

public class IdentityIdsRegistry {
    static {
        IDS.register("identity", IdentityApi.class);
    }
}
