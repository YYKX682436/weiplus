package mt1;

/* loaded from: classes12.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    public static final mt1.q0 f331258a = new mt1.q0();

    /* renamed from: b, reason: collision with root package name */
    public static final ot1.j f331259b;

    static {
        ot1.j n17 = mt1.b0.f331191a.n();
        kotlin.jvm.internal.o.f(n17, "<get-wxFileIndexStorage>(...)");
        f331259b = n17;
    }

    public final void a() {
        ot1.j jVar = f331259b;
        jVar.getClass();
        try {
            jVar.f348849d.H("WxFileIndexDownloadMigration", "DELETE FROM WxFileIndexDownloadMigration WHERE status = ?", new java.lang.String[]{java.lang.String.valueOf(200)});
        } catch (java.lang.Throwable th6) {
            throw new java.lang.RuntimeException("deleteOldLinkify failed : " + th6.getMessage());
        }
    }

    public final void b() {
        try {
            f331259b.f348849d.H("WxFileIndexLinkify", "DELETE FROM WxFileIndexLinkify WHERE status = ? OR status = ? OR status = ? OR status = ?", new java.lang.Object[]{0, 10, 5, 13});
        } catch (java.lang.Throwable th6) {
            throw new java.lang.RuntimeException("deleteOldLinkify failed : " + th6.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(java.lang.String r5, java.lang.String r6, java.lang.String r7) {
        /*
            r4 = this;
            boolean r5 = com.tencent.mm.vfs.w6.j(r6)
            java.lang.String r0 = "MicroMsg.DuplicateFileLinkifyLogic"
            r1 = 0
            r2 = 1
            if (r5 == 0) goto L23
            boolean r5 = com.tencent.mm.vfs.w6.h(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r3 = "[LINKIFY_STATUS_COPY_LINK_DONE], deleteBackupFileRet = "
            r6.<init>(r3)
            r6.append(r5)
            java.lang.String r6 = r6.toString()
            com.tencent.mars.xlog.Log.i(r0, r6)
            if (r5 != 0) goto L23
            r5 = r1
            goto L24
        L23:
            r5 = r2
        L24:
            boolean r6 = com.tencent.mm.vfs.w6.j(r7)
            if (r6 == 0) goto L43
            boolean r6 = com.tencent.mm.vfs.w6.h(r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r3 = "[LINKIFY_STATUS_COPY_LINK_DONE], deleteLinkFileRet = "
            r7.<init>(r3)
            r7.append(r6)
            java.lang.String r7 = r7.toString()
            com.tencent.mars.xlog.Log.i(r0, r7)
            if (r6 != 0) goto L43
            r6 = r1
            goto L44
        L43:
            r6 = r2
        L44:
            if (r5 == 0) goto L49
            if (r6 == 0) goto L49
            r1 = r2
        L49:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: mt1.q0.c(java.lang.String, java.lang.String, java.lang.String):boolean");
    }

    public final java.lang.String d(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str);
        java.lang.String str3 = a17.f213279f;
        if (str3 != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str3, false, false);
            if (!str3.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        java.lang.String str4 = a17.f213279f;
        int lastIndexOf = str4.lastIndexOf("/");
        if (lastIndexOf >= 0) {
            str4 = str4.substring(lastIndexOf + 1);
        }
        kotlin.jvm.internal.o.f(str4, "getName(...)");
        char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
        java.lang.String b17 = com.tencent.mm.sdk.platformtools.w2.b(str4.getBytes());
        java.lang.String o17 = new com.tencent.mm.vfs.r6(new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str)).r(), b17 + str2).o();
        kotlin.jvm.internal.o.f(o17, "getAbsolutePath(...)");
        return o17;
    }

    public final boolean e(java.lang.String fullPath) {
        kotlin.jvm.internal.o.g(fullPath, "fullPath");
        return r26.i0.y(fullPath, "/storage/emulated/0/tencent", false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x005a, code lost:
    
        if (r0 == null) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int f(java.lang.String r31, java.lang.String r32, boolean r33) {
        /*
            Method dump skipped, instructions count: 863
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mt1.q0.f(java.lang.String, java.lang.String, boolean):int");
    }

    public final int g(long j17, long j18, java.lang.String filePath, java.lang.String newAttachmentName, java.lang.String indexFileName) {
        kotlin.jvm.internal.o.g(filePath, "filePath");
        kotlin.jvm.internal.o.g(newAttachmentName, "newAttachmentName");
        kotlin.jvm.internal.o.g(indexFileName, "indexFileName");
        java.util.concurrent.FutureTask futureTask = new java.util.concurrent.FutureTask(new mt1.o0(j17, filePath, newAttachmentName, indexFileName, j18));
        ((ku5.t0) ku5.t0.f312615d).g(futureTask);
        java.lang.Object obj = futureTask.get();
        kotlin.jvm.internal.o.f(obj, "get(...)");
        return ((java.lang.Number) obj).intValue();
    }

    public final void h() {
        android.database.Cursor cursor;
        java.lang.Throwable th6;
        android.database.Cursor cursor2;
        java.lang.String str;
        ot1.j jVar;
        java.lang.String str2 = "_backup";
        com.tencent.mars.xlog.Log.i("MicroMsg.DuplicateFileLinkifyLogic", "rescueFileLinkFileFromError");
        int i17 = 0;
        jx3.f.INSTANCE.d(26980, -100, 0, 0, "", "", 0);
        ot1.j jVar2 = f331259b;
        jVar2.f348852g.a();
        android.database.Cursor f17 = jVar2.f348849d.f("SELECT id,originalPath,targetPath,status,indexRowId,msgId,username from WxFileIndexDownloadMigration WHERE status!=?", new java.lang.String[]{"200"}, 0);
        try {
            int count = f17.getCount();
            com.tencent.mars.xlog.Log.i("MicroMsg.DuplicateFileLinkifyLogic", "rescueDownloadMigrationError count = " + count);
            if (count == 0) {
                try {
                    com.tencent.mm.sdk.platformtools.o4.L().putBoolean("DownloadMigrationError", false);
                } catch (java.lang.Throwable th7) {
                    th6 = th7;
                    cursor = f17;
                    try {
                        throw th6;
                    } catch (java.lang.Throwable th8) {
                        vz5.b.a(cursor, th6);
                        throw th8;
                    }
                }
            }
            while (f17.moveToNext()) {
                try {
                    long j17 = f17.getLong(i17);
                    java.lang.String string = f17.getString(1);
                    java.lang.String string2 = f17.getString(2);
                    int i18 = f17.getInt(3);
                    ot1.j jVar3 = jVar2;
                    long j18 = f17.getLong(4);
                    long j19 = f17.getLong(5);
                    com.tencent.mars.xlog.Log.i("MicroMsg.DuplicateFileLinkifyLogic", "rescueDownloadMigrationError, id = " + j17 + ", originalFilePath = " + string + ", targetFilePath = " + string2 + ", status = " + i18);
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    sb6.append(string);
                    sb6.append(str2);
                    java.lang.String sb7 = sb6.toString();
                    if (!com.tencent.mm.vfs.w6.j(sb7)) {
                        mt1.q0 q0Var = f331258a;
                        kotlin.jvm.internal.o.d(string);
                        sb7 = q0Var.d(string, str2);
                    }
                    jx3.f fVar = jx3.f.INSTANCE;
                    java.lang.Object[] objArr = new java.lang.Object[6];
                    objArr[i17] = -11;
                    objArr[1] = 0;
                    objArr[2] = 0;
                    objArr[3] = string;
                    objArr[4] = string2;
                    objArr[5] = 0;
                    fVar.d(26980, objArr);
                    if (i18 == 0 || i18 == 1) {
                        str = str2;
                        cursor2 = f17;
                        jVar = jVar3;
                        if (com.tencent.mm.vfs.w6.j(sb7)) {
                            boolean h17 = com.tencent.mm.vfs.w6.h(sb7);
                            com.tencent.mars.xlog.Log.i("MicroMsg.DuplicateFileLinkifyLogic", "LINKIFY_FILE_STATUS_START||DOWNLOAD_MIGRATION_STATUS_COPY_BACKUP_DONE, deleteBackupFileRet = " + h17);
                            if (!h17) {
                                jVar2 = jVar;
                                str2 = str;
                                f17 = cursor2;
                                i17 = 0;
                            }
                        }
                        if (com.tencent.mm.vfs.w6.j(string2)) {
                            boolean h18 = com.tencent.mm.vfs.w6.h(string2);
                            com.tencent.mars.xlog.Log.i("MicroMsg.DuplicateFileLinkifyLogic", "LINKIFY_FILE_STATUS_START||DOWNLOAD_MIGRATION_STATUS_COPY_BACKUP_DONE, deleteTargetFileRet = " + h18);
                            if (!h18) {
                                jVar2 = jVar;
                                str2 = str;
                                f17 = cursor2;
                                i17 = 0;
                            }
                        }
                        jVar.t3(j17, 200);
                    } else if (i18 == 2) {
                        jVar = jVar3;
                        jVar.t3(j17, 2);
                        try {
                            str = str2;
                            cursor2 = f17;
                            try {
                                try {
                                    gm0.j1.u().f273153f.H("appattach", "UPDATE appattach SET fileFullPath=? WHERE msgInfoId=?", new java.lang.Object[]{string2, java.lang.Long.valueOf(j19)});
                                    jVar.t3(j17, 3);
                                    mt1.b0.f331191a.n().v3(j18, "wcf://attachment/" + (com.tencent.mm.vfs.w6.q(string2) + '.' + com.tencent.mm.vfs.w6.n(string2)));
                                    jVar.t3(j17, 4);
                                } catch (java.lang.Throwable th9) {
                                    th = th9;
                                    th6 = th;
                                    cursor = cursor2;
                                    throw th6;
                                }
                            } catch (java.lang.Exception unused) {
                            }
                        } catch (java.lang.Exception unused2) {
                            str = str2;
                            cursor2 = f17;
                        }
                        if (com.tencent.mm.vfs.w6.h(string)) {
                            jVar.t3(j17, 200);
                        } else {
                            jVar2 = jVar;
                            str2 = str;
                            f17 = cursor2;
                            i17 = 0;
                        }
                    } else if (i18 == 3) {
                        jVar = jVar3;
                        mt1.b0.f331191a.n().v3(j18, "wcf://attachment/" + (com.tencent.mm.vfs.w6.q(string2) + '.' + com.tencent.mm.vfs.w6.n(string2)));
                        jVar.t3(j17, 4);
                        if (com.tencent.mm.vfs.w6.h(string)) {
                            jVar2 = jVar;
                            i17 = 0;
                        } else {
                            jVar.t3(j17, 200);
                            str = str2;
                            cursor2 = f17;
                        }
                    } else if (i18 != 4) {
                        str = str2;
                        cursor2 = f17;
                        jVar = jVar3;
                    } else if (com.tencent.mm.vfs.w6.h(string)) {
                        jVar = jVar3;
                        jVar.t3(j17, 200);
                        str = str2;
                        cursor2 = f17;
                    } else {
                        jVar2 = jVar3;
                        i17 = 0;
                    }
                    fVar.d(26980, java.lang.Integer.valueOf(org.chromium.net.NetError.ERR_SOCKS_CONNECTION_FAILED), 0, 0, string, string2, 0);
                    str2 = str;
                    f17 = cursor2;
                    ot1.j jVar4 = jVar;
                    i17 = 0;
                    jVar2 = jVar4;
                } catch (java.lang.Throwable th10) {
                    th = th10;
                    cursor2 = f17;
                }
            }
            vz5.b.a(f17, null);
        } catch (java.lang.Throwable th11) {
            cursor = f17;
            th6 = th11;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x02b7, code lost:
    
        if (r5 != false) goto L74;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:26:0x011b. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean i() {
        /*
            Method dump skipped, instructions count: 802
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mt1.q0.i():boolean");
    }
}
