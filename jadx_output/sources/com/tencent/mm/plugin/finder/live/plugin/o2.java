package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class o2 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.v3 f113695d;

    public o2(com.tencent.mm.plugin.finder.live.plugin.v3 v3Var) {
        this.f113695d = v3Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        if (((r45.rk6) ((jz5.l) obj).f302833d).getInteger(1) == 15) {
            this.f113695d.P1(false);
        }
    }
}
