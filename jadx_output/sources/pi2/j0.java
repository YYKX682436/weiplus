package pi2;

/* loaded from: classes10.dex */
public final class j0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f354785d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pi2.q0 f354786e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(android.content.Context context, pi2.q0 q0Var) {
        super(0);
        this.f354785d = context;
        this.f354786e = q0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return new pi2.x(this.f354785d, new pi2.i0(this.f354786e));
    }
}
