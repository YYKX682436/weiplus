package id2;

/* loaded from: classes2.dex */
public final class l5 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ id2.p5 f290661d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l5(id2.p5 p5Var) {
        super(1);
        this.f290661d = p5Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        id2.p5 p5Var = this.f290661d;
        com.tencent.mm.plugin.finder.view.FinderRefreshLayout finderRefreshLayout = p5Var.f290743d;
        if (finderRefreshLayout == null) {
            kotlin.jvm.internal.o.o("refreshLayout");
            throw null;
        }
        finderRefreshLayout.e(booleanValue);
        r45.hu1 hu1Var = p5Var.f290748i;
        int integer = hu1Var != null ? hu1Var.getInteger(4) : -1;
        com.tencent.mars.xlog.Log.i("FinderLiveSelfLotteryHistoryResultUIC", "continueFlag: " + integer);
        if (integer == 0) {
            com.tencent.mm.plugin.finder.view.FinderRefreshLayout finderRefreshLayout2 = p5Var.f290743d;
            if (finderRefreshLayout2 == null) {
                kotlin.jvm.internal.o.o("refreshLayout");
                throw null;
            }
            finderRefreshLayout2.setEnableLoadMode(false);
        }
        return jz5.f0.f302826a;
    }
}
