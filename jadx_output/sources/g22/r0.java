package g22;

/* loaded from: classes15.dex */
public final class r0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g22.u0 f267860d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f267861e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f267862f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(g22.u0 u0Var, java.lang.String str, int i17) {
        super(0);
        this.f267860d = u0Var;
        this.f267861e = str;
        this.f267862f = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        i22.b0 b0Var = this.f267860d.f267875e;
        if (b0Var != null) {
            b0Var.f287935d.h(this.f267862f, this.f267861e);
        }
        return jz5.f0.f302826a;
    }
}
