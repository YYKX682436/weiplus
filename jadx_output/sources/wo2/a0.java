package wo2;

/* loaded from: classes2.dex */
public final class a0 implements ym5.i1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wo2.m0 f448063a;

    public a0(wo2.m0 m0Var) {
        this.f448063a = m0Var;
    }

    @Override // ym5.i1
    public void a(android.view.View view, android.view.MotionEvent motionEvent) {
        kotlin.jvm.internal.o.g(view, "view");
        com.tencent.mars.xlog.Log.i("NearbyActionBarUIC", "onDoubleClick ...");
        ((ku5.t0) ku5.t0.f312615d).B(new wo2.z(this.f448063a));
    }
}
