package dk2;

/* loaded from: classes3.dex */
public final class ga {

    /* renamed from: a, reason: collision with root package name */
    public long f233513a;

    /* renamed from: b, reason: collision with root package name */
    public long f233514b;

    /* renamed from: c, reason: collision with root package name */
    public long f233515c;

    /* renamed from: d, reason: collision with root package name */
    public int f233516d;

    /* renamed from: e, reason: collision with root package name */
    public int f233517e;

    /* renamed from: f, reason: collision with root package name */
    public float f233518f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f233519g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f233520h;

    /* renamed from: i, reason: collision with root package name */
    public kotlinx.coroutines.r2 f233521i;

    public ga(java.lang.String sessionId, long j17, long j18, long j19, long j27, int i17, int i18, float f17, boolean z17, java.util.List list, int i19, kotlin.jvm.internal.i iVar) {
        long j28 = (i19 & 8) != 0 ? 0L : j19;
        long j29 = (i19 & 16) == 0 ? j27 : 0L;
        int i27 = (i19 & 32) != 0 ? 0 : i17;
        int i28 = (i19 & 64) != 0 ? 0 : i18;
        float f18 = (i19 & 128) != 0 ? 1.0f : f17;
        boolean z18 = (i19 & 256) == 0 ? z17 : false;
        java.util.List waitingHlCheerList = (i19 & 512) != 0 ? new java.util.ArrayList() : list;
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        kotlin.jvm.internal.o.g(waitingHlCheerList, "waitingHlCheerList");
        this.f233513a = j18;
        this.f233514b = j28;
        this.f233515c = j29;
        this.f233516d = i27;
        this.f233517e = i28;
        this.f233518f = f18;
        this.f233519g = z18;
        this.f233520h = waitingHlCheerList;
    }

    public final void a(kotlinx.coroutines.y0 scope) {
        kotlin.jvm.internal.o.g(scope, "scope");
        kotlinx.coroutines.r2 r2Var = this.f233521i;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        this.f233513a++;
        this.f233519g = true;
        this.f233521i = kotlinx.coroutines.l.d(scope, null, null, new dk2.fa(this, null), 3, null);
    }
}
