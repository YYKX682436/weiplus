package df2;

/* loaded from: classes3.dex */
public final class h5 extends if2.b {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f230282m;

    /* renamed from: n, reason: collision with root package name */
    public ts5.d f230283n;

    /* renamed from: o, reason: collision with root package name */
    public long f230284o;

    /* renamed from: p, reason: collision with root package name */
    public float f230285p;

    /* renamed from: q, reason: collision with root package name */
    public float f230286q;

    /* renamed from: r, reason: collision with root package name */
    public float f230287r;

    /* renamed from: s, reason: collision with root package name */
    public float f230288s;

    /* renamed from: t, reason: collision with root package name */
    public kotlinx.coroutines.r2 f230289t;

    /* renamed from: u, reason: collision with root package name */
    public kotlinx.coroutines.r2 f230290u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h5(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f230282m = "FinderLiveVisitorPerformanceDetectorController";
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveActivate() {
        if (((b92.x2) ((ts5.o) i95.n0.c(ts5.o.class))).isEnable()) {
            if (((b92.x2) ((ts5.o) i95.n0.c(ts5.o.class))).isEnable()) {
                kotlinx.coroutines.r2 r2Var = nk2.k.f338017h;
                if (r2Var != null) {
                    kotlinx.coroutines.p2.a(r2Var, null, 1, null);
                }
                kotlinx.coroutines.r2 r2Var2 = nk2.k.f338018i;
                if (r2Var2 != null) {
                    kotlinx.coroutines.p2.a(r2Var2, null, 1, null);
                }
                kotlinx.coroutines.r2 r2Var3 = nk2.k.f338019j;
                if (r2Var3 != null) {
                    kotlinx.coroutines.p2.a(r2Var3, null, 1, null);
                }
                kotlinx.coroutines.r2 r2Var4 = nk2.k.f338020k;
                if (r2Var4 != null) {
                    kotlinx.coroutines.p2.a(r2Var4, null, 1, null);
                }
                nk2.c.f337960a.a();
            }
            this.f230284o = java.lang.System.currentTimeMillis();
            this.f230290u = com.tencent.mm.plugin.finder.live.util.y.d(this, null, null, new df2.e5(this, null), 3, null);
            this.f230289t = com.tencent.mm.plugin.finder.live.util.y.d(this, null, null, new df2.g5(this, null), 3, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x02aa, code lost:
    
        if (r10 == false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x02bd, code lost:
    
        if (r5.f337963a == 1) goto L89;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x028c  */
    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLiveDeactivate() {
        /*
            Method dump skipped, instructions count: 857
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.h5.onLiveDeactivate():void");
    }
}
