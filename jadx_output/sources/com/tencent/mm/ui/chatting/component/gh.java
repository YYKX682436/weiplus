package com.tencent.mm.ui.chatting.component;

/* loaded from: classes3.dex */
public class gh implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f199103d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.ah f199104e;

    public gh(com.tencent.mm.ui.chatting.component.ah ahVar, com.tencent.mm.storage.f9 f9Var) {
        this.f199104e = ahVar;
        this.f199103d = f9Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.ui.chatting.component.ah ahVar = this.f199104e;
        intent.setClassName(ahVar.f198580d.g(), "com.tencent.mm.ui.chatting.ChattingSendDataToDeviceUI");
        com.tencent.mm.storage.f9 f9Var = this.f199103d;
        intent.putExtra("Retr_Msg_Id", f9Var.getMsgId());
        intent.putExtra("Retr_MsgTalker", f9Var.Q0());
        com.tencent.mm.ui.chatting.BaseChattingUIFragment baseChattingUIFragment = ahVar.f198580d.f460717l;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(baseChattingUIFragment, arrayList.toArray(), "com/tencent/mm/ui/chatting/component/MessBoxComponent$6", "invoke", "()Lkotlin/Unit;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        baseChattingUIFragment.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(baseChattingUIFragment, "com/tencent/mm/ui/chatting/component/MessBoxComponent$6", "invoke", "()Lkotlin/Unit;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return null;
    }
}
