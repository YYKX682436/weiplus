package cr0;

/* loaded from: classes3.dex */
public final class t3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f221752d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Long f221753e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f221754f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3(java.util.Map map, java.lang.Long l17, long j17) {
        super(1);
        this.f221752d = map;
        this.f221753e = l17;
        this.f221754f = j17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.Map it = (java.util.Map) obj;
        kotlin.jvm.internal.o.g(it, "it");
        this.f221752d.put("pid-collect-ratio", java.lang.Long.valueOf(a06.d.c((((float) this.f221753e.longValue()) * 100.0f) / ((float) this.f221754f))));
        return jz5.f0.f302826a;
    }
}
