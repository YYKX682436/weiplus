package com.tencent.mm.ui.chatting.adapter;

/* loaded from: classes9.dex */
public class c0 implements android.view.View.OnClickListener {
    public c0(com.tencent.mm.ui.chatting.adapter.e0 e0Var) {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/adapter/MediaHistoryListAdapter$BaseHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (com.tencent.mm.ui.chatting.adapter.k0.f198430f != null) {
            int intValue = ((java.lang.Integer) view.getTag()).intValue();
            com.tencent.mm.ui.chatting.adapter.k0.f198430f.a(view, intValue, ((com.tencent.mm.ui.chatting.presenter.y) com.tencent.mm.ui.chatting.adapter.k0.f198431g).h(intValue));
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/adapter/MediaHistoryListAdapter$BaseHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
