package cz0;

/* loaded from: classes5.dex */
public final class y {

    /* renamed from: c, reason: collision with root package name */
    public static boolean f224971c;

    /* renamed from: a, reason: collision with root package name */
    public static final cz0.y f224969a = new cz0.y();

    /* renamed from: b, reason: collision with root package name */
    public static final int f224970b = com.tencent.mm.sdk.platformtools.z.f193121q;

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.concurrent.locks.ReentrantLock f224972d = new java.util.concurrent.locks.ReentrantLock();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.concurrent.locks.ReentrantLock f224973e = new java.util.concurrent.locks.ReentrantLock();

    /* renamed from: f, reason: collision with root package name */
    public static java.lang.String f224974f = "#MaasSdkVersion:not_load";

    /* renamed from: g, reason: collision with root package name */
    public static final jz5.g f224975g = jz5.h.b(cz0.p.f224961d);

    static {
        com.tencent.mm.app.MMCrashReportContents.U.f(cz0.n.f224959d);
        com.tencent.mm.app.MMBugReportContents.f53230k.f53725o.f(cz0.o.f224960d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(cz0.y yVar) {
        int i17;
        yVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSdkResMgr", "cleanLegacyRes: clean start");
        java.lang.String str = lp0.b.h() + "maas-template";
        if (com.tencent.mm.vfs.w6.j(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MaasSdkResMgr", "cleanLegacyRes: legacyWarmUpResDir:" + str + " exist, delete it.");
            com.tencent.mm.vfs.w6.f(str);
        }
        cz0.l e17 = yVar.e();
        int i18 = 0;
        boolean z17 = 1;
        boolean z18 = e17 != null && e17.b() && e17.f224954a.size() > 0;
        java.lang.Iterable<com.tencent.mm.vfs.x1> s17 = com.tencent.mm.vfs.w6.s(cz0.m.f224956b, false);
        if (s17 != null) {
            for (com.tencent.mm.vfs.x1 x1Var : s17) {
                int P = com.tencent.mm.sdk.platformtools.t8.P(x1Var.f213232b, -1);
                if (P >= 0) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    sb6.append(cz0.m.f224956b);
                    sb6.append('/');
                    java.lang.String str2 = x1Var.f213232b;
                    sb6.append(str2);
                    sb6.append("/config.json");
                    java.lang.String jsonFile = sb6.toString();
                    cz0.k kVar = new cz0.k();
                    kotlin.jvm.internal.o.g(jsonFile, "jsonFile");
                    try {
                        kVar.a(new org.json.JSONObject(com.tencent.mm.vfs.w6.M(jsonFile)));
                    } catch (java.lang.Exception e18) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BaseJsonObject", e18, "", new java.lang.Object[i18]);
                    }
                    if (kVar.d()) {
                        int i19 = kVar.f224949b;
                        int i27 = f224970b;
                        if (i19 > i27) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.MaasSdkResMgr", "keepPreRes: resCompatVersion: " + kVar.f224949b + ", resVersion: " + kVar.f224950c + ", subtype: " + P + ", sdkCompatVersion: " + i27);
                        } else if (i19 == i27) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.MaasSdkResMgr", "keepCompatRes: resCompatVersion: " + kVar.f224949b + ", resVersion: " + kVar.f224950c + ", subtype: " + P + ", sdkCompatVersion: " + i27);
                        } else if (z18) {
                            kotlin.jvm.internal.o.d(e17);
                            java.util.LinkedList linkedList = e17.f224954a;
                            if (!(linkedList instanceof java.util.Collection) || !linkedList.isEmpty()) {
                                java.util.Iterator it = linkedList.iterator();
                                while (it.hasNext()) {
                                    if ((((cz0.k) it.next()).f224948a == P ? z17 : i18) != 0) {
                                        i17 = z17;
                                        break;
                                    }
                                }
                            }
                            i17 = i18;
                            if (i17 != 0) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.MaasSdkResMgr", "keepChainRes: resCompatVersion: " + kVar.f224949b + ", resVersion: " + kVar.f224950c + ", subtype: " + P + ", sdkCompatVersion: " + i27);
                            } else {
                                com.tencent.mm.autogen.mmdata.rpt.MaasSdkResStruct maasSdkResStruct = new com.tencent.mm.autogen.mmdata.rpt.MaasSdkResStruct();
                                maasSdkResStruct.f59003d = i27;
                                maasSdkResStruct.f59006g = 5;
                                maasSdkResStruct.f59007h = P;
                                maasSdkResStruct.f59004e = kVar.f224949b;
                                maasSdkResStruct.f59009j = kVar.f224950c;
                                maasSdkResStruct.f59010k = maasSdkResStruct.b("Sha1", kVar.f224952e, z17);
                                com.tencent.mars.xlog.Log.i("MicroMsg.MaasSdkResMgr", "cleanLegacyRes: resCompatVersion: " + kVar.f224949b + ", resVersion: " + kVar.f224950c + ", subtype: " + P + ", sdkCompatVersion: " + i27);
                                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                                sb7.append(cz0.m.f224956b);
                                sb7.append('/');
                                sb7.append(str2);
                                bz0.k.a(maasSdkResStruct, com.tencent.mm.vfs.w6.g(sb7.toString(), z17));
                                ((yy.a) ((zy.r) ((jz5.n) f224975g).getValue())).getClass();
                                com.tencent.mm.pluginsdk.res.downloader.checkresupdate.p.c().getClass();
                                java.lang.String c17 = com.tencent.mm.pluginsdk.res.downloader.checkresupdate.c0.c(103, P);
                                com.tencent.mm.pluginsdk.res.downloader.model.l0 l0Var = com.tencent.mm.pluginsdk.res.downloader.model.j0.f189679a;
                                com.tencent.mm.pluginsdk.res.downloader.model.n0 e19 = l0Var.e(c17);
                                if (e19 == null) {
                                    com.tencent.mars.xlog.Log.i("MicroMsg.ResDownloader.CheckResUpdateHelper", "deleteCachedFilesAndResDbRecord, %d.%d, get null info, return", 103, java.lang.Integer.valueOf(P));
                                } else {
                                    com.tencent.mars.xlog.Log.i("MicroMsg.ResDownloader.CheckResUpdateHelper", "deleteCachedFilesAndResDbRecord, %d.%d, queried primeInfo { deleted = %b, filepath = %s, md5 = %s, compress = %b, encrypt = %b, originalMd5 = %s }", 103, java.lang.Integer.valueOf(P), java.lang.Boolean.valueOf(e19.field_deleted), e19.field_filePath, e19.field_md5, java.lang.Boolean.valueOf(e19.field_fileCompress), java.lang.Boolean.valueOf(e19.field_fileEncrypt), e19.field_originalMd5);
                                    java.lang.String str3 = e19.field_filePath;
                                    if (com.tencent.mm.vfs.w6.h(str3)) {
                                        com.tencent.mars.xlog.Log.i("MicroMsg.ResDownloader.CheckResUpdateHelper", "deleteCachedFilesAndResDbRecord, delete filepath = %s", str3);
                                    }
                                    java.lang.String str4 = e19.field_filePath + ".decompressed";
                                    if (com.tencent.mm.vfs.w6.h(str4)) {
                                        com.tencent.mars.xlog.Log.i("MicroMsg.ResDownloader.CheckResUpdateHelper", "deleteCachedFilesAndResDbRecord, delete decompressed filepath = %s", str4);
                                    }
                                    java.lang.String str5 = e19.field_filePath + ".decrypted";
                                    if (com.tencent.mm.vfs.w6.h(str5)) {
                                        com.tencent.mars.xlog.Log.i("MicroMsg.ResDownloader.CheckResUpdateHelper", "deleteCachedFilesAndResDbRecord, delete decrypted filepath = %s", str5);
                                    }
                                    if (l0Var.f189686e) {
                                        l0Var.f189682a.d(c17);
                                    }
                                    com.tencent.mars.xlog.Log.i("MicroMsg.ResDownloader.CheckResUpdateHelper", "deleteCachedFilesAndResDbRecord, delete res db record %d.%d", 103, java.lang.Integer.valueOf(P));
                                }
                            }
                        } else {
                            com.tencent.mars.xlog.Log.i("MicroMsg.MaasSdkResMgr", "cleanLegacyRes: no valid chain, skip clean res: resCompatVersion: " + kVar.f224949b + ", resVersion: " + kVar.f224950c + ", subtype: " + P + ", sdkCompatVersion: " + i27);
                        }
                    }
                }
                i18 = 0;
                z17 = 1;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSdkResMgr", "cleanLegacyRes: clean end");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0228 A[EDGE_INSN: B:44:0x0228->B:39:0x0228 BREAK  A[LOOP:0: B:17:0x00ce->B:37:0x00ce], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 570
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cz0.y.b():void");
    }

    public final void c(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSdkResMgr", "doCheck: from:" + str);
        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("maas_sdk");
        kotlin.jvm.internal.o.f(M, "getMMKV(...)");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        M.putLong("KEY_LAST_ENTRANCE_CHECK", java.lang.System.currentTimeMillis());
        ((yy.a) ((zy.r) ((jz5.n) f224975g).getValue())).wi(103);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0082 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final cz0.l d(java.util.List r20, int r21) {
        /*
            r19 = this;
            r0 = r20
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "findCompatibleChain: from "
            r1.<init>(r2)
            r2 = r21
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = "MicroMsg.MaasSdkResMgr"
            com.tencent.mars.xlog.Log.i(r3, r1)
            cz0.l r1 = new cz0.l
            r1.<init>()
            int r4 = r20.size()
            r5 = 0
            r6 = -1
            r7 = r5
        L23:
            if (r2 >= r4) goto La9
            java.lang.Object r8 = r0.get(r2)
            cz0.k r8 = (cz0.k) r8
            java.lang.String r9 = ", "
            if (r7 != 0) goto L37
            boolean r10 = r8.c()
            if (r10 == 0) goto L3e
            r6 = r2
            goto L3d
        L37:
            int r10 = r8.f224950c
            int r11 = r7.f224951d
            if (r10 != r11) goto L85
        L3d:
            r7 = r8
        L3e:
            if (r7 == 0) goto L82
            java.util.LinkedList r10 = r1.f224954a
            r10.add(r7)
            int r8 = r7.f224951d
            int r11 = r7.f224950c
            if (r8 != r11) goto L82
            java.util.Collections.reverse(r10)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r4 = "findCompatibleChain: find index:["
            r0.<init>(r4)
            r0.append(r6)
            r0.append(r9)
            r0.append(r2)
            java.lang.String r2 = "], subtype:["
            r0.append(r2)
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            cz0.s r16 = cz0.s.f224964d
            r17 = 31
            r18 = 0
            java.lang.String r2 = kz5.n0.g0(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r0.append(r2)
            r2 = 93
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.mars.xlog.Log.i(r3, r0)
            return r1
        L82:
            int r2 = r2 + 1
            goto L23
        L85:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "findCompatibleChain: version error "
            r1.<init>(r2)
            int r2 = r8.f224950c
            r1.append(r2)
            r1.append(r9)
            int r2 = r7.f224951d
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.mars.xlog.Log.w(r3, r1)
            int r6 = r6 + 1
            r1 = r19
            cz0.l r0 = r1.d(r0, r6)
            return r0
        La9:
            r1 = r19
            java.lang.String r0 = "findCompatibleChain: can not find any compatible chain"
            com.tencent.mars.xlog.Log.w(r3, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: cz0.y.d(java.util.List, int):cz0.l");
    }

    public final cz0.l e() {
        com.tencent.mm.autogen.mmdata.rpt.MaasSdkResStruct maasSdkResStruct = new com.tencent.mm.autogen.mmdata.rpt.MaasSdkResStruct();
        maasSdkResStruct.f59003d = f224970b;
        maasSdkResStruct.f59006g = 2;
        android.util.SparseArray sparseArray = new android.util.SparseArray();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String str = cz0.m.f224955a;
        boolean z17 = false;
        java.lang.Iterable<com.tencent.mm.vfs.x1> s17 = com.tencent.mm.vfs.w6.s(cz0.m.f224956b, false);
        if (s17 != null) {
            for (com.tencent.mm.vfs.x1 x1Var : s17) {
                int P = com.tencent.mm.sdk.platformtools.t8.P(x1Var.f213232b, -1);
                if (P >= 0) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    java.lang.String str2 = cz0.m.f224955a;
                    sb6.append(cz0.m.f224956b);
                    sb6.append('/');
                    sb6.append(x1Var.f213232b);
                    sb6.append("/config.json");
                    java.lang.String jsonFile = sb6.toString();
                    cz0.k kVar = new cz0.k();
                    kotlin.jvm.internal.o.g(jsonFile, "jsonFile");
                    try {
                        kVar.a(new org.json.JSONObject(com.tencent.mm.vfs.w6.M(jsonFile)));
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BaseJsonObject", e17, "", new java.lang.Object[0]);
                    }
                    if (kVar.d()) {
                        kVar.f224948a = P;
                        arrayList.add(kVar);
                        sparseArray.put(P, kVar);
                    }
                }
            }
        }
        if (arrayList.size() > 1) {
            kz5.g0.t(arrayList, new cz0.t());
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSdkResMgr", "mergeBin: list ".concat(kz5.n0.g0(arrayList, null, null, null, 0, null, cz0.u.f224965d, 31, null)));
        cz0.l d17 = d(arrayList, 0);
        if (d17 != null && d17.b() && d17.f224954a.size() > 0) {
            z17 = true;
        }
        bz0.k.a(maasSdkResStruct, z17);
        return d17;
    }

    public final java.lang.String f(java.lang.String str) {
        try {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("SHA1");
            if (com.tencent.mm.vfs.w6.j(str)) {
                byte[] bArr = new byte[4096];
                java.io.InputStream E = com.tencent.mm.vfs.w6.E(str);
                try {
                    for (int read = E.read(bArr); read > 0; read = E.read(bArr)) {
                        messageDigest.update(bArr, 0, read);
                    }
                    vz5.b.a(E, null);
                    byte[] digest = messageDigest.digest();
                    com.tencent.mars.xlog.Log.i("MicroMsg.MaasSdkResMgr", "getSha1: cost " + (java.lang.System.currentTimeMillis() - currentTimeMillis));
                    return com.tencent.mm.sdk.platformtools.t8.l(digest);
                } finally {
                }
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MaasSdkResMgr", th6, "getSha1 error", new java.lang.Object[0]);
        }
        return null;
    }

    public final java.lang.String g() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str = cz0.m.f224955a;
        sb6.append(cz0.m.f224958d);
        sb6.append("/libMaasSDK.so");
        return sb6.toString();
    }

    public final boolean h() {
        cz0.l e17;
        if (!com.tencent.mm.sdk.platformtools.z.f193115k) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MaasSdkResMgr", "isValid: work on arm64");
            return false;
        }
        if (com.tencent.mm.sdk.platformtools.a0.c()) {
            if (fp.q.b("maas")) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MaasSdkResMgr", "isValid: gp_version, has plugin installed");
                return true;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MaasSdkResMgr", "isValid: gp_version, plugin not installed");
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSdkResMgr", "isValid: isLoaded:" + f224971c);
        if (f224971c) {
            return true;
        }
        cz0.z zVar = cz0.z.f224976a;
        boolean c17 = zVar.c();
        int i17 = zVar.a().getInt("KEY_SDK_COMPAT_VERSION", 0);
        boolean j17 = com.tencent.mm.vfs.w6.j(g());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("mergeBin: need update ");
        sb6.append(c17);
        sb6.append(", ");
        sb6.append(i17);
        sb6.append(", target version ");
        int i18 = f224970b;
        sb6.append(i18);
        sb6.append(", currentSha1:");
        sb6.append(zVar.b());
        sb6.append(", file:");
        sb6.append(j17);
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSdkResMgr", sb6.toString());
        boolean z17 = (!c17 && i17 == i18 && j17) || ((e17 = e()) != null && e17.b() && e17.f224954a.size() > 0);
        if (!z17) {
            long j18 = zVar.a().getLong("KEY_LAST_ENTRANCE_CHECK", 0L);
            int h17 = bm5.o1.f22719a.h(new com.tencent.mm.repairer.config.mjpublisher.RepairerConfigMaasSdkResCheckInterval());
            long j19 = h17 > 0 ? h17 * 60000 : 43200000L;
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            long currentTimeMillis = java.lang.System.currentTimeMillis() - j18;
            com.tencent.mars.xlog.Log.i("MaasSdkResRecord", "needEntranceCheck: milliSecondsToNow:" + currentTimeMillis + " last:" + j18 + ", interval:" + j19);
            if (currentTimeMillis >= j19) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MaasSdkResMgr", "isValid invalid, do check");
                c("invalid");
            }
        }
        return z17;
    }

    public final boolean i() {
        boolean z17 = com.tencent.mm.sdk.platformtools.z.f193115k;
        int i17 = f224970b;
        if (!z17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MaasSdkResMgr", "load sdk only arm64");
            com.tencent.mm.autogen.mmdata.rpt.MaasSdkResStruct maasSdkResStruct = new com.tencent.mm.autogen.mmdata.rpt.MaasSdkResStruct();
            maasSdkResStruct.f59003d = i17;
            maasSdkResStruct.f59006g = 8;
            com.tencent.mars.xlog.Log.i("MicroMsg.MaasSdkResMgr", "unsupported device: not arm64");
            maasSdkResStruct.k();
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSdkResMgr", "loadSdk: isLoaded:" + f224971c);
        if (f224971c) {
            return true;
        }
        i95.m c17 = i95.n0.c(pp0.m0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        pp0.m0.n3((pp0.m0) c17, "mjtc_load_so", null, 2, null);
        java.util.concurrent.locks.ReentrantLock reentrantLock = f224972d;
        reentrantLock.lock();
        java.util.concurrent.locks.ReentrantLock reentrantLock2 = f224973e;
        reentrantLock2.lock();
        try {
            if (!f224971c) {
                b();
            }
            reentrantLock.unlock();
            reentrantLock2.unlock();
            com.tencent.mm.autogen.mmdata.rpt.MaasSdkResStruct maasSdkResStruct2 = new com.tencent.mm.autogen.mmdata.rpt.MaasSdkResStruct();
            maasSdkResStruct2.f59003d = i17;
            maasSdkResStruct2.f59006g = 1;
            cz0.z zVar = cz0.z.f224976a;
            int i18 = zVar.a().getInt("KEY_SDK_LOAD_START", 0) - zVar.a().getInt("KEY_SDK_LOAD_END", 0);
            maasSdkResStruct2.f59004e = zVar.a().getInt("KEY_SDK_COMPAT_VERSION", 0);
            maasSdkResStruct2.f59008i = i18;
            maasSdkResStruct2.f59009j = zVar.a().getInt("KEY_SDK_RES_VERSION", 0);
            maasSdkResStruct2.f59010k = maasSdkResStruct2.b("Sha1", zVar.b(), true);
            int i19 = zVar.a().getInt("KEY_SDK_COMPAT_VERSION", 0);
            com.tencent.mars.xlog.Log.i("MicroMsg.MaasSdkResMgr", "loadSdk: load fail count:" + i18 + "; compat version " + i19);
            if (i18 > 1) {
                bz0.k.a(maasSdkResStruct2, false);
                return false;
            }
            if (i19 != i17) {
                bz0.k.a(maasSdkResStruct2, false);
                return false;
            }
            if (!com.tencent.mm.vfs.w6.j(g())) {
                com.tencent.mars.xlog.Log.w("MicroMsg.MaasSdkResMgr", "loadSdk: so file not exist");
                bz0.k.a(maasSdkResStruct2, false);
                return false;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MaasSdkResMgr", "loadSdk: start soFilePath:" + g());
            f224971c = true;
            zVar.a().putInt("KEY_SDK_LOAD_START", zVar.a().getInt("KEY_SDK_LOAD_START", 0) + 1);
            if (kotlin.jvm.internal.o.b(bm5.o1.f22719a.b(bm5.h0.RepairerConfig_Maas_LoadSoFromSdCard_Int, 0), 1)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.MaasSdkResMgr", "loadSdkNoLock: load from sd card");
                pm0.v.X(cz0.x.f224968d);
                fp.d0.c(cz0.m.f224955a);
            } else {
                fp.d0.c(cz0.m.f224958d);
            }
            fp.d0.n("MaasSDK");
            zVar.a().putInt("KEY_SDK_LOAD_END", zVar.a().getInt("KEY_SDK_LOAD_END", 0) + 1);
            com.tencent.mars.xlog.Log.i("MicroMsg.MaasSdkResMgr", "loadSdk: end");
            bz0.k.a(maasSdkResStruct2, true);
            f224974f = "#MaasSdkVersion:" + com.tencent.maas.MJMaasNativeVersion.a();
            i95.m c18 = i95.n0.c(pp0.m0.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            pp0.m0.ee((pp0.m0) c18, "mjtc_load_so", null, null, null, 14, null);
            return true;
        } catch (java.lang.Throwable th6) {
            reentrantLock.unlock();
            reentrantLock2.unlock();
            throw th6;
        }
    }

    public final jz5.l j(int i17, java.lang.String str, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSdkResMgr", "unzipRes: subtype: " + i17 + ", path: " + str + ", source: " + i18);
        java.util.concurrent.locks.ReentrantLock reentrantLock = f224972d;
        reentrantLock.lock();
        try {
            jz5.l k17 = k(i17, str, i18);
            java.lang.String str2 = cz0.m.f224955a;
            com.tencent.mm.vfs.w6.f(cz0.m.f224957c);
            return k17;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final jz5.l k(int i17, java.lang.String str, int i18) {
        com.tencent.mm.autogen.mmdata.rpt.MaasSdkResStruct maasSdkResStruct = new com.tencent.mm.autogen.mmdata.rpt.MaasSdkResStruct();
        maasSdkResStruct.f59003d = f224970b;
        maasSdkResStruct.f59006g = 4;
        maasSdkResStruct.f59007h = i17;
        maasSdkResStruct.f59011l = i18;
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSdkResMgr", "unzipRes: subtype: " + i17 + ", path: " + str);
        if (str == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MaasSdkResMgr", "unzipRes: path is null");
            bz0.k.a(maasSdkResStruct, false);
            return new jz5.l(java.lang.Boolean.FALSE, null);
        }
        java.lang.String str2 = cz0.m.f224957c;
        com.tencent.mm.vfs.w6.f(str2);
        com.tencent.mm.vfs.w6.u(str2);
        int Q = com.tencent.mm.vfs.w6.Q(str, str2);
        if (Q != 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MaasSdkResMgr", "unzipRes: unzip failed " + Q);
            bz0.k.a(maasSdkResStruct, false);
            return new jz5.l(java.lang.Boolean.FALSE, null);
        }
        java.lang.String jsonFile = str2 + "/config.json";
        cz0.k kVar = new cz0.k();
        kotlin.jvm.internal.o.g(jsonFile, "jsonFile");
        try {
            kVar.a(new org.json.JSONObject(com.tencent.mm.vfs.w6.M(jsonFile)));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BaseJsonObject", e17, "", new java.lang.Object[0]);
        }
        if (!kVar.d()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MaasSdkResMgr", "unzipRes: config is invalid " + kVar);
            bz0.k.a(maasSdkResStruct, false);
            return new jz5.l(java.lang.Boolean.FALSE, null);
        }
        maasSdkResStruct.f59004e = kVar.f224949b;
        maasSdkResStruct.f59009j = kVar.f224950c;
        maasSdkResStruct.f59010k = maasSdkResStruct.b("Sha1", kVar.f224952e, true);
        java.lang.String f17 = f(str2 + "/bin");
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSdkResMgr", "unzipRes fileSha1:" + f17 + " config.sha1:" + kVar.f224952e);
        if (!com.tencent.mm.sdk.platformtools.t8.D0(f17, kVar.f224952e)) {
            bz0.k.a(maasSdkResStruct, false);
            com.tencent.mars.xlog.Log.i("MicroMsg.MaasSdkResMgr", "unzipRes failed");
            return new jz5.l(java.lang.Boolean.FALSE, null);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str3 = cz0.m.f224956b;
        sb6.append(str3);
        sb6.append('/');
        sb6.append(i17);
        java.lang.String sb7 = sb6.toString();
        com.tencent.mm.vfs.w6.f(sb7);
        com.tencent.mm.vfs.w6.u(str3);
        com.tencent.mm.vfs.w6.b(str2, sb7);
        if (kVar.c()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MaasSdkResMgr", "unzipRes onResUpdate");
            com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("maas_sdk");
            kotlin.jvm.internal.o.f(M, "getMMKV(...)");
            M.putLong("KEY_RES_UPDATE_TIME", java.lang.System.currentTimeMillis());
        }
        bz0.k.a(maasSdkResStruct, true);
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasSdkResMgr", "unzipRes success");
        return new jz5.l(java.lang.Boolean.TRUE, kVar);
    }
}
