package h02;

/* loaded from: classes8.dex */
public class b extends l75.n0 implements vz.r1 {

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String[] f277869d = {l75.n0.getCreateSQLs(h02.a.f277868m2, "FileDownloadInfo"), "CREATE INDEX IF NOT EXISTS filedownloadinfo_appId  on FileDownloadInfo  (  appId )", "CREATE INDEX IF NOT EXISTS filedownloadinfo_status  on FileDownloadInfo  (  status )"};

    public b(l75.k0 k0Var) {
        super(k0Var, h02.a.f277868m2, "FileDownloadInfo", null);
    }

    public h02.a D0(long j17) {
        h02.a aVar = null;
        if (j17 < 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FileDownloadInfoStorage", "download id is not avaiable");
            return null;
        }
        android.database.Cursor rawQuery = rawQuery("select * from FileDownloadInfo where downloadId=" + j17, new java.lang.String[0]);
        if (rawQuery == null) {
            return null;
        }
        if (rawQuery.moveToFirst()) {
            aVar = new h02.a();
            aVar.convertFrom(rawQuery);
        }
        rawQuery.close();
        return aVar;
    }

    public boolean y0() {
        return execSQL("FileDownloadInfo", "delete from FileDownloadInfo");
    }

    public h02.a z0(java.lang.String str) {
        h02.a aVar = null;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FileDownloadInfoStorage", "appId is null");
            return null;
        }
        android.database.Cursor rawQuery = rawQuery("select * from FileDownloadInfo where appId=? or rawAppId=?", str, str);
        if (rawQuery == null) {
            return null;
        }
        if (rawQuery.moveToFirst()) {
            aVar = new h02.a();
            aVar.convertFrom(rawQuery);
        }
        rawQuery.close();
        return aVar;
    }
}
