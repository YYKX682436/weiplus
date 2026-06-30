package he4;

/* loaded from: classes4.dex */
public final class e extends he4.c {
    @Override // he4.c
    public java.lang.Object a(com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoItem snsPublishLivePhotoItem, kotlin.coroutines.Continuation continuation) {
        fe4.d dVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doWorkImpl", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.chain.SnsPublishLivePhotoAnalyzeChain");
        e("analyzeChain doWork start >> threadName: " + java.lang.Thread.currentThread().getName());
        boolean m17 = snsPublishLivePhotoItem.m();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doWorkImpl >> mediaId: ");
        sb6.append(snsPublishLivePhotoItem.g());
        sb6.append(" parseFinish: ");
        sb6.append(m17);
        sb6.append(" parsePath: ");
        java.lang.String i17 = snsPublishLivePhotoItem.i();
        kotlin.jvm.internal.o.d(i17);
        sb6.append(i17);
        e(sb6.toString());
        if (m17) {
            e("analyzeChain doWork finish");
            java.lang.String h17 = snsPublishLivePhotoItem.h();
            kotlin.jvm.internal.o.d(h17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("makeOkResult", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoDealResult$Companion");
            fe4.d dVar2 = new fe4.d(h17, 0, "is parsed finish");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("makeOkResult", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoDealResult$Companion");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doWorkImpl", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.chain.SnsPublishLivePhotoAnalyzeChain");
            return dVar2;
        }
        i95.m c17 = i95.n0.c(qk.r7.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        long g17 = snsPublishLivePhotoItem.g();
        java.lang.String i18 = snsPublishLivePhotoItem.i();
        kotlin.jvm.internal.o.d(i18);
        java.lang.String b17 = snsPublishLivePhotoItem.b();
        kotlin.jvm.internal.o.d(b17);
        aq.u0 ui6 = qk.r7.ui((qk.r7) c17, g17, i18, b17, 0L, 8, null);
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("parse result >> rsp: ");
        aq.s0 s0Var = ui6.f12975a;
        sb7.append(s0Var.f12960a);
        sb7.append(" errCode: ");
        sb7.append(s0Var.f12961b);
        e(sb7.toString());
        if (s0Var.f12960a) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setParseState", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoItem");
            snsPublishLivePhotoItem.f171217q = 1;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setParseState", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoItem");
            long j17 = ui6.f12980f;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setDurationMs", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoItem");
            snsPublishLivePhotoItem.f171213m = j17;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setDurationMs", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoItem");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setCoverTimeStampMs", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoItem");
            snsPublishLivePhotoItem.f171212i = ui6.f12981g;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCoverTimeStampMs", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoItem");
            java.lang.String h18 = snsPublishLivePhotoItem.h();
            kotlin.jvm.internal.o.d(h18);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("makeOkResult$default", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoDealResult$Companion");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("makeOkResult", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoDealResult$Companion");
            dVar = new fe4.d(h18, 0, "");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("makeOkResult", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoDealResult$Companion");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("makeOkResult$default", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoDealResult$Companion");
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setParseState", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoItem");
            snsPublishLivePhotoItem.f171217q = 2;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setParseState", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoItem");
            java.lang.String h19 = snsPublishLivePhotoItem.h();
            kotlin.jvm.internal.o.d(h19);
            dVar = new fe4.d(h19, 2, s0Var.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doWorkImpl", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.chain.SnsPublishLivePhotoAnalyzeChain");
        return dVar;
    }

    @Override // he4.c
    public java.lang.String b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTag", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.chain.SnsPublishLivePhotoAnalyzeChain");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTag", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.chain.SnsPublishLivePhotoAnalyzeChain");
        return "SnsLivePhotoChain.AnalyzeChain";
    }

    @Override // he4.c
    public long c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTimeoutMs", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.chain.SnsPublishLivePhotoAnalyzeChain");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTimeoutMs", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.chain.SnsPublishLivePhotoAnalyzeChain");
        return 5000L;
    }
}
