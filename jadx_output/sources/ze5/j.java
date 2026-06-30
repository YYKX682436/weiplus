package ze5;

/* loaded from: classes.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final ze5.j f472021d = new ze5.j();

    public j() {
        super(2);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        yb5.d ui6 = (yb5.d) obj;
        android.widget.LinearLayout sourceArea = (android.widget.LinearLayout) obj2;
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(sourceArea, "sourceArea");
        android.view.View inflate = com.tencent.mm.ui.id.b(ui6.g()).inflate(com.tencent.mm.R.layout.e2a, (android.view.ViewGroup) sourceArea, false);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        return inflate;
    }
}
