package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class s6 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMyRecordUI f147410d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s6(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMyRecordUI luckyMoneyMyRecordUI) {
        super(false);
        this.f147410d = luckyMoneyMyRecordUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        gb3.p.f270042a.a(16);
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMyRecordUI luckyMoneyMyRecordUI = this.f147410d;
        if (luckyMoneyMyRecordUI.H == null) {
            luckyMoneyMyRecordUI.getClass();
            android.view.View inflate = android.view.LayoutInflater.from(luckyMoneyMyRecordUI).inflate(com.tencent.mm.R.layout.bvb, (android.view.ViewGroup) null);
            com.tencent.mm.ui.ListViewInScrollView listViewInScrollView = (com.tencent.mm.ui.ListViewInScrollView) inflate.findViewById(com.tencent.mm.R.id.j7h);
            com.tencent.mm.plugin.luckymoney.ui.w6 w6Var = new com.tencent.mm.plugin.luckymoney.ui.w6(luckyMoneyMyRecordUI);
            java.util.List list = luckyMoneyMyRecordUI.E;
            if (list == null) {
                w6Var.f147635d = new java.util.ArrayList();
            } else {
                w6Var.f147635d = list;
            }
            w6Var.notifyDataSetChanged();
            w6Var.f147636e = 0;
            listViewInScrollView.setAdapter((android.widget.ListAdapter) w6Var);
            com.tencent.mm.ui.widget.dialog.a aVar = new com.tencent.mm.ui.widget.dialog.a();
            aVar.f211709a = of5.b.a(luckyMoneyMyRecordUI).getString(com.tencent.mm.R.string.gnm);
            aVar.L = inflate;
            aVar.G = null;
            com.tencent.mm.ui.widget.dialog.j0 j0Var = new com.tencent.mm.ui.widget.dialog.j0(luckyMoneyMyRecordUI, com.tencent.mm.R.style.f494791wd);
            j0Var.e(aVar);
            com.tencent.mm.ui.widget.dialog.d0 d0Var = aVar.f211723m;
            if (d0Var != null) {
                d0Var.a(j0Var.f211837r);
            }
            luckyMoneyMyRecordUI.H = j0Var;
            listViewInScrollView.setOnItemClickListener(new com.tencent.mm.plugin.luckymoney.ui.t6(luckyMoneyMyRecordUI, w6Var));
            luckyMoneyMyRecordUI.H = luckyMoneyMyRecordUI.H;
        }
        luckyMoneyMyRecordUI.H.show();
    }
}
