package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class u8 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI f147489d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f147490e;

    public u8(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI luckyMoneyNewDetailUI, android.view.View view) {
        this.f147489d = luckyMoneyNewDetailUI;
        this.f147490e = view;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI luckyMoneyNewDetailUI = this.f147489d;
        java.lang.String string = luckyMoneyNewDetailUI.getString(com.tencent.mm.R.string.gnk);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        com.tencent.mm.plugin.luckymoney.model.LuckyMoneyEmojiSwitch luckyMoneyEmojiSwitch = luckyMoneyNewDetailUI.f146183f2;
        if (com.tencent.mm.sdk.platformtools.t8.C0(luckyMoneyEmojiSwitch != null ? java.lang.Integer.valueOf(luckyMoneyEmojiSwitch.f145156g) : null, 0)) {
            string = luckyMoneyNewDetailUI.getString(com.tencent.mm.R.string.gkp);
            kotlin.jvm.internal.o.f(string, "getString(...)");
        } else {
            g4Var.a(1, com.tencent.mm.R.string.gm6);
        }
        g4Var.f(2, string);
        if (com.tencent.mm.sdk.platformtools.t8.C0(this.f147490e.getTag(), "nodelete")) {
            return;
        }
        g4Var.d(3, luckyMoneyNewDetailUI.getResources().getColor(com.tencent.mm.R.color.f479364xj), luckyMoneyNewDetailUI.getContext().getString(com.tencent.mm.R.string.gjr));
    }
}
