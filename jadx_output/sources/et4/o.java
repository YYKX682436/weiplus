package et4;

/* loaded from: classes9.dex */
public class o extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.xj6 f256647d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDialog f256648e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDialog wcPayCashierDialog, r45.xj6 xj6Var) {
        super(false);
        this.f256648e = wcPayCashierDialog;
        this.f256647d = xj6Var;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        r45.xj6 xj6Var = this.f256647d;
        com.tencent.mars.xlog.Log.i("MicroMsg.WcPayCashierDialog", "click item: %s", xj6Var.f390173n.f391355e);
        r45.yt5 yt5Var = xj6Var.f390173n;
        if (yt5Var.f391354d == 13 && yt5Var.f391361n != null && "fetchfavordialog".equals(yt5Var.f391355e)) {
            com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDialog wcPayCashierDialog = this.f256648e;
            et4.j0 j0Var = new et4.j0(wcPayCashierDialog.H);
            if (xj6Var.f390173n.f391361n.f384688f.size() > 0 && ((r45.yz6) xj6Var.f390173n.f391361n.f384688f.get(0)).f391556x != null) {
                java.util.LinkedList<r45.xj6> linkedList = ((r45.yz6) xj6Var.f390173n.f391361n.f384688f.get(0)).f391556x.f372904e;
                r45.rl6 rl6Var = xj6Var.f390173n.f391361n.f384686d.f381660d;
                if (rl6Var != null) {
                    com.tencent.mm.plugin.wallet_core.utils.z1.k(j0Var.f256636e, rl6Var, null, java.lang.Boolean.FALSE);
                }
                if (linkedList != null && !linkedList.isEmpty()) {
                    for (r45.xj6 xj6Var2 : linkedList) {
                        android.view.View inflate = android.view.View.inflate(j0Var.getContext(), com.tencent.mm.R.layout.f489639d92, null);
                        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.ppm);
                        android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.ppk);
                        java.util.LinkedList linkedList2 = xj6Var2.f390167e;
                        if (linkedList2 != null && linkedList2.size() >= 1) {
                            java.util.LinkedList linkedList3 = xj6Var2.f390167e;
                            com.tencent.mm.plugin.wallet_core.utils.z1.j(textView, (r45.rl6) linkedList3.get(0));
                            if (linkedList3.size() >= 2) {
                                com.tencent.mm.plugin.wallet_core.utils.z1.j(textView2, (r45.rl6) linkedList3.get(1));
                            }
                        }
                        j0Var.f256638g.addView(inflate);
                    }
                }
            }
            j0Var.setOnDismissListener(new et4.n(this));
            j0Var.show();
            wcPayCashierDialog.hide();
        }
    }
}
