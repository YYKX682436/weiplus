package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class cd implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.ld f184085d;

    public cd(com.tencent.mm.plugin.webview.ui.tools.ld ldVar) {
        this.f184085d = ldVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/WebViewUIStyleHelper$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewUIStyleHelper", "click trans help button");
        com.tencent.mm.plugin.webview.ui.tools.ld ldVar = this.f184085d;
        if (ldVar.f185654e.l8()) {
            ldVar.f185656g.e(cw4.b0.f224197e);
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("translate_to_language", com.tencent.mm.sdk.platformtools.m2.c(ldVar.f185654e));
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("translate_btn_in_webview", "view_clk", hashMap, 30223);
        } else {
            ldVar.f185654e.C8(new com.tencent.mm.plugin.webview.ui.tools.bd(this));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/WebViewUIStyleHelper$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
