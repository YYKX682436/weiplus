package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class dg implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.of f203791d;

    public dg(com.tencent.mm.ui.chatting.viewitems.zf zfVar, com.tencent.mm.ui.chatting.viewitems.of ofVar) {
        this.f203791d = ofVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f203791d.f205188a.performClick();
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
