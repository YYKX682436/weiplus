package mh2;

/* loaded from: classes10.dex */
public final class k0 extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public final ah2.f f326383d;

    /* renamed from: e, reason: collision with root package name */
    public final lj2.v0 f326384e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f326385f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f326386g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f326387h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f326388i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f326389m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f326390n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f326391o;

    /* renamed from: p, reason: collision with root package name */
    public mh2.a f326392p;

    /* renamed from: q, reason: collision with root package name */
    public kotlinx.coroutines.r2 f326393q;

    /* renamed from: r, reason: collision with root package name */
    public kotlinx.coroutines.r2 f326394r;

    /* renamed from: s, reason: collision with root package name */
    public kotlinx.coroutines.r2 f326395s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(android.content.Context context, ah2.f contentService, lj2.v0 pluginAbility, boolean z17) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(contentService, "contentService");
        kotlin.jvm.internal.o.g(pluginAbility, "pluginAbility");
        this.f326383d = contentService;
        this.f326384e = pluginAbility;
        this.f326385f = z17;
        this.f326386g = "KTVSingContentWidget_" + hashCode();
        this.f326387h = jz5.h.b(new mh2.h0(this, context));
        this.f326388i = jz5.h.b(new mh2.i0(this, context));
        this.f326389m = jz5.h.b(new mh2.f0(this, context));
        this.f326390n = jz5.h.b(new mh2.g0(this, context));
        setOrientation(1);
        setClipChildren(false);
        g();
    }

    public static final void a(mh2.k0 k0Var, om2.o oVar) {
        mh2.n0 f17 = k0Var.f326383d.f();
        if (f17 != null) {
            mh2.a singingWidget = k0Var.getSingingWidget();
            mh2.f1 f1Var = singingWidget instanceof mh2.f1 ? (mh2.f1) singingWidget : null;
            android.view.ViewGroup viewGroup = f1Var != null ? f1Var.f326332g : null;
            if (viewGroup != null) {
                if (!(viewGroup.indexOfChild(f17) != -1)) {
                    viewGroup.removeAllViews();
                    viewGroup.addView(f17, new android.view.ViewGroup.LayoutParams(-1, viewGroup.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.agv)));
                }
            }
            r45.xn1 xn1Var = oVar.f346361b;
            if (xn1Var != null) {
                f17.a(oVar.f346360a, xn1Var);
            }
        }
    }

    public static final void f(mh2.k0 k0Var, mh2.a aVar, om2.d0 d0Var) {
        if (kotlin.jvm.internal.o.b(k0Var.f326392p, aVar)) {
            aVar.c(d0Var);
            return;
        }
        mh2.a aVar2 = k0Var.f326392p;
        if (aVar2 != null) {
            aVar2.e(d0Var);
        }
        k0Var.f326392p = aVar;
        k0Var.removeAllViews();
        int b17 = k0Var.f326385f ? -1 : i65.a.b(k0Var.getContext(), 260);
        android.view.View view = aVar.f326292b;
        kotlin.jvm.internal.o.d(view);
        k0Var.addView(view, new android.widget.LinearLayout.LayoutParams(-1, b17));
        aVar.c(d0Var);
        kotlinx.coroutines.l.d(k0Var.f326383d.a(), null, null, new mh2.j0(k0Var, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final mh2.a getFinishSingingWidget() {
        return (mh2.a) ((jz5.n) this.f326389m).getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final mh2.a getNoSingerWidget() {
        return (mh2.a) ((jz5.n) this.f326390n).getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final mh2.a getPrepareSingWidget() {
        return (mh2.a) ((jz5.n) this.f326387h).getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final mh2.a getSingingWidget() {
        return (mh2.a) ((jz5.n) this.f326388i).getValue();
    }

    public final void g() {
        kotlinx.coroutines.r2 r2Var = this.f326393q;
        boolean z17 = r2Var != null && ((kotlinx.coroutines.a) r2Var).a();
        ah2.f fVar = this.f326383d;
        if (!z17) {
            this.f326393q = kotlinx.coroutines.l.d(fVar.a(), null, null, new mh2.e0(this, null), 3, null);
        }
        kotlinx.coroutines.r2 r2Var2 = this.f326394r;
        if (!(r2Var2 != null && ((kotlinx.coroutines.a) r2Var2).a())) {
            this.f326394r = kotlinx.coroutines.l.d(fVar.a(), null, null, new mh2.c0(this, null), 3, null);
        }
        kotlinx.coroutines.r2 r2Var3 = this.f326395s;
        if (r2Var3 != null && ((kotlinx.coroutines.a) r2Var3).a()) {
            return;
        }
        this.f326395s = kotlinx.coroutines.l.d(fVar.a(), null, null, new mh2.a0(this, null), 3, null);
    }

    public final java.lang.String getCurrentSingerUserId() {
        return this.f326391o;
    }

    public final android.view.View getKTVSongCoverAnchorView() {
        if (!kotlin.jvm.internal.o.b(this.f326392p, getSingingWidget()) || !(getSingingWidget() instanceof mh2.f1)) {
            return null;
        }
        mh2.a singingWidget = getSingingWidget();
        mh2.f1 f1Var = singingWidget instanceof mh2.f1 ? (mh2.f1) singingWidget : null;
        if (f1Var != null) {
            return f1Var.f326333h;
        }
        return null;
    }

    public final lj2.v0 getPluginAbility() {
        return this.f326384e;
    }

    public final void h(boolean z17) {
        if (kotlin.jvm.internal.o.b(this.f326392p, getSingingWidget())) {
            if (!(getSingingWidget() instanceof mh2.m1)) {
                this.f326383d.f().c();
                return;
            }
            mh2.a singingWidget = getSingingWidget();
            kotlin.jvm.internal.o.e(singingWidget, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.ktv.view.KtvCompactSingingWidget");
            com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView ripperAnimateView = ((mh2.m1) singingWidget).f326406d;
            if (z17) {
                ripperAnimateView.d();
            } else {
                int i17 = com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView.f111717o;
                ripperAnimateView.e(false);
            }
        }
    }
}
