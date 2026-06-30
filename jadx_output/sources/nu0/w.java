package nu0;

/* loaded from: classes5.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nu0.q0 f340123d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f340124e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f340125f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(nu0.q0 q0Var, int i17, int i18) {
        super(1);
        this.f340123d = q0Var;
        this.f340124e = i17;
        this.f340125f = i18;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String path = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(path, "path");
        nu0.q0 q0Var = this.f340123d;
        ((java.util.ArrayList) q0Var.f340077t).add(path);
        if (this.f340124e == this.f340125f) {
            nu0.q0.W6(q0Var);
        }
        return jz5.f0.f302826a;
    }
}
