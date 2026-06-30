package ni2;

/* loaded from: classes3.dex */
public final class y1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f337509d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ni2.z1 f337510e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(android.content.Context context, ni2.z1 z1Var) {
        super(0);
        this.f337509d = context;
        this.f337510e = z1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ni2.z1 z1Var = this.f337510e;
        return new pi2.n(this.f337509d, z1Var.H, z1Var.f337520J, new ni2.x1(z1Var));
    }
}
