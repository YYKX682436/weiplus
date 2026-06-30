package com.tencent.mm.ui;

/* loaded from: classes5.dex */
public final class u3 implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f211063d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f211064e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f211065f;

    public u3(android.view.View view, android.view.View view2, boolean z17) {
        this.f211063d = view;
        this.f211064e = view2;
        this.f211065f = z17;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View view) {
        this.f211063d.removeOnAttachStateChangeListener(this);
        com.tencent.mm.ui.a4 a4Var = com.tencent.mm.ui.a4.f197117a;
        boolean z17 = this.f211065f;
        android.view.View view2 = this.f211064e;
        com.tencent.mm.ui.a4.c(a4Var, view2, z17);
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        n3.y0.c(view2);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View view) {
    }
}
