package zl4;

/* loaded from: classes11.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bw5.pq0 f474075d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zl4.e f474076e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(bw5.pq0 pq0Var, zl4.e eVar) {
        super(0);
        this.f474075d = pq0Var;
        this.f474076e = eVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        if (this.f474075d == bw5.pq0.Playing) {
            this.f474076e.A0(false);
        }
        return jz5.f0.f302826a;
    }
}
