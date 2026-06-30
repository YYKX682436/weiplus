package wu;

/* loaded from: classes9.dex */
public final class m0 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public static final wu.m0 f449597d = new wu.m0();

    public m0() {
        super(3);
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.lang.String str;
        java.lang.String k17;
        hu.b item = (hu.b) obj;
        android.widget.ImageView icon = (android.widget.ImageView) obj2;
        android.widget.TextView title = (android.widget.TextView) obj3;
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(icon, "icon");
        kotlin.jvm.internal.o.g(title, "title");
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        java.lang.Object[] objArr = new java.lang.Object[1];
        s15.h hVar = item.f284997e;
        s15.k z17 = hVar.z();
        if (z17 == null || (str = z17.getNickname()) == null) {
            str = "";
        }
        objArr[0] = str;
        java.lang.String string = context.getString(com.tencent.mm.R.string.odl, objArr);
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        title.setText(string != null ? string : "");
        s15.k z19 = hVar.z();
        if (z19 != null && (k17 = z19.k()) != null) {
            vo0.a aVar = vo0.e.f438468b;
            yo0.f fVar = new yo0.f();
            fVar.f464078b = true;
            fVar.f464077a = true;
            aVar.c(k17, icon, fVar.a());
        }
        return jz5.f0.f302826a;
    }
}
