package com.tencent.xweb.sys;

/* loaded from: classes13.dex */
public class f implements com.tencent.xweb.u {

    /* renamed from: a, reason: collision with root package name */
    public final android.webkit.HttpAuthHandler f220552a;

    public f(android.webkit.HttpAuthHandler httpAuthHandler) {
        this.f220552a = httpAuthHandler;
    }

    @Override // com.tencent.xweb.u
    public void cancel() {
        this.f220552a.cancel();
    }
}
