package com.tencent.mm.plugin.finder.webview;

/* loaded from: classes8.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f136872d;

    public i(android.view.View view) {
        this.f136872d = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View view = this.f136872d;
        if (view != null) {
            view.requestLayout();
        }
    }
}
