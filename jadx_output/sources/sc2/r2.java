package sc2;

/* loaded from: classes2.dex */
public final class r2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final sc2.r2 f406188d = new sc2.r2();

    public r2() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View view;
        ad2.h observer = (ad2.h) obj;
        kotlin.jvm.internal.o.g(observer, "observer");
        if (observer.f3150n == 39) {
            sc2.w2 w2Var = observer instanceof sc2.w2 ? (sc2.w2) observer : null;
            if (w2Var != null && (view = w2Var.f3143d) != null) {
                view.post(new sc2.q2(observer));
            }
        }
        return jz5.f0.f302826a;
    }
}
