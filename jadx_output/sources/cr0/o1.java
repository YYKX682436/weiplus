package cr0;

/* loaded from: classes12.dex */
public final class o1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rh.o2 f221697d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f221698e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f221699f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(rh.o2 o2Var, java.util.Map map, long j17) {
        super(1);
        this.f221697d = o2Var;
        this.f221698e = map;
        this.f221699f = j17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.Map it = (java.util.Map) obj;
        kotlin.jvm.internal.o.g(it, "it");
        this.f221698e.put("pid-collect-ratio", java.lang.Long.valueOf(a06.d.c((((float) ((java.lang.Long) ((cr0.k0) this.f221697d.f395486c).f221787d.f395552a).longValue()) * 100.0f) / ((float) this.f221699f))));
        return jz5.f0.f302826a;
    }
}
