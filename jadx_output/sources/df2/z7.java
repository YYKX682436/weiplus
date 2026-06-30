package df2;

/* loaded from: classes.dex */
public final class z7 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.s8 f231933d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z7(df2.s8 s8Var) {
        super(2);
        this.f231933d = s8Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        long longValue = ((java.lang.Number) obj).longValue();
        ((java.lang.Number) obj2).longValue();
        df2.s8 s8Var = this.f231933d;
        com.tencent.mars.xlog.Log.i(s8Var.f231299m, "getRewardWishList wecoinBalance: " + longValue);
        ((mm2.c1) s8Var.business(mm2.c1.class)).w8(longValue);
        return jz5.f0.f302826a;
    }
}
