package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes.dex */
public class e7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.widget.f7 f187203d;

    public e7(com.tencent.mm.plugin.webview.ui.tools.widget.f7 f7Var) {
        this.f187203d = f7Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/widget/WebMenuContainerDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.webview.ui.tools.widget.f7 f7Var = this.f187203d;
        if (f7Var.isShowing()) {
            f7Var.cancel();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/widget/WebMenuContainerDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
