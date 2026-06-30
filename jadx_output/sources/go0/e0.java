package go0;

/* loaded from: classes3.dex */
public final class e0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ go0.f0 f273752d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f273753e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f273754f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(go0.f0 f0Var, int i17, int i18) {
        super(0);
        this.f273752d = f0Var;
        this.f273753e = i17;
        this.f273754f = i18;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        go0.f1 f1Var = this.f273752d.f273767p;
        if (f1Var != null) {
            f1Var.u(this.f273753e, this.f273754f);
        }
        return jz5.f0.f302826a;
    }
}
