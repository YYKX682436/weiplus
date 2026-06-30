package fr5;

/* loaded from: classes15.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fr5.f0 f266026d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(fr5.f0 f0Var) {
        super(1);
        this.f266026d = f0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.MotionEvent e17 = (android.view.MotionEvent) obj;
        kotlin.jvm.internal.o.g(e17, "e");
        this.f266026d.f265939d = new zq5.l(zq5.m.a(e17.getX(), e17.getY()));
        return java.lang.Boolean.TRUE;
    }
}
