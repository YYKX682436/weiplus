package e84;

/* loaded from: classes4.dex */
public abstract class t extends com.tencent.mm.plugin.sns.ui.widget.l {
    public final jz5.g A;
    public final jz5.g B;
    public final jz5.g C;
    public final jz5.g D;
    public final jz5.g E;
    public final jz5.g F;
    public final jz5.g G;
    public final jz5.g H;
    public final jz5.g I;

    /* renamed from: J, reason: collision with root package name */
    public final android.view.animation.PathInterpolator f250281J;
    public float K;
    public android.animation.AnimatorSet L;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.View f250282o;

    /* renamed from: p, reason: collision with root package name */
    public final int f250283p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f250284q;

    /* renamed from: r, reason: collision with root package name */
    public final w64.n f250285r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f250286s;

    /* renamed from: t, reason: collision with root package name */
    public android.content.Context f250287t;

    /* renamed from: u, reason: collision with root package name */
    public s34.t1 f250288u;

    /* renamed from: v, reason: collision with root package name */
    public float f250289v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f250290w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f250291x;

    /* renamed from: y, reason: collision with root package name */
    public final jz5.g f250292y;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.FrameLayout f250293z;

    public t(java.lang.String str, androidx.lifecycle.y yVar, android.view.View view, int i17, boolean z17, i64.b1 b1Var, w64.n nVar) {
        super(str, yVar, view);
        this.f250282o = view;
        this.f250283p = i17;
        this.f250284q = z17;
        this.f250285r = nVar;
        this.f250286s = jz5.h.b(new e84.n(this));
        this.f250291x = jz5.h.b(new e84.k(this));
        this.f250292y = jz5.h.b(new e84.p(this));
        this.A = jz5.h.b(new e84.o(this));
        this.B = jz5.h.b(new e84.m(this));
        this.C = jz5.h.b(new e84.i(this));
        this.D = jz5.h.b(new e84.l(this));
        this.E = jz5.h.b(new e84.g(this));
        this.F = jz5.h.b(new e84.h(this));
        this.G = jz5.h.b(new e84.f(this));
        this.H = jz5.h.b(new e84.q(this));
        this.I = jz5.h.b(new e84.j(this));
        this.f250281J = new android.view.animation.PathInterpolator(0.66f, 0.0f, 0.32f, 1.0f);
    }

    public static final /* synthetic */ android.widget.ImageView A(e84.t tVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMProductIcon", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent");
        android.widget.ImageView I = tVar.I();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMProductIcon", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent");
        return I;
    }

    public static final /* synthetic */ com.tencent.mm.plugin.sns.ui.AdFrameLayout B(e84.t tVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMSnsAdBreakContainer", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent");
        com.tencent.mm.plugin.sns.ui.AdFrameLayout K = tVar.K();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMSnsAdBreakContainer", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent");
        return K;
    }

    public static final android.view.View C(e84.t tVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMTouchMaskView", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent");
        tVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMTouchMaskView", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent");
        android.view.View view = (android.view.View) ((jz5.n) tVar.H).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMTouchMaskView", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMTouchMaskView", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent");
        return view;
    }

    public static final /* synthetic */ android.content.Context y(e84.t tVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMContext$p", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent");
        android.content.Context context = tVar.f250287t;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMContext$p", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent");
        return context;
    }

    public static final android.widget.LinearLayout z(e84.t tVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMImagesKeeperLayout", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent");
        tVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMImagesKeeperLayout", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent");
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ((jz5.n) tVar.f250291x).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMImagesKeeperLayout", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMImagesKeeperLayout", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent");
        return linearLayout;
    }

    public final void D(android.graphics.drawable.GradientDrawable gradientDrawable, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("drawHighlightBackground", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent");
        gradientDrawable.setShape(0);
        gradientDrawable.setOrientation(android.graphics.drawable.GradientDrawable.Orientation.LEFT_RIGHT);
        gradientDrawable.setCornerRadii(new float[]{H(), H(), H(), H(), H(), H(), H(), H()});
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAlphaColor", "com.tencent.mm.plugin.sns.data.SnsAdUtilKt");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAlphaColor", "com.tencent.mm.plugin.sns.data.SnsAdUtilKt");
        gradientDrawable.setColors(new int[]{(((int) (0.8f * 255)) << 24) | (16777215 & i17), i17});
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("drawHighlightBackground", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent");
    }

    public final com.tencent.mm.ui.widget.imageview.WeImageView E() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMActionBtnArrow", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent");
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) ((jz5.n) this.G).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMActionBtnArrow", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent");
        return weImageView;
    }

    public final android.widget.TextView F() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMActionBtnTitle", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent");
        android.widget.TextView textView = (android.widget.TextView) ((jz5.n) this.F).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMActionBtnTitle", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent");
        return textView;
    }

    public final android.view.View G() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMBrandBackgroundView", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent");
        android.view.View view = (android.view.View) ((jz5.n) this.C).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMBrandBackgroundView", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent");
        return view;
    }

    public final float H() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMCornerRadius", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent");
        float floatValue = ((java.lang.Number) ((jz5.n) this.I).getValue()).floatValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMCornerRadius", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent");
        return floatValue;
    }

    public final android.widget.ImageView I() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMProductIcon", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent");
        android.widget.ImageView imageView = (android.widget.ImageView) ((jz5.n) this.D).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMProductIcon", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent");
        return imageView;
    }

    public final android.widget.FrameLayout J() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMSnsAdBarContainer", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent");
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ((jz5.n) this.B).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMSnsAdBarContainer", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent");
        return frameLayout;
    }

    public final com.tencent.mm.plugin.sns.ui.AdFrameLayout K() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMSnsAdBreakContainer", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent");
        com.tencent.mm.plugin.sns.ui.AdFrameLayout adFrameLayout = (com.tencent.mm.plugin.sns.ui.AdFrameLayout) ((jz5.n) this.f250286s).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMSnsAdBreakContainer", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent");
        return adFrameLayout;
    }

    public final com.tencent.mm.ui.widget.RoundedCornerFrameLayout L() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMSnsAdSingleProductBarContainer", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent");
        com.tencent.mm.ui.widget.RoundedCornerFrameLayout roundedCornerFrameLayout = (com.tencent.mm.ui.widget.RoundedCornerFrameLayout) ((jz5.n) this.A).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMSnsAdSingleProductBarContainer", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent");
        return roundedCornerFrameLayout;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0221  */
    @Override // com.tencent.mm.plugin.sns.ui.widget.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(java.lang.Object r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e84.t.d(java.lang.Object, boolean):void");
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.l
    public void v(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetComponentState", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetComponentState", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent");
        super.v((com.tencent.mm.plugin.sns.storage.SnsInfo) obj);
        android.animation.AnimatorSet animatorSet = this.L;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        android.widget.FrameLayout frameLayout = this.f250293z;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        com.tencent.mars.xlog.Log.i(j(), "resetComponentState");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetComponentState", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetComponentState", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent");
    }
}
