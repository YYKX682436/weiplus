package com.tencent.mm.ui.chatting;

/* loaded from: classes15.dex */
public final class c8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.ChattingSendDataToDeviceUI f198518d;

    public c8(com.tencent.mm.ui.chatting.ChattingSendDataToDeviceUI chattingSendDataToDeviceUI) {
        this.f198518d = chattingSendDataToDeviceUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.feature.exdevice.NetworkDeviceInfo networkDeviceInfo;
        com.tencent.mm.ui.chatting.ChattingSendDataToDeviceUI chattingSendDataToDeviceUI = this.f198518d;
        com.tencent.mm.plugin.exdevice.api.IExdeviceSendPoiMessageExportApi$ExDeviceInfo iExdeviceSendPoiMessageExportApi$ExDeviceInfo = chattingSendDataToDeviceUI.B1;
        kotlin.jvm.internal.o.d(iExdeviceSendPoiMessageExportApi$ExDeviceInfo);
        java.lang.String deviceId = iExdeviceSendPoiMessageExportApi$ExDeviceInfo.f98798e;
        kotlin.jvm.internal.o.f(deviceId, "deviceId");
        java.util.Iterator it = chattingSendDataToDeviceUI.Q.iterator();
        while (true) {
            if (!it.hasNext()) {
                java.util.Iterator it6 = chattingSendDataToDeviceUI.S.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        java.util.Iterator it7 = chattingSendDataToDeviceUI.R.iterator();
                        while (true) {
                            if (!it7.hasNext()) {
                                networkDeviceInfo = null;
                                break;
                            } else {
                                networkDeviceInfo = (com.tencent.mm.feature.exdevice.NetworkDeviceInfo) it7.next();
                                if (networkDeviceInfo.f66586d.equals(deviceId)) {
                                    break;
                                }
                            }
                        }
                    } else {
                        networkDeviceInfo = (com.tencent.mm.feature.exdevice.NetworkDeviceInfo) it6.next();
                        if (networkDeviceInfo.f66586d.equals(deviceId)) {
                            break;
                        }
                    }
                }
            } else {
                networkDeviceInfo = (com.tencent.mm.feature.exdevice.NetworkDeviceInfo) it.next();
                if (networkDeviceInfo.f66586d.equals(deviceId)) {
                    break;
                }
            }
        }
        chattingSendDataToDeviceUI.A1 = networkDeviceInfo;
        com.tencent.mm.ui.chatting.ChattingSendDataToDeviceUI chattingSendDataToDeviceUI2 = this.f198518d;
        chattingSendDataToDeviceUI2.f198250z1 = true;
        android.view.ViewGroup viewGroup = chattingSendDataToDeviceUI2.f198232o;
        if (viewGroup == null) {
            kotlin.jvm.internal.o.o("sendingDeviceLayout");
            throw null;
        }
        com.tencent.mm.ui.chatting.ChattingSendDataToDeviceUI.c7(chattingSendDataToDeviceUI2, viewGroup, 0, 0L, 2, null);
        com.tencent.mm.ui.chatting.ChattingSendDataToDeviceUI chattingSendDataToDeviceUI3 = this.f198518d;
        android.view.ViewGroup viewGroup2 = chattingSendDataToDeviceUI3.f198224e;
        if (viewGroup2 == null) {
            kotlin.jvm.internal.o.o("deviceMainLayout");
            throw null;
        }
        com.tencent.mm.ui.chatting.ChattingSendDataToDeviceUI.c7(chattingSendDataToDeviceUI3, viewGroup2, 8, 0L, 2, null);
        com.tencent.mm.ui.chatting.ChattingSendDataToDeviceUI chattingSendDataToDeviceUI4 = this.f198518d;
        com.tencent.mm.ui.chatting.ChattingSendDataToDeviceUI.b7(chattingSendDataToDeviceUI4, chattingSendDataToDeviceUI4.H1, null, null, null, 8, null);
    }
}
