package sj3;

/* loaded from: classes14.dex */
public final class t1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sj3.u1 f408744d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f408745e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(sj3.u1 u1Var, java.lang.String str) {
        super(0);
        this.f408744d = u1Var;
        this.f408745e = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f408744d.f408764l = true;
        if (this.f408744d.e().getVisibility() == 0) {
            ((ku5.t0) ku5.t0.f312615d).B(new sj3.s1(this.f408744d, this.f408745e));
        }
        return jz5.f0.f302826a;
    }
}
