package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class a9 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.b9 f111837d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a9(com.tencent.mm.plugin.finder.live.plugin.b9 b9Var) {
        super(0);
        this.f111837d = b9Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return new com.tencent.mm.sdk.platformtools.b4("LiveAnchorPauseRecovery::Timer", (com.tencent.mm.sdk.platformtools.a4) new com.tencent.mm.plugin.finder.live.plugin.z8(this.f111837d), true);
    }
}
