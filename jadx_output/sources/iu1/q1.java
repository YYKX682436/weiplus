package iu1;

/* loaded from: classes9.dex */
public final class q1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ iu1.r1 f294940d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.g45 f294941e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(iu1.r1 r1Var, r45.g45 g45Var) {
        super(0);
        this.f294940d = r1Var;
        this.f294941e = g45Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        iu1.r1 r1Var = this.f294940d;
        r1Var.i().f95474e = i65.a.b(r1Var.i().getContext(), 32);
        r1Var.i().f95473d = r1Var.f294944d;
        r1Var.i().getLayoutParams().height = r1Var.f294944d;
        r1Var.i().setVisibility(0);
        android.widget.ImageView imageView = r1Var.f294951n;
        if (imageView == null) {
            kotlin.jvm.internal.o.o("shadowIv");
            throw null;
        }
        imageView.setVisibility(0);
        r45.g45 g45Var = this.f294941e;
        java.lang.String str = g45Var.f374878n;
        if (str == null || str.length() == 0) {
            java.lang.String str2 = g45Var.f374877m;
            if (!(str2 == null || str2.length() == 0)) {
                r1Var.i().setImageDrawable(ju1.e.a(android.graphics.Color.parseColor(g45Var.f374877m)));
            }
        } else {
            ju1.e.b(r1Var.i(), g45Var.f374878n, r1Var.f294945e, r1Var.f294944d);
        }
        return jz5.f0.f302826a;
    }
}
