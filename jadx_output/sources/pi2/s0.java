package pi2;

/* loaded from: classes3.dex */
public final class s0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f354809d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pi2.w0 f354810e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(android.content.Context context, pi2.w0 w0Var) {
        super(0);
        this.f354809d = context;
        this.f354810e = w0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        pi2.w0 w0Var = this.f354810e;
        return new pi2.t(this.f354809d, w0Var.H, new pi2.r0(w0Var));
    }
}
