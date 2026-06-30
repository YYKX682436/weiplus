package i64;

/* loaded from: classes4.dex */
public class b1 {

    /* renamed from: z, reason: collision with root package name */
    public static final java.util.Set f289085z;

    /* renamed from: j, reason: collision with root package name */
    public final int f289095j;

    /* renamed from: n, reason: collision with root package name */
    public android.app.Activity f289099n;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f289103r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f289104s;

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f289105t;

    /* renamed from: u, reason: collision with root package name */
    public final i64.v f289106u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f289107v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f289108w;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f289086a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.HashSet f289087b = new java.util.HashSet();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f289088c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f289089d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f289090e = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashSet f289091f = new java.util.HashSet();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f289092g = new java.util.HashMap();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.Map f289093h = new java.util.HashMap();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Map f289094i = new java.util.HashMap();

    /* renamed from: k, reason: collision with root package name */
    public final java.util.Map f289096k = new java.util.HashMap();

    /* renamed from: l, reason: collision with root package name */
    public int f289097l = 0;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f289098m = null;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.Map f289100o = new java.util.HashMap();

    /* renamed from: p, reason: collision with root package name */
    public final java.util.HashMap f289101p = new java.util.HashMap();

    /* renamed from: q, reason: collision with root package name */
    public final java.util.HashSet f289102q = new java.util.HashSet();

    /* renamed from: x, reason: collision with root package name */
    public int f289109x = -1;

    /* renamed from: y, reason: collision with root package name */
    public boolean f289110y = false;

    static {
        new java.util.HashMap();
        f289085z = java.util.Collections.synchronizedSet(new java.util.HashSet());
    }

    public b1(android.app.Activity activity, int i17) {
        this.f289095j = 0;
        this.f289103r = false;
        this.f289104s = false;
        this.f289107v = true;
        this.f289108w = true;
        this.f289095j = i17;
        this.f289099n = activity;
        try {
            boolean z17 = activity instanceof com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI;
            this.f289103r = z17;
            boolean k17 = k();
            this.f289104s = k17;
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsAdStatistic", "init, isImproveTimeLineUI=" + z17 + ", isEnableFreqLimit=" + k17 + ", source=" + i17);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsAdStatistic", "SnsAdStatistic, exp=" + th6);
        }
        try {
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            this.f289106u = new i64.v();
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsAdStatistic", "init devInfo, cost=" + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
        } catch (java.lang.Throwable th7) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsAdStatistic", "SnsAdStatistic, devInfo exp=" + th7);
        }
        if (i17 == 0) {
            java.lang.String O = ca4.m0.O();
            boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            O = O == null ? "" : O;
            this.f289105t = O;
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsAdStatistic", "timelineSessionId=".concat(O));
        }
        boolean z27 = ca4.m0.u0(e42.c0.clicfg_ad_enable_cache_exposure_count, 1) == 1;
        this.f289107v = z27;
        com.tencent.mars.xlog.Log.i("AdExposureCountCache", "init, isExpCacheExposureCount=" + z27);
        if (!z27) {
            java.util.Map map = i64.z0.f289383a;
            synchronized (i64.z0.class) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clear", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic$AdExposureCountCache");
                ((java.util.HashMap) i64.z0.f289383a).clear();
                com.tencent.mars.xlog.Log.i("AdExposureCountCache", "clear");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clear", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic$AdExposureCountCache");
            }
        }
        boolean z28 = ca4.m0.u0(e42.c0.clicfg_ad_exposure_report_check_video_type, 1) == 1;
        this.f289108w = z28;
        if (!z28) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("idKey", "com.tencent.mm.plugin.sns.data.SnsAdUtilKt");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(2023, 44);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("idKey", "com.tencent.mm.plugin.sns.data.SnsAdUtilKt");
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsAdStatistic", "init, isCheckVideoType=" + z28);
    }

    public static boolean k() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isEnableFreqLimit", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_ad_enable_report_freq_limit, 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsAdStatistic", "is expt enableFreqLimit=" + Ni);
        boolean z17 = Ni > 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isEnableFreqLimit", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        return z17;
    }

    public void A(long j17, int i17, boolean z17, boolean z18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateVideoImpl", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        java.lang.Long valueOf = java.lang.Long.valueOf(j17);
        java.util.Map map = this.f289092g;
        i64.c1 c1Var = map.containsKey(valueOf) ? (i64.c1) map.get(java.lang.Long.valueOf(j17)) : new i64.c1("timeline");
        ca4.z0.t0(j17);
        if (i17 > 0) {
            c1Var.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setDuration", "com.tencent.mm.plugin.sns.ad.model.SnsAdVideoStatistic");
            c1Var.f289121i.f297912d = i17;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setDuration", "com.tencent.mm.plugin.sns.ad.model.SnsAdVideoStatistic");
        }
        c1Var.f289114b = z17 ? 1 : 0;
        map.put(java.lang.Long.valueOf(j17), c1Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateVideoImpl", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
    }

    public void a(java.lang.String str, i64.k0 k0Var) {
        java.util.Map map = this.f289093h;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addAdRemovedListener", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        if (k0Var != null) {
            try {
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SnsAdStatistic", "addAdRemovedListener exp= " + th6.toString());
            }
            if (!android.text.TextUtils.isEmpty(str)) {
                if (map.containsKey(str)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SnsAdStatistic", "may put a new Listener by " + str);
                }
                map.put(str, k0Var);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addAdRemovedListener", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
                return;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addAdRemovedListener", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
    }

    public void b(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addIdCount", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addIdCount", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        com.tencent.mm.sdk.platformtools.u3.h(new i64.r0(this, j17, false));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addIdCount", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addIdCount", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
    }

    public void c(long j17) {
        int i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addLikeTimes", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        java.util.Map map = this.f289100o;
        if (((java.util.HashMap) map).containsKey(java.lang.Long.valueOf(j17))) {
            i17 = ((java.lang.Integer) ((java.util.HashMap) map).get(java.lang.Long.valueOf(j17))).intValue();
        } else {
            i17 = 0;
        }
        ((java.util.HashMap) map).put(java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17 + 1));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addLikeTimes", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
    }

    public void d(long j17, long j18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addPlay3s", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        com.tencent.mm.sdk.platformtools.u3.h(new i64.t0(this, j17, j18));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addPlay3s", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
    }

    public void e(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkAd", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsAdStatistic", "-checkAd, isScroolIdle=" + z17);
        java.util.Iterator it = ((java.util.HashMap) this.f289090e).entrySet().iterator();
        while (it.hasNext()) {
            i64.d0 d0Var = (i64.d0) ((java.util.Map.Entry) it.next()).getValue();
            if (d0Var != null) {
                int i17 = com.tencent.mm.plugin.sns.model.l4.Y;
                d0Var.a(z17);
                java.lang.String str = d0Var.G;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    java.util.HashMap hashMap = (java.util.HashMap) this.f289094i;
                    if (hashMap.get(str) != null) {
                        i64.a1 a1Var = (i64.a1) hashMap.get(str);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getIsFullExposed", "com.tencent.mm.plugin.sns.ad.model.AdViewStatic");
                        boolean z18 = d0Var.F == 1;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getIsFullExposed", "com.tencent.mm.plugin.sns.ad.model.AdViewStatic");
                        if (z18 && a1Var.f289072h == 0) {
                            a1Var.f289072h = android.os.SystemClock.elapsedRealtime();
                        } else if (!z18) {
                            long j17 = a1Var.f289072h;
                            if (j17 > 0) {
                                a1Var.f289074j += android.os.SystemClock.elapsedRealtime() - j17;
                                a1Var.f289072h = 0L;
                            }
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isHalfExposed", "com.tencent.mm.plugin.sns.ad.model.AdViewStatic");
                        boolean z19 = d0Var.H;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isHalfExposed", "com.tencent.mm.plugin.sns.ad.model.AdViewStatic");
                        if (z19 && a1Var.f289076l == 0) {
                            a1Var.f289076l = android.os.SystemClock.elapsedRealtime();
                        } else if (!z19) {
                            long j18 = a1Var.f289076l;
                            if (j18 > 0) {
                                a1Var.f289075k += android.os.SystemClock.elapsedRealtime() - j18;
                                a1Var.f289076l = 0L;
                            }
                        }
                    }
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkAd", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
    }

    public final com.tencent.mm.plugin.sns.storage.ADInfo f(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdInfo", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        if (snsInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdInfo", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
            return null;
        }
        if (this.f289095j == 2) {
            com.tencent.mm.plugin.sns.storage.ADInfo atAdInfo = snsInfo.getAtAdInfo();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdInfo", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
            return atAdInfo;
        }
        com.tencent.mm.plugin.sns.storage.ADInfo adInfo = snsInfo.getAdInfo();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdInfo", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        return adInfo;
    }

    public long g(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCurPlayTime", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        try {
            i64.c1 c1Var = (i64.c1) this.f289092g.get(java.lang.Long.valueOf(j17));
            if (c1Var != null) {
                long j18 = c1Var.f289125m;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurPlayTime", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
                return j18;
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsAdStatistic", "getCurPlayTime exp=" + th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurPlayTime", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        return 0L;
    }

    public long h(java.lang.String str, int i17) {
        long j17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getExposureStartTime", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        i64.d0 d0Var = (i64.d0) ((java.util.HashMap) this.f289090e).get(str);
        if (d0Var != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getZeroStartTime", "com.tencent.mm.plugin.sns.ad.model.AdViewStatic");
            j17 = d0Var.f289150r;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getZeroStartTime", "com.tencent.mm.plugin.sns.ad.model.AdViewStatic");
        } else {
            j17 = 0;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsAdStatistic", "getExposureStartTime, localId=" + str + ", clkPos=" + i17 + ", time=" + j17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getExposureStartTime", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        return j17;
    }

    public final com.tencent.mm.protobuf.g i(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRemindSelfInfo", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        if (snsInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRemindSelfInfo", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
            return null;
        }
        if (this.f289095j == 2) {
            com.tencent.mm.protobuf.g atFriendRemindInfoSelfInfo = snsInfo.getAdSnsInfo().getAtFriendRemindInfoSelfInfo();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRemindSelfInfo", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
            return atFriendRemindInfoSelfInfo;
        }
        com.tencent.mm.protobuf.g timelineRemindInfoSelfInfo = snsInfo.getAdSnsInfo().getTimelineRemindInfoSelfInfo();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRemindSelfInfo", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        return timelineRemindInfoSelfInfo;
    }

    public final com.tencent.mm.protobuf.g j(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRemindSourceInfo", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        if (snsInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRemindSourceInfo", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
            return null;
        }
        if (this.f289095j == 2) {
            com.tencent.mm.protobuf.g atFriendRemindInfoSourceInfo = snsInfo.getAdSnsInfo().getAtFriendRemindInfoSourceInfo();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRemindSourceInfo", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
            return atFriendRemindInfoSourceInfo;
        }
        com.tencent.mm.protobuf.g timelineRemindInfoSourceInfo = snsInfo.getAdSnsInfo().getTimelineRemindInfoSourceInfo();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRemindSourceInfo", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        return timelineRemindInfoSourceInfo;
    }

    public boolean l(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isOnScreen", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        boolean contains = this.f289087b.contains(java.lang.Long.valueOf(j17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isOnScreen", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        return contains;
    }

    public boolean m(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isPlay3s", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        if (this.f289091f.contains(java.lang.Long.valueOf(j17))) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isPlay3s", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
            return true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isPlay3s", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x0697  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void n(int r37, java.lang.String r38, boolean r39, android.view.View r40, long r41, com.tencent.mm.protocal.protobuf.SnsObject r43, int r44, int r45) {
        /*
            Method dump skipped, instructions count: 1703
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i64.b1.n(int, java.lang.String, boolean, android.view.View, long, com.tencent.mm.protocal.protobuf.SnsObject, int, int):void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(21:78|(1:80)(2:143|(2:212|(1:261)(25:218|(1:220)(1:260)|221|(4:(1:258)(10:228|229|231|232|234|235|236|237|238|239)|240|(1:242)(1:245)|243)(1:259)|244|82|(1:84)(1:142)|85|(1:87)(1:141)|88|(1:90)(1:140)|(1:92)|93|(2:95|(1:97))|(1:103)|104|(3:108|(1:110)(1:112)|111)|113|114|115|(1:117)|119|7e1|132|133))(20:147|(1:149)(2:150|(1:152)(2:153|(1:155)(2:156|(1:158)(2:159|(5:161|(1:174)(1:165)|166|(1:(1:169))(2:(1:172)|173)|170)(3:175|(2:191|(5:197|(1:211)(1:201)|202|(2:(1:205)|206)(2:(1:209)|210)|207))(1:(3:186|(1:188)|189))|190)))))|82|(0)(0)|85|(0)(0)|88|(0)(0)|(0)|93|(0)|(3:99|101|103)|104|(4:106|108|(0)(0)|111)|113|114|115|(0)|119|7e1))|81|82|(0)(0)|85|(0)(0)|88|(0)(0)|(0)|93|(0)|(0)|104|(0)|113|114|115|(0)|119|7e1) */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x079b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x079c, code lost:
    
        com.tencent.mars.xlog.Log.e("MicroMsg.SnsAdStatistic", "callSnsAdRemovedListener exp= " + r0.toString());
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0761  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0777  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x077a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0797 A[Catch: all -> 0x079b, TRY_LEAVE, TryCatch #3 {all -> 0x079b, blocks: (B:115:0x078d, B:117:0x0797), top: B:114:0x078d }] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x07e2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x06c7  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x06b7  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x069b  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x066b  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x066d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0698  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x06aa  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x06c4  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x06cb  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x06e7  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0715  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void o(int r41, java.lang.String r42, long r43, int r45) {
        /*
            Method dump skipped, instructions count: 2142
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i64.b1.o(int, java.lang.String, long, int):void");
    }

    public void p() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        java.util.Map map = this.f289094i;
        for (java.lang.String str : ((java.util.HashMap) map).keySet()) {
            i64.a1 a1Var = (i64.a1) ((java.util.HashMap) map).get(str);
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsAdStatistic", "onPause Key " + str);
            long j17 = a1Var.f289073i;
            long j18 = a1Var.f289066b;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            a1Var.f289073i = j17 + (android.os.SystemClock.elapsedRealtime() - j18);
            a1Var.f289066b = 0L;
            i64.c1 c1Var = (i64.c1) ((java.util.HashMap) this.f289092g).get(java.lang.Long.valueOf(a1Var.f289070f));
            if (c1Var != null) {
                c1Var.b();
            }
        }
        java.util.Iterator it = ((java.util.HashMap) this.f289090e).entrySet().iterator();
        while (it.hasNext()) {
            i64.d0 d0Var = (i64.d0) ((java.util.Map.Entry) it.next()).getValue();
            if (d0Var != null) {
                int i17 = com.tencent.mm.plugin.sns.model.l4.Y;
                d0Var.a(false);
                java.lang.String str2 = d0Var.G;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str2) && ((java.util.HashMap) map).get(str2) != null) {
                    i64.a1 a1Var2 = (i64.a1) ((java.util.HashMap) map).get(str2);
                    long j19 = a1Var2.f289072h;
                    if (j19 > 0) {
                        a1Var2.f289074j += android.os.SystemClock.elapsedRealtime() - j19;
                        a1Var2.f289072h = 0L;
                    }
                    long j27 = a1Var2.f289076l;
                    if (j27 > 0) {
                        a1Var2.f289075k += android.os.SystemClock.elapsedRealtime() - j27;
                        a1Var2.f289076l = 0L;
                    }
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
    }

    public void q(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPausePlay", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        com.tencent.mm.sdk.platformtools.u3.h(new i64.x0(this, j17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPausePlay", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
    }

    public void r() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        java.util.HashMap hashMap = (java.util.HashMap) this.f289094i;
        for (java.lang.String str : hashMap.keySet()) {
            i64.a1 a1Var = (i64.a1) hashMap.get(str);
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsAdStatistic", "onResume Key " + str);
            a1Var.f289066b = elapsedRealtime;
            i64.c1 c1Var = (i64.c1) ((java.util.HashMap) this.f289092g).get(java.lang.Long.valueOf(a1Var.f289070f));
            if (c1Var != null) {
                c1Var.c();
            }
        }
        java.util.Iterator it = ((java.util.HashMap) this.f289090e).entrySet().iterator();
        while (it.hasNext()) {
            i64.d0 d0Var = (i64.d0) ((java.util.Map.Entry) it.next()).getValue();
            if (d0Var != null) {
                int i17 = com.tencent.mm.plugin.sns.model.l4.Y;
                d0Var.a(false);
                java.lang.String str2 = d0Var.G;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str2) && hashMap.get(str2) != null) {
                    i64.a1 a1Var2 = (i64.a1) hashMap.get(str2);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getIsFullExposed", "com.tencent.mm.plugin.sns.ad.model.AdViewStatic");
                    boolean z18 = d0Var.F == 1;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getIsFullExposed", "com.tencent.mm.plugin.sns.ad.model.AdViewStatic");
                    if (z18) {
                        a1Var2.f289072h = android.os.SystemClock.elapsedRealtime();
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isHalfExposed", "com.tencent.mm.plugin.sns.ad.model.AdViewStatic");
                    boolean z19 = d0Var.H;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isHalfExposed", "com.tencent.mm.plugin.sns.ad.model.AdViewStatic");
                    if (z19) {
                        a1Var2.f289076l = android.os.SystemClock.elapsedRealtime();
                    }
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
    }

    public void s(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStartPlay", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        com.tencent.mm.sdk.platformtools.u3.h(new i64.w0(this, j17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStartPlay", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
    }

    public final void t() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("preloadOnScrollIdle", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsAdStatistic", "preloadOnScrollIdle, size=" + this.f289101p.size());
        for (com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo : this.f289101p.values()) {
            java.lang.String y07 = ca4.z0.y0(snsInfo);
            if (!android.text.TextUtils.isEmpty(y07) && !this.f289102q.contains(y07)) {
                android.app.Activity activity = this.f289099n;
                int i17 = this.f289095j;
                m64.h hVar = m64.h.f324399a;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doPreloadOnScrollIdle", "com.tencent.mm.plugin.sns.ad.preload.TimelineAdExposurePreloader");
                if (snsInfo == null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doPreloadOnScrollIdle", "com.tencent.mm.plugin.sns.ad.preload.TimelineAdExposurePreloader");
                } else {
                    com.tencent.mars.xlog.Log.i("TimelineAdExposurePreloader", "doPreloadOnScrollIdle, id=" + y07);
                    if (m64.h.f324399a.a(activity)) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doPreloadOnScrollIdle", "com.tencent.mm.plugin.sns.ad.preload.TimelineAdExposurePreloader");
                    } else {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkPreload", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic$Companion");
                        ((ku5.t0) ku5.t0.f312615d).g(new p44.v(snsInfo));
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkPreload", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardLogic$Companion");
                        m64.e eVar = m64.e.f324393a;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("preload", "com.tencent.mm.plugin.sns.ad.preload.AdVangoghCanvasPreloader");
                        if (activity == null) {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("preload", "com.tencent.mm.plugin.sns.ad.preload.AdVangoghCanvasPreloader");
                        } else if (ca4.m0.u0(e42.c0.clicfg_ad_preload_vangogh_canvas, 0) != 1) {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("preload", "com.tencent.mm.plugin.sns.ad.preload.AdVangoghCanvasPreloader");
                        } else {
                            ((ku5.t0) ku5.t0.f312615d).g(new m64.d(activity, snsInfo));
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("preload", "com.tencent.mm.plugin.sns.ad.preload.AdVangoghCanvasPreloader");
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doClickInfoPreload", "com.tencent.mm.plugin.sns.ad.preload.TimelineAdExposurePreloader");
                        if (activity == null) {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doClickInfoPreload", "com.tencent.mm.plugin.sns.ad.preload.TimelineAdExposurePreloader");
                        } else {
                            ((ku5.t0) ku5.t0.f312615d).g(new m64.f(activity, snsInfo, i17));
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doClickInfoPreload", "com.tencent.mm.plugin.sns.ad.preload.TimelineAdExposurePreloader");
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doPreloadOnScrollIdle", "com.tencent.mm.plugin.sns.ad.preload.TimelineAdExposurePreloader");
                    }
                }
                this.f289102q.add(y07);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("preloadOnScrollIdle", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
    }

    public i64.k0 u(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeAdRemovedListener", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        try {
            if (android.text.TextUtils.isEmpty(str)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeAdRemovedListener", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
                return null;
            }
            i64.k0 k0Var = (i64.k0) ((java.util.HashMap) this.f289093h).remove(str);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeAdRemovedListener", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
            return k0Var;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsAdStatistic", "removeAdRemovedListener exp= " + th6.toString());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeAdRemovedListener", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
            return null;
        }
    }

    public void v(long j17, long j18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setCurPlayTime", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        com.tencent.mm.sdk.platformtools.u3.h(new i64.y0(this, j17, j18));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCurPlayTime", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
    }

    public void w(long j17, long j18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updatePlayStartTime", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updatePlayStartTime", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        com.tencent.mm.sdk.platformtools.u3.h(new i64.u0(this, j17, j18, false));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updatePlayStartTime", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updatePlayStartTime", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
    }

    public void x(long j17, int i17, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateVideo", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateVideo", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        com.tencent.mm.sdk.platformtools.u3.h(new i64.s0(this, j17, i17, z17, false));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateVideo", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateVideo", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
    }

    public void y(long j17, boolean z17, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateVideoAutoPlayImpl", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateVideoAutoPlayImpl", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        java.lang.Long valueOf = java.lang.Long.valueOf(j17);
        java.util.Map map = this.f289092g;
        i64.c1 c1Var = map.containsKey(valueOf) ? (i64.c1) map.get(java.lang.Long.valueOf(j17)) : new i64.c1("timeline");
        if (z17) {
            c1Var.f289121i.f297913e = 2;
        } else {
            c1Var.f289121i.f297913e = 1;
        }
        c1Var.f289121i.f297914f = i17;
        map.put(java.lang.Long.valueOf(j17), c1Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateVideoAutoPlayImpl", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateVideoAutoPlayImpl", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
    }

    public void z(long j17, int i17, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateVideoImpl", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        A(j17, i17, z17, false);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateVideoImpl", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
    }
}
