package gb0;

@j95.b
/* loaded from: classes8.dex */
public final class i extends i95.w implements j30.m {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f269951d = "MicroMsg.GetOpenDeviceInfoService";

    public final boolean Ai(com.tencent.mm.storage.f9 f9Var, com.tencent.mm.feature.exdevice.NetworkDeviceInfo networkDeviceInfo) {
        java.util.LinkedList linkedList;
        if (f9Var == null) {
            return false;
        }
        java.lang.String str = networkDeviceInfo.f66590h;
        boolean z17 = networkDeviceInfo.f66594o;
        if ((z17 || str != null) && !(z17 && ((linkedList = networkDeviceInfo.f66596q) == null || linkedList.isEmpty()))) {
            return com.tencent.mm.ui.chatting.qc.f202624a.b(f9Var.getType(), f9Var, f9Var.j(), networkDeviceInfo);
        }
        return false;
    }

    public void Bi(android.content.Context context, long j17, java.lang.String str, com.tencent.mm.feature.exdevice.NetworkDeviceInfo networkDeviceInfo) {
        kotlin.jvm.internal.o.g(context, "context");
        if (networkDeviceInfo == null) {
            com.tencent.mars.xlog.Log.w(this.f269951d, "deviceInfo is null, " + j17 + ", " + str);
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(context, "com.tencent.mm.ui.chatting.ChattingSendDataToDeviceForOpenMsgUI");
        intent.putExtra("Retr_Msg_Id", j17);
        intent.putExtra("Retr_MsgTalker", str);
        intent.addFlags(268435456);
        intent.putExtra("NetworkDeviceInfo", networkDeviceInfo);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/feature/openmsg/service/GetOpenDeviceInfoService", "openDevice", "(Landroid/content/Context;JLjava/lang/String;Lcom/tencent/mm/feature/exdevice/NetworkDeviceInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/feature/openmsg/service/GetOpenDeviceInfoService", "openDevice", "(Landroid/content/Context;JLjava/lang/String;Lcom/tencent/mm/feature/exdevice/NetworkDeviceInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public java.util.ArrayList wi(long j17, java.lang.String str) {
        com.tencent.mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent exDeviceHaveBindNetworkDeviceEvent = new com.tencent.mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent();
        am.b6 b6Var = exDeviceHaveBindNetworkDeviceEvent.f54141g;
        b6Var.f6219a = j17;
        b6Var.f6220b = str;
        b6Var.f6222d = -1;
        exDeviceHaveBindNetworkDeviceEvent.e();
        com.tencent.mm.storage.f9 k17 = pt0.f0.f358209b1.k(str, j17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("haveDeviceEvent result.isOk:");
        am.c6 c6Var = exDeviceHaveBindNetworkDeviceEvent.f54142h;
        sb6.append(c6Var.f6336a);
        java.lang.String sb7 = sb6.toString();
        java.lang.String str2 = this.f269951d;
        com.tencent.mars.xlog.Log.i(str2, sb7);
        if (c6Var.f6336a) {
            com.tencent.mm.autogen.events.ExDeviceGetNetworkDeviceInfoEvent exDeviceGetNetworkDeviceInfoEvent = new com.tencent.mm.autogen.events.ExDeviceGetNetworkDeviceInfoEvent();
            am.x5 x5Var = exDeviceGetNetworkDeviceInfoEvent.f54137g;
            x5Var.f8346a = j17;
            x5Var.f8350e = str;
            exDeviceGetNetworkDeviceInfoEvent.e();
            am.y5 y5Var = exDeviceGetNetworkDeviceInfoEvent.f54138h;
            if (y5Var.f8436c) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.util.List list = y5Var.f8434a;
                if (list != null) {
                    kotlin.jvm.internal.o.e(list, "null cannot be cast to non-null type kotlin.collections.List<kotlin.collections.Map<kotlin.String, kotlin.String>?>");
                    java.util.ArrayList arrayList4 = (java.util.ArrayList) list;
                    int size = arrayList4.size();
                    for (int i17 = 0; i17 < size; i17++) {
                        com.tencent.mm.feature.exdevice.NetworkDeviceInfo networkDeviceInfo = new com.tencent.mm.feature.exdevice.NetworkDeviceInfo();
                        java.lang.Object obj = arrayList4.get(i17);
                        kotlin.jvm.internal.o.d(obj);
                        networkDeviceInfo.f66587e = (java.lang.String) ((java.util.Map) obj).get("deviceType");
                        java.lang.Object obj2 = arrayList4.get(i17);
                        kotlin.jvm.internal.o.d(obj2);
                        networkDeviceInfo.f66586d = (java.lang.String) ((java.util.Map) obj2).get("deviceID");
                        java.lang.Object obj3 = arrayList4.get(i17);
                        kotlin.jvm.internal.o.d(obj3);
                        networkDeviceInfo.f66588f = (java.lang.String) ((java.util.Map) obj3).get("displayName");
                        java.lang.Object obj4 = arrayList4.get(i17);
                        kotlin.jvm.internal.o.d(obj4);
                        networkDeviceInfo.f66589g = (java.lang.String) ((java.util.Map) obj4).get("iconUrl");
                        java.lang.Object obj5 = arrayList4.get(i17);
                        kotlin.jvm.internal.o.d(obj5);
                        networkDeviceInfo.f66590h = (java.lang.String) ((java.util.Map) obj5).get("ability");
                        java.lang.Object obj6 = arrayList4.get(i17);
                        kotlin.jvm.internal.o.d(obj6);
                        networkDeviceInfo.f66591i = (java.lang.String) ((java.util.Map) obj6).get("abilityInf");
                        networkDeviceInfo.f66592m = "send_data_idle";
                        if (Ai(k17, networkDeviceInfo)) {
                            arrayList3.add(networkDeviceInfo);
                        }
                    }
                }
                java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.ob8);
                kotlin.jvm.internal.o.f(string, "getString(...)");
                if (y5Var.f8435b != null) {
                    com.tencent.mars.xlog.Log.i(str2, "iotDeviceInfo size =" + ((java.util.ArrayList) y5Var.f8435b).size());
                    java.util.List list2 = y5Var.f8435b;
                    kotlin.jvm.internal.o.e(list2, "null cannot be cast to non-null type kotlin.collections.List<com.tencent.mm.protocal.protobuf.MMIotDeviceInfo>");
                    java.util.Iterator it = ((java.util.ArrayList) list2).iterator();
                    while (it.hasNext()) {
                        r45.pf4 pf4Var = (r45.pf4) it.next();
                        com.tencent.mm.feature.exdevice.NetworkDeviceInfo networkDeviceInfo2 = new com.tencent.mm.feature.exdevice.NetworkDeviceInfo();
                        networkDeviceInfo2.f66586d = pf4Var.f383004e;
                        networkDeviceInfo2.f66595p = pf4Var.f383003d;
                        networkDeviceInfo2.f66588f = pf4Var.f383005f;
                        networkDeviceInfo2.f66589g = pf4Var.f383006g;
                        networkDeviceInfo2.f66596q = pf4Var.f383007h;
                        networkDeviceInfo2.f66594o = true;
                        if (Ai(k17, networkDeviceInfo2)) {
                            int i18 = networkDeviceInfo2.f66595p;
                            if (i18 == 1) {
                                arrayList.add(networkDeviceInfo2);
                            } else if (i18 == 2) {
                                networkDeviceInfo2.f66588f += ' ' + string;
                                arrayList2.add(networkDeviceInfo2);
                            }
                        }
                    }
                }
                arrayList.addAll(arrayList2);
                arrayList.addAll(arrayList3);
                return arrayList;
            }
        }
        com.tencent.mars.xlog.Log.i(str2, "get no device");
        return new java.util.ArrayList();
    }
}
