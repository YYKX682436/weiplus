package fn4;

/* loaded from: classes15.dex */
public class i1 implements dn.n {

    /* renamed from: d, reason: collision with root package name */
    public boolean f264555d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f264556e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fn4.l1 f264557f;

    public i1(fn4.l1 l1Var, fn4.d1 d1Var) {
        this.f264557f = l1Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00d7, code lost:
    
        if (r6 > 100) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a() {
        /*
            Method dump skipped, instructions count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fn4.i1.a():void");
    }

    @Override // dn.n
    public void f(java.lang.String str, long j17, long j18) {
        fn4.l1 l1Var = this.f264557f;
        fn4.b bVar = l1Var.f264581j;
        if (bVar != null) {
            fn4.r0 Q4 = bVar.Q4();
            java.util.Map map = Q4.f264602c;
            if (map.containsKey(str)) {
                r45.yn6 yn6Var = (r45.yn6) map.get(str);
                yn6Var.f391243d = str;
                yn6Var.f391246g = j18;
                yn6Var.f391244e = j17;
                yn6Var.f391245f = Q4.a(j17, j18);
                map.put(str, yn6Var);
            }
            rm4.d dVar = l1Var.f264581j.o4().f264479f;
            if (dVar != null) {
                dVar.f397474w = j18;
            }
        }
        com.tencent.mm.sdk.platformtools.u3.h(new fn4.g1(this, str, j17, j18));
    }

    @Override // dn.n
    public void g(java.lang.String str, int i17, dn.h hVar) {
        boolean z17 = 1 >= com.tencent.mars.xlog.Log.getLogLevel();
        fn4.l1 l1Var = this.f264557f;
        if (z17 && l1Var.f264579h) {
            l1Var.f264579h = false;
            i17 = 404;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryVideoViewMgr", "onFinish %s %d", str, java.lang.Integer.valueOf(i17));
        fn4.b bVar = l1Var.f264581j;
        if (bVar != null) {
            fn4.r0 Q4 = bVar.Q4();
            java.util.Map map = Q4.f264602c;
            if (map.containsKey(str)) {
                r45.yn6 yn6Var = (r45.yn6) map.get(str);
                if (i17 == 0) {
                    yn6Var.f391243d = str;
                    long j17 = yn6Var.f391246g;
                    yn6Var.f391244e = j17;
                    yn6Var.f391245f = Q4.a(j17, j17);
                    map.put(str, yn6Var);
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryPreloadMgr", "onCurrentVideoDownloadFinish onFinish %s %d %s %d", str, java.lang.Long.valueOf(yn6Var.f391245f), com.tencent.mm.sdk.platformtools.t8.i0(yn6Var.f391244e, 100.0d), java.lang.Integer.valueOf(i17));
            }
        }
        try {
            pm4.y.c(l1Var.f264581j.s4().d(l1Var.f264581j.Y2()), 2, i17, fn4.z0.c(), hVar);
        } catch (java.lang.Exception unused) {
        }
        com.tencent.mm.sdk.platformtools.u3.h(new fn4.h1(this, str, i17));
    }

    @Override // dn.n
    public void onDataAvailable(java.lang.String str, long j17, long j18) {
        com.tencent.mm.sdk.platformtools.u3.h(new fn4.f1(this, str, j17, j18));
    }

    @Override // dn.n
    public void onM3U8Ready(java.lang.String str, java.lang.String str2) {
    }

    @Override // dn.n
    public void onMoovReady(java.lang.String str, long j17, long j18, com.tencent.mars.cdn.CdnManager.VideoInfo videoInfo) {
        if (this.f264555d) {
            return;
        }
        this.f264555d = true;
        fn4.l1 l1Var = this.f264557f;
        if (l1Var.f264581j != null) {
            com.tencent.mm.feature.sight.api.o oVar = (com.tencent.mm.feature.sight.api.o) i95.n0.c(com.tencent.mm.feature.sight.api.o.class);
            java.lang.String str2 = l1Var.f264581j.z4() + str + ".mp4";
            ((be0.e) oVar).getClass();
            com.tencent.mm.sdk.platformtools.u3.h(new fn4.e1(this, j17, j18, com.tencent.mm.plugin.sight.base.e.d(str2, true), videoInfo, str));
        }
    }
}
