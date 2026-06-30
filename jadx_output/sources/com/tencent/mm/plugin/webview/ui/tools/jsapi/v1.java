package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public class v1 implements j35.g0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f185455a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 f185456b;

    public v1(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var, nw4.y2 y2Var) {
        this.f185456b = c1Var;
        this.f185455a = y2Var;
    }

    @Override // j35.g0
    public void a(int i17, int i18, android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgHandler", "doChooseImageIdCard back from settings, resultCode: %d", java.lang.Integer.valueOf(i18));
        nw4.y2 y2Var = this.f185455a;
        com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var = this.f185456b;
        if (i18 == -1) {
            c1Var.w5(y2Var);
        } else {
            c1Var.i5(y2Var, "doChooseIdCard:fail_android_permission_denied", null);
        }
    }
}
