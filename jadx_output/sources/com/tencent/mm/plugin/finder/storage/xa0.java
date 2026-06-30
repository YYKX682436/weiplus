package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes4.dex */
public final class xa0 implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.storage.tj0 f128298d;

    public xa0(com.tencent.mm.plugin.finder.storage.tj0 tj0Var) {
        this.f128298d = tj0Var;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        gm0.j1.n().f273288b.q(3990, this);
        com.tencent.mm.plugin.finder.storage.tj0 tj0Var = this.f128298d;
        if (tj0Var != null) {
            tj0Var.a(i17 == 0 && i18 == 0);
        }
    }
}
