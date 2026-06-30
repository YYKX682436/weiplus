package xq2;

/* loaded from: classes2.dex */
public final class b extends pf5.o0 {

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f456037e = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final int f456038f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashMap f456039g;

    /* renamed from: h, reason: collision with root package name */
    public long f456040h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.HashMap f456041i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f456042m;

    public b() {
        int intValue = ((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.P1().r()).intValue();
        this.f456038f = intValue;
        this.f456039g = new java.util.HashMap();
        this.f456040h = intValue;
        this.f456041i = new java.util.HashMap();
        this.f456042m = new java.util.concurrent.ConcurrentHashMap();
    }

    public final xq2.a N6(java.lang.String themeId, java.lang.String themeTag) {
        kotlin.jvm.internal.o.g(themeId, "themeId");
        kotlin.jvm.internal.o.g(themeTag, "themeTag");
        java.lang.String str = themeId + '_' + themeTag;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f456037e;
        if (concurrentHashMap.get(str) == null) {
            concurrentHashMap.put(str, new xq2.a(themeId, themeTag));
        }
        java.lang.Object obj = concurrentHashMap.get(str);
        kotlin.jvm.internal.o.d(obj);
        return (xq2.a) obj;
    }

    public final long O6(java.lang.String themeId) {
        kotlin.jvm.internal.o.g(themeId, "themeId");
        long j17 = (((r45.wz2) this.f456041i.get(themeId)) != null ? r5.f389594f : 0) * 1000;
        if (j17 == 0) {
            j17 = this.f456038f;
        }
        return j17 < com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT ? com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT : j17;
    }

    public final boolean P6(java.lang.String themeId, java.lang.String themeTag) {
        kotlin.jvm.internal.o.g(themeId, "themeId");
        kotlin.jvm.internal.o.g(themeTag, "themeTag");
        return java.lang.System.currentTimeMillis() - N6(themeId, themeTag).f456035g > O6(themeId);
    }

    public final void Q6(java.lang.String themeId, java.lang.String themeTag, int i17, int i18, java.util.ArrayList lastDataList, com.tencent.mm.protobuf.g gVar, r45.yz2 yz2Var) {
        kotlin.jvm.internal.o.g(themeId, "themeId");
        kotlin.jvm.internal.o.g(themeTag, "themeTag");
        kotlin.jvm.internal.o.g(lastDataList, "lastDataList");
        xq2.a N6 = N6(themeId, themeTag);
        N6.f456033e = i17;
        N6.f456034f = i18;
        N6.f456031c = lastDataList;
        java.util.List list = N6.f456032d;
        kotlin.jvm.internal.o.g(list, "<set-?>");
        N6.f456032d = list;
        N6.f456035g = java.lang.System.currentTimeMillis();
        N6.f456036h = yz2Var;
        com.tencent.mars.xlog.Log.i("LiveThemePreloadCacheVM", "[store] themeId=" + themeId + " themeTag=" + themeTag + " lastExitPosition=" + i17 + " lastExitFromTopPx=" + i18 + " current=" + k35.m1.d(com.tencent.tav.coremedia.TimeUtil.YYYY2MM2DD_HH1MM1SS, N6.f456035g / 1000));
    }

    public final void R6(long j17) {
        com.tencent.mars.xlog.Log.i("LiveThemePreloadCacheVM", "storePrefetchInterval: globalPrefetchIntervalMap=" + j17);
        this.f456040h = j17;
    }
}
