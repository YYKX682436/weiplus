package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes5.dex */
public final class w4 implements p11.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f186602a;

    public w4(long j17) {
        this.f186602a = j17;
    }

    @Override // p11.h
    public void a(java.lang.String str, android.view.View view) {
    }

    @Override // p11.h
    public void b(java.lang.String str, android.view.View view, q11.b bVar) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if ((bVar != null ? bVar.f359533c : null) != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandleMPPageAction", "ImageLoader net download finish: url = %s, duration = " + (currentTimeMillis - this.f186602a), str);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandleMPPageAction", "ImageLoader getCacheImage finish: url = " + str);
        }
    }

    @Override // p11.h
    public android.graphics.Bitmap c(java.lang.String str, android.view.View view, q11.b bVar) {
        return null;
    }
}
