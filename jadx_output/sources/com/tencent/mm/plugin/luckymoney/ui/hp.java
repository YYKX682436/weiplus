package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class hp extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyTextInputView f147009d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hp(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyTextInputView luckyMoneyTextInputView) {
        super(false);
        this.f147009d = luckyMoneyTextInputView;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        android.view.View.OnClickListener onClickListener = this.f147009d.f146678m;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }
}
