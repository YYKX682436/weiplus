package com.tencent.mm.zoomimage.subsampling.internal;

/* loaded from: classes11.dex */
public final class g0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f214951d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.zoomimage.subsampling.internal.m0 f214952e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(int i17, com.tencent.mm.zoomimage.subsampling.internal.m0 m0Var) {
        super(0);
        this.f214951d = i17;
        this.f214952e = m0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        gr5.s.f274946a.getClass();
        java.lang.String g07 = kz5.n0.g0(q26.h0.y(q26.h0.o(q26.h0.i(kz5.n0.J(gr5.r.f274945b), new gr5.p(this.f214951d)), gr5.q.f274943d)), null, "[", "]", 0, null, null, 57, null);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.tencent.mm.zoomimage.subsampling.internal.m0 m0Var = this.f214952e;
        sb6.append(m0Var.f214992a);
        sb6.append(". pausedContinuousTransformTypes=");
        sb6.append(g07);
        sb6.append(". '");
        sb6.append(com.tencent.mm.zoomimage.subsampling.internal.m0.a(m0Var));
        sb6.append('\'');
        return sb6.toString();
    }
}
