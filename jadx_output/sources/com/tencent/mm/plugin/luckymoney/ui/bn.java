package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class bn extends com.tencent.mm.plugin.luckymoney.ui.rm {

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f146764e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f146765f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI f146766g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bn(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI, android.view.View view, int i17) {
        super(view);
        this.f146766g = luckyMoneyPickEnvelopeUI;
        view.setOnClickListener(new com.tencent.mm.plugin.luckymoney.ui.an(this, luckyMoneyPickEnvelopeUI, i17));
        if (i17 == 1) {
            android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.ikk);
            this.f146764e = findViewById;
            android.view.ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            layoutParams.width = luckyMoneyPickEnvelopeUI.Q;
            layoutParams.height = luckyMoneyPickEnvelopeUI.R;
            findViewById.setLayoutParams(layoutParams);
            android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.ij9);
            this.f146765f = findViewById2;
            android.view.ViewGroup.LayoutParams layoutParams2 = findViewById2.getLayoutParams();
            layoutParams2.width = luckyMoneyPickEnvelopeUI.S;
            layoutParams2.height = luckyMoneyPickEnvelopeUI.T;
            findViewById2.setLayoutParams(layoutParams2);
            ((android.widget.TextView) view.findViewById(com.tencent.mm.R.id.ikn)).setTextSize(1, 12.0f);
        }
    }

    @Override // com.tencent.mm.plugin.luckymoney.ui.rm
    public void l(com.tencent.mm.plugin.luckymoney.ui.zm zmVar, int i17) {
    }

    @Override // com.tencent.mm.plugin.luckymoney.ui.rm
    public void n(boolean z17) {
    }
}
