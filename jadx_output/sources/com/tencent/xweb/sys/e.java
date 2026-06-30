package com.tencent.xweb.sys;

/* loaded from: classes7.dex */
public class e implements com.tencent.xweb.l0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.webkit.SslErrorHandler f220551a;

    public e(android.webkit.SslErrorHandler sslErrorHandler) {
        this.f220551a = sslErrorHandler;
    }

    @Override // com.tencent.xweb.l0
    public void a() {
        this.f220551a.proceed();
    }

    @Override // com.tencent.xweb.l0
    public void cancel() {
        this.f220551a.cancel();
    }
}
