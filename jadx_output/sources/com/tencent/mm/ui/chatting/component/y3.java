package com.tencent.mm.ui.chatting.component;

/* loaded from: classes12.dex */
public class y3 implements l75.q0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.x3 f200280d;

    public y3(com.tencent.mm.ui.chatting.component.x3 x3Var) {
        this.f200280d = x3Var;
    }

    @Override // l75.q0
    public void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        if (w0Var == null) {
            return;
        }
        java.lang.Object obj = w0Var.f316976d;
        if (obj instanceof java.lang.String) {
            java.lang.String str2 = (java.lang.String) obj;
            com.tencent.mm.ui.chatting.component.x3 x3Var = this.f200280d;
            yb5.d dVar = x3Var.f198580d;
            java.lang.String x17 = dVar == null ? null : dVar.x();
            if (android.text.TextUtils.isEmpty(str2) || android.text.TextUtils.isEmpty(x17) || !str2.equals(x17) || !k41.h1.d(x17)) {
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingFooterToolbarComponent", "kefuContactChangeListener onNotifyChange, username: " + x17 + ", rtryShowToolbarInCache");
            x3Var.r0();
        }
    }
}
