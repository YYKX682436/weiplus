package db2;

/* loaded from: classes3.dex */
public final class a1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ db2.b1 f227882d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f227883e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f227884f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f227885g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.v71 f227886h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(db2.b1 b1Var, int i17, int i18, java.lang.String str, r45.v71 v71Var) {
        super(0);
        this.f227882d = b1Var;
        this.f227883e = i17;
        this.f227884f = i18;
        this.f227885g = str;
        this.f227886h = v71Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        db2.z0 z0Var = this.f227882d.f227906t;
        if (z0Var != null) {
            z0Var.a(this.f227883e, this.f227884f, this.f227885g, this.f227886h);
        }
        return jz5.f0.f302826a;
    }
}
