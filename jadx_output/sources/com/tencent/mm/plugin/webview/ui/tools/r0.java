package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes5.dex */
public final class r0 implements android.view.View.OnKeyListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.OpenSdkFaceDetectInfoLayout f186795d;

    public r0(com.tencent.mm.plugin.webview.ui.tools.OpenSdkFaceDetectInfoLayout openSdkFaceDetectInfoLayout) {
        this.f186795d = openSdkFaceDetectInfoLayout;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(android.view.View view, int i17, android.view.KeyEvent keyEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(keyEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/OpenSdkFaceDetectInfoLayout$init$3", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z", this, array);
        if (66 != i17 || keyEvent.getAction() != 0) {
            yj0.a.i(false, this, "com/tencent/mm/plugin/webview/ui/tools/OpenSdkFaceDetectInfoLayout$init$3", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
            return false;
        }
        com.tencent.mm.plugin.webview.ui.tools.OpenSdkFaceDetectInfoLayout.a(this.f186795d);
        yj0.a.i(true, this, "com/tencent/mm/plugin/webview/ui/tools/OpenSdkFaceDetectInfoLayout$init$3", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
        return true;
    }
}
