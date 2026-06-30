package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class LuckyMoneyEnvelopeTouchRecyclerView extends androidx.recyclerview.widget.RecyclerView {

    /* renamed from: b2, reason: collision with root package name */
    public com.tencent.mm.plugin.luckymoney.ui.g4 f146115b2;

    public LuckyMoneyEnvelopeTouchRecyclerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.luckymoney.ui.g4 g4Var = this.f146115b2;
        if (g4Var != null) {
            com.tencent.mm.plugin.luckymoney.ui.km kmVar = (com.tencent.mm.plugin.luckymoney.ui.km) g4Var;
            kmVar.getClass();
            if (motionEvent.getAction() == 0) {
                com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI = kmVar.f147113a;
                android.view.View n17 = luckyMoneyPickEnvelopeUI.D.n(luckyMoneyPickEnvelopeUI.f146523m);
                luckyMoneyPickEnvelopeUI.C = n17;
                luckyMoneyPickEnvelopeUI.D.f145750f = n17;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public LuckyMoneyEnvelopeTouchRecyclerView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
