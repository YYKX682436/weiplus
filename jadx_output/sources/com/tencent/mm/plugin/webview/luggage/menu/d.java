package com.tencent.mm.plugin.webview.luggage.menu;

/* loaded from: classes8.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f182561d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.menu.e f182562e;

    public d(com.tencent.mm.plugin.webview.luggage.menu.e eVar, boolean z17) {
        this.f182562e = eVar;
        this.f182561d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17 = this.f182561d;
        com.tencent.mm.plugin.webview.luggage.menu.e eVar = this.f182562e;
        if (z17) {
            db5.e1.o(eVar.f182564e, com.tencent.mm.R.string.la9, com.tencent.mm.R.string.f490573yv, false, new com.tencent.mm.plugin.webview.luggage.menu.c(this));
        } else {
            android.content.Context context = eVar.f182564e;
            dp.a.makeText(context, context.getString(com.tencent.mm.R.string.la8), 0).show();
        }
    }
}
