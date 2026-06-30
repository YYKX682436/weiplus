package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public class c1 implements com.tencent.mm.vfs.v5 {

    /* renamed from: f, reason: collision with root package name */
    public static final int f212847f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.Object f212848g;

    /* renamed from: h, reason: collision with root package name */
    public static java.util.Map f212849h;

    /* renamed from: i, reason: collision with root package name */
    public static java.util.Map f212850i;

    /* renamed from: j, reason: collision with root package name */
    public static boolean f212851j;

    /* renamed from: k, reason: collision with root package name */
    public static java.util.Set f212852k;

    /* renamed from: l, reason: collision with root package name */
    public static java.util.Set f212853l;

    /* renamed from: m, reason: collision with root package name */
    public static java.util.Set f212854m;

    /* renamed from: n, reason: collision with root package name */
    public static java.util.Set f212855n;

    /* renamed from: o, reason: collision with root package name */
    public static java.util.Set f212856o;

    /* renamed from: p, reason: collision with root package name */
    public static java.util.Set f212857p;

    /* renamed from: q, reason: collision with root package name */
    public static final java.util.Set f212858q;

    /* renamed from: r, reason: collision with root package name */
    public static final com.tencent.mm.vfs.x2 f212859r;

    /* renamed from: s, reason: collision with root package name */
    public static final java.util.regex.Pattern f212860s;

    /* renamed from: t, reason: collision with root package name */
    public static final java.lang.String[] f212861t;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f212862a;

    /* renamed from: b, reason: collision with root package name */
    public final int f212863b;

    /* renamed from: c, reason: collision with root package name */
    public final int f212864c;

    /* renamed from: d, reason: collision with root package name */
    public final long f212865d;

    /* renamed from: e, reason: collision with root package name */
    public final long f212866e;

    static {
        long nanoTime = java.lang.System.nanoTime();
        java.util.Random random = new java.util.Random();
        random.setSeed(nanoTime);
        f212847f = random.nextInt();
        f212848g = new java.lang.Object();
        f212849h = new java.util.HashMap();
        f212851j = false;
        f212852k = new java.util.HashSet();
        f212853l = new java.util.HashSet();
        f212854m = new java.util.HashSet();
        f212855n = new java.util.HashSet();
        f212856o = new java.util.HashSet();
        f212857p = new java.util.HashSet();
        f212858q = new java.util.HashSet();
        f212859r = new com.tencent.mm.vfs.t0();
        f212860s = java.util.regex.Pattern.compile("[0-9a-f]{32}(?:temp[0-9]+)?");
        f212861t = new java.lang.String[]{".auth_cache", "app_execdir", "app_font", "app_midaslib_0", "app_midaslib_1", "app_midasplugins", "app_qmsp", "app_sslcache", "app_tbs_common_share", "app_turingdfp", "app_turingfd", "app_turingsmi", "cert", "code_cache", "extqbar", "face_detect", "huaweiks", "ilink", "no_backup", "scan_goods", com.tencent.tinker.loader.shareutil.ShareConstants.PATCH_TEMP_DIRECTORY_NAME, "xweb_lock"};
    }

    public c1(java.lang.String str, int i17, int i18, long j17, long j18) {
        this.f212862a = str;
        this.f212863b = i17;
        this.f212864c = i18;
        this.f212865d = j17;
        this.f212866e = j18;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0220 A[Catch: all -> 0x0418, TryCatch #1 {, blocks: (B:5:0x000d, B:6:0x0037, B:8:0x003d, B:10:0x00c1, B:11:0x00e8, B:18:0x00f6, B:20:0x010a, B:21:0x021c, B:23:0x0220, B:31:0x011a, B:33:0x0127, B:35:0x0135, B:37:0x0144, B:38:0x014d, B:40:0x015b, B:41:0x0164, B:43:0x0172, B:44:0x017b, B:46:0x018a, B:50:0x01a9, B:54:0x01be, B:57:0x01cf, B:61:0x01d7, B:74:0x01f0, B:75:0x01f9, B:76:0x00c5, B:78:0x00d0, B:80:0x00db, B:82:0x00e5, B:84:0x0242, B:85:0x0267, B:87:0x026d, B:89:0x027f, B:91:0x0289, B:98:0x029a), top: B:4:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x022e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b() {
        /*
            Method dump skipped, instructions count: 1065
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.vfs.c1.b():void");
    }

    public static void c() {
        java.io.File file = new java.io.File(lp0.b.X());
        jx3.f fVar = jx3.f.INSTANCE;
        fVar.d(21388, "@TotalSpace-Data", 0, 0, file.getAbsolutePath(), java.lang.Long.valueOf(file.getUsableSpace()), 0, 0, 0, java.lang.Long.valueOf(file.getTotalSpace()), 0, 0, 0, 0, com.tencent.mm.sdk.platformtools.z.f193109e);
        java.io.File file2 = new java.io.File(lp0.b.e0());
        fVar.d(21388, "@TotalSpace-SDCard", 0, 0, file2.getAbsolutePath(), java.lang.Long.valueOf(file2.getUsableSpace()), 0, 0, 0, java.lang.Long.valueOf(file2.getTotalSpace()), 0, 0, 0, 0, com.tencent.mm.sdk.platformtools.z.f193109e);
    }

    public static void d() {
        long j17;
        boolean z17;
        java.util.Iterator it;
        boolean z18 = "1".equals(j62.e.g().j("clicfg_diskspace_force_report", "0", true, true)) || j() || z65.c.a();
        synchronized (f212848g) {
            java.util.Map map = f212849h;
            if (map == null) {
                return;
            }
            java.util.Iterator it6 = new java.util.HashMap(map).values().iterator();
            while (true) {
                j17 = 0;
                if (!it6.hasNext()) {
                    break;
                }
                com.tencent.mm.vfs.a1 a1Var = (com.tencent.mm.vfs.a1) it6.next();
                java.util.Iterator it7 = ((java.util.HashSet) f212858q).iterator();
                while (true) {
                    if (!it7.hasNext()) {
                        z17 = false;
                        break;
                    } else if (((com.tencent.mm.vfs.b1) it7.next()).c(a1Var)) {
                        z17 = true;
                        break;
                    }
                }
                if (!z17) {
                    if (!z18 || a1Var.f212769e <= 0) {
                        it = it6;
                    } else {
                        it = it6;
                        jx3.f.INSTANCE.d(31184, a1Var.f212765a, java.lang.Integer.valueOf(a1Var.f212766b), java.lang.Integer.valueOf(a1Var.f212767c), a1Var.f212768d, java.lang.Long.valueOf(a1Var.f212769e), java.lang.Integer.valueOf(a1Var.f212770f), java.lang.Integer.valueOf(a1Var.f212771g), java.lang.Integer.valueOf(a1Var.f212772h), java.lang.Long.valueOf(a1Var.f212773i), java.lang.Long.valueOf(a1Var.f212774j), com.tencent.mm.sdk.platformtools.z.f193109e);
                    }
                    com.tencent.mars.xlog.Log.i("VFS.DiskFileStatistics", "Daily KV > name: %s, type: %d, flags: %d, path: %s, totalSize: %d, fileCount: %d, dirCount: %d, maxDepth: %d, maxFileSize: %d, filesAge: %d", a1Var.f212765a, java.lang.Integer.valueOf(a1Var.f212766b), java.lang.Integer.valueOf(a1Var.f212767c), a1Var.f212768d, java.lang.Long.valueOf(a1Var.f212769e), java.lang.Integer.valueOf(a1Var.f212770f), java.lang.Integer.valueOf(a1Var.f212771g), java.lang.Integer.valueOf(a1Var.f212772h), java.lang.Long.valueOf(a1Var.f212773i), java.lang.Long.valueOf(a1Var.f212774j));
                    it6 = it;
                }
            }
            java.util.Iterator it8 = ((java.util.HashSet) f212858q).iterator();
            while (it8.hasNext()) {
                com.tencent.mm.vfs.a1 b17 = ((com.tencent.mm.vfs.b1) it8.next()).b();
                if (b17 != null) {
                    if (z18 && b17.f212769e > j17) {
                        jx3.f.INSTANCE.d(31184, b17.f212765a, java.lang.Integer.valueOf(b17.f212766b), java.lang.Integer.valueOf(b17.f212767c), b17.f212768d, java.lang.Long.valueOf(b17.f212769e), java.lang.Integer.valueOf(b17.f212770f), java.lang.Integer.valueOf(b17.f212771g), java.lang.Integer.valueOf(b17.f212772h), java.lang.Long.valueOf(b17.f212773i), java.lang.Long.valueOf(b17.f212774j), com.tencent.mm.sdk.platformtools.z.f193109e);
                    }
                    com.tencent.mars.xlog.Log.i("VFS.DiskFileStatistics", "Daily KV > name: %s, type: %d, flags: %d, path: %s, totalSize: %d, fileCount: %d, dirCount: %d, maxDepth: %d, maxFileSize: %d, filesAge: %d", b17.f212765a, java.lang.Integer.valueOf(b17.f212766b), java.lang.Integer.valueOf(b17.f212767c), b17.f212768d, java.lang.Long.valueOf(b17.f212769e), java.lang.Integer.valueOf(b17.f212770f), java.lang.Integer.valueOf(b17.f212771g), java.lang.Integer.valueOf(b17.f212772h), java.lang.Long.valueOf(b17.f212773i), java.lang.Long.valueOf(b17.f212774j));
                }
                j17 = 0;
            }
        }
    }

    public static void e(com.tencent.mm.vfs.t2 t2Var, java.lang.String str, int i17, java.lang.String[] strArr, java.util.Set set, boolean z17, boolean z18) {
        java.util.Map map;
        com.tencent.mm.vfs.NativeFileSystem nativeFileSystem;
        java.lang.Iterable<com.tencent.mm.vfs.x1> list;
        java.lang.String[] strArr2 = strArr;
        java.util.Map c17 = com.tencent.mm.vfs.a3.f212781a.c();
        int length = strArr2.length;
        int i18 = 0;
        while (i18 < length) {
            java.lang.String str2 = strArr2[i18];
            java.util.ArrayList arrayList = new java.util.ArrayList();
            try {
                nativeFileSystem = new com.tencent.mm.vfs.NativeFileSystem(str2);
                list = nativeFileSystem.b(c17).list("");
            } catch (java.lang.Exception unused) {
            }
            if (list != null) {
                for (com.tencent.mm.vfs.x1 x1Var : list) {
                    try {
                        boolean z19 = x1Var.f213236f;
                        java.lang.String str3 = x1Var.f213232b;
                        if (z19) {
                            try {
                                if (!set.contains(str3)) {
                                    if (f212860s.matcher(str3).matches() == z17) {
                                        try {
                                            arrayList.add(str3);
                                        } catch (java.lang.Exception unused2) {
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            } catch (java.lang.Exception unused3) {
                                map = c17;
                                i18++;
                                strArr2 = strArr;
                                c17 = map;
                            }
                        }
                    } catch (java.lang.Exception unused4) {
                    }
                }
                if (z18) {
                    arrayList.add("\u0000");
                }
                if (!arrayList.isEmpty()) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.util.Iterator it = set.iterator();
                    while (it.hasNext()) {
                        java.lang.String str4 = (java.lang.String) it.next();
                        if (str4.indexOf(47) >= 0) {
                            arrayList2.add(str4);
                        }
                    }
                    com.tencent.mm.vfs.StatisticsFileSystem statisticsFileSystem = new com.tencent.mm.vfs.StatisticsFileSystem(nativeFileSystem, true, arrayList, arrayList2);
                    map = c17;
                    try {
                        statisticsFileSystem.a(str + str2.replace('$', '#'), new com.tencent.mm.vfs.c1(str2, i17, 0, 0L, 0L));
                        try {
                            t2Var.c(str + str2, statisticsFileSystem);
                        } catch (java.lang.Exception unused5) {
                        }
                    } catch (java.lang.Exception unused6) {
                    }
                    i18++;
                    strArr2 = strArr;
                    c17 = map;
                }
                map = c17;
                i18++;
                strArr2 = strArr;
                c17 = map;
            }
            map = c17;
            i18++;
            strArr2 = strArr;
            c17 = map;
        }
    }

    public static void f(int i17) {
        com.tencent.mm.storage.u3 u3Var;
        int i18;
        if (i17 == 1) {
            u3Var = com.tencent.mm.storage.u3.USERINFO_C2C_RESCUE_OTHER_ACCOUNT_VOICE2_HIT_INT_SYNC;
            i18 = 0;
        } else if (i17 == 2) {
            u3Var = com.tencent.mm.storage.u3.USERINFO_C2C_RESCUE_OTHER_ACCOUNT_VIDEO_HIT_INT_SYNC;
            i18 = 1;
        } else if (i17 == 3) {
            u3Var = com.tencent.mm.storage.u3.USERINFO_C2C_RESCUE_OTHER_ACCOUNT_RECORD_HIT_INT_SYNC;
            i18 = 5;
        } else {
            if (i17 != 4) {
                return;
            }
            u3Var = com.tencent.mm.storage.u3.USERINFO_C2C_RESCUE_OTHER_ACCOUNT_ATTACHMENT_HIT_INT_SYNC;
            i18 = 6;
        }
        try {
            gm0.j1.u().c().x(u3Var, 1);
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_C2C_OTHER_ACCOUNT_WRONG_MIGRANT_INT_SYNC, 1);
            jx3.f.INSTANCE.t(1912, i18);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("VFS.DiskFileStatistics", e17, "Cannot mark wrong migration", new java.lang.Object[0]);
        }
    }

    public static void g(java.lang.String str, com.tencent.mm.vfs.a1 a1Var) {
        synchronized (f212848g) {
            java.util.Map map = f212850i;
            if (map == null) {
                map = f212849h;
            }
            map.put(str, a1Var);
        }
    }

    public static void h(java.lang.String str, java.lang.String str2, int i17) {
        boolean z17 = (i17 & 2048) != 0;
        boolean z18 = !z17 && (i17 & 4) == 0;
        boolean z19 = (i17 & 1) != 0;
        boolean z27 = (i17 & 2) != 0;
        synchronized (f212848g) {
            if (z19) {
                (z18 ? f212854m : f212853l).add(str2);
            }
            if (z27) {
                if (z18) {
                    f212855n.add(str2);
                    if (str != null) {
                        f212852k.add(str);
                    }
                } else if (z17 && str2.startsWith("files/")) {
                    f212857p.add(str2.substring(6));
                } else {
                    f212856o.add(str2);
                }
            }
        }
    }

    public static void i(com.tencent.mm.vfs.b1 b1Var) {
        synchronized (f212848g) {
            ((java.util.HashSet) f212858q).add(b1Var);
        }
    }

    public static boolean j() {
        int P = com.tencent.mm.sdk.platformtools.t8.P(j62.e.g().a("clicfg_vfs_statistics_sampling_factor", java.lang.String.valueOf(1024), false, false), 1024);
        return ((gm0.j1.b().h() ^ f212847f) ^ com.tencent.mm.sdk.platformtools.z.f193112h) % (P != 0 ? P : 1024) == 0;
    }

    public static void k(long j17, java.lang.String str) {
        try {
            com.tencent.mars.xlog.Log.i("VFS.DiskFileStatistics", "reportPercentageHeavyUser, wechatTotalSize = " + j17 + ", info = " + str);
            android.os.StatFs statFs = new android.os.StatFs(android.os.Environment.getDataDirectory().getPath());
            long availableBytes = statFs.getAvailableBytes();
            long blockSizeLong = statFs.getBlockSizeLong() * statFs.getBlockCountLong();
            android.os.StatFs statFs2 = new android.os.StatFs(lp0.b.e0());
            long availableBytes2 = statFs2.getAvailableBytes();
            long blockSizeLong2 = statFs2.getBlockSizeLong() * statFs2.getBlockCountLong();
            int round = java.lang.Math.round((((float) j17) * 100.0f) / ((float) java.lang.Math.max(blockSizeLong, blockSizeLong2)));
            com.tencent.mars.xlog.Log.i("VFS.DiskFileStatistics", "reportPercentageHeavyUser, dataFreeSpace = " + availableBytes + ", sdcardFreeSpace = " + availableBytes2);
            com.tencent.mars.xlog.Log.i("VFS.DiskFileStatistics", "reportPercentageHeavyUser, dataTotalSpace = " + blockSizeLong + ", sdcardTotalSpace = " + blockSizeLong2);
            com.tencent.mars.xlog.Log.i("VFS.DiskFileStatistics", "reportPercentageHeavyUser, percentageData = " + round + ", percentageSdcard = " + round);
            com.tencent.mm.sdk.platformtools.o4.L().B("daily_storage_available_bytes", availableBytes);
            if (round > 50) {
                com.tencent.mm.sdk.platformtools.o4.L().A("extreme_storage_wechat_percentage", round);
            } else {
                com.tencent.mm.sdk.platformtools.o4.L().A("extreme_storage_wechat_percentage", -1);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("VFS.DiskFileStatistics", "reportPercentageHeavyUser error : " + th6.getMessage());
        }
    }

    @Override // com.tencent.mm.vfs.v5
    public void a(java.lang.String str, com.tencent.mm.vfs.FileSystem fileSystem, int i17, java.util.Map map) {
        java.lang.String str2 = (java.lang.String) map.get("relPath");
        boolean equals = java.lang.Boolean.TRUE.equals(map.get("recursive"));
        if (str2 == null) {
            return;
        }
        boolean isEmpty = str2.isEmpty();
        java.lang.String str3 = this.f212862a;
        if (!isEmpty) {
            str3 = str3 + '/' + str2;
        } else if (!equals) {
            str3 = str3 + "/(root)";
        }
        g(str3 + '|' + str, new com.tencent.mm.vfs.a1(str, this.f212863b, this.f212864c, str3, ((java.lang.Long) map.get("totalSize")).longValue(), ((java.lang.Integer) map.get("fileCount")).intValue(), ((java.lang.Integer) map.get("dirCount")).intValue(), ((java.lang.Integer) map.get("maxDepth")).intValue(), ((java.lang.Long) map.get("maxFileSize")).longValue(), ((java.lang.Long) map.get("averageAge")).longValue(), this.f212865d, this.f212866e));
    }
}
