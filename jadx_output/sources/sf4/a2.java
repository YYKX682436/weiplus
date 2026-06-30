package sf4;

/* loaded from: classes4.dex */
public final class a2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sf4.d2 f407413d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f407414e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f407415f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(sf4.d2 d2Var, java.lang.String str, int i17) {
        super(0);
        this.f407413d = d2Var;
        this.f407414e = str;
        this.f407415f = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        t21.h0 h0Var = this.f407413d.f407449e;
        if (h0Var != null) {
            h0Var.o(this.f407414e, this.f407415f);
        }
        return jz5.f0.f302826a;
    }
}
