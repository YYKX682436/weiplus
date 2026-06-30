package u81;

/* loaded from: classes7.dex */
public class e extends u81.f0 {

    /* renamed from: J, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.AppBrandRuntime f425411J;
    public final /* synthetic */ u81.h K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(u81.h hVar, com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime, com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime2) {
        super(appBrandRuntime);
        this.K = hVar;
        this.f425411J = appBrandRuntime2;
    }

    @Override // u81.f0
    public void v(u81.b bVar, u81.b bVar2) {
        u81.f[] fVarArr;
        com.tencent.mars.xlog.Log.i("Luggage.AppRunningStateController", "runtime : %d appid : %s running state did change from %s to %s", java.lang.Integer.valueOf(this.f425411J.hashCode()), this.f425411J.f74803n, bVar == null ? "null" : bVar.name().toLowerCase(), u81.b.DESTROYED == bVar2 ? "terminated" : bVar2.name().toLowerCase());
        u81.h hVar = this.K;
        synchronized (hVar.f425434c) {
            x.b bVar3 = hVar.f425434c;
            fVarArr = (u81.f[]) ((x.j) bVar3.keySet()).toArray(new u81.f[bVar3.f450846f]);
        }
        for (u81.f fVar : fVarArr) {
            fVar.D(hVar.f425433b.f74803n, bVar2);
        }
    }

    @Override // u81.f0
    public void w() {
        u81.f[] fVarArr;
        boolean P1 = this.K.f425433b.P1();
        com.tencent.mars.xlog.Log.i("Luggage.AppRunningStateController", "onSuspendTimeout, %s, shouldHandle?:%b", this.K.f425433b, java.lang.Boolean.valueOf(P1));
        if (P1) {
            this.K.f425433b.l0();
            u81.h hVar = this.K;
            u81.d dVar = new u81.d(this);
            synchronized (hVar.f425434c) {
                x.b bVar = hVar.f425434c;
                fVarArr = (u81.f[]) ((x.j) bVar.keySet()).toArray(new u81.f[bVar.f450846f]);
            }
            for (u81.f fVar : fVarArr) {
                if (fVar instanceof u81.g) {
                    dVar.apply((u81.g) fVar);
                }
            }
        }
    }
}
