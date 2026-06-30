package com.tencent.mm.zoomimage.subsampling.internal;

/* loaded from: classes11.dex */
public final class k implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.zoomimage.subsampling.internal.m0 f214973d;

    public k(com.tencent.mm.zoomimage.subsampling.internal.m0 m0Var) {
        this.f214973d = m0Var;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        long j17 = ((zq5.g) obj).f475067a;
        com.tencent.mm.zoomimage.subsampling.internal.m0 m0Var = this.f214973d;
        if (!zq5.g.a(m0Var.f215004m, j17)) {
            m0Var.f215004m = j17;
            m0Var.f214993b.a(new com.tencent.mm.zoomimage.subsampling.internal.k0(m0Var, j17));
            m0Var.f("contentSizeChanged");
        }
        return jz5.f0.f302826a;
    }
}
