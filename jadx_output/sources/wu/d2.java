package wu;

/* loaded from: classes.dex */
public final class d2 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public static final wu.d2 f449558d = new wu.d2();

    public d2() {
        super(3);
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        hu.b item = (hu.b) obj;
        android.widget.ImageView icon = (android.widget.ImageView) obj2;
        android.widget.TextView title = (android.widget.TextView) obj3;
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(icon, "icon");
        kotlin.jvm.internal.o.g(title, "title");
        java.lang.String string = title.getContext().getString(com.tencent.mm.R.string.odn);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        title.setText(string);
        return jz5.f0.f302826a;
    }
}
