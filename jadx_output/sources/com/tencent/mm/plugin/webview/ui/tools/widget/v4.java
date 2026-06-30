package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes3.dex */
public final class v4 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.widget.z5 f187582d;

    public v4(com.tencent.mm.plugin.webview.ui.tools.widget.z5 z5Var) {
        this.f187582d = z5Var;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/widget/MPWriteCommentLayout$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        com.tencent.mm.plugin.webview.ui.tools.widget.z5.j(this.f187582d);
        yj0.a.i(false, this, "com/tencent/mm/plugin/webview/ui/tools/widget/MPWriteCommentLayout$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return false;
    }
}
