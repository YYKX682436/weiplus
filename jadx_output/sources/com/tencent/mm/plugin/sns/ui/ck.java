package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class ck implements y51.d {
    public ck(com.tencent.mm.plugin.sns.ui.bk bkVar) {
    }

    @Override // y51.d
    public void a(long j17, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onParseVideoError", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter$1");
        com.tencent.mars.xlog.Log.e("MicroMsg.SnsGalleryAdapter", "onParseVideoError >> mediaId: %d, errCode: %d", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onParseVideoError", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter$1");
    }

    @Override // y51.d
    public void b(long j17, aq.u0 u0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onParseVideoSuccess", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter$1");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsGalleryAdapter", "onParseVideoSuccess >> mediaId: %d", java.lang.Long.valueOf(j17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onParseVideoSuccess", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter$1");
    }
}
