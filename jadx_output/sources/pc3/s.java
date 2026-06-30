package pc3;

/* loaded from: classes7.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pc3.t f353395d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f353396e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f353397f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f353398g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(pc3.t tVar, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        super(0);
        this.f353395d = tVar;
        this.f353396e = str;
        this.f353397f = str2;
        this.f353398g = str3;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        sc3.k1 k1Var = (sc3.k1) this.f353395d.f353402h.get(this.f353396e);
        if (k1Var != null) {
            k1Var.s2(this.f353397f, this.f353398g);
        }
        return jz5.f0.f302826a;
    }
}
