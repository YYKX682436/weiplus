package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes3.dex */
public final class de implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsAlbumImgBottomBar f168181d;

    public de(com.tencent.mm.plugin.sns.ui.SnsAlbumImgBottomBar snsAlbumImgBottomBar) {
        this.f168181d = snsAlbumImgBottomBar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsAlbumImgBottomBar$1");
        com.tencent.mm.accessibility.core.area.ExpandTouchDelegate.Companion companion = com.tencent.mm.accessibility.core.area.ExpandTouchDelegate.INSTANCE;
        int i17 = com.tencent.mm.plugin.sns.ui.SnsAlbumImgBottomBar.f166794n;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getLivePhotoPlayTagView$p", "com.tencent.mm.plugin.sns.ui.SnsAlbumImgBottomBar");
        com.tencent.mm.plugin.sns.ui.SnsLivePlayButton snsLivePlayButton = this.f168181d.f166795e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getLivePhotoPlayTagView$p", "com.tencent.mm.plugin.sns.ui.SnsAlbumImgBottomBar");
        java.lang.Double valueOf = java.lang.Double.valueOf(1.5d);
        com.tencent.mm.accessibility.core.area.ExpandTouchDelegate.Companion.expand$default(companion, snsLivePlayButton, 0, com.tencent.mm.plugin.sns.ui.ts.a(valueOf), 0, com.tencent.mm.plugin.sns.ui.ts.a(valueOf), false, 32, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsAlbumImgBottomBar$1");
    }
}
