package t24;

/* loaded from: classes.dex */
public final class x extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final t24.x f415343d = new t24.x();

    public x() {
        super(2);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        android.graphics.drawable.Drawable drawable = (android.graphics.drawable.Drawable) obj;
        android.view.View view = (android.view.View) obj2;
        kotlin.jvm.internal.o.g(drawable, "drawable");
        kotlin.jvm.internal.o.g(view, "view");
        view.setBackground(drawable);
        return jz5.f0.f302826a;
    }
}
