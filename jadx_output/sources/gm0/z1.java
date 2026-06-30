package gm0;

/* loaded from: classes12.dex */
public final class z1 {

    /* renamed from: j, reason: collision with root package name */
    public static gm0.z1 f273295j;

    /* renamed from: a, reason: collision with root package name */
    public final gm0.z f273296a;

    /* renamed from: b, reason: collision with root package name */
    public final gm0.a0 f273297b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f273298c = new byte[0];

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f273299d = false;

    /* renamed from: e, reason: collision with root package name */
    public long f273300e;

    /* renamed from: f, reason: collision with root package name */
    public gm0.v1 f273301f;

    /* renamed from: g, reason: collision with root package name */
    public final gm0.y1 f273302g;

    /* renamed from: h, reason: collision with root package name */
    public final gm0.y1 f273303h;

    /* renamed from: i, reason: collision with root package name */
    public final gm0.y1 f273304i;

    public z1(km0.b bVar) {
        lm5.j jVar = lm5.d.f319600a;
        this.f273302g = new gm0.y1(jVar, false);
        this.f273303h = new gm0.y1(jVar, true);
        this.f273304i = new gm0.y1(lm5.d.f319601b, true);
        this.f273296a = new gm0.z();
        this.f273297b = new gm0.a0(bVar);
    }

    public final void a(gm0.y1 y1Var, hm0.t tVar) {
        boolean z17;
        synchronized (this.f273298c) {
            if (this.f273299d) {
                z17 = true;
            } else {
                y1Var.v(tVar);
                z17 = false;
            }
        }
        if (z17) {
            tVar.b();
        }
    }

    public gm0.a0 b() {
        gm0.a0 a0Var = this.f273297b;
        iz5.a.d("mCoreProcess not initialized!", a0Var);
        return a0Var;
    }
}
