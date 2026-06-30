package com.tencent.mm.ui;

/* loaded from: classes14.dex */
public class za implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.ga f212615d;

    public za(com.tencent.mm.ui.ga gaVar) {
        this.f212615d = gaVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View view) {
        this.f212615d.f208644g.removeOnAttachStateChangeListener(this);
    }
}
