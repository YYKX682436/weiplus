package t20;

/* loaded from: classes13.dex */
public final class a implements dy1.t {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t20.g f414664d;

    public a(t20.g gVar) {
        this.f414664d = gVar;
    }

    @Override // dy1.t
    public void B(android.view.View view, int i17) {
        t20.g gVar = this.f414664d;
        if (view == null) {
            gVar.getClass();
            return;
        }
        y02.n0 Ai = gVar.Ai(view);
        if (Ai == null) {
            com.tencent.mars.xlog.Log.w("Ecs.Oracle.EcsOracleService", "[handleExposure] session is null, view:%s", view);
            return;
        }
        com.tencent.mars.xlog.Log.i("Ecs.Oracle.EcsOracleService", "[handleExposure] view:%s", view);
        t20.d dVar = new t20.d(Ai);
        if (!kotlin.jvm.internal.o.b(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
            dVar.invoke();
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).i(new t20.f(dVar));
    }

    @Override // dy1.t
    public void E(android.view.View view, int i17) {
    }
}
