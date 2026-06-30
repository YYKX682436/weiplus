package ga4;

/* loaded from: classes10.dex */
public final class m {

    /* renamed from: e, reason: collision with root package name */
    public static android.os.HandlerThread f269932e;

    /* renamed from: f, reason: collision with root package name */
    public static com.tencent.mm.sdk.platformtools.n3 f269933f;

    /* renamed from: a, reason: collision with root package name */
    public static final ga4.m f269928a = new ga4.m();

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.r2 f269929b = new com.tencent.mm.sdk.platformtools.r2(100);

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.Object f269930c = new java.lang.Object();

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.HashMap f269931d = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.Object f269934g = new java.lang.Object();

    /* renamed from: h, reason: collision with root package name */
    public static r26.t f269935h = new r26.t("");

    /* renamed from: i, reason: collision with root package name */
    public static final l75.q0 f269936i = ga4.h.f269923d;

    public static final /* synthetic */ java.util.HashMap a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getKeywordsHashMap$p", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher");
        java.util.HashMap hashMap = f269931d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getKeywordsHashMap$p", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher");
        return hashMap;
    }

    public static final /* synthetic */ android.os.HandlerThread b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getSpanThread$p", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher");
        android.os.HandlerThread handlerThread = f269932e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getSpanThread$p", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher");
        return handlerThread;
    }

    public static final void c() {
        java.lang.String str;
        java.lang.String str2 = "loadFinderKeywords";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("loadFinderKeywords", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher");
        java.util.HashMap hashMap = f269931d;
        hashMap.clear();
        f269929b.d(-1);
        f269935h = new r26.t("");
        zy2.lb lbVar = (zy2.lb) i95.n0.c(zy2.lb.class);
        if (lbVar != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            com.tencent.mm.plugin.finder.storage.gj0 gj0Var = (com.tencent.mm.plugin.finder.storage.gj0) ((jz5.n) ((com.tencent.mm.plugin.finder.service.t4) lbVar).f126215d).getValue();
            gj0Var.getClass();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            android.database.Cursor B = gj0Var.f126844d.B("select * from FinderSnsKeyWordsJumpConfig", null);
            if (B != null) {
                while (B.moveToNext()) {
                    com.tencent.mm.plugin.finder.storage.fj0 fj0Var = new com.tencent.mm.plugin.finder.storage.fj0();
                    fj0Var.convertFrom(B);
                    arrayList2.add(fj0Var);
                }
                B.close();
            }
            com.tencent.mars.xlog.Log.i("Finder.FinderSnsKeyWordsStorage", "getAllData size:" + arrayList2.size());
            java.util.Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                com.tencent.mm.plugin.finder.storage.fj0 fj0Var2 = (com.tencent.mm.plugin.finder.storage.fj0) it.next();
                zy2.kb kbVar = new zy2.kb(fj0Var2.field_localId);
                kbVar.f477445b = fj0Var2.field_startTime;
                kbVar.f477446c = fj0Var2.field_endTime;
                kbVar.f477447d = fj0Var2.field_keyWord;
                kbVar.f477448e = fj0Var2.field_passByInfo;
                arrayList.add(kbVar);
            }
            com.tencent.mars.xlog.Log.i("FinderSnsKeyWordsService", "dataList " + arrayList + ", size:" + arrayList.size());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDone", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$loadFinderKeywords$1");
            if (com.tencent.mm.sdk.platformtools.t8.L0(arrayList)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SnsKeywordMatcher", "loadFinderKeywords callback no data.");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDone", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$loadFinderKeywords$1");
                str = "loadFinderKeywords";
            } else {
                long j17 = 1000;
                long currentTimeMillis = java.lang.System.currentTimeMillis() / j17;
                java.util.Iterator it6 = arrayList.iterator();
                java.lang.Object obj = "";
                long j18 = currentTimeMillis;
                long j19 = j18;
                while (it6.hasNext()) {
                    java.util.Iterator it7 = it6;
                    zy2.kb kbVar2 = (zy2.kb) it6.next();
                    java.lang.String str3 = str2;
                    long j27 = j17;
                    long j28 = kbVar2.f477445b;
                    if (currentTimeMillis < j28) {
                        if (j19 < j28) {
                            j19 = j28;
                        }
                    } else if (currentTimeMillis < kbVar2.f477446c) {
                        a().put(kbVar2.f477447d, kbVar2);
                        long j29 = kbVar2.f477446c;
                        if (j18 < j29) {
                            j18 = j29;
                        }
                    }
                    str2 = str3;
                    it6 = it7;
                    j17 = j27;
                }
                str = str2;
                long j37 = j17;
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsKeywordMatcher", "loadFinderKeywords done. dataList size:" + arrayList.size() + ", keywordsHashMap size:" + a().size() + ", minStartTime:" + j19 + ", minEndTime:" + j18);
                if (a() != null && a().size() > 0) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$buildKeywordsRegex", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("buildKeywordsRegex", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher");
                    java.lang.String pattern = com.tencent.mm.pluginsdk.ui.span.b0.f191186u.toString();
                    java.util.Iterator it8 = hashMap.entrySet().iterator();
                    boolean z17 = true;
                    while (it8.hasNext()) {
                        java.util.Map.Entry entry = (java.util.Map.Entry) it8.next();
                        if (z17) {
                            obj = entry.getKey();
                            z17 = false;
                        } else {
                            java.util.Iterator it9 = it8;
                            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                            sb6.append((java.lang.String) obj);
                            sb6.append('|');
                            obj = sb6.toString() + ((java.lang.String) entry.getKey());
                            it8 = it9;
                            z17 = z17;
                        }
                    }
                    f269935h = new r26.t(java.lang.String.valueOf(pattern + "|(" + ((java.lang.String) obj) + ')'));
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder("finished build keywords keywordRegexs:");
                    sb7.append(f269935h);
                    com.tencent.mars.xlog.Log.i("MicroMsg.SnsKeywordMatcher", sb7.toString());
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildKeywordsRegex", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$buildKeywordsRegex", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher");
                }
                if (j19 <= currentTimeMillis) {
                    j19 = j18;
                } else if (j18 > currentTimeMillis) {
                    j19 = java.lang.Math.min(j19, j18);
                }
                if (j19 > currentTimeMillis) {
                    ga4.g gVar = ga4.g.f269922d;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$queue", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher");
                    f269928a.e((j19 - currentTimeMillis) * j37, gVar);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$queue", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher");
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDone", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$loadFinderKeywords$1");
            }
            str2 = str;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher");
    }

    public static final void d(java.lang.String str) {
        r26.t tVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("putMatchContent", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && (tVar = f269935h) != null) {
            java.lang.String pattern = tVar.f368917d.pattern();
            kotlin.jvm.internal.o.f(pattern, "pattern(...)");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(pattern)) {
                if (f269929b.get(str) == null) {
                    ga4.m mVar = f269928a;
                    ga4.i iVar = new ga4.i(str);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("queue$default", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher");
                    mVar.e(0L, iVar);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("queue$default", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher");
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("putMatchContent", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher");
                return;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("putMatchContent", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher");
    }

    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r6v4 */
    public static final java.lang.CharSequence f(long j17, java.lang.CharSequence charSequence, int i17, int i18) {
        ga4.c cVar;
        java.lang.CharSequence content = charSequence;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("spanContent", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher");
        kotlin.jvm.internal.o.g(content, "content");
        com.tencent.mm.sdk.platformtools.r2 r2Var = f269929b;
        if (r2Var == null || r2Var.size() <= 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("spanContent", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher");
            return content;
        }
        ?? r66 = 1;
        if (com.tencent.mm.sdk.platformtools.t8.P(j62.e.g().a("clicfg_sns_keyword", "0", false, true), 0) <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsKeywordMatcher", "switch close.");
            g();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("spanContent", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher");
            return content;
        }
        android.os.SystemClock.elapsedRealtime();
        synchronized (f269930c) {
            try {
                cVar = (ga4.c) r2Var.get(charSequence.toString());
            } catch (java.lang.Throwable th6) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("spanContent", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher");
                throw th6;
            }
        }
        if (cVar != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getContentMatchList", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$SnsInfoMatchResult");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getContentMatchList", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$SnsInfoMatchResult");
            java.util.ArrayList arrayList = new java.util.ArrayList(cVar.f269907b);
            if (!arrayList.isEmpty()) {
                android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(content);
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ga4.a aVar = (ga4.a) it.next();
                    aVar.getClass();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getKeyword", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$ContentMatchResult");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getKeyword", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$ContentMatchResult");
                    java.lang.String str = aVar.f269903c;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getStartPos", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$ContentMatchResult");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getStartPos", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$ContentMatchResult");
                    int i19 = aVar.f269901a;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("buildKeywordSpan", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher");
                    ga4.b bVar = new ga4.b(str, i18);
                    kotlin.jvm.internal.f0 f0Var = new kotlin.jvm.internal.f0();
                    java.lang.String m07 = com.tencent.mm.sdk.platformtools.t8.m0(com.tencent.mm.sdk.platformtools.x2.f193071a);
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(m07)) {
                        if (r26.i0.p(m07, "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI", r66)) {
                            f0Var.f310116d = r66;
                        } else if (r26.i0.p(m07, "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI", r66)) {
                            f0Var.f310116d = 2;
                        }
                    }
                    java.util.Iterator it6 = it;
                    com.tencent.mm.plugin.sns.model.l4.Uj().post(new ga4.d(j17, i17, str, i19, f0Var));
                    ga4.f fVar = new ga4.f(j17, i17, i19, f0Var);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setCallBack", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$KeywordClickableSpan");
                    bVar.f269905e = fVar;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCallBack", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$KeywordClickableSpan");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildKeywordSpan", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getStartPos", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$ContentMatchResult");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getStartPos", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$ContentMatchResult");
                    int i27 = aVar.f269901a;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getEndPos", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$ContentMatchResult");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getEndPos", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$ContentMatchResult");
                    spannableStringBuilder.setSpan(bVar, i27, aVar.f269902b + 1, 18);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getStartPos", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$ContentMatchResult");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getStartPos", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$ContentMatchResult");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getEndPos", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$ContentMatchResult");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getEndPos", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$ContentMatchResult");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getKeyword", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$ContentMatchResult");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getKeyword", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$ContentMatchResult");
                    it = it6;
                    r66 = 1;
                }
                content = spannableStringBuilder;
            }
        }
        android.os.SystemClock.elapsedRealtime();
        java.lang.CharSequence charSequence2 = content;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("spanContent", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher");
        return charSequence2;
    }

    public static final void g() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("stop", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher");
        pm0.v.K(null, ga4.l.f269927d);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stop", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(long r5, final yz5.a r7) {
        /*
            r4 = this;
            java.lang.String r0 = "queue"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            java.lang.Object r0 = ga4.m.f269934g
            monitor-enter(r0)
            com.tencent.mm.sdk.platformtools.n3 r1 = ga4.m.f269933f     // Catch: java.lang.Throwable -> L4a
            r2 = 0
            if (r1 == 0) goto L21
            android.os.HandlerThread r1 = ga4.m.f269932e     // Catch: java.lang.Throwable -> L4a
            r3 = 1
            if (r1 == 0) goto L1d
            boolean r1 = r1.isAlive()     // Catch: java.lang.Throwable -> L4a
            if (r1 != r3) goto L1d
            r1 = r3
            goto L1e
        L1d:
            r1 = r2
        L1e:
            if (r1 == 0) goto L21
            r2 = r3
        L21:
            monitor-exit(r0)
            if (r2 != 0) goto L35
            java.lang.String r5 = "MicroMsg.SnsKeywordMatcher"
            java.lang.String r6 = "queue thread already release"
            com.tencent.mars.xlog.Log.e(r5, r6)
            java.lang.String r5 = "queue"
            java.lang.String r6 = "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r6)
            return
        L35:
            com.tencent.mm.sdk.platformtools.n3 r0 = ga4.m.f269933f
            if (r0 == 0) goto L41
            ga4.j r1 = new ga4.j
            r1.<init>(r7)
            r0.postDelayed(r1, r5)
        L41:
            java.lang.String r5 = "queue"
            java.lang.String r6 = "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r6)
            return
        L4a:
            r5 = move-exception
            monitor-exit(r0)
            java.lang.String r6 = "queue"
            java.lang.String r7 = "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r7)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ga4.m.e(long, yz5.a):void");
    }
}
