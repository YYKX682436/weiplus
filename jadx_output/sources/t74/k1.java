package t74;

/* loaded from: classes4.dex */
public final class k1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t74.w1 f416175d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f416176e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f416177f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f416178g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f416179h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f416180i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(t74.w1 w1Var, android.view.ViewGroup viewGroup, int i17, int i18, int i19, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f416175d = w1Var;
        this.f416176e = viewGroup;
        this.f416177f = i17;
        this.f416178g = i18;
        this.f416179h = i19;
        this.f416180i = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$resizeUI$1$onPreDraw$1");
        t74.k1 k1Var = new t74.k1(this.f416175d, this.f416176e, this.f416177f, this.f416178g, this.f416179h, this.f416180i, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$resizeUI$1$onPreDraw$1");
        return k1Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$resizeUI$1$onPreDraw$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$resizeUI$1$onPreDraw$1");
        java.lang.Object invokeSuspend = ((t74.k1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$resizeUI$1$onPreDraw$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$resizeUI$1$onPreDraw$1");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        float K;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$resizeUI$1$onPreDraw$1");
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        t74.w1 w1Var = this.f416175d;
        android.view.ViewGroup b17 = w1Var.t0().b();
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (b17 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$resizeUI$1$onPreDraw$1");
            return f0Var;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMFlipBottomContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMFlipBottomContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ((jz5.n) w1Var.M).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMFlipBottomContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMFlipBottomContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        if (frameLayout == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$resizeUI$1$onPreDraw$1");
            return f0Var;
        }
        int[] iArr = new int[2];
        this.f416176e.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItemRootView", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemRootView", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        android.view.View view = w1Var.f416274o;
        if (view != null) {
            view.getLocationOnScreen(iArr2);
        }
        int i17 = iArr[0] - iArr2[0];
        int i18 = iArr[1] - iArr2[1];
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setMLeft$p", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        w1Var.f416285t0 = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setMLeft$p", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setMTop$p", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        w1Var.f416287u0 = i18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setMTop$p", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        int[] iArr3 = new int[2];
        b17.getLocationOnScreen(iArr3);
        int height = b17.getHeight() + iArr3[1];
        t74.w1.r0(w1Var, -1, height - iArr2[1], 0, 0, t74.w1.b0(w1Var), 0.0f, 32, null);
        com.tencent.mars.xlog.Log.i(w1Var.j(), "onPreDraw, flipCardTouchContainer width is " + t74.w1.M(w1Var) + ", height is " + this.f416177f + ", leftMargin is " + i17 + ", topMargin is " + i18 + ", flipCardBreakContainer breakContainerBottom is " + height);
        int M = t74.w1.M(w1Var);
        int K2 = t74.w1.K(w1Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMBottomMaterialTop$p", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        int i19 = w1Var.f416273n0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMBottomMaterialTop$p", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        android.widget.ImageView S = t74.w1.S(w1Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMRadius", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        float H0 = w1Var.H0();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMRadius", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$doLayoutMaterialView", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        w1Var.q0(M, K2, i17, i19 + i18, S, H0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$doLayoutMaterialView", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        int M2 = t74.w1.M(w1Var);
        int K3 = t74.w1.K(w1Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMBottomMaterialTop$p", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        int i27 = w1Var.f416273n0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMBottomMaterialTop$p", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        com.tencent.mm.ui.widget.RoundCornerFrameLayout D = t74.w1.D(w1Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMRadius", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        float H02 = w1Var.H0();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMRadius", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$doLayoutMaterialView", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        w1Var.q0(M2, K3, 0, i27, D, H02);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$doLayoutMaterialView", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        t74.w1.r0(w1Var, t74.w1.M(w1Var), -2, i17, i18, t74.w1.E(w1Var), 0.0f, 32, null);
        t74.w1.r0(w1Var, t74.w1.M(w1Var), this.f416177f, i17, i18, t74.w1.G(w1Var), 0.0f, 32, null);
        t74.w1.r0(w1Var, t74.w1.M(w1Var), this.f416177f, i17, i18, t74.w1.U(w1Var), 0.0f, 32, null);
        int i28 = this.f416178g + i17;
        t74.w1.r0(w1Var, t74.w1.c0(w1Var), t74.w1.c0(w1Var), i28, this.f416179h + i18, t74.w1.X(w1Var), 0.0f, 32, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setMTopMaterialAnimTop$p", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        w1Var.f416277p0 = ((int) ((t74.w1.K(w1Var) - t74.w1.c0(w1Var)) * 0.5f)) + i18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setMTopMaterialAnimTop$p", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        int c07 = t74.w1.c0(w1Var);
        int c08 = t74.w1.c0(w1Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMTopMaterialAnimTop$p", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        int i29 = w1Var.f416277p0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMTopMaterialAnimTop$p", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        com.tencent.mm.ui.widget.RoundCornerFrameLayout I = t74.w1.I(w1Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMRadius", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        float H03 = w1Var.H0();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMRadius", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$doLayoutMaterialView", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        w1Var.q0(c07, c08, i28, i29, I, H03);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$doLayoutMaterialView", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        com.tencent.mm.ui.widget.RoundCornerFrameLayout I2 = t74.w1.I(w1Var);
        if (I2 != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMBottomMaterialTop$p", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
            int i37 = w1Var.f416273n0;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMBottomMaterialTop$p", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
            I2.setTranslationY(i37);
        }
        t74.w1.r0(w1Var, t74.w1.M(w1Var), t74.w1.K(w1Var), 0, 0, t74.w1.J(w1Var), 0.0f, 32, null);
        float f17 = -(i28 - i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMTopMaterialAnimTop$p", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        int i38 = w1Var.f416277p0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMTopMaterialAnimTop$p", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        float f18 = -(i38 - i18);
        android.widget.ImageView J2 = t74.w1.J(w1Var);
        if (J2 != null) {
            J2.setTranslationX(f17);
            J2.setTranslationY(f18);
        }
        if (t74.w1.Y(w1Var)) {
            t74.w1.r0(w1Var, t74.w1.M(w1Var), t74.w1.K(w1Var), 0, 0, t74.w1.H(w1Var), 0.0f, 32, null);
            com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView H = t74.w1.H(w1Var);
            if (H != null) {
                H.setTranslationX(f17);
                H.setTranslationY(f18);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setMTopMaterialLeft$p", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        w1Var.f416281r0 = i28;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setMTopMaterialLeft$p", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setMTopMaterialTop$p", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setMTopMaterialTop$p", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setMIsResetBackCardUI$p", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        w1Var.f416271l0 = true;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setMIsResetBackCardUI$p", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        frameLayout.getLocationOnScreen(new int[2]);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMTextContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        android.widget.LinearLayout I0 = w1Var.I0();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMTextContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        int height2 = I0 != null ? I0.getHeight() : 0;
        float K4 = (((r1[1] - iArr[1]) - t74.w1.K(w1Var)) - height2) * 0.5f;
        if (height2 == 0) {
            K4 = t74.w1.K(w1Var);
            K = t74.w1.M(w1Var) * 0.033f;
        } else {
            K = t74.w1.K(w1Var);
        }
        float f19 = K4 + K;
        com.tencent.mars.xlog.Log.i(w1Var.j(), "onPreDraw, textContainer height is " + height2 + ", textContainerTopMargin is " + f19);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMTextContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        android.widget.LinearLayout I02 = w1Var.I0();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMTextContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        t74.w1.r0(w1Var, t74.w1.M(w1Var), -2, 0, (int) f19, I02, 0.0f, 32, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$showNextFrame", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showNextFrame", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        w1Var.c(new t74.s1(w1Var, this.f416180i));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showNextFrame", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$showNextFrame", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$resizeUI$1$onPreDraw$1");
        return f0Var;
    }
}
