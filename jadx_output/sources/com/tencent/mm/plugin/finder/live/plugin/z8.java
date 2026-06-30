package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class z8 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.b9 f115307d;

    public z8(com.tencent.mm.plugin.finder.live.plugin.b9 b9Var) {
        this.f115307d = b9Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public final boolean onTimerExpired() {
        pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.y8(this.f115307d));
        return true;
    }
}
