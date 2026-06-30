package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class rl implements u4.b1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.vm f147390d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI f147391e;

    public rl(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI, com.tencent.mm.plugin.luckymoney.ui.vm vmVar) {
        this.f147391e = luckyMoneyPickEnvelopeUI;
        this.f147390d = vmVar;
    }

    @Override // u4.b1
    public void a(androidx.transition.Transition transition) {
    }

    @Override // u4.b1
    public void b(androidx.transition.Transition transition) {
        this.f147390d.itemView.postDelayed(new com.tencent.mm.plugin.luckymoney.ui.pl(this), 300L);
    }

    @Override // u4.b1
    public void c(androidx.transition.Transition transition) {
    }

    @Override // u4.b1
    public void d(androidx.transition.Transition transition) {
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI = this.f147391e;
        db5.h7.c(null, luckyMoneyPickEnvelopeUI.getContext().getResources().getString(com.tencent.mm.R.string.gk_), luckyMoneyPickEnvelopeUI.getContext(), 2, new com.tencent.mm.plugin.luckymoney.ui.ql(this));
    }
}
