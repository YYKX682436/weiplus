package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class r8 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.t8 f114110d;

    public r8(com.tencent.mm.plugin.finder.live.plugin.t8 t8Var) {
        this.f114110d = t8Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public final boolean onTimerExpired() {
        pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.q8(this.f114110d));
        return true;
    }
}
