package pe3;

/* loaded from: classes5.dex */
public final class c0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pe3.g0 f353642d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f353643e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f353644f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(pe3.g0 g0Var, int i17, int i18) {
        super(2);
        this.f353642d = g0Var;
        this.f353643e = i17;
        this.f353644f = i18;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f353644f | 1;
        pe3.g0.Q6(this.f353642d, this.f353643e, (n0.o) obj, i17);
        return jz5.f0.f302826a;
    }
}
