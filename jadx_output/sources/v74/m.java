package v74;

/* loaded from: classes4.dex */
public final class m {

    /* renamed from: g, reason: collision with root package name */
    public static final v74.k f433864g = new v74.k(null);

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f433865a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f433866b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f433867c;

    @za4.k1(resType = 2)
    private java.lang.String charmImageUrl;

    /* renamed from: d, reason: collision with root package name */
    public int f433868d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f433869e;

    /* renamed from: f, reason: collision with root package name */
    public v74.l f433870f;

    @za4.l1
    public java.util.List<v74.q> itemList;

    @za4.k1(resType = 5)
    private com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo slideActionInfo;

    @za4.k1
    private s34.s slidePagInfo;

    @za4.k1
    private s34.s themePagInfo;

    @za4.k1
    private s34.s themePagInfoLowQuality;

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
    
        if (r3.c() == true) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(i64.q r6, v74.m r7, java.lang.String r8) {
        /*
            java.lang.String r0 = "checkSetH265"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardInfo"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            java.lang.String r2 = "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardInfo$Companion"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r2)
            if (r6 != 0) goto L12
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r2)
            goto L4e
        L12:
            if (r7 != 0) goto L18
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r2)
            goto L4e
        L18:
            java.util.List r7 = r7.c()
            java.util.Iterator r7 = r7.iterator()
        L20:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L4b
            java.lang.Object r3 = r7.next()
            v74.q r3 = (v74.q) r3
            if (r3 == 0) goto L36
            boolean r4 = r3.c()
            r5 = 1
            if (r4 != r5) goto L36
            goto L37
        L36:
            r5 = 0
        L37:
            if (r5 == 0) goto L20
            if (r3 == 0) goto L40
            r45.jj4 r4 = r3.b()
            goto L41
        L40:
            r4 = 0
        L41:
            if (r4 == 0) goto L20
            r45.jj4 r3 = r3.b()
            l44.c0.c(r6, r3, r8)
            goto L20
        L4b:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r2)
        L4e:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v74.m.a(i64.q, v74.m, java.lang.String):void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:84|85|(2:106|107)(2:87|(1:89)(6:105|19|(2:25|(3:27|28|(1:31)(1:30)))|77|28|(0)(0)))|90|91|(1:93)|94|95|(1:97)|98|(4:21|23|25|(0))|77|28|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x0156, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0388 A[LOOP:0: B:8:0x004a->B:30:0x0388, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x019f A[EDGE_INSN: B:31:0x019f->B:32:0x019f BREAK  A[LOOP:0: B:8:0x004a->B:30:0x0388], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final v74.m j(java.util.Map r24, java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 915
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v74.m.j(java.util.Map, java.lang.String):v74.m");
    }

    public final java.lang.String b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCharmImageUrl", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardInfo");
        java.lang.String str = this.charmImageUrl;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCharmImageUrl", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardInfo");
        return str;
    }

    public final java.util.List c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItemList", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardInfo");
        java.util.List<v74.q> list = this.itemList;
        if (list != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemList", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardInfo");
            return list;
        }
        kotlin.jvm.internal.o.o("itemList");
        throw null;
    }

    public final com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSlideActionInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardInfo");
        com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo = this.slideActionInfo;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSlideActionInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardInfo");
        return adClickActionInfo;
    }

    public final s34.s e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSlidePagInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardInfo");
        s34.s sVar = this.slidePagInfo;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSlidePagInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardInfo");
        return sVar;
    }

    public final r45.jj4 f() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSplashCardMedia", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardInfo");
        v74.l lVar = this.f433870f;
        r45.jj4 a17 = lVar != null ? lVar.a() : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSplashCardMedia", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardInfo");
        return a17;
    }

    public final s34.s g() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getThemePagInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardInfo");
        s34.s sVar = this.themePagInfo;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getThemePagInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardInfo");
        return sVar;
    }

    public final s34.s h() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getThemePagInfoLowQuality", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardInfo");
        s34.s sVar = this.themePagInfoLowQuality;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getThemePagInfoLowQuality", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardInfo");
        return sVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if ((!c().isEmpty()) != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean i() {
        /*
            r4 = this;
            java.lang.String r0 = "isValid"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardInfo"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo r2 = r4.slideActionInfo
            if (r2 == 0) goto L19
            java.util.List r2 = r4.c()
            boolean r2 = r2.isEmpty()
            r3 = 1
            r2 = r2 ^ r3
            if (r2 == 0) goto L19
            goto L1a
        L19:
            r3 = 0
        L1a:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: v74.m.i():boolean");
    }

    public final void k(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setCharmImageUrl", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardInfo");
        this.charmImageUrl = str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCharmImageUrl", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardInfo");
    }

    public final void l(com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSlideActionInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardInfo");
        this.slideActionInfo = adClickActionInfo;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSlideActionInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardInfo");
    }

    public final void m(s34.s sVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSlidePagInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardInfo");
        this.slidePagInfo = sVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSlidePagInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardInfo");
    }

    public final void n(s34.s sVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setThemePagInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardInfo");
        this.themePagInfo = sVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setThemePagInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardInfo");
    }

    public final void o(s34.s sVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setThemePagInfoLowQuality", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardInfo");
        this.themePagInfoLowQuality = sVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setThemePagInfoLowQuality", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardInfo");
    }
}
