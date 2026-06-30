package e54;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final e54.f f249653a = new e54.f();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f249654b = new java.util.concurrent.ConcurrentHashMap();

    public final java.lang.String a(e54.g gVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("makeCoverUrlKey", "com.tencent.mm.plugin.sns.ad.landingpage.component.handler.RedPacketCoverUrlHandler");
        gVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getReceiveUri", "com.tencent.mm.plugin.sns.ad.landingpage.component.handler.RedPacketCoverUrlRequestParam");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getReceiveUri", "com.tencent.mm.plugin.sns.ad.landingpage.component.handler.RedPacketCoverUrlRequestParam");
        java.lang.String str = gVar.f249655a;
        if (str.length() == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("makeCoverUrlKey", "com.tencent.mm.plugin.sns.ad.landingpage.component.handler.RedPacketCoverUrlHandler");
            return "";
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getReqScene", "com.tencent.mm.plugin.sns.ad.landingpage.component.handler.RedPacketCoverUrlRequestParam");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getReqScene", "com.tencent.mm.plugin.sns.ad.landingpage.component.handler.RedPacketCoverUrlRequestParam");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTwistCardId", "com.tencent.mm.plugin.sns.ad.landingpage.component.handler.RedPacketCoverUrlRequestParam");
        long j17 = gVar.f249658d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTwistCardId", "com.tencent.mm.plugin.sns.ad.landingpage.component.handler.RedPacketCoverUrlRequestParam");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getUxInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.handler.RedPacketCoverUrlRequestParam");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUxInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.handler.RedPacketCoverUrlRequestParam");
        java.lang.String a17 = com.tencent.mm.sdk.platformtools.w2.a(str + gVar.f249656b + j17 + gVar.f249657c);
        kotlin.jvm.internal.o.f(a17, "getMD5String(...)");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("makeCoverUrlKey", "com.tencent.mm.plugin.sns.ad.landingpage.component.handler.RedPacketCoverUrlHandler");
        return a17;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(e54.g r17, kotlin.coroutines.Continuation r18) {
        /*
            Method dump skipped, instructions count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e54.f.b(e54.g, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
