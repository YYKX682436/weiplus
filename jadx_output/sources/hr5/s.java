package hr5;

/* loaded from: classes15.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr5.a1 f284462d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f284463e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f284464f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ zq5.v f284465g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(hr5.a1 a1Var, java.lang.String str, float f17, zq5.v vVar) {
        super(0);
        this.f284462d = a1Var;
        this.f284463e = str;
        this.f284464f = f17;
        this.f284465g = vVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return this.f284462d.f284278b + ". " + this.f284463e + ". animated running. fraction=" + this.f284464f + ", userTransform=" + zq5.w.c(this.f284465g);
    }
}
