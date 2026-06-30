package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class l6 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.m6 f147128d;

    public l6(com.tencent.mm.plugin.luckymoney.ui.m6 m6Var) {
        this.f147128d = m6Var;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.luckymoney.ui.m6 m6Var = this.f147128d;
        if (itemId == 1) {
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMyRecordUI luckyMoneyMyRecordUI = m6Var.f147166d;
            if (luckyMoneyMyRecordUI.f146154g != 2) {
                luckyMoneyMyRecordUI.f146154g = 2;
                com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMyRecordUI.V6(luckyMoneyMyRecordUI);
                m6Var.f147166d.X6();
                m6Var.f147166d.W6();
                return;
            }
            return;
        }
        if (itemId != 2) {
            return;
        }
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMyRecordUI luckyMoneyMyRecordUI2 = m6Var.f147166d;
        if (luckyMoneyMyRecordUI2.f146154g != 1) {
            luckyMoneyMyRecordUI2.f146154g = 1;
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMyRecordUI.V6(luckyMoneyMyRecordUI2);
            m6Var.f147166d.X6();
            m6Var.f147166d.W6();
        }
    }
}
