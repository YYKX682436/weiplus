package he4;

/* loaded from: classes4.dex */
public final class h extends he4.c {
    /* JADX WARN: Removed duplicated region for block: B:12:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @Override // he4.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoItem r11, kotlin.coroutines.Continuation r12) {
        /*
            Method dump skipped, instructions count: 423
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: he4.h.a(com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoItem, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // he4.c
    public java.lang.String b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTag", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.chain.SnsPublishLivePhotoRemuxChain");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTag", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.chain.SnsPublishLivePhotoRemuxChain");
        return "SnsLivePhotoChain.RemuxChain";
    }

    @Override // he4.c
    public long c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTimeoutMs", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.chain.SnsPublishLivePhotoRemuxChain");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTimeoutMs", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.chain.SnsPublishLivePhotoRemuxChain");
        return 30000L;
    }

    public final void i(com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoItem snsPublishLivePhotoItem, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportLivePhotoAbnormal", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.chain.SnsPublishLivePhotoRemuxChain");
        try {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("live_clk_scene", 4);
            hashMap.put("live_duration_ms", java.lang.Long.valueOf(snsPublishLivePhotoItem.f()));
            java.lang.String l17 = ca4.z0.l();
            kotlin.jvm.internal.o.f(l17, "checkSnsPostSessionId(...)");
            hashMap.put("sns_publish_sessionid", l17);
            hashMap.put("live_abnormal_type", java.lang.Integer.valueOf(i17));
            java.lang.String e17 = kk.k.e(snsPublishLivePhotoItem.b());
            if (e17 == null) {
                e17 = "";
            }
            hashMap.put("pic_md5", e17);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("sns_live_abnormal", null, hashMap, 36244);
            e("reportLivePhotoAbnormal success: abnormalType=" + i17 + ", md5=" + hashMap.get("pic_md5"));
        } catch (java.lang.Exception e18) {
            d("reportLivePhotoAbnormal error: " + e18.getMessage());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportLivePhotoAbnormal", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.chain.SnsPublishLivePhotoRemuxChain");
    }
}
