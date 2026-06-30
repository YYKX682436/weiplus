package w0;

/* loaded from: classes14.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w0.p f441851d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f441852e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.p f441853f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f441854g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(w0.p pVar, java.lang.Object obj, yz5.p pVar2, int i17) {
        super(2);
        this.f441851d = pVar;
        this.f441852e = obj;
        this.f441853f = pVar2;
        this.f441854g = i17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f441854g | 1;
        java.lang.Object obj3 = this.f441852e;
        yz5.p pVar = this.f441853f;
        this.f441851d.a(obj3, pVar, (n0.o) obj, i17);
        return jz5.f0.f302826a;
    }
}
