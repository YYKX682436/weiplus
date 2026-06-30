package tt2;

/* loaded from: classes3.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tt2.e1 f422003d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f422004e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f422005f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(tt2.e1 e1Var, int i17, java.lang.Object obj) {
        super(0);
        this.f422003d = e1Var;
        this.f422004e = i17;
        this.f422005f = obj;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f422003d.notifyItemChanged(this.f422004e, this.f422005f);
        return jz5.f0.f302826a;
    }
}
