package mt1;

/* loaded from: classes12.dex */
public final class o0 implements java.util.concurrent.Callable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f331246d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f331247e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f331248f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f331249g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f331250h;

    public o0(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, long j18) {
        this.f331246d = j17;
        this.f331247e = str;
        this.f331248f = str2;
        this.f331249g = str3;
        this.f331250h = j18;
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("migrateFromDownload2Attachment, rowid=");
        long j17 = this.f331246d;
        sb6.append(j17);
        sb6.append(", filePath=");
        java.lang.String str = this.f331247e;
        sb6.append(str);
        sb6.append(", newAttachmentName = ");
        java.lang.String str2 = this.f331248f;
        sb6.append(str2);
        sb6.append(", indexFileName = ");
        java.lang.String str3 = this.f331249g;
        sb6.append(str3);
        com.tencent.mars.xlog.Log.i("MicroMsg.DuplicateFileLinkifyLogic", sb6.toString());
        java.lang.String d17 = mt1.q0.f331258a.d(str, "_backup");
        com.tencent.mm.sdk.platformtools.o4.L().putBoolean("DownloadMigrationError", true);
        ot1.j jVar = mt1.q0.f331259b;
        jVar.f348852g.a();
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("originalPath", str);
        contentValues.put("targetPath", str2);
        contentValues.put("status", (java.lang.Integer) 0);
        contentValues.put("indexRowId", java.lang.Long.valueOf(j17));
        long j18 = this.f331250h;
        contentValues.put("msgId", java.lang.Long.valueOf(j18));
        contentValues.put(dm.i4.COL_USERNAME, "talker-ignore");
        long T = jVar.f348849d.T("WxFileIndexDownloadMigration", dm.i4.COL_ID, contentValues, false);
        if (com.tencent.mm.vfs.w6.d(str, d17, false) < 0) {
            return -101;
        }
        jVar.t3(T, 1);
        if (!com.tencent.mm.vfs.w6.x(d17, str2, true)) {
            return -102;
        }
        jVar.t3(T, 2);
        try {
            gm0.j1.u().f273153f.H("appattach", "UPDATE appattach SET fileFullPath=? WHERE msgInfoId=?", new java.lang.Object[]{str2, java.lang.Long.valueOf(j18)});
            jVar.t3(T, 3);
            mt1.b0.f331191a.n().v3(j17, str3);
            jVar.t3(T, 4);
            if (!com.tencent.mm.vfs.w6.h(str)) {
                return -105;
            }
            jVar.t3(T, 200);
            com.tencent.mm.sdk.platformtools.o4.L().putBoolean("DownloadMigrationError", false);
            return 200;
        } catch (java.lang.Exception unused) {
            return -103;
        }
    }
}
