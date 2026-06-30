package t03;

/* loaded from: classes11.dex */
public final class e0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t03.k0 f414443d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f414444e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(t03.k0 k0Var, long j17) {
        super(2);
        this.f414443d = k0Var;
        this.f414444e = j17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        pm0.v.X(new t03.d0(this.f414443d, ((java.lang.Number) obj).intValue(), ((java.lang.Number) obj2).intValue(), this.f414444e));
        return jz5.f0.f302826a;
    }
}
