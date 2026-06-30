package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public class r4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 f185379d;

    public r4(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var) {
        this.f185379d = c1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.Context context = this.f185379d.f184975d;
        dp.a.makeText(context, j65.q.a(context).getString(com.tencent.mm.R.string.f492210fm3), 0).show();
    }
}
