package zw1;

/* loaded from: classes9.dex */
public final class s2 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zw1.t2 f476787d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ww1.a3 f476788e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ww1.b3 f476789f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(zw1.t2 t2Var, ww1.a3 a3Var, ww1.b3 b3Var) {
        super(false);
        this.f476787d = t2Var;
        this.f476788e = a3Var;
        this.f476789f = b3Var;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View v17) {
        kotlin.jvm.internal.o.g(v17, "v");
        ot5.g.c("MicroMsg.WalletCollectQrCodeMultiShopUIC", "multiShopChangeBtn onclick");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(25983, 18, 2);
        ww1.a3 a3Var = this.f476788e;
        java.util.LinkedList shop_list = a3Var.V;
        kotlin.jvm.internal.o.f(shop_list, "shop_list");
        zw1.t2 t2Var = this.f476787d;
        t2Var.getClass();
        int size = shop_list.size();
        java.lang.String[] strArr = new java.lang.String[size];
        int i17 = 0;
        for (int i18 = 0; i18 < size; i18++) {
            strArr[i18] = "";
        }
        int size2 = shop_list.size();
        for (int i19 = 0; i19 < size2; i19++) {
            java.lang.String shop_name = ((r45.bj4) shop_list.get(i19)).f370805e;
            kotlin.jvm.internal.o.f(shop_name, "shop_name");
            strArr[i19] = shop_name;
        }
        if (size == 0) {
            ot5.g.c("MicroMsg.WalletCollectQrCodeMultiShopUIC", "get optionalPickerDataArr fail!");
            return;
        }
        com.tencent.mm.ui.widget.picker.c0 c0Var = new com.tencent.mm.ui.widget.picker.c0(t2Var.getActivity(), strArr);
        android.view.View inflate = android.view.LayoutInflater.from(t2Var.getActivity()).inflate(com.tencent.mm.R.layout.aob, (android.view.ViewGroup) null);
        ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.q0l)).setText(a3Var.W);
        c0Var.g(inflate);
        java.util.LinkedList shop_list2 = a3Var.V;
        kotlin.jvm.internal.o.f(shop_list2, "shop_list");
        long j17 = a3Var.U;
        t2Var.getClass();
        int size3 = shop_list2.size();
        int i27 = 0;
        while (true) {
            if (i27 >= size3) {
                break;
            }
            if (j17 == ((r45.bj4) shop_list2.get(i27)).f370804d) {
                i17 = i27;
                break;
            }
            i27++;
        }
        c0Var.i(i17);
        c0Var.f212259t = new zw1.r2(c0Var, a3Var, this.f476789f, t2Var);
        c0Var.l();
    }
}
