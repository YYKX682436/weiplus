package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class fm implements gx2.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.FinderHorizontalVideoDrawerUIC f134412d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f134413e;

    public fm(com.tencent.mm.plugin.finder.viewmodel.component.FinderHorizontalVideoDrawerUIC finderHorizontalVideoDrawerUIC, android.widget.FrameLayout frameLayout) {
        this.f134412d = finderHorizontalVideoDrawerUIC;
        this.f134413e = frameLayout;
    }

    @Override // gx2.b
    public android.graphics.Rect G6(gx2.q drawer) {
        kotlin.jvm.internal.o.g(drawer, "drawer");
        android.graphics.Rect rect = new android.graphics.Rect();
        if (this.f134412d.f133589f) {
            this.f134413e.getGlobalVisibleRect(rect);
        }
        return rect;
    }
}
