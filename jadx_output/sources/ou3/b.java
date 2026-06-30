package ou3;

/* loaded from: classes12.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f348939a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f348940b;

    public b() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f348939a = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent>(a0Var) { // from class: com.tencent.mm.plugin.recordvideo.res.BaseVideoResLogic$checkResUpdateCacheFileEventListener$1
            {
                this.__eventId = 905296653;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent checkResUpdateCacheFileEvent) {
                com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent event = checkResUpdateCacheFileEvent;
                kotlin.jvm.internal.o.g(event, "event");
                am.r2 r2Var = event.f54053g;
                int i17 = r2Var.f7759a;
                ou3.b bVar = ou3.b.this;
                if (i17 != bVar.g() || r2Var.f7760b != 1) {
                    return false;
                }
                com.tencent.mars.xlog.Log.i(bVar.h(), "download res finish, path: %s, fileVersion: %s, fileUpdated: %s", r2Var.f7761c, java.lang.Integer.valueOf(r2Var.f7762d), java.lang.Boolean.valueOf(r2Var.f7763e));
                gm0.j1.e().j(new ou3.a(bVar, event));
                ou3.r rVar = (ou3.r) bVar.d();
                rVar.a(rVar.f348972a + 5);
                return false;
            }
        };
    }

    public void a() {
        com.tencent.mars.xlog.Log.i(h(), "checkRes " + g());
        ((yy.a) ((zy.r) i95.n0.c(zy.r.class))).wi(g());
        ou3.r rVar = (ou3.r) d();
        rVar.a(rVar.f348972a + 4);
    }

    public abstract java.lang.String b();

    public abstract java.lang.String[] c();

    public abstract ou3.g d();

    public abstract java.lang.String e();

    public final java.lang.String f() {
        return e() + "temp/";
    }

    public abstract int g();

    public abstract java.lang.String h();

    public final void i(java.lang.String str) {
        java.lang.String str2 = f() + b() + str;
        java.lang.String str3 = e() + str;
        com.tencent.mars.xlog.Log.i(h(), "file tmp:" + str2 + "  real:" + str3);
        if (!com.tencent.mm.vfs.w6.j(str2)) {
            com.tencent.mars.xlog.Log.e(h(), "Config does not matching file list!!!!!!!!");
            return;
        }
        if (!com.tencent.mm.vfs.w6.j(str3)) {
            com.tencent.mars.xlog.Log.i(h(), "move file " + str);
            com.tencent.mm.vfs.w6.w(str2, str3);
            return;
        }
        if (kotlin.jvm.internal.o.b(uk.k.b(str2), uk.k.b(str3))) {
            com.tencent.mars.xlog.Log.i(h(), "already has file " + str);
            return;
        }
        com.tencent.mm.vfs.w6.h(str3);
        com.tencent.mm.vfs.w6.w(str2, str3);
        com.tencent.mars.xlog.Log.i(h(), "replace file " + str);
    }

    public final void j() {
        if (this.f348940b) {
            ou3.r rVar = (ou3.r) d();
            rVar.a(rVar.f348972a + 2);
        } else {
            ou3.r rVar2 = (ou3.r) d();
            rVar2.a(rVar2.f348972a + 3);
        }
    }

    public final int k(java.lang.String str, java.lang.String str2) {
        java.util.zip.ZipInputStream zipInputStream = null;
        try {
            try {
                java.util.zip.ZipInputStream zipInputStream2 = new java.util.zip.ZipInputStream(com.tencent.mm.vfs.w6.E(str));
                java.util.zip.ZipEntry zipEntry = null;
                while (true) {
                    try {
                        java.util.zip.ZipEntry nextEntry = zipInputStream2.getNextEntry();
                        if (nextEntry != null) {
                            zipEntry = nextEntry;
                        } else {
                            nextEntry = null;
                        }
                        if (nextEntry == null) {
                            com.tencent.mm.vfs.e8.d(zipInputStream2);
                            return 0;
                        }
                        kotlin.jvm.internal.o.d(zipEntry);
                        java.lang.String name = zipEntry.getName();
                        kotlin.jvm.internal.o.f(name, "getName(...)");
                        if (!r26.n0.B(name, "../", false) && !r26.n0.B(name, "..\\", false)) {
                            if (zipEntry.isDirectory()) {
                                java.lang.String substring = name.substring(0, name.length() - 1);
                                kotlin.jvm.internal.o.f(substring, "substring(...)");
                                com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str2 + '/' + substring);
                                java.lang.String str3 = a17.f213279f;
                                if (str3 != null) {
                                    java.lang.String l17 = com.tencent.mm.vfs.e8.l(str3, false, false);
                                    if (!str3.equals(l17)) {
                                        a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                                    }
                                }
                                com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
                                if (m17.a()) {
                                    m17.f213266a.r(m17.f213267b);
                                }
                            } else {
                                com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(str2 + '/' + name);
                                com.tencent.mm.vfs.r6 s17 = r6Var.s();
                                if (s17 != null) {
                                    s17.J();
                                }
                                java.io.OutputStream H = com.tencent.mm.vfs.w6.H(r6Var);
                                kotlin.jvm.internal.o.f(H, "openWrite(...)");
                                byte[] bArr = new byte[1024];
                                while (true) {
                                    int read = zipInputStream2.read(bArr);
                                    if (read == -1) {
                                        break;
                                    }
                                    H.write(bArr, 0, read);
                                }
                                H.close();
                            }
                        }
                    } catch (java.io.FileNotFoundException e17) {
                        e = e17;
                        zipInputStream = zipInputStream2;
                        com.tencent.mars.xlog.Log.printErrStackTrace(h(), e, "", new java.lang.Object[0]);
                        com.tencent.mm.vfs.e8.d(zipInputStream);
                        return -1;
                    } catch (java.io.IOException e18) {
                        e = e18;
                        zipInputStream = zipInputStream2;
                        com.tencent.mars.xlog.Log.printErrStackTrace(h(), e, "", new java.lang.Object[0]);
                        com.tencent.mm.vfs.e8.d(zipInputStream);
                        return -2;
                    } catch (java.lang.Throwable th6) {
                        th = th6;
                        zipInputStream = zipInputStream2;
                        com.tencent.mm.vfs.e8.d(zipInputStream);
                        throw th;
                    }
                }
            } catch (java.lang.Throwable th7) {
                th = th7;
            }
        } catch (java.io.FileNotFoundException e19) {
            e = e19;
        } catch (java.io.IOException e27) {
            e = e27;
        }
    }

    public final synchronized void l(java.lang.String filePath, int i17, int i18, int i19) {
        kotlin.jvm.internal.o.g(filePath, "filePath");
        com.tencent.mars.xlog.Log.i(h(), "unzipRes: %s", filePath);
        if (com.tencent.mm.vfs.w6.j(filePath)) {
            com.tencent.mm.vfs.w6.u(f());
            int k17 = k(filePath, f());
            com.tencent.mars.xlog.Log.i(h(), "unzip file ret:" + k17 + "  " + f());
            boolean z17 = false;
            java.lang.Iterable<com.tencent.mm.vfs.x1> s17 = com.tencent.mm.vfs.w6.s(f() + b(), false);
            if (s17 != null) {
                for (com.tencent.mm.vfs.x1 x1Var : s17) {
                    com.tencent.mars.xlog.Log.i(h(), "unzip file path:" + x1Var.f213231a + " name:" + x1Var.f213232b + " size:" + x1Var.f213233c);
                }
            }
            if (k17 == 0) {
                try {
                    try {
                        if (com.tencent.mm.vfs.w6.j(f() + b() + "config.json")) {
                            java.lang.String M = com.tencent.mm.vfs.w6.M(f() + b() + "config.json");
                            com.tencent.mars.xlog.Log.i(h(), "meta json: %s", M);
                            org.json.JSONArray jSONArray = new org.json.JSONArray(M);
                            int length = jSONArray.length();
                            for (int i27 = 0; i27 < length; i27++) {
                                org.json.JSONObject jSONObject = jSONArray.getJSONObject(i27);
                                for (java.lang.String str : c()) {
                                    java.lang.String optString = jSONObject.optString(str);
                                    kotlin.jvm.internal.o.f(optString, "optString(...)");
                                    i(optString);
                                }
                            }
                            com.tencent.mm.vfs.w6.h(e() + "config.json");
                            com.tencent.mm.vfs.w6.w(f() + b() + "config.json", e() + "config.json");
                            z17 = true;
                        }
                        if (z17) {
                            ou3.r rVar = (ou3.r) d();
                            rVar.a(rVar.f348972a + 6);
                            com.tencent.mars.xlog.Log.i(h(), "unzip success");
                            ((yy.a) ((zy.r) i95.n0.c(zy.r.class))).Ri(i17, i18, i19);
                            this.f348940b = true;
                        } else {
                            ou3.r rVar2 = (ou3.r) d();
                            rVar2.a(rVar2.f348972a + 7);
                            com.tencent.mars.xlog.Log.i(h(), "unzip failed");
                        }
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.printErrStackTrace(h(), e17, "unzipRes error: %s", e17.getMessage());
                        ou3.r rVar3 = (ou3.r) d();
                        rVar3.a(rVar3.f348972a + 7);
                        com.tencent.mars.xlog.Log.i(h(), "unzip failed");
                    }
                    com.tencent.mm.vfs.w6.g(f(), true);
                } catch (java.lang.Throwable th6) {
                    ou3.r rVar4 = (ou3.r) d();
                    rVar4.a(rVar4.f348972a + 7);
                    com.tencent.mars.xlog.Log.i(h(), "unzip failed");
                    com.tencent.mm.vfs.w6.g(f(), true);
                    throw th6;
                }
            }
        }
    }
}
