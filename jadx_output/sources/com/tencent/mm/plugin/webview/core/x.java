package com.tencent.mm.plugin.webview.core;

/* loaded from: classes7.dex */
public final class x implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f182009a;

    public x(yz5.l lVar) {
        this.f182009a = lVar;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        kotlin.jvm.internal.o.d(str);
        this.f182009a.invoke(str);
    }
}
