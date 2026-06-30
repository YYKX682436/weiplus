package com.tencent.mm.zoomimage.subsampling.internal;

/* loaded from: classes8.dex */
public final class f0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.zoomimage.subsampling.internal.m0 f214946d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yq5.k f214947e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(com.tencent.mm.zoomimage.subsampling.internal.m0 m0Var, yq5.k kVar) {
        super(0);
        this.f214946d = m0Var;
        this.f214947e = kVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.tencent.mm.zoomimage.subsampling.internal.m0 m0Var = this.f214946d;
        sb6.append(m0Var.f214992a);
        sb6.append(". setImage. '");
        sb6.append(m0Var.f215006o);
        sb6.append("' -> '");
        sb6.append(this.f214947e);
        sb6.append('\'');
        return sb6.toString();
    }
}
