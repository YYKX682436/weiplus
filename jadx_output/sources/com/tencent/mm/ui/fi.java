package com.tencent.mm.ui;

/* loaded from: classes3.dex */
public class fi implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.CheckBox f208592d;

    public fi(com.tencent.mm.ui.SingleChatInfoUI singleChatInfoUI, android.widget.CheckBox checkBox) {
        this.f208592d = checkBox;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/SingleChatInfoUI$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f208592d.setChecked(!r7.isChecked());
        yj0.a.h(this, "com/tencent/mm/ui/SingleChatInfoUI$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
