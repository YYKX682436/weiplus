package qu2;

/* loaded from: classes12.dex */
public final class l implements ts5.d {

    /* renamed from: a, reason: collision with root package name */
    public final ts5.a f366793a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f366794b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f366795c;

    /* renamed from: d, reason: collision with root package name */
    public float f366796d;

    public l(ts5.a collectWhat) {
        kotlin.jvm.internal.o.g(collectWhat, "collectWhat");
        this.f366793a = collectWhat;
    }

    @Override // ts5.d
    public void a(java.util.Map map) {
        if (this.f366794b && !this.f366795c) {
            this.f366795c = true;
            ((com.tencent.mm.feature.performance.c2) ((ob0.h3) i95.n0.c(ob0.h3.class))).getClass();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("startMemory", java.lang.Float.valueOf(this.f366796d));
            jSONObject.put("stopMemory", java.lang.Float.valueOf(com.tencent.mm.plugin.performance.watchdogs.b0.B.g().f343968y / 1024.0f));
            ((nu2.i) ((ts5.n) i95.n0.c(ts5.n.class))).Ai(this.f366793a, jSONObject);
        }
    }

    @Override // ts5.d
    public void cancel() {
        this.f366795c = true;
    }

    @Override // ts5.d
    public void start() {
        if (this.f366794b) {
            return;
        }
        ((com.tencent.mm.feature.performance.c2) ((ob0.h3) i95.n0.c(ob0.h3.class))).getClass();
        this.f366796d = com.tencent.mm.plugin.performance.watchdogs.b0.B.g().f343968y / 1024.0f;
        this.f366794b = true;
    }
}
