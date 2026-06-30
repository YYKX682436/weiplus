package fr5;

/* loaded from: classes15.dex */
public final class x extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ er5.g f266030d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fr5.f0 f266031e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(er5.g gVar, fr5.f0 f0Var) {
        super(1);
        this.f266030d = gVar;
        this.f266031e = f0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.MotionEvent e17 = (android.view.MotionEvent) obj;
        kotlin.jvm.internal.o.g(e17, "e");
        er5.g gVar = this.f266030d;
        if (gVar.b(8)) {
            fr5.f0 f0Var = this.f266031e;
            if (!f0Var.f265940e && !f0Var.f265937b) {
                f0Var.f265938c = true;
                kotlinx.coroutines.l.d(f0Var.f265943h, null, null, new fr5.w(gVar, gVar.f256242c.i(zq5.m.a(e17.getX(), e17.getY())), null), 3, null);
            }
        }
        return java.lang.Boolean.TRUE;
    }
}
