package sc2;

/* loaded from: classes2.dex */
public final class d3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f405829d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f405830e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3(in5.s0 s0Var, java.lang.String str) {
        super(1);
        this.f405829d = s0Var;
        this.f405830e = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View view;
        ad2.h observer = (ad2.h) obj;
        kotlin.jvm.internal.o.g(observer, "observer");
        if (observer.f3150n == 75) {
            sc2.m3 m3Var = observer instanceof sc2.m3 ? (sc2.m3) observer : null;
            if (m3Var != null && (view = m3Var.f3143d) != null) {
                view.post(new sc2.c3(observer, this.f405829d, view, this.f405830e));
            }
        }
        return jz5.f0.f302826a;
    }
}
