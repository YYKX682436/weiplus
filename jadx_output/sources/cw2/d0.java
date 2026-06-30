package cw2;

/* loaded from: classes15.dex */
public final class d0 {

    /* renamed from: n, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicInteger f223626n = new java.util.concurrent.atomic.AtomicInteger();

    /* renamed from: a, reason: collision with root package name */
    public final kk4.c f223627a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy f223628b;

    /* renamed from: c, reason: collision with root package name */
    public int f223629c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f223630d;

    /* renamed from: e, reason: collision with root package name */
    public final int f223631e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f223632f;

    /* renamed from: g, reason: collision with root package name */
    public long f223633g;

    /* renamed from: h, reason: collision with root package name */
    public long f223634h;

    /* renamed from: i, reason: collision with root package name */
    public long f223635i;

    /* renamed from: j, reason: collision with root package name */
    public float f223636j;

    /* renamed from: k, reason: collision with root package name */
    public cw2.w9 f223637k;

    /* renamed from: l, reason: collision with root package name */
    public final java.util.Map f223638l;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.Map f223639m;

    public d0(kk4.c player, com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy proxy) {
        java.util.Map map;
        kotlin.jvm.internal.o.g(player, "player");
        kotlin.jvm.internal.o.g(proxy, "proxy");
        this.f223627a = player;
        this.f223628b = proxy;
        this.f223630d = new java.util.concurrent.atomic.AtomicInteger();
        this.f223631e = ((c61.l7) i95.n0.c(c61.l7.class)).ek().f464708y * 1000;
        this.f223633g = 40000L;
        this.f223636j = 1.0f;
        java.util.concurrent.CopyOnWriteArrayList<r45.xe2> copyOnWriteArrayList = ((c61.l7) i95.n0.c(c61.l7.class)).ek().U;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (r45.xe2 xe2Var : copyOnWriteArrayList) {
            linkedHashMap.put(java.lang.Integer.valueOf(xe2Var.getInteger(0)), java.lang.Integer.valueOf(xe2Var.getInteger(1) * 1000));
        }
        this.f223638l = linkedHashMap;
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (((java.lang.Boolean) ((nb2.a) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.De).getValue()).r()).booleanValue()) {
            map = kz5.c1.l(new jz5.l(30000, 25000), new jz5.l(java.lang.Integer.valueOf(com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL), java.lang.Integer.valueOf(com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEINPUTBUFFER_ILLEGAL)), new jz5.l(120000, java.lang.Integer.valueOf(com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL)));
        } else {
            java.util.concurrent.CopyOnWriteArrayList<r45.ye2> copyOnWriteArrayList2 = ((c61.l7) i95.n0.c(c61.l7.class)).ek().T;
            java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
            for (r45.ye2 ye2Var : copyOnWriteArrayList2) {
                linkedHashMap2.put(java.lang.Integer.valueOf(ye2Var.getInteger(0) * 1000), java.lang.Integer.valueOf(ye2Var.getInteger(1) * 1000));
            }
            map = linkedHashMap2;
        }
        this.f223639m = map;
    }

    public final void a(long j17, java.lang.String str) {
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127830mf).getValue()).r()).booleanValue() && this.f223628b.isViewFocused && j17 >= this.f223631e) {
            long b17 = (((float) j17) * this.f223636j) + b() + c();
            if (b17 == this.f223635i) {
                return;
            }
            if (b17 > this.f223633g) {
                this.f223633g = b17;
            }
            long j18 = 1000;
            ((kk4.f0) this.f223627a).configBufferDurationAsync(this.f223630d.getAndIncrement(), b17 * j18, 0L, this.f223633g * j18);
            com.tencent.mars.xlog.Log.i(d(), "configBufferMs#" + str + " playSpeed:" + this.f223636j + ' ' + this.f223634h + " -> " + b17 + '(' + j17 + " + " + b() + " +" + c() + ") maxLimit:" + this.f223633g + ' ');
            this.f223634h = j17;
            this.f223635i = b17;
        }
    }

    public final int b() {
        cs2.j d17;
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (!((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127812lf).getValue()).r()).booleanValue() || this.f223638l.size() == 0) {
            return 0;
        }
        java.util.concurrent.atomic.AtomicInteger atomicInteger = f223626n;
        if (atomicInteger.get() == 0 || !this.f223628b.f130665r) {
            return 0;
        }
        cw2.w9 w9Var = this.f223637k;
        int m17 = (w9Var == null || (d17 = w9Var.d1()) == null) ? 0 : d17.m();
        if (m17 > 0) {
            com.tencent.mars.xlog.Log.i("FinderBufCtr", "getAppendBufferMs return for " + m17);
            return 0;
        }
        java.lang.Integer num = (java.lang.Integer) ((java.util.LinkedHashMap) this.f223638l).get(java.lang.Integer.valueOf(atomicInteger.get()));
        int intValue = num != null ? num.intValue() : 50000;
        this.f223628b.getF130672x0().N = intValue;
        return intValue;
    }

    public final int c() {
        cs2.j d17;
        if (!this.f223628b.f130665r) {
            return 0;
        }
        cw2.w9 w9Var = this.f223637k;
        int m17 = (w9Var == null || (d17 = w9Var.d1()) == null) ? 0 : d17.m();
        if (m17 <= 0) {
            return com.tencent.thumbplayer.tmediacodec.codec.CodecError.START_ILLEGAL;
        }
        com.tencent.mars.xlog.Log.i("FinderBufCtr", "getAppendPart3Ms return for " + m17);
        return 0;
    }

    public final java.lang.String d() {
        return this.f223628b.getFTPPTag() + ".FinderBufCtr";
    }
}
