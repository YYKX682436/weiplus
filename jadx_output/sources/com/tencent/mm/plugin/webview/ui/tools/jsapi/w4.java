package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public class w4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 f185495d;

    public w4(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var) {
        this.f185495d = c1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.Context context = this.f185495d.f184975d;
        dp.a.makeText(context, j65.q.a(context).getString(com.tencent.mm.R.string.f492209fm2), 0).show();
    }
}
