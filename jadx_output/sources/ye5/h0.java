package ye5;

/* loaded from: classes5.dex */
public final class h0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final ye5.h0 f461260d = new ye5.h0();

    public h0() {
        super(2);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        yb5.d ui6 = (yb5.d) obj;
        android.widget.LinearLayout sourceArea = (android.widget.LinearLayout) obj2;
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(sourceArea, "sourceArea");
        q31.n T6 = ((io.a0) ((zn5.l) ((zn5.k) i95.n0.c(zn5.k.class))).Zi()).T6(null);
        android.app.Activity g17 = ui6.g();
        kotlin.jvm.internal.o.f(g17, "getContext(...)");
        android.view.View a17 = ((io.t) T6).a(g17);
        a17.setTag(com.tencent.mm.R.id.ujd, T6);
        a17.setPadding(i65.a.b(a17.getContext(), -5), 0, 0, 0);
        return a17;
    }
}
