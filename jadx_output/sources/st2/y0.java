package st2;

/* loaded from: classes3.dex */
public final class y0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cm2.m0 f412502d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f412503e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ st2.h1 f412504f;

    public y0(cm2.m0 m0Var, int i17, st2.h1 h1Var) {
        this.f412502d = m0Var;
        this.f412503e = i17;
        this.f412504f = h1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("locate product ");
        cm2.m0 m0Var = this.f412502d;
        sb6.append(m0Var.f43370x);
        sb6.append(" at position ");
        sb6.append(this.f412503e);
        com.tencent.mars.xlog.Log.i("Finder.LiveShoppingListPlugin", sb6.toString());
        this.f412504f.P.U(-1, m0Var.f43368v, 7);
    }
}
