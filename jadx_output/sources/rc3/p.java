package rc3;

/* loaded from: classes7.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rc3.w0 f394045d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f394046e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f394047f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(rc3.w0 w0Var, int i17, boolean z17) {
        super(0);
        this.f394045d = w0Var;
        this.f394046e = i17;
        this.f394047f = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        rc3.w0 w0Var = this.f394045d;
        w0Var.S(new rc3.o(w0Var, this.f394046e, this.f394047f));
        return jz5.f0.f302826a;
    }
}
