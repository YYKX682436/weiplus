package com.tencent.mm.plugin.sns.ui.widget;

/* loaded from: classes4.dex */
public class t0 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.widget.SnsAdStreamVideoView f171272d;

    public t0(com.tencent.mm.plugin.sns.ui.widget.SnsAdStreamVideoView snsAdStreamVideoView) {
        this.f171272d = snsAdStreamVideoView;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onTimerExpired", "com.tencent.mm.plugin.sns.ui.widget.SnsAdStreamVideoView$2");
        this.f171272d.setIsShowBasicControls(false);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTimerExpired", "com.tencent.mm.plugin.sns.ui.widget.SnsAdStreamVideoView$2");
        return true;
    }
}
