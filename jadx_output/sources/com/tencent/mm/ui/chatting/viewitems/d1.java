package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes3.dex */
public class d1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f203755d;

    public d1(com.tencent.mm.ui.chatting.viewitems.i1 i1Var, com.tencent.mm.ui.widget.dialog.k0 k0Var) {
        this.f203755d = k0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItemAppBrandNotifyMsg$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f203755d.u();
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppBrandNotifyMsg$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
