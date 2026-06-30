package sr2;

/* loaded from: classes10.dex */
public final class j0 implements wl5.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sr2.w0 f411593a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wl5.x f411594b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f411595c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f411596d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so2.p6 f411597e;

    public j0(sr2.w0 w0Var, wl5.x xVar, android.widget.TextView textView, int i17, so2.p6 p6Var) {
        this.f411593a = w0Var;
        this.f411594b = xVar;
        this.f411595c = textView;
        this.f411596d = i17;
        this.f411597e = p6Var;
    }

    @Override // wl5.t
    public final void a(java.lang.CharSequence charSequence) {
        java.lang.String obj = charSequence.toString();
        sr2.w0 w0Var = this.f411593a;
        w0Var.F = obj;
        wl5.x xVar = this.f411594b;
        java.lang.Object first = xVar.e().first;
        kotlin.jvm.internal.o.f(first, "first");
        w0Var.G = ((java.lang.Number) first).intValue();
        java.lang.Object second = xVar.e().second;
        kotlin.jvm.internal.o.f(second, "second");
        w0Var.H = ((java.lang.Number) second).intValue();
        com.tencent.mm.plugin.finder.assist.m0 S6 = w0Var.S6(w0Var.G, w0Var.H);
        if (S6 != null) {
            int i17 = w0Var.G;
            int i18 = S6.f102376b;
            int i19 = S6.f102375a;
            if (i19 != i17 || i18 != w0Var.H) {
                xVar.l(i19, i18);
                com.tencent.mars.xlog.Log.i("Finder.PostEditUIC", "[onTextSelected] select at");
                return;
            }
        }
        int[] iArr = new int[2];
        android.widget.TextView textView = this.f411595c;
        textView.getLocationInWindow(iArr);
        w0Var.K = wl5.y.c(textView, wl5.y.d(textView, w0Var.G)) + iArr[1] + this.f411596d;
        w0Var.R6(this.f411597e == so2.p6.f410542e ? w0Var.M : w0Var.L);
        charSequence.toString();
        int i27 = w0Var.G;
        int i28 = w0Var.H;
        int i29 = w0Var.K;
    }
}
