package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes10.dex */
public final class za0 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.bb0 f115319d;

    public za0(com.tencent.mm.plugin.finder.live.plugin.bb0 bb0Var) {
        this.f115319d = bb0Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public final boolean onTimerExpired() {
        com.tencent.mm.plugin.finder.live.plugin.bb0 bb0Var = this.f115319d;
        int i17 = bb0Var.f111999r;
        bb0Var.getClass();
        if (i17 <= 0) {
            bb0Var.getClass();
            pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.ya0(bb0Var));
            return false;
        }
        bb0Var.f111999r--;
        bb0Var.getClass();
        pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.ab0(bb0Var));
        return true;
    }
}
