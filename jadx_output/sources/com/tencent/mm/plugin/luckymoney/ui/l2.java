package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class l2 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI f147122d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI luckyMoneyDetailUI) {
        super(false);
        this.f147122d = luckyMoneyDetailUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        int indexOf;
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI luckyMoneyDetailUI = this.f147122d;
        com.tencent.mm.plugin.luckymoney.model.e1 e1Var = luckyMoneyDetailUI.U2;
        if (e1Var == null || e1Var.W == null) {
            return;
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) android.view.LayoutInflater.from(luckyMoneyDetailUI.getContext()).inflate(com.tencent.mm.R.layout.bul, (android.view.ViewGroup) null);
        android.widget.TextView textView = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.f485789j24);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) viewGroup.findViewById(com.tencent.mm.R.id.f485788j23);
        textView.setText(luckyMoneyDetailUI.U2.W.f145328d);
        com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = new android.view.ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams.topMargin = i65.a.b(luckyMoneyDetailUI.getContext(), 16);
        java.util.Iterator it = luckyMoneyDetailUI.U2.W.f145329e.iterator();
        boolean z17 = true;
        while (it.hasNext()) {
            com.tencent.mm.plugin.luckymoney.model.k kVar = (com.tencent.mm.plugin.luckymoney.model.k) it.next();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(kVar.f145361d)) {
                android.widget.TextView textView2 = new android.widget.TextView(luckyMoneyDetailUI.getContext());
                android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(kVar.f145361d);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(kVar.f145362e) && (indexOf = kVar.f145361d.indexOf(kVar.f145362e)) > 0) {
                    spannableStringBuilder.setSpan(new com.tencent.mm.plugin.wallet_core.ui.d7(2, new com.tencent.mm.plugin.luckymoney.ui.w1(luckyMoneyDetailUI, kVar)), indexOf, kVar.f145362e.length() + indexOf, 18);
                    textView2.setClickable(true);
                    textView2.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.span.y0(luckyMoneyDetailUI.getContext()));
                }
                textView2.setText(spannableStringBuilder);
                textView2.setTextSize(1, 14.0f);
                textView2.setTextColor(luckyMoneyDetailUI.getResources().getColor(com.tencent.mm.R.color.t_));
                if (z17) {
                    linearLayout.addView(textView2);
                } else {
                    linearLayout.addView(textView2, marginLayoutParams);
                }
                if (z17) {
                    z17 = false;
                }
            }
        }
        com.tencent.mm.ui.widget.dialog.z2 z2Var = new com.tencent.mm.ui.widget.dialog.z2(luckyMoneyDetailUI.getContext(), 2, 0);
        z2Var.y(luckyMoneyDetailUI.getResources().getString(com.tencent.mm.R.string.f490454vi));
        z2Var.x(1);
        z2Var.F = new com.tencent.mm.plugin.luckymoney.ui.x1(luckyMoneyDetailUI, z2Var);
        z2Var.j(viewGroup);
        z2Var.C();
    }
}
