package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes5.dex */
public class o4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.p4 f147257d;

    public o4(com.tencent.mm.plugin.luckymoney.ui.p4 p4Var) {
        this.f147257d = p4Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.luckymoney.ui.p4 p4Var = this.f147257d;
        android.view.View view = p4Var.f147305d.f147405f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$14$1$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$14$1$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p4Var.f147305d.f147406g.setVisibility(4);
        android.view.View view2 = p4Var.f147305d.f147407h;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(4);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$14$1$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$14$1$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p4Var.f147305d.f147408i.setBackgroundResource(com.tencent.mm.R.color.a9e);
    }
}
