package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes5.dex */
public final class q0 implements android.widget.TextView.OnEditorActionListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.OpenSdkFaceDetectInfoLayout f186764d;

    public q0(com.tencent.mm.plugin.webview.ui.tools.OpenSdkFaceDetectInfoLayout openSdkFaceDetectInfoLayout) {
        this.f186764d = openSdkFaceDetectInfoLayout;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(android.widget.TextView textView, int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 5 && i17 != 6) {
            return false;
        }
        com.tencent.mm.plugin.webview.ui.tools.OpenSdkFaceDetectInfoLayout.a(this.f186764d);
        return true;
    }
}
