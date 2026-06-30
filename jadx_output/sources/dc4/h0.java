package dc4;

/* loaded from: classes4.dex */
public class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dc4.l0 f228751d;

    public h0(dc4.l0 l0Var) {
        this.f228751d = l0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        u74.d dVar;
        com.tencent.mm.plugin.sns.ui.widget.SnsAdCardVideoEndView snsAdCardVideoEndView;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew$4");
        dc4.l0 l0Var = this.f228751d;
        l0Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkShowEndView", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
        try {
            dVar = l0Var.f228773t;
            snsAdCardVideoEndView = dVar.f425155p;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FullCardAdDetailItemNew", "handleVideoCompletion, exp" + e17.toString());
        }
        if (snsAdCardVideoEndView == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FullCardAdDetailItemNew", "checkShowEndView, viewHolder.videoEndView==null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkShowEndView", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew$4");
        }
        com.tencent.mm.plugin.sns.storage.n nVar = l0Var.f228770q;
        if (nVar == null || nVar.endCoverViewInfo == null) {
            snsAdCardVideoEndView.c(false);
        } else {
            if (dVar.T.f425133c) {
                snsAdCardVideoEndView.setBlurBkg(dVar.f425162w.getInnerVideoView());
            } else {
                snsAdCardVideoEndView.setBlurBkg(dVar.f425154o.f168417g.getInnerVideoView());
            }
            l0Var.f228773t.f425155p.d();
            l0Var.f228773t.f425155p.f(true);
            l0Var.f228772s = true;
            u74.d dVar2 = l0Var.f228773t;
            if (!dVar2.T.f425133c) {
                dVar2.f425154o.f168417g.k(0, false);
            } else if (dVar2.f425162w.getInnerVideoView() instanceof com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerVideoView) {
                l0Var.f228773t.f425162w.M(0, false);
                l0Var.f228773t.f425162w.F();
            }
            l0Var.f228774u.h(l0Var.f228773t.T.f425133c, true);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onEndViewShow", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
            fd4.l lVar = l0Var.f228775v;
            if (lVar instanceof fd4.k) {
                ((fd4.k) lVar).t(l0Var.f228773t, false);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onEndViewShow", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
            com.tencent.mm.sdk.platformtools.u3.i(new dc4.j0(l0Var), l0Var.f228770q.endCoverViewInfo.f170336d);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkShowEndView", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew$4");
    }
}
