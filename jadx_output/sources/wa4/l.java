package wa4;

/* loaded from: classes4.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final wa4.l f444255a = new wa4.l();

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f444256b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f444257c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f444258d;

    static {
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_sns_timeline_share_to_biz_pic_limit, -1);
        f444257c = Ni;
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_sns_timeline_share_to_biz_pic_opt, false);
        f444256b = fj6;
        int Ni2 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_sns_timeline_share_to_biz_photo_count_threshold, 999);
        f444258d = Ni2;
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsBizPostManager", "snsBizCustomFeedPageExpt:" + fj6 + " snsBizNormalPublishPicCountExpt:" + Ni + " snsBizPhotoCountThreshold:" + Ni2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0046, code lost:
    
        if (r5 == false) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(java.lang.String r5, java.lang.String r6) {
        /*
            r4 = this;
            java.lang.String r0 = "checkPoiIsValid"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.snstimeline.SnsBizPostManager"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "checkPoiIsValid >> poiId = "
            r2.<init>(r3)
            r2.append(r5)
            java.lang.String r3 = " poiName = "
            r2.append(r3)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "MicroMsg.SnsBizPostManager"
            com.tencent.mars.xlog.Log.i(r3, r2)
            r2 = 1
            r3 = 0
            if (r5 == 0) goto L33
            int r5 = r5.length()
            if (r5 <= 0) goto L2e
            r5 = r2
            goto L2f
        L2e:
            r5 = r3
        L2f:
            if (r5 != r2) goto L33
            r5 = r2
            goto L34
        L33:
            r5 = r3
        L34:
            if (r5 == 0) goto L49
            if (r6 == 0) goto L45
            int r5 = r6.length()
            if (r5 <= 0) goto L40
            r5 = r2
            goto L41
        L40:
            r5 = r3
        L41:
            if (r5 != r2) goto L45
            r5 = r2
            goto L46
        L45:
            r5 = r3
        L46:
            if (r5 == 0) goto L49
            goto L4a
        L49:
            r2 = r3
        L4a:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: wa4.l.a(java.lang.String, java.lang.String):boolean");
    }
}
