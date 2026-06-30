package ha4;

/* loaded from: classes4.dex */
public class h {
    public static ha4.h I = null;

    /* renamed from: J, reason: collision with root package name */
    public static java.lang.String f279968J = "";
    public final java.util.LinkedList G;
    public java.lang.StringBuffer H;

    /* renamed from: a, reason: collision with root package name */
    public long f279969a = 0;

    /* renamed from: b, reason: collision with root package name */
    public long f279970b = 0;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f279971c = "";

    /* renamed from: d, reason: collision with root package name */
    public int f279972d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f279973e = 0;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f279974f = "";

    /* renamed from: g, reason: collision with root package name */
    public long f279975g = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f279976h = 0;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f279977i = "";

    /* renamed from: j, reason: collision with root package name */
    public long f279978j = 0;

    /* renamed from: k, reason: collision with root package name */
    public long f279979k = 0;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f279980l = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f279981m = "";

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f279982n = "";

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f279983o = "";

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f279984p = "";

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f279985q = "";

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f279986r = "";

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f279987s = "";

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f279988t = "";

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f279989u = "";

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f279990v = "";

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f279991w = "";

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f279992x = "";

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f279993y = "";

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f279994z = "";
    public java.lang.String A = "";
    public java.lang.String B = "";
    public java.lang.String C = "";
    public int D = -1;
    public java.lang.String E = "";
    public final java.util.List F = new java.util.LinkedList();

    public h() {
        new java.util.LinkedList();
        this.G = new java.util.LinkedList();
        this.H = new java.lang.StringBuffer();
    }

    public static ha4.h a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createNewYearSnsCtrlV2", "com.tencent.mm.plugin.sns.lucky.model.NewYearSnsCtrlV2");
        gm0.j1.i();
        if (!gm0.j1.b().m()) {
            ha4.h hVar = new ha4.h();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createNewYearSnsCtrlV2", "com.tencent.mm.plugin.sns.lucky.model.NewYearSnsCtrlV2");
            return hVar;
        }
        java.lang.String g17 = kk.k.g((com.tencent.mm.sdk.platformtools.t8.K0(null) ? "" : null).getBytes());
        if (I == null || !g17.equals(f279968J)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NewYearSnsCtrlV2", "create newYearSnsCtrl");
            I = new ha4.h();
            try {
                com.tencent.mm.sdk.platformtools.t8.K0("");
                I.b(java.net.URLDecoder.decode("", com.tencent.mapsdk.internal.rv.f51270c), false);
                f279968J = g17;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.NewYearSnsCtrlV2", "createctrl error " + e17.getMessage());
            }
        }
        ha4.h hVar2 = I;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createNewYearSnsCtrlV2", "com.tencent.mm.plugin.sns.lucky.model.NewYearSnsCtrlV2");
        return hVar2;
    }

    public static boolean c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isOpenLuckyV2", "com.tencent.mm.plugin.sns.lucky.model.NewYearSnsCtrlV2");
        gm0.j1.i();
        boolean booleanValue = ((java.lang.Boolean) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_NEWYEAR_2016_HONGBAO_SNS_CTRLLUCKYOPEN_BOOLEAN_SYNC, java.lang.Boolean.TRUE)).booleanValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isOpenLuckyV2", "com.tencent.mm.plugin.sns.lucky.model.NewYearSnsCtrlV2");
        return booleanValue;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00d8, code lost:
    
        if (r14 >= r12) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(java.lang.String r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 1405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ha4.h.b(java.lang.String, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d() {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ha4.h.d():void");
    }
}
