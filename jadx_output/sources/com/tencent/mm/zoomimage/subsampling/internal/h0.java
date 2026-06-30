package com.tencent.mm.zoomimage.subsampling.internal;

/* loaded from: classes11.dex */
public final class h0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.zoomimage.subsampling.internal.m0 f214957d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f214958e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(com.tencent.mm.zoomimage.subsampling.internal.m0 m0Var, boolean z17) {
        super(0);
        this.f214957d = m0Var;
        this.f214958e = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.tencent.mm.zoomimage.subsampling.internal.m0 m0Var = this.f214957d;
        sb6.append(m0Var.f214992a);
        sb6.append(". stopped=");
        sb6.append(this.f214958e);
        sb6.append(". '");
        sb6.append(com.tencent.mm.zoomimage.subsampling.internal.m0.a(m0Var));
        sb6.append('\'');
        return sb6.toString();
    }
}
