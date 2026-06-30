package l42;

/* loaded from: classes15.dex */
public final /* synthetic */ class d$$e implements fs.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s42.b f315984a;

    public /* synthetic */ d$$e(s42.b bVar) {
        this.f315984a = bVar;
    }

    @Override // fs.o
    public final boolean a(fs.n nVar) {
        ((p30.a) ((l42.z) nVar)).getClass();
        g42.f Bi = g42.f.Bi();
        Bi.getClass();
        s42.b bVar = this.f315984a;
        if (bVar == null) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("EdgeComputingMgr", "[EdgeComputingMgr] onScriptConfigOffline offlineConfig : " + bVar.f402931a);
        Bi.f268729o.post(new g42.d(Bi, bVar));
        return false;
    }
}
