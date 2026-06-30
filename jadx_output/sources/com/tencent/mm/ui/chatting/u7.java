package com.tencent.mm.ui.chatting;

/* loaded from: classes15.dex */
public final class u7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.ChattingSendDataToDeviceUI f202737a;

    public u7(com.tencent.mm.ui.chatting.ChattingSendDataToDeviceUI chattingSendDataToDeviceUI) {
        this.f202737a = chattingSendDataToDeviceUI;
    }

    public final boolean a(com.tencent.mm.sdk.event.IEvent iEvent) {
        boolean z17 = iEvent instanceof com.tencent.mm.autogen.events.ExDeviceScanNetworkDeviceResultEvent;
        com.tencent.mm.ui.chatting.ChattingSendDataToDeviceUI chattingSendDataToDeviceUI = this.f202737a;
        if (!z17) {
            if (iEvent instanceof com.tencent.mm.autogen.events.ExDeviceSendDataToNetworkDeviceStateEvent) {
                chattingSendDataToDeviceUI.runOnUiThread(new com.tencent.mm.ui.chatting.t7(iEvent, chattingSendDataToDeviceUI));
            }
            return true;
        }
        com.tencent.mars.xlog.Log.i(chattingSendDataToDeviceUI.f198223d, "on scan event");
        kotlin.jvm.internal.o.e(iEvent, "null cannot be cast to non-null type com.tencent.mm.autogen.events.ExDeviceScanNetworkDeviceResultEvent");
        java.util.List list = ((com.tencent.mm.autogen.events.ExDeviceScanNetworkDeviceResultEvent) iEvent).f54158g.f7872a;
        kotlin.jvm.internal.o.e(list, "null cannot be cast to non-null type kotlin.collections.List<kotlin.collections.Map<kotlin.String, kotlin.String>?>");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = (java.util.ArrayList) list;
        int size = arrayList2.size();
        for (int i17 = 0; i17 < size; i17++) {
            com.tencent.mm.feature.exdevice.NetworkDeviceInfo networkDeviceInfo = new com.tencent.mm.feature.exdevice.NetworkDeviceInfo();
            java.lang.Object obj = arrayList2.get(i17);
            kotlin.jvm.internal.o.d(obj);
            networkDeviceInfo.f66587e = (java.lang.String) ((java.util.Map) obj).get("deviceType");
            java.lang.Object obj2 = arrayList2.get(i17);
            kotlin.jvm.internal.o.d(obj2);
            networkDeviceInfo.f66586d = (java.lang.String) ((java.util.Map) obj2).get("deviceID");
            java.lang.Object obj3 = arrayList2.get(i17);
            kotlin.jvm.internal.o.d(obj3);
            networkDeviceInfo.f66588f = (java.lang.String) ((java.util.Map) obj3).get("displayName");
            java.lang.Object obj4 = arrayList2.get(i17);
            kotlin.jvm.internal.o.d(obj4);
            networkDeviceInfo.f66589g = (java.lang.String) ((java.util.Map) obj4).get("iconUrl");
            java.lang.Object obj5 = arrayList2.get(i17);
            kotlin.jvm.internal.o.d(obj5);
            networkDeviceInfo.f66590h = (java.lang.String) ((java.util.Map) obj5).get("ability");
            java.lang.Object obj6 = arrayList2.get(i17);
            kotlin.jvm.internal.o.d(obj6);
            networkDeviceInfo.f66591i = (java.lang.String) ((java.util.Map) obj6).get("abilityInf");
            networkDeviceInfo.f66592m = chattingSendDataToDeviceUI.G1;
            if ((chattingSendDataToDeviceUI.M && chattingSendDataToDeviceUI.V6(networkDeviceInfo, chattingSendDataToDeviceUI.P)) || (!chattingSendDataToDeviceUI.M && chattingSendDataToDeviceUI.U6(networkDeviceInfo))) {
                arrayList.add(networkDeviceInfo);
            }
        }
        if (chattingSendDataToDeviceUI.S.size() != arrayList.size()) {
            chattingSendDataToDeviceUI.runOnUiThread(new com.tencent.mm.ui.chatting.s7(chattingSendDataToDeviceUI, arrayList));
            if (chattingSendDataToDeviceUI.F1) {
                chattingSendDataToDeviceUI.Z6();
            }
        }
        return true;
    }
}
