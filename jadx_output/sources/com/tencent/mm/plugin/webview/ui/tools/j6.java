package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class j6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f184859d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.c6 f184860e;

    public j6(com.tencent.mm.plugin.webview.ui.tools.c6 c6Var, boolean z17, boolean z18) {
        this.f184860e = c6Var;
        this.f184859d = z18;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f184860e.c0(true, this.f184859d);
    }
}
