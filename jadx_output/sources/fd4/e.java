package fd4;

/* loaded from: classes4.dex */
public class e extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fd4.f f261298a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(fd4.f fVar, android.os.Looper looper) {
        super(looper);
        this.f261298a = fVar;
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleMessage", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness$2");
        long j17 = message.arg1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
        fd4.f fVar = this.f261298a;
        fVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleVideoPlaying", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
        if (fVar.B == 0) {
            fVar.B = java.lang.System.currentTimeMillis();
        }
        if (fVar.f261303u == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleVideoPlaying", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
        } else {
            fVar.w();
            s34.k kVar = fVar.f261303u;
            if (j17 < kVar.f402680a || j17 > kVar.f402681b) {
                fVar.f261299q.setDragEnabled(false);
                fVar.f261299q.b(true);
            } else {
                fVar.f261299q.setDragEnabled(true);
                com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer adDragViewContainer = fVar.f261299q;
                adDragViewContainer.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showDragView", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer");
                if (adDragViewContainer.f163565m.getVisibility() != 0) {
                    com.tencent.mars.xlog.Log.i("AdDragViewContainer", "showDragView");
                    adDragViewContainer.d();
                    adDragViewContainer.f163565m.setVisibility(0);
                    android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(adDragViewContainer.f163565m, "alpha", 0.0f, 1.0f);
                    ofFloat.setDuration(300L);
                    ofFloat.start();
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showDragView", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer");
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleVideoPlaying", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleMessage", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness$2");
    }
}
