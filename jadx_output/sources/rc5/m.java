package rc5;

/* loaded from: classes11.dex */
public final class m extends android.widget.FrameLayout {
    public android.animation.Animator A;

    /* renamed from: d, reason: collision with root package name */
    public final float f394168d;

    /* renamed from: e, reason: collision with root package name */
    public final float f394169e;

    /* renamed from: f, reason: collision with root package name */
    public final rc5.x f394170f;

    /* renamed from: g, reason: collision with root package name */
    public int f394171g;

    /* renamed from: h, reason: collision with root package name */
    public int f394172h;

    /* renamed from: i, reason: collision with root package name */
    public int f394173i;

    /* renamed from: m, reason: collision with root package name */
    public int f394174m;

    /* renamed from: n, reason: collision with root package name */
    public final yz5.l f394175n;

    /* renamed from: o, reason: collision with root package name */
    public final yz5.l f394176o;

    /* renamed from: p, reason: collision with root package name */
    public final rc5.n f394177p;

    /* renamed from: q, reason: collision with root package name */
    public final androidx.customview.widget.l f394178q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f394179r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f394180s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f394181t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f394182u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f394183v;

    /* renamed from: w, reason: collision with root package name */
    public final android.view.animation.AccelerateInterpolator f394184w;

    /* renamed from: x, reason: collision with root package name */
    public final android.view.animation.AccelerateInterpolator f394185x;

    /* renamed from: y, reason: collision with root package name */
    public final yz5.l f394186y;

    /* renamed from: z, reason: collision with root package name */
    public final yz5.l f394187z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(rc5.x uic, int i17, float f17, float f18, yz5.l enableDragProbe, yz5.l isBoucingProbe, rc5.n nVar) {
        super(uic.getActivity());
        kotlin.jvm.internal.o.g(uic, "uic");
        kotlin.jvm.internal.o.g(enableDragProbe, "enableDragProbe");
        kotlin.jvm.internal.o.g(isBoucingProbe, "isBoucingProbe");
        this.f394168d = f17;
        this.f394169e = f18;
        this.f394170f = uic;
        this.f394171g = i17;
        this.f394172h = i17 - i65.a.h(getContext(), com.tencent.mm.R.dimen.f479727dj);
        int i18 = (int) (this.f394171g * f17);
        this.f394173i = i18;
        this.f394174m = (int) (i18 * f18);
        this.f394175n = enableDragProbe;
        this.f394176o = isBoucingProbe;
        this.f394177p = nVar;
        this.f394178q = new androidx.customview.widget.l(getContext(), this, new rc5.e(this));
        this.f394182u = uic.y7();
        this.f394184w = new android.view.animation.AccelerateInterpolator(0.8f);
        this.f394185x = new android.view.animation.AccelerateInterpolator(0.2f);
        new android.view.animation.DecelerateInterpolator(0.8f);
        new android.view.animation.DecelerateInterpolator(0.2f);
        this.f394186y = new rc5.k(this);
        this.f394187z = new rc5.l(this);
    }

    public final void a() {
        if (this.f394182u) {
            android.view.View view = this.f394180s;
            if (view != null) {
                view.setClipToOutline(false);
                view.setOutlineProvider(null);
                return;
            }
            return;
        }
        android.view.View view2 = this.f394180s;
        if (view2 != null) {
            fq1.e eVar = fq1.e.f265507a;
            jz5.g gVar = rc5.x.D;
            eVar.g(view2, ((java.lang.Number) ((jz5.n) rc5.x.D).getValue()).floatValue(), true, false);
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f394178q.h(true)) {
            invalidate();
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        if (!((java.lang.Boolean) this.f394175n.invoke(event)).booleanValue() || ((java.lang.Boolean) this.f394176o.invoke(event)).booleanValue() || this.f394183v) {
            return false;
        }
        return this.f394178q.t(event);
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        this.f394178q.m(event);
        return true;
    }
}
