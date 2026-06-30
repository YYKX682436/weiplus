package gc4;

/* loaded from: classes4.dex */
public final class b implements com.tencent.mm.ui.tools.c5 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f270440d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ui.SnsCommentFooter f270441e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f270442f;

    /* renamed from: g, reason: collision with root package name */
    public int f270443g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f270444h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.ui.tools.f5 f270445i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f270446m;

    public b(com.tencent.mm.ui.MMActivity activity, com.tencent.mm.plugin.sns.ui.SnsCommentFooter commentFooter) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(commentFooter, "commentFooter");
        this.f270440d = activity;
        this.f270441e = commentFooter;
        this.f270442f = "MicroMsg.SnsCommentAdjustNothingKeyboardStateDelegate";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateUseAdjustNothingConfigValue", "com.tencent.mm.plugin.sns.model.config.SnsCommentFooterConfig");
        ka4.e.f306129a = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_sns_comment_footer_use_adjust_nothing, true);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsCommentFooterConfig", "enableAdjustNothing: " + ka4.e.f306129a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateUseAdjustNothingConfigValue", "com.tencent.mm.plugin.sns.model.config.SnsCommentFooterConfig");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enableUseAdjustNothingConfig", "com.tencent.mm.plugin.sns.model.config.SnsCommentFooterConfig");
        boolean z17 = ka4.e.f306129a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableUseAdjustNothingConfig", "com.tencent.mm.plugin.sns.model.config.SnsCommentFooterConfig");
        this.f270444h = z17;
        android.view.Window window = activity.getWindow();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setWindowSoftInputModeToAdjustNothing", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        if (z17) {
            window.setSoftInputMode(48);
        }
        commentFooter.G = z17;
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsCommentFooter", "setWindowSoftInputModeToAdjustNothing: enable:%b, current mode:%d", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(window.getAttributes().softInputMode));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setWindowSoftInputModeToAdjustNothing", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsCommentAdjustNothingKeyboardStateDelegate", "init useAdjustNothing=" + z17);
        if (z17) {
            com.tencent.mm.ui.tools.f5 f5Var = new com.tencent.mm.ui.tools.f5(activity);
            this.f270445i = f5Var;
            f5Var.f210400e = this;
        }
    }

    public final void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("close", "com.tencent.mm.plugin.sns.ui.helper.SnsCommentAdjustNothingKeyboardStateDelegate");
        com.tencent.mars.xlog.Log.i(this.f270442f, "close: keyboardHeightProviderStarted=" + this.f270446m);
        com.tencent.mm.ui.tools.f5 f5Var = this.f270445i;
        if (f5Var != null) {
            f5Var.d();
        }
        this.f270446m = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("close", "com.tencent.mm.plugin.sns.ui.helper.SnsCommentAdjustNothingKeyboardStateDelegate");
    }

    public final boolean b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enableDelegateKeyBoardState", "com.tencent.mm.plugin.sns.ui.helper.SnsCommentAdjustNothingKeyboardStateDelegate");
        boolean z17 = false;
        if (this.f270444h) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isUseAdjustResize", "com.tencent.mm.plugin.sns.ui.helper.SnsCommentAdjustNothingKeyboardStateDelegate");
            boolean z18 = (this.f270440d.getWindow().getAttributes().softInputMode & 240) == 16;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isUseAdjustResize", "com.tencent.mm.plugin.sns.ui.helper.SnsCommentAdjustNothingKeyboardStateDelegate");
            if (!z18) {
                z17 = true;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableDelegateKeyBoardState", "com.tencent.mm.plugin.sns.ui.helper.SnsCommentAdjustNothingKeyboardStateDelegate");
        return z17;
    }

    public final void c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("start", "com.tencent.mm.plugin.sns.ui.helper.SnsCommentAdjustNothingKeyboardStateDelegate");
        com.tencent.mars.xlog.Log.i(this.f270442f, "start: keyboardHeightProviderStarted=" + this.f270446m);
        com.tencent.mm.ui.tools.f5 f5Var = this.f270445i;
        if (f5Var != null) {
            f5Var.f();
        }
        this.f270446m = true;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("start", "com.tencent.mm.plugin.sns.ui.helper.SnsCommentAdjustNothingKeyboardStateDelegate");
    }

    @Override // com.tencent.mm.ui.tools.c5
    public void w2(int i17, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onKeyboardHeightChanged", "com.tencent.mm.plugin.sns.ui.helper.SnsCommentAdjustNothingKeyboardStateDelegate");
        com.tencent.mm.ui.MMActivity mMActivity = this.f270440d;
        int max = i17 == 0 ? 0 : java.lang.Math.max(com.tencent.mm.sdk.platformtools.d2.h(mMActivity, i17, 0), i17);
        com.tencent.mars.xlog.Log.i(this.f270442f, "onKeyboardHeightChanged: resultHeight:" + max + ", from provider:" + i17 + ", isResized=" + z17);
        if (this.f270445i != null) {
            int i18 = max > 0 ? 1 : 2;
            if (i18 != this.f270443g) {
                this.f270443g = i18;
                mMActivity.onKeyboardStateChanged();
            }
            com.tencent.mm.plugin.sns.ui.SnsCommentFooter snsCommentFooter = this.f270441e;
            snsCommentFooter.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("notifyKeyBoardChangeOnAdjustNothing", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsCommentFooter", "notifyKeyBoardChange: keyboardHeight: %d, isResized: %s", java.lang.Integer.valueOf(max), java.lang.Boolean.valueOf(z17));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enableWindowSoftInputModeAdjustNothing", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            boolean z18 = snsCommentFooter.G;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableWindowSoftInputModeAdjustNothing", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            if (z18) {
                boolean z19 = max > 0;
                snsCommentFooter.X(z19, max);
                if (snsCommentFooter.f167101r != null) {
                    if (!z19 && !snsCommentFooter.y() && !snsCommentFooter.x()) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.SnsCommentFooter", "notifyKeyBoardChange: footer need down, SmileyPanel Gone");
                        snsCommentFooter.p();
                        snsCommentFooter.J(false);
                        snsCommentFooter.f167114z1 = false;
                    }
                    if (z19 && snsCommentFooter.f167101r.getVisibility() == 8) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.SnsCommentFooter", "notifyKeyBoardChange: footer need up");
                        snsCommentFooter.q(false);
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("notifyKeyBoardChangeOnAdjustNothing", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsCommentFooter", "notifyKeyBoardChange: should use adjustNothing!");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("notifyKeyBoardChangeOnAdjustNothing", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onKeyboardHeightChanged", "com.tencent.mm.plugin.sns.ui.helper.SnsCommentAdjustNothingKeyboardStateDelegate");
    }
}
