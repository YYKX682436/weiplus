package com.tencent.mm.plugin.webview.ui.tools.floatball;

/* loaded from: classes.dex */
public final class l implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f184212a;

    public l(yz5.l lVar) {
        this.f184212a = lVar;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        this.f184212a.invoke(java.lang.Boolean.valueOf(java.lang.Boolean.parseBoolean((java.lang.String) obj)));
    }
}
