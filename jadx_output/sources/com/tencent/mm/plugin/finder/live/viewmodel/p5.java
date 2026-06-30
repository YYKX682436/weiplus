package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class p5 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.r5 f117321d;

    public p5(com.tencent.mm.plugin.finder.live.viewmodel.r5 r5Var) {
        this.f117321d = r5Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.live.viewmodel.r5 r5Var = this.f117321d;
        com.tencent.mars.xlog.Log.i(r5Var.f117358m, "audioModeChangeData changed: " + ((java.lang.Integer) obj));
        if (r5Var.f117359n == null) {
            com.tencent.mm.plugin.finder.live.viewmodel.r5.Z6(r5Var, (r45.q12) ((kotlinx.coroutines.flow.h3) ((mm2.g1) r5Var.getStore().business(mm2.g1.class)).f329068f).getValue());
        } else {
            r5Var.l7((r45.q12) ((kotlinx.coroutines.flow.h3) ((mm2.g1) r5Var.getStore().business(mm2.g1.class)).f329068f).getValue());
            r5Var.n7();
        }
    }
}
