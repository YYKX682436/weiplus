package in2;

/* loaded from: classes10.dex */
public final class h0 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.recyclerview.WxRecyclerView f292843d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in2.n0 f292844e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView, in2.n0 n0Var) {
        super(3);
        this.f292843d = wxRecyclerView;
        this.f292844e = n0Var;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int intValue = ((java.lang.Number) obj).intValue();
        boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
        ((java.lang.Number) obj3).intValue();
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = this.f292843d;
        int i17 = wxRecyclerView.getContext().getResources().getDisplayMetrics().heightPixels;
        int translationY = (int) ((i17 - intValue) + wxRecyclerView.getTranslationY());
        in2.n0 n0Var = this.f292844e;
        n0Var.Q = translationY;
        if (booleanValue) {
            n0Var.e0(n0Var.R);
        }
        com.tencent.mars.xlog.Log.i(n0Var.f292864J, "moveRv empty: " + i17 + " - " + intValue + " = " + n0Var.Q);
        return jz5.f0.f302826a;
    }
}
