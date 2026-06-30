package s74;

/* loaded from: classes4.dex */
public final class j implements w64.w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s74.o0 f404359a;

    public j(s74.o0 o0Var) {
        this.f404359a = o0Var;
    }

    @Override // w64.w
    public void a(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("seek", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$bindComponentModel$6$animInfo$1$seekable$1");
        s74.o0 o0Var = this.f404359a;
        if (o0Var.C().b().getChildCount() > 0) {
            android.view.View childAt = o0Var.C().b().getChildAt(0);
            if (childAt instanceof com.tencent.mm.plugin.sns.ui.OnlineVideoView) {
                ((com.tencent.mm.plugin.sns.ui.OnlineVideoView) childAt).M(0, false);
                s74.o2 o2Var = (s74.o2) o0Var;
                o2Var.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onVideoSeekToBegin", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent");
                com.tencent.mars.xlog.Log.i("DynamicComponent", "the onVideoSeekToBegin is called, hasProcessOnVideoEnd is " + o2Var.M);
                o2Var.Z();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onVideoSeekToBegin", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("seek", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$bindComponentModel$6$animInfo$1$seekable$1");
    }
}
