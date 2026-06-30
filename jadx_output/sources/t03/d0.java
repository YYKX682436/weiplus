package t03;

/* loaded from: classes11.dex */
public final class d0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t03.k0 f414436d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f414437e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f414438f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f414439g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(t03.k0 k0Var, int i17, int i18, long j17) {
        super(0);
        this.f414436d = k0Var;
        this.f414437e = i17;
        this.f414438f = i18;
        this.f414439g = j17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        t03.k0 k0Var = this.f414436d;
        java.lang.String str = k0Var.f414465g;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setOnStateChangeListener ");
        int i17 = this.f414437e;
        sb6.append(i17);
        sb6.append(' ');
        int i18 = this.f414438f;
        sb6.append(i18);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("event", "onStateChange");
        hashMap.put("playerId", java.lang.Long.valueOf(this.f414439g));
        hashMap.put("lastState", java.lang.Integer.valueOf(i17));
        hashMap.put("currentState", java.lang.Integer.valueOf(i18));
        io.flutter.plugin.common.EventChannel.EventSink eventSink = ((v03.b) k0Var.f414463e).f432303h;
        if (eventSink != null) {
            eventSink.success(hashMap);
        }
        return jz5.f0.f302826a;
    }
}
