package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes5.dex */
public class p4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.s4 f147305d;

    public p4(com.tencent.mm.plugin.luckymoney.ui.s4 s4Var) {
        this.f147305d = s4Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.luckymoney.ui.s4 s4Var = this.f147305d;
        android.view.View view = s4Var.f147404e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$14$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$14$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        s4Var.f147404e.postDelayed(new com.tencent.mm.plugin.luckymoney.ui.o4(this), 100L);
    }
}
