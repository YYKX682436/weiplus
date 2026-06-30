package hr5;

/* loaded from: classes15.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr5.a1 f284477d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f284478e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(hr5.a1 a1Var, java.lang.String str) {
        super(0);
        this.f284477d = a1Var;
        this.f284478e = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        hr5.a1 a1Var = this.f284477d;
        sb6.append(a1Var.f284278b);
        sb6.append(". ");
        sb6.append(this.f284478e);
        sb6.append(". animated end. transform=");
        sb6.append(zq5.w.c(a1Var.f284297u));
        sb6.append(", userTransform=");
        sb6.append(zq5.w.c(a1Var.f284296t));
        return sb6.toString();
    }
}
