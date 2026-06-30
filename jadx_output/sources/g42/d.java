package g42;

/* loaded from: classes15.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s42.b f268717d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g42.f f268718e;

    public d(g42.f fVar, s42.b bVar) {
        this.f268718e = fVar;
        this.f268717d = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        g42.f fVar = this.f268718e;
        h42.c cVar = fVar.f268722e;
        s42.b bVar = this.f268717d;
        ((h42.a) cVar).a(bVar.f402931a);
        ((h42.a) fVar.f268723f).a(bVar.f402931a);
        x51.k0 k0Var = fVar.f268724g.f470096a;
        if (k0Var == null || bVar == null) {
            return;
        }
        new z42.a(k0Var, bVar.f402931a, bVar.f402935e).a();
        com.tencent.mars.xlog.Log.i("EdgeComputingDataStorage", "[EdgeComputingDataStorage] clearAllData configID : " + bVar.f402931a);
    }
}
