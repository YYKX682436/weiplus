package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f182300d;

    public e(com.tencent.mm.plugin.webview.luggage.jsapi.l lVar, android.content.Context context) {
        this.f182300d = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.Context context = this.f182300d;
        dp.a.makeText(context, context.getString(com.tencent.mm.R.string.f492208fm1), 0).show();
    }
}
