package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public class f7 implements k70.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f185109a;

    public f7(com.tencent.mm.plugin.webview.ui.tools.jsapi.g7 g7Var, java.util.concurrent.CountDownLatch countDownLatch) {
        this.f185109a = countDownLatch;
    }

    @Override // k70.u
    public void a(android.graphics.Bitmap bitmap, byte[] bArr) {
        this.f185109a.countDown();
    }
}
