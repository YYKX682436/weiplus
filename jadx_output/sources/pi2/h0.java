package pi2;

/* loaded from: classes10.dex */
public final class h0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f354780d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pi2.q0 f354781e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(android.content.Context context, pi2.q0 q0Var) {
        super(0);
        this.f354780d = context;
        this.f354781e = q0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        pi2.q0 q0Var = this.f354781e;
        return new pi2.b0(this.f354780d, q0Var.I, new pi2.g0(q0Var));
    }
}
