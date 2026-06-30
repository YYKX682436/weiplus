package com.tencent.mm.plugin.sns.storage;

/* loaded from: classes4.dex */
public final class s1 {

    /* renamed from: a, reason: collision with root package name */
    public final float f166127a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.storage.r1 f166128b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.storage.r1 f166129c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.storage.r1 f166130d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.storage.r1 f166131e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.storage.r1 f166132f;

    public s1(float f17, com.tencent.mm.plugin.sns.storage.r1 breakState, com.tencent.mm.plugin.sns.storage.r1 stopState, com.tencent.mm.plugin.sns.storage.r1 likeState, com.tencent.mm.plugin.sns.storage.r1 commentState, com.tencent.mm.plugin.sns.storage.r1 r1Var) {
        kotlin.jvm.internal.o.g(breakState, "breakState");
        kotlin.jvm.internal.o.g(stopState, "stopState");
        kotlin.jvm.internal.o.g(likeState, "likeState");
        kotlin.jvm.internal.o.g(commentState, "commentState");
        this.f166127a = f17;
        this.f166128b = breakState;
        this.f166129c = stopState;
        this.f166130d = likeState;
        this.f166131e = commentState;
        this.f166132f = r1Var;
    }

    public final com.tencent.mm.plugin.sns.storage.r1 a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBreakState", "com.tencent.mm.plugin.sns.storage.PlayStateInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBreakState", "com.tencent.mm.plugin.sns.storage.PlayStateInfo");
        return this.f166128b;
    }

    public final com.tencent.mm.plugin.sns.storage.r1 b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCancelLikeState", "com.tencent.mm.plugin.sns.storage.PlayStateInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCancelLikeState", "com.tencent.mm.plugin.sns.storage.PlayStateInfo");
        return this.f166132f;
    }

    public final com.tencent.mm.plugin.sns.storage.r1 c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getStopState", "com.tencent.mm.plugin.sns.storage.PlayStateInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getStopState", "com.tencent.mm.plugin.sns.storage.PlayStateInfo");
        return this.f166129c;
    }
}
