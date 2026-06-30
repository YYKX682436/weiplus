package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class s5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.b5 f186840d;

    public s5(com.tencent.mm.plugin.webview.ui.tools.b5 b5Var) {
        this.f186840d = b5Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/WebViewLongClickHelper$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.webview.ui.tools.b5.f183927t = true;
        com.tencent.mm.plugin.webview.ui.tools.b5 b5Var = this.f186840d;
        dx4.f fVar = b5Var.f183947o;
        if (fVar != null && fVar.getController() != null) {
            b5Var.f183947o.getController().O0(3);
        }
        com.tencent.mm.ui.widget.dialog.k0 k0Var = b5Var.f183938f;
        if (k0Var != null && k0Var.i()) {
            b5Var.f183938f.u();
        }
        com.tencent.mm.plugin.scanner.c0.b(b5Var.l(), b5Var.f183947o.getController().f181916a, b5Var.f183933a, b5Var.f183947o.getWVTopOffset(), new com.tencent.mm.plugin.webview.ui.tools.r5(this));
        yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/WebViewLongClickHelper$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
