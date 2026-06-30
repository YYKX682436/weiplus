package com.tencent.mm.plugin.game.luggage;

@j95.b
/* loaded from: classes8.dex */
public class g1 extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.network.s0 f139556d = new com.tencent.mm.plugin.game.luggage.f1(this);

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        super.onAccountInitialized(context);
        gm0.j1.n().a(this.f139556d);
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        super.onAccountReleased(context);
        gm0.j1.n().d(this.f139556d);
    }
}
