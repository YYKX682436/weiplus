package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes5.dex */
public class t0 implements android.view.View.OnClickListener {
    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.storage.f9 c17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItem$TranslateTextClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        qn4.y yVar = qn4.y.f365302a;
        java.lang.Object tag = view != null ? view.getTag() : null;
        com.tencent.mm.ui.chatting.viewitems.er erVar = tag instanceof com.tencent.mm.ui.chatting.viewitems.er ? (com.tencent.mm.ui.chatting.viewitems.er) tag : null;
        if (erVar != null && (c17 = erVar.c()) != null) {
            qn4.y.e(c17.getMsgId(), 3);
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItem$TranslateTextClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
