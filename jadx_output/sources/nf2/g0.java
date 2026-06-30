package nf2;

/* loaded from: classes10.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final nf2.e1 f336739a;

    /* renamed from: b, reason: collision with root package name */
    public final nf2.f1 f336740b;

    /* renamed from: c, reason: collision with root package name */
    public android.graphics.Rect f336741c;

    /* renamed from: d, reason: collision with root package name */
    public int f336742d;

    /* renamed from: e, reason: collision with root package name */
    public int f336743e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f336744f;

    public g0(nf2.e1 viewProvider, nf2.f1 config) {
        kotlin.jvm.internal.o.g(viewProvider, "viewProvider");
        kotlin.jvm.internal.o.g(config, "config");
        this.f336739a = viewProvider;
        this.f336740b = config;
    }

    public static void e(nf2.g0 g0Var, float f17, float f18, boolean z17, yz5.a aVar, int i17, java.lang.Object obj) {
        if ((i17 & 4) != 0) {
            z17 = true;
        }
        boolean z18 = z17;
        yz5.a aVar2 = (i17 & 8) != 0 ? null : aVar;
        android.view.View b17 = g0Var.b();
        if (b17 == null) {
            return;
        }
        android.view.ViewParent parent = b17.getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup == null) {
            return;
        }
        b17.post(new nf2.e0(g0Var, viewGroup, f17, f18, b17, z18, aVar2));
    }

    public final jz5.l a(float f17, float f18) {
        android.graphics.Rect rect;
        android.view.View b17 = b();
        if (b17 != null && (rect = this.f336741c) != null) {
            nf2.e1 e1Var = this.f336739a;
            boolean z17 = ((nf2.d1) e1Var).f336700u;
            int i17 = rect.right - rect.left;
            int i18 = rect.bottom - rect.top;
            if (z17) {
                android.view.View view = ((nf2.d1) e1Var).f336696q;
                int width = view != null ? view.getWidth() : 0;
                int height = view != null ? view.getHeight() : 0;
                int x17 = view != null ? (int) view.getX() : b17.getWidth() - width;
                int y17 = view != null ? (int) view.getY() : b17.getHeight() - height;
                int i19 = rect.left;
                int i27 = i19 - x17;
                int i28 = (rect.right - x17) - width;
                int i29 = rect.top - y17;
                int i37 = (rect.bottom - y17) - height;
                f17 = i27 > i28 ? (i19 + ((i17 - width) / 2.0f)) - x17 : e06.p.e(f17, i27, i28);
                f18 = i29 > i37 ? (rect.top + ((i18 - height) / 2.0f)) - y17 : e06.p.e(f18, i29, i37);
            } else {
                int width2 = b17.getWidth();
                int height2 = b17.getHeight();
                if (width2 > i17) {
                    f17 = (this.f336742d - width2) / 2.0f;
                } else {
                    int i38 = rect.left;
                    if (f17 < i38) {
                        f17 = i38;
                    }
                    float f19 = width2 + f17;
                    int i39 = rect.right;
                    if (f19 > i39) {
                        f17 = i39 - width2;
                    }
                }
                if (height2 > i18) {
                    f18 = (this.f336743e - height2) / 2.0f;
                } else {
                    int i47 = rect.top;
                    if (f18 < i47) {
                        f18 = i47;
                    }
                    float f27 = height2 + f18;
                    int i48 = rect.bottom;
                    if (f27 > i48) {
                        f18 = i48 - height2;
                    }
                }
            }
            return new jz5.l(java.lang.Float.valueOf(f17), java.lang.Float.valueOf(f18));
        }
        return new jz5.l(java.lang.Float.valueOf(f17), java.lang.Float.valueOf(f18));
    }

    public final android.view.View b() {
        return ((nf2.d1) this.f336739a).f336685f;
    }

    public final jz5.l c() {
        android.view.View b17 = b();
        java.lang.Float valueOf = java.lang.Float.valueOf(0.5f);
        if (b17 == null) {
            return new jz5.l(valueOf, valueOf);
        }
        if (this.f336742d <= 0 || this.f336743e <= 0) {
            return new jz5.l(valueOf, valueOf);
        }
        return new jz5.l(java.lang.Float.valueOf((b17.getX() + (b17.getWidth() / 2.0f)) / this.f336742d), java.lang.Float.valueOf((b17.getY() + (b17.getHeight() / 2.0f)) / this.f336743e));
    }

    public final void d() {
        android.view.View b17 = b();
        android.content.Context context = b17 != null ? b17.getContext() : null;
        if (context == null) {
            return;
        }
        int i17 = this.f336743e;
        nf2.f1 f1Var = this.f336740b;
        int i18 = (int) (i17 * f1Var.f336726h);
        int i19 = (int) (i17 * (1 - f1Var.f336727i));
        int a17 = ym5.x.a(context, f1Var.f336728j);
        int a18 = ym5.x.a(context, f1Var.f336729k);
        this.f336741c = new android.graphics.Rect(a17, i18 + a18, this.f336742d - a17, i19 - a18);
    }

    public final void f(yz5.a aVar) {
        android.view.View b17 = b();
        if (b17 == null) {
            return;
        }
        android.view.ViewParent parent = b17.getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup == null) {
            return;
        }
        viewGroup.post(new nf2.f0(this, viewGroup, aVar));
    }
}
