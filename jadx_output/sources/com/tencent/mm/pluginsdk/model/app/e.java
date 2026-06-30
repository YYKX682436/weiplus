package com.tencent.mm.pluginsdk.model.app;

/* loaded from: classes12.dex */
public class e extends l75.n0 implements lt.g0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f188861e = {l75.n0.getCreateSQLs(com.tencent.mm.pluginsdk.model.app.d.f188849y0, "appattach")};

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f188862f = {"DROP INDEX IF EXISTS statusIndex", "CREATE INDEX IF NOT EXISTS msgInfoIdIndex ON appattach ( msgInfoId )", "CREATE INDEX IF NOT EXISTS appattach_statusIndex ON appattach ( status )"};

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String[] f188863g = {"CREATE INDEX IF NOT EXISTS msgInfoIdTalkerIndex ON appattach ( msgInfoId,msgInfoTalker ) "};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f188864d;

    public e(l75.k0 k0Var) {
        super(k0Var, com.tencent.mm.pluginsdk.model.app.d.f188849y0, "appattach", f188862f);
        this.f188864d = k0Var;
        android.database.Cursor B = k0Var.B("PRAGMA table_info(appattach)", null);
        int columnIndex = B.getColumnIndex(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME);
        boolean z17 = false;
        while (B.moveToNext()) {
            if (columnIndex >= 0 && "msgInfoTalker".equals(B.getString(columnIndex))) {
                z17 = true;
            }
        }
        B.close();
        long F = gm0.j1.u().f273153f.F(java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        if (!z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppAttachInfoStorage", "it had no [MSGINFOTALKER] column, alter table now: %s", java.lang.Boolean.valueOf(k0Var.A("appattach", "alter table appattach add msgInfoTalker TEXT")));
        }
        if (F > 0) {
            gm0.j1.u().f273153f.w(java.lang.Long.valueOf(F));
        }
        qt0.b.f366491a.b(new qt0.e(k0Var, f188863g, "appattach", null, 0));
    }

    public com.tencent.mm.pluginsdk.model.app.d D0(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        com.tencent.mm.pluginsdk.model.app.d dVar = new com.tencent.mm.pluginsdk.model.app.d();
        dVar.field_mediaSvrId = str;
        if (!get(dVar, "mediaSvrId") && !get(dVar, "mediaId")) {
            return null;
        }
        java.lang.String str2 = dVar.field_fileFullPath;
        if (str2 != null) {
            if (str2.startsWith(gm0.j1.u().d() + "attachment/")) {
                com.tencent.mm.vfs.q7.g(dVar.field_fileFullPath, -1L, 4, false);
            }
        }
        return dVar;
    }

    public com.tencent.mm.pluginsdk.model.app.d J0(long j17, java.lang.String str) {
        com.tencent.mm.pluginsdk.model.app.d dVar = new com.tencent.mm.pluginsdk.model.app.d();
        dVar.field_msgInfoId = j17;
        dVar.field_msgInfoTalker = str;
        if (pt0.p.f358218a1.a("appattach")) {
            if (!get(dVar, "msgInfoId", "msgInfoTalker")) {
                return null;
            }
            java.lang.String str2 = dVar.field_fileFullPath;
            if (str2 != null) {
                if (str2.startsWith(gm0.j1.u().d() + "attachment/")) {
                    com.tencent.mm.vfs.q7.g(dVar.field_fileFullPath, -1L, 4, false);
                }
            }
            return dVar;
        }
        com.tencent.mm.pluginsdk.model.app.d dVar2 = new com.tencent.mm.pluginsdk.model.app.d();
        dVar2.field_msgInfoId = j17;
        if (!get(dVar2, "msgInfoId")) {
            return null;
        }
        java.lang.String str3 = dVar2.field_fileFullPath;
        if (str3 != null) {
            if (str3.startsWith(gm0.j1.u().d() + "attachment/")) {
                com.tencent.mm.vfs.q7.g(dVar2.field_fileFullPath, -1L, 4, false);
            }
        }
        return dVar2;
    }

    public android.database.Cursor L0(int i17, com.tencent.wcdb.support.CancellationSignal cancellationSignal) {
        l75.k0 k0Var = this.f188864d;
        if (!(k0Var instanceof d95.b0)) {
            return null;
        }
        return ((d95.b0) k0Var).P().query(false, "appattach", com.tencent.mm.pluginsdk.model.app.d.f188849y0.f316954c, "msgInfoTalker IS NULL", new java.lang.String[0], null, null, null, i17 + "", cancellationSignal);
    }

    @Override // l75.n0, l75.g0
    /* renamed from: P0, reason: merged with bridge method [inline-methods] */
    public boolean insert(com.tencent.mm.pluginsdk.model.app.d dVar) {
        if (dVar != null) {
            pt0.p.G6(dVar.field_msgInfoId, dVar.field_msgInfoTalker);
        }
        return super.insert(dVar);
    }

    @Override // l75.n0, l75.g0
    /* renamed from: W0, reason: merged with bridge method [inline-methods] */
    public boolean update(com.tencent.mm.pluginsdk.model.app.d dVar, java.lang.String... strArr) {
        if (dVar != null) {
            pt0.p.G6(dVar.field_msgInfoId, dVar.field_msgInfoTalker);
        }
        boolean update = super.update(dVar, strArr);
        java.lang.String str = dVar.field_mediaId;
        return update;
    }

    public void b1(long j17, long j18) {
        this.f188864d.A("appattach", " update appattach set status = " + j18 + " , lastModifyTime = " + com.tencent.mm.sdk.platformtools.t8.i1() + " where rowid = " + j17);
        doNotify();
    }

    public /* bridge */ /* synthetic */ boolean y0(com.tencent.mm.pluginsdk.model.app.d dVar, java.lang.String[] strArr) {
        return super.delete(dVar, strArr);
    }

    public /* bridge */ /* synthetic */ boolean z0(long j17, com.tencent.mm.pluginsdk.model.app.d dVar) {
        return super.get(j17, dVar);
    }
}
