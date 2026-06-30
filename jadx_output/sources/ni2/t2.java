package ni2;

/* loaded from: classes3.dex */
public final class t2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f337471d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ni2.u2 f337472e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(android.content.Context context, ni2.u2 u2Var) {
        super(0);
        this.f337471d = context;
        this.f337472e = u2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ni2.u2 u2Var = this.f337472e;
        return new ni2.q2(this.f337471d, u2Var.f337478h, new ni2.s2(u2Var));
    }
}
