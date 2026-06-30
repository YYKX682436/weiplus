package zd3;

/* loaded from: classes7.dex */
public final class h implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zd3.k f471615d;

    public h(zd3.k kVar) {
        this.f471615d = kVar;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        com.tencent.mm.plugin.magicbrush.texture.IPCMBExternalCallbackData iPCMBExternalCallbackData = (com.tencent.mm.plugin.magicbrush.texture.IPCMBExternalCallbackData) obj;
        int i17 = iPCMBExternalCallbackData.f148159d;
        zd3.k kVar = this.f471615d;
        if (i17 == 0) {
            kVar.s().invoke(kVar.k());
            return;
        }
        lc3.z zVar = lc3.x.f317936c;
        if (i17 != -1) {
            if (i17 == 0) {
                zVar = lc3.x.f317934a;
            } else if (i17 == 2) {
                zVar = lc3.w.f317933a;
            }
        }
        kVar.w(zVar, iPCMBExternalCallbackData.f148160e);
    }
}
