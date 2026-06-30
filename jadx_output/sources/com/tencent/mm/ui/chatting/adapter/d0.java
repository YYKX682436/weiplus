package com.tencent.mm.ui.chatting.adapter;

/* loaded from: classes9.dex */
public class d0 implements android.view.View.OnLongClickListener {
    public d0(com.tencent.mm.ui.chatting.adapter.e0 e0Var) {
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/adapter/MediaHistoryListAdapter$BaseHolder$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        if (com.tencent.mm.ui.chatting.adapter.k0.f198430f != null) {
            int intValue = ((java.lang.Integer) view.getTag()).intValue();
            com.tencent.mm.ui.chatting.adapter.k0.f198430f.b(view, intValue, ((com.tencent.mm.ui.chatting.presenter.y) com.tencent.mm.ui.chatting.adapter.k0.f198431g).h(intValue));
        }
        yj0.a.i(true, this, "com/tencent/mm/ui/chatting/adapter/MediaHistoryListAdapter$BaseHolder$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
