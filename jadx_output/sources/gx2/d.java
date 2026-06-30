package gx2;

/* loaded from: classes2.dex */
public final class d implements gx2.b {
    @Override // gx2.b
    public android.graphics.Rect G6(gx2.q drawer) {
        android.view.View a17;
        kotlin.jvm.internal.o.g(drawer, "drawer");
        android.graphics.Rect rect = new android.graphics.Rect();
        hx2.i headerComponent = drawer.getHeaderComponent();
        if (headerComponent != null && (a17 = headerComponent.a()) != null) {
            a17.getGlobalVisibleRect(rect);
        }
        return rect;
    }
}
