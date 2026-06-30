package com.tencent.mm.plugin.sns.storage;

/* loaded from: classes4.dex */
public final class y2 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f166178a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f166179b;

    /* renamed from: c, reason: collision with root package name */
    public final float f166180c;

    public y2(java.lang.String str, java.lang.String str2, float f17) {
        this.f166178a = str;
        this.f166179b = str2;
        this.f166180c = f17;
    }

    public final java.lang.String a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTagIcon", "com.tencent.mm.plugin.sns.storage.TagInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTagIcon", "com.tencent.mm.plugin.sns.storage.TagInfo");
        return this.f166178a;
    }

    public final java.lang.String b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTagText", "com.tencent.mm.plugin.sns.storage.TagInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTagText", "com.tencent.mm.plugin.sns.storage.TagInfo");
        return this.f166179b;
    }
}
