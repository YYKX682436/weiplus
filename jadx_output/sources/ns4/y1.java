package ns4;

/* loaded from: classes2.dex */
public final class y1 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f339682d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinIncomeDetailView f339683e;

    public y1(java.util.LinkedList linkedList, com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinIncomeDetailView weCoinIncomeDetailView) {
        this.f339682d = linkedList;
        this.f339683e = weCoinIncomeDetailView;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        int i17 = 0;
        for (java.lang.Object obj : this.f339682d) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            int integer = ((r45.y94) obj).getInteger(0);
            com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinIncomeDetailView weCoinIncomeDetailView = this.f339683e;
            java.lang.String string = integer == 1 ? weCoinIncomeDetailView.getContext().getString(com.tencent.mm.R.string.lpn) : weCoinIncomeDetailView.getContext().getString(com.tencent.mm.R.string.lpo);
            kotlin.jvm.internal.o.d(string);
            androidx.appcompat.app.AppCompatActivity context = weCoinIncomeDetailView.getContext();
            java.lang.String format = java.lang.String.format("%.2f", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Double.valueOf(r3.getLong(2) / 100.0d)}, 1));
            kotlin.jvm.internal.o.f(format, "format(...)");
            g4Var.o(i17, string, context.getString(com.tencent.mm.R.string.lpm, format));
            i17 = i18;
        }
    }
}
