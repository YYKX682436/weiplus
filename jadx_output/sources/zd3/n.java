package zd3;

/* loaded from: classes7.dex */
public final class n implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zd3.o f471624d;

    public n(zd3.o oVar) {
        this.f471624d = oVar;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        com.tencent.mm.plugin.magicbrush.texture.IPCMBExternalCallbackData iPCMBExternalCallbackData = (com.tencent.mm.plugin.magicbrush.texture.IPCMBExternalCallbackData) obj;
        int i17 = iPCMBExternalCallbackData.f148159d;
        zd3.o oVar = this.f471624d;
        if (i17 == 0) {
            rk0.c.c("MB_External_surface", "unRegisterExternalTexture success", new java.lang.Object[0]);
            oVar.s().invoke(oVar.k());
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("unRegisterExternalTexture failed, errCode: ");
        int i18 = iPCMBExternalCallbackData.f148159d;
        sb6.append(i18);
        sb6.append(", errMsg: ");
        java.lang.String str = iPCMBExternalCallbackData.f148160e;
        sb6.append(str);
        rk0.c.b("MB_External_surface", sb6.toString(), new java.lang.Object[0]);
        lc3.z zVar = lc3.x.f317936c;
        if (i18 != -1) {
            if (i18 == 0) {
                zVar = lc3.x.f317934a;
            } else if (i18 == 2) {
                zVar = lc3.w.f317933a;
            }
        }
        yz5.l s17 = oVar.s();
        if (str == null) {
            str = "unknown error";
        }
        s17.invoke(oVar.j(zVar, str));
    }
}
