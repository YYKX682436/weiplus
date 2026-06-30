package wy0;

/* loaded from: classes5.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d0.l0 f450627d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f450628e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f450629f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(d0.l0 l0Var, yz5.a aVar, int i17) {
        super(2);
        this.f450627d = l0Var;
        this.f450628e = aVar;
        this.f450629f = i17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f450629f | 1;
        wy0.o.a(this.f450627d, this.f450628e, (n0.o) obj, i17);
        return jz5.f0.f302826a;
    }
}
