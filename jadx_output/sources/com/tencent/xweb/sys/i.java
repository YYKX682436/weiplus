package com.tencent.xweb.sys;

/* loaded from: classes13.dex */
public class i extends com.tencent.xweb.z {

    /* renamed from: a, reason: collision with root package name */
    public final android.webkit.JsResult f220555a;

    public i(android.webkit.JsResult jsResult) {
        this.f220555a = jsResult;
    }

    @Override // com.tencent.xweb.z
    public void a() {
        android.webkit.JsResult jsResult = this.f220555a;
        if (jsResult != null) {
            jsResult.cancel();
        }
    }

    @Override // com.tencent.xweb.z
    public void b() {
        android.webkit.JsResult jsResult = this.f220555a;
        if (jsResult != null) {
            jsResult.confirm();
        }
    }
}
