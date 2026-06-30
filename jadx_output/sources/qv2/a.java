package qv2;

/* loaded from: classes10.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.e0 f366931d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qv2.b f366932e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f366933f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.List f366934g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(kotlin.jvm.internal.e0 e0Var, qv2.b bVar, int i17, java.util.List list) {
        super(1);
        this.f366931d = e0Var;
        this.f366932e = bVar;
        this.f366933f = i17;
        this.f366934g = list;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        float floatValue = ((java.lang.Number) obj).floatValue();
        kotlin.jvm.internal.e0 e0Var = this.f366931d;
        if (floatValue - e0Var.f310115d > 0.1f) {
            this.f366932e.v((this.f366933f + floatValue) / this.f366934g.size());
            e0Var.f310115d = floatValue;
        }
        return jz5.f0.f302826a;
    }
}
