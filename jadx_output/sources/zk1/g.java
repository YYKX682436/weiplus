package zk1;

/* loaded from: classes5.dex */
public final class g implements zk1.f {
    @Override // zk1.f
    public void Mi(android.view.View view, int i17, int i18, int i19, int i27) {
        kotlin.jvm.internal.o.g(view, "view");
        android.graphics.Rect rect = new android.graphics.Rect();
        view.getHitRect(rect);
        rect.left -= i17;
        rect.top -= i18;
        rect.right += i19;
        rect.bottom += i27;
        java.lang.Object parent = view.getParent();
        android.view.View view2 = parent instanceof android.view.View ? (android.view.View) parent : null;
        if (view2 == null) {
            return;
        }
        view2.setTouchDelegate(new android.view.TouchDelegate(rect, view));
    }
}
