package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class cy implements ff0.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.fy f168148a;

    public cy(com.tencent.mm.plugin.sns.ui.fy fyVar) {
        this.f168148a = fyVar;
    }

    @Override // ff0.v
    public void a(java.lang.String str, android.view.View view, android.graphics.Bitmap bitmap, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onImageLoadComplete", "com.tencent.mm.plugin.sns.ui.TingMusicWidget$1");
        if (z17 && bitmap != null && !bitmap.isRecycled()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.TingMusicWidget");
            com.tencent.mm.plugin.sns.ui.fy fyVar = this.f168148a;
            fyVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateCoverAndBg", "com.tencent.mm.plugin.sns.ui.TingMusicWidget");
            if (fyVar.f168390y) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateCoverAndBg", "com.tencent.mm.plugin.sns.ui.TingMusicWidget");
            } else {
                fyVar.f168374i.f392353h = new com.tencent.mm.protobuf.g(com.tencent.mm.sdk.platformtools.x.a(bitmap));
                fyVar.q();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateCoverAndBg", "com.tencent.mm.plugin.sns.ui.TingMusicWidget");
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.TingMusicWidget");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onImageLoadComplete", "com.tencent.mm.plugin.sns.ui.TingMusicWidget$1");
    }
}
