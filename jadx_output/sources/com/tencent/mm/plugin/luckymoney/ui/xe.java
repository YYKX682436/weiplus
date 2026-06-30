package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes3.dex */
public final class xe implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewReceiveUI f147689d;

    public xe(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewReceiveUI luckyMoneyNewReceiveUI) {
        this.f147689d = luckyMoneyNewReceiveUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewReceiveUI luckyMoneyNewReceiveUI = this.f147689d;
        android.view.View view = luckyMoneyNewReceiveUI.B;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewReceiveUI$renderEnvelopeDynamic$1$onAnimationStart$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewReceiveUI$renderEnvelopeDynamic$1$onAnimationStart$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view2 = luckyMoneyNewReceiveUI.f146312v;
        if (view2 != null) {
            view2.setBackgroundResource(com.tencent.mm.R.color.a9e);
        }
        android.widget.ImageView imageView = luckyMoneyNewReceiveUI.f146317y;
        if (imageView != null) {
            imageView.setVisibility(4);
        }
        android.widget.ImageView imageView2 = luckyMoneyNewReceiveUI.f146320z;
        if (imageView2 == null) {
            return;
        }
        imageView2.setVisibility(4);
    }
}
