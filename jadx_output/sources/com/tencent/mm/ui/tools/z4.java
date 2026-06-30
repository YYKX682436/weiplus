package com.tencent.mm.ui.tools;

/* loaded from: classes14.dex */
public final class z4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.Window f210941d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f210942e;

    public z4(android.view.Window window, android.app.Activity activity) {
        this.f210941d = window;
        this.f210942e = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.Window window = this.f210941d;
        window.setDecorFitsSystemWindows(true);
        window.getDecorView().setOnApplyWindowInsetsListener(new com.tencent.mm.ui.tools.y4(this.f210942e));
        window.getDecorView().requestApplyInsets();
    }
}
