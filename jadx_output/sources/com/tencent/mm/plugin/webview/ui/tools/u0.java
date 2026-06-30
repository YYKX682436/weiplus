package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes14.dex */
public final class u0 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.OpenSdkFaceDetectInfoLayout f186922d;

    public u0(com.tencent.mm.plugin.webview.ui.tools.OpenSdkFaceDetectInfoLayout openSdkFaceDetectInfoLayout) {
        this.f186922d = openSdkFaceDetectInfoLayout;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable s17) {
        kotlin.jvm.internal.o.g(s17, "s");
        int i17 = com.tencent.mm.plugin.webview.ui.tools.OpenSdkFaceDetectInfoLayout.f183641n;
        this.f186922d.b();
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence s17, int i17, int i18, int i19) {
        kotlin.jvm.internal.o.g(s17, "s");
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence s17, int i17, int i18, int i19) {
        kotlin.jvm.internal.o.g(s17, "s");
    }
}
