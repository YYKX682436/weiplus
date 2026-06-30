package tk3;

/* loaded from: classes8.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tk3.t f419938d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f419939e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(tk3.t tVar, float f17) {
        super(0);
        this.f419938d = tVar;
        this.f419939e = f17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        tk3.d dVar;
        tk3.t tVar = this.f419938d;
        if (tVar.p() && (dVar = tVar.f419949d) != null) {
            dVar.b(this.f419939e);
        }
        return jz5.f0.f302826a;
    }
}
