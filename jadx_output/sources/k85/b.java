package k85;

/* loaded from: classes5.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f305370d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d85.g0 f305371e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d85.f0 f305372f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f305373g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f305374h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f305375i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(android.app.Activity activity, d85.g0 g0Var, d85.f0 f0Var, yz5.l lVar, yz5.l lVar2, java.lang.String str) {
        super(0);
        this.f305370d = activity;
        this.f305371e = g0Var;
        this.f305372f = f0Var;
        this.f305373g = lVar;
        this.f305374h = lVar2;
        this.f305375i = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        k85.t tVar = k85.t.f305439a;
        k85.t.f305440b.remove(this.f305370d + '_' + this.f305371e.f227192d);
        tVar.h(this.f305370d, this.f305371e, this.f305372f, this.f305373g, this.f305374h, this.f305375i);
        return jz5.f0.f302826a;
    }
}
