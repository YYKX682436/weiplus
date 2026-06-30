package vp3;

/* loaded from: classes12.dex */
public class c extends com.tencent.mm.plugin.performance.diagnostic.d implements com.tencent.mm.matrix.dice.a {

    /* renamed from: r, reason: collision with root package name */
    public static final java.lang.String f438969r;

    /* renamed from: s, reason: collision with root package name */
    public static final com.tencent.mm.vfs.r6 f438970s;

    /* renamed from: t, reason: collision with root package name */
    public static final com.tencent.mm.vfs.r6 f438971t;

    /* renamed from: u, reason: collision with root package name */
    public static final com.tencent.mm.vfs.r6 f438972u;

    /* renamed from: g, reason: collision with root package name */
    public final vp3.a f438973g = new vp3.a(this);

    /* renamed from: h, reason: collision with root package name */
    public volatile long f438974h = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f438975i = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f438976m;

    /* renamed from: n, reason: collision with root package name */
    public long f438977n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f438978o;

    /* renamed from: p, reason: collision with root package name */
    public int f438979p;

    /* renamed from: q, reason: collision with root package name */
    public long f438980q;

    static {
        java.lang.String p17 = com.tencent.mm.plugin.performance.diagnostic.d.p();
        java.lang.String str = f438969r + p17;
        f438969r = str;
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getFilesDir().getAbsolutePath() + "/memory_hook";
        java.lang.String str3 = str2 + "/" + p17 + android.os.Process.myPid() + "_memory_hook.log";
        java.lang.String str4 = str2 + "/" + p17 + android.os.Process.myPid() + "_memory_hook.json";
        f438970s = new com.tencent.mm.vfs.r6(str2);
        f438971t = new com.tencent.mm.vfs.r6(str3);
        f438972u = new com.tencent.mm.vfs.r6(str4);
        com.tencent.mars.xlog.Log.i(str, "init dump file path = %s", str3);
        com.tencent.mars.xlog.Log.i(str, "init json file path = %s", str4);
    }

    @Override // com.tencent.mm.matrix.dice.a
    public double A4() {
        com.tencent.mm.booter.s sVar = ((km0.c) gm0.j1.p().a()).f308992f;
        java.lang.String str = f438969r;
        if (sVar != null && com.tencent.mm.sdk.platformtools.t8.m1(sVar.a(".com.tencent.mm.debug.disable_memory_hook"), false)) {
            com.tencent.mars.xlog.Log.i(str, "disable memory hook by coolassist");
            return -1.0d;
        }
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (o45.wf.f343033k) {
            com.tencent.mars.xlog.Log.i(str, "enable memory hook for Alpha");
            return 1.0d;
        }
        if (com.tencent.mars.xlog.Log.getLogLevel() <= 1) {
            com.tencent.mars.xlog.Log.i(str, "enable memory hook for DEBUG");
            return 1.0d;
        }
        return 1.0d / ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ui(e42.d0.clicfg_diagnostic_memory_hook_expt_rate_denominator_v2, 20000L);
    }

    @Override // com.tencent.mm.matrix.dice.a
    public void Sg(double d17) {
        java.lang.String str = f438969r;
        com.tencent.mars.xlog.Log.i(str, "dice action !");
        vp3.a aVar = this.f438973g;
        if (aVar.f152921a.o(aVar.f152929i, 0) > 3) {
            com.tencent.mars.xlog.Log.e(str, "skip process cmd, crashed for more than 3 times");
            return;
        }
        e42.d0 d0Var = e42.d0.clicfg_gallery_image_edit_icon_hide;
        tp3.a.INSTANCE.d(j62.e.g().a("clicfg_diagnostic_memory_hook_expt_cmd", "<cmd><diagnostic><MemoryHook enable='1' source='expt' process='all' duration='24' hook='.*com\\.tencent\\.mm.*\\.so$;.*libhwui\\.so$;.*libEGL\\.so$;.*libGLES.*\\.so$;.*libstagefright_foundation\\.so$;.*libstagefright\\.so$;.*libandroidfw\\.so$' stack='1' min='0' max='0' force='1' enableExpt='0' sampling='1' mmap='0'/></diagnostic></cmd>", false, true));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.tencent.mars.smc.IDKey iDKey = new com.tencent.mars.smc.IDKey(1571, 0, 1);
        com.tencent.mars.smc.IDKey iDKey2 = new com.tencent.mars.smc.IDKey(1571, com.tencent.mm.sdk.platformtools.x2.n() ? 20 : com.tencent.mm.sdk.platformtools.x2.j() ? 21 : (com.tencent.mm.sdk.platformtools.x2.s() || com.tencent.mm.sdk.platformtools.x2.r()) ? 22 : -1, 1);
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
        com.tencent.mars.xlog.Log.i(f438969r, "onRegistered: %s", "MemoryHook");
        com.tencent.mm.plugin.performance.diagnostic.y.f152954e.a("memory", this);
        com.tencent.mm.matrix.dice.c.f68706f.a(this);
        com.tencent.matrix.lifecycle.owners.ProcessExplicitBackgroundOwner.INSTANCE.addLifecycleCallback(new vp3.d(this));
    }

    @Override // com.tencent.mm.plugin.performance.diagnostic.d
    public com.tencent.mm.plugin.performance.diagnostic.f h() {
        return this.f438973g;
    }

    @Override // com.tencent.mm.plugin.performance.diagnostic.d
    public java.lang.String j() {
        return "MemoryHook";
    }

    @Override // com.tencent.mm.plugin.performance.diagnostic.d
    public java.lang.String k() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("hook=");
        vp3.a aVar = this.f438973g;
        sb6.append(aVar.f152921a.u(aVar.f438959l, ""));
        sb6.append(",stack=");
        java.lang.String str = aVar.f438961n;
        com.tencent.mm.sdk.platformtools.o4 o4Var = aVar.f152921a;
        sb6.append(o4Var.i(str, false));
        sb6.append(",mmap=");
        sb6.append(o4Var.i(aVar.f438966s, false));
        sb6.append("\t");
        return sb6.toString();
    }

    @Override // com.tencent.mm.matrix.dice.a
    public java.lang.String key() {
        return "MemoryHook";
    }

    @Override // com.tencent.mm.plugin.performance.diagnostic.d
    public void m(com.tencent.mm.plugin.performance.diagnostic.j jVar) {
        com.tencent.mars.xlog.Log.i(f438969r, "onHookEnabled: source = %s", jVar.name());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.tencent.mars.smc.IDKey iDKey = new com.tencent.mars.smc.IDKey(1571, 2, 1);
        com.tencent.mars.smc.IDKey iDKey2 = new com.tencent.mars.smc.IDKey(1571, com.tencent.mm.sdk.platformtools.x2.n() ? 40 : com.tencent.mm.sdk.platformtools.x2.j() ? 41 : (com.tencent.mm.sdk.platformtools.x2.s() || com.tencent.mm.sdk.platformtools.x2.r()) ? 42 : -1, 1);
        arrayList.add(iDKey);
        arrayList.add(iDKey2);
        jx3.f.INSTANCE.b(arrayList, false);
        com.tencent.thumbplayer.config.TPPlayerConfig.enableStackTrace = true;
    }

    @Override // com.tencent.mm.plugin.performance.diagnostic.d
    public xh.b q() {
        vp3.a aVar = this.f438973g;
        java.lang.String u17 = aVar.f152921a.u(aVar.f438959l, "");
        java.lang.String str = aVar.f438960m;
        com.tencent.mm.sdk.platformtools.o4 o4Var = aVar.f152921a;
        java.lang.String u18 = o4Var.u(str, "");
        boolean i17 = o4Var.i(aVar.f438961n, false);
        int o17 = o4Var.o(aVar.f438962o, 0);
        int o18 = o4Var.o(aVar.f438963p, 0);
        double f17 = aVar.f();
        boolean i18 = o4Var.i(aVar.f438965r, false);
        boolean i19 = o4Var.i(aVar.f438966s, false);
        int o19 = o4Var.o(aVar.f438967t, 5242880);
        java.lang.Object[] objArr = {u17, u18, java.lang.Boolean.valueOf(i17), java.lang.Integer.valueOf(o17), java.lang.Integer.valueOf(o18), java.lang.Double.valueOf(f17), java.lang.Boolean.valueOf(i18), java.lang.Boolean.valueOf(i19), java.lang.Integer.valueOf(o19)};
        java.lang.String str2 = f438969r;
        com.tencent.mars.xlog.Log.i(str2, "hook:%s, ignore:%s, enableStacktrace:%s, min:%d, max:%d, sampling:%f, extreme:%s, mmap:%s, stacklog:%s", objArr);
        if (android.text.TextUtils.isEmpty(u17)) {
            com.tencent.mars.xlog.Log.e(str2, "ERROR(MemoryHook): hook regex is blank");
            return null;
        }
        java.lang.String[] split = u17.split(";");
        java.lang.String[] split2 = u18.split(";");
        com.tencent.matrix.hook.memory.MemoryHook memoryHook = com.tencent.matrix.hook.memory.MemoryHook.f52666k;
        memoryHook.getClass();
        for (java.lang.String str3 : split) {
            if (android.text.TextUtils.isEmpty(str3)) {
                oj.j.b("Matrix.MemoryHook", "thread regex is empty!!!", new java.lang.Object[0]);
            } else {
                ((java.util.HashSet) memoryHook.f52667b).add(str3);
            }
        }
        for (java.lang.String str4 : split2) {
            if (!android.text.TextUtils.isEmpty(str4)) {
                ((java.util.HashSet) memoryHook.f52668c).add(str4);
            }
        }
        memoryHook.f52672g = i17;
        memoryHook.f52669d = o17;
        memoryHook.f52670e = o18;
        memoryHook.f52671f = o19;
        memoryHook.f52674i = i19;
        return memoryHook;
    }

    @Override // com.tencent.mm.plugin.performance.diagnostic.d
    public void s(boolean z17) {
        com.tencent.mm.vfs.r6 r6Var = f438972u;
        if (z17) {
            if (android.os.Debug.getNativeHeapAllocatedSize() > 524288000) {
                u(null, r6Var.o());
            }
            v(false, 0);
            return;
        }
        com.tencent.mm.vfs.r6 r6Var2 = f438971t;
        u(r6Var2.o(), r6Var.o());
        v(false, 0);
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        int logLevel = com.tencent.mars.xlog.Log.getLogLevel();
        java.lang.String str2 = f438969r;
        if (logLevel > 1 && java.lang.System.currentTimeMillis() - this.f438975i <= 60000) {
            com.tencent.mars.xlog.Log.i(str2, "skip logging for freq. but ilogs was reported");
        } else {
            sp3.d.d(str2, r6Var2);
            this.f438975i = java.lang.System.currentTimeMillis();
        }
    }

    public final void u(java.lang.String str, java.lang.String str2) {
        java.lang.String str3 = f438969r;
        com.tencent.mars.xlog.Log.i(str3, "memory dump begin");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        try {
            com.tencent.mm.vfs.r6 r6Var = f438970s;
            if (!r6Var.m()) {
                r6Var.J();
            }
            com.tencent.matrix.hook.memory.MemoryHook.f52666k.d(str, str2);
            com.tencent.mars.xlog.Log.i(str3, "dump path = %s, json path = %s", f438971t.o(), f438972u.o());
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(str3, e17, "something wrong when dumping", new java.lang.Object[0]);
        }
        com.tencent.mars.xlog.Log.i(str3, "memory dump end, cost = %d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    public final void v(boolean z17, int i17) {
        java.lang.String str = f438969r;
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(sp3.d.e(f438972u.o()));
            java.lang.String str2 = com.tencent.matrix.lifecycle.owners.f0.f52719a;
            java.lang.String str3 = com.tencent.matrix.lifecycle.owners.f0.f52735q;
            com.tencent.mars.xlog.Log.i(str, "recent scene @ %s", str3);
            java.lang.String a17 = vp3.b.f438968a.a();
            x(jSONObject, "NativeHeap", z17, i17, str3, a17);
            x(jSONObject, "mmap", z17, i17, str3, a17);
            w(jSONObject, "SoNativeSize", z17, i17, str3);
            w(jSONObject, "SoMmapSize", z17, i17, str3);
        } finally {
            try {
            } finally {
            }
        }
    }

    public final void w(org.json.JSONObject jSONObject, java.lang.String str, boolean z17, int i17, java.lang.String str2) {
        try {
            org.json.JSONArray jSONArray = jSONObject.getJSONArray(str);
            if (jSONArray.length() <= 0) {
                com.tencent.mars.xlog.Log.i(f438969r, "reportSoSizeJson: report nothing");
            }
            java.lang.String valueOf = java.lang.String.valueOf(android.os.Debug.getNativeHeapAllocatedSize());
            for (int i18 = 0; i18 < jSONArray.length(); i18++) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                if ("SoNativeSize".equalsIgnoreCase(str)) {
                    arrayList.add(z17 ? "8" : "4");
                } else if ("SoMmapSize".equalsIgnoreCase(str)) {
                    arrayList.add(z17 ? "9" : "5");
                }
                arrayList.add(bm5.f1.a());
                org.json.JSONObject jSONObject2 = jSONArray.getJSONObject(i18);
                java.lang.String[] split = jSONObject2.getString("so").split("/");
                arrayList.add(split[split.length - 1]);
                java.lang.String string = jSONObject2.getString("size");
                arrayList.add(string);
                long j17 = 0;
                if (com.tencent.mm.sdk.platformtools.t8.V(string, 0L) < 1048576) {
                    com.tencent.mars.xlog.Log.i(f438969r, "so size %s < 1M", string);
                    return;
                }
                while (arrayList.size() < 26) {
                    arrayList.add("");
                }
                arrayList.add(valueOf);
                boolean active = com.tencent.matrix.lifecycle.owners.ProcessExplicitBackgroundOwner.INSTANCE.active();
                if (active) {
                    try {
                        j17 = java.lang.System.currentTimeMillis() - this.f438974h;
                    } catch (java.lang.Throwable th6) {
                        th = th6;
                        com.tencent.mars.xlog.Log.printErrStackTrace(f438969r, th, "reportSoSizeJson", new java.lang.Object[0]);
                        return;
                    }
                }
                arrayList.add(active ? "2" : "1");
                arrayList.add(java.lang.String.valueOf(j17));
                com.tencent.mars.xlog.Log.i(f438969r, "dumpAndReport: isBackground=%s, bgDuration=%s", java.lang.Boolean.valueOf(active), java.lang.Long.valueOf(j17));
                arrayList.add(java.lang.String.valueOf(android.os.Process.myPid()));
                arrayList.add(com.tencent.mm.sdk.platformtools.z.f193105a);
                arrayList.add(com.tencent.mm.sdk.platformtools.z.f193109e);
                arrayList.add(java.lang.String.valueOf(i17));
                arrayList.add(str2);
                jx3.f.INSTANCE.l(21217, arrayList);
                java.util.Arrays.toString(arrayList.toArray());
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
        }
    }

    public final void x(org.json.JSONObject jSONObject, java.lang.String str, boolean z17, int i17, java.lang.String str2, java.lang.String str3) {
        org.json.JSONArray a17;
        try {
            org.json.JSONArray jSONArray = jSONObject.getJSONArray(str);
            if (jSONArray.length() <= 0) {
                com.tencent.mars.xlog.Log.i(f438969r, "reportStacktraceJson: report nothing");
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.String str4 = "1";
            if ("mmap".equalsIgnoreCase(str)) {
                arrayList.add(z17 ? "7" : "1");
            } else if ("NativeHeap".equalsIgnoreCase(str)) {
                arrayList.add(z17 ? "6" : "0");
            }
            arrayList.add(bm5.f1.a());
            this.f438976m = 0;
            this.f438977n = 0L;
            this.f438978o = null;
            this.f438979p = 0;
            this.f438980q = 0L;
            int i18 = 0;
            for (int i19 = 0; i19 < jSONArray.length(); i19++) {
                org.json.JSONObject jSONObject2 = jSONArray.getJSONObject(i19);
                java.lang.String[] split = jSONObject2.getString("so").split("/");
                arrayList.add(split[split.length - 1]);
                java.lang.String string = jSONObject2.getString("size");
                arrayList.add(string);
                if (i19 == 0 && split[split.length - 1] != null && (split[split.length - 1].contains("libTP") || split[split.length - 1].contains("libvoip"))) {
                    i18 = com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayerTracker.getTrackingMap().size();
                    ((ku5.t0) ku5.t0.f312615d).g(new vp3.c$$a());
                }
                if (i19 == 0 && com.tencent.mm.sdk.platformtools.t8.V(string, 0L) > com.tencent.tmassistantsdk.downloadservice.DownloadHelper.SAVE_LENGTH && split[split.length - 1] != null && split[split.length - 1].contains("libhwui")) {
                    pb0.g.b(new yz5.p() { // from class: vp3.c$$b
                        @Override // yz5.p
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            java.lang.String str5 = (java.lang.String) obj;
                            pb0.a aVar = (pb0.a) obj2;
                            vp3.c cVar = vp3.c.this;
                            cVar.f438976m += aVar.size();
                            cVar.f438977n += aVar.a();
                            if (cVar.f438978o == null) {
                                cVar.f438978o = str5;
                                cVar.f438979p = aVar.size();
                                cVar.f438980q = aVar.a();
                            }
                            com.tencent.mars.xlog.Log.i("DUMP_BITMAP", "count: %s, sum byte count: %s, %s\n trace: %s", java.lang.Integer.valueOf(aVar.size()), java.lang.Long.valueOf(aVar.a()), aVar, str5);
                            return null;
                        }
                    });
                }
                org.json.JSONArray jSONArray2 = jSONObject2.getJSONArray("top_stacks");
                for (int i27 = 0; i27 < jSONArray2.length(); i27++) {
                    org.json.JSONObject jSONObject3 = jSONArray2.getJSONObject(i27);
                    arrayList.add(jSONObject3.getString("stack"));
                    arrayList.add(jSONObject3.getString("size"));
                }
            }
            while (arrayList.size() < 26) {
                arrayList.add("");
            }
            arrayList.add(java.lang.String.valueOf(android.os.Debug.getNativeHeapAllocatedSize()));
            boolean active = com.tencent.matrix.lifecycle.owners.ProcessExplicitBackgroundOwner.INSTANCE.active();
            long currentTimeMillis = active ? java.lang.System.currentTimeMillis() - this.f438974h : 0L;
            com.tencent.matrix.lifecycle.owners.ProcessDeepBackgroundOwner processDeepBackgroundOwner = com.tencent.matrix.lifecycle.owners.ProcessDeepBackgroundOwner.INSTANCE;
            if (processDeepBackgroundOwner.isBackground()) {
                str4 = "3";
            } else if (active) {
                str4 = "2";
            }
            arrayList.add(str4);
            arrayList.add(java.lang.String.valueOf(currentTimeMillis));
            com.tencent.mars.xlog.Log.i(f438969r, "dumpAndReport: isBackground=%s, isDeepBg=%s, bgDuration=%s", java.lang.Boolean.valueOf(active), java.lang.Boolean.valueOf(processDeepBackgroundOwner.isBackground()), java.lang.Long.valueOf(currentTimeMillis));
            arrayList.add(java.lang.String.valueOf(android.os.Process.myPid()));
            arrayList.add(com.tencent.mm.sdk.platformtools.z.f193105a);
            arrayList.add(com.tencent.mm.sdk.platformtools.z.f193109e);
            arrayList.add(java.lang.String.valueOf(i17));
            arrayList.add(str2);
            arrayList.add(str3);
            try {
                org.json.JSONObject jSONObject4 = new org.json.JSONObject();
                if (i18 > 0) {
                    jSONObject4.put("TPCount", i18);
                }
                long j17 = this.f438977n;
                if (j17 > 0) {
                    jSONObject4.put("bmSize", j17);
                    jSONObject4.put("bmCount", this.f438976m);
                    jSONObject4.put("t1Size", this.f438980q);
                    jSONObject4.put("t1Count", this.f438979p);
                    jSONObject4.put("t1Stack", this.f438978o);
                }
                int Ri = ((e50.z0) ((f50.y) i95.n0.c(f50.y.class))).Ri();
                if (Ri > 0) {
                    jSONObject4.put("Flutter", Ri);
                    jSONObject4.put("FlutterBiz", ((e50.z0) ((f50.y) i95.n0.c(f50.y.class))).Ni().toString().replace("[", "").replace("]", "").replace(",", "|").replace(" ", ""));
                }
                int yj6 = ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).yj();
                if (yj6 > 0) {
                    jSONObject4.put(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_LITE_APP, yj6);
                    jSONObject4.put(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_LITE_APP_ID, ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).xj().toString().replace("[", "").replace("]", "").replace(",", "|").replace(" ", ""));
                }
                if (com.tencent.mm.sdk.platformtools.x2.j() && (a17 = com.tencent.mm.plugin.performance.watchdogs.x.a()) != null) {
                    jSONObject4.put("appbrand", a17);
                }
                arrayList.add(jSONObject4.toString().replace(",", ";"));
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace(f438969r, th6, "ignore", new java.lang.Object[0]);
            }
            jx3.f.INSTANCE.l(21217, arrayList);
            java.util.Arrays.toString(arrayList.toArray());
        } catch (java.lang.Throwable th7) {
            com.tencent.mars.xlog.Log.printErrStackTrace(f438969r, th7, "reportStacktraceJson", new java.lang.Object[0]);
        }
    }

    public void y(int i17) {
        com.tencent.mm.vfs.r6 r6Var = f438971t;
        u(r6Var.o(), f438972u.o());
        v(true, i17);
        sp3.d.d(f438969r, r6Var);
    }
}
