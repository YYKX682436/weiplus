package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes3.dex */
public final class ps implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsTimelineImgBottomBar f170279d;

    public ps(com.tencent.mm.plugin.sns.ui.SnsTimelineImgBottomBar snsTimelineImgBottomBar) {
        this.f170279d = snsTimelineImgBottomBar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsTimelineImgBottomBar$1");
        com.tencent.mm.accessibility.core.area.ExpandTouchDelegate.Companion companion = com.tencent.mm.accessibility.core.area.ExpandTouchDelegate.INSTANCE;
        int i17 = com.tencent.mm.plugin.sns.ui.SnsTimelineImgBottomBar.f167465h;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getLivePhotoPlayTagView$p", "com.tencent.mm.plugin.sns.ui.SnsTimelineImgBottomBar");
        com.tencent.mm.plugin.sns.ui.SnsLivePlayButton snsLivePlayButton = this.f170279d.f167466e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getLivePhotoPlayTagView$p", "com.tencent.mm.plugin.sns.ui.SnsTimelineImgBottomBar");
        java.lang.Double valueOf = java.lang.Double.valueOf(1.5d);
        com.tencent.mm.accessibility.core.area.ExpandTouchDelegate.Companion.expand$default(companion, snsLivePlayButton, 0, com.tencent.mm.plugin.sns.ui.ts.a(valueOf), 0, com.tencent.mm.plugin.sns.ui.ts.a(valueOf), false, 32, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsTimelineImgBottomBar$1");
    }
}
