package com.tencent.mm.ui.chatting;

/* loaded from: classes15.dex */
public final class v7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.ChattingSendDataToDeviceUI f202798d;

    public v7(com.tencent.mm.ui.chatting.ChattingSendDataToDeviceUI chattingSendDataToDeviceUI) {
        this.f202798d = chattingSendDataToDeviceUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/ChattingSendDataToDeviceUI$backClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int id6 = view.getId();
        com.tencent.mm.ui.chatting.ChattingSendDataToDeviceUI chattingSendDataToDeviceUI = this.f202798d;
        if (id6 == com.tencent.mm.R.id.lsv) {
            android.view.ViewGroup viewGroup = chattingSendDataToDeviceUI.f198232o;
            if (viewGroup == null) {
                kotlin.jvm.internal.o.o("sendingDeviceLayout");
                throw null;
            }
            if (viewGroup.getVisibility() == 0) {
                com.tencent.mm.feature.exdevice.NetworkDeviceInfo networkDeviceInfo = chattingSendDataToDeviceUI.A1;
                if (!kotlin.jvm.internal.o.b(networkDeviceInfo != null ? networkDeviceInfo.f66592m : null, chattingSendDataToDeviceUI.K1)) {
                    chattingSendDataToDeviceUI.finish();
                    yj0.a.h(this, "com/tencent/mm/ui/chatting/ChattingSendDataToDeviceUI$backClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            }
        }
        chattingSendDataToDeviceUI.onBackPressed();
        yj0.a.h(this, "com/tencent/mm/ui/chatting/ChattingSendDataToDeviceUI$backClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
