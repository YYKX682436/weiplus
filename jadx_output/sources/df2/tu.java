package df2;

/* loaded from: classes3.dex */
public final class tu extends if2.b implements zn0.z {

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f231473m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f231474n;

    /* renamed from: o, reason: collision with root package name */
    public int f231475o;

    /* renamed from: p, reason: collision with root package name */
    public int f231476p;

    /* renamed from: q, reason: collision with root package name */
    public int f231477q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f231478r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tu(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f231473m = jz5.h.b(df2.ru.f231270d);
        this.f231474n = jz5.h.b(df2.su.f231373d);
    }

    public final boolean Z6() {
        return ((java.lang.Boolean) ((jz5.n) this.f231473m).getValue()).booleanValue();
    }

    public final void a7() {
        com.tencent.mars.xlog.Log.i("TRTCPerformanceDetector", "onPerformanceClose performanceEnable: " + Z6() + " isPerformanceStart: " + this.f231478r);
        if (Z6() && this.f231478r) {
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            linkedHashMap.put("mic_total_size", java.lang.Integer.valueOf(this.f231475o));
            linkedHashMap.put("mic_video_size", java.lang.Integer.valueOf(this.f231476p));
            linkedHashMap.put("mic_audio_size", java.lang.Integer.valueOf(this.f231477q));
            linkedHashMap.put("is_anchor", java.lang.Integer.valueOf(zl2.r4.f473950a.x1() ? 1 : 0));
            linkedHashMap.put("trtc_performance", 1);
            ae2.in inVar = ae2.in.f3688a;
            linkedHashMap.put("trtc_op_switch", ((lb2.j) ((jz5.n) ae2.in.f3718d).getValue()).r());
            this.f231478r = false;
            ts5.d dVar = (ts5.d) ((jz5.n) this.f231474n).getValue();
            if (dVar != null) {
                dVar.a(linkedHashMap);
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveActivate() {
        super.onLiveActivate();
        com.tencent.mars.xlog.Log.i("TRTCPerformanceDetector", "onLiveActivate: " + hashCode());
        zn0.x.f474414a.f474419e = this;
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveDeactivate() {
        super.onLiveDeactivate();
        com.tencent.mars.xlog.Log.i("TRTCPerformanceDetector", "onLiveDeactivate: " + hashCode());
        a7();
        zn0.x.f474414a.f474419e = null;
    }
}
