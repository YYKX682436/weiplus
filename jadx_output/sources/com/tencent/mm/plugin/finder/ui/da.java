package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes2.dex */
public final class da implements ym5.i1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.View.OnClickListener f129062a;

    public da(android.view.View.OnClickListener onClickListener) {
        this.f129062a = onClickListener;
    }

    @Override // ym5.i1
    public void a(android.view.View view, android.view.MotionEvent motionEvent) {
        kotlin.jvm.internal.o.g(view, "view");
        this.f129062a.onClick(view);
    }
}
