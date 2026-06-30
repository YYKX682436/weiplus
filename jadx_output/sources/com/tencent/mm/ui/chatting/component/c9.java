package com.tencent.mm.ui.chatting.component;

/* loaded from: classes8.dex */
public class c9 implements l75.q0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.b9 f198879d;

    public c9(com.tencent.mm.ui.chatting.component.b9 b9Var) {
        this.f198879d = b9Var;
    }

    @Override // l75.q0
    public void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onNotifyChange event=");
        sb6.append(str);
        sb6.append(" talkerUserName=");
        com.tencent.mm.ui.chatting.component.b9 b9Var = this.f198879d;
        sb6.append(b9Var.f198580d.x());
        com.tencent.mars.xlog.Log.i("ChattingW1wComponent", sb6.toString());
        if (str == null || !str.equals(b9Var.f198580d.x())) {
            return;
        }
        b9Var.n0();
        int i17 = ((fr4.g0) ((gr4.f) i95.n0.c(gr4.f.class))).Vi().y0(b9Var.f198580d.x()).field_status;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("sessionStatus=");
        sb7.append(i17);
        sb7.append(" w1wTopSysMsgView=");
        sb7.append(b9Var.f198721e != null);
        com.tencent.mars.xlog.Log.i("ChattingW1wComponent", sb7.toString());
        if (i17 != 2 || b9Var.f198721e == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("ChattingW1wComponent", "Hiding tips UI");
        android.view.View view = b9Var.f198721e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/component/ChattingW1wComponent$1", "onNotifyChange", "(Ljava/lang/String;Lcom/tencent/mm/sdk/storage/MStorageEventData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/chatting/component/ChattingW1wComponent$1", "onNotifyChange", "(Ljava/lang/String;Lcom/tencent/mm/sdk/storage/MStorageEventData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        b9Var.m0(0);
        b9Var.f198721e = null;
    }
}
