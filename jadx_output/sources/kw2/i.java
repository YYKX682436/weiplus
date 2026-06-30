package kw2;

/* loaded from: classes15.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kw2.y f313025d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f313026e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dn.h f313027f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(kw2.y yVar, java.lang.String str, dn.h hVar) {
        super(0);
        this.f313025d = yVar;
        this.f313026e = str;
        this.f313027f = hVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        kw2.y yVar = this.f313025d;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = yVar.f313116b;
        java.lang.String str = this.f313026e;
        kw2.e eVar = (kw2.e) concurrentHashMap.get(str);
        if (eVar != null) {
            eVar.f312954J = true;
            dn.h hVar = this.f313027f;
            long j17 = hVar.field_recvedBytes;
            eVar.H = j17;
            eVar.G = eVar.F + j17;
            if (hVar.field_retCode == 0) {
                eVar.M = true;
            }
            if (!eVar.N) {
                yVar.c(j17);
                kw2.e.V.e(eVar, hVar);
            }
            com.tencent.mars.xlog.Log.i("FinderNetworkFlowReport", "PRERENDER_handleDownloaderComeStopStateInPreRender update:" + eVar.N + ' ' + eVar.Q + ' ' + str + " item:" + eVar);
            eVar.E = true;
            if (eVar.I) {
                concurrentHashMap.remove(str);
                yVar.f(eVar, "handleDownloaderComeStopStateInPreRender");
            }
        }
        return jz5.f0.f302826a;
    }
}
