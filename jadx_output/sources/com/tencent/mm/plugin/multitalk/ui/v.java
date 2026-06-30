package com.tencent.mm.plugin.multitalk.ui;

/* loaded from: classes11.dex */
public class v implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.ui.MultiTalkSelectContactUI f150305d;

    public v(com.tencent.mm.plugin.multitalk.ui.MultiTalkSelectContactUI multiTalkSelectContactUI) {
        this.f150305d = multiTalkSelectContactUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/multitalk/ui/MultiTalkSelectContactUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view instanceof android.widget.ImageView) {
            java.lang.String str = (java.lang.String) view.getTag();
            com.tencent.mm.plugin.multitalk.ui.MultiTalkSelectContactUI multiTalkSelectContactUI = this.f150305d;
            com.tencent.mm.ui.contact.p4 b76 = multiTalkSelectContactUI.b7();
            if (c01.z1.r().equals(str)) {
                yj0.a.h(this, "com/tencent/mm/plugin/multitalk/ui/MultiTalkSelectContactUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            multiTalkSelectContactUI.Y6();
            if (multiTalkSelectContactUI.F.contains(str)) {
                if (multiTalkSelectContactUI.H) {
                    multiTalkSelectContactUI.I.b(str);
                }
                multiTalkSelectContactUI.F.remove(str);
                multiTalkSelectContactUI.G.remove(str);
            }
            ((sj3.q5) multiTalkSelectContactUI.f150250J.getAdapter()).B(multiTalkSelectContactUI.G, multiTalkSelectContactUI.N);
            androidx.recyclerview.widget.RecyclerView recyclerView = multiTalkSelectContactUI.f150250J;
            int itemCount = recyclerView.getAdapter().getItemCount() - 1;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(java.lang.Integer.valueOf(itemCount));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(recyclerView, arrayList2.toArray(), "com/tencent/mm/plugin/multitalk/ui/MultiTalkSelectContactUI$2", "onClick", "(Landroid/view/View;)V", "Undefined", "scrollToPosition", "(I)V");
            recyclerView.a1(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(recyclerView, "com/tencent/mm/plugin/multitalk/ui/MultiTalkSelectContactUI$2", "onClick", "(Landroid/view/View;)V", "Undefined", "scrollToPosition", "(I)V");
            b76.notifyDataSetChanged();
            multiTalkSelectContactUI.w7();
            multiTalkSelectContactUI.K.setContentDescription(((sj3.q5) multiTalkSelectContactUI.f150250J.getAdapter()).y().toString());
        }
        yj0.a.h(this, "com/tencent/mm/plugin/multitalk/ui/MultiTalkSelectContactUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
