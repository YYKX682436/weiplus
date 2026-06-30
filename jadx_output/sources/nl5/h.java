package nl5;

/* loaded from: classes15.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.TextView f338272a;

    /* renamed from: b, reason: collision with root package name */
    public final nl5.d f338273b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f338274c;

    /* renamed from: d, reason: collision with root package name */
    public final long f338275d;

    /* renamed from: e, reason: collision with root package name */
    public final int f338276e;

    /* renamed from: f, reason: collision with root package name */
    public long f338277f;

    /* renamed from: g, reason: collision with root package name */
    public float f338278g;

    /* renamed from: h, reason: collision with root package name */
    public float f338279h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f338280i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f338281j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f338282k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f338283l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f338284m;

    /* renamed from: n, reason: collision with root package name */
    public int f338285n;

    /* renamed from: o, reason: collision with root package name */
    public long f338286o;

    /* renamed from: p, reason: collision with root package name */
    public final int[] f338287p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f338288q;

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.Runnable f338289r;

    /* renamed from: s, reason: collision with root package name */
    public final java.lang.Runnable f338290s;

    public h(android.widget.TextView textView, nl5.d selectionController, java.util.Locale locale, boolean z17, int i17, kotlin.jvm.internal.i iVar) {
        if ((i17 & 4) != 0) {
            locale = java.util.Locale.getDefault();
            kotlin.jvm.internal.o.f(locale, "getDefault(...)");
        }
        z17 = (i17 & 8) != 0 ? true : z17;
        kotlin.jvm.internal.o.g(textView, "textView");
        kotlin.jvm.internal.o.g(selectionController, "selectionController");
        kotlin.jvm.internal.o.g(locale, "locale");
        this.f338272a = textView;
        this.f338273b = selectionController;
        this.f338274c = z17;
        this.f338275d = android.view.ViewConfiguration.getDoubleTapTimeout();
        this.f338276e = android.view.ViewConfiguration.get(textView.getContext()).getScaledDoubleTapSlop();
        this.f338283l = true;
        this.f338284m = true;
        this.f338287p = new int[2];
        this.f338288q = jz5.h.b(new nl5.g(locale));
        this.f338289r = new nl5.f(this);
        this.f338290s = new nl5.e(this);
    }

    public final void a() {
        this.f338282k = false;
        this.f338272a.removeCallbacks(this.f338290s);
        this.f338285n = 0;
        this.f338286o = 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0201  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(android.view.MotionEvent r15) {
        /*
            Method dump skipped, instructions count: 715
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nl5.h.b(android.view.MotionEvent):boolean");
    }

    public final void c() {
        if (this.f338282k) {
            com.tencent.mm.ui.yk.a("DoubleTapWordSelect", "onKeyboardFullyShown: keyboard stable, refreshing UI", new java.lang.Object[0]);
            this.f338282k = false;
            this.f338272a.removeCallbacks(this.f338290s);
            nl5.s0 s0Var = ((nl5.c0) this.f338273b).f338264a;
            if (s0Var.f338373x) {
                return;
            }
            s0Var.n(s0Var.f338350b);
            s0Var.n(s0Var.f338352c);
            s0Var.p(s0Var.g());
        }
    }
}
