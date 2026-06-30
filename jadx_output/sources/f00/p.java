package f00;

/* loaded from: classes9.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c00.k4 f258323d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(c00.k4 k4Var) {
        super(1);
        this.f258323d = k4Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.widget.ImageView imageView = (android.widget.ImageView) obj;
        kotlin.jvm.internal.o.g(imageView, "imageView");
        mn2.g1 g1Var = mn2.g1.f329975a;
        vo0.d a17 = g1Var.a();
        vd2.i5 i5Var = (vd2.i5) i95.n0.c(vd2.i5.class);
        bw5.g9 g9Var = ((g00.f) this.f258323d).f267398d;
        java.lang.String b17 = g9Var != null ? g9Var.b() : null;
        if (b17 == null) {
            b17 = "";
        }
        a17.c(((c61.i8) i5Var).Ai(b17, com.tencent.mm.plugin.finder.storage.y90.f128356f), imageView, g1Var.h(mn2.f1.f329962p));
        return jz5.f0.f302826a;
    }
}
