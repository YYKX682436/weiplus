package p74;

/* loaded from: classes4.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p74.o f352567d;

    public m(p74.o oVar) {
        this.f352567d = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardOverSlideLeftLogic$mTouchActionListener$1$onActionUp$1");
        com.tencent.mars.xlog.Log.i("SnsAd.AdSlideCardOverSlideLeftLogic", "onActionUp, doSlideJump");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMContext$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardOverSlideLeftLogic");
        p74.o oVar = this.f352567d;
        android.content.Context context = oVar.f352569a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMContext$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardOverSlideLeftLogic");
        if (context == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardOverSlideLeftLogic$mTouchActionListener$1$onActionUp$1");
            return;
        }
        if (context instanceof android.app.Activity) {
            android.app.Activity activity = (android.app.Activity) context;
            if (activity.isFinishing() || activity.isDestroyed()) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardOverSlideLeftLogic$mTouchActionListener$1$onActionUp$1");
                return;
            }
        }
        q74.b0 b0Var = p74.o.a(oVar).f352532g;
        if (b0Var != null) {
            b0Var.e();
        }
        oVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doSlideJump", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardOverSlideLeftLogic");
        p74.d dVar = oVar.f352570b;
        w64.n nVar = dVar.f352531f;
        if (nVar != null) {
            int i17 = ca4.m0.Y(oVar.f352572d) ? 1 : 2;
            com.tencent.mars.xlog.Log.i("SnsAd.AdSlideCardOverSlideLeftLogic", "doSlideJump, nativeSightType=" + i17);
            s34.a1 a1Var = oVar.f352573e;
            nVar.p(new w64.c(a1Var != null ? a1Var.overSlideJumpInfo : null, oVar.f352572d, 0, null, false, i17, false, null, 220, null));
            nVar.k(dVar.f352526a);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doSlideJump", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardOverSlideLeftLogic");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardOverSlideLeftLogic$mTouchActionListener$1$onActionUp$1");
    }
}
