package j0;

/* loaded from: classes14.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z0.t f296222d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f296223e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(z0.t tVar, int i17) {
        super(2);
        this.f296222d = tVar;
        this.f296223e = i17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f296223e | 1;
        j0.g.b(this.f296222d, (n0.o) obj, i17);
        return jz5.f0.f302826a;
    }
}
