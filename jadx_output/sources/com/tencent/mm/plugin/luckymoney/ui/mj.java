package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class mj implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI f147193d;

    public mj(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI luckyMoneyNotHookReceiveUI) {
        this.f147193d = luckyMoneyNotHookReceiveUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI luckyMoneyNotHookReceiveUI = this.f147193d;
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) luckyMoneyNotHookReceiveUI.f146491z.getLayoutParams();
        float width = luckyMoneyNotHookReceiveUI.f146483v.getWidth() * 1.0993f;
        layoutParams.width = java.lang.Math.round(width);
        layoutParams.height = java.lang.Math.round(width * 1.72f);
        luckyMoneyNotHookReceiveUI.f146491z.setLayoutParams(layoutParams);
        android.view.ViewGroup.LayoutParams layoutParams2 = luckyMoneyNotHookReceiveUI.f146483v.getLayoutParams();
        if (layoutParams2 != null) {
            layoutParams2.width += (int) (i65.a.q(com.tencent.mm.sdk.platformtools.x2.f193071a) * 1.0f);
            layoutParams2.height -= (int) (i65.a.q(com.tencent.mm.sdk.platformtools.x2.f193071a) * 1.0f);
            luckyMoneyNotHookReceiveUI.f146483v.setLayoutParams(layoutParams2);
        }
        android.view.ViewGroup.LayoutParams layoutParams3 = luckyMoneyNotHookReceiveUI.D.getLayoutParams();
        float round = (float) java.lang.Math.round(width * 0.98d);
        layoutParams3.width = java.lang.Math.round(round);
        layoutParams3.height = java.lang.Math.round(round * 1.72f);
        luckyMoneyNotHookReceiveUI.D.setLayoutParams(layoutParams3);
    }
}
