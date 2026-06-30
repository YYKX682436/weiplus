package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes2.dex */
public final class fe0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f112544d;

    public fe0(android.view.ViewGroup viewGroup) {
        this.f112544d = viewGroup;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.graphics.Rect rect = new android.graphics.Rect();
        android.view.ViewGroup viewGroup = this.f112544d;
        viewGroup.getHitRect(rect);
        int i17 = -com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479738dv);
        rect.inset(i17, i17);
        java.lang.Object parent = viewGroup.getParent();
        kotlin.jvm.internal.o.e(parent, "null cannot be cast to non-null type android.view.View");
        ((android.view.View) parent).setTouchDelegate(new android.view.TouchDelegate(rect, viewGroup));
    }
}
