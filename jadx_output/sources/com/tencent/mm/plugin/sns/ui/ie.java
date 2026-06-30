package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class ie extends com.tencent.mm.network.r0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI f168608d;

    public ie(com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI snsBaseGalleryUI) {
        this.f168608d = snsBaseGalleryUI;
    }

    @Override // com.tencent.mm.network.s0
    public void onNetworkChange(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onNetworkChange", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$14");
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.sns.ui.he(this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onNetworkChange", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$14");
    }
}
