package qi2;

/* loaded from: classes10.dex */
public final class n1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f363593d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qi2.q1 f363594e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(android.content.Context context, qi2.q1 q1Var) {
        super(0);
        this.f363593d = context;
        this.f363594e = q1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        qi2.q1 q1Var = this.f363594e;
        return new qi2.w0(this.f363593d, q1Var.f363606i, new qi2.m1(q1Var));
    }
}
