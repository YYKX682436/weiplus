package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes5.dex */
public class z9 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f206118d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f206119e;

    public z9(com.tencent.mm.ui.chatting.viewitems.ga gaVar, com.tencent.mm.storage.f9 f9Var, yb5.d dVar) {
        this.f206118d = f9Var;
        this.f206119e = dVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgGroupSolitatire$ChattingItemAppMsgGroupSolitatireTo$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.storage.f9 f9Var = this.f206118d;
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemAppMsgGroupSolitatireTo", "sourceTV click msgId:%s", java.lang.Long.valueOf(f9Var.getMsgId()));
        com.tencent.mm.ui.chatting.w5.m(this.f206119e, f9Var.Q0(), f9Var.getMsgId(), 1);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgGroupSolitatire$ChattingItemAppMsgGroupSolitatireTo$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
