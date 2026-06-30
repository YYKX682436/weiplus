package he4;

/* loaded from: classes4.dex */
public final class f extends he4.c {
    @Override // he4.c
    public java.lang.Object a(com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoItem snsPublishLivePhotoItem, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doWorkImpl", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.chain.SnsPublishLivePhotoCheckChain");
        e("CheckChain doWork start >> threadName: " + java.lang.Thread.currentThread().getName());
        e("doWorkImpl >> mediaId: " + snsPublishLivePhotoItem.g() + " parseFinish: " + snsPublishLivePhotoItem.m() + " duration: " + snsPublishLivePhotoItem.f() + " path: " + snsPublishLivePhotoItem.i());
        com.tencent.mm.plugin.sight.base.b d17 = com.tencent.mm.plugin.sight.base.e.d(snsPublishLivePhotoItem.i(), true);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doWorkImpl >> mediaInfo: ");
        sb6.append(d17);
        e(sb6.toString());
        ((hs.v) ((qk.r7) i95.n0.c(qk.r7.class))).getClass();
        long c17 = qp.b.f365674a.c();
        int i17 = d17.f162382a;
        if (i17 != 0 && i17 <= c17) {
            java.lang.String h17 = snsPublishLivePhotoItem.h();
            kotlin.jvm.internal.o.d(h17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("makeOkResult", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoDealResult$Companion");
            fe4.d dVar = new fe4.d(h17, 0, "is check finish");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("makeOkResult", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoDealResult$Companion");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doWorkImpl", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.chain.SnsPublishLivePhotoCheckChain");
            return dVar;
        }
        d("duration is invalid");
        int i18 = d17.f162382a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportDurationTimeout", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.chain.SnsPublishLivePhotoCheckChain");
        try {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("live_clk_scene", 4);
            hashMap.put("live_duration_ms", java.lang.Integer.valueOf(i18));
            java.lang.String l17 = ca4.z0.l();
            kotlin.jvm.internal.o.f(l17, "checkSnsPostSessionId(...)");
            hashMap.put("sns_publish_sessionid", l17);
            hashMap.put("live_abnormal_type", 3);
            java.lang.String e17 = kk.k.e(snsPublishLivePhotoItem.b());
            if (e17 == null) {
                e17 = "";
            }
            hashMap.put("pic_md5", e17);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("sns_live_abnormal", null, hashMap, 36244);
            e("reportDurationTimeout success: actual=" + i18 + ", max=" + c17 + ", md5=" + hashMap.get("pic_md5"));
        } catch (java.lang.Exception e18) {
            d("reportDurationTimeout error: " + e18.getMessage());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportDurationTimeout", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.chain.SnsPublishLivePhotoCheckChain");
        java.lang.String h18 = snsPublishLivePhotoItem.h();
        kotlin.jvm.internal.o.d(h18);
        fe4.d dVar2 = new fe4.d(h18, 1, "duration error :" + snsPublishLivePhotoItem.f());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doWorkImpl", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.chain.SnsPublishLivePhotoCheckChain");
        return dVar2;
    }

    @Override // he4.c
    public java.lang.String b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTag", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.chain.SnsPublishLivePhotoCheckChain");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTag", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.chain.SnsPublishLivePhotoCheckChain");
        return "SnsLivePhotoChain.CheckChain";
    }

    @Override // he4.c
    public long c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTimeoutMs", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.chain.SnsPublishLivePhotoCheckChain");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTimeoutMs", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.chain.SnsPublishLivePhotoCheckChain");
        return 1000L;
    }
}
