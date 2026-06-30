package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class yb implements q80.x {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.newjsapi.yb f186684a = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.yb();

    @Override // q80.x
    public final void onActivityResult(int i17, int i18, android.content.Intent intent) {
        nw4.g gVar;
        com.tencent.mm.plugin.webview.ui.tools.newjsapi.zb zbVar = com.tencent.mm.plugin.webview.ui.tools.newjsapi.zb.f186713d;
        if (i17 == 224) {
            if (i18 == -1 && intent != null) {
                zbVar.e(intent);
                return;
            }
            java.util.HashMap hashMap = new java.util.HashMap();
            nw4.k kVar = com.tencent.mm.plugin.webview.ui.tools.newjsapi.zb.f186714e;
            if (kVar == null || (gVar = kVar.f340863d) == null) {
                return;
            }
            nw4.y2 y2Var = com.tencent.mm.plugin.webview.ui.tools.newjsapi.zb.f186715f;
            java.lang.String str = y2Var != null ? y2Var.f341013c : null;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            nw4.y2 y2Var2 = com.tencent.mm.plugin.webview.ui.tools.newjsapi.zb.f186715f;
            sb6.append(y2Var2 != null ? y2Var2.f341019i : null);
            sb6.append(":fail RESULT NOT OK");
            gVar.e(str, sb6.toString(), hashMap);
        }
    }
}
