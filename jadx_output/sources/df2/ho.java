package df2;

/* loaded from: classes15.dex */
public final class ho extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ so2.j5 f230345d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.jo f230346e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bw5.g10 f230347f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ho(so2.j5 j5Var, df2.jo joVar, bw5.g10 g10Var) {
        super(0);
        this.f230345d = j5Var;
        this.f230346e = joVar;
        this.f230347f = g10Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        so2.j5 j5Var = this.f230345d;
        cm2.m0 m0Var = j5Var instanceof cm2.m0 ? (cm2.m0) j5Var : null;
        if (m0Var == null) {
            return null;
        }
        r45.y23 y23Var = m0Var.f43368v;
        r45.bd5 bd5Var = new r45.bd5();
        bw5.g10 g10Var = this.f230347f;
        bw5.v00 b17 = g10Var.b();
        byte[] byteArray = b17 != null ? b17.toByteArray() : null;
        if (byteArray != null) {
            try {
                bd5Var.parseFrom(byteArray);
            } catch (java.lang.Exception e17) {
                com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
            }
        }
        y23Var.set(70, bd5Var);
        df2.jo joVar = this.f230346e;
        android.view.View S6 = joVar.S6(com.tencent.mm.R.id.flh);
        androidx.recyclerview.widget.RecyclerView recyclerView = S6 instanceof androidx.recyclerview.widget.RecyclerView ? (androidx.recyclerview.widget.RecyclerView) S6 : null;
        java.lang.Object adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        tt2.e1 e1Var = adapter instanceof tt2.e1 ? (tt2.e1) adapter : null;
        if (e1Var != null) {
            e1Var.T(g10Var.f27613d, 10);
        }
        com.tencent.mars.xlog.Log.i(joVar.f230491m, "NotifyShopShelfUpdateType_ProductButton productId: " + g10Var.f27613d);
        return m0Var;
    }
}
