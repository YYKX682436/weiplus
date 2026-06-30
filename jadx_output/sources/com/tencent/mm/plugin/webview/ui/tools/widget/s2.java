package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes8.dex */
public class s2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f187531d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.widget.u3 f187532e;

    public s2(com.tencent.mm.plugin.webview.ui.tools.widget.u3 u3Var, java.lang.String str) {
        this.f187532e = u3Var;
        this.f187531d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f187532e.M(this.f187531d);
    }
}
