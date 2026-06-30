package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class wm implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.zm f147657d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.xm f147658e;

    public wm(com.tencent.mm.plugin.luckymoney.ui.xm xmVar, com.tencent.mm.plugin.luckymoney.ui.zm zmVar) {
        this.f147658e = xmVar;
        this.f147657d = zmVar;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$CreateEnvelopeVH$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int action = motionEvent.getAction();
        com.tencent.mm.plugin.luckymoney.ui.xm xmVar = this.f147658e;
        if (action == 0) {
            xmVar.f147704n.setIconColor(xmVar.f147706p.getContext().getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_1));
            xmVar.f147702i.setTextColor(xmVar.f147706p.getContext().getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_1));
        } else {
            xmVar.f147704n.setIconColor(xmVar.f147706p.getContext().getResources().getColor(com.tencent.mm.R.color.f479347x2));
            xmVar.f147702i.setTextColor(xmVar.f147706p.getContext().getResources().getColor(com.tencent.mm.R.color.f479347x2));
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPickEnvelopeUI", "on click ");
            r45.wv3 wv3Var = this.f147657d.f147793b;
            com.tencent.mm.wallet_core.ui.r1.b0(wv3Var.f389511t, wv3Var.f389512u, 0, 1100);
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            java.lang.Integer valueOf = java.lang.Integer.valueOf(xmVar.f147706p.f146535w + 1);
            java.lang.Integer valueOf2 = java.lang.Integer.valueOf(xmVar.f147706p.f146534v + 1);
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI = xmVar.f147706p;
            java.lang.String str = luckyMoneyPickEnvelopeUI.K;
            java.lang.String b76 = luckyMoneyPickEnvelopeUI.b7();
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI2 = xmVar.f147706p;
            g0Var.d(18892, 32, valueOf, valueOf2, str, b76, luckyMoneyPickEnvelopeUI2.f146515J, java.lang.Integer.valueOf(luckyMoneyPickEnvelopeUI2.f146524n.getItemCount() - 1), java.lang.Integer.valueOf(xmVar.f147706p.a7()), java.lang.Integer.valueOf(xmVar.f147706p.k7()), xmVar.f147706p.j7());
            if (xmVar.f147698e == 1) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPickEnvelopeUI", "click CreateEnvelopeVH: %s", java.lang.Integer.valueOf(xmVar.getLayoutPosition()));
            }
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$CreateEnvelopeVH$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
