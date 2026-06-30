package com.tencent.mm.pluginsdk.res.downloader.model;

/* loaded from: classes12.dex */
public class p0 extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f189696e = {l75.n0.getCreateSQLs(com.tencent.mm.pluginsdk.res.downloader.model.n0.U1, "ResDownloaderRecordTable")};

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f189697f = com.tencent.mm.storage.v3.f196273a + kk.k.g(java.lang.String.format(java.util.Locale.ENGLISH, "mm%d", Integer.MIN_VALUE).getBytes()) + "/";

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.HashMap f189698g;

    /* renamed from: d, reason: collision with root package name */
    public final d95.b0 f189699d;

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        f189698g = hashMap;
        hashMap.put(-1009758133, new com.tencent.mm.pluginsdk.res.downloader.model.o0());
        java.util.Iterator it = com.tencent.mm.pluginsdk.res.downloader.model.m0.a().iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.pluginsdk.res.downloader.model.o) it.next()).getClass();
        }
    }

    public p0(d95.b0 b0Var) {
        super(b0Var, com.tencent.mm.pluginsdk.res.downloader.model.n0.U1, "ResDownloaderRecordTable", null);
        new java.util.HashMap();
        this.f189699d = b0Var;
        java.util.Iterator it = com.tencent.mm.pluginsdk.res.downloader.model.m0.a().iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.pluginsdk.res.downloader.model.o) it.next()).getClass();
        }
    }

    public final java.util.List D0(java.lang.String str) {
        try {
            android.database.Cursor E = this.f189699d.E("ResDownloaderRecordTable", null, java.lang.String.format(java.util.Locale.ENGLISH, "%s like ?", "urlKey"), new java.lang.String[]{str}, null, null, null);
            if (E != null) {
                try {
                    if (!E.isClosed() && E.moveToFirst()) {
                        java.util.LinkedList linkedList = new java.util.LinkedList();
                        do {
                            com.tencent.mm.pluginsdk.res.downloader.model.n0 n0Var = new com.tencent.mm.pluginsdk.res.downloader.model.n0();
                            n0Var.convertFrom(E);
                            linkedList.add(n0Var);
                        } while (E.moveToNext());
                        E.close();
                        return linkedList;
                    }
                } finally {
                }
            }
            java.util.List emptyList = java.util.Collections.emptyList();
            if (E != null) {
                E.close();
            }
            return emptyList;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ResDownloaderStorage", "queryForKeyLike with clause(%s), get exception:%s", str, e17);
            return java.util.Collections.emptyList();
        }
    }

    public final boolean J0(com.tencent.mm.pluginsdk.res.downloader.model.n0 n0Var) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(n0Var.field_urlKey)) {
            return false;
        }
        n0Var.field_urlKey_hashcode = n0Var.field_urlKey.hashCode();
        try {
            return super.update(n0Var, "urlKey_hashcode");
        } catch (android.database.sqlite.SQLiteException | com.tencent.wcdb.database.SQLiteException e17) {
            java.lang.Object[] objArr = new java.lang.Object[4];
            objArr[0] = n0Var.field_urlKey;
            d95.b0 b0Var = this.f189699d;
            objArr[1] = java.lang.Boolean.valueOf(b0Var == null || !b0Var.isOpen());
            objArr[2] = java.lang.Boolean.valueOf(new java.io.File(f189697f + "EnResDown.db").exists());
            objArr[3] = e17;
            com.tencent.mars.xlog.Log.e("MicroMsg.ResDownloaderStorage", "update with urlKey[%s], db.isClose[%b], dbFile.exists[%b], e=%s", objArr);
            return false;
        }
    }

    public final boolean d(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ResDownloaderStorage", "delete with null or nil urlKey, return false");
            return false;
        }
        com.tencent.mm.pluginsdk.res.downloader.model.n0 n0Var = new com.tencent.mm.pluginsdk.res.downloader.model.n0();
        n0Var.field_urlKey_hashcode = str.hashCode();
        return super.delete(n0Var, "urlKey_hashcode");
    }

    @Override // l75.n0, l75.g0
    /* renamed from: y0, reason: merged with bridge method [inline-methods] */
    public final boolean insert(com.tencent.mm.pluginsdk.res.downloader.model.n0 n0Var) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(n0Var.field_urlKey)) {
            return false;
        }
        n0Var.field_urlKey_hashcode = n0Var.field_urlKey.hashCode();
        try {
            return super.insert(n0Var);
        } catch (android.database.sqlite.SQLiteException | com.tencent.wcdb.database.SQLiteException e17) {
            java.lang.Object[] objArr = new java.lang.Object[4];
            objArr[0] = n0Var.field_urlKey;
            d95.b0 b0Var = this.f189699d;
            objArr[1] = java.lang.Boolean.valueOf(b0Var == null || !b0Var.isOpen());
            objArr[2] = java.lang.Boolean.valueOf(new java.io.File(f189697f + "EnResDown.db").exists());
            objArr[3] = e17;
            com.tencent.mars.xlog.Log.e("MicroMsg.ResDownloaderStorage", "insert with urlKey[%s], db.isClose[%b], dbFile.exists[%b], e=%s", objArr);
            return false;
        }
    }

    public final com.tencent.mm.pluginsdk.res.downloader.model.n0 z0(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ResDownloaderStorage", "query with null or nil urlKey, return null");
            return null;
        }
        com.tencent.mm.pluginsdk.res.downloader.model.n0 n0Var = new com.tencent.mm.pluginsdk.res.downloader.model.n0();
        n0Var.field_urlKey_hashcode = str.hashCode();
        try {
            if (super.get(n0Var, "urlKey_hashcode")) {
                return n0Var;
            }
            return null;
        } catch (android.database.sqlite.SQLiteException | com.tencent.wcdb.database.SQLiteException e17) {
            java.lang.Object[] objArr = new java.lang.Object[4];
            objArr[0] = str;
            d95.b0 b0Var = this.f189699d;
            objArr[1] = java.lang.Boolean.valueOf(b0Var == null || !b0Var.isOpen());
            objArr[2] = java.lang.Boolean.valueOf(new java.io.File(f189697f + "EnResDown.db").exists());
            objArr[3] = e17;
            com.tencent.mars.xlog.Log.e("MicroMsg.ResDownloaderStorage", "query with urlKey[%s], db.isClose[%s], dbFile.exists[%b], e=%s", objArr);
            return null;
        }
    }
}
