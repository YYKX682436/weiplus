package qj3;

/* loaded from: classes10.dex */
public final class g implements yt3.r2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.FrameLayout f363876d;

    /* renamed from: e, reason: collision with root package name */
    public final ju3.d0 f363877e;

    /* renamed from: f, reason: collision with root package name */
    public final uj3.k f363878f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f363879g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f363880h;

    /* renamed from: i, reason: collision with root package name */
    public qk.o9 f363881i;

    /* renamed from: m, reason: collision with root package name */
    public ym5.w2 f363882m;

    /* renamed from: n, reason: collision with root package name */
    public l45.q f363883n;

    /* renamed from: o, reason: collision with root package name */
    public final android.content.Context f363884o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f363885p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f363886q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f363887r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f363888s;

    /* renamed from: t, reason: collision with root package name */
    public qk.g6 f363889t;

    /* renamed from: u, reason: collision with root package name */
    public int f363890u;

    public g(android.widget.FrameLayout photoLayout, ju3.d0 status, uj3.k kVar) {
        kotlin.jvm.internal.o.g(photoLayout, "photoLayout");
        kotlin.jvm.internal.o.g(status, "status");
        this.f363876d = photoLayout;
        this.f363877e = status;
        this.f363878f = kVar;
        this.f363879g = jz5.h.b(qj3.f.f363875d);
        this.f363880h = jz5.h.b(qj3.e.f363874d);
        this.f363884o = photoLayout.getContext();
        this.f363886q = java.lang.String.valueOf(java.lang.System.currentTimeMillis() + hashCode());
        this.f363889t = qk.g6.DEFAULT;
        this.f363890u = -1;
    }

    public final void a(boolean z17, ct0.b config) {
        qk.o9 o9Var;
        uj3.k kVar;
        kotlin.jvm.internal.o.g(config, "config");
        this.f363887r = true;
        android.widget.FrameLayout frameLayout = this.f363876d;
        frameLayout.setVisibility(0);
        if (z17) {
            java.lang.Object value = ((jz5.n) this.f363880h).getValue();
            kotlin.jvm.internal.o.f(value, "getValue(...)");
            o9Var = (qk.o9) value;
        } else {
            java.lang.Object value2 = ((jz5.n) this.f363879g).getValue();
            kotlin.jvm.internal.o.f(value2, "getValue(...)");
            o9Var = (qk.o9) value2;
        }
        this.f363881i = o9Var;
        if (this.f363886q == null) {
            this.f363886q = java.lang.String.valueOf(java.lang.System.currentTimeMillis() + hashCode());
        }
        qk.o9 o9Var2 = this.f363881i;
        if (o9Var2 != null) {
            qk.l9 l9Var = new qk.l9();
            l9Var.f364232b = true;
            l9Var.f364233c = false;
            l9Var.f364231a = qk.n9.SCREEN;
            l9Var.f364237g = false;
            l9Var.f364239i = config.f222218o;
            l9Var.f364240j = 0;
            l9Var.f364234d = this.f363886q;
            o9Var2.d(l9Var);
        }
        qk.o9 o9Var3 = this.f363881i;
        qk.s c17 = o9Var3 != null ? o9Var3.c(this.f363884o) : null;
        kotlin.jvm.internal.o.e(c17, "null cannot be cast to non-null type com.tencent.mm.view.MultiTalkDrawingView");
        ym5.w2 w2Var = (ym5.w2) c17;
        this.f363882m = w2Var;
        if (((bn5.g) w2Var.getBaseBoardView()) != null && (kVar = this.f363878f) != null) {
            kVar.f428303c.contains(9);
        }
        ym5.w2 w2Var2 = this.f363882m;
        dn5.e eVar = w2Var2 != null ? (dn5.e) w2Var2.getBaseFooterView() : null;
        if (eVar != null) {
            eVar.setHideFooter(true);
        }
        ym5.w2 w2Var3 = this.f363882m;
        kotlin.jvm.internal.o.e(w2Var3, "null cannot be cast to non-null type com.tencent.mm.view.MultiTalkDrawingView");
        l45.q presenter = w2Var3.getPresenter();
        this.f363883n = presenter;
        kotlin.jvm.internal.o.e(presenter, "null cannot be cast to non-null type com.tencent.mm.presenter.DrawingPresenter");
        ((l45.n) presenter).f316479t = new qj3.b(this);
        frameLayout.addView(this.f363882m, new android.widget.FrameLayout.LayoutParams(-1, -1));
        ym5.w2 w2Var4 = this.f363882m;
        if (w2Var4 != null) {
            w2Var4.setSelectedFeatureListener(new qj3.c(this));
        }
        l45.q qVar = this.f363883n;
        if (qVar != null) {
            dl.u uVar = (dl.u) ((l45.n) qVar).d(qk.g6.DOODLE);
            if (uVar != null) {
                uVar.f235053o = new qj3.d(this);
            }
        }
    }

    @Override // yt3.r2
    public boolean onBackPress() {
        qk.g6 g6Var = this.f363889t;
        qk.g6 g6Var2 = qk.g6.CROP_PHOTO;
        if (g6Var != g6Var2) {
            return false;
        }
        this.f363889t = qk.g6.DEFAULT;
        l45.q qVar = this.f363883n;
        if (qVar != null) {
            new l45.a((l45.n) qVar).b(g6Var2, 1, null);
        }
        return true;
    }

    @Override // yt3.r2
    public void release() {
        java.lang.Object value = ((jz5.n) this.f363879g).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        ((qk.o9) value).f();
        java.lang.Object value2 = ((jz5.n) this.f363880h).getValue();
        kotlin.jvm.internal.o.f(value2, "getValue(...)");
        ((qk.o9) value2).f();
        android.widget.FrameLayout frameLayout = this.f363876d;
        frameLayout.removeAllViews();
        frameLayout.setVisibility(8);
        l45.q qVar = this.f363883n;
        if (qVar != null) {
            ((l45.n) qVar).p();
        }
    }

    @Override // yt3.r2
    public void reset() {
        qk.g6 g6Var = qk.g6.DEFAULT;
        this.f363889t = g6Var;
        l45.q qVar = this.f363883n;
        if (qVar != null) {
            new l45.a((l45.n) qVar).a(g6Var);
        }
        l45.q qVar2 = this.f363883n;
        if (qVar2 != null) {
            new l45.a((l45.n) qVar2).b(g6Var, -1, null);
        }
    }
}
