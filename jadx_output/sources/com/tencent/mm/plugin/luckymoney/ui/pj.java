package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class pj implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.qj f147321d;

    public pj(com.tencent.mm.plugin.luckymoney.ui.qj qjVar) {
        this.f147321d = qjVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.luckymoney.ui.qj qjVar = this.f147321d;
        android.view.View view = qjVar.f147354e.B;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNotHookReceiveUI$21$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNotHookReceiveUI$21$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        qjVar.f147354e.B.postDelayed(new com.tencent.mm.plugin.luckymoney.ui.oj(this), 300L);
    }
}
