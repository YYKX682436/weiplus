package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes3.dex */
public class n5 implements ym5.v1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.i5 f147220a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatting.component.ListScrollPAGView f147221b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f147222c;

    public n5(com.tencent.mm.plugin.luckymoney.ui.t5 t5Var, com.tencent.mm.plugin.luckymoney.ui.i5 i5Var, com.tencent.mm.chatting.component.ListScrollPAGView listScrollPAGView, in5.s0 s0Var) {
        this.f147220a = i5Var;
        this.f147221b = listScrollPAGView;
        this.f147222c = s0Var;
    }

    @Override // ym5.v1
    public void onFlush() {
        com.tencent.mm.plugin.luckymoney.ui.i5 i5Var = this.f147220a;
        if (i5Var.f147016e || !this.f147221b.f()) {
            return;
        }
        in5.s0 s0Var = this.f147222c;
        android.view.View p17 = s0Var.p(com.tencent.mm.R.id.ikj);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertItem$4", "onFlush", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(p17, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertItem$4", "onFlush", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View p18 = s0Var.p(com.tencent.mm.R.id.ik_);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(4);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(p18, arrayList2.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertItem$4", "onFlush", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(p18, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertItem$4", "onFlush", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View p19 = s0Var.p(com.tencent.mm.R.id.ikh);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(4);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(p19, arrayList3.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertItem$4", "onFlush", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p19.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(p19, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertItem$4", "onFlush", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        s0Var.p(com.tencent.mm.R.id.ikg).setBackgroundResource(com.tencent.mm.R.color.a9e);
        i5Var.f147016e = true;
    }
}
