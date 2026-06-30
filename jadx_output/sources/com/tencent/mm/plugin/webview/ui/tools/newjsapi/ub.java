package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class ub implements q80.x {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.newjsapi.ub f186562a = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.ub();

    @Override // q80.x
    public final void onActivityResult(int i17, int i18, android.content.Intent intent) {
        nw4.g gVar;
        if (i17 == 223) {
            if (i18 == -1 && intent != null) {
                kotlinx.coroutines.l.d(kotlinx.coroutines.z0.a(kotlinx.coroutines.q1.f310568a), null, null, new com.tencent.mm.plugin.webview.ui.tools.newjsapi.vb(intent, null), 3, null);
                return;
            }
            java.util.HashMap hashMap = new java.util.HashMap();
            nw4.k kVar = com.tencent.mm.plugin.webview.ui.tools.newjsapi.wb.f186611e;
            if (kVar == null || (gVar = kVar.f340863d) == null) {
                return;
            }
            nw4.y2 y2Var = com.tencent.mm.plugin.webview.ui.tools.newjsapi.wb.f186612f;
            java.lang.String str = y2Var != null ? y2Var.f341013c : null;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            nw4.y2 y2Var2 = com.tencent.mm.plugin.webview.ui.tools.newjsapi.wb.f186612f;
            sb6.append(y2Var2 != null ? y2Var2.f341019i : null);
            sb6.append(":fail RESULT NOT OK");
            gVar.e(str, sb6.toString(), hashMap);
        }
    }
}
