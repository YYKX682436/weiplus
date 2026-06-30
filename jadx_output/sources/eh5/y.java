package eh5;

/* loaded from: classes10.dex */
public abstract class y extends androidx.appcompat.app.i0 {

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.ui.immersive.ImmersiveBaseChromeView f252977f;

    /* renamed from: g, reason: collision with root package name */
    public final double f252978g;

    /* renamed from: h, reason: collision with root package name */
    public final long f252979h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f252980i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f252981m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.ui.widget.RoundCornerFrameLayout f252982n;

    /* renamed from: o, reason: collision with root package name */
    public final eh5.p f252983o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f252984p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f252985q;

    /* renamed from: r, reason: collision with root package name */
    public yz5.a f252986r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(com.tencent.mm.ui.immersive.ImmersiveBaseChromeView chromeView) {
        super(chromeView.getContext(), com.tencent.mm.R.style.f494143fd);
        kotlin.jvm.internal.o.g(chromeView, "chromeView");
        this.f252977f = chromeView;
        jz5.h.b(new eh5.r(this));
        this.f252978g = 0.35d;
        java.lang.Object d17 = bm5.o1.f22719a.d(new com.tencent.mm.repairer.config.msg_history_gallery.RepairerConfigMsgHistoryGalleryImmersiveActivityAnimationDuration());
        java.lang.Long l17 = d17 instanceof java.lang.Long ? (java.lang.Long) d17 : null;
        this.f252979h = l17 != null ? l17.longValue() : 200L;
        this.f252983o = new eh5.p();
        if (chromeView.getImmersiveType() != eh5.a.f252951d) {
            throw new java.lang.IllegalArgumentException("Illegal Chrome Type");
        }
        C(1);
    }

    public final void E() {
        android.view.View view = this.f252981m;
        if (view == null) {
            kotlin.jvm.internal.o.o("contentDimMask");
            throw null;
        }
        android.view.ViewPropertyAnimator animate = view.animate();
        long j17 = this.f252979h;
        animate.setDuration(j17).alpha(0.0f).start();
        com.tencent.mm.ui.widget.RoundCornerFrameLayout roundCornerFrameLayout = this.f252982n;
        if (roundCornerFrameLayout == null) {
            kotlin.jvm.internal.o.o("contentContainer");
            throw null;
        }
        android.view.ViewPropertyAnimator interpolator = roundCornerFrameLayout.animate().setDuration(j17).setInterpolator(new y3.b());
        if (this.f252982n != null) {
            interpolator.translationY(r2.getHeight() * (-1.0f)).setUpdateListener(new eh5.m(this)).withStartAction(new eh5.n(this)).withEndAction(new eh5.o(this)).start();
        } else {
            kotlin.jvm.internal.o.o("contentContainer");
            throw null;
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        if (this.f252982n == null || this.f252981m == null || !isShowing()) {
            this.f252985q = false;
            super.dismiss();
            return;
        }
        if (this.f252984p) {
            this.f252985q = true;
            return;
        }
        this.f252985q = false;
        this.f252984p = true;
        com.tencent.mm.ui.widget.RoundCornerFrameLayout roundCornerFrameLayout = this.f252982n;
        if (roundCornerFrameLayout == null) {
            kotlin.jvm.internal.o.o("contentContainer");
            throw null;
        }
        roundCornerFrameLayout.animate().cancel();
        android.view.View view = this.f252981m;
        if (view == null) {
            kotlin.jvm.internal.o.o("contentDimMask");
            throw null;
        }
        view.animate().cancel();
        com.tencent.mm.ui.widget.RoundCornerFrameLayout roundCornerFrameLayout2 = this.f252982n;
        if (roundCornerFrameLayout2 == null) {
            kotlin.jvm.internal.o.o("contentContainer");
            throw null;
        }
        if (roundCornerFrameLayout2.getHeight() > 0) {
            E();
            return;
        }
        com.tencent.mm.ui.widget.RoundCornerFrameLayout roundCornerFrameLayout3 = this.f252982n;
        if (roundCornerFrameLayout3 != null) {
            roundCornerFrameLayout3.post(new eh5.q(this));
        } else {
            kotlin.jvm.internal.o.o("contentContainer");
            throw null;
        }
    }

    @Override // androidx.appcompat.app.i0, android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(getContext());
        com.tencent.mm.ui.immersive.ImmersiveBaseChromeView immersiveBaseChromeView = this.f252977f;
        int height = pm0.v.t(immersiveBaseChromeView)[1] + immersiveBaseChromeView.getHeight();
        android.view.View view = new android.view.View(getContext());
        view.setBackground(new android.graphics.drawable.ColorDrawable(0));
        view.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, height));
        view.setOnClickListener(new eh5.s(this));
        this.f252980i = view;
        android.view.View view2 = new android.view.View(getContext());
        android.graphics.drawable.ColorDrawable colorDrawable = new android.graphics.drawable.ColorDrawable(-16777216);
        colorDrawable.setAlpha((int) (256 * this.f252978g));
        view2.setBackground(colorDrawable);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
        layoutParams.topMargin = height;
        view2.setLayoutParams(layoutParams);
        view2.setOnClickListener(new eh5.t(this));
        this.f252981m = view2;
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.ui.widget.RoundCornerFrameLayout roundCornerFrameLayout = new com.tencent.mm.ui.widget.RoundCornerFrameLayout(context);
        float h17 = i65.a.h(getContext(), com.tencent.mm.R.dimen.f479672c9);
        roundCornerFrameLayout.c(0.0f, 0.0f, h17, h17);
        ed5.w wVar = (ed5.w) this;
        roundCornerFrameLayout.setBackgroundColor(getContext().getResources().getColor(wVar.f251402v, null));
        android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = height;
        roundCornerFrameLayout.setLayoutParams(layoutParams2);
        android.content.Context context2 = wVar.f251400t.getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        yg5.b[] bVarArr = new yg5.b[1];
        yg5.a aVar = yg5.a.f462333d;
        java.util.List<com.tencent.mm.ui.chatting.history.groups.g> a17 = com.tencent.mm.ui.chatting.history.groups.g.f201751e.a();
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(a17, 10));
        for (com.tencent.mm.ui.chatting.history.groups.g gVar : a17) {
            java.lang.String name = gVar.getClass().getName();
            java.lang.String string = wVar.getContext().getResources().getString(gVar.b());
            kotlin.jvm.internal.o.f(string, "getString(...)");
            arrayList.add(new yg5.c(name, string, gVar == wVar.f251399s));
        }
        bVarArr[0] = new yg5.b("MsgHistoryGalleryType", null, aVar, arrayList, wVar.f251401u);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        yg5.b bVar = bVarArr[0];
        arrayList2.add(new yg5.d(bVar.f462335a, arrayList2.size(), bVar.f462336b, bVar.f462337c, bVar.f462339e));
        for (yg5.c cVar : bVar.f462338d) {
            arrayList2.add(new yg5.e(cVar.f462340a, bVar.f462335a, arrayList2.size(), cVar.f462341b, cVar.f462342c));
        }
        yg5.l lVar = new yg5.l(context2, null, 0, 0, arrayList2, 14, null);
        lVar.setPadding(wVar.F(16.0f), wVar.F(8.0f), wVar.F(16.0f), wVar.F(12.0f));
        lVar.setClipToPadding(false);
        roundCornerFrameLayout.addView(lVar);
        roundCornerFrameLayout.setClipToOutline(true);
        roundCornerFrameLayout.setOutlineProvider(this.f252983o);
        this.f252982n = roundCornerFrameLayout;
        android.view.View view3 = this.f252980i;
        if (view3 == null) {
            kotlin.jvm.internal.o.o("gestureMask");
            throw null;
        }
        frameLayout.addView(view3);
        android.view.View view4 = this.f252981m;
        if (view4 == null) {
            kotlin.jvm.internal.o.o("contentDimMask");
            throw null;
        }
        frameLayout.addView(view4);
        com.tencent.mm.ui.widget.RoundCornerFrameLayout roundCornerFrameLayout2 = this.f252982n;
        if (roundCornerFrameLayout2 == null) {
            kotlin.jvm.internal.o.o("contentContainer");
            throw null;
        }
        frameLayout.addView(roundCornerFrameLayout2);
        frameLayout.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        setContentView(frameLayout);
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        android.view.Window window = getWindow();
        if (window == null) {
            return;
        }
        android.view.WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.gravity = this.f252977f.getImmersiveType() == eh5.a.f252951d ? 48 : 80;
        attributes.width = -1;
        attributes.height = -1;
        attributes.x = 0;
        attributes.y = 0;
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            attributes.layoutInDisplayCutoutMode = 3;
        }
        window.setAttributes(attributes);
        window.clearFlags(262146);
        window.addFlags(-2147483104);
        n3.h2.a(window, false);
        window.setWindowAnimations(0);
        window.getDecorView().setPadding(0, 0, 0, 0);
        window.getDecorView().setSystemUiVisibility(1792);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
    }

    @Override // android.app.Dialog
    public void show() {
        this.f252985q = false;
        super.show();
        com.tencent.mm.ui.widget.RoundCornerFrameLayout roundCornerFrameLayout = this.f252982n;
        if (roundCornerFrameLayout == null || this.f252981m == null || this.f252984p) {
            return;
        }
        this.f252984p = true;
        if (roundCornerFrameLayout == null) {
            kotlin.jvm.internal.o.o("contentContainer");
            throw null;
        }
        roundCornerFrameLayout.animate().cancel();
        android.view.View view = this.f252981m;
        if (view == null) {
            kotlin.jvm.internal.o.o("contentDimMask");
            throw null;
        }
        view.animate().cancel();
        com.tencent.mm.ui.widget.RoundCornerFrameLayout roundCornerFrameLayout2 = this.f252982n;
        if (roundCornerFrameLayout2 != null) {
            roundCornerFrameLayout2.post(new eh5.x(this));
        } else {
            kotlin.jvm.internal.o.o("contentContainer");
            throw null;
        }
    }
}
