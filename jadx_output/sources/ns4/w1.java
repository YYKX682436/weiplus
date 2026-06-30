package ns4;

/* loaded from: classes8.dex */
public final class w1 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinIncomeDetailView f339671d;

    public w1(com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinIncomeDetailView weCoinIncomeDetailView) {
        this.f339671d = weCoinIncomeDetailView;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        r45.i50 i50Var = (r45.i50) obj;
        com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinIncomeDetailView weCoinIncomeDetailView = this.f339671d;
        android.widget.LinearLayout linearLayout = weCoinIncomeDetailView.f179173p;
        if (linearLayout == null) {
            kotlin.jvm.internal.o.o("mIncomeBalanceLL");
            throw null;
        }
        linearLayout.setVisibility(8);
        if (i50Var != null) {
            java.lang.String str = i50Var.f376738d;
            boolean z17 = true;
            if (str == null || str.length() == 0) {
                return;
            }
            ms4.t tVar = weCoinIncomeDetailView.f179176s;
            if (tVar == null) {
                kotlin.jvm.internal.o.o("mViewModel");
                throw null;
            }
            tVar.R6(8);
            android.widget.LinearLayout linearLayout2 = weCoinIncomeDetailView.f179173p;
            if (linearLayout2 == null) {
                kotlin.jvm.internal.o.o("mIncomeBalanceLL");
                throw null;
            }
            linearLayout2.setVisibility(0);
            android.widget.LinearLayout linearLayout3 = weCoinIncomeDetailView.f179173p;
            if (linearLayout3 == null) {
                kotlin.jvm.internal.o.o("mIncomeBalanceLL");
                throw null;
            }
            ((android.widget.TextView) linearLayout3.findViewById(com.tencent.mm.R.id.pke)).setText(i50Var.f376738d);
            android.widget.LinearLayout linearLayout4 = weCoinIncomeDetailView.f179173p;
            if (linearLayout4 == null) {
                kotlin.jvm.internal.o.o("mIncomeBalanceLL");
                throw null;
            }
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) linearLayout4.findViewById(com.tencent.mm.R.id.pkd);
            java.lang.String str2 = i50Var.f376739e;
            if (str2 != null && str2.length() != 0) {
                z17 = false;
            }
            if (z17) {
                weImageView.setVisibility(8);
                return;
            }
            weImageView.setVisibility(0);
            android.widget.LinearLayout linearLayout5 = weCoinIncomeDetailView.f179173p;
            if (linearLayout5 != null) {
                linearLayout5.setOnClickListener(new ns4.m2(weCoinIncomeDetailView, i50Var));
            } else {
                kotlin.jvm.internal.o.o("mIncomeBalanceLL");
                throw null;
            }
        }
    }
}
