package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class mb implements android.widget.TextView.OnEditorActionListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI f147175d;

    public mb(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI) {
        this.f147175d = luckyMoneyNewPrepareUI;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(android.widget.TextView textView, int i17, android.view.KeyEvent keyEvent) {
        com.tencent.mm.wallet_core.keyboard.WcPayKeyboard wcPayKeyboard;
        if (keyEvent != null && keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 66 && (wcPayKeyboard = this.f147175d.f146245a2) != null) {
            wcPayKeyboard.i();
        }
        return true;
    }
}
