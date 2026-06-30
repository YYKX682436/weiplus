package wu;

/* loaded from: classes9.dex */
public final class t0 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public static final wu.t0 f449627d = new wu.t0();

    public t0() {
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
        s15.a w17 = item.f284997e.w();
        if (w17 != null) {
            title.setText(w17.j());
            java.lang.String headImgUrl = w17.getHeadImgUrl();
            if (!(!r26.n0.N(headImgUrl))) {
                headImgUrl = null;
            }
            if (headImgUrl != null) {
                vo0.a aVar = vo0.e.f438468b;
                yo0.f fVar = new yo0.f();
                fVar.f464078b = true;
                fVar.f464077a = true;
                aVar.c(headImgUrl, icon, fVar.a());
            }
        }
        return jz5.f0.f302826a;
    }
}
