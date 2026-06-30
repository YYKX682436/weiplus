package t03;

/* loaded from: classes11.dex */
public final class z extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f414521d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t03.k0 f414522e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(long j17, t03.k0 k0Var) {
        super(0);
        this.f414521d = j17;
        this.f414522e = k0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        kk4.c cVar;
        kk4.c cVar2;
        kk4.c cVar3;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("event", "onPrepared");
        hashMap.put("playerId", java.lang.Long.valueOf(this.f414521d));
        t03.k0 k0Var = this.f414522e;
        t03.r0 r0Var = k0Var.f414468m;
        int i17 = 0;
        hashMap.put("width", java.lang.Integer.valueOf((r0Var == null || (cVar3 = r0Var.f308577b) == null) ? 0 : ((kk4.f0) cVar3).getVideoWidth()));
        t03.r0 r0Var2 = k0Var.f414468m;
        if (r0Var2 != null && (cVar2 = r0Var2.f308577b) != null) {
            i17 = ((kk4.f0) cVar2).getVideoHeight();
        }
        hashMap.put("height", java.lang.Integer.valueOf(i17));
        t03.r0 r0Var3 = k0Var.f414468m;
        hashMap.put("duration", java.lang.Long.valueOf((r0Var3 == null || (cVar = r0Var3.f308577b) == null) ? 0L : ((kk4.f0) cVar).getDurationMs()));
        io.flutter.plugin.common.EventChannel.EventSink eventSink = ((v03.b) k0Var.f414463e).f432303h;
        if (eventSink != null) {
            eventSink.success(hashMap);
        }
        return jz5.f0.f302826a;
    }
}
