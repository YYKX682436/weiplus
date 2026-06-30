package com.tencent.mm.plugin.sns.storage;

/* loaded from: classes4.dex */
public final class o1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f166082a;

    /* renamed from: b, reason: collision with root package name */
    public final float f166083b;

    /* renamed from: c, reason: collision with root package name */
    public final float f166084c;

    /* renamed from: d, reason: collision with root package name */
    public final float f166085d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.storage.s1 f166086e;

    public o1(int i17, float f17, float f18, float f19, com.tencent.mm.plugin.sns.storage.s1 s1Var) {
        this.f166082a = i17;
        this.f166083b = f17;
        this.f166084c = f18;
        this.f166085d = f19;
        this.f166086e = s1Var;
    }

    public final float a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLoopStartTime", "com.tencent.mm.plugin.sns.storage.PlayModeInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLoopStartTime", "com.tencent.mm.plugin.sns.storage.PlayModeInfo");
        return this.f166084c;
    }

    public final com.tencent.mm.plugin.sns.storage.s1 b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPlayStateInfo", "com.tencent.mm.plugin.sns.storage.PlayModeInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPlayStateInfo", "com.tencent.mm.plugin.sns.storage.PlayModeInfo");
        return this.f166086e;
    }
}
