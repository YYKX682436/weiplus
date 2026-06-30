package sc2;

/* loaded from: classes2.dex */
public final class t2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f406259d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(in5.s0 s0Var) {
        super(1);
        this.f406259d = s0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View view;
        ad2.h observer = (ad2.h) obj;
        kotlin.jvm.internal.o.g(observer, "observer");
        if (observer.f3150n == 39) {
            sc2.w2 w2Var = observer instanceof sc2.w2 ? (sc2.w2) observer : null;
            if (w2Var != null && (view = w2Var.f3143d) != null) {
                view.post(new sc2.s2(observer, this.f406259d));
            }
        }
        return jz5.f0.f302826a;
    }
}
