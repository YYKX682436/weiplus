package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class hi implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f112813d;

    public hi(android.view.View view) {
        this.f112813d = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.graphics.Rect rect = new android.graphics.Rect();
        android.view.View view = this.f112813d;
        view.getHitRect(rect);
        rect.inset(-rect.width(), -rect.width());
        java.lang.Object parent = view.getParent();
        android.view.View view2 = parent instanceof android.view.View ? (android.view.View) parent : null;
        if (view2 == null) {
            return;
        }
        view2.setTouchDelegate(new android.view.TouchDelegate(rect, view));
    }
}
