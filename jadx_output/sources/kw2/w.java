package kw2;

/* loaded from: classes15.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kw2.y f313109d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f313110e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(kw2.y yVar, java.lang.String str) {
        super(0);
        this.f313109d = yVar;
        this.f313110e = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        kw2.y yVar = this.f313109d;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = yVar.f313116b;
        java.lang.String str = this.f313110e;
        kw2.e eVar = (kw2.e) concurrentHashMap.get(str);
        if (eVar != null) {
            eVar.I = true;
            com.tencent.mars.xlog.Log.i("FinderNetworkFlowReport", "PRERENDER_stopPreRenderForPlayerStop " + eVar.Q + ' ' + str + " item:" + eVar);
            eVar.E = true;
            if (eVar.f312955a == 4 || eVar.f312954J) {
                yVar.f313116b.remove(str);
                yVar.f(eVar, "stopPreRenderForPlayerStop");
            }
        }
        return jz5.f0.f302826a;
    }
}
