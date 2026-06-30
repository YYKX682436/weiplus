package g22;

/* loaded from: classes15.dex */
public final class s0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g22.u0 f267864d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f267865e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f267866f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(g22.u0 u0Var, int i17, java.lang.String str) {
        super(0);
        this.f267864d = u0Var;
        this.f267865e = i17;
        this.f267866f = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        i22.b0 b0Var = this.f267864d.f267875e;
        if (b0Var != null) {
            b0Var.f287935d.b(this.f267865e, this.f267866f);
        }
        return jz5.f0.f302826a;
    }
}
