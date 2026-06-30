package gc0;

/* loaded from: classes5.dex */
public final class n2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gc0.p2 f270229d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(gc0.p2 p2Var) {
        super(0);
        this.f270229d = p2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        gc0.f0 f0Var = gc0.f0.f270167a;
        java.lang.String username = this.f270229d.getUsername();
        kotlin.jvm.internal.o.f(username, "<get-username>(...)");
        return f0Var.b(username);
    }
}
