package com.tencent.mm.ui.chatting.component;

/* loaded from: classes5.dex */
public class yd implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.le f200311d;

    public yd(com.tencent.mm.ui.chatting.component.le leVar) {
        this.f200311d = leVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/component/GroupToolsComponet$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.roomtools.GroupToolsComponet", "stickManagerLl click");
        com.tencent.mm.ui.chatting.component.le leVar = this.f200311d;
        android.content.Intent intent = new android.content.Intent(leVar.f198580d.g(), (java.lang.Class<?>) com.tencent.mm.chatroom.ui.GroupToolsManagereUI.class);
        intent.putExtra("key_chatroomname", leVar.f198580d.x());
        intent.putParcelableArrayListExtra("key_recent_use_tools", leVar.f199431z);
        android.app.Activity g17 = leVar.f198580d.g();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(g17, arrayList2.toArray(), "com/tencent/mm/ui/chatting/component/GroupToolsComponet$4", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        g17.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(g17, "com/tencent/mm/ui/chatting/component/GroupToolsComponet$4", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        leVar.D.alive();
        yj0.a.h(this, "com/tencent/mm/ui/chatting/component/GroupToolsComponet$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
