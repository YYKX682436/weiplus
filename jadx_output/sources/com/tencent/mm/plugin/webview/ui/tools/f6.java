package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class f6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jd f184170d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.c6 f184171e;

    public f6(com.tencent.mm.plugin.webview.ui.tools.c6 c6Var, com.tencent.mm.plugin.webview.ui.tools.jd jdVar) {
        this.f184171e = c6Var;
        this.f184170d = jdVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/WebViewMenuHelper$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.webview.ui.tools.c6 c6Var = this.f184171e;
        c6Var.i0("Contact_Scene", ib1.t.CTRL_INDEX);
        com.tencent.mm.plugin.webview.model.t5.a(c6Var.c().F7(), 38, 1);
        c6Var.c().V8(this.f184170d.f184871a);
        com.tencent.mm.ui.widget.dialog.k0 k0Var = c6Var.f184044J;
        if (k0Var != null) {
            k0Var.u();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/WebViewMenuHelper$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
