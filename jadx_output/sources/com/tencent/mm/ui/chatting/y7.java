package com.tencent.mm.ui.chatting;

/* loaded from: classes.dex */
public final class y7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.ChattingSendDataToDeviceUI f206259d;

    public y7(com.tencent.mm.ui.chatting.ChattingSendDataToDeviceUI chattingSendDataToDeviceUI) {
        this.f206259d = chattingSendDataToDeviceUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/ChattingSendDataToDeviceUI$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        l81.b1 b1Var = new l81.b1();
        b1Var.f317014b = "wxd930c3b7cf7c92e6";
        b1Var.f317022f = "pages/device-discovery/device-discovery.html";
        b1Var.f317018d = 0;
        b1Var.f317016c = 0;
        b1Var.f317032k = 1112;
        ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).bj(this.f206259d.getContext(), b1Var);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/ChattingSendDataToDeviceUI$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
