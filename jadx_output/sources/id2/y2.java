package id2;

/* loaded from: classes.dex */
public final class y2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f290888d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f290889e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.s f290890f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2(int i17, long j17, com.tencent.mm.plugin.lite.s sVar) {
        super(1);
        this.f290888d = i17;
        this.f290889e = j17;
        this.f290890f = sVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        cl0.g gVar = new cl0.g();
        gVar.r("statusChanged", booleanValue);
        java.lang.String gVar2 = gVar.toString();
        kotlin.jvm.internal.o.f(gVar2, "toString(...)");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[openCancelReplayPage] callback jsonStr:");
        sb6.append(gVar2);
        sb6.append(" callbackId:");
        int i17 = this.f290888d;
        sb6.append(i17);
        sb6.append(" instanceId:");
        long j17 = this.f290889e;
        sb6.append(j17);
        com.tencent.mars.xlog.Log.i("FinderLivePersonalCente", sb6.toString());
        this.f290890f.c(j17, i17, gVar2);
        return jz5.f0.f302826a;
    }
}
