package n74;

/* loaded from: classes4.dex */
public abstract class v1 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Set f335442a = java.util.Collections.synchronizedSet(new java.util.HashSet());

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Set f335443b = java.util.Collections.synchronizedSet(new java.util.HashSet());

    public static /* synthetic */ java.util.Set a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
        return f335442a;
    }

    public static boolean b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkNetStatus", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
        boolean z17 = com.tencent.mars.comm.NetStatusUtil.isWifi(com.tencent.mm.sdk.platformtools.x2.f193071a) || com.tencent.mars.comm.NetStatusUtil.is4G(com.tencent.mm.sdk.platformtools.x2.f193071a) || com.tencent.mars.comm.NetStatusUtil.is5G(com.tencent.mm.sdk.platformtools.x2.f193071a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkNetStatus", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
        return z17;
    }

    public static void c(java.util.LinkedList linkedList, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkPreloadAdResource", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
        if (linkedList == null || linkedList.size() == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkPreloadAdResource", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
            return;
        }
        for (int i18 = 0; i18 < linkedList.size(); i18++) {
            e((r45.g5) linkedList.get(i18), i17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkPreloadAdResource", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
    }

    public static boolean d(com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject, com.tencent.mm.plugin.sns.storage.ADXml aDXml, com.tencent.mm.plugin.sns.storage.ADInfo aDInfo, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkPreloadAdResource", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
        try {
            java.lang.System.currentTimeMillis();
            n74.w1.c(i17);
            l();
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("TimeLineAdPreloadHelper", "checkPreloadAdResource, exp=" + th6.toString());
            ca4.q.c("TimeLineAdPreloadHelper, checkPreloadAdResourceByTLObj", th6);
        }
        if (!b()) {
            com.tencent.mars.xlog.Log.w("TimeLineAdPreloadHelper", "checkPreloadAdResource, network is not wifi or 4G,5G");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkPreloadAdResource", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
            return false;
        }
        f(timeLineObject, aDXml, aDInfo, i17);
        java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkPreloadAdResource", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00ee A[Catch: all -> 0x010d, TryCatch #0 {all -> 0x010d, blocks: (B:3:0x0010, B:6:0x0044, B:8:0x004b, B:10:0x005c, B:14:0x00c9, B:16:0x00cd, B:18:0x00d1, B:20:0x00d7, B:22:0x00e3, B:23:0x00e5, B:25:0x00ee, B:26:0x00f7, B:28:0x00fd, B:32:0x0106, B:35:0x0095, B:37:0x00b3, B:38:0x00ba, B:39:0x0078), top: B:2:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00fd A[Catch: all -> 0x010d, TRY_LEAVE, TryCatch #0 {all -> 0x010d, blocks: (B:3:0x0010, B:6:0x0044, B:8:0x004b, B:10:0x005c, B:14:0x00c9, B:16:0x00cd, B:18:0x00d1, B:20:0x00d7, B:22:0x00e3, B:23:0x00e5, B:25:0x00ee, B:26:0x00f7, B:28:0x00fd, B:32:0x0106, B:35:0x0095, B:37:0x00b3, B:38:0x00ba, B:39:0x0078), top: B:2:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0106 A[Catch: all -> 0x010d, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x010d, blocks: (B:3:0x0010, B:6:0x0044, B:8:0x004b, B:10:0x005c, B:14:0x00c9, B:16:0x00cd, B:18:0x00d1, B:20:0x00d7, B:22:0x00e3, B:23:0x00e5, B:25:0x00ee, B:26:0x00f7, B:28:0x00fd, B:32:0x0106, B:35:0x0095, B:37:0x00b3, B:38:0x00ba, B:39:0x0078), top: B:2:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b3 A[Catch: all -> 0x010d, TryCatch #0 {all -> 0x010d, blocks: (B:3:0x0010, B:6:0x0044, B:8:0x004b, B:10:0x005c, B:14:0x00c9, B:16:0x00cd, B:18:0x00d1, B:20:0x00d7, B:22:0x00e3, B:23:0x00e5, B:25:0x00ee, B:26:0x00f7, B:28:0x00fd, B:32:0x0106, B:35:0x0095, B:37:0x00b3, B:38:0x00ba, B:39:0x0078), top: B:2:0x0010 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean e(r45.g5 r13, int r14) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n74.v1.e(r45.g5, int):boolean");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(38:1|(3:(1:224)(1:229)|(1:226)(1:228)|227)(1:4)|5|6|(1:8)(1:222)|9|(1:12)|13|(7:15|(1:17)(1:220)|18|(1:20)(1:219)|21|(1:23)(1:218)|(1:25)(1:217))(1:221)|26|27|28|29|(2:30|31)|(2:33|34)(27:172|173|(2:178|(2:180|181)(2:182|(2:184|185)(2:186|(2:188|189)(2:190|(2:192|193)(23:194|(3:(2:197|(1:199)(4:200|201|202|203))|205|203)(1:206)|204|36|(1:38)(3:164|(2:166|(2:168|(1:170)))|171)|39|(1:163)(1:(1:162)(2:48|(1:161)(4:51|(3:53|(2:59|60)|61)|65|66)))|67|(3:69|(4:72|(2:74|75)(2:77|(2:79|(2:81|82)(1:83))(2:84|(2:86|87)(2:88|(2:90|(4:92|(1:94)|95|96)(1:97))(2:98|(2:100|(2:102|103)(1:104))(2:105|106)))))|76|70)|107)|108|(5:114|(2:117|115)|118|119|(1:125))|126|(2:128|(1:130)(2:131|(1:133)(2:134|(1:136)(1:137))))|138|139|140|(1:144)|146|(1:152)|153|(1:155)|156|157)))))|207|208|209|36|(0)(0)|39|(1:41)|163|67|(0)|108|(7:110|112|114|(1:115)|118|119|(3:121|123|125))|126|(0)|138|139|140|(2:142|144)|146|(3:148|150|152)|153|(0)|156|157)|35|36|(0)(0)|39|(0)|163|67|(0)|108|(0)|126|(0)|138|139|140|(0)|146|(0)|153|(0)|156|157|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x056c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x056d, code lost:
    
        com.tencent.mars.xlog.Log.e("TimeLineAdPreloadHelper", r0.toString());
        ca4.q.c("TimeLineAdPreloadHelper, preloadFinderFeeds", r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x04c9 A[LOOP:2: B:115:0x04c3->B:117:0x04c9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x054d A[Catch: all -> 0x056c, TryCatch #2 {all -> 0x056c, blocks: (B:140:0x0549, B:142:0x054d, B:144:0x0551), top: B:139:0x0549 }] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0588  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x05c4  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x03c4  */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void f(com.tencent.mm.protocal.protobuf.TimeLineObject r20, com.tencent.mm.plugin.sns.storage.ADXml r21, com.tencent.mm.plugin.sns.storage.ADInfo r22, int r23) {
        /*
            Method dump skipped, instructions count: 1517
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n74.v1.f(com.tencent.mm.protocal.protobuf.TimeLineObject, com.tencent.mm.plugin.sns.storage.ADXml, com.tencent.mm.plugin.sns.storage.ADInfo, int):void");
    }

    public static void g(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("downloadImage", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
        if (android.text.TextUtils.isEmpty(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("downloadImage", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
            return;
        }
        java.lang.String e17 = z17 ? a84.m.e(str) : za4.t0.l("adId", str);
        if (!android.text.TextUtils.isEmpty(e17) && com.tencent.mm.vfs.w6.j(e17)) {
            com.tencent.mars.xlog.Log.i("TimeLineAdPreloadHelper", str3 + " file exists, snsId=" + str2 + ", useCdn=" + z17 + ", filePath=" + e17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("downloadImage", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
            return;
        }
        if (z17) {
            java.util.Set set = f335443b;
            if (set.contains(str)) {
                com.tencent.mars.xlog.Log.w("TimeLineAdPreloadHelper", str3 + " [cdn] downloading, snsId=" + str2);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("downloadImage", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
                return;
            }
            set.add(str);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1697, 34);
            a84.m.d(str, new n74.s1(str3, str2, str));
        } else {
            java.util.Set set2 = f335442a;
            if (set2.contains(str)) {
                com.tencent.mars.xlog.Log.w("TimeLineAdPreloadHelper", str3 + " [http] downloading, snsId=" + str2);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("downloadImage", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
                return;
            }
            set2.add(str);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1697, 34);
            za4.t0.a(str, true, 41, 0, new n74.t1(str3, str2, str));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("downloadImage", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
    }

    public static void h(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("downloadImageByCdn", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
        g(str, str2, str3, true);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("downloadImageByCdn", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
    }

    public static void i(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("downloadImageByHttp", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
        g(str, str2, str3, false);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("downloadImageByHttp", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
    }

    public static void j(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("downloadImageByLandingPage", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
        if (android.text.TextUtils.isEmpty(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("downloadImageByLandingPage", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
            return;
        }
        java.lang.String l17 = za4.t0.l("adId", str);
        if (!android.text.TextUtils.isEmpty(l17) && com.tencent.mm.vfs.w6.j(l17)) {
            com.tencent.mars.xlog.Log.i("TimeLineAdPreloadHelper", str2 + " [landingPageImg] file exists, filePath=" + l17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("downloadImageByLandingPage", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
            return;
        }
        java.util.Set set = f335442a;
        if (!set.contains(str)) {
            set.add(str);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1697, 34);
            za4.t0.d("adId", str, new n74.r1(str, str2));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("downloadImageByLandingPage", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
            return;
        }
        com.tencent.mars.xlog.Log.w("TimeLineAdPreloadHelper", str2 + ", [landingPageImg] downloading");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("downloadImageByLandingPage", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
    }

    public static boolean k(i64.q qVar, r45.jj4 jj4Var) {
        com.tencent.mm.plugin.sns.storage.ADXml aDXml;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isFlipCardAdBigImage", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
        if (qVar == null || (aDXml = qVar.f289288b) == null || !aDXml.isFlipCardAd()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isFlipCardAdBigImage", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
            return false;
        }
        if (jj4Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isFlipCardAdBigImage", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
            return false;
        }
        if (jj4Var == aDXml.adFlipCardInfo.e()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isFlipCardAdBigImage", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
            return true;
        }
        t74.a2 a2Var = aDXml.adFlipCardInfo;
        a2Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBackMiddleMedia", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardInfo");
        r45.jj4 jj4Var2 = a2Var.f416090e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBackMiddleMedia", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardInfo");
        if (jj4Var == jj4Var2) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isFlipCardAdBigImage", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
            return true;
        }
        if (jj4Var == aDXml.adFlipCardInfo.d()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isPhotoMedia", "com.tencent.mm.plugin.sns.data.SnsAdUtilKt");
            boolean z17 = jj4Var.f377856e == 2;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isPhotoMedia", "com.tencent.mm.plugin.sns.data.SnsAdUtilKt");
            if (z17) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isFlipCardAdBigImage", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
                return true;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isFlipCardAdBigImage", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
        return false;
    }

    public static void l() {
        java.lang.String b17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("preloadAdDeviceInfo", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        synchronized (v34.b.class) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("preloadDeviceInfo", "com.tencent.mm.plugin.sns.ad.device.AdDeviceInfo");
            v34.a aVar = new v34.a();
            v34.a.a(aVar, true, true);
            b17 = v34.a.b(aVar);
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (b17 == null) {
                b17 = "";
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("preloadDeviceInfo", "com.tencent.mm.plugin.sns.ad.device.AdDeviceInfo");
        }
        com.tencent.mars.xlog.Log.i("TimeLineAdPreloadHelper", "AdDeviceInfo.preloadDeviceInfo, timeCost = " + (java.lang.System.currentTimeMillis() - currentTimeMillis) + ", ret = " + b17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("preloadAdDeviceInfo", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
    }

    public static void m(i64.q qVar, boolean z17) {
        com.tencent.mm.plugin.sns.storage.ADXml aDXml;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("preloadBreakVideo", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
        if (qVar == null || (aDXml = qVar.f289288b) == null) {
            com.tencent.mars.xlog.Log.w("TimeLineAdPreloadHelper", "preloadBreakVideo, adModel = null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("preloadBreakVideo", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
            return;
        }
        com.tencent.mm.plugin.sns.storage.d0 d0Var = aDXml.adBreakFrameInfo;
        if (d0Var != null) {
            com.tencent.mm.plugin.sns.storage.a1 a17 = d0Var.a();
            a17.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMedia", "com.tencent.mm.plugin.sns.storage.AlphaVideoInfo");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMedia", "com.tencent.mm.plugin.sns.storage.AlphaVideoInfo");
            r45.jj4 jj4Var = a17.f165915a;
            if (jj4Var != null) {
                jj4Var.N = true;
            }
            r45.jj4 a18 = d0Var.a().a();
            com.tencent.mm.plugin.sns.storage.a1 a19 = d0Var.a();
            a19.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getOneToOneLowMedia", "com.tencent.mm.plugin.sns.storage.AlphaVideoInfo");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getOneToOneLowMedia", "com.tencent.mm.plugin.sns.storage.AlphaVideoInfo");
            if (a18 != null) {
                a18.N = true;
            }
            r45.jj4 jj4Var2 = a19.f165917c;
            if (jj4Var2 != null) {
                jj4Var2.N = true;
            }
            if (d0Var.a() != null && d0Var.a().b() != null && d0Var.a().b().b() != null) {
                com.tencent.mm.plugin.sns.storage.s1 stateInfo = d0Var.a().b().b();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("preloadIcon", "com.tencent.mm.plugin.sns.storage.PlayStateInfo");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("preloadIcon", "com.tencent.mm.plugin.sns.storage.PlayStateInfo$Companion");
                kotlin.jvm.internal.o.g(stateInfo, "stateInfo");
                com.tencent.mars.xlog.Log.i("PlayStateInfo", "preloadIcon start");
                com.tencent.mm.plugin.sns.storage.q1 q1Var = com.tencent.mm.plugin.sns.storage.r1.f166117d;
                q1Var.b(stateInfo.a());
                q1Var.b(stateInfo.c());
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLikeState", "com.tencent.mm.plugin.sns.storage.PlayStateInfo");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLikeState", "com.tencent.mm.plugin.sns.storage.PlayStateInfo");
                q1Var.b(stateInfo.f166130d);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCommentState", "com.tencent.mm.plugin.sns.storage.PlayStateInfo");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCommentState", "com.tencent.mm.plugin.sns.storage.PlayStateInfo");
                q1Var.b(stateInfo.f166131e);
                com.tencent.mm.plugin.sns.storage.r1 b17 = stateInfo.b();
                if (b17 != null) {
                    q1Var.b(b17);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("preloadIcon", "com.tencent.mm.plugin.sns.storage.PlayStateInfo$Companion");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("preloadIcon", "com.tencent.mm.plugin.sns.storage.PlayStateInfo");
            }
        }
        if ((aDXml.isAdBreakFrameVideo() || aDXml.isAdIpInteractVideo() || aDXml.isAdSolidBreakFrameVideo()) && d0Var != null) {
            int c17 = d0Var.a().c();
            com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject = qVar.f289289c;
            if (c17 == 1) {
                r45.jj4 a27 = d0Var.a().a();
                if (a27 == null || !o54.p.f343160a.c(2880, 1080)) {
                    com.tencent.mm.plugin.sns.storage.a1 a28 = d0Var.a();
                    a28.getClass();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getOneToOneLowMedia", "com.tencent.mm.plugin.sns.storage.AlphaVideoInfo");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getOneToOneLowMedia", "com.tencent.mm.plugin.sns.storage.AlphaVideoInfo");
                    r45.jj4 jj4Var3 = a28.f165917c;
                    if (jj4Var3 != null) {
                        l44.c0.c(qVar, jj4Var3, timeLineObject.Id);
                        v(jj4Var3, timeLineObject.Id, z17);
                        if (aDXml.isAdSolidBreakFrameVideo()) {
                            h(jj4Var3.f377860i, timeLineObject.Id, "TimeLineAdPreloadHelper");
                        }
                    }
                } else {
                    l44.c0.c(qVar, a27, timeLineObject.Id);
                    v(a27, timeLineObject.Id, z17);
                    if (aDXml.isAdSolidBreakFrameVideo()) {
                        h(a27.f377860i, timeLineObject.Id, "TimeLineAdPreloadHelper");
                    }
                }
            } else {
                com.tencent.mm.plugin.sns.storage.a1 a29 = d0Var.a();
                a29.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMedia", "com.tencent.mm.plugin.sns.storage.AlphaVideoInfo");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMedia", "com.tencent.mm.plugin.sns.storage.AlphaVideoInfo");
                r45.jj4 jj4Var4 = a29.f165915a;
                if (jj4Var4 != null) {
                    l44.c0.c(qVar, jj4Var4, timeLineObject.Id);
                    v(jj4Var4, timeLineObject.Id, z17);
                    if (aDXml.isAdSolidBreakFrameVideo()) {
                        h(jj4Var4.f377860i, timeLineObject.Id, "TimeLineAdPreloadHelper");
                    }
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("preloadBreakVideo", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
    }

    public static boolean n(i64.q qVar, java.lang.String str, boolean z17) {
        com.tencent.mm.plugin.sns.storage.ADXml aDXml;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("preloadFlipCardRes", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
        if (qVar == null || (aDXml = qVar.f289288b) == null || !aDXml.isFlipCardAd() || android.text.TextUtils.isEmpty(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("preloadFlipCardRes", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
            return false;
        }
        com.tencent.mars.xlog.Log.i("TimeLineAdPreloadHelper", "preloadFlipCardRes, snsId=" + str);
        try {
            java.util.List h17 = aDXml.adFlipCardInfo.h();
            if (a84.b0.b(h17)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("preloadFlipCardRes", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
                return true;
            }
            java.util.Iterator it = ((java.util.ArrayList) h17).iterator();
            while (it.hasNext()) {
                r45.jj4 jj4Var = (r45.jj4) it.next();
                if (jj4Var != null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isSight", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardInfo$Companion");
                    boolean z18 = jj4Var.f377856e == 6;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSight", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardInfo$Companion");
                    if (z18) {
                        l44.c0.c(qVar, jj4Var, str);
                        t(jj4Var, str);
                    } else {
                        u(jj4Var, str, k(qVar, jj4Var));
                    }
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("preloadFlipCardRes", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
            return true;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("TimeLineAdPreloadHelper", "preloadFlipCardRes exp = " + th6.toString());
            ca4.q.c("TimeLineAdPreloadHelper, preload flipCardRes exp", th6);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("preloadFlipCardRes", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
            return true;
        }
    }

    public static boolean o(i64.q qVar, java.lang.String str, boolean z17) {
        com.tencent.mm.plugin.sns.storage.ADXml aDXml;
        r45.jj4 b17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("preloadLookbookCardRes", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
        if (qVar == null || (aDXml = qVar.f289288b) == null || !aDXml.isLookbookCardAd() || android.text.TextUtils.isEmpty(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("preloadLookbookCardRes", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
            return false;
        }
        com.tencent.mars.xlog.Log.i("TimeLineAdPreloadHelper", "preloadLookbookCardRes, snsId=" + str);
        try {
            java.util.List<v74.q> c17 = aDXml.adLookbookInfo.c();
            if (a84.b0.b(c17)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("preloadLookbookCardRes", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
                return true;
            }
            for (v74.q qVar2 : c17) {
                if (qVar2 != null && (b17 = qVar2.b()) != null) {
                    if (qVar2.c()) {
                        l44.c0.c(qVar, b17, str);
                        t(b17, str);
                    } else {
                        java.lang.String str2 = b17.f377860i;
                        if (!android.text.TextUtils.isEmpty(str2)) {
                            a84.m.d(str2, new n74.q1(str2));
                        }
                    }
                }
            }
            r45.jj4 f17 = aDXml.adLookbookInfo.f();
            if (f17 != null) {
                l44.c0.c(qVar, f17, str);
                t(f17, str);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("preloadLookbookCardRes", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
            return true;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("TimeLineAdPreloadHelper", "preloadLookbookCardRes exp = " + th6.toString());
            ca4.q.c("TimeLineAdPreloadHelper, preload lookbook cardRes exp", th6);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("preloadLookbookCardRes", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
            return true;
        }
    }

    public static void p(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("preloadPag", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
        try {
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("TimeLineAdPreloadHelper", "onPreloadPagFile, exp=" + th6.toString());
            ca4.q.c("TimeLineAdPreloadHelper, onPreloadPagFile", th6);
        }
        if (com.tencent.mm.vfs.w6.j(za4.t0.m("adId", str))) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("preloadPag", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
        } else {
            com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.l0.a(str);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("preloadPag", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
        }
    }

    public static boolean q(i64.q qVar, java.lang.String str, boolean z17) {
        com.tencent.mm.plugin.sns.storage.ADXml aDXml;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("preloadSlideFullCardRes", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
        if (qVar == null || (aDXml = qVar.f289288b) == null || aDXml.adSliderFullCardInfo == null || android.text.TextUtils.isEmpty(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("preloadSlideFullCardRes", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
            return false;
        }
        try {
            java.util.List<s34.x0> list = aDXml.adSliderFullCardInfo.resInfoList;
            if (a84.b0.b(list)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("preloadSlideFullCardRes", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
                return false;
            }
            for (s34.x0 x0Var : list) {
                if (x0Var != null) {
                    if (x0Var.a()) {
                        l44.c0.c(qVar, x0Var.f402828e, str);
                        if (n74.l0.d()) {
                            v(x0Var.f402828e, str, z17);
                        }
                        t(x0Var.f402828e, str);
                    } else {
                        za4.t0.d("adId", x0Var.f402828e.f377860i, new n74.z1(null));
                    }
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("preloadSlideFullCardRes", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
            return true;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("TimeLineAdPreloadHelper", "preloadSlideFullCardRes exp = " + th6.toString());
            ca4.q.c("TimeLineAdPreloadHelper, preloadSlideFullCardRes", th6);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("preloadSlideFullCardRes", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
            return false;
        }
    }

    public static boolean r(i64.q qVar, java.lang.String str, boolean z17) {
        com.tencent.mm.plugin.sns.storage.ADXml aDXml;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("preloadTopicCardRes", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
        if (qVar == null || (aDXml = qVar.f289288b) == null || aDXml.adFinderTopicInfo == null || android.text.TextUtils.isEmpty(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("preloadTopicCardRes", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
            return false;
        }
        try {
            java.util.List list = aDXml.adFinderTopicInfo.f402656f;
            if (a84.b0.b(list)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("preloadTopicCardRes", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
                return false;
            }
            java.util.Iterator it = ((java.util.ArrayList) list).iterator();
            while (it.hasNext()) {
                s34.i0 i0Var = (s34.i0) it.next();
                if (i0Var != null && i0Var.a()) {
                    v(i0Var.f402667i, str, z17);
                    t(i0Var.f402667i, str);
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("preloadTopicCardRes", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
            return true;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("TimeLineAdPreloadHelper", "preloadTopicCardRes exp=" + th6.toString());
            ca4.q.c("TimeLineAdPreloadHelper, preloadTopicCardRes", th6);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("preloadTopicCardRes", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
            return false;
        }
    }

    public static boolean s(r45.jj4 jj4Var, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startPreloadBigImage", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
        if (!com.tencent.mm.vfs.w6.j(com.tencent.mm.plugin.sns.model.f6.d(com.tencent.mm.plugin.sns.model.l4.Di(), jj4Var.f377855d) + ca4.z0.J(jj4Var))) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1697, 34);
            com.tencent.mm.sdk.platformtools.u3.h(new n74.u1(str, jj4Var));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startPreloadBigImage", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
            return true;
        }
        com.tencent.mars.xlog.Log.w("TimeLineAdPreloadHelper", "startPreloadBigImage, file Exists, snsId=" + str + ", mediaId=" + jj4Var.f377855d);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startPreloadBigImage", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
        return false;
    }

    public static boolean t(r45.jj4 jj4Var, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startPreloadThumb", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
        if (!com.tencent.mm.vfs.w6.j(com.tencent.mm.plugin.sns.model.f6.d(com.tencent.mm.plugin.sns.model.l4.Di(), jj4Var.f377855d) + ca4.z0.U(jj4Var))) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1697, 34);
            com.tencent.mm.sdk.platformtools.u3.h(new n74.p1(str, jj4Var));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startPreloadThumb", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
            return true;
        }
        com.tencent.mars.xlog.Log.w("TimeLineAdPreloadHelper", "startPreloadThumb, file Exists, snsId=" + str + ", mediaId=" + jj4Var.f377855d);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startPreloadThumb", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
        return false;
    }

    public static boolean u(r45.jj4 jj4Var, java.lang.String str, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startPreloadThumb", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
        if (z17) {
            boolean s17 = s(jj4Var, str);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startPreloadThumb", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
            return s17;
        }
        boolean t17 = t(jj4Var, str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startPreloadThumb", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
        return t17;
    }

    public static boolean v(r45.jj4 jj4Var, java.lang.String str, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startPreloadVideo", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
        if (z17) {
            com.tencent.mars.xlog.Log.w("TimeLineAdPreloadHelper", "adVideoPreload, timeline offlineVideo, forbidden, snsId=" + str + ", mediaId=" + jj4Var.f377855d);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startPreloadVideo", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
            return false;
        }
        java.lang.String str2 = com.tencent.mm.plugin.sns.model.f6.d(com.tencent.mm.plugin.sns.model.l4.Di(), jj4Var.f377855d) + ca4.z0.R(jj4Var);
        if (!com.tencent.mm.vfs.w6.j(str2)) {
            com.tencent.mm.sdk.platformtools.u3.h(new n74.o1(str, jj4Var));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startPreloadVideo", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
            return true;
        }
        com.tencent.mars.xlog.Log.w("TimeLineAdPreloadHelper", "adVideoPreload, timeline offlineVideo, file Exists, snsId=" + str + ", mediaId=" + jj4Var.f377855d + ", filePath=" + str2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startPreloadVideo", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
        return false;
    }
}
