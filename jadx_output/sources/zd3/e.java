package zd3;

/* loaded from: classes7.dex */
public final class e implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zd3.f f471608d;

    public e(zd3.f fVar) {
        this.f471608d = fVar;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        com.tencent.mm.plugin.magicbrush.texture.IPCMBExternalCallbackData iPCMBExternalCallbackData = (com.tencent.mm.plugin.magicbrush.texture.IPCMBExternalCallbackData) obj;
        int i17 = iPCMBExternalCallbackData.f148159d;
        zd3.f fVar = this.f471608d;
        if (i17 == 0) {
            java.lang.String str = iPCMBExternalCallbackData.f148161f;
            if (str != null) {
                rk0.c.c("MB_External_surface", "prepareResourceForExternalTexture success, result: ".concat(str), new java.lang.Object[0]);
                yz5.l s17 = fVar.s();
                lc3.a0 a0Var = new lc3.a0();
                a0Var.put(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_EXTRA_DATA, new org.json.JSONObject(str));
                fVar.m(a0Var);
                s17.invoke(a0Var);
                return;
            }
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("prepareResourceForExternalTexture failed, errCode: ");
        int i18 = iPCMBExternalCallbackData.f148159d;
        sb6.append(i18);
        sb6.append(", errMsg: ");
        java.lang.String str2 = iPCMBExternalCallbackData.f148160e;
        sb6.append(str2);
        rk0.c.b("MB_External_surface", sb6.toString(), new java.lang.Object[0]);
        yz5.l s18 = fVar.s();
        if (str2 == null) {
            str2 = "unknown error";
        }
        s18.invoke(fVar.h(i18, str2));
    }
}
