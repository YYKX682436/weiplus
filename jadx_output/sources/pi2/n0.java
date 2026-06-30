package pi2;

/* loaded from: classes10.dex */
public final class n0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f354796d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pi2.q0 f354797e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(android.content.Context context, pi2.q0 q0Var) {
        super(0);
        this.f354796d = context;
        this.f354797e = q0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return new pi2.v(this.f354796d, new pi2.m0(this.f354797e));
    }
}
