package un2;

/* loaded from: classes10.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ un2.k f429468d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f429469e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(un2.k kVar, long j17, int i17) {
        super(1);
        this.f429468d = kVar;
        this.f429469e = j17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.z41 resp = (r45.z41) obj;
        kotlin.jvm.internal.o.g(resp, "resp");
        long j17 = this.f429469e;
        un2.k kVar = this.f429468d;
        kVar.getClass();
        pm0.v.X(new un2.f(j17, kVar, resp, 2));
        return jz5.f0.f302826a;
    }
}
