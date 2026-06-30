package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public class h8 extends com.tencent.mm.vfs.m0 {

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.vfs.q2 f212983e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f212984f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.vfs.VideoGCFileSystem f212985g;

    public h8(com.tencent.mm.vfs.VideoGCFileSystem videoGCFileSystem, com.tencent.mm.vfs.q2 q2Var) {
        this.f212985g = videoGCFileSystem;
        this.f212983e = q2Var;
        this.f212984f = java.util.Collections.singletonList(q2Var);
    }

    @Override // com.tencent.mm.vfs.m0
    public java.util.List K() {
        return this.f212984f;
    }

    @Override // com.tencent.mm.vfs.m0
    public com.tencent.mm.vfs.q2 L(java.lang.String str, int i17) {
        return this.f212983e;
    }

    public final boolean O(com.tencent.mm.vfs.x1 x1Var) {
        if (!com.tencent.mm.vfs.VideoGCFileSystem.f212758f || java.lang.System.currentTimeMillis() - x1Var.f213235e <= 86400000) {
            return false;
        }
        boolean b17 = x1Var.b(true);
        com.tencent.mars.xlog.Log.i("VFS.VideoGCFileSystem", "deleteFile, fe = " + x1Var.f213231a + ", ret = " + b17 + ", modifiedTime = " + x1Var.f213235e);
        return b17;
    }

    @Override // com.tencent.mm.vfs.m0, com.tencent.mm.vfs.a, com.tencent.mm.vfs.q2
    public void q(android.os.CancellationSignal cancellationSignal) {
        java.lang.String str;
        long j17;
        java.lang.String str2;
        long j18;
        java.util.Iterator it;
        int i17;
        java.lang.String str3 = "video-clean";
        long s17 = com.tencent.mm.vfs.e8.s("video-clean");
        if (gm0.j1.u().k()) {
            jx3.f.INSTANCE.kvStat(22046, "video-hasCorruptedDB");
            com.tencent.mars.xlog.Log.i("VFS.VideoGCFileSystem", "hasCorruptedDB, skip cleanup.");
        } else if (gm0.j1.u().a()) {
            jx3.f.INSTANCE.kvStat(22046, "video-C2CToBeRescued");
            com.tencent.mars.xlog.Log.i("VFS.VideoGCFileSystem", "c2cErrorToBeRescued, skip cleanup.");
        } else if (!(z65.c.a() || !"0".equals(j62.e.g().a("clicfg_wild_file_video_scan", "0", false, true)))) {
            com.tencent.mars.xlog.Log.i("VFS.VideoGCFileSystem", "X Switch disabled, skip cleanup.");
        } else if (s17 < 864000000) {
            com.tencent.mars.xlog.Log.i("VFS.VideoGCFileSystem", "Image cleanup interval not match, skip cleanup. %d / %d", java.lang.Long.valueOf(s17), 864000000L);
        } else {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.tencent.mm.vfs.q2[] q2VarArr = {new com.tencent.mm.vfs.NativeFileSystem("${sdTo}/MicroMsg/${accountSd}/video").b(com.tencent.mm.vfs.a3.f212781a.c()), this};
            com.tencent.mm.vfs.VideoGCFileSystem.f212758f = z65.c.a() || !"0".equals(j62.e.g().a("clicfg_wild_file_video_clean", "0", false, true));
            com.tencent.mars.xlog.Log.i("VFS.VideoGCFileSystem", "isCleanExpt = " + com.tencent.mm.vfs.VideoGCFileSystem.f212758f);
            cancellationSignal.throwIfCanceled();
            l75.k0 k0Var = gm0.j1.u().f273153f;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            try {
                d95.f.q();
                android.database.Cursor Bi = ((ot0.g3) ((com.tencent.mm.app.w2) i95.n0.c(com.tencent.mm.app.w2.class))).Bi();
                while (Bi.moveToNext()) {
                    arrayList.add(Bi.getString(0));
                }
                Bi.close();
                d95.f.w();
                com.tencent.mars.xlog.Log.i("VFS.VideoGCFileSystem", "videoPathList size = " + arrayList.size());
                int i18 = 0;
                int i19 = 0;
                int i27 = 0;
                int i28 = 0;
                int i29 = 0;
                long j19 = 0;
                long j27 = 0;
                long j28 = 0;
                for (int i37 = 2; i19 < i37; i37 = 2) {
                    java.lang.Iterable o17 = com.tencent.mm.vfs.e8.o(q2VarArr[i19], "");
                    if (o17 == null) {
                        o17 = java.util.Collections.emptyList();
                    }
                    java.util.Iterator it6 = o17.iterator();
                    int i38 = i18;
                    while (true) {
                        if (!it6.hasNext()) {
                            str = str3;
                            j17 = currentTimeMillis;
                            break;
                        }
                        com.tencent.mm.vfs.x1 x1Var = (com.tencent.mm.vfs.x1) it6.next();
                        if (cancellationSignal.isCanceled()) {
                            com.tencent.mars.xlog.Log.i("VFS.VideoGCFileSystem", "cs.isCanceled break");
                            str = str3;
                            j17 = currentTimeMillis;
                            i29 = 1;
                            break;
                        }
                        if (!x1Var.f213231a.startsWith(".ref")) {
                            if (x1Var.f213236f) {
                                str2 = str3;
                                j18 = currentTimeMillis;
                                it = it6;
                            } else {
                                java.lang.String str4 = x1Var.f213232b;
                                boolean contains = str4.contains(".");
                                it = it6;
                                java.lang.String str5 = x1Var.f213231a;
                                str2 = str3;
                                j18 = currentTimeMillis;
                                long j29 = x1Var.f213234d;
                                if (contains) {
                                    java.lang.String substring = str4.substring(0, str4.lastIndexOf("."));
                                    if (substring.startsWith("send")) {
                                        substring = substring.substring(4);
                                    }
                                    if (substring.endsWith(ya.b.ORIGIN)) {
                                        i17 = 0;
                                        substring = substring.substring(0, substring.length() - 6);
                                    } else {
                                        i17 = 0;
                                    }
                                    if (substring.endsWith("_hd")) {
                                        substring = substring.substring(i17, substring.length() - 3);
                                        i27++;
                                        j28 += j29;
                                    }
                                    try {
                                        if (!arrayList.contains(substring)) {
                                            android.database.Cursor B = k0Var.B("SELECT filename FROM massendinfo WHERE filename=?", new java.lang.String[]{substring});
                                            B.moveToFirst();
                                            long count = B.getCount();
                                            B.close();
                                            if (!(count != 0)) {
                                                i28++;
                                                j19 += j29;
                                                if (O(x1Var)) {
                                                    i38++;
                                                    j27 += j29;
                                                }
                                                com.tencent.mars.xlog.Log.i("VFS.VideoGCFileSystem", "videoDataWildFile1 path = " + str5 + ", diskSpace = " + j29 + ", fe.modifiedTime = " + x1Var.f213235e);
                                            }
                                        }
                                    } catch (java.lang.Throwable th6) {
                                        com.tencent.mars.xlog.Log.e("VFS.VideoGCFileSystem", "db error e = " + th6.getMessage());
                                    }
                                } else {
                                    com.tencent.mars.xlog.Log.i("VFS.VideoGCFileSystem", "videoDataWildFile0 path = " + str5 + ", diskSpace = " + j29);
                                    i28++;
                                    j19 += j29;
                                    if (O(x1Var)) {
                                        i38++;
                                        j27 += j29;
                                    }
                                }
                            }
                            it6 = it;
                            str3 = str2;
                            currentTimeMillis = j18;
                        }
                    }
                    i19++;
                    i18 = i38;
                    str3 = str;
                    currentTimeMillis = j17;
                }
                java.lang.String str6 = str3;
                long j37 = currentTimeMillis;
                arrayList.clear();
                long j38 = com.tencent.mm.sdk.platformtools.o4.L().getLong("extreme_storage_wechat_total", -1L);
                long j39 = j19;
                int i39 = j38 != -1 ? (int) ((((float) j39) / ((float) j38)) * 100.0f) : -1;
                com.tencent.mars.xlog.Log.i("VFS.VideoGCFileSystem", " > deletedFiles: %d, deletedSize: %d\n > keptFiles: %d, keptSize: %d\n > illegalFiles: %d, illegalSize: %d\n > wildFiles: %d, wildSize: %d\n > tempFiles: %d, tempSize: %d\n > noMediaFilesws: %d, noMediaSize: %d > totalWildFile: %d, totalWildSize: %d", java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(j27), 0, 0L, java.lang.Integer.valueOf(i27), java.lang.Long.valueOf(j28), 0, 0L, 0, 0L, 0, 0L, java.lang.Integer.valueOf(i28), java.lang.Long.valueOf(j39));
                long currentTimeMillis2 = java.lang.System.currentTimeMillis() - j37;
                com.tencent.mars.xlog.Log.i("VFS.VideoGCFileSystem", "duration = " + currentTimeMillis2);
                jx3.f.INSTANCE.d(22046, "video-v3", java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(j27), 0, 0L, java.lang.Integer.valueOf(i27), java.lang.Long.valueOf(j28), 0, 0L, 0, 0L, 0, 0L, java.lang.Integer.valueOf(i28), java.lang.Long.valueOf(j39), java.lang.Integer.valueOf(i29), java.lang.Integer.valueOf(i39), java.lang.Long.valueOf(currentTimeMillis2));
                if (i29 == 0) {
                    com.tencent.mm.sdk.platformtools.o4.L().putLong("recent_video_wild_file_size", j39);
                    com.tencent.mm.vfs.e8.t(str6);
                    if (j39 > 209715200) {
                        com.tencent.mm.sdk.platformtools.o4.L().putLong("extreme_storage_video_wild_file_size", j39);
                    } else {
                        com.tencent.mm.sdk.platformtools.o4.L().putLong("extreme_storage_video_wild_file_size", -1L);
                    }
                }
            } catch (java.lang.Throwable th7) {
                try {
                    com.tencent.mm.vfs.e8.t("video-clean");
                    com.tencent.mars.xlog.Log.e("VFS.VideoGCFileSystem", "fill videoPathList error : " + th7.getMessage());
                } finally {
                    d95.f.w();
                }
            }
        }
        cancellationSignal.throwIfCanceled();
        super.q(cancellationSignal);
    }

    @Override // com.tencent.mm.vfs.a
    public java.lang.String toString() {
        return "videoGC <- " + this.f212983e;
    }

    @Override // com.tencent.mm.vfs.q2
    public com.tencent.mm.vfs.FileSystem y() {
        return this.f212985g;
    }
}
