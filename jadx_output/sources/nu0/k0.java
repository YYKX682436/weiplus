package nu0;

/* loaded from: classes5.dex */
public final class k0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nu0.q0 f339992d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f339993e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f339994f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f339995g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(nu0.q0 q0Var, kotlin.jvm.internal.f0 f0Var, int i17, kotlinx.coroutines.q qVar) {
        super(1);
        this.f339992d = q0Var;
        this.f339993e = f0Var;
        this.f339994f = i17;
        this.f339995g = qVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String path = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(path, "path");
        nu0.q0 q0Var = this.f339992d;
        ((java.util.ArrayList) q0Var.f340077t).add(path);
        kotlin.jvm.internal.f0 f0Var = this.f339993e;
        int i17 = f0Var.f310116d + 1;
        f0Var.f310116d = i17;
        if (i17 == this.f339994f) {
            ((kotlinx.coroutines.r) this.f339995g).resumeWith(kotlin.Result.m521constructorimpl(""));
            nu0.q0.W6(q0Var);
        }
        return jz5.f0.f302826a;
    }
}
