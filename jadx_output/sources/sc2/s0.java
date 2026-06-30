package sc2;

/* loaded from: classes2.dex */
public final class s0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f406224d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f406225e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.xj f406226f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ sc2.h1 f406227g;

    public s0(in5.s0 s0Var, android.view.View view, com.tencent.mm.ui.xj xjVar, sc2.h1 h1Var) {
        this.f406224d = s0Var;
        this.f406225e = view;
        this.f406226f = xjVar;
        this.f406227g = h1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int dimension = (int) this.f406224d.f293121e.getResources().getDimension(com.tencent.mm.R.dimen.f479693cs);
        android.graphics.Rect rect = new android.graphics.Rect();
        android.view.View view = this.f406225e;
        view.getHitRect(rect);
        rect.top -= dimension;
        rect.bottom += dimension;
        rect.left = 0;
        this.f406226f.a(new com.tencent.mm.ui.yj(rect, view));
        com.tencent.mars.xlog.Log.i(this.f406227g.f405928w, "adTabView Rect: " + rect);
    }
}
