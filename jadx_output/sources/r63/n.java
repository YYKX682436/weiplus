package r63;

/* loaded from: classes15.dex */
public final class n extends vp1.c {

    /* renamed from: c, reason: collision with root package name */
    public static boolean f393044c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f393045d;

    /* renamed from: h, reason: collision with root package name */
    public static java.lang.Boolean f393049h;

    /* renamed from: i, reason: collision with root package name */
    public static int f393050i;

    /* renamed from: k, reason: collision with root package name */
    public static java.lang.Boolean f393052k;

    /* renamed from: a, reason: collision with root package name */
    public static final r63.n f393042a = new r63.n();

    /* renamed from: b, reason: collision with root package name */
    public static final r63.p f393043b = new r63.p();

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.Boolean f393046e = java.lang.Boolean.TRUE;

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.List f393047f = new java.util.ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.Map f393048g = new java.util.LinkedHashMap();

    /* renamed from: j, reason: collision with root package name */
    public static final java.util.Map f393051j = new java.util.LinkedHashMap();

    @Override // up1.a
    public void A(r45.f83 activityRecord, r45.g83 fragmentRecord, android.content.Intent intent, long j17) {
        kotlin.jvm.internal.o.g(activityRecord, "activityRecord");
        kotlin.jvm.internal.o.g(fragmentRecord, "fragmentRecord");
        r63.l lVar = r63.l.f393022a;
        int hashCode = fragmentRecord.hashCode();
        r63.l.f393024c.remove(java.lang.Integer.valueOf(hashCode));
        r63.l.f393025d.remove(java.lang.Integer.valueOf(hashCode));
    }

    @Override // up1.a
    public void C(r45.f83 activityRecord, android.content.Intent intent, long j17) {
        kotlin.jvm.internal.o.g(activityRecord, "activityRecord");
        o63.i iVar = o63.i.f343202a;
        java.lang.String a17 = bm5.f1.a();
        kotlin.jvm.internal.o.f(a17, "getProcessName(...)");
        r45.ld6 b17 = iVar.b(a17);
        if (b17 != null && kotlin.jvm.internal.o.b(b17.f379330e.f374085d, activityRecord.f374085d)) {
            java.lang.String a18 = bm5.f1.a();
            kotlin.jvm.internal.o.f(a18, "getProcessName(...)");
            iVar.c(a18);
            com.tencent.mars.xlog.Log.i("MicroMsg.FinderStayTimeMonitor", "stopActivity " + activityRecord.f374086e + " stop process = " + bm5.f1.a() + " remove info");
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderStayTimeMonitor", "onActivityStop " + activityRecord.f374086e + " process = " + bm5.f1.a());
    }

    @Override // up1.a
    public void D(r45.f83 activityRecord, r45.g83 fragmentRecord, android.content.Intent intent, long j17) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(activityRecord, "activityRecord");
        kotlin.jvm.internal.o.g(fragmentRecord, "fragmentRecord");
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderStayTimeMonitor", activityRecord.f374086e + " : " + fragmentRecord.f374980e + " : " + fragmentRecord.f374985m + " onPause");
        p63.b bVar = p63.b.f352437a;
        int i17 = activityRecord.f374090i;
        int i18 = fragmentRecord.f374982g;
        java.lang.String fragmentSimpleName = fragmentRecord.f374980e;
        kotlin.jvm.internal.o.f(fragmentSimpleName, "fragmentSimpleName");
        bVar.d(i17, i18, fragmentSimpleName, j17);
        switch (activityRecord.f374091m) {
            case 1:
                str = "on_create";
                break;
            case 2:
                str = "on_start";
                break;
            case 3:
                str = "on_resume";
                break;
            case 4:
                str = "on_pause";
                break;
            case 5:
                str = "on_stop";
                break;
            case 6:
                str = "on_destroy";
                break;
            case 7:
                str = "on_new_intent";
                break;
            case 8:
                str = "on_save_state";
                break;
            case 9:
                str = "on_finish";
                break;
            case 10:
                str = "on_move_to_back";
                break;
            default:
                str = null;
                break;
        }
        if (kotlin.jvm.internal.o.b(str, "on_resume")) {
            l(activityRecord, fragmentRecord, j17, false);
        }
    }

    @Override // up1.a
    public void E(java.util.List activityRecordList, boolean z17) {
        kotlin.jvm.internal.o.g(activityRecordList, "activityRecordList");
        r63.l lVar = r63.l.f393022a;
        java.util.Iterator it = activityRecordList.iterator();
        while (it.hasNext()) {
            r45.f83 f83Var = (r45.f83) it.next();
            if (!z17) {
                r63.l.f393024c.put(java.lang.Integer.valueOf(f83Var.f374089h), java.lang.Integer.valueOf(f83Var.f374097s));
            } else if (f83Var.f374098t > f83Var.f374099u) {
                r63.l.f393026e.add(java.lang.Integer.valueOf(f83Var.f374089h));
                f83Var.f374098t = 0;
                f83Var.f374099u = 0;
            }
        }
    }

    @Override // up1.a
    public void F(r45.f83 activityRecord, android.content.Intent intent, long j17) {
        kotlin.jvm.internal.o.g(activityRecord, "activityRecord");
        r(false, activityRecord, j17);
    }

    public final void a(int i17, java.lang.String pageName, java.lang.String pageSimpleName, int i18, boolean z17, long j17, boolean z18, android.content.Intent intent) {
        p63.b bVar = p63.b.f352437a;
        kotlin.jvm.internal.o.g(pageName, "pageName");
        kotlin.jvm.internal.o.g(pageSimpleName, "pageSimpleName");
        if (bVar.c()) {
            java.lang.String b17 = bVar.b(intent, z18);
            com.tencent.wechat.aff.data_report.j a17 = bVar.a();
            if (a17 != null) {
                com.tencent.wechat.aff.data_report.k kVar = new com.tencent.wechat.aff.data_report.k();
                kVar.f216616d = pageSimpleName;
                kVar.f216618f = i18;
                kVar.f216619g = i17;
                kVar.f216620h = j17;
                kVar.f216621i = com.tencent.wechat.aff.data_report.i.SESSION_OUT;
                kVar.f216622m = b17;
                a17.g(kVar);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AffFinderReport", "onPushStack: taskId: " + i17 + ", pageName: " + pageName + ", pageSimpleName: " + pageSimpleName + ", pageHC: " + i18 + ", isFragment: " + z17 + ", timestamp: " + j17 + ", isInFinderHomeTask: " + z18 + ", intent: " + intent);
        }
        v(z18);
    }

    public final void b(int i17, int i18, java.lang.String targetPageName, java.lang.String targetSimpleName, boolean z17, long j17, android.content.Intent intent) {
        java.lang.String str;
        boolean n17 = com.tencent.mm.sdk.platformtools.x2.n();
        r63.n nVar = f393042a;
        if (n17 || f393044c) {
            p63.b bVar = p63.b.f352437a;
            boolean p17 = p();
            kotlin.jvm.internal.o.g(targetPageName, "targetPageName");
            kotlin.jvm.internal.o.g(targetSimpleName, "targetSimpleName");
            if (bVar.c()) {
                java.lang.String b17 = bVar.b(intent, p17);
                if (com.tencent.mm.sdk.platformtools.x2.n()) {
                    com.tencent.wechat.aff.data_report.j a17 = bVar.a();
                    if (a17 != null) {
                        com.tencent.wechat.aff.data_report.k kVar = new com.tencent.wechat.aff.data_report.k();
                        kVar.f216616d = targetSimpleName;
                        kVar.f216618f = i18;
                        kVar.f216620h = j17;
                        java.util.Map map = o63.h.f343200a;
                        o63.f fVar = (o63.f) o63.h.f343200a.get(targetPageName);
                        kVar.f216621i = fVar != null ? fVar.f343198b : false ? com.tencent.wechat.aff.data_report.i.PAGE_OUT : com.tencent.wechat.aff.data_report.i.DEFAULT;
                        kVar.f216622m = b17;
                        kVar.f216619g = i17;
                        r63.l lVar = r63.l.f393022a;
                        kVar.f216623n = r63.l.f393033l ? r63.l.f393023b : 0;
                        kVar.f216624o = nVar.p() ? r63.l.f393027f : 0;
                        kVar.f216626q = r63.l.f393029h;
                        kVar.f216625p = nVar.p();
                        a17.d(kVar);
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.AffFinderReport", "onPageAppear: taskId: " + i17 + ", targetPageHC: " + i18 + ", targetPageName: " + targetPageName + ", targetSimpleName: " + targetSimpleName + ", timestamp: " + j17 + ", isInFinderHomeTask: " + p17 + ", intent: " + intent);
                } else {
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.w9.f193053a;
                    android.os.Bundle bundle = new android.os.Bundle();
                    r45.a6 a6Var = new r45.a6();
                    a6Var.f369748d = targetSimpleName;
                    a6Var.f369755n = targetPageName;
                    a6Var.f369750f = i18;
                    a6Var.f369752h = j17;
                    a6Var.f369753i = b17;
                    a6Var.f369751g = i17;
                    a6Var.f369754m = true;
                    bundle.putByteArray("finderReportAffFinderTask", a6Var.toByteArray());
                    com.tencent.mm.ipcinvoker.d0.f(str2, bundle, p63.a.class);
                }
            }
        }
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            return;
        }
        r45.co2 co2Var = new r45.co2();
        co2Var.f371685d = targetPageName;
        co2Var.f371692n = i18;
        co2Var.f371686e = j17;
        r63.l lVar2 = r63.l.f393022a;
        co2Var.f371688g = r63.l.f393033l ? r63.l.f393023b : 0;
        co2Var.f371693o = z17;
        o63.g[] gVarArr = o63.g.f343199d;
        co2Var.f371690i = 0;
        if (intent == null || (str = intent.getStringExtra("finder_extraInfo_key")) == null) {
            str = "";
        }
        co2Var.f371695q = str;
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String b18 = b52.b.b();
        if (b18 == null) {
            b18 = "";
        }
        co2Var.f371696r = b18;
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String c17 = b52.b.c();
        co2Var.f371697s = c17 != null ? c17 : "";
        co2Var.f371694p = targetSimpleName;
        co2Var.f371698t = nVar.p();
        co2Var.f371699u = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        co2Var.f371700v = v52.c.g().e();
        co2Var.f371701w = false;
        ((java.util.ArrayList) f393047f).add(co2Var);
    }

    @Override // up1.a
    public void d(r45.f83 activityRecord, android.content.Intent intent, long j17) {
        kotlin.jvm.internal.o.g(activityRecord, "activityRecord");
        java.lang.String activitySimpleName = activityRecord.f374086e;
        kotlin.jvm.internal.o.f(activitySimpleName, "activitySimpleName");
        if (kotlin.jvm.internal.o.b("FinderHomeAffinityUI", activitySimpleName)) {
            f393050i = activityRecord.f374089h;
        }
        java.util.Map map = o63.h.f343200a;
        java.lang.String activityName = activityRecord.f374085d;
        kotlin.jvm.internal.o.f(activityName, "activityName");
        o63.f fVar = (o63.f) o63.h.f343200a.get(activityName);
        if (fVar != null ? fVar.f343197a : false) {
            int i17 = activityRecord.f374090i;
            java.lang.String activityName2 = activityRecord.f374085d;
            kotlin.jvm.internal.o.f(activityName2, "activityName");
            java.lang.String activitySimpleName2 = activityRecord.f374086e;
            kotlin.jvm.internal.o.f(activitySimpleName2, "activitySimpleName");
            int i18 = activityRecord.f374089h;
            java.lang.String baseActivityName = activityRecord.f374096r;
            kotlin.jvm.internal.o.f(baseActivityName, "baseActivityName");
            java.lang.String activityName3 = activityRecord.f374085d;
            kotlin.jvm.internal.o.f(activityName3, "activityName");
            a(i17, activityName2, activitySimpleName2, i18, false, j17, kotlin.jvm.internal.o.b("com.tencent.mm.plugin.finder.ui.FinderHomeAffinityUI", baseActivityName) || kotlin.jvm.internal.o.b("com.tencent.mm.plugin.finder.ui.FinderHomeAffinityUI", activityName3), intent);
        }
        u(activityRecord.f374089h, false);
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderStayTimeMonitor", activityRecord.f374086e + " in stack");
    }

    @Override // up1.a
    public void e(r45.f83 activityRecord, android.content.Intent intent, long j17) {
        kotlin.jvm.internal.o.g(activityRecord, "activityRecord");
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderStayTimeMonitor", "onActivityPause " + activityRecord.f374086e + " process = " + bm5.f1.a());
        p63.b bVar = p63.b.f352437a;
        int i17 = activityRecord.f374090i;
        int i18 = activityRecord.f374089h;
        java.lang.String activitySimpleName = activityRecord.f374086e;
        kotlin.jvm.internal.o.f(activitySimpleName, "activitySimpleName");
        bVar.d(i17, i18, activitySimpleName, j17);
    }

    @Override // up1.a
    public void f(r45.f83 activityRecord, r45.g83 fragmentRecord, android.content.Intent intent, long j17) {
        r63.n nVar;
        boolean z17;
        java.lang.String str;
        java.lang.String str2;
        kotlin.jvm.internal.o.g(activityRecord, "activityRecord");
        kotlin.jvm.internal.o.g(fragmentRecord, "fragmentRecord");
        r63.l.f393024c.put(java.lang.Integer.valueOf(fragmentRecord.f374982g), java.lang.Integer.valueOf(fragmentRecord.f374990r));
        java.lang.String str3 = !kotlin.jvm.internal.o.b("", fragmentRecord.f374984i) ? fragmentRecord.f374984i : fragmentRecord.f374979d;
        java.lang.String str4 = !kotlin.jvm.internal.o.b("", fragmentRecord.f374984i) ? fragmentRecord.f374985m : fragmentRecord.f374980e;
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderStayTimeMonitor", activityRecord.f374086e + " : " + str3 + " : " + str4 + " onResume");
        java.lang.String baseActivityName = activityRecord.f374096r;
        kotlin.jvm.internal.o.f(baseActivityName, "baseActivityName");
        java.lang.String activityName = activityRecord.f374085d;
        kotlin.jvm.internal.o.f(activityName, "activityName");
        boolean z18 = false;
        if (kotlin.jvm.internal.o.b("com.tencent.mm.plugin.finder.ui.FinderHomeAffinityUI", baseActivityName) || kotlin.jvm.internal.o.b("com.tencent.mm.plugin.finder.ui.FinderHomeAffinityUI", activityName)) {
            nVar = this;
            z17 = true;
        } else {
            nVar = this;
            z17 = false;
        }
        nVar.v(z17);
        l(activityRecord, fragmentRecord, j17, true);
        java.util.Map map = o63.h.f343200a;
        kotlin.jvm.internal.o.d(str3);
        o63.f fVar = (o63.f) o63.h.f343200a.get(str3);
        if ((fVar != null ? fVar.f343197a : false) && fragmentRecord.f374989q == 0) {
            java.util.Map map2 = f393051j;
            if (!map2.containsKey(java.lang.Integer.valueOf(activityRecord.f374089h))) {
                map2.put(java.lang.Integer.valueOf(activityRecord.f374089h), new java.util.ArrayList());
            }
            java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) map2;
            java.util.List list = (java.util.List) linkedHashMap.get(java.lang.Integer.valueOf(activityRecord.f374089h));
            if (list != null) {
                list.add(fragmentRecord);
            }
            int i17 = activityRecord.f374090i;
            kotlin.jvm.internal.o.d(str4);
            int i18 = fragmentRecord.f374982g;
            java.lang.String baseActivityName2 = activityRecord.f374096r;
            kotlin.jvm.internal.o.f(baseActivityName2, "baseActivityName");
            java.lang.String activityName2 = activityRecord.f374085d;
            kotlin.jvm.internal.o.f(activityName2, "activityName");
            boolean z19 = kotlin.jvm.internal.o.b("com.tencent.mm.plugin.finder.ui.FinderHomeAffinityUI", baseActivityName2) || kotlin.jvm.internal.o.b("com.tencent.mm.plugin.finder.ui.FinderHomeAffinityUI", activityName2);
            str = str3;
            str2 = str4;
            a(i17, str3, str4, i18, true, j17, z19, intent);
            java.util.List list2 = (java.util.List) linkedHashMap.get(java.lang.Integer.valueOf(activityRecord.f374089h));
            if (list2 != null && list2.isEmpty()) {
                z18 = true;
            }
            if (z18) {
                map2.remove(java.lang.Integer.valueOf(activityRecord.f374089h));
            }
        } else {
            str = str3;
            str2 = str4;
        }
        int i19 = activityRecord.f374090i;
        int i27 = fragmentRecord.f374982g;
        kotlin.jvm.internal.o.d(str2);
        b(i19, i27, str, str2, true, j17, intent);
    }

    @Override // up1.a
    public void g(r45.f83 activityRecord, android.content.Intent intent, long j17) {
        kotlin.jvm.internal.o.g(activityRecord, "activityRecord");
        if (!com.tencent.mm.sdk.platformtools.x2.n()) {
            o63.i iVar = o63.i.f343202a;
            java.lang.String str = com.tencent.mm.sdk.platformtools.x2.f193072b;
            kotlin.jvm.internal.o.f(str, "getMainProcessName(...)");
            f393044c = iVar.b(str) != null;
        }
        java.lang.String baseActivityName = activityRecord.f374096r;
        kotlin.jvm.internal.o.f(baseActivityName, "baseActivityName");
        java.lang.String activityName = activityRecord.f374085d;
        kotlin.jvm.internal.o.f(activityName, "activityName");
        v(kotlin.jvm.internal.o.b("com.tencent.mm.plugin.finder.ui.FinderHomeAffinityUI", baseActivityName) || kotlin.jvm.internal.o.b("com.tencent.mm.plugin.finder.ui.FinderHomeAffinityUI", activityName));
        r63.l lVar = r63.l.f393022a;
        if (!kotlin.jvm.internal.o.b(r63.l.f393035n, "")) {
            o63.e[] eVarArr = o63.e.f343196d;
            activityRecord.f374097s = 7;
        }
        r63.l.f393024c.put(java.lang.Integer.valueOf(activityRecord.f374089h), java.lang.Integer.valueOf(activityRecord.f374097s));
        lVar.b(activityRecord.f374089h, activityRecord.f374097s);
        if (activityRecord.f374098t > activityRecord.f374099u) {
            r63.l.f393026e.add(java.lang.Integer.valueOf(activityRecord.f374089h));
            activityRecord.f374098t = 0;
            activityRecord.f374099u = 0;
        }
        r63.n nVar = f393042a;
        if (nVar.p()) {
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            java.lang.String str2 = activityRecord.f374086e;
            r63.j jVar = r63.j.f393020a;
            if (((cy1.a) rVar).oj()) {
                sz1.i.b(new cy1.a$$e(str2, jVar));
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.FinderPageEnterMonitor", "onActivityResume name : " + activityRecord.f374086e + ", taskId =  " + activityRecord.f374090i);
            if (r63.l.f393033l) {
                lVar.b(activityRecord.f374089h, r63.l.f393023b);
            } else {
                java.lang.Boolean bool = r63.l.f393039r;
                java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
                if (kotlin.jvm.internal.o.b(bool, bool2)) {
                    java.lang.String str3 = activityRecord.f374085d;
                    o63.e[] eVarArr2 = o63.e.f343196d;
                    r63.l.c(lVar, str3, 8, null, activityRecord.f374089h, 4, null);
                    nVar.u(activityRecord.f374089h, true);
                } else if (kotlin.jvm.internal.o.b(r63.l.f393032k, bool2)) {
                    if (r63.l.f393038q != null) {
                        java.lang.String str4 = activityRecord.f374085d;
                        o63.e[] eVarArr3 = o63.e.f343196d;
                        r63.l.c(lVar, str4, 2, null, activityRecord.f374089h, 4, null);
                    } else {
                        java.lang.String str5 = activityRecord.f374085d;
                        o63.e[] eVarArr4 = o63.e.f343196d;
                        r63.l.c(lVar, str5, 1, null, activityRecord.f374089h, 4, null);
                    }
                } else if (kotlin.jvm.internal.o.b(r63.l.f393032k, java.lang.Boolean.FALSE)) {
                    if (kotlin.jvm.internal.o.b(r63.l.f393030i, bool2) && kotlin.jvm.internal.o.b(r63.l.f393031j, bool2)) {
                        java.lang.String str6 = activityRecord.f374085d;
                        o63.e[] eVarArr5 = o63.e.f343196d;
                        r63.l.c(lVar, str6, 3, null, activityRecord.f374089h, 4, null);
                    } else {
                        java.lang.String str7 = activityRecord.f374085d;
                        o63.e[] eVarArr6 = o63.e.f343196d;
                        r63.l.c(lVar, str7, 4, null, activityRecord.f374089h, 4, null);
                    }
                } else if (kotlin.jvm.internal.o.b(r63.l.f393030i, bool2)) {
                    java.lang.String str8 = activityRecord.f374085d;
                    o63.e[] eVarArr7 = o63.e.f343196d;
                    r63.l.c(lVar, str8, 5, null, activityRecord.f374089h, 4, null);
                } else {
                    java.lang.String str9 = activityRecord.f374085d;
                    o63.e[] eVarArr8 = o63.e.f343196d;
                    r63.l.c(lVar, str9, 1, null, activityRecord.f374089h, 4, null);
                }
                r63.l.f393030i = null;
                r63.l.f393031j = null;
            }
        } else {
            r63.l.f393033l = false;
            o63.e[] eVarArr9 = o63.e.f343196d;
            r63.l.f393023b = 2;
        }
        java.lang.String activityName2 = activityRecord.f374085d;
        kotlin.jvm.internal.o.f(activityName2, "activityName");
        if (!lVar.a(activityName2)) {
            r63.l.f393031j = null;
        }
        r63.l.f393032k = null;
        int i17 = activityRecord.f374090i;
        int i18 = activityRecord.f374089h;
        java.lang.String activityName3 = activityRecord.f374085d;
        kotlin.jvm.internal.o.f(activityName3, "activityName");
        java.lang.String activitySimpleName = activityRecord.f374086e;
        kotlin.jvm.internal.o.f(activitySimpleName, "activitySimpleName");
        b(i17, i18, activityName3, activitySimpleName, false, j17, intent);
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderStayTimeMonitor", "onActivityResume " + activityRecord.f374086e + " process = " + bm5.f1.a());
    }

    @Override // up1.a
    public void h(r45.f83 activityRecord, android.content.Intent intent, long j17) {
        kotlin.jvm.internal.o.g(activityRecord, "activityRecord");
        r(true, activityRecord, j17);
    }

    public final void i(r45.f83 f83Var, long j17) {
        java.lang.String a17 = bm5.f1.a();
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderStayTimeMonitor", "onAppIn " + a17 + ' ' + f83Var.f374086e + ' ' + j17);
        if (kotlin.jvm.internal.o.b(a17, f83Var.f374095q)) {
            f393046e = java.lang.Boolean.TRUE;
        }
        r63.l lVar = r63.l.f393022a;
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderPageEnterMonitor", "onAppIn name : " + f83Var.f374086e + ", taskId =  " + f83Var.f374090i + " isInFinderTask = " + f393042a.p());
        r63.l.f393030i = java.lang.Boolean.TRUE;
        android.os.SystemClock.elapsedRealtime();
        p63.b bVar = p63.b.f352437a;
        if (bVar.c()) {
            com.tencent.wechat.aff.data_report.j a18 = bVar.a();
            if (a18 != null) {
                com.tencent.wechat.aff.data_report.k kVar = new com.tencent.wechat.aff.data_report.k();
                kVar.f216616d = f83Var.f374086e;
                kVar.f216618f = f83Var.f374089h;
                kVar.f216619g = f83Var.f374090i;
                kVar.f216620h = j17;
                a18.b(kVar);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AffFinderReport", "onAppIn: activityRecord: " + f83Var + ", timestamp: " + j17);
        }
    }

    @Override // up1.a
    public void j(r45.f83 f83Var, android.content.Intent intent, long j17) {
        com.tencent.mm.sdk.platformtools.o4 M;
        kotlin.jvm.internal.o.g(intent, "intent");
        android.content.ComponentName component = intent.getComponent();
        if (component != null) {
            java.util.Map map = o63.h.f343200a;
            java.lang.String className = component.getClassName();
            kotlin.jvm.internal.o.f(className, "getClassName(...)");
            if (!o63.h.f343201b.contains(className)) {
                r45.f83 f83Var2 = new r45.f83();
                f83Var2.f374085d = component.getClassName();
                f83Var2.f374086e = component.getShortClassName();
                f83Var2.f374092n = j17;
                java.lang.String a17 = bm5.f1.a();
                kotlin.jvm.internal.o.f(a17, "getProcessName(...)");
                try {
                    java.lang.String str = a17 + "_finderReportStartActivityKey";
                    int n17 = j62.e.g().n();
                    if (n17 == 0) {
                        M = null;
                    } else {
                        M = com.tencent.mm.sdk.platformtools.o4.M(n17 + "_FinderReportInfoMap");
                    }
                    if (M != null) {
                        if (f83Var != null) {
                            r45.ld6 ld6Var = new r45.ld6();
                            ld6Var.f379329d = f83Var;
                            ld6Var.f379330e = f83Var2;
                            ld6Var.f379331f = j17;
                            M.H(str, ld6Var.toByteArray());
                        } else {
                            M.remove(str);
                        }
                    }
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.FinderReportUtils", "updateStartActivityInfo err " + e17.getMessage());
                }
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(f83Var != null ? f83Var.f374086e : null);
        sb6.append(" process = ");
        sb6.append(bm5.f1.a());
        sb6.append(" update info toActivity = ");
        sb6.append(component != null ? component.getShortClassName() : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderStayTimeMonitor", sb6.toString());
    }

    public final void k(r45.f83 f83Var, long j17, java.lang.String str) {
        java.lang.String a17 = bm5.f1.a();
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderStayTimeMonitor", "appOut " + a17 + ' ' + f83Var.f374086e + ' ' + j17);
        o63.i iVar = o63.i.f343202a;
        if (iVar.b(str) != null) {
            f393046e = null;
            iVar.c(str);
            com.tencent.mars.xlog.Log.i("MicroMsg.FinderStayTimeMonitor", "app out " + f83Var.f374086e + " process = " + a17 + " remove info");
            return;
        }
        if (kotlin.jvm.internal.o.b(a17, f83Var.f374095q) || f393046e == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FinderStayTimeMonitor", "report 1 ");
            kotlin.jvm.internal.o.d(a17);
            iVar.c(a17);
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            f393046e = bool;
            r63.l lVar = r63.l.f393022a;
            com.tencent.mars.xlog.Log.i("MicroMsg.FinderPageEnterMonitor", "onAppOut name : " + f83Var.f374086e + ", taskId =  " + f83Var.f374090i + " isInFinderTask = " + f393042a.p());
            r63.l.f393030i = bool;
            r63.l.f393033l = false;
            p63.b bVar = p63.b.f352437a;
            if (bVar.c()) {
                com.tencent.wechat.aff.data_report.j a18 = bVar.a();
                if (a18 != null) {
                    com.tencent.wechat.aff.data_report.k kVar = new com.tencent.wechat.aff.data_report.k();
                    kVar.f216616d = f83Var.f374086e;
                    kVar.f216618f = f83Var.f374089h;
                    kVar.f216619g = f83Var.f374090i;
                    kVar.f216620h = j17;
                    a18.c(kVar);
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.AffFinderReport", "onAppOut: activityRecord: " + f83Var + ", timestamp: " + j17);
            }
        }
    }

    public final void l(r45.f83 f83Var, r45.g83 g83Var, long j17, boolean z17) {
        java.util.List list = (java.util.List) ((java.util.LinkedHashMap) f393051j).get(java.lang.Integer.valueOf(f83Var.f374089h));
        if (list != null) {
            java.util.ListIterator listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                r45.g83 g83Var2 = (r45.g83) listIterator.previous();
                if ((g83Var2.f374982g == g83Var.f374982g && z17) || g83Var2.f374989q < g83Var.f374989q) {
                    return;
                }
                java.lang.String str = !kotlin.jvm.internal.o.b("", g83Var.f374984i) ? g83Var2.f374984i : g83Var2.f374979d;
                p63.b bVar = p63.b.f352437a;
                int i17 = g83Var2.f374982g;
                kotlin.jvm.internal.o.d(str);
                bVar.e(i17, str, f83Var.f374090i, j17, null);
                listIterator.remove();
            }
        }
    }

    @Override // up1.a
    public void m(r45.f83 activityRecord, android.content.Intent intent, long j17) {
        kotlin.jvm.internal.o.g(activityRecord, "activityRecord");
        t(activityRecord, j17);
        int i17 = activityRecord.f374089h;
        if (n()) {
            f393048g.remove(java.lang.Integer.valueOf(i17));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderStayTimeMonitor", activityRecord.f374086e + " out stack");
    }

    public final boolean n() {
        if (f393049h == null) {
            f393049h = java.lang.Boolean.valueOf(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_hell_finder_report_open_fix_context_id, false));
            com.tencent.mars.xlog.Log.i("MicroMsg.FinderStayTimeMonitor", "isFix19943ContextId: " + f393049h);
        }
        java.lang.Boolean bool = f393049h;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final boolean p() {
        com.tencent.mm.sdk.platformtools.o4 M;
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            return f393045d;
        }
        try {
            int n17 = j62.e.g().n();
            if (n17 == 0) {
                M = null;
            } else {
                M = com.tencent.mm.sdk.platformtools.o4.M(n17 + "_FinderReportInfoMap");
            }
            if (M != null) {
                return M.h("isInFinderTask");
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FinderReportUtils", "isInFinderTask err " + e17.getMessage());
        }
        return false;
    }

    @Override // up1.a
    public void q(r45.f83 activityRecord, android.content.Intent intent, long j17) {
        kotlin.jvm.internal.o.g(activityRecord, "activityRecord");
        r63.l lVar = r63.l.f393022a;
        java.lang.String activityName = activityRecord.f374085d;
        kotlin.jvm.internal.o.f(activityName, "activityName");
        if (!lVar.a(activityName)) {
            java.lang.String baseActivityName = activityRecord.f374096r;
            kotlin.jvm.internal.o.f(baseActivityName, "baseActivityName");
            if (!lVar.a(baseActivityName)) {
                return;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderPageEnterMonitor", "onActivityNewIntent name : " + activityRecord.f374086e + ", taskId =  " + activityRecord.f374090i + " isInFinderTask = " + f393042a.p());
        r63.l.f393031j = java.lang.Boolean.TRUE;
    }

    public final void r(boolean z17, r45.f83 f83Var, long j17) {
        java.lang.String a17 = bm5.f1.a();
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FinderStayTimeMonitor", "on App in : " + z17);
            if (z17) {
                i(f83Var, j17);
                return;
            } else {
                kotlin.jvm.internal.o.d(a17);
                k(f83Var, j17, a17);
                return;
            }
        }
        java.lang.String str = com.tencent.mm.sdk.platformtools.w9.f193053a;
        android.os.Bundle bundle = new android.os.Bundle();
        r45.v8 v8Var = new r45.v8();
        v8Var.f387977e = f83Var;
        v8Var.f387979g = z17;
        v8Var.f387978f = j17;
        v8Var.f387976d = a17;
        if (!z17) {
            java.util.LinkedList linkedList = v8Var.f387980h;
            java.util.List list = f393047f;
            linkedList.addAll(list);
            ((java.util.ArrayList) list).clear();
        }
        bundle.putByteArray("finderReportAppProcessEvent", v8Var.toByteArray());
        com.tencent.mm.ipcinvoker.d0.f(str, bundle, r63.m.class);
    }

    @Override // up1.a
    public void s(r45.f83 activityRecord, android.content.Intent intent, long j17) {
        kotlin.jvm.internal.o.g(activityRecord, "activityRecord");
        t(activityRecord, j17);
        r63.l lVar = r63.l.f393022a;
        int i17 = activityRecord.f374089h;
        r63.l.f393024c.remove(java.lang.Integer.valueOf(i17));
        r63.l.f393025d.remove(java.lang.Integer.valueOf(i17));
        r63.l.f393026e.remove(java.lang.Integer.valueOf(activityRecord.f374089h));
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderPageEnterMonitor", "remove " + activityRecord.f374086e + " lastEnterType " + activityRecord.f374097s);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(activityRecord.f374086e);
        sb6.append(" destroy");
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderStayTimeMonitor", sb6.toString());
    }

    public final void t(r45.f83 f83Var, long j17) {
        java.util.List list = (java.util.List) ((java.util.LinkedHashMap) f393051j).get(java.lang.Integer.valueOf(f83Var.f374089h));
        p63.b bVar = p63.b.f352437a;
        if (list != null) {
            java.util.ListIterator listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                r45.g83 g83Var = (r45.g83) listIterator.previous();
                java.lang.String str = !kotlin.jvm.internal.o.b("", g83Var.f374984i) ? g83Var.f374984i : g83Var.f374979d;
                int i17 = g83Var.f374982g;
                kotlin.jvm.internal.o.d(str);
                bVar.e(i17, str, f83Var.f374090i, j17, null);
            }
        }
        int i18 = f83Var.f374089h;
        java.lang.String activityName = f83Var.f374085d;
        kotlin.jvm.internal.o.f(activityName, "activityName");
        bVar.e(i18, activityName, f83Var.f374090i, j17, null);
    }

    public final void u(int i17, boolean z17) {
        if (n()) {
            ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
            java.lang.String b17 = b52.b.b();
            if (b17 == null) {
                b17 = "";
            }
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
            java.util.Map map = f393048g;
            map.put(valueOf, b17);
            if (z17) {
                java.lang.Integer valueOf2 = java.lang.Integer.valueOf(f393050i);
                ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
                java.lang.String b18 = b52.b.b();
                map.put(valueOf2, b18 != null ? b18 : "");
            }
        }
    }

    public final void v(boolean z17) {
        com.tencent.mm.sdk.platformtools.o4 M;
        if (!com.tencent.mm.sdk.platformtools.x2.n() || z17 == f393045d) {
            return;
        }
        f393045d = z17;
        try {
            int n17 = j62.e.g().n();
            if (n17 == 0) {
                M = null;
            } else {
                M = com.tencent.mm.sdk.platformtools.o4.M(n17 + "_FinderReportInfoMap");
            }
            if (M != null) {
                M.G("isInFinderTask", z17);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FinderReportUtils", "updateInFinderTaskInfo err " + e17.getMessage());
        }
    }

    @Override // up1.a
    public void x(r45.f83 fromActivityRecord, r45.f83 toActivityRecord, boolean z17, android.content.Intent intent, long j17) {
        kotlin.jvm.internal.o.g(fromActivityRecord, "fromActivityRecord");
        kotlin.jvm.internal.o.g(toActivityRecord, "toActivityRecord");
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderStayTimeMonitor", fromActivityRecord.f374086e + " -> " + toActivityRecord.f374086e + " isCreateStack = " + z17);
        r63.l lVar = r63.l.f393022a;
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderPageEnterMonitor", "onStackChange " + fromActivityRecord.f374086e + " -> " + toActivityRecord.f374086e + " isCreateStack = " + z17);
        r63.l.f393032k = java.lang.Boolean.valueOf(z17);
        p63.b bVar = p63.b.f352437a;
        if (bVar.c()) {
            com.tencent.wechat.aff.data_report.k kVar = new com.tencent.wechat.aff.data_report.k();
            kVar.f216616d = fromActivityRecord.f374086e;
            kVar.f216618f = fromActivityRecord.f374089h;
            kVar.f216619g = fromActivityRecord.f374090i;
            kVar.f216620h = j17;
            com.tencent.wechat.aff.data_report.k kVar2 = new com.tencent.wechat.aff.data_report.k();
            kVar2.f216616d = toActivityRecord.f374086e;
            kVar2.f216618f = toActivityRecord.f374089h;
            kVar2.f216619g = toActivityRecord.f374090i;
            kVar2.f216620h = j17;
            com.tencent.wechat.aff.data_report.j a17 = bVar.a();
            if (a17 != null) {
                a17.a(kVar, kVar2, z17);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AffFinderReport", "onChangeStack: fromActivityRecord: " + fromActivityRecord + ", toActivityRecord: " + toActivityRecord + ", timestamp: " + j17 + ", isCreateStack: " + z17 + ", intent: null");
        }
    }
}
