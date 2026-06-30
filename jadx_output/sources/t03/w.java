package t03;

/* loaded from: classes11.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f414516d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t03.k0 f414517e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(long j17, t03.k0 k0Var) {
        super(0);
        this.f414516d = j17;
        this.f414517e = k0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("event", "onFirstFrameRendered");
        hashMap.put("playerId", java.lang.Long.valueOf(this.f414516d));
        io.flutter.plugin.common.EventChannel.EventSink eventSink = ((v03.b) this.f414517e.f414463e).f432303h;
        if (eventSink != null) {
            eventSink.success(hashMap);
        }
        return jz5.f0.f302826a;
    }
}
