package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f182304d;

    public f(com.tencent.mm.plugin.webview.luggage.jsapi.l lVar, android.content.Context context) {
        this.f182304d = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.Context context = this.f182304d;
        dp.a.makeText(context, context.getString(com.tencent.mm.R.string.f492210fm3), 0).show();
    }
}
