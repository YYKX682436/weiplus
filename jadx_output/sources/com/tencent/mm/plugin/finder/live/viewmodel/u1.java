package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes9.dex */
public final class u1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.e2 f117443d;

    public u1(com.tencent.mm.plugin.finder.live.viewmodel.e2 e2Var) {
        this.f117443d = e2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.graphics.Rect rect = new android.graphics.Rect();
        com.tencent.mm.plugin.finder.live.viewmodel.e2 e2Var = this.f117443d;
        android.view.View view = e2Var.f117058f;
        if (view != null) {
            view.getHitRect(rect);
        }
        rect.inset(rect.width() * (-2), -rect.width());
        android.view.View view2 = e2Var.f117058f;
        android.view.ViewParent parent = view2 != null ? view2.getParent() : null;
        android.view.View view3 = parent instanceof android.view.View ? (android.view.View) parent : null;
        if (view3 == null) {
            return;
        }
        view3.setTouchDelegate(new android.view.TouchDelegate(rect, e2Var.f117058f));
    }
}
