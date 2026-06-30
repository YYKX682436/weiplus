package com.tencent.mm.pluginsdk.res.downloader.checkresupdate;

/* loaded from: classes12.dex */
public final class p {

    /* renamed from: c, reason: collision with root package name */
    public static boolean f189631c;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Set f189632a = java.util.Collections.newSetFromMap(new x.b(com.tencent.mm.pluginsdk.res.downloader.checkresupdate.c0.f189560c.length));

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.res.downloader.checkresupdate.h0 f189633b = new com.tencent.mm.pluginsdk.res.downloader.checkresupdate.h0();

    public p(com.tencent.mm.pluginsdk.res.downloader.checkresupdate.c cVar) {
        com.tencent.mm.pluginsdk.res.downloader.checkresupdate.e eVar = new com.tencent.mm.pluginsdk.res.downloader.checkresupdate.e(this);
        com.tencent.mm.pluginsdk.res.downloader.model.l0 l0Var = com.tencent.mm.pluginsdk.res.downloader.model.j0.f189679a;
        if (l0Var.f189686e) {
            com.tencent.mm.pluginsdk.res.downloader.model.s sVar = l0Var.f189684c;
            sVar.getClass();
            java.util.Objects.toString(eVar);
            synchronized (sVar.f189708c) {
                java.util.List list = (java.util.List) sVar.f189707b.get(-1894509183);
                list = list == null ? new java.util.LinkedList() : list;
                list.add(eVar);
                sVar.f189707b.put(-1894509183, list);
            }
        }
    }

    public static com.tencent.mm.pluginsdk.res.downloader.checkresupdate.p c() {
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            return com.tencent.mm.pluginsdk.res.downloader.checkresupdate.o.f189630a;
        }
        iz5.a.h("Inaccessible in child process.");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
    
        if (r5 >= 0) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(com.tencent.mm.pluginsdk.res.downloader.model.n0 r7) {
        /*
            r6 = this;
            java.lang.String r0 = r7.field_urlKey
            com.tencent.mm.pluginsdk.res.downloader.checkresupdate.h0 r0 = r6.f189633b
            r0.getClass()
            java.lang.String r1 = r7.field_urlKey
            boolean r1 = r0.d(r1)
            java.lang.String r2 = "URLKey(%s) is already decrypting, skip repeated task"
            java.lang.String r3 = "MicroMsg.ResDownloader.CheckResUpdate.DecryptExecutor"
            if (r1 == 0) goto L17
            com.tencent.mars.xlog.Log.i(r3, r2)
            goto L67
        L17:
            com.tencent.mm.pluginsdk.res.downloader.checkresupdate.a r7 = com.tencent.mm.pluginsdk.res.downloader.checkresupdate.a.b(r7)
            java.lang.String r1 = r7.f189532a
            boolean r4 = r0.d(r1)
            if (r4 == 0) goto L2b
            java.lang.Object[] r7 = new java.lang.Object[]{r1}
            com.tencent.mars.xlog.Log.i(r3, r2, r7)
            goto L67
        L2b:
            boolean r2 = r7.f189538g
            if (r2 == 0) goto L37
            int r4 = r7.f189535d
            int r5 = r7.f189541j
            if (r4 != r5) goto L37
            if (r5 >= 0) goto L3d
        L37:
            if (r2 != 0) goto L3f
            boolean r2 = r7.f189539h
            if (r2 == 0) goto L3f
        L3d:
            r2 = 1
            goto L40
        L3f:
            r2 = 0
        L40:
            if (r2 != 0) goto L43
            goto L67
        L43:
            java.lang.Object[] r2 = new java.lang.Object[]{r1}
            java.lang.String r4 = "request#URLKey(%s) posted to decryptWorker"
            com.tencent.mars.xlog.Log.i(r3, r4, r2)
            r0.f(r7)     // Catch: java.util.concurrent.RejectedExecutionException -> L51
            goto L67
        L51:
            r2 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[]{r1, r2}
            java.lang.String r4 = "submitRequest(%s) get rejected[%s]"
            com.tencent.mars.xlog.Log.e(r3, r4, r2)
            r0.a(r1)
            com.tencent.mm.pluginsdk.res.downloader.checkresupdate.g0 r0 = new com.tencent.mm.pluginsdk.res.downloader.checkresupdate.g0
            r0.<init>(r7)
            r0.run()
        L67:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.pluginsdk.res.downloader.checkresupdate.p.a(com.tencent.mm.pluginsdk.res.downloader.model.n0):void");
    }

    public java.lang.String b(int i17, int i18) {
        java.lang.String str;
        if (!f189631c) {
            java.lang.Iterable<com.tencent.mm.vfs.x1> s17 = com.tencent.mm.vfs.w6.s("wcf://PublicResource/CheckResUpdate", false);
            if (s17 != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.CheckResUpdate", "Directory %s exists, start migration");
                int i19 = 0;
                int i27 = 0;
                for (com.tencent.mm.vfs.x1 x1Var : s17) {
                    if (com.tencent.mm.vfs.w6.x("wcf://PublicResource/CheckResUpdate/" + x1Var.f213232b, "wcf://CheckResUpdate/" + x1Var.f213232b, false)) {
                        i27++;
                    } else {
                        i19++;
                    }
                }
                if (i19 == 0) {
                    com.tencent.mm.vfs.w6.g("wcf://PublicResource/CheckResUpdate", false);
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.CheckResUpdate", "Migration done, success: %d, failure: %d", java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i19));
            }
            f189631c = true;
        }
        com.tencent.mm.pluginsdk.res.downloader.model.n0 e17 = com.tencent.mm.pluginsdk.res.downloader.model.j0.f189679a.e(com.tencent.mm.pluginsdk.res.downloader.checkresupdate.c0.c(i17, i18));
        if (e17 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ResDownloader.CheckResUpdateHelper", "getCachedFilePath, %d.%d, get null info, return", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            return null;
        }
        boolean z17 = e17.field_deleted;
        java.lang.String str2 = e17.field_filePath;
        if (str2 != null && str2.contains("/files/public/CheckResUpdate/")) {
            if (!com.tencent.mm.vfs.w6.j(e17.field_filePath)) {
                if (!com.tencent.mm.vfs.w6.j(e17.field_filePath + ".decompressed")) {
                    if (!com.tencent.mm.vfs.w6.j(e17.field_filePath + ".decrypted")) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.ResDownloader.CheckResUpdateHelper", "Found old location, fix record: %s", e17.field_filePath);
                        e17.field_filePath = e17.field_filePath.replace("/files/public/CheckResUpdate/", "/MicroMsg/CheckResUpdate/");
                    }
                }
            }
            com.tencent.mars.xlog.Log.w("MicroMsg.ResDownloader.CheckResUpdateHelper", "Old location exists, migration failed???");
        }
        boolean z18 = e17.field_fileCompress;
        if (!z18 && !e17.field_fileEncrypt) {
            if (!e17.field_deleted && !com.tencent.mm.sdk.platformtools.t8.K0(e17.field_filePath)) {
                java.lang.String p17 = com.tencent.mm.vfs.w6.p(e17.field_filePath);
                if ((p17 != null ? p17 : "").equals(e17.field_md5)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.ResDownloader.CheckResUpdateHelper", "getCachedFilePath, %d.%d, not need decrypt and file valid, return path(%s)", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), e17.field_filePath);
                    return e17.field_filePath;
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ResDownloader.CheckResUpdateHelper", "getCachedFilePath, %d.%d, not need decrypt and file invalid, return null", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            return null;
        }
        if (z18) {
            str = e17.field_filePath + ".decompressed";
        } else if (e17.field_fileEncrypt) {
            str = e17.field_filePath + ".decrypted";
        } else {
            str = null;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ResDownloader.CheckResUpdateHelper", "getCachedFilePath, %d.%d, need decrypt or decompress, filePath invalid return null ", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            return null;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(e17.field_originalMd5)) {
            java.lang.String p18 = com.tencent.mm.vfs.w6.p(str);
            if ((p18 != null ? p18 : "").equals(e17.field_originalMd5)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ResDownloader.CheckResUpdateHelper", "getCachedFilePath, %d.%d, need decrypt or decompress, file valid, ret = %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
                return str;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ResDownloader.CheckResUpdateHelper", "getCachedFilePath, %d.%d, needDecrypt(%b) needDecompress(%b), file invalid, return null ", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Boolean.valueOf(e17.field_fileEncrypt), java.lang.Boolean.valueOf(e17.field_fileCompress));
        return null;
    }

    public void d(int i17, int i18, int i19, boolean z17) {
        com.tencent.mm.pluginsdk.res.downloader.model.j0.f189679a.d(new com.tencent.mm.pluginsdk.res.downloader.checkresupdate.c(this, i17, i18, i19, z17));
    }

    public void e(int i17, r45.vr5 vr5Var, boolean z17) {
        int i18;
        int i19;
        byte[] bArr;
        int i27;
        java.lang.String str;
        java.lang.String c17 = com.tencent.mm.pluginsdk.res.downloader.checkresupdate.c0.c(i17, vr5Var.f388468d);
        if (vr5Var.f388469e == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ResDownloader.CheckResUpdateHelper", "onReceiveCacheOperation(%s), resource.Info = null, return", c17);
            return;
        }
        java.lang.Object[] objArr = new java.lang.Object[9];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = java.lang.Integer.valueOf(vr5Var.f388468d);
        objArr[2] = java.lang.Boolean.valueOf(z17);
        objArr[3] = java.lang.Integer.valueOf(vr5Var.f388469e.f371026e);
        java.util.LinkedList linkedList = vr5Var.f388469e.f371029h;
        objArr[4] = linkedList == null ? "null" : java.lang.String.valueOf(linkedList.size());
        objArr[5] = java.lang.Integer.valueOf(vr5Var.f388472h);
        objArr[6] = vr5Var.f388473i;
        r45.bs5 bs5Var = vr5Var.f388469e;
        objArr[7] = bs5Var.f371027f;
        objArr[8] = bs5Var.f371030i;
        com.tencent.mars.xlog.Log.i("MicroMsg.ResDownloader.CheckResUpdateHelper", "receive cache-op, urlKey = %d.%d,  fromNewXml = %b, file version = %d, eccSignatureList.size = %s, reportId = %s, sampleId = %s, url = %s, data = %s", objArr);
        java.util.LinkedList linkedList2 = vr5Var.f388469e.f371029h;
        if (linkedList2 != null) {
            java.util.Iterator it = linkedList2.iterator();
            while (it.hasNext()) {
                r45.y56 y56Var = (r45.y56) it.next();
                com.tencent.mars.xlog.Log.i("MicroMsg.ResDownloader.CheckResUpdateHelper", "cache-op, sigInfo: version(%d), signature(%s) ", java.lang.Integer.valueOf(y56Var.f390810d), y56Var.f390811e.i());
            }
        }
        com.tencent.mm.pluginsdk.res.downloader.checkresupdate.e0.a(vr5Var.f388472h, 2L);
        if (!z17) {
            com.tencent.mm.pluginsdk.res.downloader.checkresupdate.e0.a(vr5Var.f388472h, 1L);
        }
        int i28 = vr5Var.f388474m;
        if (i28 != 0 && i28 <= com.tencent.mm.sdk.platformtools.t8.i1()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ResDownloader.CheckResUpdateHelper", "recourse(%s) is expired before do download, expireTime = %d, fileVersion = %d", c17, java.lang.Integer.valueOf(vr5Var.f388474m), java.lang.Integer.valueOf(vr5Var.f388469e.f371026e));
            com.tencent.mm.pluginsdk.res.downloader.checkresupdate.e0.a(vr5Var.f388472h, 14L);
            com.tencent.mm.pluginsdk.res.downloader.checkresupdate.e0.a(vr5Var.f388472h, 44L);
            int i29 = vr5Var.f388468d;
            r45.bs5 bs5Var2 = vr5Var.f388469e;
            com.tencent.mm.pluginsdk.res.downloader.checkresupdate.e0.c(i17, i29, bs5Var2.f371027f, bs5Var2.f371026e, com.tencent.mm.pluginsdk.res.downloader.checkresupdate.d0.FILE_EXPIRED, false, z17, false, vr5Var.f388473i);
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(vr5Var.f388469e.f371027f) && vr5Var.f388469e.f371030i == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ResDownloader.CheckResUpdateHelper", "cache-op, invalid cache operation, url and data is null or nil, skip");
            return;
        }
        r45.bs5 bs5Var3 = vr5Var.f388469e;
        java.lang.String str2 = bs5Var3.f371027f;
        int i37 = vr5Var.f388468d;
        long j17 = vr5Var.f388474m;
        int i38 = bs5Var3.f371026e;
        java.lang.String str3 = bs5Var3.f371025d;
        int i39 = bs5Var3.f371028g;
        boolean z18 = (i39 & 2) > 0;
        boolean z19 = (i39 & 1) > 0;
        long j18 = vr5Var.f388472h;
        java.lang.String str4 = vr5Var.f388473i;
        int i47 = vr5Var.f388475n;
        int i48 = i47 > 0 ? i47 : 3;
        int i49 = vr5Var.f388476o;
        int i57 = vr5Var.f388477p;
        if (com.tencent.mm.sdk.platformtools.t8.L0(bs5Var3.f371029h)) {
            i18 = i49;
            i19 = 0;
            bArr = null;
        } else {
            i18 = i49;
            i19 = 0;
            bArr = ((r45.y56) vr5Var.f388469e.f371029h.get(0)).f390811e.f192156a;
        }
        r45.as5 as5Var = vr5Var.f388470f;
        if (as5Var == null || com.tencent.mm.sdk.platformtools.t8.K0(as5Var.f370244e)) {
            i27 = i19;
            str = null;
        } else {
            r45.as5 as5Var2 = vr5Var.f388470f;
            java.lang.String str5 = as5Var2.f370244e;
            i27 = as5Var2.f370243d;
            str = str5;
        }
        com.tencent.mm.protobuf.g gVar = vr5Var.f388469e.f371030i;
        byte[] g17 = (gVar == null || gVar.f192156a.length <= 0) ? null : gVar.g();
        com.tencent.mm.pluginsdk.res.downloader.checkresupdate.z zVar = new com.tencent.mm.pluginsdk.res.downloader.checkresupdate.z(str2, c17, i38, i57, i48, j17, str3, i17, i37, j18, str4, bArr, vr5Var.f388469e.f371031m, z18, z19, str, i27, i18, g17, r2.f371032n, z17, false, vr5Var.f388479r);
        zVar.toString();
        com.tencent.mm.pluginsdk.res.downloader.model.j0.f189679a.d(new com.tencent.mm.pluginsdk.res.downloader.checkresupdate.g(this, c17, zVar));
    }

    public void f(int i17, r45.vr5 vr5Var, boolean z17, boolean z18) {
        java.lang.String c17 = com.tencent.mm.pluginsdk.res.downloader.checkresupdate.c0.c(i17, vr5Var.f388468d);
        r45.as5 as5Var = vr5Var.f388470f;
        if (as5Var == null || com.tencent.mm.sdk.platformtools.t8.K0(as5Var.f370244e)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ResDownloader.CheckResUpdateHelper", "onReceiveDecryptOperation(), resource.Key invalid, resource=%d.%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(vr5Var.f388468d));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ResDownloader.CheckResUpdateHelper", "receive decrypt-op, fromNewXml(%b), %d.%d, key version (%d)", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(vr5Var.f388468d), java.lang.Integer.valueOf(vr5Var.f388470f.f370243d));
        java.lang.String str = vr5Var.f388470f.f370244e;
        com.tencent.mm.pluginsdk.res.downloader.checkresupdate.e0.a(vr5Var.f388472h, 4L);
        java.lang.String str2 = vr5Var.f388469e.f371031m;
        r45.as5 as5Var2 = vr5Var.f388470f;
        com.tencent.mm.pluginsdk.res.downloader.checkresupdate.h hVar = new com.tencent.mm.pluginsdk.res.downloader.checkresupdate.h(this, c17, str2, as5Var2.f370244e, as5Var2.f370243d, vr5Var.f388472h, vr5Var.f388473i, z18);
        if (z18) {
            hVar.run();
        } else {
            com.tencent.mm.pluginsdk.res.downloader.model.j0.f189679a.d(hVar);
        }
    }

    public void g(int i17, r45.vr5 vr5Var, boolean z17) {
        java.lang.String c17 = com.tencent.mm.pluginsdk.res.downloader.checkresupdate.c0.c(i17, vr5Var.f388468d);
        if (vr5Var.f388469e == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ResDownloader.CheckResUpdateHelper", "onReceiveDeleteOperation(), resource.Info = null");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ResDownloader.CheckResUpdateHelper", "receive delete-op, fromNewXml(%b), %d.%d, file version (%d)", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(vr5Var.f388468d), java.lang.Integer.valueOf(vr5Var.f388469e.f371026e));
        com.tencent.mm.pluginsdk.res.downloader.checkresupdate.e0.a(vr5Var.f388472h, 3L);
        com.tencent.mm.pluginsdk.res.downloader.model.j0.f189679a.d(new com.tencent.mm.pluginsdk.res.downloader.checkresupdate.f(this, c17, i17, vr5Var.f388468d, vr5Var.f388469e.f371026e, vr5Var.f388472h, vr5Var.f388473i, z17));
    }

    public void h(int i17, int i18, java.lang.String str, int i19, java.lang.String str2) {
        com.tencent.mm.pluginsdk.res.downloader.model.j0.f189679a.d(new com.tencent.mm.pluginsdk.res.downloader.checkresupdate.i(this, i17, i18, str, i19, str2));
    }

    public void i(int i17, int i18, int i19, boolean z17) {
        com.tencent.mm.sdk.platformtools.n3 n3Var = com.tencent.mm.pluginsdk.res.downloader.model.j0.f189679a.f189685d;
        if (n3Var == null) {
            com.tencent.mars.xlog.Log.f("MicroMsg.ResDownloader.CheckResUpdateHelper", "sendEventPreOperation: get null eventThread ");
        } else {
            n3Var.post(new com.tencent.mm.pluginsdk.res.downloader.checkresupdate.b(this, i19, i17, i18, z17));
        }
    }
}
