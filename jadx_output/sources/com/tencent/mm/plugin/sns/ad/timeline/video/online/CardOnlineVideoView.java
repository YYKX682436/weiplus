package com.tencent.mm.plugin.sns.ad.timeline.video.online;

/* loaded from: classes4.dex */
public class CardOnlineVideoView extends com.tencent.mm.plugin.sns.ui.OnlineVideoView {

    /* renamed from: k2, reason: collision with root package name */
    public java.lang.String f163250k2;

    /* renamed from: l2, reason: collision with root package name */
    public volatile int f163251l2;

    /* renamed from: m2, reason: collision with root package name */
    public android.view.View f163252m2;

    public CardOnlineVideoView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f163251l2 = 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.timeline.video.online.CardOnlineVideoView");
        this.f163252m2 = findViewById(com.tencent.mm.R.id.f487567p13);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.timeline.video.online.CardOnlineVideoView");
    }

    @Override // com.tencent.mm.plugin.sns.ui.OnlineVideoView
    public void B() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ad.timeline.video.online.CardOnlineVideoView");
        hashCode();
        super.B();
        this.f163251l2 = 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ad.timeline.video.online.CardOnlineVideoView");
    }

    @Override // com.tencent.mm.plugin.sns.ui.OnlineVideoView
    public void C() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ad.timeline.video.online.CardOnlineVideoView");
        this.f163251l2 = 1;
        b0();
        super.C();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ad.timeline.video.online.CardOnlineVideoView");
    }

    @Override // com.tencent.mm.plugin.sns.ui.OnlineVideoView
    public void K() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resumePlay", "com.tencent.mm.plugin.sns.ad.timeline.video.online.CardOnlineVideoView");
        this.f163251l2 = 1;
        super.K();
        b0();
        U(true);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resumePlay", "com.tencent.mm.plugin.sns.ad.timeline.video.online.CardOnlineVideoView");
    }

    public void b0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hidePlayBtn", "com.tencent.mm.plugin.sns.ad.timeline.video.online.CardOnlineVideoView");
        android.view.View view = this.f163252m2;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/video/online/CardOnlineVideoView", "hidePlayBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/ad/timeline/video/online/CardOnlineVideoView", "hidePlayBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hidePlayBtn", "com.tencent.mm.plugin.sns.ad.timeline.video.online.CardOnlineVideoView");
    }

    public java.lang.String getMediaId() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMediaId", "com.tencent.mm.plugin.sns.ad.timeline.video.online.CardOnlineVideoView");
        java.lang.String str = this.f163250k2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMediaId", "com.tencent.mm.plugin.sns.ad.timeline.video.online.CardOnlineVideoView");
        return str;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAttachedToWindow", "com.tencent.mm.plugin.sns.ad.timeline.video.online.CardOnlineVideoView");
        super.onAttachedToWindow();
        hashCode();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAttachedToWindow", "com.tencent.mm.plugin.sns.ad.timeline.video.online.CardOnlineVideoView");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.timeline.video.online.CardOnlineVideoView");
        super.onDetachedFromWindow();
        hashCode();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("asyncStop", "com.tencent.mm.plugin.sns.ad.timeline.video.online.CardOnlineVideoView");
        hashCode();
        this.f163250k2 = "";
        if (this.f163251l2 == 2 || this.f163251l2 == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("asyncStop", "com.tencent.mm.plugin.sns.ad.timeline.video.online.CardOnlineVideoView");
        } else {
            fk4.u uVar = this.f166463y1;
            if (uVar != null) {
                ((fk4.k) uVar).p();
                this.f166463y1 = null;
            }
            if (this.G != null) {
                this.G.p();
                this.G.d();
                this.G = null;
            }
            t();
            this.f163251l2 = 2;
            ((ku5.t0) ku5.t0.f312615d).g(new z74.d(this));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("asyncStop", "com.tencent.mm.plugin.sns.ad.timeline.video.online.CardOnlineVideoView");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.timeline.video.online.CardOnlineVideoView");
    }

    public void setMediaId(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMediaId", "com.tencent.mm.plugin.sns.ad.timeline.video.online.CardOnlineVideoView");
        this.f163250k2 = str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMediaId", "com.tencent.mm.plugin.sns.ad.timeline.video.online.CardOnlineVideoView");
    }

    public CardOnlineVideoView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f163251l2 = 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.timeline.video.online.CardOnlineVideoView");
        this.f163252m2 = findViewById(com.tencent.mm.R.id.f487567p13);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.timeline.video.online.CardOnlineVideoView");
    }
}
