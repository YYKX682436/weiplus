package d84;

/* loaded from: classes4.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d84.j0 f227048d;

    public b(d84.j0 j0Var) {
        this.f227048d = j0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.app.Activity activity;
        boolean z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent$handleAtCommentClick$1$2$1$1");
        d84.j0 j0Var = this.f227048d;
        java.lang.String j17 = j0Var.j();
        try {
            android.content.Context z18 = d84.j0.z(j0Var);
            activity = z18 instanceof android.app.Activity ? (android.app.Activity) z18 : null;
            z17 = true;
        } catch (java.lang.Throwable th6) {
            ca4.q.c(j17, th6);
        }
        if (!(activity != null && activity.isFinishing())) {
            android.content.Context z19 = d84.j0.z(j0Var);
            android.app.Activity activity2 = z19 instanceof android.app.Activity ? (android.app.Activity) z19 : null;
            if (activity2 == null || !activity2.isDestroyed()) {
                z17 = false;
            }
            if (!z17) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1612, 210);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSource", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSource", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
                if (j0Var.f227087p == 0) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getClickListener", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getClickListener", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
                    com.tencent.mm.plugin.sns.ui.listener.i iVar = j0Var.f227090s;
                    if (iVar != null) {
                        iVar.z(d84.j0.E(j0Var));
                    }
                } else {
                    android.content.Context z27 = d84.j0.z(j0Var);
                    com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI snsCommentDetailUI = z27 instanceof com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI ? (com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI) z27 : null;
                    if (snsCommentDetailUI != null) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCommentForClick", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                        android.widget.LinearLayout linearLayout = snsCommentDetailUI.f166899y;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCommentForClick", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
                        if (linearLayout != null) {
                            linearLayout.performClick();
                        }
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent$handleAtCommentClick$1$2$1$1");
                return;
            }
        }
        com.tencent.mars.xlog.Log.w(j0Var.j(), "handleAtCommentClick, activity is finishing or destroyed");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent$handleAtCommentClick$1$2$1$1");
    }
}
