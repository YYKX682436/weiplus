package com.tencent.mm.ui.chatting;

/* loaded from: classes9.dex */
public final class a8 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.ChattingSendDataToDeviceUI f198367d;

    public a8(com.tencent.mm.ui.chatting.ChattingSendDataToDeviceUI chattingSendDataToDeviceUI) {
        this.f198367d = chattingSendDataToDeviceUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/ChattingSendDataToDeviceUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        l81.b1 b1Var = new l81.b1();
        com.tencent.mm.ui.chatting.ChattingSendDataToDeviceUI chattingSendDataToDeviceUI = this.f198367d;
        r45.fu5 fu5Var = chattingSendDataToDeviceUI.f198235p1;
        b1Var.f317014b = fu5Var != null ? fu5Var.f374601e : null;
        b1Var.f317022f = fu5Var != null ? fu5Var.f374602f : null;
        try {
            r45.fu5 fu5Var2 = chattingSendDataToDeviceUI.f198235p1;
            kotlin.jvm.internal.o.d(fu5Var2);
            b1Var.f317028i = new com.tencent.mm.ui.chatting.z7(new org.json.JSONObject(fu5Var2.f374603g));
        } catch (org.json.JSONException unused) {
        }
        b1Var.f317018d = 0;
        b1Var.f317016c = 2;
        b1Var.f317032k = 1226;
        ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).bj(chattingSendDataToDeviceUI.getContext(), b1Var);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/ChattingSendDataToDeviceUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
