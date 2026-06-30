package com.tencent.xweb.sys;

/* loaded from: classes16.dex */
public class g extends com.tencent.xweb.r0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.webkit.WebChromeClient.FileChooserParams f220553a;

    public g(android.webkit.WebChromeClient.FileChooserParams fileChooserParams) {
        this.f220553a = fileChooserParams;
    }

    @Override // com.tencent.xweb.r0
    public android.content.Intent a() {
        android.webkit.WebChromeClient.FileChooserParams fileChooserParams = this.f220553a;
        if (fileChooserParams != null) {
            return fileChooserParams.createIntent();
        }
        return null;
    }

    @Override // com.tencent.xweb.r0
    public java.lang.String[] b() {
        android.webkit.WebChromeClient.FileChooserParams fileChooserParams = this.f220553a;
        return fileChooserParams != null ? fileChooserParams.getAcceptTypes() : new java.lang.String[0];
    }

    @Override // com.tencent.xweb.r0
    public int c() {
        android.webkit.WebChromeClient.FileChooserParams fileChooserParams = this.f220553a;
        if (fileChooserParams != null) {
            return fileChooserParams.getMode();
        }
        return 0;
    }

    @Override // com.tencent.xweb.r0
    public boolean d() {
        android.webkit.WebChromeClient.FileChooserParams fileChooserParams = this.f220553a;
        if (fileChooserParams != null) {
            return fileChooserParams.isCaptureEnabled();
        }
        return false;
    }
}
