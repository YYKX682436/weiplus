package el2;

/* loaded from: classes3.dex */
public final class q0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ el2.i1 f253891d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(el2.i1 i1Var) {
        super(2);
        this.f253891d = i1Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        long longValue = ((java.lang.Number) obj).longValue();
        ((java.lang.Number) obj2).longValue();
        el2.i1 i1Var = this.f253891d;
        com.tencent.mars.xlog.Log.i(i1Var.f253815g, "getRewardWishList wecoinBalance: " + longValue);
        ((mm2.c1) i1Var.f253814f.P0(mm2.c1.class)).w8(longValue);
        return jz5.f0.f302826a;
    }
}
