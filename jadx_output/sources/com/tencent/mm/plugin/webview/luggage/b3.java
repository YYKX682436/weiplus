package com.tencent.mm.plugin.webview.luggage;

/* loaded from: classes8.dex */
public class b3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.w3 f182152d;

    public b3(com.tencent.mm.plugin.webview.luggage.w3 w3Var) {
        this.f182152d = w3Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/luggage/LuggageWebViewLongClickHelper$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.webview.luggage.w3 w3Var = this.f182152d;
        com.tencent.mm.ui.widget.dialog.k0 k0Var = w3Var.f182667h;
        if (k0Var != null && k0Var.i()) {
            w3Var.f182667h.u();
        }
        w3Var.getClass();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("type", 3);
        bundle.putString("preUsername", w3Var.f182669j.f406657n.getString("preUsername"));
        bundle.putString("preChatName", w3Var.f182669j.f406657n.getString("preChatName"));
        bundle.putString("rawUrl", w3Var.f182669j.s());
        java.lang.String string = w3Var.f182669j.f406657n.getString("pre_username");
        if (string == null || !com.tencent.mm.plugin.webview.luggage.util.g.c(string)) {
            bundle.putString("pre_username", w3Var.f182669j.f406657n.getString(com.tencent.mm.ui.w2.f211203p));
        } else {
            bundle.putString("pre_username", string);
        }
        bundle.putString("result", w3Var.f182660a);
        java.lang.String str = w3Var.f182660a;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            str = "";
        } else if (str.length() > 1024) {
            str = str.substring(0, 1024);
        }
        bundle.putString("imageUrl", str);
        bundle.putString("url", w3Var.f182669j.u());
        bundle.putInt("codeType", w3Var.f182662c);
        bundle.putInt("codeVersion", w3Var.f182663d);
        if (w3Var.f182661b != null) {
            java.lang.String Ri = ((jd0.d2) ((kd0.s2) i95.n0.c(kd0.s2.class))).Ri(java.lang.String.valueOf(java.lang.System.currentTimeMillis()));
            com.tencent.mm.vfs.w6.R(Ri, w3Var.f182661b);
            bundle.putString(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, Ri);
            w3Var.f182661b = null;
        }
        com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, bundle, com.tencent.mm.plugin.webview.luggage.LuggageWebViewLongClickHelper$QBarLogicTask.class, null);
        yj0.a.h(this, "com/tencent/mm/plugin/webview/luggage/LuggageWebViewLongClickHelper$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
