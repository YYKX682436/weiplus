package p43;

/* loaded from: classes8.dex */
public final class d extends l75.n0 implements p43.b {

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f351762f;

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f351763d;

    /* renamed from: e, reason: collision with root package name */
    public final j43.a f351764e;

    static {
        java.util.ArrayList d17 = kz5.c0.d(l75.n0.getCreateSQLs(p43.a.f351760J, "GameLocalVideoInfo"));
        java.lang.String[] INDEX_CREATE = dm.p5.f239141t;
        kotlin.jvm.internal.o.f(INDEX_CREATE, "INDEX_CREATE");
        kz5.h0.w(d17, INDEX_CREATE);
        f351762f = (java.lang.String[]) d17.toArray(new java.lang.String[0]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(l75.k0 storage) {
        super(storage, p43.a.f351760J, "GameLocalVideoInfo", dm.p5.f239141t);
        kotlin.jvm.internal.o.g(storage, "storage");
        this.f351763d = storage;
        this.f351764e = new p43.c(this, storage);
    }

    public static final void y0(p43.d dVar, p75.k kVar, int i17, java.lang.String str) {
        dVar.getClass();
        if (str != null) {
            ((p75.e0) kVar).bindString(i17, str);
            return;
        }
        p75.e0 e0Var = (p75.e0) kVar;
        com.tencent.wcdb.database.SQLiteStatement sQLiteStatement = e0Var.f352634d;
        if (sQLiteStatement != null) {
            sQLiteStatement.bindNull(i17);
            return;
        }
        com.tencent.wcdb.compat.SQLiteStatement sQLiteStatement2 = e0Var.f352635e;
        if (sQLiteStatement2 != null) {
            sQLiteStatement2.bindNull(i17);
        }
    }

    public void D0(java.util.List videoFiles) {
        kotlin.jvm.internal.o.g(videoFiles, "videoFiles");
        if (videoFiles.isEmpty()) {
            com.tencent.stubs.logger.Log.e("GameLocalVideoInfoDaoImpl", "insertAll not   size = 0");
            return;
        }
        int size = videoFiles.size();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        l75.k0 k0Var = this.f351763d;
        long b17 = k0Var.b();
        try {
            this.f351764e.c(videoFiles);
            k0Var.w(java.lang.Long.valueOf(b17));
            com.tencent.stubs.logger.Log.i("GameLocalVideoInfoDaoImpl", "insertAll videoFiles insertDataSize = " + size + "  cost time = " + (java.lang.System.currentTimeMillis() - currentTimeMillis));
        } catch (java.lang.Throwable th6) {
            k0Var.w(java.lang.Long.valueOf(b17));
            throw th6;
        }
    }

    public java.util.List J0(java.lang.String userId) {
        kotlin.jvm.internal.o.g(userId, "userId");
        java.lang.String str = "SELECT * FROM GameLocalVideoInfo WHERE userId = " + d95.b0.O(userId) + " ORDER BY createTime DESC";
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.database.Cursor f17 = this.f351763d.f(str, null, 2);
        if (f17 != null) {
            try {
                if (f17.moveToFirst()) {
                    while (!f17.isAfterLast()) {
                        p43.a aVar = new p43.a();
                        aVar.convertFrom(f17);
                        arrayList.add(aVar);
                        f17.moveToNext();
                    }
                }
                vz5.b.a(f17, null);
            } finally {
            }
        }
        return arrayList;
    }

    public void z0(java.util.List fileIds) {
        java.lang.Iterable<p43.a> iterable;
        kotlin.jvm.internal.o.g(fileIds, "fileIds");
        if (!fileIds.isEmpty()) {
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(fileIds, 10));
            java.util.Iterator it = fileIds.iterator();
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                q33.c cVar = new q33.c();
                cVar.f359938d = str;
                arrayList.add(cVar);
            }
            q33.d dVar = new q33.d();
            dVar.f359941d = 2;
            dVar.f359942e = new java.util.LinkedList(arrayList);
            com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
            lVar.f70664a = dVar;
            lVar.f70665b = new q33.e();
            lVar.f70666c = "/cgi-bin/mmgame-bin/reportlocalwxagvideo";
            lVar.f70667d = 25686;
            ((h80.i) ((com.tencent.mm.ipcinvoker.wx_extension.x) i95.n0.c(com.tencent.mm.ipcinvoker.wx_extension.x.class))).wi(lVar.a(), new i53.j4(dVar));
        }
        boolean z17 = fileIds.isEmpty();
        l75.k0 k0Var = this.f351763d;
        if (z17) {
            iterable = kz5.p0.f313996d;
        } else {
            java.lang.String str2 = "SELECT * FROM GameLocalVideoInfo WHERE fileId IN " + s33.y.d(fileIds);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            android.database.Cursor f17 = k0Var.f(str2, null, 2);
            if (f17 != null) {
                try {
                    if (f17.moveToFirst()) {
                        while (!f17.isAfterLast()) {
                            p43.a aVar = new p43.a();
                            aVar.convertFrom(f17);
                            arrayList2.add(aVar);
                            f17.moveToNext();
                        }
                    }
                    vz5.b.a(f17, null);
                } finally {
                }
            }
            iterable = arrayList2;
        }
        for (p43.a aVar2 : iterable) {
            com.tencent.mm.vfs.w6.h(aVar2.field_filePath);
            com.tencent.mm.vfs.w6.h(aVar2.field_coverPath);
        }
        com.tencent.stubs.logger.Log.i("GameLocalVideoInfoDaoImpl", "deleteByUserId fileIdsSize = " + fileIds.size() + "  result = " + k0Var.delete("GameLocalVideoInfo", "fileId IN " + s33.y.d(fileIds), new java.lang.String[0]));
    }
}
