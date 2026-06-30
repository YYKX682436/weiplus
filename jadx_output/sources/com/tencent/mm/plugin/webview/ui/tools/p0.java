package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes5.dex */
public final class p0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.OpenSdkFaceDetectInfoLayout f186742d;

    public p0(com.tencent.mm.plugin.webview.ui.tools.OpenSdkFaceDetectInfoLayout openSdkFaceDetectInfoLayout) {
        this.f186742d = openSdkFaceDetectInfoLayout;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/OpenSdkFaceDetectInfoLayout$init$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.webview.ui.tools.OpenSdkFaceDetectInfoLayout.a(this.f186742d);
        yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/OpenSdkFaceDetectInfoLayout$init$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
