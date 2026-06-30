package com.tencent.mm.ui.chatting;

/* loaded from: classes15.dex */
public final class o7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.exdevice.NetworkDeviceInfo f202066d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.ChattingSendDataToDeviceForOpenMsgUI f202067e;

    public o7(com.tencent.mm.feature.exdevice.NetworkDeviceInfo networkDeviceInfo, com.tencent.mm.ui.chatting.ChattingSendDataToDeviceForOpenMsgUI chattingSendDataToDeviceForOpenMsgUI) {
        this.f202066d = networkDeviceInfo;
        this.f202067e = chattingSendDataToDeviceForOpenMsgUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.feature.exdevice.NetworkDeviceInfo networkDeviceInfo = this.f202066d;
        boolean z17 = networkDeviceInfo.f66594o;
        com.tencent.mm.ui.chatting.ChattingSendDataToDeviceForOpenMsgUI chattingSendDataToDeviceForOpenMsgUI = this.f202067e;
        if (z17 && kotlin.jvm.internal.o.b(networkDeviceInfo.f66586d, chattingSendDataToDeviceForOpenMsgUI.Q1)) {
            chattingSendDataToDeviceForOpenMsgUI.X6();
        } else {
            chattingSendDataToDeviceForOpenMsgUI.W6(networkDeviceInfo);
        }
    }
}
