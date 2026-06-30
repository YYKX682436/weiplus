package com.tencent.mm.ui.chatting;

/* loaded from: classes15.dex */
public final class x7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.ChattingSendDataToDeviceUI f206234d;

    public x7(com.tencent.mm.ui.chatting.ChattingSendDataToDeviceUI chattingSendDataToDeviceUI) {
        this.f206234d = chattingSendDataToDeviceUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/ChattingSendDataToDeviceUI$confirmListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.chatting.ChattingSendDataToDeviceUI chattingSendDataToDeviceUI = this.f206234d;
        com.tencent.mm.feature.exdevice.NetworkDeviceInfo networkDeviceInfo = chattingSendDataToDeviceUI.A1;
        if (networkDeviceInfo == null) {
            yj0.a.h(this, "com/tencent/mm/ui/chatting/ChattingSendDataToDeviceUI$confirmListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        boolean b17 = kotlin.jvm.internal.o.b(networkDeviceInfo.f66592m, chattingSendDataToDeviceUI.H1);
        java.lang.String str = chattingSendDataToDeviceUI.J1;
        if (b17) {
            java.lang.String str2 = chattingSendDataToDeviceUI.f198223d;
            try {
                com.tencent.mm.ui.chatting.ChattingSendDataToDeviceUI.b7(chattingSendDataToDeviceUI, chattingSendDataToDeviceUI.K1, null, null, null, 8, null);
                chattingSendDataToDeviceUI.Y6(3);
                com.tencent.mm.autogen.events.ExDeviceSendDataToNetworkDeviceEvent exDeviceSendDataToNetworkDeviceEvent = new com.tencent.mm.autogen.events.ExDeviceSendDataToNetworkDeviceEvent();
                am.x6 x6Var = exDeviceSendDataToNetworkDeviceEvent.f54163g;
                x6Var.f8351a = networkDeviceInfo.f66586d;
                x6Var.f8352b = networkDeviceInfo.f66587e;
                x6Var.f8354d = chattingSendDataToDeviceUI.f198234p0;
                x6Var.f8353c = networkDeviceInfo.f66590h;
                x6Var.f8358h = networkDeviceInfo.f66594o;
                x6Var.f8359i = networkDeviceInfo.f66595p;
                boolean z17 = chattingSendDataToDeviceUI.M;
                if (z17) {
                    x6Var.f8356f = chattingSendDataToDeviceUI.P;
                    x6Var.f8357g = z17;
                } else {
                    x6Var.f8355e = chattingSendDataToDeviceUI.T;
                    x6Var.f8360j = chattingSendDataToDeviceUI.f198247y0;
                    x6Var.f8361k = chattingSendDataToDeviceUI.f198229l1;
                }
                exDeviceSendDataToNetworkDeviceEvent.e();
                if (!exDeviceSendDataToNetworkDeviceEvent.f54164h.f8437a) {
                    com.tencent.mm.autogen.events.ExDeviceSendDataToNetworkDeviceStateEvent exDeviceSendDataToNetworkDeviceStateEvent = new com.tencent.mm.autogen.events.ExDeviceSendDataToNetworkDeviceStateEvent();
                    exDeviceSendDataToNetworkDeviceStateEvent.f54165g.f8519a = str;
                    exDeviceSendDataToNetworkDeviceStateEvent.e();
                    com.tencent.mars.xlog.Log.e(str2, " e.result.isSuccess is false, send fail!");
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mm.autogen.events.ExDeviceSendDataToNetworkDeviceStateEvent exDeviceSendDataToNetworkDeviceStateEvent2 = new com.tencent.mm.autogen.events.ExDeviceSendDataToNetworkDeviceStateEvent();
                exDeviceSendDataToNetworkDeviceStateEvent2.f54165g.f8519a = str;
                exDeviceSendDataToNetworkDeviceStateEvent2.e();
                com.tencent.mars.xlog.Log.e(str2, "send to device item click exception %s", e17);
            }
        } else if (kotlin.jvm.internal.o.b(networkDeviceInfo.f66592m, str) || kotlin.jvm.internal.o.b(networkDeviceInfo.f66592m, chattingSendDataToDeviceUI.L1) || kotlin.jvm.internal.o.b(networkDeviceInfo.f66592m, chattingSendDataToDeviceUI.I1) || kotlin.jvm.internal.o.b(networkDeviceInfo.f66592m, chattingSendDataToDeviceUI.M1)) {
            if (chattingSendDataToDeviceUI.f198235p1 == null && chattingSendDataToDeviceUI.f198244x0 != null) {
                l81.b1 b1Var = new l81.b1();
                r45.xf4 xf4Var = chattingSendDataToDeviceUI.f198244x0;
                b1Var.f317014b = xf4Var != null ? xf4Var.f390050e : null;
                kotlin.jvm.internal.o.d(xf4Var);
                b1Var.f317022f = xf4Var.f390051f;
                r45.xf4 xf4Var2 = chattingSendDataToDeviceUI.f198244x0;
                kotlin.jvm.internal.o.d(xf4Var2);
                b1Var.f317018d = xf4Var2.f390052g;
                r45.xf4 xf4Var3 = chattingSendDataToDeviceUI.f198244x0;
                kotlin.jvm.internal.o.d(xf4Var3);
                b1Var.f317016c = xf4Var3.f390052g;
                try {
                    r45.xf4 xf4Var4 = chattingSendDataToDeviceUI.f198244x0;
                    kotlin.jvm.internal.o.d(xf4Var4);
                    b1Var.f317028i = new com.tencent.mm.ui.chatting.w7(new org.json.JSONObject(xf4Var4.f390049d));
                } catch (org.json.JSONException unused) {
                }
                l81.p0 p0Var = b1Var.f317028i;
                kotlin.jvm.internal.o.d(p0Var);
                p0Var.a();
                b1Var.f317032k = 1226;
                ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).bj(chattingSendDataToDeviceUI.getContext(), b1Var);
            }
            chattingSendDataToDeviceUI.finish();
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/ChattingSendDataToDeviceUI$confirmListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
