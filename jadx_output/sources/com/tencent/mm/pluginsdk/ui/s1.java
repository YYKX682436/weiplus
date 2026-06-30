package com.tencent.mm.pluginsdk.ui;

/* loaded from: classes.dex */
public class s1 implements android.view.View.OnClickListener {
    public s1(com.tencent.mm.pluginsdk.ui.MultiSelectContactView multiSelectContactView) {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/MultiSelectContactView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/MultiSelectContactView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
