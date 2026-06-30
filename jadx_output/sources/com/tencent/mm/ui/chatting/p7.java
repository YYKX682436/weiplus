package com.tencent.mm.ui.chatting;

/* loaded from: classes11.dex */
public final class p7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.ChattingSendDataToDeviceForOpenMsgUI f202085d;

    public p7(com.tencent.mm.ui.chatting.ChattingSendDataToDeviceForOpenMsgUI chattingSendDataToDeviceForOpenMsgUI) {
        this.f202085d = chattingSendDataToDeviceForOpenMsgUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/ChattingSendDataToDeviceForOpenMsgUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f202085d.finish();
        yj0.a.h(this, "com/tencent/mm/ui/chatting/ChattingSendDataToDeviceForOpenMsgUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
