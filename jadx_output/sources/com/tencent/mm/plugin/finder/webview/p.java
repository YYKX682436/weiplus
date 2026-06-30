package com.tencent.mm.plugin.finder.webview;

/* loaded from: classes7.dex */
public final class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f136913d;

    public p(yz5.a aVar) {
        this.f136913d = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.os.Looper.myQueue().addIdleHandler(new com.tencent.mm.plugin.finder.webview.o(this.f136913d));
    }
}
