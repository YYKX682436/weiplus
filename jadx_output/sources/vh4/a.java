package vh4;

/* loaded from: classes.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uh4.a0 f437047d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f437048e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f437049f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f437050g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(uh4.a0 a0Var, int i17, java.lang.String str, boolean z17) {
        super(0);
        this.f437047d = a0Var;
        this.f437048e = i17;
        this.f437049f = str;
        this.f437050g = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f437047d.onResult(this.f437048e, this.f437049f, this.f437050g);
        return jz5.f0.f302826a;
    }
}
