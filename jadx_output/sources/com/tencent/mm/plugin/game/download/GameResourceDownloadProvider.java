package com.tencent.mm.plugin.game.download;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/game/download/GameResourceDownloadProvider;", "Landroid/content/ContentProvider;", "<init>", "()V", "plugin-game_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class GameResourceDownloadProvider extends android.content.ContentProvider {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String f139441e = com.tencent.mm.sdk.platformtools.x2.f193072b + ".plugin.gamecenter.gameResProvider";

    /* renamed from: d, reason: collision with root package name */
    public final android.content.UriMatcher f139442d;

    public GameResourceDownloadProvider() {
        android.content.UriMatcher uriMatcher = new android.content.UriMatcher(-1);
        this.f139442d = uriMatcher;
        uriMatcher.addURI(f139441e, "res_task", 101);
    }

    public final boolean a(java.lang.String str) {
        if (str == null || str.length() == 0) {
            com.tencent.mars.xlog.Log.e("GameResourceDownloadProvider", "gamelog.gameRes , contentProvider,callingPkg isNullOrEmpty ");
            return false;
        }
        if (!gm0.j1.i().f273218k) {
            com.tencent.mars.xlog.Log.e("GameResourceDownloadProvider", "gamelog.gameRes , contentProvider,MMKernel uninit");
            return false;
        }
        if (gm0.j1.b().m()) {
            return true;
        }
        com.tencent.mars.xlog.Log.e("GameResourceDownloadProvider", "gamelog.gameRes , contentProvider,MMKernel uninit");
        return false;
    }

    public final boolean b(com.tencent.mm.vfs.r6 r6Var, java.lang.String str) {
        com.tencent.mm.vfs.r6[] G = r6Var.G();
        if (G == null) {
            return false;
        }
        for (com.tencent.mm.vfs.r6 r6Var2 : G) {
            if (r6Var2.A() && kotlin.jvm.internal.o.b(r6Var2.getName(), str)) {
                r6Var2.l();
                return true;
            }
            if (r6Var2.y()) {
                return b(r6Var2, str);
            }
        }
        return false;
    }

    @Override // android.content.ContentProvider
    public int delete(android.net.Uri uri, java.lang.String str, java.lang.String[] strArr) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(uri, "uri");
        com.tencent.mars.xlog.Log.i("GameResourceDownloadProvider", "gamelog.gameRes , contentProvider, delete");
        java.lang.String callingPackage = getCallingPackage();
        if (!a(callingPackage)) {
            return 0;
        }
        if (this.f139442d.match(uri) != 101) {
            com.tencent.mars.xlog.Log.e("GameResourceDownloadProvider", "gamelog.gameRes , contentProvider, path not query");
            return 0;
        }
        q43.j Vi = ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Vi();
        kotlin.jvm.internal.o.d(callingPackage);
        q43.a z07 = Vi.z0(callingPackage);
        if (z07 == null) {
            com.tencent.mars.xlog.Log.e("GameResourceDownloadProvider", "gamelog.gameRes , contentProvider, delete gameResourceDownloadInfo is null");
            return 0;
        }
        if (kotlin.jvm.internal.o.b(uri.getQueryParameter("finished"), "true")) {
            n33.d dVar = new n33.d();
            try {
                dVar.parseFrom(z07.field_downloadItemList);
                java.util.LinkedList<n33.c> linkedList = dVar.f334493d;
                if (linkedList != null) {
                    for (n33.c cVar : linkedList) {
                        ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
                        com.tencent.mars.xlog.Log.i("GameResourceDownloadProvider", "gamelog.gameRes , contentProvider, delete downloadId:" + cVar.f334484d + " ret:" + com.tencent.mm.plugin.downloader.model.r0.i().t(cVar.f334484d));
                    }
                }
                com.tencent.mars.xlog.Log.i("GameResourceDownloadProvider", "gamelog.gameRes , contentProvider, delete packageName:" + callingPackage + ", delDownloadInfo: " + ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Vi().y0(callingPackage));
            } catch (java.lang.Exception unused) {
                com.tencent.mars.xlog.Log.e("GameResourceDownloadProvider", "gamelog.gameRes , contentProvider, delete GameResDownloadList parseFrom error");
                com.tencent.mm.vfs.w6.f(q43.g.f360094a.d(callingPackage));
                ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Vi().y0(callingPackage);
            }
            return 0;
        }
        java.util.List<java.lang.String> queryParameters = uri.getQueryParameters("file");
        if (!(queryParameters == null || queryParameters.isEmpty())) {
            n33.d dVar2 = new n33.d();
            try {
                dVar2.parseFrom(z07.field_downloadItemList);
                kotlin.jvm.internal.o.d(queryParameters);
                for (java.lang.String str2 : queryParameters) {
                    java.util.LinkedList linkedList2 = dVar2.f334493d;
                    if (linkedList2 != null) {
                        java.util.Iterator it = linkedList2.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it.next();
                            java.lang.String CustomPath = ((n33.c) obj).f334492o;
                            kotlin.jvm.internal.o.f(CustomPath, "CustomPath");
                            kotlin.jvm.internal.o.d(str2);
                            if (r26.i0.n(CustomPath, str2, false)) {
                                break;
                            }
                        }
                        n33.c cVar2 = (n33.c) obj;
                        if (cVar2 != null) {
                            ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
                            com.tencent.mars.xlog.Log.i("GameResourceDownloadProvider", "gamelog.gameRes , contentProvider, delete downloadId:" + cVar2.f334484d + " ret:" + com.tencent.mm.plugin.downloader.model.r0.i().t(cVar2.f334484d) + "  fileName = " + cVar2.f334492o);
                        }
                    }
                }
            } catch (java.lang.Exception unused2) {
                java.lang.String d17 = q43.g.f360094a.d(callingPackage);
                kotlin.jvm.internal.o.d(queryParameters);
                for (java.lang.String str3 : queryParameters) {
                    com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(d17);
                    kotlin.jvm.internal.o.d(str3);
                    com.tencent.mars.xlog.Log.i("GameResourceDownloadProvider", "gamelog.gameRes , contentProvider, delete success:" + b(r6Var, str3) + "  fileName = " + str3);
                }
            }
        }
        return 0;
    }

    @Override // android.content.ContentProvider
    public java.lang.String getType(android.net.Uri p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
        com.tencent.mars.xlog.Log.e("GameResourceDownloadProvider", "gamelog.gameRes , contentProvider, not support getType");
        return "not support getType";
    }

    @Override // android.content.ContentProvider
    public android.net.Uri insert(android.net.Uri uri, android.content.ContentValues contentValues) {
        kotlin.jvm.internal.o.g(uri, "uri");
        com.tencent.mars.xlog.Log.e("GameResourceDownloadProvider", "gamelog.gameRes , contentProvider, not support insert");
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0183, code lost:
    
        if (r6 != 6) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01a9 A[SYNTHETIC] */
    @Override // android.content.ContentProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.database.Cursor query(android.net.Uri r18, java.lang.String[] r19, java.lang.String r20, java.lang.String[] r21, java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 507
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.game.download.GameResourceDownloadProvider.query(android.net.Uri, java.lang.String[], java.lang.String, java.lang.String[], java.lang.String):android.database.Cursor");
    }

    @Override // android.content.ContentProvider
    public int update(android.net.Uri uri, android.content.ContentValues contentValues, java.lang.String str, java.lang.String[] strArr) {
        kotlin.jvm.internal.o.g(uri, "uri");
        com.tencent.mars.xlog.Log.e("GameResourceDownloadProvider", "gamelog.gameRes , contentProvider, not support update");
        return 0;
    }
}
