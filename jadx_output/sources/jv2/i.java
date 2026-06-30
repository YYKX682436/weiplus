package jv2;

/* loaded from: classes10.dex */
public class i implements in5.c, com.tencent.mm.plugin.finder.feed.model.internal.r0 {

    /* renamed from: d, reason: collision with root package name */
    public jv2.c f302223d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f302224e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f302225f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f302226g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f302227h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f302228i;

    /* renamed from: m, reason: collision with root package name */
    public int f302229m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f302230n;

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0037, code lost:
    
        if (((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).sj(r3.f302223d.L0()) != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public i(jv2.c r4) {
        /*
            r3 = this;
            java.lang.String r0 = "commentObj"
            kotlin.jvm.internal.o.g(r4, r0)
            r3.<init>()
            r3.f302223d = r4
            java.lang.String r4 = r4.L0()
            boolean r4 = com.tencent.mm.sdk.platformtools.t8.K0(r4)
            r0 = 0
            r1 = 1
            if (r4 == 0) goto L17
            goto L3a
        L17:
            jv2.c r4 = r3.f302223d
            java.lang.String r4 = r4.L0()
            boolean r4 = hc2.l.i(r4)
            if (r4 != 0) goto L39
            java.lang.Class<c61.yb> r4 = c61.yb.class
            i95.m r4 = i95.n0.c(r4)
            c61.yb r4 = (c61.yb) r4
            jv2.c r2 = r3.f302223d
            java.lang.String r2 = r2.L0()
            c61.p2 r4 = (c61.p2) r4
            boolean r4 = r4.sj(r2)
            if (r4 == 0) goto L3a
        L39:
            r0 = r1
        L3a:
            r3.f302224e = r0
            r3.f302225f = r1
            r3.f302226g = r1
            jv2.c r4 = r3.f302223d
            int r4 = r4.y0()
            r3.f302229m = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: jv2.i.<init>(jv2.c):void");
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.r0
    public int d(com.tencent.mm.plugin.finder.feed.model.internal.r0 obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        return 0;
    }

    @Override // in5.c
    public long getItemId() {
        return this.f302223d.t0();
    }

    @Override // in5.c
    public int h() {
        return this.f302223d.J0() == 0 ? 1 : 2;
    }
}
