package com.tencent.mm.plugin.record.ui;

/* loaded from: classes9.dex */
public class e1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.record.ui.RecordMsgFileUI f155383d;

    public e1(com.tencent.mm.plugin.record.ui.RecordMsgFileUI recordMsgFileUI) {
        this.f155383d = recordMsgFileUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/record/ui/RecordMsgFileUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean b17 = fp.i.b();
        com.tencent.mm.plugin.record.ui.RecordMsgFileUI recordMsgFileUI = this.f155383d;
        if (!b17) {
            db5.e1.i(recordMsgFileUI.getContext(), com.tencent.mm.R.string.cbp, com.tencent.mm.R.string.f490573yv);
            yj0.a.h(this, "com/tencent/mm/plugin/record/ui/RecordMsgFileUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        bt3.g2.O(recordMsgFileUI.f155300v, recordMsgFileUI.f155298t, recordMsgFileUI.f155297s, true);
        recordMsgFileUI.D = true;
        recordMsgFileUI.V6();
        recordMsgFileUI.b7(7, 1);
        yj0.a.h(this, "com/tencent/mm/plugin/record/ui/RecordMsgFileUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
