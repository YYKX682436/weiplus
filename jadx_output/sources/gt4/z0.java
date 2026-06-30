package gt4;

/* loaded from: classes14.dex */
public final class z0 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gt4.k1 f275582d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gt4.a1 f275583e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f275584f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ gt4.u0 f275585g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(gt4.k1 k1Var, gt4.a1 a1Var, int i17, gt4.u0 u0Var) {
        super(false);
        this.f275582d = k1Var;
        this.f275583e = a1Var;
        this.f275584f = i17;
        this.f275585g = u0Var;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        int i17 = this.f275582d.f275464a;
        gt4.a1 a1Var = this.f275583e;
        if (i17 > a1Var.f275394o) {
            return;
        }
        int i18 = a1Var.f275388f;
        gt4.u0 u0Var = this.f275585g;
        if (i18 <= 0) {
            a1Var.f275388f = i17;
            a1Var.notifyItemChanged(this.f275584f);
            u0Var.f275561e.announceForAccessibility(a1Var.f275386d.getString(com.tencent.mm.R.string.m2f, u0Var.f275562f.getText()));
        } else if (a1Var.f275389g <= 0) {
            if (i18 > i17) {
                a1Var.f275389g = i18;
                a1Var.f275388f = i17;
                java.lang.String string = a1Var.f275386d.getString(com.tencent.mm.R.string.m2f, java.lang.String.valueOf(i17 % 100));
                kotlin.jvm.internal.o.f(string, "getString(...)");
                u0Var.f275561e.announceForAccessibility(string + ", " + a1Var.f275386d.getString(com.tencent.mm.R.string.m2e, java.lang.String.valueOf(a1Var.f275389g % 100)));
            } else {
                a1Var.f275389g = i17;
                u0Var.f275561e.announceForAccessibility(a1Var.f275386d.getString(com.tencent.mm.R.string.m2e, u0Var.f275562f.getText()));
            }
            a1Var.notifyDataSetChanged();
        } else {
            a1Var.f275388f = i17;
            a1Var.f275389g = 0;
            a1Var.notifyDataSetChanged();
            u0Var.f275561e.announceForAccessibility(a1Var.f275386d.getString(com.tencent.mm.R.string.m2f, u0Var.f275562f.getText()));
        }
        gt4.w0 w0Var = a1Var.f275395p;
        if (w0Var != null) {
            int i19 = a1Var.f275388f;
            int i27 = a1Var.f275389g;
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletComplexDatePicker", "onSelected start:" + i19 + " end:" + i27);
            gt4.s0 s0Var = ((gt4.p0) w0Var).f275495a;
            s0Var.P = i19;
            s0Var.Q = i27;
            s0Var.o();
            s0Var.f();
        }
    }
}
