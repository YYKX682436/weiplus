package h14;

/* loaded from: classes9.dex */
public class c implements vg3.r4 {
    @Override // vg3.r4
    public void h0(java.lang.String str, java.util.Map map, com.tencent.mm.modelbase.p0 p0Var) {
        if (map != null) {
            java.lang.String str2 = (java.lang.String) map.get(".sysmsg.security");
            if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                return;
            }
            try {
                int P = com.tencent.mm.sdk.platformtools.t8.P(str2, 0);
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_DEVICE_PROTECT_SECURITY_STATUS_INT_SYNC, java.lang.Integer.valueOf(P));
                if (P != 0) {
                    ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
                    bk0.a.g().q(com.tencent.mm.storage.u3.NEW_BANDAGE_DATASOURCE_DEVICE_PROTECT_STRING_SYNC, true);
                } else {
                    ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
                    bk0.a.g().q(com.tencent.mm.storage.u3.NEW_BANDAGE_DATASOURCE_DEVICE_PROTECT_STRING_SYNC, false);
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("DeviceProtectRedSpotListener", e17, "device protect security value is not number!", new java.lang.Object[0]);
            }
        }
    }
}
