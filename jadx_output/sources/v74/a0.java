package v74;

/* loaded from: classes4.dex */
public final class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v74.k0 f433759d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f433760e;

    public a0(v74.k0 k0Var, android.view.View view) {
        this.f433759d = k0Var;
        this.f433760e = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo;
        w64.n nVar;
        i64.b1 b1Var;
        com.tencent.mm.plugin.sns.storage.ADXml adXml;
        com.tencent.mm.plugin.sns.storage.ADXml adXml2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$mOnOverScrollActionListener$1$onActionUp$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$handleSlideJump", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
        v74.k0 k0Var = this.f433759d;
        k0Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleSlideJump", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
        com.tencent.mars.xlog.Log.i("AdLookbookLogic", "handleSlideJump");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo2 = k0Var.f433838d;
        v74.m mVar = (snsInfo2 == null || (adXml2 = snsInfo2.getAdXml()) == null) ? null : adXml2.adLookbookInfo;
        if ((mVar != null ? mVar.d() : null) == null || (snsInfo = k0Var.f433838d) == null) {
            com.tencent.mars.xlog.Log.e("AdLookbookLogic", "slideActionInfo==null or snsInfo==null");
        } else {
            com.tencent.mm.plugin.sns.storage.ADXml adXml3 = snsInfo.getAdXml();
            s34.x xVar = adXml3 != null ? adXml3.adEggAnimationInfo : null;
            android.view.View view = this.f433760e;
            if (xVar != null) {
                com.tencent.mars.xlog.Log.i("AdLookbookLogic", "slideJump with animation");
                t34.g gVar = new t34.g();
                gVar.f(k0Var.f433835a);
                gVar.e(k0Var.f433838d);
                gVar.c(mVar != null ? mVar.d() : null);
                com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo3 = k0Var.f433838d;
                gVar.a((snsInfo3 == null || (adXml = snsInfo3.getAdXml()) == null) ? null : adXml.adEggAnimationInfo);
                gVar.b(new v74.v(view));
                v74.t tVar = k0Var.f433852r;
                if (tVar != null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsAdStatistic", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$LookbookContext");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsAdStatistic", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$LookbookContext");
                    b1Var = tVar.f433913b;
                } else {
                    b1Var = null;
                }
                gVar.d(b1Var);
                gVar.g(k0Var.f433837c);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("idKeyReport", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookPagFileHelper");
                com.tencent.mars.xlog.Log.i("AdLookbookPagAnimLogic", "adIdKeyReport:1");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(com.tencent.rtmp.TXLiveConstants.PLAY_EVT_DECODE_FIRST_VIDEO_FRAME, 1);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("idKeyReport", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookPagFileHelper");
            } else {
                com.tencent.mars.xlog.Log.i("AdLookbookLogic", "slideJump normal");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doSlideJump", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
                if (mVar.d() != null && k0Var.f433838d != null && (nVar = k0Var.f433839e) != null) {
                    com.tencent.mars.xlog.Log.i("AdLookbookLogic", "doSlideJump");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setCardAnimPrepareListener", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
                    nVar.f443319l = null;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCardAnimPrepareListener", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
                    nVar.p(new w64.c(mVar.d(), k0Var.f433838d, 0, null, false, ca4.m0.Y(k0Var.f433838d) ? 1 : 2, false, null, 220, null));
                    nVar.k(view);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doSlideJump", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("idKeyReport", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookPagFileHelper");
                com.tencent.mars.xlog.Log.i("AdLookbookPagAnimLogic", "adIdKeyReport:2");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(com.tencent.rtmp.TXLiveConstants.PLAY_EVT_DECODE_FIRST_VIDEO_FRAME, 2);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("idKeyReport", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookPagFileHelper");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleSlideJump", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$handleSlideJump", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$mOnOverScrollActionListener$1$onActionUp$1");
    }
}
