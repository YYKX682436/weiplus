package pi2;

/* loaded from: classes10.dex */
public final class l0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f354791d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pi2.q0 f354792e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(android.content.Context context, pi2.q0 q0Var) {
        super(0);
        this.f354791d = context;
        this.f354792e = q0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return new pi2.z(this.f354791d, new pi2.k0(this.f354792e));
    }
}
