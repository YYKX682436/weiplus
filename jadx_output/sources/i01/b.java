package i01;

/* loaded from: classes8.dex */
public class b implements com.tencent.mm.modelbase.u0 {

    /* renamed from: g, reason: collision with root package name */
    public static i01.b f286497g;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f286498d = false;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.SharedPreferences f286499e = com.tencent.mm.sdk.platformtools.x2.d();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f286500f = new java.util.ArrayList();

    public final void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.TraceConfigUpdater", "summer release");
        this.f286498d = false;
        c01.d9.e().q(com.tencent.mm.plugin.appbrand.jsapi.audio.e0.CTRL_INDEX, this);
        c01.d9.e().q(160, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.vfs.z7 a17;
        java.lang.Class<rz.n> cls;
        int i19;
        com.tencent.mm.vfs.z7 z7Var;
        java.util.Map d17;
        int type = m1Var.getType();
        com.tencent.mars.xlog.Log.i("MicroMsg.TraceConfigUpdater", "summer onSceneEnd: errType:[%d], errCode:[%d], type:[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(type));
        if (!(m1Var instanceof com.tencent.mm.modelbase.q1) || ((com.tencent.mm.modelbase.q1) m1Var).u() != 21) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TraceConfigUpdater", "summer onSceneEnd another scene and ret");
            return;
        }
        android.content.SharedPreferences sharedPreferences = this.f286499e;
        int i27 = 0;
        java.lang.Class<rz.n> cls2 = rz.n.class;
        if (type == 159) {
            if (i17 != 0 || i18 != 0) {
                a();
                return;
            }
            ((qz.c) ((rz.n) i95.n0.c(cls2))).getClass();
            f21.i0[] D0 = f21.r0.Bi().D0(21);
            if (D0 == null || D0.length == 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.TraceConfigUpdater", "summer doDownload error no pkg found.");
                a();
                return;
            }
            f21.i0 i0Var = D0[0];
            com.tencent.mars.xlog.Log.i("MicroMsg.TraceConfigUpdater", "summer doDownload pkg id:" + i0Var.f258913a + " version:" + i0Var.f258914b + " status:" + i0Var.f258918f + " type:" + i0Var.f258919g);
            if (5 == i0Var.f258918f) {
                c01.d9.e().g(new f21.f0(i0Var.f258913a, 21));
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.TraceConfigUpdater", "summer pkgInfo has downloaded and release");
            sharedPreferences.edit().putLong("trace_config_last_update_time", java.lang.System.currentTimeMillis()).commit();
            a();
            return;
        }
        if (type == 160) {
            if (i17 == 0 && i18 == 0) {
                ((qz.c) ((rz.n) i95.n0.c(cls2))).getClass();
                f21.r0.Bi().getClass();
                java.lang.String a18 = zz1.a.a();
                ((qz.c) ((rz.n) i95.n0.c(cls2))).getClass();
                f21.j0 Bi = f21.r0.Bi();
                int i28 = ((f21.f0) m1Var).f258895f;
                java.lang.String u07 = Bi.u0(i28, 21);
                java.lang.Throwable th6 = null;
                if (a18 == null) {
                    a17 = null;
                } else {
                    try {
                        a17 = com.tencent.mm.vfs.z7.a(a18);
                    } catch (java.io.IOException e17) {
                        e = e17;
                        cls = cls2;
                        i19 = 0;
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TraceConfigUpdater", e, "", new java.lang.Object[i19]);
                        ((qz.c) ((rz.n) i95.n0.c(cls))).getClass();
                        f21.i0 z07 = f21.r0.Bi().z0(i28, 21);
                        z07.f258918f = 2;
                        ((qz.c) ((rz.n) i95.n0.c(cls))).getClass();
                        f21.r0.Bi().P0(z07);
                        a();
                    }
                }
                try {
                    if (a17 == null) {
                        z7Var = new com.tencent.mm.vfs.z7(null, null, com.tencent.mm.vfs.e8.l(u07, false, false), null, null);
                    } else {
                        boolean isEmpty = u07.isEmpty();
                        java.lang.String str2 = a17.f213279f;
                        if (!isEmpty) {
                            str2 = com.tencent.mm.vfs.e8.l(str2 + '/' + u07, false, false);
                        }
                        z7Var = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, str2, a17.f213280g, a17.f213281h);
                    }
                    d17 = com.tencent.mm.sdk.platformtools.aa.d(com.tencent.mm.vfs.w6.M(z7Var.toString()), "TraceConfig", null);
                } catch (java.io.IOException e18) {
                    e = e18;
                    i19 = i27;
                    cls = cls2;
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TraceConfigUpdater", e, "", new java.lang.Object[i19]);
                    ((qz.c) ((rz.n) i95.n0.c(cls))).getClass();
                    f21.i0 z072 = f21.r0.Bi().z0(i28, 21);
                    z072.f258918f = 2;
                    ((qz.c) ((rz.n) i95.n0.c(cls))).getClass();
                    f21.r0.Bi().P0(z072);
                    a();
                }
                if (d17 != null) {
                    java.util.HashMap hashMap = new java.util.HashMap();
                    int i29 = 0;
                    while (true) {
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                        sb6.append(".TraceConfig.Item");
                        sb6.append(i29 == 0 ? "" : java.lang.Integer.valueOf(i29));
                        java.lang.String sb7 = sb6.toString();
                        java.lang.String str3 = (java.lang.String) d17.get(sb7 + ".$key");
                        if (str3 == null) {
                            break;
                        }
                        i29++;
                        cls = cls2;
                        try {
                            long V = com.tencent.mm.sdk.platformtools.t8.V((java.lang.String) d17.get(sb7), -1L);
                            if (V >= 0) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.TraceConfigUpdater", "summer updateTraceConfig i: " + i29 + " key: " + str3 + "|value: " + V);
                                hashMap.put(str3, java.lang.Long.valueOf(V));
                            }
                            cls2 = cls;
                            th6 = null;
                            i27 = 0;
                        } catch (java.io.IOException e19) {
                            e = e19;
                            i19 = 0;
                            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TraceConfigUpdater", e, "", new java.lang.Object[i19]);
                            ((qz.c) ((rz.n) i95.n0.c(cls))).getClass();
                            f21.i0 z0722 = f21.r0.Bi().z0(i28, 21);
                            z0722.f258918f = 2;
                            ((qz.c) ((rz.n) i95.n0.c(cls))).getClass();
                            f21.r0.Bi().P0(z0722);
                            a();
                        }
                    }
                    android.content.SharedPreferences.Editor edit = sharedPreferences.edit();
                    for (java.util.Map.Entry entry : hashMap.entrySet()) {
                        edit.putLong((java.lang.String) entry.getKey(), ((java.lang.Long) entry.getValue()).longValue());
                    }
                    edit.putLong("trace_config_last_update_time", java.lang.System.currentTimeMillis()).commit();
                    hashMap.size();
                    java.util.ArrayList arrayList = this.f286500f;
                    if (arrayList.size() > 0) {
                        android.support.v4.media.f.a(arrayList.get(i27));
                        throw th6;
                    }
                    cls = cls2;
                    ((qz.c) ((rz.n) i95.n0.c(cls))).getClass();
                    f21.i0 z07222 = f21.r0.Bi().z0(i28, 21);
                    z07222.f258918f = 2;
                    ((qz.c) ((rz.n) i95.n0.c(cls))).getClass();
                    f21.r0.Bi().P0(z07222);
                }
            }
            a();
        }
    }
}
