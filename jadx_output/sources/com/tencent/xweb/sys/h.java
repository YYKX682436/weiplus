package com.tencent.xweb.sys;

/* loaded from: classes13.dex */
public class h extends com.tencent.xweb.y {

    /* renamed from: a, reason: collision with root package name */
    public final android.webkit.JsPromptResult f220554a;

    public h(android.webkit.JsPromptResult jsPromptResult) {
        this.f220554a = jsPromptResult;
    }

    @Override // com.tencent.xweb.z
    public void a() {
        android.webkit.JsPromptResult jsPromptResult = this.f220554a;
        if (jsPromptResult != null) {
            jsPromptResult.cancel();
        }
    }

    @Override // com.tencent.xweb.z
    public void b() {
        android.webkit.JsPromptResult jsPromptResult = this.f220554a;
        if (jsPromptResult != null) {
            jsPromptResult.confirm();
        }
    }

    @Override // com.tencent.xweb.y
    public void c(java.lang.String str) {
        android.webkit.JsPromptResult jsPromptResult = this.f220554a;
        if (jsPromptResult != null) {
            jsPromptResult.confirm(str);
        }
    }
}
