package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes8.dex */
public class q4 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanDetailUI f178338d;

    public q4(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanDetailUI walletLqtPlanDetailUI, com.tencent.mm.plugin.wallet.balance.ui.lqt.h4 h4Var) {
        this.f178338d = walletLqtPlanDetailUI;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return ((java.util.ArrayList) this.f178338d.f178006g).size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (r45.o85) ((java.util.ArrayList) this.f178338d.f178006g).get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        java.lang.String str;
        com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanDetailUI walletLqtPlanDetailUI = this.f178338d;
        if (view == null) {
            view = android.view.LayoutInflater.from(walletLqtPlanDetailUI.getContext()).inflate(com.tencent.mm.R.layout.btm, viewGroup, false);
            view.setTag(new com.tencent.mm.plugin.wallet.balance.ui.lqt.r4(walletLqtPlanDetailUI, view));
        }
        r45.o85 o85Var = (r45.o85) ((java.util.ArrayList) walletLqtPlanDetailUI.f178006g).get(i17);
        com.tencent.mm.plugin.wallet.balance.ui.lqt.r4 r4Var = (com.tencent.mm.plugin.wallet.balance.ui.lqt.r4) view.getTag();
        r4Var.getClass();
        r4Var.f178354b.setText(o85Var.f382029d);
        int i18 = o85Var.f382031f;
        com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanDetailUI walletLqtPlanDetailUI2 = r4Var.f178356d;
        android.widget.TextView textView = r4Var.f178355c;
        if (i18 == 2) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
            java.lang.String str2 = "" + o85Var.f382030e;
            int i19 = com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanDetailUI.D;
            walletLqtPlanDetailUI2.getClass();
            if (str2.length() == 1) {
                str = androidx.camera.core.processing.util.GLUtils.VERSION_UNKNOWN.concat(str2);
            } else if (str2.length() == 2) {
                str = "0.".concat(str2);
            } else {
                str = str2.substring(0, str2.length() - 2) + "." + str2.substring(str2.length() - 2);
            }
            sb6.append(str);
            objArr[0] = sb6.toString();
            textView.setText(walletLqtPlanDetailUI2.getString(com.tencent.mm.R.string.kqp, objArr));
            textView.setTextColor(walletLqtPlanDetailUI2.getResources().getColor(com.tencent.mm.R.color.a0c));
        } else {
            textView.setText(o85Var.f382032g);
            textView.setTextColor(walletLqtPlanDetailUI2.getResources().getColor(com.tencent.mm.R.color.a_i));
        }
        return view;
    }
}
