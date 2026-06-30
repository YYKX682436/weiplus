package com.tencent.mm.ui.tools;

/* loaded from: classes5.dex */
public final class a5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.Window f210271d;

    public a5(android.view.Window window) {
        this.f210271d = window;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.Window window = this.f210271d;
        window.setDecorFitsSystemWindows(true);
        window.getDecorView().setOnApplyWindowInsetsListener(null);
        window.getDecorView().requestApplyInsets();
        com.tencent.mars.xlog.Log.i("KeyBoardHeightProviderUtil", "removeOnApplyWindowInsetsListener");
    }
}
