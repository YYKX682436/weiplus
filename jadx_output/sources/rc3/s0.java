package rc3;

/* loaded from: classes7.dex */
public final class s0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rc3.w0 f394064d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f394065e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(rc3.w0 w0Var, boolean z17) {
        super(0);
        this.f394064d = w0Var;
        this.f394065e = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        qc3.f fVar = this.f394064d.A;
        if (fVar != null) {
            fVar.setMute(this.f394065e);
        }
        return jz5.f0.f302826a;
    }
}
