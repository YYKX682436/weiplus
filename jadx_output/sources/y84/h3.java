package y84;

/* loaded from: classes4.dex */
public abstract class h3 extends com.tencent.mm.plugin.sns.ui.widget.l {
    public final jz5.g A;
    public jz5.g A0;
    public final jz5.g B;
    public final jz5.g B0;
    public final jz5.g C;
    public final y84.z0 C0;
    public final jz5.g D;
    public final y84.x0 D0;
    public final jz5.g E;
    public final java.util.List E0;
    public final jz5.g F;
    public final java.util.List F0;
    public final jz5.g G;
    public final java.util.List G0;
    public final jz5.g H;
    public final java.util.List H0;
    public final jz5.g I;
    public final java.util.List I0;

    /* renamed from: J */
    public final jz5.g f460072J;
    public boolean J0;
    public final jz5.g K;
    public android.animation.AnimatorSet K0;
    public final jz5.g L;
    public android.animation.AnimatorSet L0;
    public final jz5.g M;
    public final java.util.List M0;
    public final jz5.g N;
    public boolean N0;
    public final jz5.g O;
    public boolean O0;
    public final jz5.g P;
    public final java.util.List P0;
    public final jz5.g Q;
    public int Q0;
    public final jz5.g R;
    public final kotlinx.coroutines.flow.j2 R0;
    public final jz5.g S;
    public final com.tencent.mm.sdk.platformtools.n3 S0;
    public final jz5.g T;
    public final java.lang.Runnable T0;
    public final jz5.g U;
    public final jz5.g V;
    public final jz5.g W;
    public com.tencent.mm.view.MMPAGView X;
    public jz5.g Y;
    public jz5.g Z;

    /* renamed from: a0 */
    public jz5.g f460073a0;

    /* renamed from: b0 */
    public jz5.g f460074b0;

    /* renamed from: c0 */
    public jz5.g f460075c0;

    /* renamed from: d0 */
    public jz5.g f460076d0;

    /* renamed from: e0 */
    public jz5.g f460077e0;

    /* renamed from: f0 */
    public jz5.g f460078f0;

    /* renamed from: g0 */
    public jz5.g f460079g0;

    /* renamed from: h0 */
    public jz5.g f460080h0;

    /* renamed from: i0 */
    public jz5.g f460081i0;

    /* renamed from: j0 */
    public jz5.g f460082j0;

    /* renamed from: k0 */
    public jz5.g f460083k0;

    /* renamed from: l0 */
    public jz5.g f460084l0;

    /* renamed from: m0 */
    public jz5.g f460085m0;

    /* renamed from: n0 */
    public jz5.g f460086n0;

    /* renamed from: o */
    public final android.view.View f460087o;

    /* renamed from: o0 */
    public jz5.g f460088o0;

    /* renamed from: p */
    public final i64.b0 f460089p;

    /* renamed from: p0 */
    public jz5.g f460090p0;

    /* renamed from: q */
    public final jz5.g f460091q;

    /* renamed from: q0 */
    public jz5.g f460092q0;

    /* renamed from: r */
    public final jz5.g f460093r;

    /* renamed from: r0 */
    public jz5.g f460094r0;

    /* renamed from: s */
    public final jz5.g f460095s;

    /* renamed from: s0 */
    public jz5.g f460096s0;

    /* renamed from: t */
    public final jz5.g f460097t;

    /* renamed from: t0 */
    public jz5.g f460098t0;

    /* renamed from: u */
    public android.widget.LinearLayout f460099u;

    /* renamed from: u0 */
    public jz5.g f460100u0;

    /* renamed from: v */
    public boolean f460101v;

    /* renamed from: v0 */
    public jz5.g f460102v0;

    /* renamed from: w */
    public y84.l3 f460103w;

    /* renamed from: w0 */
    public jz5.g f460104w0;

    /* renamed from: x */
    public float f460105x;

    /* renamed from: x0 */
    public jz5.g f460106x0;

    /* renamed from: y */
    public android.content.Context f460107y;

    /* renamed from: y0 */
    public jz5.g f460108y0;

    /* renamed from: z */
    public com.tencent.mm.plugin.sns.storage.SnsInfo f460109z;

    /* renamed from: z0 */
    public jz5.g f460110z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(java.lang.String str, androidx.lifecycle.y yVar, android.view.View view, i64.b0 adViewComponentData) {
        super(str, yVar, view);
        kotlin.jvm.internal.o.g(adViewComponentData, "adViewComponentData");
        this.f460087o = view;
        this.f460089p = adViewComponentData;
        this.f460091q = jz5.h.b(new y84.q1(this));
        this.f460093r = jz5.h.b(new y84.r1(this));
        this.f460095s = jz5.h.b(new y84.b1(this));
        this.f460097t = jz5.h.b(new y84.p1(this));
        this.A = jz5.h.b(new y84.j1(this));
        this.B = jz5.h.b(new y84.s1(this));
        this.C = jz5.h.b(new y84.t1(this));
        this.D = jz5.h.b(new y84.u1(this));
        this.E = jz5.h.b(new y84.g1(this));
        this.F = jz5.h.b(new y84.t0(this));
        this.G = jz5.h.b(new y84.k1(this));
        this.H = jz5.h.b(new y84.l1(this));
        this.I = jz5.h.b(new y84.e1(this));
        this.f460072J = jz5.h.b(new y84.m1(this));
        this.K = jz5.h.b(new y84.i1(this));
        this.L = jz5.h.b(new y84.f1(this));
        this.M = jz5.h.b(new y84.u0(this));
        this.N = jz5.h.b(new y84.v1(this));
        this.O = jz5.h.b(new y84.w1(this));
        this.P = jz5.h.b(new y84.c1(this));
        this.Q = jz5.h.b(new y84.d1(this));
        this.R = jz5.h.b(new y84.n1(this));
        this.S = jz5.h.b(new y84.a1(this));
        this.T = jz5.h.b(new y84.v0(this));
        this.U = jz5.h.b(new y84.s0(this));
        this.V = jz5.h.b(new y84.w0(this));
        this.W = jz5.h.b(new y84.y0(this));
        this.Y = jz5.h.b(new y84.d0(this));
        this.Z = jz5.h.b(new y84.q(this));
        this.f460073a0 = jz5.h.b(new y84.k(this));
        this.f460074b0 = jz5.h.b(new y84.z(this));
        this.f460075c0 = jz5.h.b(new y84.w(this));
        this.f460076d0 = jz5.h.b(new y84.x(this));
        this.f460077e0 = jz5.h.b(new y84.a0(this));
        this.f460078f0 = jz5.h.b(new y84.u(this));
        this.f460079g0 = jz5.h.b(new y84.v(this));
        this.f460080h0 = jz5.h.b(new y84.b0(this));
        this.f460081i0 = jz5.h.b(new y84.c0(this));
        this.f460082j0 = jz5.h.b(new y84.t(this));
        this.f460083k0 = jz5.h.b(new y84.m(this));
        this.f460084l0 = jz5.h.b(new y84.o(this));
        this.f460085m0 = jz5.h.b(new y84.l(this));
        this.f460086n0 = jz5.h.b(new y84.n(this));
        this.f460088o0 = jz5.h.b(new y84.d(this));
        this.f460090p0 = jz5.h.b(new y84.h(this));
        this.f460092q0 = jz5.h.b(new y84.g(this));
        this.f460094r0 = jz5.h.b(new y84.e(this));
        this.f460096s0 = jz5.h.b(new y84.f(this));
        this.f460098t0 = jz5.h.b(new y84.r(this));
        this.f460100u0 = jz5.h.b(new y84.s(this));
        this.f460102v0 = jz5.h.b(new y84.e0(this));
        this.f460104w0 = jz5.h.b(new y84.f0(this));
        this.f460106x0 = jz5.h.b(new y84.i(this));
        this.f460108y0 = jz5.h.b(new y84.j(this));
        this.f460110z0 = jz5.h.b(new y84.y(this));
        this.A0 = jz5.h.b(new y84.p(this));
        this.B0 = jz5.h.b(new y84.h1(this));
        this.C0 = new y84.z0(this);
        this.D0 = new y84.x0(this);
        this.E0 = new java.util.ArrayList();
        this.F0 = new java.util.ArrayList();
        this.G0 = new java.util.ArrayList();
        this.H0 = new java.util.ArrayList();
        this.I0 = new java.util.ArrayList();
        this.M0 = new java.util.ArrayList();
        this.P0 = new java.util.ArrayList();
        this.R0 = kotlinx.coroutines.flow.i3.a(java.lang.Boolean.FALSE);
        this.S0 = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
        this.T0 = new y84.o1(this);
    }

    public static final java.util.List A(y84.h3 h3Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$doInitGiftAnim", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        h3Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doInitGiftAnim", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = (java.util.ArrayList) h3Var.H0;
        int size = arrayList2.size();
        char c17 = 0;
        int i17 = 0;
        while (i17 < size) {
            android.widget.ImageView imageView = (android.widget.ImageView) arrayList2.get(i17);
            float[] fArr = new float[2];
            fArr[c17] = 0.0f;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMDestGiftTranslationX", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
            int intValue = ((java.lang.Number) ((jz5.n) h3Var.f460082j0).getValue()).intValue();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMDestGiftTranslationX", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
            float f17 = intValue;
            java.util.ArrayList arrayList3 = (java.util.ArrayList) h3Var.E0;
            fArr[1] = f17 - ((((y84.c) arrayList3.get(i17)).c() * 0.5f) + ((y84.c) arrayList3.get(i17)).a());
            android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(imageView, "translationX", fArr);
            ofFloat.setStartDelay(1500L);
            ofFloat.setDuration(617L);
            ofFloat.setInterpolator(new android.view.animation.PathInterpolator(0.52f, 0.0f, 0.59f, 1.0f));
            long intValue2 = ((java.lang.Number) ((java.util.ArrayList) h3Var.I0).get(i17)).intValue() * 117;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMGiftTranslationY1", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
            float floatValue = ((java.lang.Number) ((jz5.n) h3Var.f460098t0).getValue()).floatValue();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMGiftTranslationY1", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
            android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(imageView, "translationY", 0.0f, floatValue);
            ofFloat2.setStartDelay(intValue2);
            ofFloat2.setDuration(1117L);
            java.util.ArrayList arrayList4 = arrayList2;
            int i18 = size;
            ofFloat2.setInterpolator(new android.view.animation.PathInterpolator(0.42f, 0.0f, 0.2f, 1.0f));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMGiftTranslationY1", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
            float floatValue2 = ((java.lang.Number) ((jz5.n) h3Var.f460098t0).getValue()).floatValue();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMGiftTranslationY1", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMGiftTranslationY2", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
            float floatValue3 = ((java.lang.Number) ((jz5.n) h3Var.f460100u0).getValue()).floatValue();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMGiftTranslationY2", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
            android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(imageView, "translationY", floatValue2, floatValue3);
            ofFloat3.setStartDelay(nd1.i2.CTRL_INDEX - intValue2);
            ofFloat3.setDuration(417L);
            ofFloat3.setInterpolator(new android.view.animation.PathInterpolator(0.56f, 0.0f, 1.0f, 1.0f));
            android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
            animatorSet.playSequentially(ofFloat2, ofFloat3);
            android.animation.ObjectAnimator ofFloat4 = android.animation.ObjectAnimator.ofFloat(imageView, "scaleX", 1.0f, 0.79f);
            ofFloat4.setStartDelay(1500L);
            ofFloat4.setDuration(383L);
            ofFloat4.setInterpolator(new android.view.animation.PathInterpolator(0.34f, 0.0f, 0.59f, 0.24f));
            android.animation.ObjectAnimator ofFloat5 = android.animation.ObjectAnimator.ofFloat(imageView, "scaleY", 1.0f, 0.79f);
            ofFloat5.setStartDelay(1500L);
            ofFloat5.setDuration(383L);
            ofFloat5.setInterpolator(new android.view.animation.PathInterpolator(0.34f, 0.0f, 0.59f, 0.24f));
            android.animation.ObjectAnimator ofFloat6 = android.animation.ObjectAnimator.ofFloat(imageView, "alpha", 1.0f, 0.0f);
            ofFloat6.setStartDelay(1900L);
            ofFloat6.setDuration(33L);
            ofFloat6.setInterpolator(new android.view.animation.PathInterpolator(0.42f, 0.0f, 0.58f, 1.0f));
            arrayList.add(ofFloat);
            arrayList.add(animatorSet);
            arrayList.add(ofFloat4);
            arrayList.add(ofFloat5);
            arrayList.add(ofFloat6);
            i17++;
            arrayList2 = arrayList4;
            size = i18;
            c17 = 0;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doInitGiftAnim", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$doInitGiftAnim", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        return arrayList;
    }

    public static final java.util.List B(y84.h3 h3Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$doStarAnim", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        h3Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doStarAnim", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPlatformAlphaAnim", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(h3Var.m0(), "alpha", 0.7f, 1.0f);
        ofFloat.setDuration(1467L);
        ofFloat.setInterpolator(new android.view.animation.PathInterpolator(0.45f, 0.0f, 0.65f, 1.0f));
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(h3Var.m0(), "alpha", 1.0f, 0.0f);
        ofFloat2.setDuration(599L);
        ofFloat2.setInterpolator(new android.view.animation.PathInterpolator(0.42f, 0.0f, 0.58f, 1.0f));
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.playSequentially(ofFloat, ofFloat2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPlatformAlphaAnim", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        arrayList.add(animatorSet);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getStarDropAnim", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        android.widget.ImageView s07 = h3Var.s0();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMStarDropImgTranslationY", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        float floatValue = ((java.lang.Number) h3Var.f460110z0.getValue()).floatValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMStarDropImgTranslationY", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(s07, "translationY", 0.0f, floatValue);
        ofFloat3.setDuration(1333L);
        ofFloat3.setInterpolator(new android.view.animation.PathInterpolator(0.42f, 0.0f, 0.58f, 1.0f));
        android.animation.ObjectAnimator ofFloat4 = android.animation.ObjectAnimator.ofFloat(h3Var.s0(), "alpha", 1.0f, 0.0f);
        ofFloat4.setDuration(2000L);
        ofFloat4.setInterpolator(new android.view.animation.PathInterpolator(0.64f, 0.0f, 0.42f, 1.0f));
        android.animation.AnimatorSet animatorSet2 = new android.animation.AnimatorSet();
        animatorSet2.playTogether(ofFloat3, ofFloat4);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getStarDropAnim", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        arrayList.add(animatorSet2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getStarTopAnim", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        android.widget.ImageView u07 = h3Var.u0();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMTopStarTranslationX", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        float floatValue2 = ((java.lang.Number) h3Var.f460102v0.getValue()).floatValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMTopStarTranslationX", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        android.animation.ObjectAnimator ofFloat5 = android.animation.ObjectAnimator.ofFloat(u07, "translationX", 0.0f, floatValue2);
        ofFloat5.setStartDelay(1733L);
        ofFloat5.setDuration(1267L);
        ofFloat5.setInterpolator(new android.view.animation.PathInterpolator(0.25f, 0.52f, 0.61f, 0.82f));
        android.widget.ImageView u08 = h3Var.u0();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMTopStarTranslationY", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        float floatValue3 = ((java.lang.Number) h3Var.f460104w0.getValue()).floatValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMTopStarTranslationY", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        android.animation.ObjectAnimator ofFloat6 = android.animation.ObjectAnimator.ofFloat(u08, "translationY", 0.0f, floatValue3);
        ofFloat6.setStartDelay(1733L);
        ofFloat6.setDuration(1267L);
        ofFloat6.setInterpolator(new android.view.animation.PathInterpolator(0.25f, 0.52f, 0.61f, 0.82f));
        android.animation.ObjectAnimator ofFloat7 = android.animation.ObjectAnimator.ofFloat(h3Var.u0(), "scaleX", 0.0f, 1.0f);
        ofFloat7.setStartDelay(1817L);
        ofFloat7.setDuration(500L);
        ofFloat7.setInterpolator(new android.view.animation.PathInterpolator(0.2f, 0.54f, 0.6f, 1.0f));
        android.animation.ObjectAnimator ofFloat8 = android.animation.ObjectAnimator.ofFloat(h3Var.u0(), "scaleY", 0.0f, 1.0f);
        ofFloat8.setStartDelay(1817L);
        ofFloat8.setDuration(500L);
        ofFloat8.setInterpolator(new android.view.animation.PathInterpolator(0.2f, 0.54f, 0.6f, 1.0f));
        android.animation.ObjectAnimator ofFloat9 = android.animation.ObjectAnimator.ofFloat(h3Var.u0(), "scaleX", 1.0f, 0.0f);
        ofFloat9.setDuration(683L);
        ofFloat9.setInterpolator(new android.view.animation.PathInterpolator(0.57f, 0.0f, 0.83f, 1.0f));
        android.animation.ObjectAnimator ofFloat10 = android.animation.ObjectAnimator.ofFloat(h3Var.u0(), "scaleY", 1.0f, 0.0f);
        ofFloat10.setDuration(683L);
        ofFloat10.setInterpolator(new android.view.animation.PathInterpolator(0.57f, 0.0f, 0.83f, 1.0f));
        android.animation.ObjectAnimator ofFloat11 = android.animation.ObjectAnimator.ofFloat(h3Var.u0(), "rotation", 0.0f, -208.0f);
        ofFloat11.setStartDelay(1733L);
        ofFloat11.setDuration(1267L);
        ofFloat11.setInterpolator(new android.view.animation.PathInterpolator(0.34f, 0.62f, 0.65f, 0.88f));
        android.animation.ObjectAnimator ofFloat12 = android.animation.ObjectAnimator.ofFloat(h3Var.u0(), "alpha", 1.0f, 0.0f);
        ofFloat12.setStartDelay(2000L);
        ofFloat12.setDuration(1000L);
        ofFloat12.setInterpolator(new android.view.animation.PathInterpolator(0.42f, 0.0f, 0.58f, 1.0f));
        android.animation.AnimatorSet animatorSet3 = new android.animation.AnimatorSet();
        animatorSet3.playTogether(ofFloat7, ofFloat8);
        android.animation.AnimatorSet animatorSet4 = new android.animation.AnimatorSet();
        animatorSet4.playTogether(ofFloat9, ofFloat10);
        android.animation.AnimatorSet animatorSet5 = new android.animation.AnimatorSet();
        animatorSet5.playSequentially(animatorSet3, animatorSet4);
        android.animation.AnimatorSet animatorSet6 = new android.animation.AnimatorSet();
        animatorSet6.playTogether(ofFloat5, ofFloat6, animatorSet5, ofFloat11, ofFloat12);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getStarTopAnim", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        arrayList.add(animatorSet6);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getStarBottomAnim", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        android.widget.ImageView t07 = h3Var.t0();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMBottomStarTranslationX", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        float floatValue4 = ((java.lang.Number) h3Var.f460106x0.getValue()).floatValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMBottomStarTranslationX", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        android.animation.ObjectAnimator ofFloat13 = android.animation.ObjectAnimator.ofFloat(t07, "translationX", 0.0f, floatValue4);
        ofFloat13.setStartDelay(1733L);
        ofFloat13.setDuration(1267L);
        ofFloat13.setInterpolator(new android.view.animation.PathInterpolator(0.35f, 0.44f, 0.69f, 0.77f));
        android.widget.ImageView t08 = h3Var.t0();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMBottomStarTranslationY", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        float floatValue5 = ((java.lang.Number) h3Var.f460108y0.getValue()).floatValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMBottomStarTranslationY", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        android.animation.ObjectAnimator ofFloat14 = android.animation.ObjectAnimator.ofFloat(t08, "translationY", 0.0f, floatValue5);
        ofFloat14.setStartDelay(1733L);
        ofFloat14.setDuration(1267L);
        ofFloat14.setInterpolator(new android.view.animation.PathInterpolator(0.35f, 0.44f, 0.69f, 0.77f));
        android.animation.ObjectAnimator ofFloat15 = android.animation.ObjectAnimator.ofFloat(h3Var.t0(), "scaleX", 0.0f, 1.0f);
        ofFloat15.setStartDelay(1817L);
        ofFloat15.setDuration(500L);
        ofFloat15.setInterpolator(new android.view.animation.PathInterpolator(0.2f, 0.54f, 0.6f, 1.0f));
        android.animation.ObjectAnimator ofFloat16 = android.animation.ObjectAnimator.ofFloat(h3Var.t0(), "scaleY", 0.0f, 1.0f);
        ofFloat16.setStartDelay(1817L);
        ofFloat16.setDuration(500L);
        ofFloat16.setInterpolator(new android.view.animation.PathInterpolator(0.2f, 0.54f, 0.6f, 1.0f));
        android.animation.ObjectAnimator ofFloat17 = android.animation.ObjectAnimator.ofFloat(h3Var.t0(), "scaleX", 1.0f, 0.0f);
        ofFloat17.setDuration(683L);
        ofFloat17.setInterpolator(new android.view.animation.PathInterpolator(0.57f, 0.0f, 0.83f, 1.0f));
        android.animation.ObjectAnimator ofFloat18 = android.animation.ObjectAnimator.ofFloat(h3Var.t0(), "scaleY", 1.0f, 0.0f);
        ofFloat18.setDuration(683L);
        ofFloat18.setInterpolator(new android.view.animation.PathInterpolator(0.57f, 0.0f, 0.83f, 1.0f));
        android.animation.ObjectAnimator ofFloat19 = android.animation.ObjectAnimator.ofFloat(h3Var.t0(), "rotation", 0.0f, -208.0f);
        ofFloat19.setStartDelay(1733L);
        ofFloat19.setDuration(1267L);
        ofFloat19.setInterpolator(new android.view.animation.PathInterpolator(0.34f, 0.62f, 0.65f, 0.88f));
        android.animation.ObjectAnimator ofFloat20 = android.animation.ObjectAnimator.ofFloat(h3Var.t0(), "alpha", 1.0f, 0.0f);
        ofFloat20.setStartDelay(2000L);
        ofFloat20.setDuration(1000L);
        ofFloat20.setInterpolator(new android.view.animation.PathInterpolator(0.42f, 0.0f, 0.58f, 1.0f));
        android.animation.AnimatorSet animatorSet7 = new android.animation.AnimatorSet();
        animatorSet7.playTogether(ofFloat15, ofFloat16);
        android.animation.AnimatorSet animatorSet8 = new android.animation.AnimatorSet();
        animatorSet8.playTogether(ofFloat17, ofFloat18);
        android.animation.AnimatorSet animatorSet9 = new android.animation.AnimatorSet();
        animatorSet9.playSequentially(animatorSet7, animatorSet8);
        android.animation.AnimatorSet animatorSet10 = new android.animation.AnimatorSet();
        animatorSet10.playTogether(ofFloat13, ofFloat14, animatorSet9, ofFloat19, ofFloat20);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getStarBottomAnim", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        arrayList.add(animatorSet10);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doStarAnim", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$doStarAnim", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        return arrayList;
    }

    public static final /* synthetic */ i64.b0 C(y84.h3 h3Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getAdViewComponentData$p", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        i64.b0 b0Var = h3Var.f460089p;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getAdViewComponentData$p", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        return b0Var;
    }

    public static final /* synthetic */ android.widget.ImageView D(y84.h3 h3Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMDonePAGThumb", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        android.widget.ImageView e07 = h3Var.e0();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMDonePAGThumb", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        return e07;
    }

    public static final /* synthetic */ y84.l3 E(y84.h3 h3Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMRandomSelectCardAdInfo$p", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        y84.l3 l3Var = h3Var.f460103w;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMRandomSelectCardAdInfo$p", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        return l3Var;
    }

    public static final /* synthetic */ android.widget.LinearLayout F(y84.h3 h3Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMSnsAdRandomSelectCardContainer$p", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        android.widget.LinearLayout linearLayout = h3Var.f460099u;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMSnsAdRandomSelectCardContainer$p", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        return linearLayout;
    }

    public static final android.animation.AnimatorSet G(y84.h3 h3Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getPlatformAlphaAnimForSelectPartCards", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        h3Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPlatformAlphaAnimForSelectPartCards", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(h3Var.m0(), "alpha", 1.0f, 0.0f);
        ofFloat.setStartDelay(2500L);
        ofFloat.setDuration(500L);
        ofFloat.setInterpolator(new android.view.animation.PathInterpolator(0.42f, 0.0f, 0.58f, 1.0f));
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.play(ofFloat);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPlatformAlphaAnimForSelectPartCards", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getPlatformAlphaAnimForSelectPartCards", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        return animatorSet;
    }

    public static final android.animation.AnimatorSet H(y84.h3 h3Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getSelectCardAnim", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        h3Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSelectCardAnim", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(h3Var.j0(), "alpha", 0.3f, 1.0f);
        ofFloat.setStartDelay(500L);
        ofFloat.setDuration(333L);
        ofFloat.setInterpolator(new android.view.animation.PathInterpolator(0.48f, 0.04f, 0.52f, 0.96f));
        ofFloat.addListener(new y84.i0(h3Var));
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(h3Var.j0(), "alpha", 1.0f, 0.0f);
        android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(h3Var.l0(), "alpha", 0.3f, 0.0f);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.setStartDelay(2500L);
        animatorSet.setDuration(500L);
        animatorSet.setInterpolator(new android.view.animation.PathInterpolator(0.42f, 0.0f, 0.58f, 1.0f));
        animatorSet.playTogether(ofFloat2, ofFloat3);
        android.animation.ObjectAnimator ofFloat4 = android.animation.ObjectAnimator.ofFloat(h3Var.n0(), "alpha", 0.0f, 1.0f);
        ofFloat4.setDuration(500L);
        ofFloat4.setInterpolator(new android.view.animation.PathInterpolator(0.42f, 0.0f, 0.58f, 1.0f));
        ofFloat4.addListener(new y84.j0(h3Var));
        android.animation.AnimatorSet animatorSet2 = new android.animation.AnimatorSet();
        animatorSet2.playTogether(ofFloat, animatorSet);
        android.animation.AnimatorSet animatorSet3 = new android.animation.AnimatorSet();
        animatorSet3.playSequentially(animatorSet2, ofFloat4);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSelectCardAnim", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getSelectCardAnim", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        return animatorSet3;
    }

    public static final android.animation.AnimatorSet I(y84.h3 h3Var, int i17) {
        android.animation.AnimatorSet V;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getTextAnim", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        h3Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTextAnim", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        if (i17 == 0) {
            V = h3Var.V(h3Var.x0(), h3Var.h0(), i17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTextAnim", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        } else if (i17 != 1) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTextAnim", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
            V = null;
        } else {
            V = h3Var.V(h3Var.q0(), h3Var.h0(), i17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTextAnim", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getTextAnim", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        return V;
    }

    public static final boolean J(y84.h3 h3Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$isActivityFinish", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        h3Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isActivityFinish", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        android.content.Context context = h3Var.f460107y;
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        boolean z17 = true;
        if (activity == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isActivityFinish", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        } else if (activity.isFinishing() || activity.isDestroyed()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isActivityFinish", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isActivityFinish", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
            z17 = false;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$isActivityFinish", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        return z17;
    }

    public static final /* synthetic */ float K(y84.h3 h3Var, float f17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$relativeDp", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        float H0 = h3Var.H0(f17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$relativeDp", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        return H0;
    }

    public static final /* synthetic */ int L(y84.h3 h3Var, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$relativeDp", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        int I0 = h3Var.I0(i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$relativeDp", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        return I0;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:33:0x0016, B:6:0x0020, B:11:0x002c, B:15:0x0030, B:17:0x003c, B:20:0x0045, B:21:0x0062, B:24:0x0049, B:26:0x0054, B:27:0x0058, B:28:0x005f), top: B:32:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0030 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:33:0x0016, B:6:0x0020, B:11:0x002c, B:15:0x0030, B:17:0x003c, B:20:0x0045, B:21:0x0062, B:24:0x0049, B:26:0x0054, B:27:0x0058, B:28:0x005f), top: B:32:0x0016 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void M(y84.h3 r10, com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo r11) {
        /*
            java.lang.String r0 = "access$resetCanvasDynamicExtInfo"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            r10.getClass()
            java.lang.String r2 = "resetCanvasDynamicExtInfo"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r1)
            java.lang.String r10 = r10.j()
            if (r11 == 0) goto L1b
            java.lang.String r3 = r11.f162608t0     // Catch: java.lang.Throwable -> L19
            goto L1c
        L19:
            r11 = move-exception
            goto L65
        L1b:
            r3 = 0
        L1c:
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L29
            int r6 = r3.length()     // Catch: java.lang.Throwable -> L19
            if (r6 != 0) goto L27
            goto L29
        L27:
            r6 = r4
            goto L2a
        L29:
            r6 = r5
        L2a:
            if (r6 == 0) goto L30
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r1)     // Catch: java.lang.Throwable -> L19
            goto L6b
        L30:
            java.lang.String r6 = "card_id"
            java.lang.String r7 = "removeCardId"
            java.lang.String r8 = "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghCanvasDynamicExtInfoUtil"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r8)     // Catch: java.lang.Throwable -> L19
            if (r3 == 0) goto L42
            int r9 = r3.length()     // Catch: java.lang.Throwable -> L19
            if (r9 != 0) goto L43
        L42:
            r4 = r5
        L43:
            if (r4 == 0) goto L49
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r8)     // Catch: java.lang.Throwable -> L19
            goto L62
        L49:
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L19 org.json.JSONException -> L5f
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L19 org.json.JSONException -> L5f
            boolean r5 = r4.has(r6)     // Catch: java.lang.Throwable -> L19 org.json.JSONException -> L5f
            if (r5 != 0) goto L58
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r8)     // Catch: java.lang.Throwable -> L19 org.json.JSONException -> L5f
            goto L62
        L58:
            r4.remove(r6)     // Catch: java.lang.Throwable -> L19 org.json.JSONException -> L5f
            java.lang.String r3 = r4.toString()     // Catch: java.lang.Throwable -> L19 org.json.JSONException -> L5f
        L5f:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r8)     // Catch: java.lang.Throwable -> L19
        L62:
            r11.f162608t0 = r3     // Catch: java.lang.Throwable -> L19
            goto L68
        L65:
            ca4.q.c(r10, r11)
        L68:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r1)
        L6b:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y84.h3.M(y84.h3, com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003c A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:47:0x0016, B:6:0x0021, B:12:0x002f, B:18:0x003c, B:20:0x0046, B:26:0x0054, B:30:0x005e, B:32:0x006e, B:33:0x0075, B:41:0x0072, B:44:0x0078), top: B:46:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void N(y84.h3 r9, com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo r10, java.lang.String r11) {
        /*
            java.lang.String r0 = "access$setCardIdToCanvasDynamicExtInfo"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            r9.getClass()
            java.lang.String r2 = "setCardIdToCanvasDynamicExtInfo"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r1)
            java.lang.String r9 = r9.j()
            if (r10 == 0) goto L1c
            java.lang.String r3 = r10.f162608t0     // Catch: java.lang.Throwable -> L19
            goto L1d
        L19:
            r10 = move-exception
            goto L7c
        L1c:
            r3 = 0
        L1d:
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L2a
            int r6 = r3.length()     // Catch: java.lang.Throwable -> L19
            if (r6 != 0) goto L28
            goto L2a
        L28:
            r6 = r4
            goto L2b
        L2a:
            r6 = r5
        L2b:
            if (r6 != 0) goto L78
            if (r11 == 0) goto L38
            int r6 = r11.length()     // Catch: java.lang.Throwable -> L19
            if (r6 != 0) goto L36
            goto L38
        L36:
            r6 = r4
            goto L39
        L38:
            r6 = r5
        L39:
            if (r6 == 0) goto L3c
            goto L78
        L3c:
            java.lang.String r6 = "setCardId"
            java.lang.String r7 = "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghCanvasDynamicExtInfoUtil"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r7)     // Catch: java.lang.Throwable -> L19
            if (r3 == 0) goto L4f
            int r8 = r3.length()     // Catch: java.lang.Throwable -> L19
            if (r8 != 0) goto L4d
            goto L4f
        L4d:
            r8 = r4
            goto L50
        L4f:
            r8 = r5
        L50:
            if (r8 != 0) goto L72
            if (r11 == 0) goto L5a
            int r8 = r11.length()     // Catch: java.lang.Throwable -> L19
            if (r8 != 0) goto L5b
        L5a:
            r4 = r5
        L5b:
            if (r4 == 0) goto L5e
            goto L72
        L5e:
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L19 org.json.JSONException -> L6e
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L19 org.json.JSONException -> L6e
            java.lang.String r5 = "card_id"
            org.json.JSONObject r11 = r4.put(r5, r11)     // Catch: java.lang.Throwable -> L19 org.json.JSONException -> L6e
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> L19 org.json.JSONException -> L6e
            r3 = r11
        L6e:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r7)     // Catch: java.lang.Throwable -> L19
            goto L75
        L72:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r7)     // Catch: java.lang.Throwable -> L19
        L75:
            r10.f162608t0 = r3     // Catch: java.lang.Throwable -> L19
            goto L7f
        L78:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r1)     // Catch: java.lang.Throwable -> L19
            goto L82
        L7c:
            ca4.q.c(r9, r10)
        L7f:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r1)
        L82:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y84.h3.N(y84.h3, com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo, java.lang.String):void");
    }

    public static /* synthetic */ void N0(y84.h3 h3Var, int i17, int i18, java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetDataAndView$default", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        if (obj != null) {
            java.lang.UnsupportedOperationException unsupportedOperationException = new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resetDataAndView");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetDataAndView$default", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
            throw unsupportedOperationException;
        }
        if ((i18 & 1) != 0) {
            i17 = 0;
        }
        h3Var.M0(i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetDataAndView$default", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
    }

    public static final void O(y84.h3 h3Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$startAutoScroll", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        h3Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startAutoScroll", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        java.lang.String j17 = h3Var.j();
        try {
            h3Var.X0();
            h3Var.S0.postDelayed(h3Var.T0, 16L);
        } catch (java.lang.Throwable th6) {
            ca4.q.c(j17, th6);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startAutoScroll", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$startAutoScroll", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
    }

    public static /* synthetic */ void S(y84.h3 h3Var, android.view.View view, int i17, int i18, int i19, int i27, int i28, java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doLayoutMaterialView$default", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        if (obj == null) {
            h3Var.R(view, i17, i18, (i28 & 8) != 0 ? 0 : i19, (i28 & 16) != 0 ? 0 : i27);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doLayoutMaterialView$default", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        } else {
            java.lang.UnsupportedOperationException unsupportedOperationException = new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: doLayoutMaterialView");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doLayoutMaterialView$default", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
            throw unsupportedOperationException;
        }
    }

    public static final void y(y84.h3 h3Var, androidx.recyclerview.widget.RecyclerView recyclerView) {
        androidx.recyclerview.widget.f2 adapter;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$checkAndLoopScroll", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        h3Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkAndLoopScroll", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        java.lang.String j17 = h3Var.j();
        try {
        } catch (java.lang.Throwable th6) {
            ca4.q.c(j17, th6);
        }
        if (recyclerView == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkAndLoopScroll", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$checkAndLoopScroll", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        }
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        kotlin.jvm.internal.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = (androidx.recyclerview.widget.LinearLayoutManager) layoutManager;
        int w17 = linearLayoutManager.w();
        int y17 = linearLayoutManager.y();
        androidx.recyclerview.widget.RecyclerView o07 = h3Var.o0();
        int itemCount = (o07 == null || (adapter = o07.getAdapter()) == null) ? 0 : adapter.getItemCount();
        if (w17 == 0 || y17 == itemCount - 1) {
            com.tencent.mars.xlog.Log.w(h3Var.j(), "checkAndLoopScroll, firstVisiblePos is " + w17 + ", lastVisiblePos is " + y17);
            h3Var.Q0();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkAndLoopScroll", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$checkAndLoopScroll", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
    }

    public static final java.util.List z(y84.h3 h3Var) {
        java.util.ArrayList arrayList;
        java.lang.String str;
        float f17;
        java.lang.String str2;
        android.widget.FrameLayout frameLayout;
        int i17;
        android.animation.AnimatorSet animatorSet;
        float floatValue;
        android.animation.AnimatorSet animatorSet2;
        int i18;
        float f18;
        int i19;
        java.util.ArrayList arrayList2;
        android.animation.AnimatorSet animatorSet3;
        java.lang.String str3;
        int i27;
        android.animation.AnimatorSet animatorSet4;
        android.animation.AnimatorSet animatorSet5;
        int i28;
        android.animation.AnimatorSet animatorSet6;
        java.util.ArrayList arrayList3;
        boolean z17;
        android.animation.ObjectAnimator ofFloat;
        y84.h3 h3Var2 = h3Var;
        java.lang.String str4 = "access$doInitCardAnim";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$doInitCardAnim", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        h3Var.getClass();
        java.lang.String str5 = "doInitCardAnim";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doInitCardAnim", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        android.widget.FrameLayout X = h3Var.X();
        if (X == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doInitCardAnim", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
            str = "access$doInitCardAnim";
            arrayList = arrayList4;
        } else {
            int childCount = X.getChildCount() - 1;
            int i29 = childCount;
            while (-1 < i29) {
                android.view.View childAt = X.getChildAt(i29);
                int i37 = childCount - i29;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCardTranslationXAnim", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
                java.util.List list = h3Var2.M0;
                int i38 = i29;
                if (childAt == null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCardTranslationXAnim", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
                    str2 = str4;
                    frameLayout = X;
                    i17 = childCount;
                    animatorSet = null;
                } else {
                    float a17 = ((y84.c) ((java.util.ArrayList) list).get(i37)).a();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMCardHalfWidth", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
                    float floatValue2 = ((java.lang.Number) ((jz5.n) h3Var2.f460084l0).getValue()).floatValue() * 0.5f;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMCardHalfWidth", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
                    float f19 = a17 + floatValue2;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMAnimCardCenterTranslationX", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
                    float floatValue3 = ((java.lang.Number) ((jz5.n) h3Var2.f460088o0).getValue()).floatValue();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMAnimCardCenterTranslationX", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
                    float f27 = floatValue3 - f19;
                    if (i37 != 0) {
                        if (i37 == 1 || i37 == 2) {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMAnimMiddleCardCenterTranslationX", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
                            floatValue = ((java.lang.Number) ((jz5.n) h3Var2.f460090p0).getValue()).floatValue();
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMAnimMiddleCardCenterTranslationX", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
                        } else {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMAnimLastCardCenterTranslationX", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
                            floatValue = ((java.lang.Number) ((jz5.n) h3Var2.f460092q0).getValue()).floatValue();
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMAnimLastCardCenterTranslationX", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
                        }
                        f17 = floatValue - f19;
                    } else {
                        f17 = f27;
                    }
                    android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(childAt, "translationX", f27, f17);
                    ofFloat2.setStartDelay(1833L);
                    ofFloat2.setDuration(667L);
                    str2 = str4;
                    frameLayout = X;
                    ofFloat2.setInterpolator(new android.view.animation.PathInterpolator(0.43f, 0.0f, 0.29f, 1.0f));
                    android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(childAt, "translationX", f17, 0.0f);
                    i17 = childCount;
                    ofFloat3.setDuration(1183L);
                    ofFloat3.setInterpolator(new android.view.animation.PathInterpolator(0.43f, 0.0f, 0.29f, 1.0f));
                    animatorSet = new android.animation.AnimatorSet();
                    animatorSet.playSequentially(ofFloat2, ofFloat3);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCardTranslationXAnim", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCardTranslationYAnim", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
                if (childAt == null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCardTranslationYAnim", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
                    animatorSet2 = null;
                } else {
                    float b17 = ((y84.c) ((java.util.ArrayList) list).get(i37)).b();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMCardHalfHeight", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
                    float floatValue4 = ((java.lang.Number) ((jz5.n) h3Var2.f460085m0).getValue()).floatValue() * 0.5f;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMCardHalfHeight", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
                    float f28 = b17 + floatValue4;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMAnimCardCenterTranslationY", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
                    float floatValue5 = ((java.lang.Number) ((jz5.n) h3Var2.f460094r0).getValue()).floatValue();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMAnimCardCenterTranslationY", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMAnimCardMiddleTranslationY", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
                    float floatValue6 = ((java.lang.Number) ((jz5.n) h3Var2.f460096s0).getValue()).floatValue();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMAnimCardMiddleTranslationY", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
                    float f29 = floatValue6 - f28;
                    android.animation.ObjectAnimator ofFloat4 = android.animation.ObjectAnimator.ofFloat(childAt, "translationY", floatValue5 - f28, f29);
                    ofFloat4.setStartDelay(1817L);
                    ofFloat4.setDuration(683L);
                    ofFloat4.setInterpolator(new android.view.animation.PathInterpolator(0.18f, 0.0f, 0.2f, 1.0f));
                    android.animation.ObjectAnimator ofFloat5 = android.animation.ObjectAnimator.ofFloat(childAt, "translationY", f29, 0.0f);
                    ofFloat5.setDuration(1183L);
                    ofFloat5.setInterpolator(new android.view.animation.PathInterpolator(0.43f, 0.0f, 0.29f, 1.0f));
                    animatorSet2 = new android.animation.AnimatorSet();
                    animatorSet2.playSequentially(ofFloat4, ofFloat5);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCardTranslationYAnim", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCardScaleAnim", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
                if (childAt == null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCardScaleAnim", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
                    str3 = str5;
                    arrayList2 = arrayList4;
                    animatorSet3 = animatorSet;
                    i19 = i17;
                    animatorSet4 = null;
                    i27 = 2;
                } else {
                    if (i37 != 0) {
                        i18 = 2;
                        f18 = (i37 == 1 || i37 == 2) ? 1.37f : 1.22f;
                    } else {
                        i18 = 2;
                        f18 = 1.5f;
                    }
                    float[] fArr = new float[i18];
                    // fill-array-data instruction
                    fArr[0] = 0.0f;
                    fArr[1] = 0.6f;
                    android.animation.ObjectAnimator ofFloat6 = android.animation.ObjectAnimator.ofFloat(childAt, "scaleX", fArr);
                    ofFloat6.setDuration(1817L);
                    float[] fArr2 = new float[i18];
                    fArr2[0] = 0.6f;
                    fArr2[1] = f18;
                    android.animation.ObjectAnimator ofFloat7 = android.animation.ObjectAnimator.ofFloat(childAt, "scaleX", fArr2);
                    ofFloat7.setDuration(683L);
                    ofFloat7.setInterpolator(new android.view.animation.PathInterpolator(0.2f, 0.0f, 0.19f, 1.0f));
                    android.animation.ObjectAnimator ofFloat8 = android.animation.ObjectAnimator.ofFloat(childAt, "scaleX", f18, 1.0f);
                    ofFloat8.setDuration(1183L);
                    i19 = i17;
                    ofFloat8.setInterpolator(new android.view.animation.PathInterpolator(0.43f, 0.0f, 0.5f, 1.0f));
                    android.animation.ObjectAnimator ofFloat9 = android.animation.ObjectAnimator.ofFloat(childAt, "scaleY", 0.0f, 0.6f);
                    java.lang.String str6 = str5;
                    arrayList2 = arrayList4;
                    ofFloat9.setDuration(1817L);
                    android.animation.ObjectAnimator ofFloat10 = android.animation.ObjectAnimator.ofFloat(childAt, "scaleY", 0.6f, f18);
                    animatorSet3 = animatorSet;
                    ofFloat10.setDuration(683L);
                    str3 = str6;
                    ofFloat10.setInterpolator(new android.view.animation.PathInterpolator(0.2f, 0.0f, 0.19f, 1.0f));
                    i27 = 2;
                    android.animation.ObjectAnimator ofFloat11 = android.animation.ObjectAnimator.ofFloat(childAt, "scaleY", f18, 1.0f);
                    ofFloat11.setDuration(1183L);
                    ofFloat11.setInterpolator(new android.view.animation.PathInterpolator(0.43f, 0.0f, 0.5f, 1.0f));
                    android.animation.AnimatorSet animatorSet7 = new android.animation.AnimatorSet();
                    animatorSet7.playTogether(ofFloat6, ofFloat9);
                    android.animation.AnimatorSet animatorSet8 = new android.animation.AnimatorSet();
                    animatorSet8.playTogether(ofFloat7, ofFloat10);
                    android.animation.AnimatorSet animatorSet9 = new android.animation.AnimatorSet();
                    animatorSet9.playTogether(ofFloat8, ofFloat11);
                    animatorSet4 = new android.animation.AnimatorSet();
                    animatorSet4.playSequentially(animatorSet7, animatorSet8, animatorSet9);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCardScaleAnim", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCardRotationAnim", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
                if (childAt == null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCardRotationAnim", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
                    i28 = i27;
                    animatorSet5 = animatorSet4;
                    animatorSet6 = null;
                } else {
                    float[] fArr3 = new float[i27];
                    // fill-array-data instruction
                    fArr3[0] = 0.0f;
                    fArr3[1] = -5.7f;
                    android.animation.ObjectAnimator ofFloat12 = android.animation.ObjectAnimator.ofFloat(childAt, "rotationX", fArr3);
                    ofFloat12.setStartDelay(1817L);
                    ofFloat12.setDuration(683L);
                    ofFloat12.setInterpolator(new android.view.animation.PathInterpolator(0.2f, 0.0f, 0.19f, 1.0f));
                    float[] fArr4 = new float[i27];
                    // fill-array-data instruction
                    fArr4[0] = 0.0f;
                    fArr4[1] = -9.5f;
                    android.animation.ObjectAnimator ofFloat13 = android.animation.ObjectAnimator.ofFloat(childAt, "rotationY", fArr4);
                    ofFloat13.setStartDelay(1817L);
                    ofFloat13.setDuration(683L);
                    ofFloat13.setInterpolator(new android.view.animation.PathInterpolator(0.2f, 0.0f, 0.19f, 1.0f));
                    float[] fArr5 = new float[i27];
                    // fill-array-data instruction
                    fArr5[0] = 0.0f;
                    fArr5[1] = 7.7f;
                    android.animation.ObjectAnimator ofFloat14 = android.animation.ObjectAnimator.ofFloat(childAt, "rotation", fArr5);
                    animatorSet5 = animatorSet4;
                    ofFloat14.setStartDelay(1817L);
                    ofFloat14.setDuration(683L);
                    ofFloat14.setInterpolator(new android.view.animation.PathInterpolator(0.2f, 0.0f, 0.19f, 1.0f));
                    android.animation.ObjectAnimator ofFloat15 = android.animation.ObjectAnimator.ofFloat(childAt, "rotationX", -5.7f, 0.0f);
                    ofFloat15.setDuration(1183L);
                    ofFloat15.setInterpolator(new android.view.animation.PathInterpolator(0.43f, 0.0f, 0.5f, 1.0f));
                    android.animation.ObjectAnimator ofFloat16 = android.animation.ObjectAnimator.ofFloat(childAt, "rotationY", -9.5f, 0.0f);
                    ofFloat16.setDuration(1183L);
                    ofFloat16.setInterpolator(new android.view.animation.PathInterpolator(0.43f, 0.0f, 0.5f, 1.0f));
                    android.animation.ObjectAnimator ofFloat17 = android.animation.ObjectAnimator.ofFloat(childAt, "rotation", 7.7f, 0.0f);
                    ofFloat17.setDuration(1183L);
                    ofFloat17.setInterpolator(new android.view.animation.PathInterpolator(0.43f, 0.0f, 0.5f, 1.0f));
                    android.animation.AnimatorSet animatorSet10 = new android.animation.AnimatorSet();
                    i28 = 2;
                    animatorSet10.playTogether(ofFloat12, ofFloat13, ofFloat14);
                    android.animation.AnimatorSet animatorSet11 = new android.animation.AnimatorSet();
                    animatorSet11.playTogether(ofFloat15, ofFloat16, ofFloat17);
                    animatorSet6 = new android.animation.AnimatorSet();
                    animatorSet6.playSequentially(animatorSet10, animatorSet11);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCardRotationAnim", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
                }
                float[] fArr6 = new float[i28];
                // fill-array-data instruction
                fArr6[0] = 0.0f;
                fArr6[1] = 1.0f;
                android.animation.ObjectAnimator ofFloat18 = android.animation.ObjectAnimator.ofFloat(childAt, "alpha", fArr6);
                ofFloat18.setStartDelay(1817L);
                ofFloat18.setDuration(183L);
                ofFloat18.setInterpolator(new android.view.animation.PathInterpolator(0.2f, 0.0f, 0.19f, 1.0f));
                if (animatorSet3 != null) {
                    arrayList3 = arrayList2;
                    arrayList3.add(animatorSet3);
                } else {
                    arrayList3 = arrayList2;
                }
                if (animatorSet2 != null) {
                    arrayList3.add(animatorSet2);
                }
                if (animatorSet5 != null) {
                    arrayList3.add(animatorSet5);
                }
                if (animatorSet6 != null) {
                    arrayList3.add(animatorSet6);
                }
                arrayList3.add(ofFloat18);
                int i39 = i19;
                if (i38 < i39) {
                    android.view.ViewGroup viewGroup = childAt instanceof android.view.ViewGroup ? (android.view.ViewGroup) childAt : null;
                    z17 = true;
                    android.view.View childAt2 = viewGroup != null ? viewGroup.getChildAt(1) : null;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBrightAlphaAnim", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
                    if (childAt2 == null) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBrightAlphaAnim", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
                        ofFloat = null;
                    } else {
                        ofFloat = android.animation.ObjectAnimator.ofFloat(childAt2, "alpha", (i38 == 0 || i38 == 1) ? 0.28f : 0.2f, 0.0f);
                        ofFloat.setStartDelay(2500L);
                        ofFloat.setDuration(1183L);
                        ofFloat.setInterpolator(new android.view.animation.PathInterpolator(0.43f, 0.0f, 0.5f, 1.0f));
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBrightAlphaAnim", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
                    }
                    if (ofFloat != null) {
                        arrayList3.add(ofFloat);
                    }
                } else {
                    z17 = true;
                }
                i29 = i38 - 1;
                arrayList4 = arrayList3;
                X = frameLayout;
                str4 = str2;
                str5 = str3;
                childCount = i39;
                h3Var2 = h3Var;
            }
            arrayList = arrayList4;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str5, "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
            str = str4;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        return arrayList;
    }

    public final int A0() {
        y84.o3 o3Var;
        java.util.List list;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSelectCardStatus", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        java.util.List z07 = z0();
        y84.l3 l3Var = this.f460103w;
        int size = (l3Var == null || (o3Var = l3Var.f460146m) == null || (list = o3Var.f460185n) == null) ? 0 : ((java.util.ArrayList) list).size();
        if (z07.isEmpty()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSelectCardStatus", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
            return 0;
        }
        if (((java.util.ArrayList) z07).size() == size) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSelectCardStatus", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
            return 2;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSelectCardStatus", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        return 1;
    }

    public final void B0(y84.o3 o3Var, java.util.List list, int i17, int i18) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4 = "initGiftItemList";
        java.lang.String str5 = "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initGiftItemList", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        java.lang.String j17 = j();
        try {
            int I0 = I0(o3Var.f460182k);
            int I02 = I0(o3Var.f460183l);
            android.widget.FrameLayout l07 = l0();
            if (l07 != null) {
                l07.removeAllViews();
            }
            android.widget.FrameLayout j07 = j0();
            if (j07 != null) {
                j07.removeAllViews();
            }
            android.widget.FrameLayout c07 = c0();
            if (c07 != null) {
                c07.removeAllViews();
            }
            java.util.List list2 = this.E0;
            ((java.util.ArrayList) list2).clear();
            java.util.List list3 = this.F0;
            ((java.util.ArrayList) list3).clear();
            java.util.List list4 = this.G0;
            ((java.util.ArrayList) list4).clear();
            java.util.List list5 = this.H0;
            ((java.util.ArrayList) list5).clear();
            java.util.List list6 = this.I0;
            ((java.util.ArrayList) list6).clear();
            java.util.Iterator it = list.iterator();
            int i19 = 0;
            while (it.hasNext()) {
                i19 += I0(((y84.n3) it.next()).f460161c);
            }
            int i27 = (int) ((this.f460105x - (i19 - ((i17 - 1) * I0))) * 0.5f);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it6 = list.iterator();
            int i28 = 0;
            int i29 = 0;
            while (it6.hasNext()) {
                int i37 = i28 + 1;
                y84.n3 n3Var = (y84.n3) it6.next();
                java.util.Iterator it7 = it6;
                int I03 = I0(n3Var.f460161c);
                int I04 = I0(n3Var.f460162d);
                str = str4;
                int i38 = i27 + i29;
                int i39 = i18 - I04;
                try {
                    if (i28 % 2 == 0) {
                        i39 -= I02;
                    }
                    int i47 = I02;
                    arrayList.add(new y84.c(I03, I04, i38, i39));
                    i29 += I03 - I0;
                    it6 = it7;
                    I02 = i47;
                    i28 = i37;
                    str4 = str;
                    i27 = i27;
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    str3 = str5;
                    ca4.q.c(j17, th);
                    str2 = str3;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, str2);
                }
            }
            str = str4;
            int i48 = 1;
            int i49 = 0;
            int i57 = 0;
            while (i57 < i17) {
                android.widget.ImageView imageView = new android.widget.ImageView(this.f460107y);
                imageView.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
                android.widget.ImageView imageView2 = new android.widget.ImageView(this.f460107y);
                imageView2.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
                str3 = str5;
                try {
                    android.view.View view = new android.view.View(this.f460107y);
                    android.widget.FrameLayout c08 = c0();
                    if (c08 != null) {
                        c08.addView(view);
                    }
                    android.widget.FrameLayout l08 = l0();
                    if (l08 != null) {
                        l08.addView(imageView);
                    }
                    android.widget.FrameLayout j08 = j0();
                    if (j08 != null) {
                        j08.addView(imageView2);
                    }
                    ((java.util.ArrayList) list3).add(view);
                    ((java.util.ArrayList) list4).add(imageView);
                    ((java.util.ArrayList) list5).add(imageView2);
                    if (i49 < i17) {
                        ((java.util.ArrayList) list2).add((y84.c) arrayList.get(i49));
                        ((java.util.ArrayList) list6).add(java.lang.Integer.valueOf(i49));
                        i49 += 2;
                    } else if (i48 < i17) {
                        ((java.util.ArrayList) list2).add((y84.c) arrayList.get(i48));
                        ((java.util.ArrayList) list6).add(java.lang.Integer.valueOf(i48));
                        i48 += 2;
                    }
                    i57++;
                    str5 = str3;
                } catch (java.lang.Throwable th7) {
                    th = th7;
                    ca4.q.c(j17, th);
                    str2 = str3;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, str2);
                }
            }
            str2 = str5;
        } catch (java.lang.Throwable th8) {
            th = th8;
            str = str4;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, str2);
    }

    public final void C0(android.content.Context context, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, y84.l3 l3Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initRecycleView", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        if (context == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initRecycleView", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
            return;
        }
        if (l3Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initRecycleView", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
            return;
        }
        if (!this.N0) {
            this.N0 = true;
            androidx.recyclerview.widget.RecyclerView o07 = o0();
            if (o07 != null) {
                o07.setOverScrollMode(2);
                o07.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(context, 0, false));
                o07.N(new y84.q0(this));
                o07.i(new y84.r0(this));
                o07.setHasFixedSize(true);
                o07.setItemViewCacheSize(5);
            }
        }
        y84.b bVar = new y84.b(context, snsInfo, l3Var, o0(), b0(), Y());
        bVar.setHasStableIds(true);
        androidx.recyclerview.widget.RecyclerView o08 = o0();
        if (o08 != null) {
            o08.setAdapter(bVar);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initRecycleView", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D0(com.tencent.mm.plugin.sns.storage.SnsInfo r17) {
        /*
            Method dump skipped, instructions count: 435
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y84.h3.D0(com.tencent.mm.plugin.sns.storage.SnsInfo):void");
    }

    public final void E0(y84.o3 o3Var, int i17, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        android.widget.FrameLayout X;
        int i18;
        android.view.View view;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("refreshAnimCard", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        java.lang.String j17 = j();
        try {
            X = X();
        } catch (java.lang.Throwable th6) {
            ca4.q.c(j17, th6);
        }
        if (X == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("refreshAnimCard", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
            return;
        }
        int childCount = X.getChildCount() - 1;
        r45.jj4 a17 = o3Var.a();
        java.util.List list = this.M0;
        ((java.util.ArrayList) list).clear();
        int i19 = childCount;
        int i27 = 0;
        while (-1 < i19) {
            android.view.View childAt = X.getChildAt(i19);
            int a07 = i19 == childCount ? a0() : i27 + b0() + Z();
            y84.c cVar = new y84.c(b0(), Y(), a07, i17);
            ((java.util.ArrayList) list).add(cVar);
            kotlin.jvm.internal.o.d(childAt);
            L0(childAt, cVar, i19, childCount);
            com.tencent.mm.ui.widget.RoundCornerFrameLayout roundCornerFrameLayout = childAt instanceof com.tencent.mm.ui.widget.RoundCornerFrameLayout ? (com.tencent.mm.ui.widget.RoundCornerFrameLayout) childAt : null;
            if (roundCornerFrameLayout != null) {
                roundCornerFrameLayout.setRadius(i65.a.b(this.f460107y, 3));
            }
            R(childAt, b0(), Y(), a07, i17);
            android.view.ViewGroup viewGroup = childAt instanceof android.view.ViewGroup ? (android.view.ViewGroup) childAt : null;
            if (viewGroup != null) {
                i18 = 0;
                view = viewGroup.getChildAt(0);
            } else {
                i18 = 0;
                view = null;
            }
            android.widget.ImageView imageView = view instanceof android.widget.ImageView ? (android.widget.ImageView) view : null;
            com.tencent.mm.plugin.sns.model.i1 hj6 = com.tencent.mm.plugin.sns.model.l4.hj();
            android.content.Context context = this.f460107y;
            int hashCode = context != null ? context.hashCode() : i18;
            com.tencent.mm.storage.s7 s7Var = com.tencent.mm.storage.s7.f195308l;
            s7Var.f195313b = snsInfo.getTimeLine().CreateTime;
            hj6.W(a17, imageView, -1, hashCode, s7Var);
            i19--;
            i27 = a07;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("refreshAnimCard", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
    }

    public final void F0(java.util.List list, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, int i17, java.util.List list2, int i18, boolean z17) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5 = "refreshGiftItemList";
        java.lang.String str6 = "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("refreshGiftItemList", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        java.lang.String j17 = j();
        try {
            int size = list.size();
            int i19 = 1;
            int i27 = 0;
            int i28 = 0;
            while (i28 < size) {
                android.widget.ImageView imageView = (android.widget.ImageView) ((java.util.ArrayList) this.G0).get(i28);
                android.widget.ImageView imageView2 = (android.widget.ImageView) ((java.util.ArrayList) this.H0).get(i28);
                str = str5;
                int i29 = i27;
                str2 = str6;
                int i37 = i28;
                try {
                    P0(imageView2, i17, i28, list2, list);
                    if (i18 == 0) {
                        android.view.View view = (android.view.View) ((java.util.ArrayList) this.F0).get(i37);
                        y84.c cVar = (y84.c) ((java.util.ArrayList) this.E0).get(i37);
                        int c17 = cVar.c();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getHeight", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent$SizeContext");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getHeight", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent$SizeContext");
                        R(imageView, c17, cVar.f460024b, cVar.a(), cVar.b());
                        int c18 = cVar.c();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getHeight", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent$SizeContext");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getHeight", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent$SizeContext");
                        R(imageView2, c18, cVar.f460024b, cVar.a(), cVar.b());
                        int c19 = cVar.c();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getHeight", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent$SizeContext");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getHeight", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent$SizeContext");
                        R(view, c19, cVar.f460024b, cVar.a(), cVar.b());
                    }
                    if (z17) {
                        if (i29 < size) {
                            S0((y84.n3) list.get(i29), imageView, snsInfo, imageView2);
                            i27 = i29 + 2;
                            i28 = i37 + 1;
                            str5 = str;
                            str6 = str2;
                        } else if (i19 < size) {
                            S0((y84.n3) list.get(i19), imageView, snsInfo, imageView2);
                            i19 += 2;
                        }
                    }
                    i27 = i29;
                    i28 = i37 + 1;
                    str5 = str;
                    str6 = str2;
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    ca4.q.c(j17, th);
                    str4 = str;
                    str3 = str2;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str4, str3);
                }
            }
            str4 = str5;
            str3 = str6;
        } catch (java.lang.Throwable th7) {
            th = th7;
            str = str5;
            str2 = str6;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str4, str3);
    }

    public final void G0(boolean z17, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        androidx.recyclerview.widget.f2 adapter;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("refreshRecycleView", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        java.lang.String j17 = j();
        try {
            android.view.View i07 = i0();
            if (i07 != null) {
                i07.setBackground(y0(android.graphics.drawable.GradientDrawable.Orientation.RIGHT_LEFT));
            }
            android.view.View p07 = p0();
            if (p07 != null) {
                p07.setBackground(y0(android.graphics.drawable.GradientDrawable.Orientation.LEFT_RIGHT));
            }
            S(this, i0(), k0(), -1, 0, 0, 24, null);
            S(this, p0(), k0(), -1, (int) (this.f460105x - k0()), 0, 16, null);
            if (z17) {
                androidx.recyclerview.widget.RecyclerView o07 = o0();
                if (o07 != null && (adapter = o07.getAdapter()) != null) {
                    adapter.notifyDataSetChanged();
                }
            } else {
                C0(this.f460107y, snsInfo, this.f460103w);
            }
        } catch (java.lang.Throwable th6) {
            ca4.q.c(j17, th6);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("refreshRecycleView", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
    }

    public final float H0(float f17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("relativeDp", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        y84.l3 l3Var = this.f460103w;
        if (l3Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("relativeDp", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
            return 0.0f;
        }
        int i17 = l3Var.f460134a;
        if (i17 == 0) {
            com.tencent.mars.xlog.Log.e(j(), "relativeDp, containerWidth is 0f");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("relativeDp", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
            return 0.0f;
        }
        float f18 = (this.f460105x * f17) / i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("relativeDp", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        return f18;
    }

    public final int I0(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("relativeDp", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        y84.l3 l3Var = this.f460103w;
        if (l3Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("relativeDp", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
            return 0;
        }
        int i18 = l3Var.f460134a;
        if (i18 == 0) {
            com.tencent.mars.xlog.Log.e(j(), "relativeDp, containerWidth is 0");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("relativeDp", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
            return 0;
        }
        int i19 = (int) ((this.f460105x * i17) / i18);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("relativeDp", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        return i19;
    }

    public final void J0(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("requestDynamicData", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        kotlinx.coroutines.y0 h17 = h();
        if (h17 != null) {
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.l.d(h17, ((t26.a) kotlinx.coroutines.internal.b0.f310484a).f415347h, null, new y84.y1(snsInfo, this, null), 2, null);
        }
        kotlinx.coroutines.y0 h18 = h();
        if (h18 != null) {
            kotlinx.coroutines.p0 p0Var2 = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.l.d(h18, ((t26.a) kotlinx.coroutines.internal.b0.f310484a).f415347h, null, new y84.a2(snsInfo, null), 2, null);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("requestDynamicData", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
    }

    public final void K0() {
        android.view.ViewGroup.LayoutParams layoutParams;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetAdSpaceViewUI", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        android.widget.FrameLayout r07 = r0();
        if (r07 != null && (layoutParams = r07.getLayoutParams()) != null) {
            layoutParams.width = -1;
            layoutParams.height = -2;
        }
        android.widget.FrameLayout r08 = r0();
        if (r08 != null) {
            r08.setVisibility(8);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetAdSpaceViewUI", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
    }

    public final void L0(android.view.View view, y84.c cVar, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetAnimCardView", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMAnimCardCenterTranslationX", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        float floatValue = ((java.lang.Number) ((jz5.n) this.f460088o0).getValue()).floatValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMAnimCardCenterTranslationX", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMCardHalfWidth", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        float floatValue2 = ((java.lang.Number) ((jz5.n) this.f460084l0).getValue()).floatValue() * 0.5f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMCardHalfWidth", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        view.setTranslationX((floatValue - cVar.a()) - floatValue2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMAnimCardCenterTranslationY", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        float floatValue3 = ((java.lang.Number) ((jz5.n) this.f460094r0).getValue()).floatValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMAnimCardCenterTranslationY", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMCardHalfHeight", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        float floatValue4 = ((java.lang.Number) ((jz5.n) this.f460085m0).getValue()).floatValue() * 0.5f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMCardHalfHeight", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        view.setTranslationY((floatValue3 - cVar.b()) - floatValue4);
        java.lang.Float valueOf = java.lang.Float.valueOf(0.0f);
        view.setScaleX(0.0f);
        view.setScaleY(0.0f);
        view.setRotationX(0.0f);
        view.setRotationY(0.0f);
        view.setRotation(0.0f);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(valueOf);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/widget/randomselectcard/AdRandomSelectCardComponent", "resetAnimCardView", "(Landroid/view/View;Lcom/tencent/mm/plugin/sns/ad/widget/randomselectcard/AdRandomSelectCardComponent$SizeContext;II)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/sns/ad/widget/randomselectcard/AdRandomSelectCardComponent", "resetAnimCardView", "(Landroid/view/View;Lcom/tencent/mm/plugin/sns/ad/widget/randomselectcard/AdRandomSelectCardComponent$SizeContext;II)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.ViewGroup viewGroup = view instanceof android.view.ViewGroup ? (android.view.ViewGroup) view : null;
        android.view.View childAt = viewGroup != null ? viewGroup.getChildAt(1) : null;
        if (i17 < i18) {
            if (i17 == 0 || i17 == 1) {
                if (childAt != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(java.lang.Float.valueOf(0.28f));
                    java.util.Collections.reverse(arrayList2);
                    android.view.View view2 = childAt;
                    yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ad/widget/randomselectcard/AdRandomSelectCardComponent", "resetAnimCardView", "(Landroid/view/View;Lcom/tencent/mm/plugin/sns/ad/widget/randomselectcard/AdRandomSelectCardComponent$SizeContext;II)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    childAt.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/sns/ad/widget/randomselectcard/AdRandomSelectCardComponent", "resetAnimCardView", "(Landroid/view/View;Lcom/tencent/mm/plugin/sns/ad/widget/randomselectcard/AdRandomSelectCardComponent$SizeContext;II)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                }
            } else if (childAt != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(java.lang.Float.valueOf(0.2f));
                java.util.Collections.reverse(arrayList3);
                android.view.View view3 = childAt;
                yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/sns/ad/widget/randomselectcard/AdRandomSelectCardComponent", "resetAnimCardView", "(Landroid/view/View;Lcom/tencent/mm/plugin/sns/ad/widget/randomselectcard/AdRandomSelectCardComponent$SizeContext;II)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                childAt.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/sns/ad/widget/randomselectcard/AdRandomSelectCardComponent", "resetAnimCardView", "(Landroid/view/View;Lcom/tencent/mm/plugin/sns/ad/widget/randomselectcard/AdRandomSelectCardComponent$SizeContext;II)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
        } else if (childAt != null) {
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(valueOf);
            java.util.Collections.reverse(arrayList4);
            android.view.View view4 = childAt;
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/sns/ad/widget/randomselectcard/AdRandomSelectCardComponent", "resetAnimCardView", "(Landroid/view/View;Lcom/tencent/mm/plugin/sns/ad/widget/randomselectcard/AdRandomSelectCardComponent$SizeContext;II)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            childAt.setAlpha(((java.lang.Float) arrayList4.get(0)).floatValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/sns/ad/widget/randomselectcard/AdRandomSelectCardComponent", "resetAnimCardView", "(Landroid/view/View;Lcom/tencent/mm/plugin/sns/ad/widget/randomselectcard/AdRandomSelectCardComponent$SizeContext;II)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetAnimCardView", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
    }

    public final void M0(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetDataAndView", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        java.lang.String j17 = j();
        try {
            this.J0 = false;
            W0();
            X0();
            if (i17 == 0) {
                O0();
                this.O0 = false;
                android.widget.LinearLayout linearLayout = this.f460099u;
                if (linearLayout != null) {
                    linearLayout.setVisibility(8);
                }
                K0();
            } else if (i17 == 1) {
                com.tencent.mm.view.MMPAGView mMPAGView = this.X;
                if (mMPAGView != null) {
                    mMPAGView.n();
                }
                ((kotlinx.coroutines.flow.h3) this.R0).k(java.lang.Boolean.FALSE);
            }
            com.tencent.mars.xlog.Log.i(j(), "resetDataAndView, fromResetComponentState is " + i17);
        } catch (java.lang.Throwable th6) {
            ca4.q.c(j17, th6);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetDataAndView", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
    }

    public final void O0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetDonePAGView", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        com.tencent.mm.view.MMPAGView mMPAGView = this.X;
        if (mMPAGView != null) {
            a84.y0.i(mMPAGView);
            com.tencent.mm.view.MMPAGView mMPAGView2 = this.X;
            this.X = null;
            y84.z0 z0Var = this.C0;
            y84.x0 x0Var = this.D0;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetPAGView", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGHelper");
            if (mMPAGView2 != null) {
                try {
                    mMPAGView2.i(z0Var);
                    mMPAGView2.j(x0Var);
                    mMPAGView2.post(new com.tencent.mm.plugin.sns.ad.widget.adpag.b0(mMPAGView2));
                } catch (java.lang.Throwable th6) {
                    ca4.q.c("AdPAGHelper", th6);
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetPAGView", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGHelper");
            com.tencent.mars.xlog.Log.i(j(), "resetAndRemovePAGView success");
        } else {
            com.tencent.mars.xlog.Log.w(j(), "resetAndRemovePAGView, mDonePAGView is not created");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetDonePAGView", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
    }

    public final void P(java.util.List list, int i17) {
        java.lang.String str;
        int e17;
        s34.g1 g1Var;
        int e18;
        android.content.res.Resources resources;
        s34.g1 g1Var2;
        android.content.res.Resources resources2;
        s34.g1 g1Var3;
        s34.g1 g1Var4;
        java.lang.String str2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("bindTextComponent", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        int size = list.size();
        y84.l3 l3Var = this.f460103w;
        java.lang.String str3 = "";
        if (l3Var == null || (str = l3Var.f460138e) == null) {
            str = "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(str);
        sb6.append(size);
        y84.l3 l3Var2 = this.f460103w;
        if (l3Var2 != null && (str2 = l3Var2.f460139f) != null) {
            str3 = str2;
        }
        sb6.append(str3);
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        if (com.tencent.mm.ui.bk.C()) {
            y84.l3 l3Var3 = this.f460103w;
            e17 = ca4.n0.e((l3Var3 == null || (g1Var4 = l3Var3.f460143j) == null) ? null : g1Var4.b(), android.graphics.Color.parseColor("#D39A4A"));
        } else {
            y84.l3 l3Var4 = this.f460103w;
            e17 = ca4.n0.e((l3Var4 == null || (g1Var = l3Var4.f460143j) == null) ? null : g1Var.a(), android.graphics.Color.parseColor("#D39A4A"));
        }
        int i18 = 0;
        if (com.tencent.mm.ui.bk.C()) {
            y84.l3 l3Var5 = this.f460103w;
            java.lang.String b17 = (l3Var5 == null || (g1Var3 = l3Var5.f460144k) == null) ? null : g1Var3.b();
            android.content.Context context = this.f460107y;
            if (context != null && (resources2 = context.getResources()) != null) {
                i18 = resources2.getColor(com.tencent.mm.R.color.f478520a84);
            }
            e18 = ca4.n0.e(b17, i18);
        } else {
            y84.l3 l3Var6 = this.f460103w;
            java.lang.String a17 = (l3Var6 == null || (g1Var2 = l3Var6.f460144k) == null) ? null : g1Var2.a();
            android.content.Context context2 = this.f460107y;
            if (context2 != null && (resources = context2.getResources()) != null) {
                i18 = resources.getColor(com.tencent.mm.R.color.f478520a84);
            }
            e18 = ca4.n0.e(a17, i18);
        }
        U0(q0(), sb7, 15.0f, e17);
        if (i17 == 0) {
            android.widget.TextView x07 = x0();
            y84.l3 l3Var7 = this.f460103w;
            U0(x07, l3Var7 != null ? l3Var7.f460136c : null, 15.0f, e17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMIntroduceTitle", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
            android.widget.TextView textView = (android.widget.TextView) ((jz5.n) this.Q).getValue();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMIntroduceTitle", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
            y84.l3 l3Var8 = this.f460103w;
            U0(textView, l3Var8 != null ? l3Var8.f460137d : null, 15.0f, e17);
            android.widget.TextView f07 = f0();
            y84.l3 l3Var9 = this.f460103w;
            U0(f07, l3Var9 != null ? l3Var9.f460140g : null, 15.0f, e17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMDesc", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
            android.widget.TextView textView2 = (android.widget.TextView) ((jz5.n) this.T).getValue();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMDesc", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
            y84.l3 l3Var10 = this.f460103w;
            U0(textView2, l3Var10 != null ? l3Var10.f460141h : null, 14.0f, e18);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bindTextComponent", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
    }

    public final void P0(android.widget.ImageView imageView, int i17, int i18, java.util.List list, java.util.List list2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetLightUpImageView", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        imageView.setTranslationX(0.0f);
        imageView.setTranslationY(0.0f);
        imageView.setScaleX(1.0f);
        imageView.setScaleY(1.0f);
        if (i17 != 1) {
            imageView.setAlpha(1.0f);
        } else if (kz5.n0.O(list, ((y84.n3) list2.get(((java.lang.Number) ((java.util.ArrayList) this.I0).get(i18)).intValue())).f460163e)) {
            imageView.setAlpha(1.0f);
        } else {
            imageView.setAlpha(0.0f);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetLightUpImageView", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
    }

    public final void Q(int i17, int i18, int i19, int i27, int i28, int i29, int i37) {
        android.widget.FrameLayout X;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams;
        android.view.View childAt;
        android.view.View childAt2;
        android.view.View childAt3;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("calcPartContainerSize", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        java.lang.String j17 = j();
        try {
            X = X();
        } catch (java.lang.Throwable th6) {
            ca4.q.c(j17, th6);
        }
        if (X == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("calcPartContainerSize", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
            return;
        }
        int i38 = i28 + i17;
        int w07 = w0() + i38;
        int i39 = i37 + i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMStarDropImgTopDesignMargin", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        int intValue = ((java.lang.Number) ((jz5.n) this.f460076d0).getValue()).intValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMStarDropImgTopDesignMargin", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        float f17 = i17 + intValue;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMStarDropImgHeight", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        int intValue2 = ((java.lang.Number) ((jz5.n) this.f460075c0).getValue()).intValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMStarDropImgHeight", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        int i47 = (int) (f17 - (intValue2 * 0.5f));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMCardContainer", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ((jz5.n) this.F).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMCardContainer", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        S(this, frameLayout, (int) this.f460105x, i39, 0, 0, 24, null);
        S(this, l0(), (int) this.f460105x, i39, 0, 0, 24, null);
        S(this, c0(), (int) this.f460105x, i39, 0, 0, 24, null);
        S(this, j0(), (int) this.f460105x, i39, 0, 0, 24, null);
        S(this, X(), (int) this.f460105x, i39, 0, 0, 24, null);
        R(n0(), (int) this.f460105x, -2, 0, i29 + i17);
        android.widget.ImageView s07 = s0();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMStarDropImgWidth", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        int intValue3 = ((java.lang.Number) ((jz5.n) this.f460074b0).getValue()).intValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMStarDropImgWidth", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMStarDropImgHeight", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        int intValue4 = ((java.lang.Number) ((jz5.n) this.f460075c0).getValue()).intValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMStarDropImgHeight", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        float f18 = this.f460105x;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMStarDropImgWidth", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        int intValue5 = ((java.lang.Number) ((jz5.n) this.f460074b0).getValue()).intValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMStarDropImgWidth", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        R(s07, intValue3, intValue4, (int) ((f18 - intValue5) * 0.5f), i47);
        android.widget.ImageView t07 = t0();
        int v07 = v0();
        int v08 = v0();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMStarBottomLeftMargin", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        int intValue6 = ((java.lang.Number) ((jz5.n) this.f460078f0).getValue()).intValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMStarBottomLeftMargin", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        int g07 = intValue6 - g0();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMStarBottomTopMargin", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        int intValue7 = ((java.lang.Number) ((jz5.n) this.f460079g0).getValue()).intValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMStarBottomTopMargin", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        R(t07, v07, v08, g07, (intValue7 + i17) - g0());
        android.widget.ImageView u07 = u0();
        int v09 = v0();
        int v010 = v0();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMStarTopLeftMargin", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        int intValue8 = ((java.lang.Number) ((jz5.n) this.f460080h0).getValue()).intValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMStarTopLeftMargin", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        int g08 = intValue8 - g0();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMStarTopTopMargin", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        int intValue9 = ((java.lang.Number) ((jz5.n) this.f460081i0).getValue()).intValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMStarTopTopMargin", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        R(u07, v09, v010, g08, (intValue9 + i17) - g0());
        int i48 = 0;
        while (true) {
            if (i48 >= i27) {
                break;
            }
            int b17 = ((y84.c) ((java.util.ArrayList) this.E0).get(i48)).b() + i17;
            android.widget.FrameLayout l07 = l0();
            android.view.ViewGroup.LayoutParams layoutParams = (l07 == null || (childAt3 = l07.getChildAt(i48)) == null) ? null : childAt3.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams2 != null) {
                marginLayoutParams2.topMargin = b17;
            }
            android.widget.FrameLayout j07 = j0();
            android.view.ViewGroup.LayoutParams layoutParams2 = (j07 == null || (childAt2 = j07.getChildAt(i48)) == null) ? null : childAt2.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
            if (marginLayoutParams3 != null) {
                marginLayoutParams3.topMargin = b17;
            }
            android.widget.FrameLayout c07 = c0();
            android.view.ViewGroup.LayoutParams layoutParams3 = (c07 == null || (childAt = c07.getChildAt(i48)) == null) ? null : childAt.getLayoutParams();
            marginLayoutParams = layoutParams3 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams3 : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.topMargin = b17;
            }
            i48++;
        }
        int childCount = X.getChildCount() - 1;
        for (int i49 = childCount; -1 < i49; i49--) {
            y84.c cVar = (y84.c) ((java.util.ArrayList) this.M0).get(childCount - i49);
            android.view.View childAt4 = X.getChildAt(i49);
            android.view.ViewGroup.LayoutParams layoutParams4 = childAt4 != null ? childAt4.getLayoutParams() : null;
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams4 : null;
            if (marginLayoutParams4 != null) {
                marginLayoutParams4.topMargin = cVar.b() + i17;
            }
        }
        android.widget.FrameLayout d07 = d0();
        android.view.ViewGroup.LayoutParams layoutParams5 = d07 != null ? d07.getLayoutParams() : null;
        marginLayoutParams = layoutParams5 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams5 : null;
        if (marginLayoutParams != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMPagContainerHeight", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
            int intValue10 = ((java.lang.Number) ((jz5.n) this.f460082j0).getValue()).intValue();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMPagContainerHeight", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
            marginLayoutParams.topMargin = i38 - intValue10;
        }
        Q0();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMMaterialContainer", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        android.widget.FrameLayout frameLayout2 = (android.widget.FrameLayout) ((jz5.n) this.E).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMMaterialContainer", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        S(this, frameLayout2, (int) this.f460105x, i38, 0, 0, 24, null);
        R(this.f460099u, (int) this.f460105x, w07, i18, i19);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("calcPartContainerSize", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
    }

    public final void Q0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetRecyclerViewItemAndDecorations", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        androidx.recyclerview.widget.RecyclerView o07 = o0();
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = o07 != null ? o07.getLayoutManager() : null;
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager ? (androidx.recyclerview.widget.LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null) {
            int a07 = a0() - Z();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(a07));
            arrayList.add(1073741823);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(linearLayoutManager, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/widget/randomselectcard/AdRandomSelectCardComponent", "resetRecyclerViewItemAndDecorations", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            linearLayoutManager.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
            yj0.a.f(linearLayoutManager, "com/tencent/mm/plugin/sns/ad/widget/randomselectcard/AdRandomSelectCardComponent", "resetRecyclerViewItemAndDecorations", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        }
        androidx.recyclerview.widget.RecyclerView o08 = o0();
        if (o08 != null) {
            o08.D0();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetRecyclerViewItemAndDecorations", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
    }

    public final void R(android.view.View view, int i17, int i18, int i19, int i27) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doLayoutMaterialView", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        android.view.ViewGroup.LayoutParams layoutParams = view != null ? view.getLayoutParams() : null;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.width = i17;
            marginLayoutParams.height = i18;
            marginLayoutParams.leftMargin = i19;
            marginLayoutParams.topMargin = i27;
        }
        if (view != null) {
            view.requestLayout();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doLayoutMaterialView", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
    }

    public final void R0(android.content.Context context, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        y84.o3 o3Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setClickEvent", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        if (context == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setClickEvent", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
            return;
        }
        y84.l3 l3Var = this.f460103w;
        if (l3Var == null || (o3Var = l3Var.f460146m) == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setClickEvent", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
            return;
        }
        android.widget.FrameLayout c07 = c0();
        int childCount = c07 != null ? c07.getChildCount() : 0;
        java.util.List list = o3Var.f460185n;
        androidx.recyclerview.widget.RecyclerView o07 = o0();
        if (o07 != null) {
            o07.setOnTouchListener(new y84.e3(this, new kotlin.jvm.internal.e0(), new kotlin.jvm.internal.e0(), new kotlin.jvm.internal.g0(), new kotlin.jvm.internal.c0(), i65.a.b(this.f460107y, 10)));
            o07.setOnClickListener(new y84.f3(this, snsInfo));
        }
        for (int i17 = 0; i17 < childCount; i17++) {
            android.widget.FrameLayout c08 = c0();
            android.view.View childAt = c08 != null ? c08.getChildAt(i17) : null;
            if (childAt != null) {
                childAt.setOnClickListener(new y84.g3(this, i17, list, snsInfo));
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setClickEvent", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
    }

    public final void S0(y84.n3 n3Var, android.widget.ImageView imageView, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, android.widget.ImageView imageView2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setGiftAreaBigImage", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        com.tencent.mm.plugin.sns.model.i1 hj6 = com.tencent.mm.plugin.sns.model.l4.hj();
        n3Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getImageUrlMedia", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardInfo$SelectCardItem");
        com.tencent.mm.plugin.sns.storage.h1 h1Var = n3Var.f460160b;
        f06.v[] vVarArr = y84.n3.f460158f;
        r45.jj4 jj4Var = (r45.jj4) ((com.tencent.mm.plugin.sns.storage.z) h1Var).a(n3Var, vVarArr[0]);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getImageUrlMedia", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardInfo$SelectCardItem");
        android.content.Context context = this.f460107y;
        int hashCode = context != null ? context.hashCode() : 0;
        com.tencent.mm.storage.s7 s7Var = com.tencent.mm.storage.s7.f195308l;
        s7Var.f195313b = snsInfo.getTimeLine().CreateTime;
        hj6.W(jj4Var, imageView, -1, hashCode, s7Var);
        com.tencent.mm.plugin.sns.model.i1 hj7 = com.tencent.mm.plugin.sns.model.l4.hj();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getImageUrlMedia", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardInfo$SelectCardItem");
        r45.jj4 jj4Var2 = (r45.jj4) ((com.tencent.mm.plugin.sns.storage.z) n3Var.f460160b).a(n3Var, vVarArr[0]);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getImageUrlMedia", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardInfo$SelectCardItem");
        android.content.Context context2 = this.f460107y;
        int hashCode2 = context2 != null ? context2.hashCode() : 0;
        s7Var.f195313b = snsInfo.getTimeLine().CreateTime;
        hj7.W(jj4Var2, imageView2, -1, hashCode2, s7Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setGiftAreaBigImage", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
    }

    public final void T(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doResetUI", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        if (i17 == 0) {
            android.widget.ImageView m07 = m0();
            if (m07 != null) {
                m07.setAlpha(0.7f);
            }
            android.widget.FrameLayout j07 = j0();
            if (j07 != null) {
                j07.setAlpha(1.0f);
            }
            android.widget.FrameLayout n07 = n0();
            if (n07 != null) {
                n07.setAlpha(1.0f);
            }
            android.widget.FrameLayout X = X();
            if (X != null) {
                X.setVisibility(0);
            }
            android.widget.FrameLayout l07 = l0();
            if (l07 != null) {
                l07.setVisibility(4);
            }
            android.widget.FrameLayout j08 = j0();
            if (j08 != null) {
                j08.setVisibility(0);
            }
            android.widget.ImageView s07 = s0();
            if (s07 != null) {
                s07.setVisibility(0);
            }
            android.widget.ImageView t07 = t0();
            if (t07 != null) {
                t07.setVisibility(0);
            }
            android.widget.ImageView u07 = u0();
            if (u07 != null) {
                u07.setVisibility(0);
            }
            android.widget.FrameLayout d07 = d0();
            if (d07 != null) {
                d07.setVisibility(4);
            }
        } else if (i17 != 1) {
            android.widget.ImageView m08 = m0();
            if (m08 != null) {
                m08.setAlpha(1.0f);
            }
            android.widget.FrameLayout j09 = j0();
            if (j09 != null) {
                j09.setAlpha(1.0f);
            }
            android.widget.FrameLayout n08 = n0();
            if (n08 != null) {
                n08.setAlpha(0.0f);
            }
            android.widget.FrameLayout X2 = X();
            if (X2 != null) {
                X2.setVisibility(4);
            }
            android.widget.FrameLayout l08 = l0();
            if (l08 != null) {
                l08.setVisibility(4);
            }
            android.widget.FrameLayout j010 = j0();
            if (j010 != null) {
                j010.setVisibility(0);
            }
            android.widget.ImageView s08 = s0();
            if (s08 != null) {
                s08.setVisibility(4);
            }
            android.widget.ImageView t08 = t0();
            if (t08 != null) {
                t08.setVisibility(4);
            }
            android.widget.ImageView u08 = u0();
            if (u08 != null) {
                u08.setVisibility(4);
            }
            android.widget.FrameLayout d08 = d0();
            if (d08 != null) {
                d08.setVisibility(0);
            }
        } else {
            android.widget.ImageView m09 = m0();
            if (m09 != null) {
                m09.setAlpha(1.0f);
            }
            android.widget.FrameLayout j011 = j0();
            if (j011 != null) {
                j011.setAlpha(0.3f);
            }
            android.widget.FrameLayout n09 = n0();
            if (n09 != null) {
                n09.setAlpha(0.0f);
            }
            android.widget.FrameLayout X3 = X();
            if (X3 != null) {
                X3.setVisibility(4);
            }
            android.widget.FrameLayout l09 = l0();
            if (l09 != null) {
                l09.setVisibility(0);
            }
            android.widget.FrameLayout j012 = j0();
            if (j012 != null) {
                j012.setVisibility(4);
            }
            android.widget.ImageView s09 = s0();
            if (s09 != null) {
                s09.setVisibility(4);
            }
            android.widget.ImageView t09 = t0();
            if (t09 != null) {
                t09.setVisibility(4);
            }
            android.widget.ImageView u09 = u0();
            if (u09 != null) {
                u09.setVisibility(4);
            }
            android.widget.FrameLayout d09 = d0();
            if (d09 != null) {
                d09.setVisibility(4);
            }
        }
        android.widget.FrameLayout c07 = c0();
        if (c07 != null) {
            c07.setVisibility(0);
        }
        if (this.X == null) {
            android.widget.ImageView e07 = e0();
            if (e07 != null) {
                e07.setVisibility(0);
            }
        } else {
            android.widget.ImageView e08 = e0();
            if (e08 != null) {
                e08.setVisibility(8);
            }
        }
        android.widget.FrameLayout n010 = n0();
        if (n010 != null) {
            n010.setVisibility(4);
        }
        android.view.View i07 = i0();
        if (i07 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(i07, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/widget/randomselectcard/AdRandomSelectCardComponent", "doResetUI", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            i07.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(i07, "com/tencent/mm/plugin/sns/ad/widget/randomselectcard/AdRandomSelectCardComponent", "doResetUI", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View p07 = p0();
        if (p07 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(4);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(p07, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ad/widget/randomselectcard/AdRandomSelectCardComponent", "doResetUI", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p07.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(p07, "com/tencent/mm/plugin/sns/ad/widget/randomselectcard/AdRandomSelectCardComponent", "doResetUI", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.FrameLayout l010 = l0();
        if (l010 != null) {
            l010.setAlpha(0.3f);
        }
        android.widget.ImageView s010 = s0();
        if (s010 != null) {
            s010.setTranslationY(0.0f);
        }
        android.widget.ImageView s011 = s0();
        if (s011 != null) {
            s011.setAlpha(1.0f);
        }
        android.widget.ImageView t010 = t0();
        if (t010 != null) {
            t010.setTranslationX(0.0f);
            t010.setTranslationY(0.0f);
            t010.setScaleX(0.0f);
            t010.setScaleY(0.0f);
            t010.setRotation(0.0f);
            t010.setAlpha(1.0f);
        }
        android.widget.ImageView u010 = u0();
        if (u010 != null) {
            u010.setTranslationX(0.0f);
            u010.setTranslationY(0.0f);
            u010.setScaleX(0.0f);
            u010.setScaleY(0.0f);
            u010.setRotation(0.0f);
            u010.setAlpha(1.0f);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doResetUI", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
    }

    public final void T0(float f17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMAvailableWidth", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        if (!(this.f460105x == f17)) {
            this.f460105x = f17;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetLazyValues", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
            java.lang.String j17 = j();
            try {
                this.Y = jz5.h.b(new y84.l2(this));
                this.Z = jz5.h.b(new y84.w2(this));
                this.f460073a0 = jz5.h.b(new y84.x2(this));
                this.f460074b0 = jz5.h.b(new y84.y2(this));
                this.f460075c0 = jz5.h.b(new y84.z2(this));
                this.f460076d0 = jz5.h.b(new y84.a3(this));
                this.f460077e0 = jz5.h.b(new y84.b3(this));
                this.f460078f0 = jz5.h.b(new y84.c3(this));
                this.f460079g0 = jz5.h.b(new y84.d3(this));
                this.f460080h0 = jz5.h.b(new y84.b2(this));
                this.f460081i0 = jz5.h.b(new y84.c2(this));
                this.f460082j0 = jz5.h.b(new y84.d2(this));
                this.f460083k0 = jz5.h.b(new y84.e2(this));
                this.f460084l0 = jz5.h.b(new y84.f2(this));
                this.f460085m0 = jz5.h.b(new y84.g2(this));
                this.f460086n0 = jz5.h.b(new y84.h2(this));
                this.f460088o0 = jz5.h.b(new y84.i2(this));
                this.f460090p0 = jz5.h.b(new y84.j2(this));
                this.f460092q0 = jz5.h.b(new y84.k2(this));
                this.f460094r0 = jz5.h.b(new y84.m2(this));
                this.f460096s0 = jz5.h.b(new y84.n2(this));
                this.f460098t0 = jz5.h.b(new y84.o2(this));
                this.f460100u0 = jz5.h.b(new y84.p2(this));
                this.f460102v0 = jz5.h.b(new y84.q2(this));
                this.f460104w0 = jz5.h.b(new y84.r2(this));
                this.f460106x0 = jz5.h.b(new y84.s2(this));
                this.f460108y0 = jz5.h.b(new y84.t2(this));
                this.f460110z0 = jz5.h.b(new y84.u2(this));
                this.A0 = jz5.h.b(new y84.v2(this));
            } catch (java.lang.Throwable th6) {
                ca4.q.c(j17, th6);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetLazyValues", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMAvailableWidth", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
    }

    public final void U(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, boolean z17, int i17, java.util.List list, int i18) {
        java.lang.String str;
        y84.l3 l3Var;
        y84.o3 o3Var;
        int i19;
        int i27;
        int i28;
        int i29;
        int i37;
        int i38;
        java.util.ArrayList arrayList;
        y84.o3 o3Var2;
        i64.b0 b0Var = this.f460089p;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doResizeUI", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        java.lang.String j17 = j();
        try {
            l3Var = this.f460103w;
            try {
            } catch (java.lang.Throwable th6) {
                th = th6;
                str = j17;
                ca4.q.c(str, th);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doResizeUI", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
                return;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
        }
        if (l3Var != null && (o3Var = l3Var.f460146m) != null) {
            java.util.ArrayList arrayList2 = (java.util.ArrayList) o3Var.f460185n;
            int size = arrayList2.size();
            y84.l3 l3Var2 = this.f460103w;
            if (l3Var2 != null) {
                try {
                    i19 = l3Var2.f460135b;
                } catch (java.lang.Throwable th8) {
                    th = th8;
                    str = j17;
                    ca4.q.c(str, th);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doResizeUI", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
                    return;
                }
            } else {
                i19 = 0;
            }
            int I0 = I0(i19);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMGiftBottomMargin", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
            int intValue = ((java.lang.Number) ((jz5.n) this.Z).getValue()).intValue();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMGiftBottomMargin", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
            int i39 = I0 - intValue;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMCardBottomMargin", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
            int intValue2 = ((java.lang.Number) ((jz5.n) this.f460073a0).getValue()).intValue();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMCardBottomMargin", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
            int Y = (I0 - intValue2) - Y();
            if (i18 == 0) {
                android.widget.FrameLayout d07 = d0();
                int i47 = (int) this.f460105x;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMPagContainerHeight", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
                int intValue3 = ((java.lang.Number) ((jz5.n) this.f460082j0).getValue()).intValue();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMPagContainerHeight", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
                S(this, d07, i47, intValue3, 0, 0, 24, null);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMTextContainer", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
                android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ((jz5.n) this.N).getValue();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMTextContainer", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
                S(this, frameLayout, (int) this.f460105x, w0(), 0, 0, 24, null);
                S(this, h0(), (int) this.f460105x, w0(), 0, 0, 24, null);
                int w07 = I0 + w0();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("refreshSpaceView", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
                android.widget.FrameLayout r07 = r0();
                android.view.ViewGroup.LayoutParams layoutParams = r07 != null ? r07.getLayoutParams() : null;
                float f17 = this.f460105x;
                if (f17 <= 0.0f || w07 <= 0) {
                    K0();
                } else {
                    if (layoutParams != null) {
                        layoutParams.width = (int) f17;
                        layoutParams.height = w07;
                    }
                    android.widget.FrameLayout r08 = r0();
                    if (r08 != null) {
                        r08.setVisibility(0);
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("refreshSpaceView", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
                android.widget.ImageView m07 = m0();
                int i48 = (int) this.f460105x;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMPedestalImgHeight", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
                int intValue4 = ((java.lang.Number) ((jz5.n) this.f460083k0).getValue()).intValue();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMPedestalImgHeight", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
                S(this, m07, i48, intValue4, 0, 0, 24, null);
                if (z17) {
                    i37 = i39;
                    i38 = size;
                    arrayList = arrayList2;
                    o3Var2 = o3Var;
                } else {
                    i37 = i39;
                    i38 = size;
                    arrayList = arrayList2;
                    o3Var2 = o3Var;
                    B0(o3Var2, arrayList, i38, i37);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("refreshGiftItemList$default", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
                i28 = i37;
                i29 = i38;
                F0(arrayList, snsInfo, i17, list, 0, true);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("refreshGiftItemList$default", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
                i27 = Y;
                E0(o3Var2, i27, snsInfo);
                G0(z17, snsInfo);
            } else {
                i27 = Y;
                i28 = i39;
                i29 = size;
            }
            int u17 = ca4.m0.u(j(), this.f460105x);
            java.lang.String j18 = j();
            int b17 = b0Var.b();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMInLargeWindow", "com.tencent.mm.plugin.sns.ad.model.AdViewComponentData");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMInLargeWindow", "com.tencent.mm.plugin.sns.ad.model.AdViewComponentData");
            int v17 = ca4.m0.v(j18, b17, b0Var.f289083d);
            java.lang.String j19 = j();
            int b18 = b0Var.b();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMNickNameTv", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
            com.tencent.mm.plugin.sns.ui.AsyncTextView asyncTextView = (com.tencent.mm.plugin.sns.ui.AsyncTextView) ((jz5.n) this.B0).getValue();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMNickNameTv", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
            int w17 = ca4.m0.w(j19, b18, asyncTextView);
            Q(u17, v17, w17, i29, I0, i27, i28);
            com.tencent.mars.xlog.Log.i(j(), "doResizeUI, selectCardStatus is " + i17 + ", selectCardList is " + list + ", fromResetComponentState is " + i18 + ", mGiftContextList is " + this.E0 + ", mCardAnimContextList is " + this.M0);
            c(new y84.h0(this, u17, w17, v17, i29, I0, i27, i28));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doResizeUI", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
            return;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doResizeUI", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
    }

    public final void U0(android.widget.TextView textView, java.lang.String str, float f17, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTextComponent", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        if (textView != null) {
            textView.setText(str);
            textView.setTextColor(i17);
            textView.setTextSize(0, H0(f17));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTextComponent", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
    }

    public final android.animation.AnimatorSet V(android.view.View view, android.view.View view2, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doTextAlphaAnim", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
        ofFloat.setStartDelay(i17 != 0 ? i17 != 1 ? 0L : 2500L : 1817L);
        ofFloat.setDuration(500L);
        ofFloat.setInterpolator(new android.view.animation.PathInterpolator(0.42f, 0.0f, 0.58f, 1.0f));
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(view2, "alpha", 0.0f, 1.0f);
        ofFloat2.setDuration(i17 != 0 ? i17 != 1 ? 0L : 500L : 1000L);
        ofFloat2.setInterpolator(new android.view.animation.PathInterpolator(0.42f, 0.0f, 0.58f, 1.0f));
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.playSequentially(ofFloat, ofFloat2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doTextAlphaAnim", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        return animatorSet;
    }

    public final void V0(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTextVisible", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        if (i17 == 0) {
            android.widget.TextView x07 = x0();
            if (x07 != null) {
                x07.setAlpha(1.0f);
            }
            android.widget.LinearLayout h07 = h0();
            if (h07 != null) {
                h07.setAlpha(0.0f);
            }
            android.widget.TextView q07 = q0();
            if (q07 != null) {
                q07.setAlpha(0.0f);
            }
            android.widget.TextView f07 = f0();
            if (f07 != null) {
                f07.setAlpha(0.0f);
            }
        } else if (i17 == 2) {
            android.widget.TextView x08 = x0();
            if (x08 != null) {
                x08.setAlpha(0.0f);
            }
            android.widget.LinearLayout h08 = h0();
            if (h08 != null) {
                h08.setAlpha(0.0f);
            }
            android.widget.TextView q08 = q0();
            if (q08 != null) {
                q08.setAlpha(0.0f);
            }
            android.widget.TextView f08 = f0();
            if (f08 != null) {
                f08.setAlpha(1.0f);
            }
        } else {
            android.widget.TextView x09 = x0();
            if (x09 != null) {
                x09.setAlpha(0.0f);
            }
            android.widget.LinearLayout h09 = h0();
            if (h09 != null) {
                h09.setAlpha(0.0f);
            }
            android.widget.TextView q09 = q0();
            if (q09 != null) {
                q09.setAlpha(1.0f);
            }
            android.widget.TextView f09 = f0();
            if (f09 != null) {
                f09.setAlpha(0.0f);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTextVisible", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
    }

    public final android.view.View W() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItemRootView", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemRootView", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        return this.f460087o;
    }

    public final void W0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("stopAnimation", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        com.tencent.mars.xlog.Log.i(j(), "stopAnimation");
        android.animation.AnimatorSet animatorSet = this.K0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        android.animation.AnimatorSet animatorSet2 = this.L0;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stopAnimation", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
    }

    public final android.widget.FrameLayout X() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMCardAnimContainer", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ((jz5.n) this.U).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMCardAnimContainer", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        return frameLayout;
    }

    public final void X0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("stopAutoScroll", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        java.lang.String j17 = j();
        try {
            this.S0.removeCallbacks(this.T0);
        } catch (java.lang.Throwable th6) {
            ca4.q.c(j17, th6);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stopAutoScroll", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
    }

    public final int Y() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMCardHeight", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        int intValue = ((java.lang.Number) this.f460085m0.getValue()).intValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMCardHeight", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        return intValue;
    }

    public final int Z() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMCardInnerMargin", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        int intValue = ((java.lang.Number) this.f460083k0.getValue()).intValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMCardInnerMargin", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        return intValue;
    }

    public final int a0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMCardOuterMargin", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        int intValue = ((java.lang.Number) this.f460086n0.getValue()).intValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMCardOuterMargin", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        return intValue;
    }

    public final int b0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMCardWidth", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        int intValue = ((java.lang.Number) this.f460084l0.getValue()).intValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMCardWidth", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        return intValue;
    }

    public final android.widget.FrameLayout c0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMClickArea", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ((jz5.n) this.M).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMClickArea", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        return frameLayout;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00c1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a5 A[SYNTHETIC] */
    @Override // com.tencent.mm.plugin.sns.ui.widget.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(java.lang.Object r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y84.h3.d(java.lang.Object, boolean):void");
    }

    public final android.widget.FrameLayout d0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMDonePAGContainer", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ((jz5.n) this.V).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMDonePAGContainer", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        return frameLayout;
    }

    public final android.widget.ImageView e0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMDonePAGThumb", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        android.widget.ImageView imageView = (android.widget.ImageView) ((jz5.n) this.W).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMDonePAGThumb", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        return imageView;
    }

    public final android.widget.TextView f0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMDoneTitle", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        android.widget.TextView textView = (android.widget.TextView) ((jz5.n) this.S).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMDoneTitle", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        return textView;
    }

    public final int g0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMHalfStarSize", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        int floatValue = (int) (((java.lang.Number) this.f460077e0.getValue()).floatValue() * 0.5f);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMHalfStarSize", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        return floatValue;
    }

    public final android.widget.LinearLayout h0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMIntroduceContainer", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ((jz5.n) this.P).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMIntroduceContainer", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        return linearLayout;
    }

    public final android.view.View i0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMLeftMaskView", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        android.view.View view = (android.view.View) ((jz5.n) this.I).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMLeftMaskView", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        return view;
    }

    public final android.widget.FrameLayout j0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMLightUpArea", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ((jz5.n) this.L).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMLightUpArea", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        return frameLayout;
    }

    public final int k0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMMaskViewWidth", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        int intValue = ((java.lang.Number) this.f460079g0.getValue()).intValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMMaskViewWidth", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        return intValue;
    }

    public final android.widget.FrameLayout l0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMNoLightUpArea", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ((jz5.n) this.K).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMNoLightUpArea", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        return frameLayout;
    }

    public final android.widget.ImageView m0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMPedestalImg", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        android.widget.ImageView imageView = (android.widget.ImageView) ((jz5.n) this.A).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMPedestalImg", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        return imageView;
    }

    public final android.widget.FrameLayout n0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMRecyclerContainer", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ((jz5.n) this.G).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMRecyclerContainer", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        return frameLayout;
    }

    public final androidx.recyclerview.widget.RecyclerView o0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMRecyclerView", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) ((jz5.n) this.H).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMRecyclerView", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        return recyclerView;
    }

    public final android.view.View p0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMRightMaskView", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        android.view.View view = (android.view.View) ((jz5.n) this.f460072J).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMRightMaskView", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        return view;
    }

    public final android.widget.TextView q0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMSelectedTitle", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        android.widget.TextView textView = (android.widget.TextView) ((jz5.n) this.R).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMSelectedTitle", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        return textView;
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.l
    public void r(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        com.tencent.mm.plugin.sns.storage.SnsInfo model = (com.tencent.mm.plugin.sns.storage.SnsInfo) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        kotlin.jvm.internal.o.g(model, "model");
        super.r(model);
        com.tencent.mars.xlog.Log.i(j(), "onPause");
        M0(1);
        this.O0 = true;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
    }

    public final android.widget.FrameLayout r0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMSnsAdBlankView", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ((jz5.n) this.f460097t).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMSnsAdBlankView", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        return frameLayout;
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.l
    public void s(java.lang.Object obj) {
        y84.o3 o3Var;
        y84.o3 o3Var2;
        androidx.recyclerview.widget.f2 adapter;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        com.tencent.mm.plugin.sns.storage.SnsInfo model = (com.tencent.mm.plugin.sns.storage.SnsInfo) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        kotlin.jvm.internal.o.g(model, "model");
        super.s(model);
        java.lang.String j17 = j();
        try {
        } catch (java.lang.Throwable th6) {
            ca4.q.c(j17, th6);
        }
        if (this.O0) {
            y84.l3 l3Var = this.f460103w;
            if (l3Var != null && (o3Var = l3Var.f460146m) != null) {
                android.widget.FrameLayout X = X();
                if (X == null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
                }
                java.util.List list = o3Var.f460185n;
                java.util.List z07 = z0();
                int A0 = A0();
                boolean z17 = ca4.m0.u0(e42.c0.clicfg_do_reload_image_for_random_select_card, 1) == 1;
                com.tencent.mars.xlog.Log.i(j(), "onResume, selectCardStatus is " + A0 + ", selectCardList is " + z07 + ", shouldReloadImage is " + z17);
                if (z17) {
                    D0(model);
                }
                T(A0);
                P(z07, 1);
                V0(A0);
                androidx.recyclerview.widget.RecyclerView o07 = o0();
                if (o07 != null && (adapter = o07.getAdapter()) != null) {
                    adapter.notifyDataSetChanged();
                }
                Q0();
                F0(list, model, A0, z07, 1, z17);
                int childCount = X.getChildCount() - 1;
                y84.l3 l3Var2 = this.f460103w;
                r45.jj4 a17 = (l3Var2 == null || (o3Var2 = l3Var2.f460146m) == null) ? null : o3Var2.a();
                for (int i17 = childCount; -1 < i17; i17--) {
                    android.view.View childAt = X.getChildAt(i17);
                    y84.c cVar = (y84.c) ((java.util.ArrayList) this.M0).get(childCount - i17);
                    kotlin.jvm.internal.o.d(childAt);
                    L0(childAt, cVar, i17, childCount);
                    if (z17 && a17 != null) {
                        android.view.ViewGroup viewGroup = childAt instanceof android.view.ViewGroup ? (android.view.ViewGroup) childAt : null;
                        android.view.View childAt2 = viewGroup != null ? viewGroup.getChildAt(0) : null;
                        android.widget.ImageView imageView = childAt2 instanceof android.widget.ImageView ? (android.widget.ImageView) childAt2 : null;
                        com.tencent.mm.plugin.sns.model.i1 hj6 = com.tencent.mm.plugin.sns.model.l4.hj();
                        android.content.Context context = this.f460107y;
                        int hashCode = context != null ? context.hashCode() : 0;
                        com.tencent.mm.storage.s7 s7Var = com.tencent.mm.storage.s7.f195308l;
                        s7Var.f195313b = model.getTimeLine().CreateTime;
                        hj6.W(a17, imageView, -1, hashCode, s7Var);
                    }
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        }
        this.O0 = false;
        ((kotlinx.coroutines.flow.h3) this.R0).k(java.lang.Boolean.TRUE);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
    }

    public final android.widget.ImageView s0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMStarDropImg", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        android.widget.ImageView imageView = (android.widget.ImageView) ((jz5.n) this.B).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMStarDropImg", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        return imageView;
    }

    public final android.widget.ImageView t0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMStarImgBottom", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        android.widget.ImageView imageView = (android.widget.ImageView) ((jz5.n) this.C).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMStarImgBottom", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        return imageView;
    }

    public final android.widget.ImageView u0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMStarImgTop", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        android.widget.ImageView imageView = (android.widget.ImageView) ((jz5.n) this.D).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMStarImgTop", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        return imageView;
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.l
    public void v(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetComponentState", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetComponentState", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        super.v((com.tencent.mm.plugin.sns.storage.SnsInfo) obj);
        com.tencent.mars.xlog.Log.i(j(), "resetComponentState");
        N0(this, 0, 1, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetComponentState", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetComponentState", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
    }

    public final int v0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMStarSize", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        int intValue = ((java.lang.Number) this.f460077e0.getValue()).intValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMStarSize", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        return intValue;
    }

    public final int w0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMTextContainerHeight", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        int intValue = ((java.lang.Number) this.Y.getValue()).intValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMTextContainerHeight", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        return intValue;
    }

    public final android.widget.TextView x0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMTitle", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        android.widget.TextView textView = (android.widget.TextView) ((jz5.n) this.O).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMTitle", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        return textView;
    }

    public final android.graphics.drawable.GradientDrawable y0(android.graphics.drawable.GradientDrawable.Orientation orientation) {
        android.content.res.Resources resources;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMaskBackground", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        android.content.Context context = this.f460107y;
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable(orientation, new int[]{0, (context == null || (resources = context.getResources()) == null) ? 0 : resources.getColor(com.tencent.mm.R.color.f478491c)});
        gradientDrawable.setGradientType(0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMaskBackground", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        return gradientDrawable;
    }

    public final java.util.List z0() {
        com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo a17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSelectCardList", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        y84.l3 l3Var = this.f460103w;
        org.json.JSONArray jSONArray = null;
        java.lang.String str = (l3Var == null || (a17 = l3Var.a()) == null) ? null : a17.f162604r0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getVangoghId", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghIdUtil");
        java.lang.String str2 = "";
        if (str == null || str.length() == 0) {
            com.tencent.mars.xlog.Log.w("SnsAd.PageParameter", "dynamic canvas info is empty, it can't obtain vangogh id!!!");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getVangoghId", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghIdUtil");
        } else {
            try {
                java.lang.String optString = new org.json.JSONObject(str).optString("vangogh_id");
                if (optString != null) {
                    str2 = optString;
                }
            } catch (org.json.JSONException unused) {
                com.tencent.mars.xlog.Log.w("SnsAd.PageParameter", "the dynamicCanvasInfo isn't a json string???");
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getVangoghId", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghIdUtil");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRandomSelectCardList", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardStorage");
        try {
            if (str2.length() == 0) {
                com.tencent.mars.xlog.Log.e("RandomSelectCardStorage", "getRandomSelectCardList, vangoghId is null or empty");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRandomSelectCardList", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardStorage");
            } else {
                java.lang.String a18 = y84.p3.f460192a.a(str2);
                java.lang.String e17 = p34.o.e(a18);
                com.tencent.mars.xlog.Log.i("RandomSelectCardStorage", "getRandomSelectCardList, key is " + a18 + ", ret is " + e17);
                org.json.JSONArray jSONArray2 = !(e17 == null || e17.length() == 0) ? new org.json.JSONArray(e17) : null;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRandomSelectCardList", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardStorage");
                jSONArray = jSONArray2;
            }
        } catch (java.lang.Throwable th6) {
            ca4.q.c("RandomSelectCardStorage", th6);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRandomSelectCardList", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardStorage");
        }
        if (jSONArray == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSelectCardList", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
            return arrayList;
        }
        c75.c.d(jSONArray, new y84.k0(this, arrayList));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSelectCardList", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
        return arrayList;
    }
}
