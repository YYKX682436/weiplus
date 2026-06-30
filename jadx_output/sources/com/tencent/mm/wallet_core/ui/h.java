package com.tencent.mm.wallet_core.ui;

/* loaded from: classes9.dex */
public class h implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wallet_core.ui.EditHintView f214187d;

    public h(com.tencent.mm.wallet_core.ui.EditHintView editHintView) {
        this.f214187d = editHintView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/wallet_core/ui/EditHintView$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.wallet_core.ui.EditHintView editHintView = this.f214187d;
        if (editHintView.A == null) {
            java.util.Calendar calendar = java.util.Calendar.getInstance();
            calendar.setTimeInMillis(java.lang.System.currentTimeMillis());
            calendar.add(2, 1);
            editHintView.B = calendar.get(1);
            editHintView.C = calendar.get(2);
            editHintView.A = new al5.j1(editHintView.getContext(), 3, new com.tencent.mm.wallet_core.ui.g(this), editHintView.B, editHintView.C, calendar.get(5), calendar.getTimeInMillis());
        }
        editHintView.A.show();
        yj0.a.h(this, "com/tencent/mm/wallet_core/ui/EditHintView$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
