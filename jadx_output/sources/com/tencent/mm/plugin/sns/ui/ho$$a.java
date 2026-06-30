package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public final /* synthetic */ class ho$$a implements com.tencent.mm.ui.widget.dialog.b1 {
    @Override // com.tencent.mm.ui.widget.dialog.b1
    public final void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lambda$selectImageOrVideo$0", "com.tencent.mm.plugin.sns.ui.SnsProfilePublishManager");
        com.tencent.mars.xlog.Log.i("SnsProfilePublishSheet", "BottomSheet click cancel");
        xa4.b.f452821a.a(false, 0, 2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lambda$selectImageOrVideo$0", "com.tencent.mm.plugin.sns.ui.SnsProfilePublishManager");
    }
}
