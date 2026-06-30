package com.tencent.mm.plugin.sns.ui.widget.ad;

/* loaded from: classes3.dex */
public abstract class v0 extends com.tencent.mm.plugin.sns.ui.widget.l {
    public final jz5.g A;
    public android.animation.AnimatorSet B;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.View f171050o;

    /* renamed from: p, reason: collision with root package name */
    public final android.content.Context f171051p;

    /* renamed from: q, reason: collision with root package name */
    public int f171052q;

    /* renamed from: r, reason: collision with root package name */
    public int f171053r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f171054s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f171055t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f171056u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f171057v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f171058w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f171059x;

    /* renamed from: y, reason: collision with root package name */
    public final jz5.g f171060y;

    /* renamed from: z, reason: collision with root package name */
    public final jz5.g f171061z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(android.view.View actionBtnContainer, android.content.Context context, java.lang.String str, androidx.lifecycle.y yVar, android.view.View view) {
        super(str, yVar, view);
        kotlin.jvm.internal.o.g(actionBtnContainer, "actionBtnContainer");
        kotlin.jvm.internal.o.g(context, "context");
        this.f171050o = actionBtnContainer;
        this.f171051p = context;
        this.f171054s = jz5.h.b(new com.tencent.mm.plugin.sns.ui.widget.ad.i(this, yVar));
        this.f171055t = jz5.h.b(new com.tencent.mm.plugin.sns.ui.widget.ad.d(this));
        this.f171056u = jz5.h.b(new com.tencent.mm.plugin.sns.ui.widget.ad.c(this));
        this.f171057v = jz5.h.b(new com.tencent.mm.plugin.sns.ui.widget.ad.u0(this));
        this.f171058w = jz5.h.b(new com.tencent.mm.plugin.sns.ui.widget.ad.t0(this));
        this.f171059x = jz5.h.b(new com.tencent.mm.plugin.sns.ui.widget.ad.g(this));
        this.f171060y = jz5.h.b(new com.tencent.mm.plugin.sns.ui.widget.ad.b(this));
        this.f171061z = jz5.h.b(new com.tencent.mm.plugin.sns.ui.widget.ad.h(this));
        this.A = jz5.h.b(new com.tencent.mm.plugin.sns.ui.widget.ad.f(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x04d5  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x04e7  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x04ee  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x04f5  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x04fc  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0254 A[LOOP:2: B:85:0x024c->B:87:0x0254, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0283  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A(com.tencent.mm.plugin.sns.ui.widget.ad.v0 r24) {
        /*
            Method dump skipped, instructions count: 1366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.widget.ad.v0.A(com.tencent.mm.plugin.sns.ui.widget.ad.v0):void");
    }

    public static final void y(com.tencent.mm.plugin.sns.ui.widget.ad.v0 v0Var) {
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$processSingleImageViews", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent");
        v0Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("processSingleImageViews", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = (com.tencent.mm.plugin.sns.storage.SnsInfo) v0Var.i();
        if (snsInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("processSingleImageViews", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent");
            str = "access$processSingleImageViews";
            str2 = "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent";
        } else {
            boolean z17 = !snsInfo.getAdXml().adMultiProductsInfo.a().isEmpty();
            android.content.Context context = v0Var.f171051p;
            if (z17) {
                a84.z.c((java.lang.String) snsInfo.getAdXml().adMultiProductsInfo.a().get(0), v0Var.N());
                android.widget.ImageView N = v0Var.N();
                if (N != null) {
                    N.setClipToOutline(true);
                }
                android.widget.ImageView N2 = v0Var.N();
                if (N2 != null) {
                    N2.setOutlineProvider(new com.tencent.mm.plugin.sns.ui.widget.ad.a(i65.a.b(context, 4)));
                }
            } else {
                android.widget.ImageView N3 = v0Var.N();
                if (N3 != null) {
                    N3.setVisibility(4);
                }
            }
            com.tencent.mm.plugin.sns.ad.widget.anim.EdgeAlphaFrameLayout G = v0Var.G();
            int height = G != null ? G.getHeight() : i65.a.b(context, 48);
            com.tencent.mm.plugin.sns.ad.widget.anim.EdgeAlphaFrameLayout G2 = v0Var.G();
            int width = G2 != null ? G2.getWidth() : i65.a.b(context, 200);
            android.view.ViewGroup J2 = v0Var.J();
            if (J2 != null) {
                J2.setVisibility(4);
            }
            android.widget.TextView M = v0Var.M();
            if (M != null) {
                M.setVisibility(4);
            }
            android.widget.TextView M2 = v0Var.M();
            if (M2 != null) {
                M2.setAlpha(1.0f);
            }
            android.widget.TextView M3 = v0Var.M();
            if (M3 != null) {
                M3.setTranslationY(0.0f);
            }
            android.widget.TextView M4 = v0Var.M();
            if (M4 != null) {
                M4.setTranslationX(0.0f);
            }
            android.widget.ImageView N4 = v0Var.N();
            if (N4 != null) {
                N4.setVisibility(4);
            }
            android.widget.ImageView N5 = v0Var.N();
            if (N5 != null) {
                N5.setAlpha(1.0f);
            }
            android.widget.ImageView N6 = v0Var.N();
            if (N6 != null) {
                N6.setTranslationY(0.0f);
            }
            android.widget.ImageView N7 = v0Var.N();
            if (N7 != null) {
                N7.setTranslationX(0.0f);
            }
            android.widget.TextView D = v0Var.D();
            if (D != null) {
                D.setTranslationY(0.0f);
            }
            android.widget.TextView C = v0Var.C();
            if (C != null) {
                C.setTranslationY(0.0f);
            }
            android.widget.TextView D2 = v0Var.D();
            if (D2 != null) {
                D2.setAlpha(1.0f);
            }
            android.widget.TextView C2 = v0Var.C();
            if (C2 != null) {
                C2.setAlpha(1.0f);
            }
            android.widget.Button B = v0Var.B();
            if (B != null) {
                B.setScaleX(1.0f);
            }
            android.widget.Button B2 = v0Var.B();
            if (B2 != null) {
                B2.setScaleY(1.0f);
            }
            android.animation.AnimatorSet animatorSet = v0Var.B;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            v0Var.B = new android.animation.AnimatorSet();
            android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.setStartDelay(3200L);
            ofFloat.setDuration(1000L);
            s74.q4 q4Var = s74.q4.f404513a;
            ofFloat.setInterpolator(q4Var.e());
            ofFloat.addUpdateListener(new com.tencent.mm.plugin.sns.ui.widget.ad.j(height, v0Var));
            android.animation.ValueAnimator ofFloat2 = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat2.setStartDelay(3000L);
            ofFloat2.setDuration(1000L);
            ofFloat2.setInterpolator(q4Var.e());
            ofFloat2.addUpdateListener(new com.tencent.mm.plugin.sns.ui.widget.ad.k(height, v0Var));
            android.animation.ValueAnimator ofFloat3 = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat3.setStartDelay(3400L);
            ofFloat3.setDuration(1000L);
            ofFloat3.setInterpolator(q4Var.e());
            ofFloat3.addUpdateListener(new com.tencent.mm.plugin.sns.ui.widget.ad.l(height, v0Var));
            android.animation.ValueAnimator ofFloat4 = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat4.setStartDelay(3600L);
            ofFloat4.setDuration(1000L);
            ofFloat4.setInterpolator(q4Var.e());
            ofFloat4.addUpdateListener(new com.tencent.mm.plugin.sns.ui.widget.ad.m(height, v0Var));
            android.animation.ValueAnimator ofFloat5 = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat5.setStartDelay(11800L);
            ofFloat5.setDuration(1000L);
            ofFloat5.setInterpolator(q4Var.e());
            ofFloat5.addUpdateListener(new com.tencent.mm.plugin.sns.ui.widget.ad.n(v0Var));
            android.animation.ValueAnimator ofFloat6 = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat6.setStartDelay(11100L);
            ofFloat6.setDuration(1500L);
            ofFloat6.setInterpolator(q4Var.e());
            ofFloat6.addUpdateListener(new com.tencent.mm.plugin.sns.ui.widget.ad.o(v0Var, width));
            android.animation.ValueAnimator ofFloat7 = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
            str = "access$processSingleImageViews";
            ofFloat7.setStartDelay(11000L);
            ofFloat7.setDuration(1500L);
            ofFloat7.setInterpolator(q4Var.e());
            ofFloat7.addUpdateListener(new com.tencent.mm.plugin.sns.ui.widget.ad.p(v0Var, width));
            android.animation.ValueAnimator ofFloat8 = android.animation.ValueAnimator.ofFloat(1.0f, 1.1f, 1.0f);
            ofFloat8.setStartDelay(12200L);
            ofFloat8.setDuration(600L);
            ofFloat8.setInterpolator(q4Var.e());
            ofFloat8.addUpdateListener(new com.tencent.mm.plugin.sns.ui.widget.ad.q(v0Var));
            android.animation.AnimatorSet animatorSet2 = v0Var.B;
            if (animatorSet2 != null) {
                animatorSet2.play(ofFloat);
            }
            android.animation.AnimatorSet animatorSet3 = v0Var.B;
            if (animatorSet3 != null) {
                animatorSet3.play(ofFloat2);
            }
            android.animation.AnimatorSet animatorSet4 = v0Var.B;
            if (animatorSet4 != null) {
                animatorSet4.play(ofFloat3);
            }
            android.animation.AnimatorSet animatorSet5 = v0Var.B;
            if (animatorSet5 != null) {
                animatorSet5.play(ofFloat4);
            }
            android.animation.AnimatorSet animatorSet6 = v0Var.B;
            if (animatorSet6 != null) {
                animatorSet6.play(ofFloat5);
            }
            android.animation.AnimatorSet animatorSet7 = v0Var.B;
            if (animatorSet7 != null) {
                animatorSet7.play(ofFloat6);
            }
            android.animation.AnimatorSet animatorSet8 = v0Var.B;
            if (animatorSet8 != null) {
                animatorSet8.play(ofFloat7);
            }
            android.animation.AnimatorSet animatorSet9 = v0Var.B;
            if (animatorSet9 != null) {
                animatorSet9.play(ofFloat8);
            }
            android.animation.AnimatorSet animatorSet10 = v0Var.B;
            if (animatorSet10 != null) {
                animatorSet10.addListener(new com.tencent.mm.plugin.sns.ui.widget.ad.s(v0Var));
            }
            android.animation.AnimatorSet animatorSet11 = v0Var.B;
            if (animatorSet11 != null) {
                animatorSet11.start();
            }
            str2 = "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent";
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("processSingleImageViews", str2);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x04d2  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x04df  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x050d  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x022b A[LOOP:2: B:82:0x0223->B:84:0x022b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0266  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void z(com.tencent.mm.plugin.sns.ui.widget.ad.v0 r27) {
        /*
            Method dump skipped, instructions count: 1378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.widget.ad.v0.z(com.tencent.mm.plugin.sns.ui.widget.ad.v0):void");
    }

    public final android.widget.Button B() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getActionBtn", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent");
        android.widget.Button button = (android.widget.Button) ((jz5.n) this.f171060y).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getActionBtn", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent");
        return button;
    }

    public final android.widget.TextView C() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getActionDesc", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent");
        android.widget.TextView textView = (android.widget.TextView) ((jz5.n) this.f171056u).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getActionDesc", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent");
        return textView;
    }

    public final android.widget.TextView D() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getActionTitle", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent");
        android.widget.TextView textView = (android.widget.TextView) ((jz5.n) this.f171055t).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getActionTitle", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent");
        return textView;
    }

    public final float E(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDp", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent");
        float b17 = i65.a.b(this.f171051p, i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDp", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent");
        return b17;
    }

    public final java.util.List F() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getImageContainerList", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent");
        java.util.List list = (java.util.List) ((jz5.n) this.A).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getImageContainerList", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent");
        return list;
    }

    public final com.tencent.mm.plugin.sns.ad.widget.anim.EdgeAlphaFrameLayout G() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLeftFrameLayout", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent");
        com.tencent.mm.plugin.sns.ad.widget.anim.EdgeAlphaFrameLayout edgeAlphaFrameLayout = (com.tencent.mm.plugin.sns.ad.widget.anim.EdgeAlphaFrameLayout) ((jz5.n) this.f171059x).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLeftFrameLayout", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent");
        return edgeAlphaFrameLayout;
    }

    public final int H() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMeasureDescHeight", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent");
        int i17 = this.f171053r;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMeasureDescHeight", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent");
        return i17;
    }

    public final int I() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMeasureTitleHeight", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent");
        int i17 = this.f171052q;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMeasureTitleHeight", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent");
        return i17;
    }

    public final android.view.ViewGroup J() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMultiProductLayout", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) ((jz5.n) this.f171061z).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMultiProductLayout", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent");
        return viewGroup;
    }

    public final int K() {
        com.tencent.mm.plugin.sns.storage.ADXml adXml;
        com.tencent.mm.plugin.sns.storage.s0 s0Var;
        java.util.List a17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMultiType", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = (com.tencent.mm.plugin.sns.storage.SnsInfo) i();
        int size = (snsInfo == null || (adXml = snsInfo.getAdXml()) == null || (s0Var = adXml.adMultiProductsInfo) == null || (a17 = s0Var.a()) == null) ? 0 : a17.size();
        if (size > 3) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMultiType", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent");
            return 3;
        }
        if (size < 1) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMultiType", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent");
            return 1;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMultiType", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent");
        return size;
    }

    public final android.view.ViewGroup L() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMultiViewGroup", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) ((jz5.n) this.f171054s).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMultiViewGroup", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent");
        return viewGroup;
    }

    public final android.widget.TextView M() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getProductDesc", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent");
        android.widget.TextView textView = (android.widget.TextView) ((jz5.n) this.f171058w).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getProductDesc", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent");
        return textView;
    }

    public final android.widget.ImageView N() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSingleImage", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent");
        android.widget.ImageView imageView = (android.widget.ImageView) ((jz5.n) this.f171057v).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSingleImage", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent");
        return imageView;
    }

    public abstract boolean O(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo);

    @Override // com.tencent.mm.plugin.sns.ui.widget.l
    public boolean o(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isSameContent", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent");
        com.tencent.mm.plugin.sns.storage.SnsInfo lastModel = (com.tencent.mm.plugin.sns.storage.SnsInfo) obj;
        com.tencent.mm.plugin.sns.storage.SnsInfo currentModel = (com.tencent.mm.plugin.sns.storage.SnsInfo) obj2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isSameContent", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent");
        kotlin.jvm.internal.o.g(lastModel, "lastModel");
        kotlin.jvm.internal.o.g(currentModel, "currentModel");
        boolean b17 = kotlin.jvm.internal.o.b(lastModel.getSnsId(), currentModel.getSnsId());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSameContent", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSameContent", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent");
        return b17;
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.l
    public void p(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDetach", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent");
        com.tencent.mm.plugin.sns.storage.SnsInfo model = (com.tencent.mm.plugin.sns.storage.SnsInfo) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDetach", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent");
        kotlin.jvm.internal.o.g(model, "model");
        super.p(model);
        android.animation.AnimatorSet animatorSet = this.B;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        com.tencent.mars.xlog.Log.i(j(), "onDetach " + model.getSnsId());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDetach", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDetach", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent");
    }
}
