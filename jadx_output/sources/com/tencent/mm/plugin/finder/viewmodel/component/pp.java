package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class pp implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.qp f135578d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f135579e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f135580f;

    public pp(com.tencent.mm.plugin.finder.viewmodel.component.qp qpVar, in5.s0 s0Var, android.view.View view) {
        this.f135578d = qpVar;
        this.f135579e = s0Var;
        this.f135580f = view;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.f135578d.d7(this.f135579e);
        android.view.ViewTreeObserver viewTreeObserver = this.f135580f.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this);
        }
    }
}
