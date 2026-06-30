package com.tencent.mm.plugin.finder.search;

/* loaded from: classes2.dex */
public final class s2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.search.v2 f125848d;

    public s2(com.tencent.mm.plugin.finder.search.v2 v2Var) {
        this.f125848d = v2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.graphics.Rect rect = new android.graphics.Rect();
        com.tencent.mm.plugin.finder.search.v2 v2Var = this.f125848d;
        v2Var.f125938t.getHitRect(rect);
        int i17 = -com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479646bl);
        rect.inset(i17, i17);
        java.lang.Object parent = v2Var.f125938t.getParent();
        kotlin.jvm.internal.o.e(parent, "null cannot be cast to non-null type android.view.View");
        ((android.view.View) parent).setTouchDelegate(new android.view.TouchDelegate(rect, v2Var.f125938t));
    }
}
