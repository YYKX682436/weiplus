package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class o8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.k f186411d;

    public o8(nw4.k kVar) {
        this.f186411d = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.content.Context context = this.f186411d.f340860a;
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        ((android.app.Activity) context).finish();
    }
}
