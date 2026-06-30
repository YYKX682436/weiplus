package com.tencent.mm.plugin.webview.luggage.util;

/* loaded from: classes8.dex */
public class b implements android.view.View.OnSystemUiVisibilityChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.Window f182631a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f182632b;

    public b(android.view.Window window, boolean z17) {
        this.f182631a = window;
        this.f182632b = z17;
    }

    @Override // android.view.View.OnSystemUiVisibilityChangeListener
    public void onSystemUiVisibilityChange(int i17) {
        if ((i17 & 4) == 0) {
            android.view.Window window = this.f182631a;
            window.getDecorView().setSystemUiVisibility(com.tencent.mm.plugin.webview.luggage.util.c.b(window, this.f182632b));
        }
    }
}
