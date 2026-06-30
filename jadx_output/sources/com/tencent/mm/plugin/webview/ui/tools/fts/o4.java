package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes5.dex */
public class o4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f184577d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.fts.v4 f184578e;

    public o4(com.tencent.mm.plugin.webview.ui.tools.fts.v4 v4Var, android.view.View view) {
        this.f184578e = v4Var;
        this.f184577d = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f184578e.f184677c = this.f184577d.getMeasuredHeight();
    }
}
