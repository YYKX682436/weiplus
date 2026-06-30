package uu3;

/* loaded from: classes5.dex */
public final class i implements uu3.g {
    @Override // uu3.g
    public android.graphics.Rect a(uu3.u drawer) {
        android.view.View a17;
        kotlin.jvm.internal.o.g(drawer, "drawer");
        android.graphics.Rect rect = new android.graphics.Rect();
        vu3.c headerComponent = drawer.getHeaderComponent();
        if (headerComponent != null && (a17 = headerComponent.a()) != null) {
            a17.getGlobalVisibleRect(rect);
        }
        return rect;
    }
}
