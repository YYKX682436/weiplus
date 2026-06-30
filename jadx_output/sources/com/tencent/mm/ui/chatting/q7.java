package com.tencent.mm.ui.chatting;

/* loaded from: classes15.dex */
public final class q7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.exdevice.NetworkDeviceInfo f202615d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.ChattingSendDataToDeviceUI f202616e;

    public q7(com.tencent.mm.feature.exdevice.NetworkDeviceInfo networkDeviceInfo, com.tencent.mm.ui.chatting.ChattingSendDataToDeviceUI chattingSendDataToDeviceUI) {
        this.f202615d = networkDeviceInfo;
        this.f202616e = chattingSendDataToDeviceUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/ChattingSendDataToDeviceUI$DeviceConverter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.feature.exdevice.NetworkDeviceInfo networkDeviceInfo = this.f202615d;
        boolean z17 = networkDeviceInfo.f66594o;
        com.tencent.mm.ui.chatting.ChattingSendDataToDeviceUI chattingSendDataToDeviceUI = this.f202616e;
        if (z17 && kotlin.jvm.internal.o.b(networkDeviceInfo.f66586d, chattingSendDataToDeviceUI.Q1)) {
            chattingSendDataToDeviceUI.X6();
        } else {
            chattingSendDataToDeviceUI.W6(networkDeviceInfo);
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/ChattingSendDataToDeviceUI$DeviceConverter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
