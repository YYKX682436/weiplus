package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class on implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity f170114d;

    public on(com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity snsOnlineVideoActivity) {
        this.f170114d = snsOnlineVideoActivity;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$15");
        com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity snsOnlineVideoActivity = this.f170114d;
        com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity.Z6(snsOnlineVideoActivity).getViewTreeObserver().removeOnPreDrawListener(this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$3200", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        com.tencent.mm.ui.tools.s4 s4Var = snsOnlineVideoActivity.f167331x;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$3200", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        if (s4Var != null) {
            com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity.T6(snsOnlineVideoActivity).setThumbViewScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$3200", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
            com.tencent.mm.ui.tools.s4 s4Var2 = snsOnlineVideoActivity.f167331x;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$3200", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
            android.widget.FrameLayout Z6 = com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity.Z6(snsOnlineVideoActivity);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1500", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
            android.widget.ImageView imageView = snsOnlineVideoActivity.f167324q;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1500", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
            s4Var2.c(Z6, imageView, new com.tencent.mm.plugin.sns.ui.nn(this));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$15");
        return true;
    }
}
