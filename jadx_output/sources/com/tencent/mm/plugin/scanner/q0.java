package com.tencent.mm.plugin.scanner;

@j95.b
/* loaded from: classes12.dex */
public class q0 extends jm0.o implements com.tencent.mm.plugin.scanner.z {

    /* renamed from: m, reason: collision with root package name */
    public volatile e04.w2 f159123m;

    /* renamed from: n, reason: collision with root package name */
    public zz3.b f159124n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.HashMap f159125o = new java.util.HashMap();

    /* renamed from: p, reason: collision with root package name */
    public final java.util.HashMap f159126p = new java.util.HashMap();

    /* renamed from: q, reason: collision with root package name */
    public final java.util.HashMap f159127q = new java.util.HashMap();

    /* renamed from: r, reason: collision with root package name */
    public final e04.v2 f159128r = new com.tencent.mm.plugin.scanner.r0(this);

    /* renamed from: s, reason: collision with root package name */
    public boolean f159129s = false;

    static {
        new java.util.HashMap();
    }

    public java.lang.String Zi(java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        ((com.tencent.mm.plugin.scanner.u0) ((com.tencent.mm.plugin.scanner.a0) i95.n0.c(com.tencent.mm.plugin.scanner.a0.class))).getClass();
        com.tencent.mm.plugin.scanner.m1.Ai().Ri();
        sb7.append(com.tencent.mm.plugin.scanner.m1.Ai().wi());
        sb7.append("scan_result/");
        java.lang.String sb8 = sb7.toString();
        if (!this.f159129s) {
            com.tencent.mm.vfs.w6.t(sb8);
            this.f159129s = true;
        }
        sb6.append(sb8);
        sb6.append(java.lang.String.format("%s_%d.%s", "translation", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), str));
        return sb6.toString();
    }

    public e04.w2 aj() {
        if (this.f159123m == null) {
            synchronized (this) {
                if (this.f159123m == null) {
                    this.f159123m = new e04.w2();
                }
            }
        }
        return this.f159123m;
    }

    public dm.aa bj(java.lang.String str) {
        java.lang.String a17 = com.tencent.mm.sdk.platformtools.w2.a(str + com.tencent.mm.vfs.w6.l(str));
        com.tencent.mars.xlog.Log.i("MicroMsg.PluginScanTranslation", "getTranslationResult %s, md5 %s", str, a17);
        return cj().y0(a17);
    }

    public zz3.b cj() {
        gm0.j1.b().c();
        if (this.f159124n == null) {
            this.f159124n = new zz3.b(gm0.j1.u().f273153f);
        }
        return this.f159124n;
    }

    public void fj(int i17) {
        com.tencent.mm.autogen.mmdata.rpt.OCRTranslateReportStruct oCRTranslateReportStruct;
        com.tencent.mm.autogen.events.ScanTranslationResultEvent scanTranslationResultEvent = new com.tencent.mm.autogen.events.ScanTranslationResultEvent();
        am.ct ctVar = scanTranslationResultEvent.f54739g;
        ctVar.f6400a = i17;
        ctVar.f6402c = false;
        java.util.HashMap hashMap = this.f159125o;
        if (hashMap.containsKey(java.lang.Integer.valueOf(i17)) && (oCRTranslateReportStruct = (com.tencent.mm.autogen.mmdata.rpt.OCRTranslateReportStruct) this.f159126p.get(java.lang.Integer.valueOf(i17))) != null) {
            ctVar.f6401b = (int) oCRTranslateReportStruct.f59745d;
        }
        scanTranslationResultEvent.e();
        hashMap.remove(java.lang.Integer.valueOf(i17));
    }

    public com.tencent.mm.modelcdntran.q0 hj(final int i17, com.tencent.mm.plugin.scanner.model.e0 e0Var, final e04.v2 v2Var) {
        long currentTimeMillis = java.lang.System.currentTimeMillis() - e0Var.f158880i;
        java.util.HashMap hashMap = this.f159126p;
        if (hashMap.containsKey(java.lang.Integer.valueOf(i17))) {
            ((com.tencent.mm.autogen.mmdata.rpt.OCRTranslateReportStruct) hashMap.get(java.lang.Integer.valueOf(i17))).f59749h = currentTimeMillis;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.PluginScanTranslation", "startTranslationSpr: sessionId:%s  scene cost:%s", java.lang.Integer.valueOf(i17), java.lang.String.valueOf(currentTimeMillis));
        com.tencent.mm.plugin.scanner.model.p2 p2Var = (com.tencent.mm.plugin.scanner.model.p2) this.f159125o.get(java.lang.Integer.valueOf(i17));
        if (p2Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.PluginScanTranslation", "startTranslationSpr, record is null, sessionId: " + i17);
        } else {
            boolean z17 = e0Var.f158884p;
            com.tencent.mm.modelbase.o oVar = e0Var.f158876e;
            p2Var.f158977c = z17 ? e0Var.f158889u : ((r45.xv4) oVar.f70711b.f70700a).f390501h;
            p2Var.f158978d = e0Var.I();
            boolean z18 = e0Var.f158884p;
            p2Var.f158979e = z18 ? e0Var.f158891w : ((r45.xv4) oVar.f70711b.f70700a).f390503m;
            p2Var.f158981g = e0Var.f158882n;
            p2Var.f158982h = e0Var.f158883o;
            p2Var.f158983i = z18 ? e0Var.f158885q : "";
            p2Var.f158984j = z18 ? e0Var.f158886r : "";
        }
        final java.lang.String Zi = Zi("jpg");
        com.tencent.mm.vfs.w6.u(Zi);
        dn.m mVar = new dn.m();
        mVar.f241785d = "task_TranslateImageResultDownload";
        mVar.field_fullpath = Zi;
        mVar.field_fileType = 2;
        mVar.field_totalLen = e0Var.f158887s;
        mVar.field_aesKey = e0Var.f158886r;
        mVar.field_fileId = e0Var.f158885q;
        mVar.field_mediaId = e0Var.f158885q + i17;
        mVar.field_priority = 2;
        final long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        com.tencent.mm.modelcdntran.q0 q0Var = new com.tencent.mm.modelcdntran.q0() { // from class: com.tencent.mm.plugin.scanner.q0$$a
            @Override // com.tencent.mm.modelcdntran.q0
            public final void a(com.tencent.mm.modelcdntran.n1 n1Var) {
                int ordinal = n1Var.f71103a.ordinal();
                e04.v2 v2Var2 = v2Var;
                int i18 = i17;
                com.tencent.mm.modelcdntran.m1 m1Var = n1Var.f71103a;
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.PluginScanTranslation", "startTranslationSpr: event:%s  download cost: %s", m1Var.name(), java.lang.String.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis2));
                        v2Var2.v5(i18, com.tencent.mm.sdk.platformtools.x.i0(Zi));
                        return;
                    } else if (ordinal != 10) {
                        return;
                    }
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.PluginScanTranslation", "startTranslationSpr: event:%s", m1Var.name());
                com.tencent.mars.xlog.Log.i("MicroMsg.PluginScanTranslation", "startTranslationSpr post to ui: event:%s", m1Var.name());
                v2Var2.v5(i18, null);
            }
        };
        ((rx.f) ((sx.b0) i95.n0.c(sx.b0.class))).Ri(mVar, new java.lang.ref.WeakReference(q0Var));
        return q0Var;
    }
}
