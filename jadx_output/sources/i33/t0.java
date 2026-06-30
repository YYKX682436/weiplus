package i33;

/* loaded from: classes10.dex */
public final class t0 extends i33.c {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f288247f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f288248g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f288249h;

    /* renamed from: i, reason: collision with root package name */
    public final int f288250i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f288251m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f288252n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f288253o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f288254p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f288255q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f288256r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f288257s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f288258t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f288259u;

    /* renamed from: v, reason: collision with root package name */
    public final float f288260v;

    /* renamed from: w, reason: collision with root package name */
    public final long f288261w;

    /* renamed from: x, reason: collision with root package name */
    public j33.c0 f288262x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f288263y;

    /* renamed from: z, reason: collision with root package name */
    public final jz5.g f288264z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f288247f = "MicroMsg.AlbumScrollBarUIC";
        this.f288250i = 2;
        this.f288251m = jz5.h.b(new i33.p0(this));
        this.f288252n = jz5.h.b(new i33.o0(this));
        this.f288253o = jz5.h.b(new i33.n0(this));
        this.f288254p = jz5.h.b(new i33.r0(activity));
        this.f288255q = jz5.h.b(new i33.f0(activity));
        this.f288256r = jz5.h.b(new i33.s0(activity));
        this.f288257s = jz5.h.b(new i33.e0(this));
        this.f288258t = jz5.h.b(new i33.d0(this));
        this.f288259u = jz5.h.b(new i33.k0(activity, this));
        this.f288260v = 1.0f;
        this.f288261w = 50L;
        this.f288264z = jz5.h.b(new i33.q0(this));
    }

    public static final void W6(i33.t0 t0Var) {
        if (t0Var.f288249h) {
            t0Var.f288249h = false;
            com.tencent.mars.xlog.Log.i(t0Var.f288247f, "scrollbar: event come, notifyModeChanged --> FULL_SCREEN_FOCUS");
            androidx.appcompat.app.AppCompatActivity activity = t0Var.getActivity();
            kotlin.jvm.internal.o.g(activity, "activity");
            i33.z0 z0Var = (i33.z0) pf5.z.f353948a.a(activity).e(i33.z0.class);
            if (z0Var != null) {
                z0Var.W6(com.tencent.mm.ui.q2.FULL_SCREEN_FOCUS);
            }
        }
    }

    @Override // i33.c
    public void V6(com.tencent.mm.ui.q2 oldMode, com.tencent.mm.ui.q2 newMode) {
        kotlin.jvm.internal.o.g(oldMode, "oldMode");
        kotlin.jvm.internal.o.g(newMode, "newMode");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onSelectModeChanged: oldMode=");
        sb6.append(oldMode);
        sb6.append(", newMode=");
        sb6.append(newMode);
        sb6.append(", scrollBarFocusing=");
        sb6.append(Z6().getF138672e() == com.tencent.mm.ui.q2.FULL_SCREEN_FOCUS);
        sb6.append(", scrollBarDragging=");
        sb6.append(this.f288248g);
        com.tencent.mars.xlog.Log.i(this.f288247f, sb6.toString());
        if (oldMode == newMode) {
            return;
        }
        if (newMode == com.tencent.mm.ui.q2.NORMAL) {
            this.f288248g = false;
        } else {
            d7();
            Y6(true);
        }
    }

    public final void X6() {
        if (this.f288262x != null) {
            a7().removeCallbacks(this.f288262x);
            this.f288262x = null;
            a7().getVisibility();
        }
    }

    public final void Y6(boolean z17) {
        android.os.Vibrator vibrator;
        com.tencent.mm.ui.q2 q2Var = com.tencent.mm.ui.q2.FULL_SCREEN_FOCUS;
        com.tencent.mm.ui.q2 q2Var2 = com.tencent.mm.ui.q2.NORMAL;
        com.tencent.mm.ui.q2 q2Var3 = z17 ? q2Var : q2Var2;
        java.util.Objects.toString(Z6().getF138672e());
        q2Var3.toString();
        if (Z6().getF138672e() != q2Var3) {
            if (z17 && (vibrator = (android.os.Vibrator) ((jz5.n) this.f288256r).getValue()) != null) {
                vibrator.vibrate(this.f288261w);
            }
            java.lang.String str = "refreshScrollBarMode: oldMode=" + Z6().getF138672e() + ", newMode=" + q2Var3;
            java.lang.String str2 = this.f288247f;
            com.tencent.mars.xlog.Log.i(str2, str);
            if (Z6().getF138672e() == q2Var3) {
                com.tencent.mars.xlog.Log.i(str2, "refreshScrollBarMode: same mode, skip");
                return;
            }
            if (q2Var3 == q2Var2) {
                k33.d.a(Z6(), q2Var2, 500L, null, null, 4, null);
                return;
            }
            float translationY = a7().getTranslationY();
            float a17 = b7().a(((com.tencent.mm.plugin.gallery.view.TouchableGalleryScrollBar) Z6()).c(b7().b(), q2Var3)) - translationY;
            if (this.f288248g) {
                k33.d.a(Z6(), q2Var, 100L, null, null, 4, null);
            } else {
                ((com.tencent.mm.plugin.gallery.view.TouchableGalleryScrollBar) Z6()).b(q2Var, 100L, new i33.m0(this, translationY, a17), null);
            }
        }
    }

    public final k33.d Z6() {
        return (k33.d) ((jz5.n) this.f288253o).getValue();
    }

    public final com.tencent.mm.plugin.gallery.view.AlbumScrollBarContainer a7() {
        java.lang.Object value = ((jz5.n) this.f288252n).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (com.tencent.mm.plugin.gallery.view.AlbumScrollBarContainer) value;
    }

    public final j33.w b7() {
        return (j33.w) ((jz5.n) this.f288251m).getValue();
    }

    public final void c7(long j17) {
        if (a7().getVisibility() == 0) {
            this.f288262x = new j33.c0(a7(), b7(), 0L, 0L, new i33.l0(this), null, 44, null);
            a7().postDelayed(this.f288262x, j17);
        }
    }

    public final void d7() {
        if (a7().getVisibility() != 0) {
            Y6(false);
            new j33.m(a7(), true, 0L, null, 12, null).run();
            j33.w b76 = b7();
            int b17 = b76.b();
            com.tencent.mm.plugin.gallery.view.TouchableGalleryScrollBar touchableGalleryScrollBar = (com.tencent.mm.plugin.gallery.view.TouchableGalleryScrollBar) b76.f297461b;
            a7().setTranslationY(b76.a(touchableGalleryScrollBar.c(b17, touchableGalleryScrollBar.f138672e)));
            com.tencent.mars.xlog.Log.i(this.f288247f, "showScrollBar: ");
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        i33.z0 z0Var = (i33.z0) pf5.z.f353948a.a(activity).e(i33.z0.class);
        if (z0Var != null) {
            i33.z0.Y6(z0Var, this, 0, 2, null);
        }
        T6().i(new i33.i0(this));
        T6().P(new i33.j0(this));
        a7().setOnTouchListener(new i33.g0(this, new android.view.GestureDetector(getContext(), new i33.h0(this)), new kotlin.jvm.internal.e0()));
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        j33.c0 c0Var = this.f288262x;
        if (c0Var != null) {
            c0Var.f297422g = null;
            c0Var.f297423h = null;
        }
        a7().removeCallbacks(this.f288262x);
    }
}
