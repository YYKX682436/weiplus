package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class n5 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.r5 f117279d;

    public n5(com.tencent.mm.plugin.finder.live.viewmodel.r5 r5Var) {
        this.f117279d = r5Var;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        if (((r45.fd2) obj) != null) {
            com.tencent.mm.plugin.finder.live.viewmodel.r5 r5Var = this.f117279d;
            if (r5Var.f117359n == null) {
                com.tencent.mm.plugin.finder.live.viewmodel.r5.Z6(r5Var, (r45.q12) ((kotlinx.coroutines.flow.h3) ((mm2.g1) r5Var.getStore().business(mm2.g1.class)).f329068f).getValue());
            } else {
                r5Var.l7((r45.q12) ((kotlinx.coroutines.flow.h3) ((mm2.g1) r5Var.getStore().business(mm2.g1.class)).f329068f).getValue());
                r5Var.n7();
            }
        }
        return jz5.f0.f302826a;
    }
}
