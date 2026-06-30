package com.tencent.mm.pluginsdk.res.downloader.model;

/* loaded from: classes12.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.res.downloader.model.p0 f189682a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.res.downloader.model.b0 f189683b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.res.downloader.model.s f189684c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f189685d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f189686e;

    /* renamed from: f, reason: collision with root package name */
    public volatile com.tencent.mm.sdk.platformtools.n3 f189687f = null;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public l0(com.tencent.mm.pluginsdk.res.downloader.model.i0 r14) {
        /*
            r13 = this;
            r13.<init>()
            r14 = 0
            r13.f189687f = r14
            java.util.HashMap r0 = com.tencent.mm.pluginsdk.res.downloader.model.m0.f189689a
            java.lang.String[] r0 = com.tencent.mm.pluginsdk.res.downloader.model.p0.f189696e
            java.lang.String r0 = "MicroMsg.ResDownloaderStorage"
            r1 = 1
            java.io.File r2 = new java.io.File     // Catch: java.lang.Exception -> L5e
            java.lang.String r3 = com.tencent.mm.pluginsdk.res.downloader.model.p0.f189697f     // Catch: java.lang.Exception -> L5e
            r2.<init>(r3)     // Catch: java.lang.Exception -> L5e
            r2.mkdirs()     // Catch: java.lang.Exception -> L5e
            d95.b0 r2 = new d95.b0     // Catch: java.lang.Exception -> L5e
            r2.<init>()     // Catch: java.lang.Exception -> L5e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L5e
            r4.<init>()     // Catch: java.lang.Exception -> L5e
            r4.append(r3)     // Catch: java.lang.Exception -> L5e
            java.lang.String r5 = "ResDown.db"
            r4.append(r5)     // Catch: java.lang.Exception -> L5e
            java.lang.String r5 = r4.toString()     // Catch: java.lang.Exception -> L5e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L5e
            r4.<init>()     // Catch: java.lang.Exception -> L5e
            r4.append(r3)     // Catch: java.lang.Exception -> L5e
            java.lang.String r3 = "EnResDown.db"
            r4.append(r3)     // Catch: java.lang.Exception -> L5e
            java.lang.String r6 = r4.toString()     // Catch: java.lang.Exception -> L5e
            r8 = -2147483648(0xffffffff80000000, double:NaN)
            java.lang.String r10 = wo.w0.g(r1)     // Catch: java.lang.Exception -> L5e
            java.util.HashMap r11 = com.tencent.mm.pluginsdk.res.downloader.model.p0.f189698g     // Catch: java.lang.Exception -> L5e
            r12 = 1
            java.lang.String r7 = ""
            r4 = r2
            boolean r3 = r4.R(r5, r6, r7, r8, r10, r11, r12)     // Catch: java.lang.Exception -> L5e
            if (r3 != 0) goto L58
            java.lang.String r2 = "res downloader db init failed"
            com.tencent.mars.xlog.Log.f(r0, r2)     // Catch: java.lang.Exception -> L5e
            goto L69
        L58:
            com.tencent.mm.pluginsdk.res.downloader.model.p0 r3 = new com.tencent.mm.pluginsdk.res.downloader.model.p0     // Catch: java.lang.Exception -> L5e
            r3.<init>(r2)     // Catch: java.lang.Exception -> L5e
            goto L6a
        L5e:
            r2 = move-exception
            java.lang.String r3 = "new storage failed, exception = %s"
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            com.tencent.mars.xlog.Log.e(r0, r3, r2)
        L69:
            r3 = r14
        L6a:
            r13.f189682a = r3
            if (r3 != 0) goto L78
            r0 = 0
            r13.f189686e = r0
            r13.f189683b = r14
            r13.f189685d = r14
            r13.f189684c = r14
            goto L95
        L78:
            r13.f189686e = r1
            com.tencent.mm.sdk.platformtools.n3 r14 = new com.tencent.mm.sdk.platformtools.n3
            java.lang.String r0 = "ResDownloader-EventThread"
            r14.<init>(r0)
            r13.f189685d = r14
            com.tencent.mm.pluginsdk.res.downloader.model.s r14 = new com.tencent.mm.pluginsdk.res.downloader.model.s
            com.tencent.mm.sdk.platformtools.n3 r1 = r13.b()
            r14.<init>(r1)
            r13.f189684c = r14
            com.tencent.mm.pluginsdk.res.downloader.model.b0 r1 = new com.tencent.mm.pluginsdk.res.downloader.model.b0
            r1.<init>(r0, r14)
            r13.f189683b = r1
        L95:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.pluginsdk.res.downloader.model.l0.<init>(com.tencent.mm.pluginsdk.res.downloader.model.i0):void");
    }

    public int a(com.tencent.mm.pluginsdk.res.downloader.model.u uVar) {
        if (!this.f189686e) {
            return -1;
        }
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(uVar.f189717f);
        java.lang.String str = uVar.f189712a;
        if (K0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ResDownloaderCore", "request#%s with null url, ignore", str);
            return 3;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ResDownloaderCore", "request#%s post to network worker", str);
        return this.f189683b.g(uVar);
    }

    public com.tencent.mm.sdk.platformtools.n3 b() {
        if (this.f189687f == null) {
            this.f189687f = new com.tencent.mm.sdk.platformtools.n3("ResDownloader-WorkerThread");
            this.f189687f.setLogging(false);
        }
        return this.f189687f;
    }

    public boolean c(java.lang.String str) {
        if (this.f189686e) {
            com.tencent.mm.pluginsdk.res.downloader.model.b0 b0Var = this.f189683b;
            if (((java.util.concurrent.ConcurrentHashMap) b0Var.f189692b).containsKey(str) || b0Var.d(str)) {
                return true;
            }
        }
        return false;
    }

    public void d(java.lang.Runnable runnable) {
        if (runnable == null) {
            return;
        }
        b().postToWorker(new com.tencent.mm.pluginsdk.res.downloader.model.k0(runnable, null));
    }

    public com.tencent.mm.pluginsdk.res.downloader.model.n0 e(java.lang.String str) {
        if (!this.f189686e) {
            return null;
        }
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.pluginsdk.res.downloader.model.n0 z07 = this.f189682a.z0(str);
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = str;
        objArr[1] = java.lang.Boolean.valueOf(z07 != null);
        objArr[2] = java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis);
        com.tencent.mars.xlog.Log.i("MicroMsg.ResDownloaderCore", "doQuery: urlKey = %s, ret = %b, cost = %d", objArr);
        return z07;
    }

    public void f(int i17) {
        java.util.LinkedList<com.tencent.mm.pluginsdk.res.downloader.model.n0> linkedList;
        java.util.Set newSetFromMap;
        int i18;
        com.tencent.mars.xlog.Log.i("MicroMsg.ResDownloaderCore", "resumeAllAndEvictExpired, networkType = %d", java.lang.Integer.valueOf(i17));
        if (i17 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ResDownloaderCore", "resumeAllAndEvictExpired, networkType is unavailable");
            return;
        }
        boolean z17 = this.f189686e;
        if (!z17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ResDownloaderCore", "resumeAllAndEvictExpired, core can not work");
            return;
        }
        if (z17) {
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            android.database.Cursor all = this.f189682a.getAll();
            if (all != null) {
                if (all.getCount() <= 0) {
                    all.close();
                } else {
                    linkedList = new java.util.LinkedList();
                    all.moveToFirst();
                    do {
                        com.tencent.mm.pluginsdk.res.downloader.model.n0 n0Var = new com.tencent.mm.pluginsdk.res.downloader.model.n0();
                        n0Var.convertFrom(all);
                        linkedList.add(n0Var);
                    } while (all.moveToNext());
                    all.close();
                    com.tencent.mars.xlog.Log.i("MicroMsg.ResDownloaderCore", "queryAll: cost = %d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
                }
            }
            linkedList = null;
            com.tencent.mars.xlog.Log.i("MicroMsg.ResDownloaderCore", "queryAll: cost = %d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        } else {
            linkedList = null;
        }
        if (com.tencent.mm.sdk.platformtools.t8.L0(linkedList)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ResDownloaderCore", "resumeAllAndEvictExpired, no record stored, skip this resumeAll-op");
            return;
        }
        for (com.tencent.mm.pluginsdk.res.downloader.model.n0 n0Var2 : linkedList) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(n0Var2.field_groupId1)) {
                int hashCode = n0Var2.field_groupId1.hashCode();
                for (com.tencent.mm.pluginsdk.res.downloader.model.o oVar : com.tencent.mm.pluginsdk.res.downloader.model.m0.a()) {
                    oVar.getClass();
                    if (hashCode == -1894509183) {
                        com.tencent.mm.pluginsdk.res.downloader.checkresupdate.a0 a0Var = ((com.tencent.mm.pluginsdk.res.downloader.checkresupdate.n) oVar).f189627c;
                        a0Var.getClass();
                        long j17 = n0Var2.field_expireTime;
                        if (j17 != 0 && j17 <= com.tencent.mm.sdk.platformtools.t8.i1()) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.ResDownloader.CheckResUpdateResumeRecordHandler", "urlKey(%s) exceed expire time(%d), delete", n0Var2.field_urlKey, java.lang.Long.valueOf(n0Var2.field_expireTime));
                            com.tencent.mm.pluginsdk.res.downloader.model.l0 l0Var = com.tencent.mm.pluginsdk.res.downloader.model.j0.f189679a;
                            java.lang.String str = n0Var2.field_urlKey;
                            if (l0Var.f189686e) {
                                l0Var.f189682a.d(str);
                            }
                            o35.a.a(n0Var2.field_filePath);
                            o35.a.a(n0Var2.field_filePath + ".decompressed");
                            o35.a.a(n0Var2.field_filePath + ".decrypted");
                            java.lang.String str2 = n0Var2.field_urlKey;
                            if (l0Var.f189686e) {
                                l0Var.f189683b.a(str2);
                            }
                        } else if (i17 == 0) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.ResDownloader.CheckResUpdateResumeRecordHandler", "network unavailable, skip");
                        } else if (2 == i17 && 1 == n0Var2.field_networkType) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.ResDownloader.CheckResUpdateResumeRecordHandler", "network type = gprs, record network type = wifi, skip this ");
                        } else if (n0Var2.field_deleted) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.ResDownloader.CheckResUpdateResumeRecordHandler", "record(%s), should have been deleted", n0Var2.field_urlKey);
                            o35.a.a(n0Var2.field_filePath);
                            o35.a.a(n0Var2.field_filePath + ".decompressed");
                            o35.a.a(n0Var2.field_filePath + ".decrypted");
                        } else if (n0Var2.field_needRetry) {
                            int i19 = n0Var2.field_status;
                            if (i19 == 2) {
                                long g17 = o35.a.g(n0Var2.field_filePath);
                                if (n0Var2.field_contentLength > g17 && !com.tencent.mm.pluginsdk.res.downloader.checkresupdate.a0.b(n0Var2)) {
                                    com.tencent.mars.xlog.Log.i("MicroMsg.ResDownloader.CheckResUpdateResumeRecordHandler", "%d.%d content-length(%d) > fileSize(%d), resume download", java.lang.Integer.valueOf(n0Var2.field_resType), java.lang.Integer.valueOf(n0Var2.field_subType), java.lang.Long.valueOf(n0Var2.field_contentLength), java.lang.Long.valueOf(g17));
                                    if (0 == g17) {
                                        if (!n0Var2.field_needRetry) {
                                            com.tencent.mars.xlog.Log.i("MicroMsg.ResDownloader.CheckResUpdateResumeRecordHandler", "no need retry, resType %d, subType %d, version %s", java.lang.Integer.valueOf(n0Var2.field_resType), java.lang.Integer.valueOf(n0Var2.field_subType), n0Var2.field_fileVersion);
                                        } else if (1 != i17) {
                                            com.tencent.mars.xlog.Log.i("MicroMsg.ResDownloader.CheckResUpdateResumeRecordHandler", "fileSize = 0, completed file may be deleted by user, skip this because it's not wifi");
                                        } else {
                                            com.tencent.mm.pluginsdk.res.downloader.checkresupdate.p c17 = com.tencent.mm.pluginsdk.res.downloader.checkresupdate.p.c();
                                            synchronized (c17.f189632a) {
                                                newSetFromMap = java.util.Collections.newSetFromMap(new x.b(c17.f189632a.size()));
                                                newSetFromMap.addAll(c17.f189632a);
                                            }
                                            java.util.Iterator it = newSetFromMap.iterator();
                                            if (it.hasNext()) {
                                                android.support.v4.media.f.a(it.next());
                                                com.tencent.mm.sdk.platformtools.t8.P(n0Var2.field_fileVersion, 0);
                                                throw null;
                                            }
                                            n0Var2.field_fileUpdated = true;
                                            com.tencent.mm.pluginsdk.res.downloader.checkresupdate.p c18 = com.tencent.mm.pluginsdk.res.downloader.checkresupdate.p.c();
                                            int i27 = n0Var2.field_resType;
                                            int i28 = n0Var2.field_subType;
                                            java.lang.String str3 = n0Var2.field_groupId2;
                                            if (str3 == null) {
                                                str3 = "";
                                            }
                                            c18.i(i27, i28, 0, str3.equals("NewXml"));
                                            com.tencent.mm.pluginsdk.res.downloader.model.j0.f189679a.g(n0Var2, true);
                                        }
                                    }
                                    com.tencent.mm.pluginsdk.res.downloader.checkresupdate.e0.e(n0Var2.field_resType, n0Var2.field_subType, com.tencent.mm.sdk.platformtools.t8.P(n0Var2.field_fileVersion, 0), (int) n0Var2.field_reportId, 76);
                                    com.tencent.mm.pluginsdk.res.downloader.model.j0.f189679a.a(com.tencent.mm.pluginsdk.res.downloader.checkresupdate.t.d(n0Var2));
                                } else if (com.tencent.mm.pluginsdk.res.downloader.checkresupdate.a0.b(n0Var2)) {
                                    com.tencent.mars.xlog.Log.i("MicroMsg.ResDownloader.CheckResUpdateResumeRecordHandler", "md5 check ok, file download complete, throw event to do decrypt");
                                    a0Var.c(n0Var2);
                                } else {
                                    com.tencent.mars.xlog.Log.i("MicroMsg.ResDownloader.CheckResUpdateResumeRecordHandler", "file invalid, re-download");
                                    a0Var.a(n0Var2, 1 == i17);
                                }
                            } else if (i19 == 1 || i19 == 0) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.ResDownloader.CheckResUpdateResumeRecordHandler", "db status: downloading or waiting, db content-length %d", java.lang.Long.valueOf(n0Var2.field_contentLength));
                                com.tencent.mm.pluginsdk.res.downloader.model.l0 l0Var2 = com.tencent.mm.pluginsdk.res.downloader.model.j0.f189679a;
                                if (l0Var2.c(n0Var2.field_urlKey)) {
                                    com.tencent.mars.xlog.Log.i("MicroMsg.ResDownloader.CheckResUpdateResumeRecordHandler", "request already in downloading queue");
                                } else if (com.tencent.mm.pluginsdk.res.downloader.checkresupdate.a0.b(n0Var2)) {
                                    com.tencent.mars.xlog.Log.i("MicroMsg.ResDownloader.CheckResUpdateResumeRecordHandler", "md5 match, request complete, throw event to do decrypt");
                                    n0Var2.field_status = 2;
                                    n0Var2.field_contentLength = o35.a.g(n0Var2.field_filePath);
                                    l0Var2.g(n0Var2, true);
                                    a0Var.c(n0Var2);
                                } else {
                                    if (0 == o35.a.g(n0Var2.field_filePath)) {
                                        n0Var2.field_fileUpdated = true;
                                        l0Var2.g(n0Var2, true);
                                        com.tencent.mm.pluginsdk.res.downloader.checkresupdate.p c19 = com.tencent.mm.pluginsdk.res.downloader.checkresupdate.p.c();
                                        int i29 = n0Var2.field_resType;
                                        int i37 = n0Var2.field_subType;
                                        java.lang.String str4 = n0Var2.field_groupId2;
                                        if (str4 == null) {
                                            str4 = "";
                                        }
                                        i18 = 0;
                                        c19.i(i29, i37, 0, str4.equals("NewXml"));
                                    } else {
                                        i18 = 0;
                                    }
                                    com.tencent.mars.xlog.Log.i("MicroMsg.ResDownloader.CheckResUpdateResumeRecordHandler", "md5 not match,  download");
                                    com.tencent.mm.pluginsdk.res.downloader.checkresupdate.e0.e(n0Var2.field_resType, n0Var2.field_subType, com.tencent.mm.sdk.platformtools.t8.P(n0Var2.field_fileVersion, i18), (int) n0Var2.field_reportId, 76);
                                    l0Var2.a(com.tencent.mm.pluginsdk.res.downloader.checkresupdate.t.d(n0Var2));
                                }
                            } else if (i19 == 4 || i19 == 3) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.ResDownloader.CheckResUpdateResumeRecordHandler", "file invalid, re-download");
                                n0Var2.field_status = 0;
                                a0Var.a(n0Var2, true);
                            }
                        } else {
                            com.tencent.mars.xlog.Log.i("MicroMsg.ResDownloader.CheckResUpdateResumeRecordHandler", "no need retry, resType %d, subType %d, version %s", java.lang.Integer.valueOf(n0Var2.field_resType), java.lang.Integer.valueOf(n0Var2.field_subType), n0Var2.field_fileVersion);
                        }
                    }
                }
            }
        }
    }

    public void g(com.tencent.mm.pluginsdk.res.downloader.model.n0 n0Var, boolean z17) {
        boolean z18;
        if (this.f189686e) {
            boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            java.lang.String str = n0Var.field_urlKey;
            com.tencent.mm.pluginsdk.res.downloader.model.p0 p0Var = this.f189682a;
            if (p0Var.z0(str) != null) {
                p0Var.J0(n0Var);
                z18 = false;
            } else {
                p0Var.insert(n0Var);
                z18 = true;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ResDownloaderCore", "doUpdate: urlKey = %s, opIsInsert(%b) cost = %d", n0Var.field_urlKey, java.lang.Boolean.valueOf(z18), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        }
    }
}
