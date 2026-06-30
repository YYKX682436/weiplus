package js3;

/* loaded from: classes8.dex */
public class c implements com.tencent.mm.ipcinvoker.k0 {
    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_EXT_BIND_XMAIL_STRING_SYNC, null);
        com.tencent.mars.xlog.Log.i("MicroMsg.GetBindMailTask", "last bind xmail %s", str);
        int q17 = gm0.j1.u().c().q(9, 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.GetBindMailTask", "bindXMail %s, bindQQ %d, extUserStatus %d", str, java.lang.Integer.valueOf(q17), java.lang.Integer.valueOf(gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_EXT_USER_STATUS_INT_SYNC, 0)));
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            if (q17 != 0) {
                str = q17 + "@qq.com";
            } else {
                str = "";
            }
        }
        return new com.tencent.mm.ipcinvoker.type.IPCString(str);
    }
}
