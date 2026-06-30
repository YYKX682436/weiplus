package dy4;

/* loaded from: classes8.dex */
public final class x extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dy4.f1 f244732d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(dy4.f1 f1Var) {
        super(0);
        this.f244732d = f1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("MicroMsg.WebViewVideoPluginHandler");
        dy4.f1 f1Var = this.f244732d;
        sb6.append(f1Var.q());
        sb6.append('-');
        sb6.append(f1Var.hashCode());
        return sb6.toString();
    }
}
