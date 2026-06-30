package v73;

/* loaded from: classes9.dex */
public class j implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.honey_pay.ui.HoneyPayCardManagerUI f433701d;

    public j(com.tencent.mm.plugin.honey_pay.ui.HoneyPayCardManagerUI honeyPayCardManagerUI) {
        this.f433701d = honeyPayCardManagerUI;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.ArrayList<com.tencent.mm.plugin.wallet_core.model.Bankcard> a17;
        at4.z1 z1Var = (at4.z1) obj;
        com.tencent.mm.plugin.honey_pay.ui.HoneyPayCardManagerUI honeyPayCardManagerUI = this.f433701d;
        honeyPayCardManagerUI.hideLoading();
        java.lang.String str = honeyPayCardManagerUI.f142260d;
        if (z1Var == null || !z1Var.f14044g) {
            com.tencent.mars.xlog.Log.w(str, "bind query fail, use default bankcardList");
            a17 = at4.l1.a(false);
        } else {
            a17 = z1Var.f14038a;
            com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = z1Var.f14040c;
            if (bankcard != null) {
                a17.add(0, bankcard);
            }
            com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard2 = z1Var.f14039b;
            if (bankcard2 != null) {
                a17.add(0, bankcard2);
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard3 : a17) {
            if (bankcard3.A0()) {
                com.tencent.mars.xlog.Log.i(str, "remove honey card %s", bankcard3.field_bindSerial);
            } else {
                arrayList.add(bankcard3);
            }
        }
        androidx.appcompat.app.AppCompatActivity context = honeyPayCardManagerUI.getContext();
        com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard4 = honeyPayCardManagerUI.G;
        java.lang.String string = honeyPayCardManagerUI.getString(com.tencent.mm.R.string.fx8);
        java.lang.String string2 = honeyPayCardManagerUI.getString(com.tencent.mm.R.string.fx7);
        v73.i iVar = new v73.i(this, arrayList);
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) context, 2, true);
        k0Var.f211872n = new com.tencent.mm.plugin.wallet_core.ui.c1(arrayList, context, new java.util.HashMap(), k0Var, false, false, "");
        k0Var.f211881s = iVar;
        k0Var.Y1 = true;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f489611d56, (android.view.ViewGroup) null);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(string)) {
            ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.agb)).setText(string);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(string2)) {
            android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.aga);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/wallet_core/ui/WalletBankcardBottomSheetHelper", "showBankcardBottomSheet", "(Landroid/content/Context;Ljava/util/List;Lcom/tencent/mm/plugin/wallet_core/model/Bankcard;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Lcom/tencent/mm/ui/base/MMMenuListener$OnMMMenuItemSelectedListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/wallet_core/ui/WalletBankcardBottomSheetHelper", "showBankcardBottomSheet", "(Landroid/content/Context;Ljava/util/List;Lcom/tencent/mm/plugin/wallet_core/model/Bankcard;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Lcom/tencent/mm/ui/base/MMMenuListener$OnMMMenuItemSelectedListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.aga)).setText(string2);
        }
        k0Var.s(inflate, false);
        if (bankcard4 != null) {
            for (int i17 = 0; i17 < arrayList.size(); i17++) {
                if (((com.tencent.mm.plugin.wallet_core.model.Bankcard) arrayList.get(i17)).field_bindSerial.equals(bankcard4.field_bindSerial)) {
                    k0Var.f211851a2 = i17;
                }
            }
        }
        k0Var.v();
        honeyPayCardManagerUI.T = null;
        return null;
    }
}
