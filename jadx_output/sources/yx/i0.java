package yx;

/* loaded from: classes14.dex */
public final class i0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z0.t f467034d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f467035e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f467036f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f467037g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(z0.t tVar, boolean z17, yz5.a aVar, int i17) {
        super(2);
        this.f467034d = tVar;
        this.f467035e = z17;
        this.f467036f = aVar;
        this.f467037g = i17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f467037g | 1;
        boolean z17 = this.f467035e;
        yz5.a aVar = this.f467036f;
        yx.q0.e(this.f467034d, z17, aVar, (n0.o) obj, i17);
        return jz5.f0.f302826a;
    }
}
