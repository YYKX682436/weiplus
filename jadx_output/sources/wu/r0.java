package wu;

/* loaded from: classes9.dex */
public final class r0 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public static final wu.r0 f449618d = new wu.r0();

    public r0() {
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
        s15.h hVar = item.f284997e;
        s15.s y17 = hVar.y();
        if (y17 != null) {
            title.setText(hVar.getString(hVar.f303422d + 0));
            java.lang.String l17 = y17.l();
            if (!(!r26.n0.N(l17))) {
                l17 = null;
            }
            if (l17 != null) {
                vo0.a aVar = vo0.e.f438468b;
                yo0.f fVar = new yo0.f();
                fVar.f464078b = true;
                fVar.f464077a = true;
                aVar.c(l17, icon, fVar.a());
            }
        }
        return jz5.f0.f302826a;
    }
}
