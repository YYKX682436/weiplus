package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public final class y4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f187688d;

    public y4(java.lang.String str) {
        this.f187688d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        uk0.a.b(new com.tencent.mm.ipcinvoker.type.IPCString(this.f187688d), new com.tencent.mm.plugin.webview.ui.tools.x4(), null);
    }
}
