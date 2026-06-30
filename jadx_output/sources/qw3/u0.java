package qw3;

/* loaded from: classes9.dex */
public class u0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.f77 f367211d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitMoneyInputUI f367212e;

    public u0(com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitMoneyInputUI bankRemitMoneyInputUI, r45.f77 f77Var) {
        this.f367212e = bankRemitMoneyInputUI;
        this.f367211d = f77Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/remittance/bankcard/ui/BankRemitMoneyInputUI$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        r45.f77 f77Var = this.f367211d;
        com.tencent.mars.xlog.Log.i("MicroMsg.BankRemitMoneyInputUI", " click option item : %s ,type:%s", f77Var.f374081d, java.lang.Integer.valueOf(f77Var.f374082e.f372209d));
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(28871, 3, 2);
        r45.d77 d77Var = f77Var.f374082e;
        int i17 = d77Var.f372209d;
        if (i17 == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BankRemitMoneyInputUI", " textInfo.jumpInfo.url ：%s", d77Var.f372210e);
            com.tencent.mm.wallet_core.ui.r1.V(this.f367212e.getContext(), f77Var.f374082e.f372210e, false);
        } else if (i17 == 2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BankRemitMoneyInputUI", " textInfo.jumpInfo.username ：%s", d77Var.f372211f);
            r45.d77 d77Var2 = f77Var.f374082e;
            com.tencent.mm.wallet_core.ui.r1.b0(d77Var2.f372211f, d77Var2.f372212g, 0, 1000);
        } else if (i17 != 3) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BankRemitMoneyInputUI", "unknow text info type");
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.BankRemitMoneyInputUI", " text info type is OPTIONS_MENU_ITEM_JUMP_TYPE_NATIVE");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/remittance/bankcard/ui/BankRemitMoneyInputUI$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
