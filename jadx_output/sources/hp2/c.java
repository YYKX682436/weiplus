package hp2;

/* loaded from: classes2.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public static final hp2.c f282923d = new hp2.c();

    public c() {
        super(3);
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        ((java.lang.Number) obj).intValue();
        android.view.View view = (android.view.View) obj2;
        android.graphics.Rect rect = (android.graphics.Rect) obj3;
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(rect, "rect");
        return java.lang.Boolean.valueOf(rect.top > 0);
    }
}
