package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f182312d;

    public g(com.tencent.mm.plugin.webview.luggage.jsapi.l lVar, android.content.Context context) {
        this.f182312d = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.Context context = this.f182312d;
        dp.a.makeText(context, context.getString(com.tencent.mm.R.string.f492209fm2), 0).show();
    }
}
