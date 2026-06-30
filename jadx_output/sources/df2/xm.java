package df2;

/* loaded from: classes3.dex */
public final class xm extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.cn f231788d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.i62 f231789e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xm(df2.cn cnVar, r45.i62 i62Var) {
        super(0);
        this.f231788d = cnVar;
        this.f231789e = i62Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        df2.cn cnVar = this.f231788d;
        if (currentTimeMillis - cnVar.f229896t < cnVar.f229895s) {
            com.tencent.mars.xlog.Log.i(cnVar.f229892p, "can not double click");
            cnVar.f229896t = java.lang.System.currentTimeMillis();
        } else {
            cnVar.t7(121, 10, java.lang.Integer.valueOf(!cnVar.p7() ? 1 : 2));
            cnVar.f229896t = java.lang.System.currentTimeMillis();
            boolean p76 = cnVar.p7();
            r45.wg7 wg7Var = r45.wg7.MMFinderLiveLikeSource_RealnameLikeBubble;
            r45.i62 i62Var = this.f231789e;
            if (p76) {
                cnVar.s7(8, java.lang.Integer.valueOf(i62Var.getInteger(2)));
                cnVar.r7(false, wg7Var, true);
            } else {
                cnVar.s7(2, java.lang.Integer.valueOf(i62Var.getInteger(2)));
                cnVar.r7(true, wg7Var, true);
            }
        }
        return jz5.f0.f302826a;
    }
}
