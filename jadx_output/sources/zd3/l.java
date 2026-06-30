package zd3;

/* loaded from: classes7.dex */
public final class l implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zd3.m f471623d;

    public l(zd3.m mVar) {
        this.f471623d = mVar;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        com.tencent.mm.plugin.magicbrush.texture.IPCMBExternalCallbackData iPCMBExternalCallbackData = (com.tencent.mm.plugin.magicbrush.texture.IPCMBExternalCallbackData) obj;
        int i17 = iPCMBExternalCallbackData.f148159d;
        zd3.m mVar = this.f471623d;
        if (i17 == 0) {
            mVar.s().invoke(mVar.k());
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("reportEventForTPPlayer failed, errCode: ");
        int i18 = iPCMBExternalCallbackData.f148159d;
        sb6.append(i18);
        sb6.append(", errMsg: ");
        java.lang.String str = iPCMBExternalCallbackData.f148160e;
        sb6.append(str);
        com.tencent.mars.xlog.Log.e("MB_External_surface", sb6.toString());
        lc3.z zVar = lc3.x.f317936c;
        if (i18 != -1) {
            if (i18 == 0) {
                zVar = lc3.x.f317934a;
            } else if (i18 == 2) {
                zVar = lc3.w.f317933a;
            }
        }
        yz5.l s17 = mVar.s();
        if (str == null) {
            str = "unknown error";
        }
        s17.invoke(mVar.j(zVar, str));
    }
}
