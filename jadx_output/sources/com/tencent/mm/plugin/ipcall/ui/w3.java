package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes15.dex */
public class w3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.ui.y3 f143058d;

    public w3(com.tencent.mm.plugin.ipcall.ui.y3 y3Var) {
        this.f143058d = y3Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        boolean z17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ipcall/ui/IPCallRechargeUI$RechargeAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.ipcall.ui.y3 y3Var = this.f143058d;
        com.tencent.mm.plugin.ipcall.ui.IPCallRechargeUI iPCallRechargeUI = y3Var.f143084e;
        boolean z18 = false;
        if (com.tencent.mm.sdk.platformtools.a0.c()) {
            z17 = false;
        } else {
            com.tencent.mm.ui.widget.dialog.i0 i0Var = new com.tencent.mm.ui.widget.dialog.i0(iPCallRechargeUI);
            i0Var.d(com.tencent.mm.R.string.g5y);
            i0Var.f(com.tencent.mm.R.string.f490455vj);
            i0Var.f211821b.E = new t83.e();
            i0Var.h();
            z17 = true;
        }
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.IPCallRechargeUI", "onClick recharged, non gp version!");
            yj0.a.h(this, "com/tencent/mm/plugin/ipcall/ui/IPCallRechargeUI$RechargeAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.tencent.mm.plugin.ipcall.ui.IPCallRechargeUI iPCallRechargeUI2 = y3Var.f143084e;
        int intValue = ((java.lang.Integer) view.getTag()).intValue();
        int i17 = iPCallRechargeUI2.f142656i;
        if (i17 != -1) {
            switch (i17) {
                case 10233:
                    java.lang.String string = iPCallRechargeUI2.getString(com.tencent.mm.R.string.g5j);
                    if (!iPCallRechargeUI2.V6(string)) {
                        dp.a.makeText(iPCallRechargeUI2, string, 0).show();
                        break;
                    }
                    break;
                case 10234:
                    java.lang.String string2 = iPCallRechargeUI2.getString(com.tencent.mm.R.string.g5d);
                    if (!iPCallRechargeUI2.V6(string2)) {
                        db5.e1.G(iPCallRechargeUI2, string2, iPCallRechargeUI2.getString(com.tencent.mm.R.string.g5l), true, null);
                        break;
                    }
                    break;
                case 10235:
                    java.lang.String string3 = iPCallRechargeUI2.getString(com.tencent.mm.R.string.g6j);
                    if (!iPCallRechargeUI2.V6(string3)) {
                        dp.a.makeText(iPCallRechargeUI2, string3, 0).show();
                        break;
                    }
                    break;
                default:
                    java.lang.String string4 = iPCallRechargeUI2.getString(com.tencent.mm.R.string.g3y);
                    if (!iPCallRechargeUI2.V6(string4)) {
                        dp.a.makeText(iPCallRechargeUI2, string4, 0).show();
                        break;
                    }
                    break;
            }
            z18 = true;
        }
        if (!z18) {
            iPCallRechargeUI2.f142657m = intValue;
            com.tencent.mars.xlog.Log.i("MicroMsg.IPCallRechargeUI", "ProductId:%s, PackPrice:%s,Currency:%s, index:%d", iPCallRechargeUI2.f142651d[intValue], iPCallRechargeUI2.f142652e[intValue], iPCallRechargeUI2.f142653f[intValue], java.lang.Integer.valueOf(intValue));
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(257L, 5L, 1L, true);
            q83.f fVar = iPCallRechargeUI2.f142661q;
            fVar.d();
            if (iPCallRechargeUI2.f142664t.getItem(intValue) instanceof r45.l57) {
                fVar.f360767e = ((r45.l57) iPCallRechargeUI2.f142664t.getItem(intValue)).f379163g;
            }
            fVar.f360768f = iPCallRechargeUI2.f142653f[intValue];
            fVar.f360766d = intValue;
            fVar.f360772j = iPCallRechargeUI2.f142651d[intValue];
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_product_id", iPCallRechargeUI2.f142651d[intValue]);
            intent.putExtra("key_currency_type", iPCallRechargeUI2.f142653f[intValue]);
            intent.putExtra("key_price", iPCallRechargeUI2.f142653f[intValue] + iPCallRechargeUI2.f142652e[intValue]);
            intent.putExtra("key_force_google", true);
            if (iPCallRechargeUI2.f142664t.getItem(intValue) instanceof r45.l57) {
                java.lang.String str = ((r45.l57) iPCallRechargeUI2.f142664t.getItem(intValue)).f379167n;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    com.tencent.mars.xlog.Log.i("md5:%s", str);
                    r45.q57 q57Var = new r45.q57();
                    q57Var.f383698d = str;
                    try {
                        intent.putExtra("key_ext_info", android.util.Base64.encodeToString(q57Var.toByteArray(), 2));
                    } catch (java.io.IOException e17) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.IPCallRechargeUI", e17.getMessage());
                    }
                }
            }
            j45.l.n(iPCallRechargeUI2, "wallet_index", ".ui.WalletIapUI", intent, 2001);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/ipcall/ui/IPCallRechargeUI$RechargeAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
