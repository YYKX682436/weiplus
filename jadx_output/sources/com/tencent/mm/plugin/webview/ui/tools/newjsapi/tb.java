package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class tb implements com.tencent.mm.ui.zc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f186548a;

    public tb(java.util.HashMap hashMap) {
        this.f186548a = hashMap;
    }

    @Override // com.tencent.mm.ui.zc
    public final void a(int i17, android.content.Intent intent) {
        nw4.g gVar;
        if (i17 == -1 && intent != null) {
            kotlinx.coroutines.l.d(kotlinx.coroutines.z0.a(kotlinx.coroutines.q1.f310568a), null, null, new com.tencent.mm.plugin.webview.ui.tools.newjsapi.vb(intent, null), 3, null);
            return;
        }
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
        gVar.e(str, sb6.toString(), this.f186548a);
    }
}
