package ed4;

/* loaded from: classes4.dex */
public class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.n f251315d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew f251316e;

    public n(com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew fullCardAdTimeLineItemNew, com.tencent.mm.plugin.sns.storage.n nVar) {
        this.f251316e = fullCardAdTimeLineItemNew;
        this.f251315d = nVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew$7");
        com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew fullCardAdTimeLineItemNew = this.f251316e;
        com.tencent.mm.plugin.sns.storage.n nVar = this.f251315d;
        fullCardAdTimeLineItemNew.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkShowEndView", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
        try {
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FullCardAdTimeLineItemNew", "handleVideoCompletion, exp" + e17.toString());
        }
        if (fullCardAdTimeLineItemNew.f169311r.D0.f425155p == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FullCardAdTimeLineItemNew", "checkShowEndView, videoEndView==null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkShowEndView", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew$7");
        }
        if (nVar == null || nVar.endCoverViewInfo == null || !fullCardAdTimeLineItemNew.f169312s) {
            fullCardAdTimeLineItemNew.f169311r.D0.f425155p.c(false);
        } else {
            u74.d dVar = fullCardAdTimeLineItemNew.f169311r.D0;
            if (dVar.T.f425133c) {
                dVar.f425155p.setBlurBkg(dVar.f425162w.getInnerVideoView());
            } else {
                dVar.f425155p.setBlurBkg(dVar.f425154o.f168417g.getInnerVideoView());
            }
            fullCardAdTimeLineItemNew.f169311r.D0.f425155p.d();
            fullCardAdTimeLineItemNew.f169311r.D0.f425155p.f(true);
            fullCardAdTimeLineItemNew.f169313t = true;
            com.tencent.mm.plugin.sns.ui.item.y yVar = fullCardAdTimeLineItemNew.f169311r;
            u74.d dVar2 = yVar.D0;
            if (!dVar2.T.f425133c) {
                yVar.f169269f0.f168417g.k(0, false);
            } else if (dVar2.f425162w.getInnerVideoView() instanceof com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerVideoView) {
                fullCardAdTimeLineItemNew.f169311r.D0.f425162w.M(0, false);
                fullCardAdTimeLineItemNew.f169311r.D0.f425162w.F();
            }
            fullCardAdTimeLineItemNew.f169316w.h(fullCardAdTimeLineItemNew.f169311r.D0.T.f425133c, true);
            fullCardAdTimeLineItemNew.G();
            fullCardAdTimeLineItemNew.f169310q.postDelayed(new ed4.m(fullCardAdTimeLineItemNew), nVar.endCoverViewInfo.f170336d);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkShowEndView", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew$7");
    }
}
