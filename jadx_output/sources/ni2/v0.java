package ni2;

/* loaded from: classes10.dex */
public final class v0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f337484d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ni2.x0 f337485e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(android.content.Context context, ni2.x0 x0Var) {
        super(0);
        this.f337484d = context;
        this.f337485e = x0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ni2.x0 x0Var = this.f337485e;
        gk2.e a17 = ((df2.d3) x0Var.f337502J).a();
        zh2.c cVar = x0Var.K;
        if (cVar == null) {
            cVar = x0Var.R;
        }
        return new pi2.q0(this.f337484d, a17, cVar, new ni2.u0(x0Var));
    }
}
