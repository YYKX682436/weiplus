package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class uo implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ap f114606d;

    public uo(com.tencent.mm.plugin.finder.live.plugin.ap apVar) {
        this.f114606d = apVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.to(this.f114606d));
        return false;
    }
}
