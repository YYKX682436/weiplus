package com.tencent.mm.plugin.sns.ui.widget;

/* loaded from: classes4.dex */
public class s0 implements m34.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.widget.SnsAdStreamVideoView f171264d;

    public s0(com.tencent.mm.plugin.sns.ui.widget.SnsAdStreamVideoView snsAdStreamVideoView) {
        this.f171264d = snsAdStreamVideoView;
    }

    @Override // m34.e
    public void a(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSeekTo", "com.tencent.mm.plugin.sns.ui.widget.SnsAdStreamVideoView$1");
        int i18 = com.tencent.mm.plugin.sns.ui.widget.SnsAdStreamVideoView.P1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.widget.SnsAdStreamVideoView");
        com.tencent.mm.plugin.sns.ui.widget.SnsAdStreamVideoView snsAdStreamVideoView = this.f171264d;
        boolean j07 = snsAdStreamVideoView.j0(i17, true);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.widget.SnsAdStreamVideoView");
        if (j07) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.widget.SnsAdStreamVideoView");
            snsAdStreamVideoView.U(false);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.widget.SnsAdStreamVideoView");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.widget.SnsAdStreamVideoView");
        com.tencent.mm.pluginsdk.ui.tools.VideoPlayerSeekBar videoPlayerSeekBar = snsAdStreamVideoView.f189746o;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.widget.SnsAdStreamVideoView");
        videoPlayerSeekBar.setIsPlay(true);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSeekTo", "com.tencent.mm.plugin.sns.ui.widget.SnsAdStreamVideoView$1");
    }

    @Override // m34.e
    public void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSeekPre", "com.tencent.mm.plugin.sns.ui.widget.SnsAdStreamVideoView$1");
        int i17 = com.tencent.mm.plugin.sns.ui.widget.SnsAdStreamVideoView.P1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.widget.SnsAdStreamVideoView");
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f171264d.O1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.widget.SnsAdStreamVideoView");
        b4Var.d();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSeekPre", "com.tencent.mm.plugin.sns.ui.widget.SnsAdStreamVideoView$1");
    }

    @Override // m34.e
    public void d(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSeeking", "com.tencent.mm.plugin.sns.ui.widget.SnsAdStreamVideoView$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSeeking", "com.tencent.mm.plugin.sns.ui.widget.SnsAdStreamVideoView$1");
    }
}
