package wu;

/* loaded from: classes9.dex */
public final class p0 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public static final wu.p0 f449612d = new wu.p0();

    public p0() {
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
        s15.m s17 = item.f284997e.s();
        if (s17 != null) {
            title.setText(s17.getTitle());
            java.lang.String thumbUrl = s17.getThumbUrl();
            if (!(!r26.n0.N(thumbUrl))) {
                thumbUrl = null;
            }
            if (thumbUrl != null) {
                vo0.a aVar = vo0.e.f438468b;
                yo0.f fVar = new yo0.f();
                fVar.f464078b = true;
                fVar.f464077a = true;
                aVar.c(thumbUrl, icon, fVar.a());
            }
        }
        return jz5.f0.f302826a;
    }
}
