package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class s8 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.t8 f114229d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s8(com.tencent.mm.plugin.finder.live.plugin.t8 t8Var) {
        super(0);
        this.f114229d = t8Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return new com.tencent.mm.sdk.platformtools.b4("LiveAnchorPause::Timer", (com.tencent.mm.sdk.platformtools.a4) new com.tencent.mm.plugin.finder.live.plugin.r8(this.f114229d), true);
    }
}
