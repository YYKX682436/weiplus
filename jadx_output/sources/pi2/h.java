package pi2;

/* loaded from: classes3.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pi2.n f354779d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(pi2.n nVar) {
        super(2);
        this.f354779d = nVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        long longValue = ((java.lang.Number) obj).longValue();
        ((java.lang.Number) obj2).longValue();
        com.tencent.mars.xlog.Log.i("FinderLiveMicPayExchang", "getRewardWishList wecoinBalance: " + longValue);
        pm0.v.X(new pi2.g(this.f354779d, longValue));
        return jz5.f0.f302826a;
    }
}
