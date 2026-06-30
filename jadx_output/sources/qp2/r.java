package qp2;

/* loaded from: classes2.dex */
public final class r implements ym5.d1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qp2.y f365797a;

    public r(qp2.y yVar) {
        this.f365797a = yVar;
    }

    @Override // ym5.d1
    public void a(android.view.View view, android.view.MotionEvent e17) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(e17, "e");
        com.tencent.mars.xlog.Log.i("NearbyLiveSquareTabLayoutUIC", "onDoubleClick ...");
        ((ku5.t0) ku5.t0.f312615d).B(new qp2.q(this.f365797a));
    }
}
