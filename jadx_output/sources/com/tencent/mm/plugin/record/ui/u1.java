package com.tencent.mm.plugin.record.ui;

/* loaded from: classes3.dex */
public class u1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.record.ui.RecordMsgImageUI f155490d;

    public u1(com.tencent.mm.plugin.record.ui.RecordMsgImageUI recordMsgImageUI) {
        this.f155490d = recordMsgImageUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/record/ui/RecordMsgImageUI$18", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        tg0.f1 f1Var = (tg0.f1) i95.n0.c(tg0.f1.class);
        com.tencent.mm.plugin.record.ui.RecordMsgImageUI recordMsgImageUI = this.f155490d;
        ((sg0.e) f1Var).wi(recordMsgImageUI.getContext(), 6, 1, recordMsgImageUI.W6());
        yj0.a.h(this, "com/tencent/mm/plugin/record/ui/RecordMsgImageUI$18", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
