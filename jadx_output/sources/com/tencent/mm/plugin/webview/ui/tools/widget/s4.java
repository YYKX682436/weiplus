package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes5.dex */
public class s4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.widget.MPSmileyFooter f187534d;

    public s4(com.tencent.mm.plugin.webview.ui.tools.widget.MPSmileyFooter mPSmileyFooter) {
        this.f187534d = mPSmileyFooter;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/widget/MPSmileyFooter$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.webview.ui.tools.widget.MPSmileyFooter.f(this.f187534d);
        yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/widget/MPSmileyFooter$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
