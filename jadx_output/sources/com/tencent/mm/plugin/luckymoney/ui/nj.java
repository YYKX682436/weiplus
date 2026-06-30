package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class nj implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.qj f147244d;

    public nj(com.tencent.mm.plugin.luckymoney.ui.qj qjVar) {
        this.f147244d = qjVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.luckymoney.ui.qj qjVar = this.f147244d;
        android.view.View view = qjVar.f147354e.A;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNotHookReceiveUI$21$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNotHookReceiveUI$21$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        qjVar.f147354e.f146483v.setBackgroundResource(com.tencent.mm.R.color.a9e);
        qjVar.f147354e.f146485x.setVisibility(4);
        qjVar.f147354e.f146488y.setVisibility(4);
    }
}
