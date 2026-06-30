package tv2;

/* loaded from: classes10.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.e0 f422285d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tv2.f f422286e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f422287f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f422288g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(kotlin.jvm.internal.e0 e0Var, tv2.f fVar, int i17, int i18) {
        super(1);
        this.f422285d = e0Var;
        this.f422286e = fVar;
        this.f422287f = i17;
        this.f422288g = i18;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        float floatValue = ((java.lang.Number) obj).floatValue();
        kotlin.jvm.internal.e0 e0Var = this.f422285d;
        if (floatValue - e0Var.f310115d > 0.1f) {
            tv2.f fVar = this.f422286e;
            fVar.f422300h.getLocalId();
            fVar.p((this.f422287f + floatValue) / this.f422288g);
            e0Var.f310115d = floatValue;
        }
        return jz5.f0.f302826a;
    }
}
