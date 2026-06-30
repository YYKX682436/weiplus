package zd3;

/* loaded from: classes7.dex */
public final class b implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zd3.c f471602d;

    public b(zd3.c cVar) {
        this.f471602d = cVar;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        com.tencent.mm.plugin.magicbrush.texture.IPCMBExternalCallbackData iPCMBExternalCallbackData = (com.tencent.mm.plugin.magicbrush.texture.IPCMBExternalCallbackData) obj;
        int i17 = iPCMBExternalCallbackData.f148159d;
        zd3.c cVar = this.f471602d;
        if (i17 == 0) {
            rk0.c.c("MB_External_surface", "operateExternalTexture success", new java.lang.Object[0]);
            cVar.s().invoke(cVar.k());
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("operateExternalTexture failed, errCode: ");
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
        yz5.l s17 = cVar.s();
        if (str == null) {
            str = "unknown error";
        }
        s17.invoke(cVar.j(zVar, str));
    }
}
