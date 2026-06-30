package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes9.dex */
public final class h5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.widget.l5 f187250d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.ck f187251e;

    public h5(com.tencent.mm.plugin.webview.ui.tools.widget.l5 l5Var, r45.ck ckVar) {
        this.f187250d = l5Var;
        this.f187251e = ckVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/widget/MPWriteCommentLayout$MPMyCommentItemAdapter$updateCommentContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.webview.ui.tools.widget.l5 l5Var = this.f187250d;
        android.content.Context context = l5Var.f187382d;
        com.tencent.mm.ui.widget.dialog.a aVar = new com.tencent.mm.ui.widget.dialog.a();
        aVar.f211709a = l5Var.f187382d.getString(com.tencent.mm.R.string.anl);
        aVar.f211729s = "";
        aVar.W = l5Var.f187382d.getResources().getColor(com.tencent.mm.R.color.Red_100);
        aVar.f211732v = of5.b.a(context).getString(com.tencent.mm.R.string.f490367t0);
        aVar.E = new com.tencent.mm.plugin.webview.ui.tools.widget.g5(this.f187251e, l5Var);
        aVar.f211733w = of5.b.a(context).getString(com.tencent.mm.R.string.apj);
        com.tencent.mm.ui.widget.dialog.j0 j0Var = new com.tencent.mm.ui.widget.dialog.j0(context, com.tencent.mm.R.style.f494791wd);
        j0Var.e(aVar);
        com.tencent.mm.ui.widget.dialog.d0 d0Var = aVar.f211723m;
        if (d0Var != null) {
            d0Var.a(j0Var.f211837r);
        }
        j0Var.show();
        yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/widget/MPWriteCommentLayout$MPMyCommentItemAdapter$updateCommentContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
