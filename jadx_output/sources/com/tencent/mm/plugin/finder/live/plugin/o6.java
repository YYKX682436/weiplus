package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class o6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.v6 f113708d;

    public o6(com.tencent.mm.plugin.finder.live.plugin.v6 v6Var) {
        this.f113708d = v6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.graphics.Rect rect = new android.graphics.Rect();
        com.tencent.mm.plugin.finder.live.plugin.v6 v6Var = this.f113708d;
        v6Var.f114676y.getHitRect(rect);
        rect.inset(rect.width() * (-2), -rect.width());
        java.lang.Object parent = v6Var.f114676y.getParent();
        kotlin.jvm.internal.o.e(parent, "null cannot be cast to non-null type android.view.View");
        ((android.view.View) parent).setTouchDelegate(new android.view.TouchDelegate(rect, v6Var.f114676y));
    }
}
