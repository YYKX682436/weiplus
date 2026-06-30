package ct2;

/* loaded from: classes3.dex */
public final class j extends mm2.e {
    public int A;
    public float B;
    public boolean C;
    public boolean D;
    public kotlinx.coroutines.r2 E;
    public final jz5.g F;
    public long G;

    /* renamed from: f, reason: collision with root package name */
    public boolean f222265f;

    /* renamed from: g, reason: collision with root package name */
    public long f222266g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData f222267h;

    /* renamed from: i, reason: collision with root package name */
    public int f222268i;

    /* renamed from: m, reason: collision with root package name */
    public int f222269m;

    /* renamed from: n, reason: collision with root package name */
    public kn0.m f222270n;

    /* renamed from: o, reason: collision with root package name */
    public kn0.k f222271o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f222272p;

    /* renamed from: q, reason: collision with root package name */
    public int f222273q;

    /* renamed from: r, reason: collision with root package name */
    public int f222274r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f222275s;

    /* renamed from: t, reason: collision with root package name */
    public int f222276t;

    /* renamed from: u, reason: collision with root package name */
    public int f222277u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f222278v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f222279w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f222280x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f222281y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f222282z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(gk2.e liveContext) {
        super(liveContext);
        kotlin.jvm.internal.o.g(liveContext, "liveContext");
        this.f222267h = new com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData();
        this.f222270n = kn0.m.f309573d;
        new r45.nw1();
        this.f222271o = kn0.k.f309566d;
        this.f222277u = -1;
        this.f222281y = "";
        this.f222282z = "";
        this.B = 1.0f;
        this.F = jz5.h.b(ct2.i.f222264d);
    }

    public static int U6(ct2.j jVar, int i17, int i18, java.lang.Object obj) {
        if ((i18 & 1) != 0) {
            i17 = 1;
        }
        jVar.getClass();
        ne2.c cVar = ne2.c.f336527a;
        r45.td2 td2Var = (r45.td2) jVar.P6().getCustom(27);
        if (((java.lang.Boolean) ((jz5.n) ne2.c.f336528b).getValue()).booleanValue()) {
            return 180;
        }
        return cm2.a.f43328a.j(td2Var, i17);
    }

    public final java.lang.String N6() {
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = ((mm2.c1) business(mm2.c1.class)).f328846n;
        java.lang.String username = finderObject != null ? finderObject.getUsername() : null;
        return username == null ? "" : username;
    }

    public final long O6() {
        return P6().getLong(0);
    }

    public final r45.nw1 P6() {
        return ((mm2.e1) business(mm2.e1.class)).f328988r;
    }

    public final long Q6() {
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = ((mm2.c1) business(mm2.c1.class)).f328846n;
        if (finderObject != null) {
            return finderObject.getId();
        }
        return 0L;
    }

    public final ct2.g R6() {
        return (ct2.g) ((jz5.n) this.F).getValue();
    }

    public final int S6() {
        int i17 = this.f222274r;
        return i17 > 0 ? i17 : this.f222276t;
    }

    public final boolean T6() {
        if (N6().length() > 0) {
            java.lang.String N6 = N6();
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            if (kotlin.jvm.internal.o.b(N6, xy2.c.e(context))) {
                return true;
            }
        }
        return false;
    }

    public final void V6(int i17) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", i17);
        if (i17 == 1) {
            this.G = java.lang.System.currentTimeMillis();
            i95.m c17 = i95.n0.c(ml2.r0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ml2.r0.hj((ml2.r0) c17, ml2.b4.J1, jSONObject.toString(), 0L, null, null, null, null, null, 252, null);
            return;
        }
        if (i17 != 2 || this.G == 0) {
            return;
        }
        jSONObject.put("pad_duration", java.lang.System.currentTimeMillis() - this.G);
        this.G = 0L;
        i95.m c18 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c18, "getService(...)");
        ml2.r0.hj((ml2.r0) c18, ml2.b4.J1, jSONObject.toString(), 0L, null, null, null, null, null, 252, null);
    }

    public final void W6(int i17) {
        if (i17 != this.f222277u) {
            com.tencent.mars.xlog.Log.i("MMFinder.LiveReplaySlice", "cacheReplayStatus from " + this.f222277u + " to " + i17);
        }
        this.f222277u = i17;
    }

    public final void X6(boolean z17) {
        com.tencent.mars.xlog.Log.i("MMFinder.LiveReplaySlice", "manualClose:" + z17);
        this.f222278v = z17;
    }

    public final void Y6(boolean z17) {
        com.tencent.mars.xlog.Log.i("MMFinder.LiveReplaySlice", "manualMinimum:" + z17);
        this.f222279w = z17;
    }

    public final void Z6(int i17) {
        com.tencent.mars.xlog.Log.i("MMFinder.LiveReplaySlice", "play offset:" + i17);
        je2.y yVar = (je2.y) business(je2.y.class);
        java.lang.String valueOf = java.lang.String.valueOf(i17);
        kotlin.jvm.internal.o.g(valueOf, "<set-?>");
        yVar.f299285g = valueOf;
        this.f222273q = i17;
    }

    public final void a7(int i17, java.lang.Boolean bool) {
        if (bool != null) {
            this.f222275s = bool.booleanValue();
        }
        if (i17 != this.f222276t) {
            com.tencent.mars.xlog.Log.i("MMFinder.LiveReplaySlice", "setOrigDura from:" + this.f222276t + " to " + i17 + ",fromServer:" + bool);
        }
        if (i17 != this.f222276t) {
            com.tencent.mars.xlog.Log.i("MMFinder.LiveReplaySlice", "orgi_duration:" + i17);
        }
        this.f222276t = i17;
    }

    public final void b7(boolean z17) {
        com.tencent.mars.xlog.Log.i("MMFinder.LiveReplaySlice", "playTransition:" + this.f222265f + " -> " + z17 + '!');
        this.f222265f = z17;
    }

    public final void c7(int i17) {
        if (i17 != this.f222268i) {
            com.tencent.mars.xlog.Log.i("MMFinder.LiveReplaySlice", "replayStartOffset from:" + this.f222268i + " to " + i17);
            this.f222268i = i17;
        }
    }

    public final void d7(int i17) {
        if (i17 != this.f222269m) {
            com.tencent.mars.xlog.Log.i("MMFinder.LiveReplaySlice", "replayStatus from:" + this.f222269m + " to " + i17);
            this.f222269m = i17;
        }
    }

    public final void e7(kn0.m value) {
        kotlin.jvm.internal.o.g(value, "value");
        if (value != this.f222270n) {
            com.tencent.mars.xlog.Log.i("MMFinder.LiveReplaySlice", "uiStatus from:" + this.f222270n + " to " + value);
            this.f222270n = value;
        }
    }

    public final void f7(kn0.k value) {
        kotlin.jvm.internal.o.g(value, "value");
        if (this.f222271o == value) {
            com.tencent.mars.xlog.Log.i("MMFinder.LiveReplaySlice", "set liveMode:" + this.f222271o + '!');
        }
        this.f222271o = value;
    }

    @Override // androidx.lifecycle.c1
    public void onCleared() {
        super.onCleared();
        com.tencent.mars.xlog.Log.i("MMFinder.LiveReplaySlice", "onCleared");
        Z6(0);
        if (this.f222274r != 0) {
            com.tencent.mars.xlog.Log.i("MMFinder.LiveReplaySlice", "play total:0");
        }
        this.f222274r = 0;
        this.f222275s = false;
        if (this.f222276t != 0) {
            com.tencent.mars.xlog.Log.i("MMFinder.LiveReplaySlice", "orgi_duration:0");
        }
        this.f222276t = 0;
        this.f222266g = 0L;
        c7(0);
        X6(false);
        Y6(false);
        f7(kn0.k.f309566d);
        kotlinx.coroutines.r2 r2Var = this.E;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        this.C = false;
        this.D = false;
        b7(false);
        this.f222280x = false;
        this.B = 1.0f;
    }
}
