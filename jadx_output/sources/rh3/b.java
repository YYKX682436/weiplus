package rh3;

/* loaded from: classes15.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rh3.c f395660d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f395661e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f395662f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(rh3.c cVar, long j17, long j18) {
        super(0);
        this.f395660d = cVar;
        this.f395661e = j17;
        this.f395662f = j18;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        rh3.c cVar = this.f395660d;
        rh3.j jVar = cVar.f395673q;
        if (jVar != null) {
            jVar.n(cVar, this.f395661e, this.f395662f);
        }
        return jz5.f0.f302826a;
    }
}
