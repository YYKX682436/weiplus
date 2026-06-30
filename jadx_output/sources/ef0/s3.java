package ef0;

/* loaded from: classes8.dex */
public final class s3 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ef0.z3 f252322d;

    public s3(ef0.z3 z3Var) {
        this.f252322d = z3Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.extension.reddot.a aVar = (com.tencent.mm.plugin.finder.extension.reddot.a) obj;
        kotlin.jvm.internal.o.d(aVar);
        ef0.z3 z3Var = this.f252322d;
        z3Var.getClass();
        ((ku5.t0) ku5.t0.f312615d).g(new ef0.x3(aVar));
        com.tencent.mars.xlog.Log.i("MicroMsg.TingRedDotFeatureService", "handleTingSquareRedDot path: " + aVar.f105331e + ", result: " + aVar);
        ef0.z3.wi(z3Var, aVar);
    }
}
