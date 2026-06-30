package qp2;

/* loaded from: classes2.dex */
public final class p implements ym5.i1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qp2.y f365795a;

    public p(qp2.y yVar) {
        this.f365795a = yVar;
    }

    @Override // ym5.i1
    public void a(android.view.View view, android.view.MotionEvent motionEvent) {
        kotlin.jvm.internal.o.g(view, "view");
        com.tencent.mars.xlog.Log.i("NearbyLiveSquareTabLayoutUIC", "onDoubleClick ...");
        ((ku5.t0) ku5.t0.f312615d).B(new qp2.o(this.f365795a));
    }
}
