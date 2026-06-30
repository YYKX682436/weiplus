package com.tencent.mm.plugin.sns.storage;

/* loaded from: classes4.dex */
public final class r1 {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.sns.storage.q1 f166117d = new com.tencent.mm.plugin.sns.storage.q1(null);

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f166118a;

    /* renamed from: b, reason: collision with root package name */
    public final float f166119b;

    /* renamed from: c, reason: collision with root package name */
    public final float f166120c;

    public r1(java.util.List tagInfoList, float f17, float f18) {
        kotlin.jvm.internal.o.g(tagInfoList, "tagInfoList");
        this.f166118a = tagInfoList;
        this.f166119b = f17;
        this.f166120c = f18;
    }

    public final java.util.List a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTagInfoList", "com.tencent.mm.plugin.sns.storage.PlayState");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTagInfoList", "com.tencent.mm.plugin.sns.storage.PlayState");
        return this.f166118a;
    }
}
