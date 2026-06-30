package com.tencent.mm.plugin.sns.storage;

/* loaded from: classes4.dex */
public final class d0 {

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.mm.plugin.sns.storage.c0 f165962b = new com.tencent.mm.plugin.sns.storage.c0(null);

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.storage.a1 f165963a;

    @za4.k1
    private final com.tencent.mm.plugin.sns.storage.b0 clickInfo;

    @za4.l1
    private final java.util.List<com.tencent.mm.plugin.sns.storage.b0> clickInfoList;

    public d0(java.lang.String mediaType, com.tencent.mm.plugin.sns.storage.a1 alphaVideoInfo, com.tencent.mm.plugin.sns.storage.b0 b0Var, java.util.List clickInfoList) {
        kotlin.jvm.internal.o.g(mediaType, "mediaType");
        kotlin.jvm.internal.o.g(alphaVideoInfo, "alphaVideoInfo");
        kotlin.jvm.internal.o.g(clickInfoList, "clickInfoList");
        this.f165963a = alphaVideoInfo;
        this.clickInfo = b0Var;
        this.clickInfoList = clickInfoList;
    }

    public final com.tencent.mm.plugin.sns.storage.a1 a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAlphaVideoInfo", "com.tencent.mm.plugin.sns.storage.AdBreakFrameInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAlphaVideoInfo", "com.tencent.mm.plugin.sns.storage.AdBreakFrameInfo");
        return this.f165963a;
    }

    public final com.tencent.mm.plugin.sns.storage.b0 b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getClickInfo", "com.tencent.mm.plugin.sns.storage.AdBreakFrameInfo");
        com.tencent.mm.plugin.sns.storage.b0 b0Var = this.clickInfo;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getClickInfo", "com.tencent.mm.plugin.sns.storage.AdBreakFrameInfo");
        return b0Var;
    }

    public final java.util.List c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getClickInfoList", "com.tencent.mm.plugin.sns.storage.AdBreakFrameInfo");
        java.util.List<com.tencent.mm.plugin.sns.storage.b0> list = this.clickInfoList;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getClickInfoList", "com.tencent.mm.plugin.sns.storage.AdBreakFrameInfo");
        return list;
    }
}
