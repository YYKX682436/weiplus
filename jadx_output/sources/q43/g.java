package q43;

/* loaded from: classes8.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final q43.g f360094a = new q43.g();

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.b4 f360095b = new com.tencent.mm.sdk.platformtools.b4("GameResourceDownloadManager", (com.tencent.mm.sdk.platformtools.a4) q43.b.f360082d, true);

    /* renamed from: c, reason: collision with root package name */
    public static int f360096c = 1;

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
    
        if (r7.moveToFirst() != false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0029, code lost:
    
        r1 = new q43.a();
        r1.convertFrom(r7);
        r0.add(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
    
        if (r7.moveToNext() != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
    
        r7.close();
        r7 = new java.util.ArrayList();
        r1 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
    
        if (r1.hasNext() == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004c, code lost:
    
        r2 = (q43.a) r1.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0062, code lost:
    
        if (java.lang.Math.abs(com.tencent.mm.sdk.platformtools.t8.i1() - r2.field_checkCgiTime) < r2.field_intervalSeconds) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0064, code lost:
    
        r7.add(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0068, code lost:
    
        com.tencent.mars.xlog.Log.i("MicroMsg.GameResourceDownloadStorage", "getNeedCheckItems, allItemsSize:" + r0.size() + ", needCheckItemsSize:" + r7.size());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(q43.g r7) {
        /*
            r7.getClass()
            java.lang.Class<m33.s1> r7 = m33.s1.class
            i95.m r7 = i95.n0.c(r7)
            m33.s1 r7 = (m33.s1) r7
            com.tencent.mm.plugin.game.s1 r7 = (com.tencent.mm.plugin.game.s1) r7
            q43.j r7 = r7.Vi()
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.String r1 = "select * from GameResourceDownload"
            android.database.Cursor r7 = r7.rawQuery(r1, r0)
            if (r7 != 0) goto L1e
            r7 = 0
            goto L8b
        L1e:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            boolean r1 = r7.moveToFirst()
            if (r1 == 0) goto L3a
        L29:
            q43.a r1 = new q43.a
            r1.<init>()
            r1.convertFrom(r7)
            r0.add(r1)
            boolean r1 = r7.moveToNext()
            if (r1 != 0) goto L29
        L3a:
            r7.close()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r1 = r0.iterator()
        L46:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L68
            java.lang.Object r2 = r1.next()
            q43.a r2 = (q43.a) r2
            long r3 = com.tencent.mm.sdk.platformtools.t8.i1()
            long r5 = r2.field_checkCgiTime
            long r3 = r3 - r5
            long r3 = java.lang.Math.abs(r3)
            int r5 = r2.field_intervalSeconds
            long r5 = (long) r5
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 < 0) goto L46
            r7.add(r2)
            goto L46
        L68:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "getNeedCheckItems, allItemsSize:"
            r1.<init>(r2)
            int r0 = r0.size()
            r1.append(r0)
            java.lang.String r0 = ", needCheckItemsSize:"
            r1.append(r0)
            int r0 = r7.size()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "MicroMsg.GameResourceDownloadStorage"
            com.tencent.mars.xlog.Log.i(r1, r0)
        L8b:
            if (r7 == 0) goto Lbe
            java.util.Iterator r7 = r7.iterator()
        L91:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto Lbe
            java.lang.Object r0 = r7.next()
            q43.a r0 = (q43.a) r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "gamelog.download, downloadGameRes , loopDownload, appId:"
            r1.<init>(r2)
            java.lang.String r2 = r0.field_appId
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "MicroMsg.GameResourceDownloadManager"
            com.tencent.mars.xlog.Log.i(r2, r1)
            q43.g r1 = q43.g.f360094a
            java.lang.String r2 = r0.field_appId
            int r3 = r0.field_scene
            long r4 = r0.field_taskExpiredSeconds
            r1.h(r2, r3, r4)
            goto L91
        Lbe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q43.g.a(q43.g):void");
    }

    public final void b(java.lang.String packageName) {
        kotlin.jvm.internal.o.g(packageName, "packageName");
        if (packageName.length() == 0) {
            return;
        }
        q43.a z07 = ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Vi().z0(packageName);
        if (z07 != null) {
            n33.d dVar = new n33.d();
            try {
                dVar.parseFrom(z07.field_downloadItemList);
                java.util.LinkedList<n33.c> linkedList = dVar.f334493d;
                if (linkedList != null) {
                    for (n33.c cVar : linkedList) {
                        ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
                        com.tencent.mars.xlog.Log.i("MicroMsg.GameResourceDownloadManager", "gamelog.download, downloadGameRes , cancelDownloadTask, downloadId:" + cVar.f334484d + " ret:" + com.tencent.mm.plugin.downloader.model.r0.i().t(cVar.f334484d));
                    }
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.GameResourceDownloadManager", "gamelog.download, downloadGameRes , cancelDownloadTask, catch err:" + e17.getMessage());
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.GameResourceDownloadManager", "gamelog.download, downloadGameRes , cancelDownloadTask, packageName:" + packageName + ", delDownloadInfo: " + ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Vi().y0(packageName));
    }

    public final java.lang.String c(java.lang.String str) {
        return str + "_gameres_1";
    }

    public final java.lang.String d(java.lang.String pkgName) {
        kotlin.jvm.internal.o.g(pkgName, "pkgName");
        return com.tencent.mm.vfs.q7.c("gameDownload") + "/gameRes/" + pkgName + '/';
    }

    public final java.lang.String e(java.lang.String str) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put(com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant.EXTRA_ERROR_MSG, str);
        try {
            java.lang.String encode = java.net.URLEncoder.encode(jSONObject.toString(), com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
            kotlin.jvm.internal.o.f(encode, "encode(...)");
            return encode;
        } catch (java.io.UnsupportedEncodingException unused) {
            return "";
        }
    }

    public final void f(java.lang.String packageName) {
        kotlin.jvm.internal.o.g(packageName, "packageName");
        q43.a z07 = ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Vi().z0(packageName);
        if (z07 != null) {
            n33.d dVar = new n33.d();
            try {
                dVar.parseFrom(z07.field_downloadItemList);
                java.util.LinkedList<n33.c> linkedList = dVar.f334493d;
                if (linkedList != null) {
                    for (n33.c cVar : linkedList) {
                        if (!cVar.f334485e) {
                            com.tencent.mm.plugin.downloader.model.t0 t0Var = new com.tencent.mm.plugin.downloader.model.t0(null);
                            t0Var.f97150a = cVar.f334486f;
                            t0Var.f97152c = cVar.f334487g;
                            t0Var.A = cVar.f334488h;
                            t0Var.f97154e = cVar.f334489i;
                            t0Var.f97156g = cVar.f334490m;
                            t0Var.f97161l = 33;
                            t0Var.f97157h = cVar.f334491n;
                            t0Var.f97158i = false;
                            t0Var.f97155f = 3;
                            t0Var.f97163n = true;
                            t0Var.f97175z = cVar.f334492o;
                            vz.q1 q1Var = (vz.q1) i95.n0.c(vz.q1.class);
                            java.lang.String str = cVar.f334486f;
                            ((uz.p1) q1Var).getClass();
                            com.tencent.mm.plugin.downloader.model.m0.k(str);
                            ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
                            long c17 = com.tencent.mm.plugin.downloader.model.r0.i().c(t0Var);
                            com.tencent.mars.xlog.Log.i("MicroMsg.GameResourceDownloadManager", "gamelog.download, downloadGameRes , add download task[packageName:" + cVar.f334491n + ", downloadUrl:" + cVar.f334486f + ", downloadPath:" + cVar.f334492o + "], size:" + cVar.f334487g + ", md5:" + cVar.f334489i + ", downloadId:" + c17);
                            cVar.f334484d = c17;
                            cVar.f334485e = true;
                            if (c17 > 0) {
                                break;
                            }
                        }
                    }
                }
                z07.field_downloadItemList = dVar.toByteArray();
                com.tencent.mars.xlog.Log.i("MicroMsg.GameResourceDownloadManager", "gamelog.download, downloadGameRes , performNextDownload, updateRet:" + ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Vi().update(z07, new java.lang.String[0]));
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.GameResourceDownloadManager", "gamelog.download, downloadGameRes , performNextDownload, catch err:" + e17.getMessage());
            }
        }
    }

    public final void g() {
        ((ku5.t0) ku5.t0.f312615d).h(q43.c.f360083d, "GameResourceDownloadRequest_resetCheckTimer");
    }

    public final void h(java.lang.String str, int i17, long j17) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GameResourceDownloadManager", "gamelog.download, downloadGameRes , appId is null");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.GameResourceDownloadManager", "gamelog.download, downloadGameRes , appId is " + str + " scene = " + i17);
        ((ku5.t0) ku5.t0.f312615d).h(new q43.f(str, i17, j17), "GameResourceDownloadRequest_tryDownload");
    }
}
