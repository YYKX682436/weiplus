package com.tencent.mm.plugin.webview.luggage;

/* loaded from: classes8.dex */
public class c3 implements com.tencent.mm.pluginsdk.ui.tools.g9 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.w3 f182157a;

    public c3(com.tencent.mm.plugin.webview.luggage.w3 w3Var) {
        this.f182157a = w3Var;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.g9
    public void a(java.lang.String str) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("img_path", str);
        android.content.Context context = this.f182157a.f182669j.f406610d;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("task_class_name", com.tencent.mm.plugin.webview.luggage.v3.class.getName());
        intent.putExtra("input_data", bundle);
        intent.putExtra("orientation", -1);
        j45.l.j(context, "webview", ".luggage.ipc.IpcProxyUI", intent, null);
    }
}
