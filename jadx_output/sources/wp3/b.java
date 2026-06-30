package wp3;

/* loaded from: classes12.dex */
public class b extends com.tencent.mm.plugin.performance.diagnostic.d implements com.tencent.mm.matrix.dice.a {

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String f448392h;

    /* renamed from: i, reason: collision with root package name */
    public static final com.tencent.mm.vfs.r6 f448393i;

    /* renamed from: m, reason: collision with root package name */
    public static final com.tencent.mm.vfs.r6 f448394m;

    /* renamed from: n, reason: collision with root package name */
    public static final java.util.Set f448395n;

    /* renamed from: g, reason: collision with root package name */
    public final wp3.a f448396g = new wp3.a(this);

    static {
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        f448395n = new java.util.HashSet();
        java.lang.String p17 = com.tencent.mm.plugin.performance.diagnostic.d.p();
        java.lang.String str2 = f448392h + p17;
        f448392h = str2;
        java.lang.String str3 = com.tencent.mm.sdk.platformtools.x2.f193071a.getFilesDir().getAbsolutePath() + "/pthread_hook";
        java.lang.String str4 = str3 + "/" + p17 + android.os.Process.myPid() + "_pthread_hook.json";
        f448393i = new com.tencent.mm.vfs.r6(str3);
        f448394m = new com.tencent.mm.vfs.r6(str4);
        com.tencent.mars.xlog.Log.i(str2, "init dump file path = %s", str4);
    }

    public static java.lang.String u(java.util.Map map) {
        try {
            return new org.json.JSONObject(map).toString().replace(",", ";");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(f448392h, e17, "json error", new java.lang.Object[0]);
            return e17.getMessage();
        }
    }

    @Override // com.tencent.mm.matrix.dice.a
    public double A4() {
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        return 1.0d / ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ui(e42.d0.clicfg_diagnostic_pthread_hook_expt_rate_denominator, -1L);
    }

    @Override // com.tencent.mm.matrix.dice.a
    public void Sg(double d17) {
        tp3.a.INSTANCE.d(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_diagnostic_pthread_hook_expt_cmd, "<cmd><diagnostic><PthreadHook\n enable='1' process='all' duration='24' hook='.*\\.so$' thread='.*'/></diagnostic></cmd>", true));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.tencent.mars.smc.IDKey iDKey = new com.tencent.mars.smc.IDKey(1571, 10, 1);
        com.tencent.mars.smc.IDKey iDKey2 = new com.tencent.mars.smc.IDKey(1571, com.tencent.mm.sdk.platformtools.x2.n() ? 50 : com.tencent.mm.sdk.platformtools.x2.j() ? 51 : (com.tencent.mm.sdk.platformtools.x2.s() || com.tencent.mm.sdk.platformtools.x2.r()) ? 52 : -1, 1);
        arrayList.add(iDKey);
        arrayList.add(iDKey2);
        jx3.f.INSTANCE.b(arrayList, false);
    }

    @Override // com.tencent.mm.matrix.dice.a
    public long V3() {
        return java.util.concurrent.TimeUnit.DAYS.toMinutes(1L);
    }

    @Override // tp3.c
    public void d() {
        com.tencent.mars.xlog.Log.i(f448392h, "onRegistered: %s", "PthreadHook");
        com.tencent.mm.plugin.performance.diagnostic.y.f152954e.a("pthread", this);
        com.tencent.mm.matrix.dice.c.f68706f.a(this);
    }

    @Override // com.tencent.mm.plugin.performance.diagnostic.d
    public com.tencent.mm.plugin.performance.diagnostic.f h() {
        return this.f448396g;
    }

    @Override // com.tencent.mm.plugin.performance.diagnostic.d
    public java.lang.String j() {
        return "PthreadHook";
    }

    @Override // com.tencent.mm.plugin.performance.diagnostic.d
    public java.lang.String k() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("hook=");
        wp3.a aVar = this.f448396g;
        sb6.append(aVar.f152921a.u(aVar.f448389l, ""));
        sb6.append(",thread=");
        sb6.append(aVar.f152921a.u(aVar.f448391n, ""));
        sb6.append("\t");
        return sb6.toString();
    }

    @Override // com.tencent.mm.matrix.dice.a
    public java.lang.String key() {
        return "PthreadHook";
    }

    @Override // com.tencent.mm.plugin.performance.diagnostic.d
    public void m(com.tencent.mm.plugin.performance.diagnostic.j jVar) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.tencent.mars.smc.IDKey iDKey = new com.tencent.mars.smc.IDKey(1571, 12, 1);
        com.tencent.mars.smc.IDKey iDKey2 = new com.tencent.mars.smc.IDKey(1571, com.tencent.mm.sdk.platformtools.x2.n() ? 70 : com.tencent.mm.sdk.platformtools.x2.j() ? 71 : (com.tencent.mm.sdk.platformtools.x2.s() || com.tencent.mm.sdk.platformtools.x2.r()) ? 72 : -1, 1);
        arrayList.add(iDKey);
        arrayList.add(iDKey2);
        jx3.f.INSTANCE.b(arrayList, false);
    }

    @Override // com.tencent.mm.plugin.performance.diagnostic.d
    public xh.b q() {
        wp3.a aVar = this.f448396g;
        java.lang.String u17 = aVar.f152921a.u(aVar.f448389l, "");
        java.lang.String str = aVar.f448390m;
        com.tencent.mm.sdk.platformtools.o4 o4Var = aVar.f152921a;
        java.lang.String u18 = o4Var.u(str, null);
        java.lang.String u19 = o4Var.u(aVar.f448391n, "");
        java.lang.String[] split = u17.split(";");
        java.lang.String[] split2 = u18 == null ? new java.lang.String[0] : u18.split(";");
        java.lang.String[] split3 = u19 == null ? new java.lang.String[]{".*"} : u19.split(";");
        java.lang.Object[] objArr = {java.util.Arrays.toString(split)};
        java.lang.String str2 = f448392h;
        com.tencent.mars.xlog.Log.i(str2, "hookRegex = %s (ignored)", objArr);
        com.tencent.mars.xlog.Log.i(str2, "ignoreRegex = %s (ignored)", java.util.Arrays.toString(split2));
        com.tencent.mars.xlog.Log.i(str2, "threadRegex = %s", java.util.Arrays.toString(split3));
        com.tencent.matrix.hook.pthread.PthreadHook pthreadHook = com.tencent.matrix.hook.pthread.PthreadHook.f52677h;
        pthreadHook.f52681e = true;
        for (java.lang.String str3 : split3) {
            if (android.text.TextUtils.isEmpty(str3)) {
                oj.j.b("Matrix.Pthread", "thread regex is empty!!!", new java.lang.Object[0]);
            } else {
                ((java.util.HashSet) pthreadHook.f52678b).add(str3);
            }
        }
        pthreadHook.f(true);
        return pthreadHook;
    }

    @Override // com.tencent.mm.plugin.performance.diagnostic.d
    public void s(boolean z17) {
        com.tencent.mm.vfs.r6 r6Var;
        int i17;
        java.util.Set set;
        java.lang.String str;
        v();
        com.tencent.mm.vfs.r6 r6Var2 = new com.tencent.mm.vfs.r6(f448394m.o());
        java.lang.String str2 = "\n\t";
        java.lang.String str3 = ";";
        java.lang.Object[] objArr = {r6Var2.getName(), sp3.d.f(r6Var2.B())};
        java.lang.String str4 = f448392h;
        com.tencent.mars.xlog.Log.i(str4, ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> dump file = %s, modified = %s", objArr);
        if (r6Var2.m()) {
            try {
                try {
                    org.json.JSONArray jSONArray = new org.json.JSONObject(sp3.d.e(r6Var2.o())).getJSONArray("PthreadHook_not_exited");
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    int i18 = 0;
                    while (i18 < jSONArray.length()) {
                        org.json.JSONObject jSONObject = jSONArray.getJSONObject(i18);
                        long V = com.tencent.mm.sdk.platformtools.t8.V(jSONObject.getString("hash"), 0L);
                        java.lang.String string = jSONObject.getString("native");
                        java.lang.String string2 = jSONObject.getString("java");
                        org.json.JSONArray jSONArray2 = jSONArray;
                        int P = com.tencent.mm.sdk.platformtools.t8.P(jSONObject.getString("count"), 0);
                        org.json.JSONArray jSONArray3 = jSONObject.getJSONArray("threads");
                        r6Var = r6Var2;
                        int i19 = i18;
                        try {
                            com.tencent.mars.xlog.Log.i(str4, "------------------------------- hash= %d -------------------------------", java.lang.Long.valueOf(V));
                            com.tencent.mars.xlog.Log.i(str4, "native\n\t%s", string.replace(str3, str2));
                            com.tencent.mars.xlog.Log.i(str4, "java\n\t%s", string2.replace(str3, str2));
                            com.tencent.mars.xlog.Log.i(str4, "ThreadCount = %d", java.lang.Integer.valueOf(P));
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            java.util.HashSet hashSet = new java.util.HashSet();
                            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                            java.lang.String str5 = str2;
                            java.lang.String str6 = str3;
                            int i27 = 0;
                            while (true) {
                                int length = jSONArray3.length();
                                i17 = P;
                                set = f448395n;
                                str = string2;
                                if (i27 >= length) {
                                    break;
                                }
                                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                                java.lang.String str7 = string;
                                org.json.JSONObject jSONObject2 = jSONArray3.getJSONObject(i27);
                                org.json.JSONArray jSONArray4 = jSONArray3;
                                java.lang.String optString = jSONObject2.optString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "");
                                long j17 = V;
                                java.lang.String optString2 = jSONObject2.optString("tid", "-1");
                                java.lang.String optString3 = jSONObject2.optString("renames", "");
                                sb6.append("{");
                                sb6.append(optString2);
                                sb6.append("-");
                                sb6.append(optString);
                                sb6.append("}");
                                java.lang.String sb7 = sb6.toString();
                                arrayList.add(sb7);
                                com.tencent.mm.sdk.platformtools.t8.D1(optString2, -1);
                                linkedHashMap.put("t-" + i27 + "-name", optString);
                                linkedHashMap.put("t-" + i27 + "-tid", optString2);
                                linkedHashMap.put("t-" + i27 + "-renames", optString3);
                                if (!((java.util.HashSet) set).contains(sb7)) {
                                    hashSet.add(sb7);
                                }
                                i27++;
                                P = i17;
                                string2 = str;
                                string = str7;
                                jSONArray3 = jSONArray4;
                                V = j17;
                            }
                            long j18 = V;
                            java.lang.String str8 = string;
                            com.tencent.mars.xlog.Log.i(str4, "==> leaked threads : %s", arrayList.toString().replace(",", ""));
                            if (!hashSet.isEmpty()) {
                                jx3.f.INSTANCE.d(19816, 0, java.lang.Long.valueOf(currentTimeMillis), java.lang.Long.valueOf(j18), str8, str, java.lang.Integer.valueOf(i17), arrayList.toString().replace(",", ""), bm5.f1.a(), java.lang.Integer.valueOf(android.os.Process.myPid()), com.tencent.mm.sdk.platformtools.z.f193105a, com.tencent.mm.sdk.platformtools.z.f193109e, u(linkedHashMap));
                                set.addAll(hashSet);
                                com.tencent.mars.xlog.Log.i(str4, "reported %s", hashSet);
                            }
                            i18 = i19 + 1;
                            jSONArray = jSONArray2;
                            r6Var2 = r6Var;
                            str2 = str5;
                            str3 = str6;
                        } catch (java.lang.Exception e17) {
                            e = e17;
                            com.tencent.mars.xlog.Log.printErrStackTrace(str4, e, "report kv error", new java.lang.Object[0]);
                            r6Var.l();
                            com.tencent.mars.xlog.Log.i(str4, "<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< dump file = %s, modified = %s", r6Var.getName(), sp3.d.f(r6Var.B()));
                        }
                    }
                    r6Var = r6Var2;
                    if (com.tencent.mm.sdk.platformtools.s9.f192974b || z65.c.a()) {
                        sp3.d.b(r6Var);
                    } else {
                        java.lang.String str9 = com.tencent.mm.sdk.platformtools.z.f193105a;
                    }
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    r17.l();
                    throw th;
                }
            } catch (java.lang.Exception e18) {
                e = e18;
                r6Var = r6Var2;
            } catch (java.lang.Throwable th7) {
                th = th7;
                com.tencent.mm.vfs.r6 r6Var3 = r6Var2;
                r6Var3.l();
                throw th;
            }
            r6Var.l();
            com.tencent.mars.xlog.Log.i(str4, "<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< dump file = %s, modified = %s", r6Var.getName(), sp3.d.f(r6Var.B()));
        }
    }

    public synchronized java.lang.String v() {
        java.lang.String str = f448392h;
        com.tencent.mars.xlog.Log.i(str, "memory dump begin");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        try {
            com.tencent.mm.vfs.r6 r6Var = f448393i;
            if (!r6Var.m()) {
                r6Var.J();
            }
            com.tencent.matrix.hook.pthread.PthreadHook pthreadHook = com.tencent.matrix.hook.pthread.PthreadHook.f52677h;
            com.tencent.mm.vfs.r6 r6Var2 = f448394m;
            pthreadHook.d(r6Var2.o());
            com.tencent.mars.xlog.Log.i(str, "dump path = %s", r6Var2.o());
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(f448392h, e17, "something wrong when dumping", new java.lang.Object[0]);
        }
        com.tencent.mars.xlog.Log.i(f448392h, "memory dump end, cost = %d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        return f448394m.o();
    }
}
