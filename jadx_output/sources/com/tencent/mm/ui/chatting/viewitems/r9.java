package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes5.dex */
public class r9 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f205413d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f205414e;

    public r9(com.tencent.mm.ui.chatting.viewitems.y9 y9Var, com.tencent.mm.storage.f9 f9Var, yb5.d dVar) {
        this.f205413d = f9Var;
        this.f205414e = dVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgGroupSolitatire$ChattingItemAppMsgGroupSolitatireFrom$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.storage.f9 f9Var = this.f205413d;
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemAppMsgGroupSolitatireFrom", "sourceTV click msgId:%s", java.lang.Long.valueOf(f9Var.getMsgId()));
        com.tencent.mm.ui.chatting.w5.m(this.f205414e, f9Var.Q0(), f9Var.getMsgId(), 1);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgGroupSolitatire$ChattingItemAppMsgGroupSolitatireFrom$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
