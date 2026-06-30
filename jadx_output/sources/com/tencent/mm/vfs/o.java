package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public class o extends com.tencent.mm.vfs.m0 {

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.vfs.q2 f213097e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f213098f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.vfs.AttachmentGCFileSystem f213099g;

    public o(com.tencent.mm.vfs.AttachmentGCFileSystem attachmentGCFileSystem, com.tencent.mm.vfs.q2 q2Var) {
        this.f213099g = attachmentGCFileSystem;
        this.f213097e = q2Var;
        this.f213098f = java.util.Collections.singletonList(q2Var);
    }

    @Override // com.tencent.mm.vfs.m0
    public java.util.List K() {
        return this.f213098f;
    }

    @Override // com.tencent.mm.vfs.m0
    public com.tencent.mm.vfs.q2 L(java.lang.String str, int i17) {
        return this.f213097e;
    }

    public final boolean O(com.tencent.mm.vfs.x1 x1Var) {
        if (!com.tencent.mm.vfs.AttachmentGCFileSystem.f212694f || java.lang.System.currentTimeMillis() - x1Var.f213235e <= 86400000) {
            return false;
        }
        boolean b17 = x1Var.b(true);
        com.tencent.mars.xlog.Log.i("VFS.AttachmentGCFileSystem", "deleteFile, fe = " + x1Var.f213231a + ", ret = " + b17 + ", modifiedTime = " + x1Var.f213235e);
        return b17;
    }

    @Override // com.tencent.mm.vfs.m0, com.tencent.mm.vfs.a, com.tencent.mm.vfs.q2
    public void q(android.os.CancellationSignal cancellationSignal) {
        long j17;
        int i17;
        java.lang.String str;
        long j18;
        java.lang.String str2;
        long j19;
        java.lang.String str3;
        java.util.Iterator it;
        com.tencent.mm.vfs.q2[] q2VarArr;
        java.lang.String str4 = "attachment-clean";
        long s17 = com.tencent.mm.vfs.e8.s("attachment-clean");
        if (gm0.j1.u().k()) {
            jx3.f.INSTANCE.kvStat(22046, "attachment-hasCorruptedDB");
            com.tencent.mars.xlog.Log.i("VFS.AttachmentGCFileSystem", "hasCorruptedDB, skip cleanup.");
        } else if (gm0.j1.u().a()) {
            jx3.f.INSTANCE.kvStat(22046, "attachment-C2CToBeRescued");
            com.tencent.mars.xlog.Log.i("VFS.AttachmentGCFileSystem", "c2cErrorToBeRescued, skip cleanup.");
        } else {
            int i18 = 0;
            int i19 = 1;
            if (!(z65.c.a() || !"0".equals(j62.e.g().a("clicfg_wild_file_attachment_scan", "0", false, true)))) {
                com.tencent.mars.xlog.Log.i("VFS.AttachmentGCFileSystem", "X Switch disabled, skip cleanup.");
            } else if (s17 < 950400000) {
                com.tencent.mars.xlog.Log.i("VFS.AttachmentGCFileSystem", "Image cleanup interval not match, skip cleanup. %d / %d", java.lang.Long.valueOf(s17), 950400000L);
            } else {
                com.tencent.mars.xlog.Log.i("VFS.AttachmentGCFileSystem", "doMaintenance");
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                com.tencent.mm.vfs.q2[] q2VarArr2 = {new com.tencent.mm.vfs.NativeFileSystem("${sdTo}/MicroMsg/${accountSd}/attachment").b(com.tencent.mm.vfs.a3.f212781a.c()), this};
                com.tencent.mm.vfs.AttachmentGCFileSystem.f212694f = z65.c.a() || !"0".equals(j62.e.g().a("clicfg_wild_file_attachment_clean", "0", false, true));
                com.tencent.mars.xlog.Log.i("VFS.AttachmentGCFileSystem", "isCleanExpt = " + com.tencent.mm.vfs.AttachmentGCFileSystem.f212694f);
                cancellationSignal.throwIfCanceled();
                l75.k0 k0Var = gm0.j1.u().f273153f;
                int i27 = 0;
                int i28 = 0;
                int i29 = 0;
                int i37 = 0;
                long j27 = 0;
                long j28 = 0;
                for (int i38 = 2; i28 < i38; i38 = 2) {
                    java.lang.String str5 = "";
                    java.lang.Iterable o17 = com.tencent.mm.vfs.e8.o(q2VarArr2[i28], "");
                    if (o17 == null) {
                        o17 = java.util.Collections.emptyList();
                    }
                    java.util.Iterator it6 = o17.iterator();
                    int i39 = i29;
                    long j29 = j28;
                    long j37 = j27;
                    int i47 = i27;
                    while (true) {
                        if (!it6.hasNext()) {
                            str = str4;
                            j18 = currentTimeMillis;
                            break;
                        }
                        com.tencent.mm.vfs.x1 x1Var = (com.tencent.mm.vfs.x1) it6.next();
                        if (cancellationSignal.isCanceled()) {
                            com.tencent.mars.xlog.Log.i("VFS.AttachmentGCFileSystem", "cs.isCanceled break");
                            str = str4;
                            j18 = currentTimeMillis;
                            i37 = i19;
                            break;
                        }
                        if (!x1Var.f213231a.startsWith(".ref")) {
                            if (x1Var.f213236f) {
                                str2 = str4;
                                j19 = currentTimeMillis;
                                str3 = str5;
                                it = it6;
                                q2VarArr = q2VarArr2;
                            } else {
                                try {
                                    java.lang.String str6 = x1Var.f213232b;
                                    android.database.Cursor B = k0Var.B(str6.endsWith("_tmp") ? "SELECT msgInfoId,msgInfoTalker FROM appattach WHERE (status=199 AND fileFullPath LIKE '%/" + str6 + "') OR (status!=199 AND fileFullPath LIKE '%/" + str6.substring(i18, str6.length() - 4) + "')" : "SELECT msgInfoId,msgInfoTalker FROM appattach WHERE fileFullPath LIKE '%/" + str6 + "'", null);
                                    B.moveToFirst();
                                    long count = B.getCount();
                                    java.lang.String str7 = x1Var.f213231a;
                                    it = it6;
                                    q2VarArr = q2VarArr2;
                                    long j38 = x1Var.f213234d;
                                    if (count == 0) {
                                        try {
                                            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                                            str3 = str5;
                                            try {
                                                sb6.append("downloadAttachmentWildFile 0 wildFile = ");
                                                sb6.append(str7);
                                                sb6.append(", diskspace = ");
                                                sb6.append(j38);
                                                com.tencent.mars.xlog.Log.e("VFS.AttachmentGCFileSystem", sb6.toString());
                                                i39++;
                                                j37 += j38;
                                                if (O(x1Var)) {
                                                    i47++;
                                                    j29 += j38;
                                                }
                                                str2 = str4;
                                                j19 = currentTimeMillis;
                                            } catch (java.lang.Throwable th6) {
                                                th = th6;
                                                str2 = str4;
                                                j19 = currentTimeMillis;
                                                com.tencent.mars.xlog.Log.e("VFS.AttachmentGCFileSystem", "db error e = " + th.getMessage());
                                                str4 = str2;
                                                q2VarArr2 = q2VarArr;
                                                it6 = it;
                                                str5 = str3;
                                                currentTimeMillis = j19;
                                                i18 = 0;
                                                i19 = 1;
                                            }
                                        } catch (java.lang.Throwable th7) {
                                            th = th7;
                                            str3 = str5;
                                        }
                                    } else {
                                        str3 = str5;
                                        str2 = str4;
                                        j19 = currentTimeMillis;
                                        try {
                                            long j39 = B.getLong(0);
                                            java.lang.String string = B.getString(1);
                                            ((ot0.g3) ((com.tencent.mm.app.w2) i95.n0.c(com.tencent.mm.app.w2.class))).getClass();
                                            pt0.e0 e0Var = pt0.f0.f358209b1;
                                            if (string == null) {
                                                string = str3;
                                            }
                                            if (!e0Var.a(string, j39)) {
                                                com.tencent.mars.xlog.Log.e("VFS.AttachmentGCFileSystem", "downloadAttachmentWildFile 1 wildFile = " + str7 + ", diskspace = " + j38 + ", msgId = " + j39);
                                                i39++;
                                                j37 += j38;
                                                if (O(x1Var)) {
                                                    i47++;
                                                    j29 += j38;
                                                }
                                            }
                                        } catch (java.lang.Throwable th8) {
                                            th = th8;
                                            com.tencent.mars.xlog.Log.e("VFS.AttachmentGCFileSystem", "db error e = " + th.getMessage());
                                            str4 = str2;
                                            q2VarArr2 = q2VarArr;
                                            it6 = it;
                                            str5 = str3;
                                            currentTimeMillis = j19;
                                            i18 = 0;
                                            i19 = 1;
                                        }
                                    }
                                    B.close();
                                } catch (java.lang.Throwable th9) {
                                    th = th9;
                                    str2 = str4;
                                    j19 = currentTimeMillis;
                                    str3 = str5;
                                    it = it6;
                                    q2VarArr = q2VarArr2;
                                }
                            }
                            str4 = str2;
                            q2VarArr2 = q2VarArr;
                            it6 = it;
                            str5 = str3;
                            currentTimeMillis = j19;
                            i18 = 0;
                        }
                        i19 = 1;
                    }
                    i28++;
                    str4 = str;
                    i27 = i47;
                    j27 = j37;
                    j28 = j29;
                    i29 = i39;
                    q2VarArr2 = q2VarArr2;
                    currentTimeMillis = j18;
                    i18 = 0;
                    i19 = 1;
                }
                java.lang.String str8 = str4;
                long j47 = currentTimeMillis;
                long j48 = com.tencent.mm.sdk.platformtools.o4.L().getLong("extreme_storage_wechat_total", -1L);
                if (j48 != -1) {
                    j17 = j27;
                    i17 = (int) ((((float) j17) / ((float) j48)) * 100.0f);
                } else {
                    j17 = j27;
                    i17 = -1;
                }
                com.tencent.mars.xlog.Log.i("VFS.AttachmentGCFileSystem", " > deletedFiles: %d, deletedSize: %d\n > keptFiles: %d, keptSize: %d\n > illegalFiles: %d, illegalSize: %d\n > wildFiles: %d, wildSize: %d\n > tempFiles: %d, tempSize: %d\n > noMediaFiles: %d, noMediaSize: %d > totalWildFile: %d, totalWildSize: %d", java.lang.Integer.valueOf(i27), java.lang.Long.valueOf(j28), 0, 0L, 0, 0L, 0, 0L, 0, 0L, 0, 0L, java.lang.Integer.valueOf(i29), java.lang.Long.valueOf(j17));
                long currentTimeMillis2 = java.lang.System.currentTimeMillis() - j47;
                com.tencent.mars.xlog.Log.i("VFS.AttachmentGCFileSystem", "duration = " + currentTimeMillis2);
                jx3.f.INSTANCE.d(22046, "attachment-v3", java.lang.Integer.valueOf(i27), java.lang.Long.valueOf(j28), 0, 0L, 0, 0L, 0, 0L, 0, 0L, 0, 0L, java.lang.Integer.valueOf(i29), java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i37), java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(currentTimeMillis2));
                if (i37 == 0) {
                    com.tencent.mm.sdk.platformtools.o4.L().putLong("recent_attachment_wild_file_size", j17);
                    com.tencent.mm.vfs.e8.t(str8);
                    if (j17 > 209715200) {
                        com.tencent.mm.sdk.platformtools.o4.L().putLong("extreme_storage_attachment_wild_file_size", j17);
                    } else {
                        com.tencent.mm.sdk.platformtools.o4.L().putLong("extreme_storage_attachment_wild_file_size", -1L);
                    }
                }
            }
        }
        cancellationSignal.throwIfCanceled();
        super.q(cancellationSignal);
    }

    @Override // com.tencent.mm.vfs.a
    public java.lang.String toString() {
        return "attchmentGC <- " + this.f213097e;
    }

    @Override // com.tencent.mm.vfs.q2
    public com.tencent.mm.vfs.FileSystem y() {
        return this.f213099g;
    }
}
