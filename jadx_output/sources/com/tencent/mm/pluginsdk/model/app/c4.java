package com.tencent.mm.pluginsdk.model.app;

/* loaded from: classes9.dex */
public class c4 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0, pt.n0 {
    public final dn.k A;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f188829d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f188830e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.storage.f9 f188831f;

    /* renamed from: g, reason: collision with root package name */
    public final long f188832g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f188833h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f188834i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f188835m;

    /* renamed from: n, reason: collision with root package name */
    public final int f188836n;

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.model.app.a f188837o;

    /* renamed from: p, reason: collision with root package name */
    public long f188838p;

    /* renamed from: q, reason: collision with root package name */
    public long f188839q;

    /* renamed from: r, reason: collision with root package name */
    public long f188840r;

    /* renamed from: s, reason: collision with root package name */
    public long f188841s;

    /* renamed from: t, reason: collision with root package name */
    public long f188842t;

    /* renamed from: u, reason: collision with root package name */
    public long f188843u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f188844v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.autogen.events.WebviewReportPublisherIdEvent f188845w;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.autogen.events.WebviewReportTmplTransferEvent f188846x;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.autogen.events.AppBrandOuterMenuClickReportEvent f188847y;

    /* renamed from: z, reason: collision with root package name */
    public long f188848z;

    public c4(java.lang.String str, long j17, java.lang.String str2, java.lang.String str3) {
        this.f188831f = null;
        this.f188832g = 0L;
        this.f188833h = "";
        this.f188836n = 0;
        this.f188838p = 0L;
        this.f188839q = 0L;
        this.f188840r = 0L;
        this.f188841s = 0L;
        this.f188842t = 0L;
        this.f188843u = 0L;
        this.f188844v = "";
        this.f188848z = 0L;
        this.A = new com.tencent.mm.pluginsdk.model.app.b4(this);
        this.f188832g = j17;
        this.f188833h = str;
        this.f188834i = str2;
        this.f188835m = str3;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.py5();
        lVar.f70665b = new r45.qy5();
        lVar.f70666c = "/cgi-bin/micromsg-bin/sendappmsg";
        lVar.f70667d = com.tencent.cloud.huiyan.exception.CallbackErrorCode.HY_VERIFY_LOCAL_TIME_OUT;
        lVar.f70668e = 107;
        lVar.f70669f = 1000000107;
        this.f188829d = lVar.a();
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSendAppMsg", "summersafecdn NetSceneSendAppMsg msgid[%d], sessionid[%s], signature[%s], stack[%s]", java.lang.Long.valueOf(j17), str2, com.tencent.mm.sdk.platformtools.t8.G1(str3), new com.tencent.mm.sdk.platformtools.z3());
        ((java.util.concurrent.ConcurrentHashMap) com.tencent.mm.pluginsdk.model.app.u5.Ni().f189070e).put(java.lang.Integer.valueOf(hashCode()), new java.lang.Object());
    }

    public final void H(int i17) {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f188838p;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("send_result_ret_code", java.lang.Integer.valueOf(i17));
        hashMap.put("prepare_cost", java.lang.Long.valueOf(this.f188839q));
        hashMap.put("send_cgi_cost", java.lang.Long.valueOf(this.f188842t));
        long j17 = this.f188843u;
        if (j17 > 0) {
            hashMap.put("cdn_upload_cost", java.lang.Long.valueOf(j17));
        }
        hashMap.put("send_total_cost", java.lang.Long.valueOf(currentTimeMillis));
        hashMap.put("inner_version", 36);
        hashMap.put("send_msg_local_id", java.lang.Long.valueOf(this.f188832g));
        com.tencent.mm.storage.f9 f9Var = this.f188831f;
        hashMap.put("send_msg_type", java.lang.Integer.valueOf(f9Var != null ? ot0.u.a(f9Var) : 0));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).sj(32784, hashMap, 10);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("legacy_send_app_msg", hashMap, 32784);
    }

    @Override // pt.n0
    public long a() {
        return this.f188832g;
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x0639  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0688  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x039d  */
    @Override // com.tencent.mm.modelbase.m1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int doScene(com.tencent.mm.network.s r33, com.tencent.mm.modelbase.u0 r34) {
        /*
            Method dump skipped, instructions count: 1774
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.pluginsdk.model.app.c4.doScene(com.tencent.mm.network.s, com.tencent.mm.modelbase.u0):int");
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getDispatchInterceptRet(com.tencent.mm.network.s sVar, com.tencent.mm.network.v0 v0Var, com.tencent.mm.network.l0 l0Var) {
        return w11.c1.a(new com.tencent.mm.plugin.msg.MsgIdTalker(this.f188832g, this.f188833h), this) ? org.chromium.net.NetError.ERR_SSL_BAD_RECORD_MAC_ALERT : super.getDispatchInterceptRet(sVar, v0Var, l0Var);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return com.tencent.cloud.huiyan.exception.CallbackErrorCode.HY_VERIFY_LOCAL_TIME_OUT;
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x018c, code lost:
    
        if (r0 != 130) goto L68;
     */
    @Override // com.tencent.mm.network.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onGYNetEnd(int r22, int r23, int r24, java.lang.String r25, com.tencent.mm.network.v0 r26, byte[] r27) {
        /*
            Method dump skipped, instructions count: 739
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.pluginsdk.model.app.c4.onGYNetEnd(int, int, int, java.lang.String, com.tencent.mm.network.v0, byte[]):void");
    }

    @Override // com.tencent.mm.modelbase.m1
    public com.tencent.mm.modelbase.o1 securityVerificationChecked(com.tencent.mm.network.v0 v0Var) {
        return com.tencent.mm.modelbase.o1.EOk;
    }

    public c4(java.lang.String str, long j17, java.lang.String str2, java.lang.String str3, int i17, com.tencent.mm.pluginsdk.model.app.a aVar) {
        this(str, j17, str2, str3);
        this.f188836n = i17;
        this.f188837o = aVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSendAppMsg", "NetSceneSendAppMsg directShare[%d]", java.lang.Integer.valueOf(i17));
        if (aVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSendAppMsg", "NetSceneSendAppMsg tokenValid[%d], pkgName[%s]", java.lang.Integer.valueOf(aVar.f188790a), aVar.f188791b);
        }
    }
}
