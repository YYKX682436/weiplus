package com.tencent.mm.plugin.finder.webview;

/* loaded from: classes8.dex */
public final class h implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.webview.BaseBoxDialogView f136870d;

    public h(com.tencent.mm.plugin.finder.webview.BaseBoxDialogView baseBoxDialogView) {
        this.f136870d = baseBoxDialogView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/webview/BaseBoxDialogView$initDialogBg$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.webview.BaseBoxDialogView baseBoxDialogView = this.f136870d;
        if (!baseBoxDialogView.U) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/webview/BaseBoxDialogView$initDialogBg$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else {
            baseBoxDialogView.c(3);
            yj0.a.h(this, "com/tencent/mm/plugin/finder/webview/BaseBoxDialogView$initDialogBg$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }
}
