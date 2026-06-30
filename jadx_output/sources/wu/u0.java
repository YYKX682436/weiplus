package wu;

/* loaded from: classes9.dex */
public final class u0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final wu.u0 f449632d = new wu.u0();

    public u0() {
        super(2);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        android.view.View v17 = (android.view.View) obj;
        hu.b item = (hu.b) obj2;
        kotlin.jvm.internal.o.g(v17, "v");
        kotlin.jvm.internal.o.g(item, "item");
        s15.a w17 = item.f284997e.w();
        if (w17 != null) {
            android.content.Intent intent = new android.content.Intent();
            java.lang.String k17 = w17.k();
            if (!(!r26.n0.N(k17))) {
                k17 = null;
            }
            if (k17 != null) {
                intent.putExtra("KEY_SHARE_TYPE", 4);
                uc.n nVar = (uc.n) i95.n0.c(uc.n.class);
                android.content.Context context = v17.getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                ((v40.s) nVar).Bi(context, intent, k17);
            }
        }
        return jz5.f0.f302826a;
    }
}
