package com.tencent.mm.ui.chatting;

/* loaded from: classes9.dex */
public final class t7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.event.IEvent f202706d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.ChattingSendDataToDeviceUI f202707e;

    public t7(com.tencent.mm.sdk.event.IEvent iEvent, com.tencent.mm.ui.chatting.ChattingSendDataToDeviceUI chattingSendDataToDeviceUI) {
        this.f202706d = iEvent;
        this.f202707e = chattingSendDataToDeviceUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r45.yf4 yf4Var;
        r45.xf4 xf4Var;
        com.tencent.mm.sdk.event.IEvent iEvent = this.f202706d;
        kotlin.jvm.internal.o.e(iEvent, "null cannot be cast to non-null type com.tencent.mm.autogen.events.ExDeviceSendDataToNetworkDeviceStateEvent");
        com.tencent.mm.autogen.events.ExDeviceSendDataToNetworkDeviceStateEvent exDeviceSendDataToNetworkDeviceStateEvent = (com.tencent.mm.autogen.events.ExDeviceSendDataToNetworkDeviceStateEvent) iEvent;
        am.z6 z6Var = exDeviceSendDataToNetworkDeviceStateEvent.f54165g;
        java.lang.String str = z6Var.f8519a;
        java.lang.String str2 = z6Var.f8521c;
        com.tencent.mm.ui.chatting.ChattingSendDataToDeviceUI chattingSendDataToDeviceUI = this.f202707e;
        java.lang.String str3 = chattingSendDataToDeviceUI.f198223d;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(z6Var.f8520b);
        am.z6 z6Var2 = exDeviceSendDataToNetworkDeviceStateEvent.f54165g;
        com.tencent.mars.xlog.Log.i(str3, "sendDataState %s deviceId %s progress %d ", str, str2, valueOf, z6Var2.f8522d);
        com.tencent.mm.feature.exdevice.NetworkDeviceInfo networkDeviceInfo = chattingSendDataToDeviceUI.A1;
        if (networkDeviceInfo != null && kotlin.jvm.internal.o.b(networkDeviceInfo.f66586d, str2)) {
            if (z6Var2.f8522d != null) {
                com.tencent.mars.xlog.Log.i(chattingSendDataToDeviceUI.f198223d, "event.data.msg != null");
                r45.yf4 yf4Var2 = new r45.yf4();
                yf4Var2.parseFrom(z6Var2.f8522d);
                yf4Var = yf4Var2;
            } else {
                yf4Var = null;
            }
            if (z6Var2.f8523e != null) {
                xf4Var = new r45.xf4();
                xf4Var.parseFrom(z6Var2.f8523e);
            } else {
                xf4Var = null;
            }
            if (z6Var2.f8524f != null) {
                chattingSendDataToDeviceUI.f198235p1 = new r45.fu5();
                r45.fu5 fu5Var = chattingSendDataToDeviceUI.f198235p1;
                if (fu5Var != null) {
                    fu5Var.parseFrom(z6Var2.f8524f);
                }
                java.lang.String str4 = chattingSendDataToDeviceUI.f198223d;
                java.lang.Object[] objArr = new java.lang.Object[5];
                r45.fu5 fu5Var2 = chattingSendDataToDeviceUI.f198235p1;
                objArr[0] = fu5Var2 != null ? fu5Var2.f374604h : null;
                objArr[1] = fu5Var2 != null ? fu5Var2.f374600d : null;
                objArr[2] = fu5Var2 != null ? fu5Var2.f374601e : null;
                objArr[3] = fu5Var2 != null ? fu5Var2.f374602f : null;
                objArr[4] = fu5Var2 != null ? fu5Var2.f374603g : null;
                com.tencent.mars.xlog.Log.i(str4, "ssvInfo: icon_url: %s wording: %s app_id: %s app_path: %s extra_data: %s", objArr);
            }
            com.tencent.mm.ui.chatting.ChattingSendDataToDeviceUI chattingSendDataToDeviceUI2 = this.f202707e;
            kotlin.jvm.internal.o.d(str);
            com.tencent.mm.ui.chatting.ChattingSendDataToDeviceUI.b7(chattingSendDataToDeviceUI2, str, xf4Var, yf4Var, null, 8, null);
        }
    }
}
