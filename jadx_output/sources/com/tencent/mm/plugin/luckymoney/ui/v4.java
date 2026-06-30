package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class v4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k2 f147525d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.MMPAGView f147526e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ym5.w1 f147527f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.MMPAGView f147528g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatting.component.ListScrollPAGView f147529h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ym5.w1 f147530i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.y0 f147531m;

    public v4(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyHistoryEnvelopeUI luckyMoneyHistoryEnvelopeUI, com.tencent.mm.ui.widget.dialog.k2 k2Var, com.tencent.mm.view.MMPAGView mMPAGView, ym5.w1 w1Var, com.tencent.mm.view.MMPAGView mMPAGView2, com.tencent.mm.chatting.component.ListScrollPAGView listScrollPAGView, ym5.w1 w1Var2, kotlinx.coroutines.y0 y0Var) {
        this.f147525d = k2Var;
        this.f147526e = mMPAGView;
        this.f147527f = w1Var;
        this.f147528g = mMPAGView2;
        this.f147529h = listScrollPAGView;
        this.f147530i = w1Var2;
        this.f147531m = y0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$17", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f147525d.dismiss();
        ym5.w1 w1Var = this.f147527f;
        com.tencent.mm.view.MMPAGView mMPAGView = this.f147526e;
        if (mMPAGView != null && mMPAGView.getVisibility() == 0) {
            mMPAGView.n();
            mMPAGView.i(w1Var);
        }
        com.tencent.mm.view.MMPAGView mMPAGView2 = this.f147528g;
        if (mMPAGView2 != null && mMPAGView2.getVisibility() == 0) {
            mMPAGView2.n();
            mMPAGView2.i(w1Var);
        }
        com.tencent.mm.chatting.component.ListScrollPAGView listScrollPAGView = this.f147529h;
        if (listScrollPAGView != null && listScrollPAGView.getVisibility() == 0) {
            listScrollPAGView.n();
            listScrollPAGView.i(this.f147530i);
        }
        com.tencent.mm.wallet_core.model.z1.f214041a.a(this.f147531m);
        yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$17", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
