package com.tencent.mm.ui.chatting;

/* loaded from: classes11.dex */
public final class e8 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.ChattingSendDataToDeviceUI f200465d;

    public e8(com.tencent.mm.ui.chatting.ChattingSendDataToDeviceUI chattingSendDataToDeviceUI) {
        this.f200465d = chattingSendDataToDeviceUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/ChattingSendDataToDeviceUI$onCreate$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.chatting.ChattingSendDataToDeviceUI chattingSendDataToDeviceUI = this.f200465d;
        android.view.ViewGroup viewGroup = chattingSendDataToDeviceUI.f198224e;
        if (viewGroup == null) {
            kotlin.jvm.internal.o.o("deviceMainLayout");
            throw null;
        }
        com.tencent.mm.ui.chatting.ChattingSendDataToDeviceUI.c7(chattingSendDataToDeviceUI, viewGroup, 0, 0L, 2, null);
        com.tencent.mm.ui.chatting.ChattingSendDataToDeviceUI chattingSendDataToDeviceUI2 = this.f200465d;
        android.view.ViewGroup viewGroup2 = chattingSendDataToDeviceUI2.f198231n;
        if (viewGroup2 == null) {
            kotlin.jvm.internal.o.o("otherDeviceLayout");
            throw null;
        }
        com.tencent.mm.ui.chatting.ChattingSendDataToDeviceUI.c7(chattingSendDataToDeviceUI2, viewGroup2, 8, 0L, 2, null);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/ChattingSendDataToDeviceUI$onCreate$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
