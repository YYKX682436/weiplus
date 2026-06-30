package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes8.dex */
public class x8 implements com.tencent.mm.pluginsdk.ui.tools.z8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.xweb.WebView f192002a;

    public x8(com.tencent.xweb.WebView webView) {
        this.f192002a = webView;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.z8
    public void evaluateJavascript(java.lang.String str, android.webkit.ValueCallback valueCallback) {
        this.f192002a.evaluateJavascript(str, valueCallback);
    }
}
