package t21;

/* loaded from: classes12.dex */
public class p3 implements wf0.u1, i95.m {

    /* renamed from: y, reason: collision with root package name */
    public static int f414863y;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.n3 f414864d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f414865e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f414866f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f414867g = new java.util.ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.Queue f414868h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Queue f414869i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.Queue f414870m = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.Queue f414871n = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.Map f414872o = new java.util.HashMap();

    /* renamed from: p, reason: collision with root package name */
    public boolean f414873p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f414874q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f414875r = false;

    /* renamed from: s, reason: collision with root package name */
    public int f414876s = 0;

    /* renamed from: t, reason: collision with root package name */
    public long f414877t = 0;

    /* renamed from: u, reason: collision with root package name */
    public t21.r0 f414878u = null;

    /* renamed from: v, reason: collision with root package name */
    public t21.w0 f414879v = null;

    /* renamed from: w, reason: collision with root package name */
    public final fp.j f414880w = new fp.j();

    /* renamed from: x, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f414881x = new java.util.concurrent.ConcurrentHashMap();

    public p3() {
        this.f414865e = false;
        this.f414866f = null;
        this.f414865e = true;
        xu5.b a17 = xu5.b.a("VideoService_runThread");
        this.f414864d = new com.tencent.mm.sdk.platformtools.n3(a17);
        this.f414866f = new com.tencent.mm.sdk.platformtools.b4(a17, (com.tencent.mm.sdk.platformtools.a4) new t21.l3(this), false);
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoService", "create VideoService, start video send thread");
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x0437, code lost:
    
        if (((r0 == 0 || r0 == 1) ? false : true) != false) goto L164;
     */
    /* JADX WARN: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x035b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(t21.p3 r18) {
        /*
            Method dump skipped, instructions count: 1122
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t21.p3.b(t21.p3):void");
    }

    public void c(java.lang.String str, int i17, wf0.u1 u1Var) {
        this.f414881x.put(str, u1Var);
        gm0.j1.e().j(new t21.o3(this, str, i17));
    }

    public final void f() {
        ((java.util.HashMap) this.f414872o).clear();
        ((java.util.LinkedList) this.f414868h).clear();
        ((java.util.LinkedList) this.f414869i).clear();
        ((java.util.LinkedList) this.f414870m).clear();
        ((java.util.LinkedList) this.f414871n).clear();
        this.f414874q = false;
        this.f414873p = false;
        this.f414875r = false;
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoService", "Finish service use time(ms):" + this.f414880w.a());
    }

    @Override // wf0.u1
    public void h(wf0.r1 r1Var) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f414881x;
        wf0.u1 u1Var = (wf0.u1) concurrentHashMap.get(r1Var.f445529a);
        if (u1Var != null) {
            u1Var.h(r1Var);
        }
        java.lang.String str = r1Var.f445529a;
        t21.v2 h17 = t21.d3.h(str);
        if (h17 != null) {
            int i17 = h17.f415011i;
            if (i17 == 199 || i17 == 198) {
                concurrentHashMap.remove(str);
            }
        }
    }

    public boolean i() {
        boolean z17 = false;
        if (this.f414878u != null) {
            gm0.j1.d().d(this.f414878u);
            this.f414875r = false;
            z17 = true;
        }
        ((java.util.HashMap) this.f414872o).clear();
        ((java.util.LinkedList) this.f414868h).clear();
        ((java.util.LinkedList) this.f414869i).clear();
        ((java.util.LinkedList) this.f414870m).clear();
        ((java.util.LinkedList) this.f414871n).clear();
        return z17;
    }

    public void k() {
        com.tencent.mm.sdk.platformtools.n3 n3Var;
        if (!this.f414865e || (n3Var = this.f414864d) == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.VideoService", "run error!, handler or thread is null!");
        } else {
            n3Var.post(new t21.n3(this));
        }
    }
}
