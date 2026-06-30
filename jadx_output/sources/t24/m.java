package t24;

/* loaded from: classes.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final t24.m f415326d = new t24.m();

    public m() {
        super(2);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        android.graphics.drawable.Drawable drawable = (android.graphics.drawable.Drawable) obj;
        android.widget.ImageView view = (android.widget.ImageView) obj2;
        kotlin.jvm.internal.o.g(drawable, "drawable");
        kotlin.jvm.internal.o.g(view, "view");
        view.setLayerPaint(null);
        view.setImageDrawable(drawable);
        return jz5.f0.f302826a;
    }
}
