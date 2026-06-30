package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class p3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f132810d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f132811e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f132812f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f132813g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f132814h;

    public p3(android.view.View view, int i17, int i18, int i19, int i27) {
        this.f132810d = view;
        this.f132811e = i17;
        this.f132812f = i18;
        this.f132813g = i19;
        this.f132814h = i27;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.graphics.Rect rect = new android.graphics.Rect();
        android.view.View view = this.f132810d;
        view.getHitRect(rect);
        int i17 = android.os.Build.VERSION.SDK_INT;
        int i18 = this.f132812f;
        int i19 = this.f132811e;
        if (i17 >= 31) {
            rect.inset(-i19, -i18, -this.f132813g, this.f132814h);
        } else {
            rect.inset(-i19, -i18);
        }
        java.lang.Object parent = view.getParent();
        kotlin.jvm.internal.o.e(parent, "null cannot be cast to non-null type android.view.View");
        ((android.view.View) parent).setTouchDelegate(new android.view.TouchDelegate(rect, view));
    }
}
