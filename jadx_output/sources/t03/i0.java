package t03;

/* loaded from: classes11.dex */
public final class i0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f414454d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f414455e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ t03.k0 f414456f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dk4.a f414457g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(long j17, long j18, t03.k0 k0Var, dk4.a aVar) {
        super(0);
        this.f414454d = j17;
        this.f414455e = j18;
        this.f414456f = k0Var;
        this.f414457g = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str;
        s03.f fVar;
        kk4.h hVar;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("event", "onProgress");
        hashMap.put("playerId", java.lang.Long.valueOf(this.f414454d));
        hashMap.put("progress", java.lang.Long.valueOf(this.f414455e));
        t03.k0 k0Var = this.f414456f;
        io.flutter.plugin.common.EventChannel.EventSink eventSink = ((v03.b) k0Var.f414463e).f432303h;
        if (eventSink != null) {
            eventSink.success(hashMap);
        }
        t03.r0 r0Var = k0Var.f414468m;
        dk4.a aVar = this.f414457g;
        if (r0Var == null || (hVar = r0Var.f308580e) == null || (str = hVar.f308545d) == null) {
            str = aVar != null ? aVar.f234482s : null;
        }
        java.lang.String str2 = str;
        if (str2 != null && (fVar = k0Var.f414464f) != null) {
            fVar.L(str2, this.f414454d, this.f414455e, aVar != null ? aVar.f234470g : 0L);
        }
        return jz5.f0.f302826a;
    }
}
