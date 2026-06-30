package sc2;

/* loaded from: classes2.dex */
public final class r0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f406181d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f406182e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.xj f406183f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ sc2.h1 f406184g;

    public r0(in5.s0 s0Var, android.widget.TextView textView, com.tencent.mm.ui.xj xjVar, sc2.h1 h1Var) {
        this.f406181d = s0Var;
        this.f406182e = textView;
        this.f406183f = xjVar;
        this.f406184g = h1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        in5.s0 s0Var = this.f406181d;
        int dimension = (int) s0Var.f293121e.getResources().getDimension(com.tencent.mm.R.dimen.f479693cs);
        android.graphics.Rect rect = new android.graphics.Rect();
        android.widget.TextView textView = this.f406182e;
        textView.getHitRect(rect);
        rect.top -= dimension;
        rect.bottom += dimension;
        rect.right += (int) s0Var.f293121e.getResources().getDimension(com.tencent.mm.R.dimen.f479704cz);
        this.f406183f.a(new com.tencent.mm.ui.yj(rect, textView));
        com.tencent.mars.xlog.Log.i(this.f406184g.f405928w, "countDownTv Rect: " + rect);
    }
}
