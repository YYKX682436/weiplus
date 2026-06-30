package com.tencent.mm.plugin.fts.ui;

/* loaded from: classes12.dex */
public abstract class x2 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Set f138375a;

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.Boolean f138376b;

    static {
        new java.util.concurrent.atomic.AtomicBoolean(false);
        new java.util.concurrent.atomic.AtomicInteger(0);
        java.util.HashSet hashSet = new java.util.HashSet();
        f138375a = hashSet;
        hashSet.addAll(java.util.Arrays.asList(6L, 8L, 9L, 18L, 23L, 29L, 32L));
        f138376b = null;
    }

    public static java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        if (f138376b == null) {
            f138376b = java.lang.Boolean.valueOf(c01.e2.a0());
        }
        return !f138376b.booleanValue() ? obj : obj2;
    }

    public static final int b(int i17, int i18, boolean z17) {
        if (z17) {
            return 15;
        }
        if (i17 == 131072) {
            if (i18 == 11) {
                return 8;
            }
            switch (i18) {
                case 1:
                    return 1;
                case 2:
                    return 2;
                case 3:
                    return 3;
                case 4:
                    return 4;
                case 5:
                    return 5;
                case 6:
                    return 6;
                case 7:
                    return 7;
                default:
                    switch (i18) {
                        case 15:
                            return 16;
                        case 16:
                            return 10;
                        case 17:
                        case 18:
                            return 9;
                        default:
                            return 0;
                    }
            }
        }
        if (i17 != 131075) {
            if (i17 == 131081) {
                return 19;
            }
            return i17 == 65536 ? 17 : 0;
        }
        if (i18 == 1) {
            return 12;
        }
        if (i18 == 2) {
            return 13;
        }
        if (i18 == 3) {
            return 14;
        }
        if (i18 == 5) {
            return 12;
        }
        if (i18 == 6) {
            return 13;
        }
        if (i18 == 7) {
            return 14;
        }
        switch (i18) {
            default:
                switch (i18) {
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                        break;
                    default:
                        return 0;
                }
            case 29:
            case 30:
            case 31:
            case 32:
                return 11;
        }
    }

    public static int c(int i17) {
        switch (i17) {
            case 29:
                return 1;
            case 30:
                return 2;
            case 31:
                return 3;
            case 32:
                return 4;
            case 33:
            default:
                return 0;
            case 34:
                return 5;
            case 35:
            case 36:
                return 6;
            case 37:
                return 16;
        }
    }

    public static boolean d(long j17) {
        if (f138376b == null) {
            f138376b = java.lang.Boolean.valueOf(c01.e2.a0());
        }
        if (f138376b.booleanValue()) {
            return ((java.util.HashSet) f138375a).contains(java.lang.Long.valueOf(j17));
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x002c. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void e(u13.g r37, g23.e r38) {
        /*
            Method dump skipped, instructions count: 1526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.fts.ui.x2.e(u13.g, g23.e):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:167:0x0084. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x060b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0625  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0650  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0637  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x040a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void f(u13.g r25, g23.k r26) {
        /*
            Method dump skipped, instructions count: 1676
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.fts.ui.x2.f(u13.g, g23.k):void");
    }

    public static void g(int i17, int i18, int i19, java.lang.String str, java.lang.String str2, java.lang.String str3, long j17, long j18) {
        com.tencent.mm.autogen.mmdata.rpt.FTSVoiceSearchReportInfoStruct fTSVoiceSearchReportInfoStruct = new com.tencent.mm.autogen.mmdata.rpt.FTSVoiceSearchReportInfoStruct();
        fTSVoiceSearchReportInfoStruct.f56148d = fTSVoiceSearchReportInfoStruct.b("sessionid", java.lang.String.valueOf(j17), true);
        fTSVoiceSearchReportInfoStruct.f56149e = fTSVoiceSearchReportInfoStruct.b("searchid", java.lang.String.valueOf(j18), true);
        fTSVoiceSearchReportInfoStruct.f56161q = fTSVoiceSearchReportInfoStruct.b("gestureid", str3, true);
        fTSVoiceSearchReportInfoStruct.f56152h = java.util.Calendar.getInstance().getTimeInMillis();
        fTSVoiceSearchReportInfoStruct.f56159o = c01.id.c();
        fTSVoiceSearchReportInfoStruct.f56153i = i17;
        fTSVoiceSearchReportInfoStruct.f56158n = fTSVoiceSearchReportInfoStruct.b("extinfo", str, true);
        fTSVoiceSearchReportInfoStruct.f56156l = i18;
        fTSVoiceSearchReportInfoStruct.f56157m = i19;
        fTSVoiceSearchReportInfoStruct.f56160p = fTSVoiceSearchReportInfoStruct.b("query", str2, true);
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSReportLogic", "report36992 action=%d, scene=%d, sceneType=%d, extInfo=%s, query=%s, gestureId=%s, sessionId=%d, searchId=%d, sysTimestamp=%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str, str2, str3, java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        fTSVoiceSearchReportInfoStruct.k();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0030, code lost:
    
        if (com.tencent.mm.storage.z3.o4(((e23.m0) r7).f246896s) != false) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(u13.g r7, int r8, boolean r9) {
        /*
            int r0 = r7.f423769l
            r1 = 65536(0x10000, float:9.1835E-41)
            if (r0 == r1) goto L7
            return
        L7:
            int r0 = r7.f423763f
            r1 = 4
            r2 = 1
            r3 = 6
            r4 = 2
            r5 = 5
            if (r0 == r2) goto L23
            if (r0 == r4) goto L23
            r6 = 3
            if (r0 == r6) goto L23
            if (r0 == r1) goto L23
            if (r0 == r5) goto L1a
            return
        L1a:
            if (r8 != r2) goto L1e
            r0 = r3
            goto L23
        L1e:
            if (r8 != r4) goto L22
            r0 = r5
            goto L23
        L22:
            return
        L23:
            boolean r8 = r7 instanceof e23.m0
            if (r8 == 0) goto L33
            r8 = r7
            e23.m0 r8 = (e23.m0) r8
            java.lang.String r8 = r8.f246896s
            boolean r8 = com.tencent.mm.storage.z3.o4(r8)
            if (r8 == 0) goto L65
            goto L67
        L33:
            r8 = r7
            e23.p0 r8 = (e23.p0) r8
            java.lang.String r8 = r8.f246927s
            boolean r2 = com.tencent.mm.storage.z3.R4(r8)
            if (r2 == 0) goto L40
            r1 = r4
            goto L68
        L40:
            boolean r2 = com.tencent.mm.storage.z3.m4(r8)
            if (r2 == 0) goto L47
            goto L68
        L47:
            boolean r1 = com.tencent.mm.storage.z3.p4(r8)
            if (r1 != 0) goto L67
            boolean r1 = com.tencent.mm.storage.z3.o4(r8)
            if (r1 == 0) goto L54
            goto L67
        L54:
            boolean r1 = com.tencent.mm.storage.z3.z3(r8)
            if (r1 != 0) goto L65
            java.lang.String r1 = "appbrandcustomerservicemsg"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L63
            goto L65
        L63:
            r1 = 7
            goto L68
        L65:
            r1 = r3
            goto L68
        L67:
            r1 = r5
        L68:
            com.tencent.mm.autogen.mmdata.rpt.GlobalMsgSearchResultClickStruct r8 = new com.tencent.mm.autogen.mmdata.rpt.GlobalMsgSearchResultClickStruct
            r8.<init>()
            int r7 = r7.h()
            long r2 = (long) r7
            r8.f58363d = r2
            long r2 = (long) r0
            r8.f58364e = r2
            long r0 = (long) r1
            r8.f58366g = r0
            if (r9 == 0) goto L7f
            r0 = 1
            goto L81
        L7f:
            r0 = 0
        L81:
            r8.f58365f = r0
            r8.o()
            r8.k()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.fts.ui.x2.h(u13.g, int, boolean):void");
    }

    public static void i(g23.k kVar) {
        java.lang.String str = kVar.f267936a;
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        java.lang.String format = java.lang.String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%d,%s,%s", str, 3, 1, java.lang.Integer.valueOf(kVar.f267939d), java.lang.Integer.valueOf(kVar.f267943h), java.lang.Integer.valueOf(kVar.f267953r), 0, 0, java.lang.Long.valueOf(o13.p.f342250c), java.lang.Integer.valueOf(kVar.f267941f), java.lang.Integer.valueOf(kVar.f267948m), 0, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), 0, java.lang.Long.valueOf(o13.p.f342250c));
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSReportLogic", "reportKvQuery %d %s", 16050, format);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(16050, format);
    }

    public static void j(int i17, long j17) {
        if (i17 == 0 || i17 == 3 || i17 == 6 || i17 == 9 || i17 == 12) {
            com.tencent.mars.smc.IDKey iDKey = new com.tencent.mars.smc.IDKey();
            iDKey.SetID(79);
            iDKey.SetKey(i17 + 1);
            iDKey.SetValue((int) j17);
            com.tencent.mars.smc.IDKey iDKey2 = new com.tencent.mars.smc.IDKey();
            iDKey2.SetID(79);
            iDKey2.SetKey(i17 + 2);
            iDKey2.SetValue(1L);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(iDKey);
            arrayList.add(iDKey2);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.j(arrayList, false, false);
        }
    }

    public static void k(g23.e eVar) {
        java.lang.String str;
        java.lang.String str2;
        int i17;
        int i18;
        int i19;
        if (com.tencent.mm.sdk.platformtools.t8.K0(eVar.f267903e)) {
            return;
        }
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_wanet_search, 0);
        long j17 = eVar.f267899a - eVar.f267900b;
        if (j17 < 0) {
            j17 = 0;
        }
        if (eVar.f267905g == -32) {
            str = "40#";
            str2 = "40#" + eVar.f267901c;
        } else {
            str = "36#";
            str2 = "36#" + eVar.f267901c;
        }
        com.tencent.mm.autogen.mmdata.rpt.UniverSearchExposeStruct univerSearchExposeStruct = new com.tencent.mm.autogen.mmdata.rpt.UniverSearchExposeStruct();
        univerSearchExposeStruct.f61397d = eVar.f267902d;
        univerSearchExposeStruct.f61398e = o13.p.f342250c;
        univerSearchExposeStruct.f61399f = univerSearchExposeStruct.b("Query", eVar.f267903e, true);
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        java.util.Iterator it = ((java.util.ArrayList) eVar.f267907i).iterator();
        while (it.hasNext()) {
            p13.e eVar2 = (p13.e) it.next();
            if (eVar2.f351075c != 0 && (i17 = eVar2.f351074b) != Integer.MAX_VALUE) {
                stringBuffer.append(i17);
                stringBuffer.append("#");
                stringBuffer.append(eVar2.f351075c);
                stringBuffer.append("#");
                stringBuffer.append(eVar2.f351077e);
                stringBuffer.append("#");
                stringBuffer.append(eVar2.f351078f);
                stringBuffer.append("#");
                if (!lj.f.f(eVar2.f351082j) && ((i18 = eVar2.f351075c) == 31 || (i19 = eVar2.f351080h) == 31 || i18 == 19 || i19 == 19 || i18 == 5 || i19 == 5 || i18 == 2 || i18 == 36 || i18 == 40)) {
                    stringBuffer.append(eVar2.f351082j);
                }
                stringBuffer.append("#");
                stringBuffer.append(eVar2.f351083k);
                stringBuffer.append("#");
                stringBuffer.append(eVar2.f351084l);
                stringBuffer.append("#");
                stringBuffer.append(eVar2.f351073a);
                stringBuffer.append("#");
                if (eVar2.f351075c == 36) {
                    stringBuffer.append(2);
                } else {
                    stringBuffer.append(eVar2.f351076d);
                }
                stringBuffer.append("|");
            }
        }
        univerSearchExposeStruct.f61400g = univerSearchExposeStruct.b("ExposeItems", stringBuffer.toString(), true);
        univerSearchExposeStruct.f61401h = 2;
        univerSearchExposeStruct.f61402i = 1;
        univerSearchExposeStruct.f61403j = univerSearchExposeStruct.b("ClickType", str, true);
        univerSearchExposeStruct.f61404k = univerSearchExposeStruct.b("ModuleRes", str2, true);
        univerSearchExposeStruct.f61405l = j17;
        univerSearchExposeStruct.f61406m = Ni;
        univerSearchExposeStruct.f61407n = 2L;
        univerSearchExposeStruct.f61412s = eVar.f267902d;
        univerSearchExposeStruct.f61413t = o13.p.f342250c;
        univerSearchExposeStruct.f61414u = java.lang.System.currentTimeMillis();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[");
        java.util.List list = eVar.f267906h;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        java.util.Iterator it6 = ((java.util.ArrayList) list).iterator();
        if (it6.hasNext()) {
            while (true) {
                sb7.append((java.lang.CharSequence) it6.next());
                if (!it6.hasNext()) {
                    break;
                } else {
                    sb7.append((java.lang.CharSequence) ";");
                }
            }
        }
        sb6.append(sb7.toString());
        sb6.append("]");
        univerSearchExposeStruct.f61415v = univerSearchExposeStruct.b("weshopBuffer", sb6.toString(), true);
        univerSearchExposeStruct.f61416w = 2L;
        univerSearchExposeStruct.f61417x = univerSearchExposeStruct.b("extInfo", eVar.f267904f, true);
        univerSearchExposeStruct.k();
    }

    public static void l(g23.k kVar) {
        java.lang.String str;
        int i17;
        int i18;
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_wanet_search, 0);
        long j17 = kVar.f267938c - kVar.f267937b;
        if (j17 < 0) {
            j17 = 0;
        }
        com.tencent.mm.autogen.mmdata.rpt.UniverSearchExposeStruct univerSearchExposeStruct = new com.tencent.mm.autogen.mmdata.rpt.UniverSearchExposeStruct();
        univerSearchExposeStruct.f61397d = kVar.B;
        univerSearchExposeStruct.f61398e = o13.p.f342250c;
        univerSearchExposeStruct.f61399f = univerSearchExposeStruct.b("Query", kVar.f267936a, true);
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        java.util.ArrayList arrayList = (java.util.ArrayList) kVar.N;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            p13.e eVar = (p13.e) it.next();
            kVar.c(eVar.f351074b);
            java.lang.String str2 = eVar.f351079g;
            if (eVar.f351075c != 0 && eVar.f351074b != Integer.MAX_VALUE) {
                if (str2.startsWith("SOSRelevant:") || eVar.f351079g.startsWith("SOSItemRelevant:")) {
                    int c17 = kVar.c(eVar.f351074b) + eVar.f351073a;
                    if (eVar.f351074b == 0) {
                        c17++;
                    }
                    if (eVar.f351079g.startsWith("SOSRelevant:") && (kVar.f267955t > 0 || kVar.f267956u > 0)) {
                        c17++;
                    }
                    stringBuffer.append(c17);
                } else if (eVar.f351075c == 40) {
                    stringBuffer.append(kVar.c(eVar.f351074b) - 1);
                } else {
                    stringBuffer.append(kVar.c(eVar.f351074b));
                }
                stringBuffer.append("#");
                stringBuffer.append(eVar.f351075c);
                stringBuffer.append("#");
                stringBuffer.append(eVar.f351077e);
                stringBuffer.append("#");
                stringBuffer.append(eVar.f351078f);
                stringBuffer.append("#");
                if (!lj.f.f(eVar.f351082j) && ((i17 = eVar.f351075c) == 31 || (i18 = eVar.f351080h) == 31 || i17 == 19 || i18 == 19 || i17 == 5 || i18 == 5 || i17 == 2 || i17 == 36 || i17 == 40)) {
                    stringBuffer.append(eVar.f351082j);
                }
                stringBuffer.append("#");
                stringBuffer.append(eVar.f351083k);
                stringBuffer.append("#");
                stringBuffer.append(eVar.f351084l);
                stringBuffer.append("#");
                stringBuffer.append(eVar.f351073a);
                stringBuffer.append("#");
                stringBuffer.append(eVar.f351076d);
                stringBuffer.append("|");
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSSearchStaticsObj", "getExposeItemsStr, " + stringBuffer.toString());
        univerSearchExposeStruct.f61400g = univerSearchExposeStruct.b("ExposeItems", stringBuffer.toString(), true);
        univerSearchExposeStruct.f61401h = kVar.C ? 2 : 1;
        univerSearchExposeStruct.f61402i = kVar.D > 0 ? 1 : 0;
        java.lang.StringBuffer stringBuffer2 = new java.lang.StringBuffer();
        java.util.Iterator it6 = ((java.util.ArrayList) kVar.E).iterator();
        while (it6.hasNext()) {
            stringBuffer2.append(((java.lang.Integer) it6.next()).intValue());
            stringBuffer2.append("#");
        }
        univerSearchExposeStruct.f61403j = univerSearchExposeStruct.b("ClickType", stringBuffer2.toString(), true);
        java.lang.StringBuffer stringBuffer3 = new java.lang.StringBuffer();
        if (kVar.f267939d > 0) {
            stringBuffer3.append("2#");
            stringBuffer3.append(kVar.f267939d);
            stringBuffer3.append("|");
        }
        if (kVar.f267940e > 0) {
            stringBuffer3.append("3#");
            stringBuffer3.append(kVar.f267940e);
            stringBuffer3.append("|");
        }
        if (kVar.f267941f > 0) {
            stringBuffer3.append("4#");
            stringBuffer3.append(kVar.f267941f);
            stringBuffer3.append("|");
        }
        if (kVar.f267942g > 0) {
            stringBuffer3.append("20#");
            stringBuffer3.append(kVar.f267942g);
            stringBuffer3.append("|");
        }
        if (kVar.f267943h > 0) {
            stringBuffer3.append("5#");
            stringBuffer3.append(kVar.f267943h);
            stringBuffer3.append("|");
        }
        if (kVar.f267948m > 0) {
            stringBuffer3.append("11#");
            stringBuffer3.append(kVar.f267948m);
            stringBuffer3.append("|");
        }
        if (kVar.f267949n > 0) {
            stringBuffer3.append("22#");
            stringBuffer3.append(kVar.f267949n);
            stringBuffer3.append("|");
        }
        if (kVar.f267950o > 0) {
            stringBuffer3.append("10#");
            stringBuffer3.append(kVar.f267950o);
            stringBuffer3.append("|");
        }
        if (kVar.f267953r > 0) {
            stringBuffer3.append("19#");
            stringBuffer3.append(kVar.f267953r);
            stringBuffer3.append("|");
        }
        if (kVar.f267951p > 0) {
            stringBuffer3.append("12#");
            stringBuffer3.append(kVar.f267951p);
            stringBuffer3.append("|");
        }
        if (kVar.f267946k > 0) {
            stringBuffer3.append("31#");
            stringBuffer3.append(kVar.f267946k);
            stringBuffer3.append("|");
        }
        if (kVar.f267958w > 0) {
            stringBuffer3.append("23#");
            stringBuffer3.append(kVar.f267958w);
            stringBuffer3.append("|");
        }
        if (kVar.f267957v > 0) {
            stringBuffer3.append("32#");
            stringBuffer3.append(kVar.f267957v);
            stringBuffer3.append("|");
        }
        if (kVar.f267955t > 0) {
            stringBuffer3.append("8#");
            stringBuffer3.append(kVar.f267955t);
            stringBuffer3.append("|");
        }
        if (kVar.f267956u > 0) {
            stringBuffer3.append("9#");
            stringBuffer3.append(kVar.f267956u);
            stringBuffer3.append("|");
        }
        if (kVar.f267944i > 0) {
            stringBuffer3.append("33#");
            stringBuffer3.append(kVar.f267944i);
            stringBuffer3.append("|");
        }
        java.util.ArrayList arrayList2 = (java.util.ArrayList) kVar.M;
        if (!arrayList2.isEmpty()) {
            stringBuffer3.append("36#");
            stringBuffer3.append(arrayList2.size());
            stringBuffer3.append("|");
        }
        if (kVar.f267959x > 0) {
            stringBuffer3.append("40#");
            stringBuffer3.append(kVar.f267959x);
            stringBuffer3.append("|");
        }
        univerSearchExposeStruct.f61404k = univerSearchExposeStruct.b("ModuleRes", stringBuffer3.toString(), true);
        univerSearchExposeStruct.f61405l = j17;
        univerSearchExposeStruct.f61406m = Ni;
        univerSearchExposeStruct.f61407n = kVar.f267961z;
        java.lang.StringBuffer stringBuffer4 = new java.lang.StringBuffer();
        java.util.Iterator it7 = arrayList.iterator();
        while (it7.hasNext()) {
            p13.e eVar2 = (p13.e) it7.next();
            if (eVar2.f351075c != 0 && eVar2.f351080h != 0) {
                stringBuffer4.append(eVar2.f351074b);
                stringBuffer4.append("#");
                stringBuffer4.append(eVar2.f351075c);
                stringBuffer4.append("#");
                stringBuffer4.append(eVar2.f351080h);
                stringBuffer4.append("|");
            }
        }
        univerSearchExposeStruct.f61408o = univerSearchExposeStruct.b("ExposeSubItems", stringBuffer4.toString(), true);
        java.util.Iterator it8 = arrayList.iterator();
        while (true) {
            if (!it8.hasNext()) {
                str = "";
                break;
            }
            p13.e eVar3 = (p13.e) it8.next();
            if (eVar3.f351075c == 27) {
                str = eVar3.f351081i;
                break;
            }
        }
        univerSearchExposeStruct.f61409p = univerSearchExposeStruct.b("strDocId", str, true);
        univerSearchExposeStruct.f61412s = kVar.B;
        univerSearchExposeStruct.f61413t = o13.p.f342250c;
        univerSearchExposeStruct.f61414u = java.lang.System.currentTimeMillis();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[");
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        java.util.Iterator it9 = arrayList2.iterator();
        if (it9.hasNext()) {
            while (true) {
                sb7.append((java.lang.CharSequence) it9.next());
                if (!it9.hasNext()) {
                    break;
                } else {
                    sb7.append((java.lang.CharSequence) ";");
                }
            }
        }
        sb6.append(sb7.toString());
        sb6.append(']');
        univerSearchExposeStruct.f61415v = univerSearchExposeStruct.b("weshopBuffer", sb6.toString(), true);
        univerSearchExposeStruct.f61416w = 1L;
        univerSearchExposeStruct.f61417x = univerSearchExposeStruct.b("extInfo", kVar.L, true);
        univerSearchExposeStruct.k();
    }

    public static void m(java.lang.String str, boolean z17, int i17, int i18) {
        n(str, z17, i17, i18, new g23.k());
    }

    public static void n(java.lang.String str, boolean z17, int i17, int i18, g23.k kVar) {
        int i19 = 2;
        int i27 = z17 ? 3 : i17 > 0 ? 2 : 1;
        if (i18 != -15 && i18 != -5 && i18 != -4 && i18 != -3 && i18 != -2 && i18 != -1) {
            i19 = i18 != 0 ? 0 : 1;
        }
        java.lang.String format = java.lang.String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%d,%s,%s,%s", str, java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(kVar.f267939d), java.lang.Integer.valueOf(kVar.f267943h), java.lang.Integer.valueOf(kVar.f267953r), 0, 0, java.lang.Long.valueOf(o13.p.f342250c), java.lang.Integer.valueOf(kVar.f267941f), java.lang.Integer.valueOf(kVar.f267948m), 0, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), 0, java.lang.Long.valueOf(o13.p.f342250c), java.lang.Long.valueOf(kVar.B));
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSReportLogic", "reportKvQuery %d %s", 11062, format);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(11062, format);
    }
}
