package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class ya implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI f147731d;

    public ya(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI) {
        this.f147731d = luckyMoneyNewPrepareUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI = this.f147731d;
        if (luckyMoneyNewPrepareUI.isFinishing() || luckyMoneyNewPrepareUI.isDestroyed()) {
            java.lang.ref.WeakReference weakReference = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI.f146241x2;
            com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyNewPrepareUI", "[onClickEnvelopeLayout] isFinishing() || isDestroyed()");
            return;
        }
        androidx.appcompat.app.AppCompatActivity context = luckyMoneyNewPrepareUI.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        com.tencent.mm.plugin.luckymoney.ui.ld ldVar = (com.tencent.mm.plugin.luckymoney.ui.ld) zVar.a(context).a(com.tencent.mm.plugin.luckymoney.ui.ld.class);
        androidx.appcompat.app.AppCompatActivity activity = ldVar.getActivity();
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI2 = activity instanceof com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI ? (com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI) activity : null;
        android.widget.TextView textView = luckyMoneyNewPrepareUI2 != null ? luckyMoneyNewPrepareUI2.G : null;
        if (textView != null) {
            textView.setVisibility(8);
        }
        android.widget.LinearLayout linearLayout = ldVar.f147136d;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        android.widget.LinearLayout linearLayout2 = ldVar.f147140h;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
        ldVar.P6();
        androidx.appcompat.app.AppCompatActivity activity2 = ldVar.getActivity();
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI3 = activity2 instanceof com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI ? (com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI) activity2 : null;
        if (luckyMoneyNewPrepareUI3 != null && luckyMoneyNewPrepareUI3.f146252g2) {
            androidx.appcompat.app.AppCompatActivity activity3 = ldVar.getActivity();
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI4 = activity3 instanceof com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI ? (com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI) activity3 : null;
            if (luckyMoneyNewPrepareUI4 != null) {
                luckyMoneyNewPrepareUI4.f146252g2 = false;
            }
            androidx.appcompat.app.AppCompatActivity activity4 = ldVar.getActivity();
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI5 = activity4 instanceof com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI ? (com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI) activity4 : null;
            r45.lm5 g76 = luckyMoneyNewPrepareUI5 != null ? luckyMoneyNewPrepareUI5.g7() : null;
            if (g76 != null) {
                g76.f379625g = false;
                com.tencent.mm.plugin.luckymoney.model.m5.a(g76.f379623e);
                ldVar.R6(g76);
            }
        }
        androidx.appcompat.app.AppCompatActivity context2 = luckyMoneyNewPrepareUI.getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        com.tencent.mm.plugin.luckymoney.ui.qd qdVar = (com.tencent.mm.plugin.luckymoney.ui.qd) zVar.a(context2).a(com.tencent.mm.plugin.luckymoney.ui.qd.class);
        androidx.appcompat.app.AppCompatActivity activity5 = qdVar.getActivity();
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI6 = activity5 instanceof com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI ? (com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI) activity5 : null;
        boolean z17 = luckyMoneyNewPrepareUI6 != null ? luckyMoneyNewPrepareUI6.f146256i2 : false;
        androidx.appcompat.app.AppCompatActivity activity6 = qdVar.getActivity();
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI7 = activity6 instanceof com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI ? (com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI) activity6 : null;
        if ((luckyMoneyNewPrepareUI7 != null ? luckyMoneyNewPrepareUI7.j7() : false) && z17) {
            android.widget.LinearLayout linearLayout3 = (android.widget.LinearLayout) qdVar.findViewById(com.tencent.mm.R.id.udg);
            if (linearLayout3 != null && linearLayout3.getVisibility() == 8) {
                android.widget.TextView Q6 = qdVar.Q6();
                if (com.tencent.mm.sdk.platformtools.t8.J0(Q6 != null ? Q6.getText() : null)) {
                    return;
                }
                android.widget.TextView Q62 = qdVar.Q6();
                if (Q62 != null) {
                    Q62.setVisibility(0);
                }
                android.widget.LinearLayout linearLayout4 = (android.widget.LinearLayout) qdVar.findViewById(com.tencent.mm.R.id.udg);
                if (linearLayout4 == null) {
                    return;
                }
                linearLayout4.setVisibility(0);
            }
        }
    }
}
