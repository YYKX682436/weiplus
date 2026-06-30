package com.tencent.mm.ui.chatting;

/* loaded from: classes15.dex */
public final class s7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.ChattingSendDataToDeviceUI f202664d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f202665e;

    public s7(com.tencent.mm.ui.chatting.ChattingSendDataToDeviceUI chattingSendDataToDeviceUI, java.util.List list) {
        this.f202664d = chattingSendDataToDeviceUI;
        this.f202665e = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object obj;
        com.tencent.mm.ui.chatting.ChattingSendDataToDeviceUI chattingSendDataToDeviceUI = this.f202664d;
        chattingSendDataToDeviceUI.S.clear();
        chattingSendDataToDeviceUI.S.addAll(this.f202665e);
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = chattingSendDataToDeviceUI.L;
        if (wxRecyclerAdapter != null) {
            wxRecyclerAdapter.notifyDataSetChanged();
        }
        java.util.Iterator it = chattingSendDataToDeviceUI.Q.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (kotlin.jvm.internal.o.b(((com.tencent.mm.feature.exdevice.NetworkDeviceInfo) obj).f66586d, chattingSendDataToDeviceUI.Q1)) {
                    break;
                }
            }
        }
        if (obj == null) {
            com.tencent.mm.feature.exdevice.NetworkDeviceInfo networkDeviceInfo = new com.tencent.mm.feature.exdevice.NetworkDeviceInfo();
            networkDeviceInfo.f66594o = true;
            networkDeviceInfo.f66586d = chattingSendDataToDeviceUI.Q1;
            networkDeviceInfo.f66588f = chattingSendDataToDeviceUI.getString(com.tencent.mm.R.string.c47);
            chattingSendDataToDeviceUI.Q.add(networkDeviceInfo);
        }
    }
}
