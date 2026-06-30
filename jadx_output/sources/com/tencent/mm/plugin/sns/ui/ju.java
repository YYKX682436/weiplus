package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public final class ju implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsUploadV2SayFooter f169561d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f169562e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f169563f;

    public ju(com.tencent.mm.plugin.sns.ui.SnsUploadV2SayFooter snsUploadV2SayFooter, boolean z17, int i17) {
        this.f169561d = snsUploadV2SayFooter;
        this.f169562e = z17;
        this.f169563f = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsUploadV2SayFooter$refreshUIOnInputPanelChange$r$1");
        com.tencent.mm.plugin.sns.ui.SnsUploadV2SayFooter snsUploadV2SayFooter = this.f169561d;
        java.lang.Boolean a17 = snsUploadV2SayFooter.a();
        boolean z17 = this.f169562e;
        if (z17) {
            kotlin.jvm.internal.o.d(a17);
            if (a17.booleanValue()) {
                float f17 = this.f169563f;
                com.tencent.mm.plugin.sns.ui.SnsUploadV2SayFooter.i(snsUploadV2SayFooter);
                snsUploadV2SayFooter.setTranslationY(-f17);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setNeedTranslationY$p", "com.tencent.mm.plugin.sns.ui.SnsUploadV2SayFooter");
                snsUploadV2SayFooter.f167592v = true;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setNeedTranslationY$p", "com.tencent.mm.plugin.sns.ui.SnsUploadV2SayFooter");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsUploadV2SayFooter$refreshUIOnInputPanelChange$r$1");
            }
        }
        if (!z17) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getNeedTranslationY$p", "com.tencent.mm.plugin.sns.ui.SnsUploadV2SayFooter");
            boolean z18 = snsUploadV2SayFooter.f167592v;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getNeedTranslationY$p", "com.tencent.mm.plugin.sns.ui.SnsUploadV2SayFooter");
            if (z18) {
                com.tencent.mm.plugin.sns.ui.SnsUploadV2SayFooter.i(snsUploadV2SayFooter);
                snsUploadV2SayFooter.setTranslationY(0.0f);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setNeedTranslationY$p", "com.tencent.mm.plugin.sns.ui.SnsUploadV2SayFooter");
                snsUploadV2SayFooter.f167592v = false;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setNeedTranslationY$p", "com.tencent.mm.plugin.sns.ui.SnsUploadV2SayFooter");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsUploadV2SayFooter$refreshUIOnInputPanelChange$r$1");
            }
        }
        com.tencent.mm.plugin.sns.ui.SnsUploadV2SayFooter.i(snsUploadV2SayFooter);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsUploadV2SayFooter$refreshUIOnInputPanelChange$r$1");
    }
}
