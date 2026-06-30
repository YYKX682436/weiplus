package wo2;

/* loaded from: classes2.dex */
public final class c0 implements ym5.d1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wo2.m0 f448066a;

    public c0(wo2.m0 m0Var) {
        this.f448066a = m0Var;
    }

    @Override // ym5.d1
    public void a(android.view.View view, android.view.MotionEvent e17) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(e17, "e");
        com.tencent.mars.xlog.Log.i("NearbyActionBarUIC", "onDoubleClick ...");
        ((ku5.t0) ku5.t0.f312615d).B(new wo2.b0(this.f448066a));
    }
}
