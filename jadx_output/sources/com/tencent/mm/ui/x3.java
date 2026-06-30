package com.tencent.mm.ui;

/* loaded from: classes5.dex */
public final class x3 implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f212540d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f212541e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.r f212542f;

    public x3(android.view.View view, android.view.View view2, yz5.r rVar) {
        this.f212540d = view;
        this.f212541e = view2;
        this.f212542f = rVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View view) {
        this.f212540d.removeOnAttachStateChangeListener(this);
        android.view.View view2 = this.f212541e;
        jz5.o a17 = com.tencent.mm.ui.a4.a(view2);
        this.f212542f.C(view2, a17.f302841d, a17.f302842e, a17.f302843f);
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        n3.y0.c(view2);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View view) {
    }
}
