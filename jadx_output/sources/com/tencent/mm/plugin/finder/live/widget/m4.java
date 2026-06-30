package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class m4 implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f119033d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.q4 f119034e;

    public m4(android.view.View view, com.tencent.mm.plugin.finder.live.widget.q4 q4Var) {
        this.f119033d = view;
        this.f119034e = q4Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View view) {
        this.f119033d.removeOnAttachStateChangeListener(this);
        this.f119034e.f();
    }
}
