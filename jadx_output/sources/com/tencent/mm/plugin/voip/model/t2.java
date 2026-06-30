package com.tencent.mm.plugin.voip.model;

/* loaded from: classes14.dex */
public class t2 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voip.model.d3 f176803d;

    public t2(com.tencent.mm.plugin.voip.model.d3 d3Var) {
        this.f176803d = d3Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mm.plugin.voip.model.d3 d3Var = this.f176803d;
        com.tencent.mm.plugin.voip.model.g1 g1Var = d3Var.f176411a;
        com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar = g1Var.f176532x;
        if (v2protocalVar.f176874p == 0 && g1Var.f176515g && !g1Var.f176516h && v2protocalVar.f176885s1) {
            v2protocalVar.M1.f176713a = 12;
            g1Var.v(1, -9004, "", -1);
        }
        d3Var.f176436z.d();
        return false;
    }
}
