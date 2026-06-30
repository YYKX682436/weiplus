package com.tencent.mm.pluginsdk.ui;

/* loaded from: classes5.dex */
public class w1 implements android.view.View.OnKeyListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.z1 f192036d;

    public w1(com.tencent.mm.pluginsdk.ui.z1 z1Var, com.tencent.mm.pluginsdk.ui.MultiSelectContactView multiSelectContactView) {
        this.f192036d = z1Var;
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(android.view.View view, int i17, android.view.KeyEvent keyEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(keyEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/MultiSelectContactView$ContactHolder$3", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z", this, array);
        if (i17 == 67 && keyEvent.getAction() == 0) {
            com.tencent.mm.pluginsdk.ui.z1 z1Var = this.f192036d;
            if (z1Var.f192104e.getInputText().getSelectionStart() == 0 && z1Var.f192104e.getInputText().getSelectionEnd() == 0) {
                com.tencent.mm.pluginsdk.ui.MultiSelectContactView multiSelectContactView = z1Var.f192104e;
                androidx.recyclerview.widget.RecyclerView recyclerView = multiSelectContactView.f189784d;
                if (recyclerView.getChildCount() != 1) {
                    android.view.View childAt = recyclerView.getChildAt(recyclerView.getChildCount() - 2);
                    if (!multiSelectContactView.f189793p.contains((java.lang.String) childAt.getTag()) && childAt.findViewById(com.tencent.mm.R.id.jbx) != null) {
                        if (multiSelectContactView.f189796s) {
                            multiSelectContactView.g((java.lang.String) childAt.getTag(), true, false);
                            multiSelectContactView.f189796s = false;
                        } else {
                            multiSelectContactView.f189796s = true;
                            int itemCount = recyclerView.getAdapter().getItemCount();
                            int i18 = multiSelectContactView.f189792o.booleanValue() ? itemCount - 2 : itemCount - 1;
                            androidx.recyclerview.widget.RecyclerView recyclerView2 = multiSelectContactView.f189784d;
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                            arrayList2.add(java.lang.Integer.valueOf(i18));
                            java.util.Collections.reverse(arrayList2);
                            yj0.a.d(recyclerView2, arrayList2.toArray(), "com/tencent/mm/pluginsdk/ui/MultiSelectContactView", "scrollToLast", "(Z)V", "Undefined", "smoothScrollToPosition", "(I)V");
                            recyclerView2.c1(((java.lang.Integer) arrayList2.get(0)).intValue());
                            yj0.a.f(recyclerView2, "com/tencent/mm/pluginsdk/ui/MultiSelectContactView", "scrollToLast", "(Z)V", "Undefined", "smoothScrollToPosition", "(I)V");
                            android.view.View findViewById = childAt.findViewById(com.tencent.mm.R.id.jbx);
                            java.util.ArrayList arrayList3 = new java.util.ArrayList();
                            arrayList3.add(0);
                            java.util.Collections.reverse(arrayList3);
                            yj0.a.d(findViewById, arrayList3.toArray(), "com/tencent/mm/pluginsdk/ui/MultiSelectContactView", "tryDelLastContact", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            findViewById.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                            yj0.a.f(findViewById, "com/tencent/mm/pluginsdk/ui/MultiSelectContactView", "tryDelLastContact", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                        multiSelectContactView.getInputText().requestFocus();
                    }
                }
            }
        }
        yj0.a.i(false, this, "com/tencent/mm/pluginsdk/ui/MultiSelectContactView$ContactHolder$3", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
        return false;
    }
}
