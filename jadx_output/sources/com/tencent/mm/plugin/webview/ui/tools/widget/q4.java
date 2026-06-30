package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes5.dex */
public class q4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.widget.MPSmileyFooter f187512d;

    public q4(com.tencent.mm.plugin.webview.ui.tools.widget.MPSmileyFooter mPSmileyFooter) {
        this.f187512d = mPSmileyFooter;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/widget/MPSmileyFooter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.webview.ui.tools.widget.MPSmileyFooter mPSmileyFooter = this.f187512d;
        if (mPSmileyFooter.getVisibility() == 8) {
            mPSmileyFooter.setVisibility(0);
        }
        if (mPSmileyFooter.h()) {
            mPSmileyFooter.f187043h.h();
            mPSmileyFooter.f187043h.setVisibility(8);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/widget/MPSmileyFooter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
