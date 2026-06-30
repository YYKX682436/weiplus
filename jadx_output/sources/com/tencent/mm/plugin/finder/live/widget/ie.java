package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes2.dex */
public final class ie implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.imageview.WeImageView f118670d;

    public ie(com.tencent.mm.ui.widget.imageview.WeImageView weImageView) {
        this.f118670d = weImageView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.graphics.Rect rect = new android.graphics.Rect();
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f118670d;
        weImageView.getHitRect(rect);
        rect.inset(-rect.width(), -rect.width());
        java.lang.Object parent = weImageView.getParent();
        kotlin.jvm.internal.o.e(parent, "null cannot be cast to non-null type android.view.View");
        ((android.view.View) parent).setTouchDelegate(new android.view.TouchDelegate(rect, weImageView));
    }
}
