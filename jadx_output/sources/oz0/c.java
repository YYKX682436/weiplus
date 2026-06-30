package oz0;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: g, reason: collision with root package name */
    public static final oz0.c f350201g = new oz0.c(106, com.tencent.mm.vfs.q7.c("MaasWarmUpRes") + "/album");

    /* renamed from: h, reason: collision with root package name */
    public static final oz0.c f350202h = new oz0.c(107, com.tencent.mm.vfs.q7.c("MaasWarmUpRes") + "/camera");

    /* renamed from: a, reason: collision with root package name */
    public final int f350203a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f350204b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f350205c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f350206d;

    /* renamed from: e, reason: collision with root package name */
    public final oz0.d f350207e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.mj_template.template_res.MaasTemplateResMgr$resEventListener$1 f350208f;

    /* JADX WARN: Type inference failed for: r3v5, types: [com.tencent.mm.mj_template.template_res.MaasTemplateResMgr$resEventListener$1] */
    public c(int i17, java.lang.String resRootDir) {
        kotlin.jvm.internal.o.g(resRootDir, "resRootDir");
        this.f350203a = i17;
        this.f350204b = resRootDir;
        this.f350205c = "MicroMsg.MaasTemplateResMgr_" + i17;
        this.f350206d = new java.lang.Object();
        this.f350207e = new oz0.d(i17);
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f350208f = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent>(a0Var) { // from class: com.tencent.mm.mj_template.template_res.MaasTemplateResMgr$resEventListener$1
            {
                this.__eventId = 905296653;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent checkResUpdateCacheFileEvent) {
                com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent event = checkResUpdateCacheFileEvent;
                kotlin.jvm.internal.o.g(event, "event");
                am.r2 r2Var = event.f54053g;
                int i18 = r2Var.f7759a;
                oz0.c cVar = oz0.c.this;
                if (i18 != cVar.f350203a) {
                    return false;
                }
                int i19 = r2Var.f7760b;
                java.lang.String str = r2Var.f7761c;
                boolean z17 = r2Var.f7763e;
                java.lang.String str2 = cVar.f350205c;
                com.tencent.mars.xlog.Log.i(str2, "get res " + i19 + ", " + str + ", " + z17);
                if (str == null) {
                    com.tencent.mars.xlog.Log.w(str2, "get res path is null");
                    return false;
                }
                if (!z17 || !cVar.g(i19, str)) {
                    return false;
                }
                cVar.a();
                return false;
            }
        };
    }

    public final void a() {
        synchronized (this.f350206d) {
            oz0.d dVar = this.f350207e;
            dVar.getClass();
            com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("maas_template_res");
            kotlin.jvm.internal.o.f(M, "getMMKV(...)");
            long j17 = M.getLong(dVar.f350209a, 0L);
            com.tencent.mm.sdk.platformtools.o4 M2 = com.tencent.mm.sdk.platformtools.o4.M("maas_template_res");
            kotlin.jvm.internal.o.f(M2, "getMMKV(...)");
            boolean z17 = M2.getLong(dVar.f350210b, 0L) < j17;
            java.lang.Iterable s17 = com.tencent.mm.vfs.w6.s(d(), false);
            boolean z18 = (s17 != null ? kz5.n0.P(s17) : 0) <= 0;
            com.tencent.mars.xlog.Log.i(this.f350205c, "checkMergeRes: update:" + z17 + ", empty:" + z18);
            if (z17 || z18) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.Iterable s18 = com.tencent.mm.vfs.w6.s(c(), false);
                if (s18 != null) {
                    java.util.Iterator it = s18.iterator();
                    while (it.hasNext()) {
                        int P = com.tencent.mm.sdk.platformtools.t8.P(((com.tencent.mm.vfs.x1) it.next()).f213232b, -1);
                        if (P >= 0) {
                            arrayList.add(java.lang.Integer.valueOf(P));
                        }
                    }
                }
                kz5.g0.s(arrayList);
                com.tencent.mars.xlog.Log.i(this.f350205c, "checkMergeRes: merge res " + arrayList);
                if (!arrayList.isEmpty()) {
                    f(arrayList);
                }
            }
        }
    }

    public final boolean b() {
        com.tencent.mm.autogen.mmdata.rpt.MaasTemplateResReportStruct maasTemplateResReportStruct = new com.tencent.mm.autogen.mmdata.rpt.MaasTemplateResReportStruct();
        int i17 = this.f350203a;
        maasTemplateResReportStruct.f59012d = i17;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.List<dm.v9> Ai = ((yy.a) ((zy.r) i95.n0.c(zy.r.class))).Ai(i17);
        if (Ai != null) {
            for (dm.v9 v9Var : Ai) {
                oz0.a aVar = new oz0.a();
                aVar.f350198a = v9Var.field_subType;
                aVar.f350199b = com.tencent.mm.sdk.platformtools.t8.P(v9Var.field_fileVersion, 0);
                linkedList.add(aVar);
            }
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            jSONArray.put(((oz0.a) it.next()).b());
        }
        jSONObject.put("list", jSONArray);
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        maasTemplateResReportStruct.f59013e = maasTemplateResReportStruct.b("SubTypeList", r26.i0.u(jSONObject2, ',', ';', false, 4, null), true);
        maasTemplateResReportStruct.k();
        com.tencent.mars.xlog.Log.i(this.f350205c, "checkRes: " + maasTemplateResReportStruct.n());
        java.lang.Iterable s17 = com.tencent.mm.vfs.w6.s(d(), false);
        return !((s17 != null ? kz5.n0.P(s17) : 0) <= 0);
    }

    public final java.lang.String c() {
        java.lang.String str = this.f350204b + "/list";
        com.tencent.mm.vfs.w6.u(str);
        return str;
    }

    public final java.lang.String d() {
        java.lang.String str = this.f350204b + "/result";
        com.tencent.mm.vfs.w6.u(str);
        return str;
    }

    public final void e() {
        com.tencent.mars.xlog.Log.i(this.f350205c, "init: ");
        java.util.List Ai = ((yy.a) ((zy.r) i95.n0.c(zy.r.class))).Ai(this.f350203a);
        if (Ai != null) {
            java.util.Iterator it = Ai.iterator();
            while (it.hasNext()) {
                int i17 = ((dm.v9) it.next()).field_subType;
                if (!com.tencent.mm.vfs.w6.j(c() + '/' + i17)) {
                    java.lang.String Bi = ((yy.a) ((zy.r) i95.n0.c(zy.r.class))).Bi(this.f350203a, i17);
                    com.tencent.mars.xlog.Log.i(this.f350205c, "init: get cached file " + i17 + ", " + Bi);
                    if (Bi != null) {
                        g(i17, Bi);
                    }
                }
                ((yy.a) ((zy.r) i95.n0.c(zy.r.class))).Ri(this.f350203a, i17, -1);
            }
        }
        alive();
        ((ku5.t0) ku5.t0.f312615d).k(new oz0.b(this), 5000L);
        a();
    }

    public final void f(java.util.List list) {
        oz0.d dVar = this.f350207e;
        dVar.getClass();
        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("maas_template_res");
        kotlin.jvm.internal.o.f(M, "getMMKV(...)");
        M.putLong(dVar.f350210b, java.lang.System.currentTimeMillis());
        java.lang.String d17 = d();
        com.tencent.mm.vfs.w6.f(d17);
        com.tencent.mm.vfs.w6.u(d17);
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            int intValue = ((java.lang.Number) it.next()).intValue();
            com.tencent.mars.xlog.Log.i(this.f350205c, "mergeRes: copy " + intValue);
            com.tencent.mm.vfs.w6.b(c() + '/' + intValue, d17);
        }
    }

    public final boolean g(int i17, java.lang.String str) {
        synchronized (this.f350206d) {
            if (str == null) {
                return false;
            }
            java.lang.String str2 = this.f350204b + "/temp";
            com.tencent.mm.vfs.w6.u(str2);
            java.lang.String str3 = c() + '/' + i17;
            com.tencent.mm.vfs.w6.f(str2);
            com.tencent.mm.vfs.w6.u(str2);
            int Q = com.tencent.mm.vfs.w6.Q(str, str2);
            if (Q != 0) {
                com.tencent.mars.xlog.Log.w(this.f350205c, "unzipRes: unzip fail " + Q);
                return false;
            }
            com.tencent.mm.vfs.w6.f(str3);
            com.tencent.mm.vfs.w6.v(str2, str3);
            oz0.d dVar = this.f350207e;
            dVar.getClass();
            com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("maas_template_res");
            kotlin.jvm.internal.o.f(M, "getMMKV(...)");
            M.putLong(dVar.f350209a, java.lang.System.currentTimeMillis());
            return true;
        }
    }
}
