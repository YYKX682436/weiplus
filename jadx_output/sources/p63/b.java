package p63;

/* loaded from: classes15.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final p63.b f352437a = new p63.b();

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.Boolean f352438b;

    public final com.tencent.wechat.aff.data_report.j a() {
        if (!gm0.j1.h() || !gm0.j1.a()) {
            return null;
        }
        ((u71.f) ((e70.q) i95.n0.c(e70.q.class))).wi();
        return com.tencent.wechat.aff.data_report.j.f216614b;
    }

    public final java.lang.String b(android.content.Intent intent, boolean z17) {
        java.lang.String stringExtra;
        jz5.l[] lVarArr = new jz5.l[5];
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String b17 = b52.b.b();
        java.lang.String str = "";
        if (b17 == null) {
            b17 = "";
        }
        lVarArr[0] = new jz5.l("finder_context_id", b17);
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String c17 = b52.b.c();
        if (c17 == null) {
            c17 = "";
        }
        lVarArr[1] = new jz5.l("finder_tab_context_id", c17);
        if (intent != null && (stringExtra = intent.getStringExtra("finder_extraInfo_key")) != null) {
            str = stringExtra;
        }
        lVarArr[2] = new jz5.l("extra_info", str);
        lVarArr[3] = new jz5.l("is_finder_task", java.lang.Integer.valueOf(z17 ? 1 : 0));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).getClass();
        lVarArr[4] = new jz5.l("mode_flag", java.lang.Long.valueOf(sz1.a.d()));
        java.util.Map k17 = kz5.c1.k(lVarArr);
        nf.f.c(k17);
        java.lang.String jSONObject = new org.json.JSONObject(k17).toString();
        kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
        return jSONObject;
    }

    public final boolean c() {
        if (f352438b == null) {
            f352438b = java.lang.Boolean.valueOf(j62.e.g().l("clicfg_finder_time_report_open_aff_config", true, true, true));
            com.tencent.mars.xlog.Log.i("MicroMsg.AffFinderReport", "isOpenAffReport: " + f352438b);
        }
        java.lang.Boolean bool = f352438b;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final void d(int i17, int i18, java.lang.String targetSimpleName, long j17) {
        kotlin.jvm.internal.o.g(targetSimpleName, "targetSimpleName");
        if (c()) {
            if (!com.tencent.mm.sdk.platformtools.x2.n()) {
                java.lang.String str = com.tencent.mm.sdk.platformtools.w9.f193053a;
                android.os.Bundle bundle = new android.os.Bundle();
                r45.a6 a6Var = new r45.a6();
                a6Var.f369748d = targetSimpleName;
                a6Var.f369750f = i18;
                a6Var.f369752h = j17;
                a6Var.f369751g = i17;
                a6Var.f369754m = false;
                bundle.putByteArray("finderReportAffFinderTask", a6Var.toByteArray());
                com.tencent.mm.ipcinvoker.d0.f(str, bundle, p63.a.class);
                return;
            }
            com.tencent.wechat.aff.data_report.j a17 = a();
            if (a17 != null) {
                com.tencent.wechat.aff.data_report.k kVar = new com.tencent.wechat.aff.data_report.k();
                kVar.f216616d = targetSimpleName;
                kVar.f216618f = i18;
                kVar.f216620h = j17;
                kVar.f216619g = i17;
                r63.l lVar = r63.l.f393022a;
                kVar.f216623n = r63.l.f393033l ? r63.l.f393023b : 0;
                r63.n nVar = r63.n.f393042a;
                kVar.f216624o = nVar.p() ? r63.l.f393027f : 0;
                kVar.f216626q = r63.l.f393029h;
                kVar.f216625p = nVar.p();
                a17.e(kVar);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AffFinderReport", "onPageDisappear: taskId: " + i17 + ", targetPageHC: " + i18 + ", targetSimpleName: " + targetSimpleName + ", timestamp: " + j17);
        }
    }

    public final void e(int i17, java.lang.String pageName, int i18, long j17, android.content.Intent intent) {
        kotlin.jvm.internal.o.g(pageName, "pageName");
        if (c()) {
            com.tencent.wechat.aff.data_report.j a17 = a();
            if (a17 != null) {
                com.tencent.wechat.aff.data_report.k kVar = new com.tencent.wechat.aff.data_report.k();
                kVar.f216616d = pageName;
                kVar.f216618f = i17;
                kVar.f216619g = i18;
                kVar.f216620h = j17;
                a17.f(kVar);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AffFinderReport", "onPopStack: pageHC: " + i17 + ", pageName: " + pageName + ", taskId: " + i18 + ", timestamp: " + j17 + ", intent: " + intent);
        }
    }
}
