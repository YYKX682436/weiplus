package vd2;

/* loaded from: classes3.dex */
public final class r5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vd2.v5 f435896d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.m70 f435897e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f435898f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r5(vd2.v5 v5Var, r45.m70 m70Var, java.lang.String str) {
        super(0);
        this.f435896d = v5Var;
        this.f435897e = m70Var;
        this.f435898f = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        i95.m c17 = i95.n0.c(s40.w0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        s40.w0 w0Var = (s40.w0) c17;
        vd2.v5 v5Var = this.f435896d;
        s40.w0.z5(w0Var, v5Var.f435957c, this.f435897e, null, this.f435898f, v5Var.f435960f, 4, null);
        return jz5.f0.f302826a;
    }
}
