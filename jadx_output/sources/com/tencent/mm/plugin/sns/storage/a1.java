package com.tencent.mm.plugin.sns.storage;

/* loaded from: classes4.dex */
public final class a1 {

    /* renamed from: a, reason: collision with root package name */
    public final r45.jj4 f165915a;

    /* renamed from: b, reason: collision with root package name */
    public final r45.jj4 f165916b;

    /* renamed from: c, reason: collision with root package name */
    public final r45.jj4 f165917c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.storage.o1 f165918d;

    /* renamed from: e, reason: collision with root package name */
    public final int f165919e;

    public a1(r45.jj4 jj4Var, r45.jj4 jj4Var2, r45.jj4 jj4Var3, com.tencent.mm.plugin.sns.storage.o1 playModeInfo, int i17) {
        kotlin.jvm.internal.o.g(playModeInfo, "playModeInfo");
        this.f165915a = jj4Var;
        this.f165916b = jj4Var2;
        this.f165917c = jj4Var3;
        this.f165918d = playModeInfo;
        this.f165919e = i17;
    }

    public final r45.jj4 a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getOneToOneHighMedia", "com.tencent.mm.plugin.sns.storage.AlphaVideoInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getOneToOneHighMedia", "com.tencent.mm.plugin.sns.storage.AlphaVideoInfo");
        return this.f165916b;
    }

    public final com.tencent.mm.plugin.sns.storage.o1 b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPlayModeInfo", "com.tencent.mm.plugin.sns.storage.AlphaVideoInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPlayModeInfo", "com.tencent.mm.plugin.sns.storage.AlphaVideoInfo");
        return this.f165918d;
    }

    public final int c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getVideoCompositeType", "com.tencent.mm.plugin.sns.storage.AlphaVideoInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getVideoCompositeType", "com.tencent.mm.plugin.sns.storage.AlphaVideoInfo");
        return this.f165919e;
    }
}
