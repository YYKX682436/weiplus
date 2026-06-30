package wy0;

/* loaded from: classes14.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vz0.d0 f450623d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z0.t f450624e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f450625f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f450626g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(vz0.d0 d0Var, z0.t tVar, int i17, int i18) {
        super(2);
        this.f450623d = d0Var;
        this.f450624e = tVar;
        this.f450625f = i17;
        this.f450626g = i18;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f450625f | 1;
        wy0.m.b(this.f450623d, this.f450624e, (n0.o) obj, i17, this.f450626g);
        return jz5.f0.f302826a;
    }
}
