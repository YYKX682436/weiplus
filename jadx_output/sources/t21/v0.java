package t21;

/* loaded from: classes12.dex */
public class v0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f414977a;

    /* renamed from: b, reason: collision with root package name */
    public final long f414978b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f414979c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f414980d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f414981e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f414982f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f414983g;

    /* renamed from: h, reason: collision with root package name */
    public dn.o f414984h;

    /* renamed from: i, reason: collision with root package name */
    public long f414985i;

    /* renamed from: j, reason: collision with root package name */
    public long f414986j;

    /* renamed from: k, reason: collision with root package name */
    public long f414987k;

    /* renamed from: l, reason: collision with root package name */
    public int f414988l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f414989m;

    /* renamed from: n, reason: collision with root package name */
    public long f414990n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f414991o;

    /* renamed from: p, reason: collision with root package name */
    public f65.s f414992p;

    /* renamed from: r, reason: collision with root package name */
    public t21.u0 f414994r;

    /* renamed from: q, reason: collision with root package name */
    public int f414993q = 0;

    /* renamed from: s, reason: collision with root package name */
    public final dn.k f414995s = new t21.s0(this);

    /* renamed from: t, reason: collision with root package name */
    public final dn.l f414996t = new t21.t0(this);

    public v0(long j17, java.lang.String str) {
        this.f414977a = false;
        this.f414978b = j17;
        this.f414979c = str;
        this.f414977a = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a() {
        /*
            Method dump skipped, instructions count: 821
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t21.v0.a():boolean");
    }

    public int b(t21.u0 u0Var) {
        this.f414994r = u0Var;
        try {
            if (a()) {
                return 0;
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NetScenePreloadVideoFake", e17, "", new java.lang.Object[0]);
        }
        this.f414994r = null;
        return -1;
    }

    public java.lang.String c() {
        if (!this.f414977a) {
            return this.f414980d;
        }
        return this.f414978b + "";
    }

    public final void d(java.lang.String str, dn.h hVar) {
        int i17;
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f414985i);
        stringBuffer.append(",");
        stringBuffer.append(this.f414986j);
        stringBuffer.append(",");
        stringBuffer.append(this.f414987k);
        stringBuffer.append(",");
        stringBuffer.append(this.f414989m);
        stringBuffer.append(",");
        stringBuffer.append(this.f414988l);
        stringBuffer.append(",");
        try {
            i17 = (int) ((this.f414987k / 1024) / (this.f414986j - this.f414985i));
        } catch (java.lang.Exception unused) {
            i17 = 0;
        }
        stringBuffer.append(i17);
        stringBuffer.append(",0,");
        stringBuffer.append(str);
        stringBuffer.append(",");
        stringBuffer.append(this.f414984h.J1);
        stringBuffer.append(",");
        stringBuffer.append(this.f414984h.I1);
        stringBuffer.append(",");
        stringBuffer.append(this.f414984h.K1);
        stringBuffer.append(",");
        stringBuffer.append(this.f414984h.field_fileId);
        stringBuffer.append(",");
        stringBuffer.append(this.f414984h.M1);
        stringBuffer.append(",");
        stringBuffer.append(fo4.c.a(this.f414984h.Q1));
        stringBuffer.append(hVar.f241768c);
        com.tencent.mars.cdn.CdnManager.SNSVideoProfile sNSVideoProfile = hVar.f241779n;
        stringBuffer.append(sNSVideoProfile != null ? sNSVideoProfile.experimentalGroupID : 0);
        new com.tencent.mm.autogen.mmdata.rpt.PreloadVideoInfoStruct(stringBuffer.toString()).k();
    }

    public void e() {
        int i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetScenePreloadVideoFake", "%d stop preload video[%s]", java.lang.Integer.valueOf(hashCode()), this.f414981e);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f414981e)) {
            dn.h hVar = new dn.h();
            sx.e0 e0Var = (sx.e0) i95.n0.c(sx.e0.class);
            java.lang.String str = this.f414981e;
            ((rx.l) e0Var).getClass();
            com.tencent.mm.modelcdntran.h2 fj6 = com.tencent.mm.modelcdntran.s1.fj();
            dn.m mVar = (dn.m) ((java.util.concurrent.ConcurrentHashMap) fj6.f70995s).remove(str);
            if (mVar != null) {
                i17 = com.tencent.mm.modelcdntran.s1.cj().x(str, hVar);
                jx3.f.INSTANCE.d(10769, -10002, java.lang.Integer.valueOf(mVar.field_fileType), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - mVar.field_startTime));
            } else {
                i17 = 0;
            }
            ((java.util.HashMap) fj6.f70994r).remove(str);
            ((java.util.HashMap) fj6.f70996t).remove(str);
            com.tencent.mars.xlog.Log.i("MicroMsg.CdnTransportService", "summersafecdn cdntra cancelRecvTask mediaid:%s mapremove:%s engine ret:%d", str, mVar, java.lang.Integer.valueOf(i17));
            this.f414986j = com.tencent.mm.sdk.platformtools.t8.i1();
            this.f414987k = g(this.f414982f, (int) hVar.field_recvedBytes, false);
            d(hVar.a(), hVar);
        }
        this.f414994r = null;
    }

    public final void f(java.lang.String str, int i17, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetScenePreloadVideoFake", "%d update finish video [%s] [%d] [%s]", java.lang.Integer.valueOf(hashCode()), str, java.lang.Integer.valueOf(i17), str2);
        if (t21.d3.h(str) != null) {
            t21.d3.N(str, i17);
            if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                return;
            }
            java.lang.String rj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(null, bm5.f0.f22571s, str, false);
            if (com.tencent.mm.sdk.platformtools.t8.K0(str2) || i17 <= 0 || com.tencent.mm.sdk.platformtools.t8.K0(rj6) || !com.tencent.mm.vfs.w6.j(rj6)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.NetScenePreloadVideoFake", "insert media duplication but args is error.[%d, %s, %s]", java.lang.Integer.valueOf(i17), str2, rj6);
            } else {
                ((com.tencent.mm.storage.w8) ((g90.o0) ((h90.b0) i95.n0.c(h90.b0.class))).wi()).i(str2, i17, rj6);
            }
        }
    }

    public final int g(java.lang.String str, int i17, boolean z17) {
        t21.v2 h17 = t21.d3.h(str);
        if (h17 == null) {
            return i17;
        }
        int i18 = h17.I;
        if (z17) {
            h17.I = i17;
        } else {
            h17.I = i18 + i17;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NetScenePreloadVideoFake", "update video info[%s] preload[%d %d %d] isFinish[%b] ", str, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(h17.I), java.lang.Boolean.valueOf(z17));
        h17.f415013k = com.tencent.mm.sdk.platformtools.t8.i1();
        h17.U = 1025;
        t21.d3.Q(h17);
        if (z17) {
            i17 -= i18;
        }
        if (i17 < 0) {
            return 0;
        }
        return i17;
    }

    public v0(dn.o oVar, java.lang.String str) {
        this.f414977a = false;
        this.f414984h = oVar;
        this.f414980d = str;
        this.f414977a = false;
    }
}
