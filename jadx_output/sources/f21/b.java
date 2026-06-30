package f21;

/* loaded from: classes8.dex */
public class b extends l75.s0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f258840e = {"CREATE TABLE IF NOT EXISTS chattingbginfo ( username text  PRIMARY KEY , bgflag int  , path text  , reserved1 text  , reserved2 text  , reserved3 int  , reserved4 int  ) "};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f258841d;

    public b(l75.k0 k0Var) {
        this.f258841d = k0Var;
    }

    public f21.a m0(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingBgInfoStorage", "getByUsername() called with: username = [" + str + "]");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select chattingbginfo.username,chattingbginfo.bgflag,chattingbginfo.path,chattingbginfo.reserved1,chattingbginfo.reserved2,chattingbginfo.reserved3,chattingbginfo.reserved4 from chattingbginfo   where chattingbginfo.username = \"");
        java.lang.String str2 = "" + str;
        com.tencent.mm.sdk.platformtools.t8.n(str2);
        sb6.append(str2);
        sb6.append("\"");
        f21.a aVar = null;
        android.database.Cursor f17 = this.f258841d.f(sb6.toString(), null, 2);
        if (f17 == null) {
            return null;
        }
        if (f17.moveToFirst()) {
            aVar = new f21.a();
            aVar.f258832a = f17.getString(0);
            aVar.f258833b = f17.getInt(1);
            aVar.f258834c = f17.getString(2);
            aVar.f258835d = f17.getString(3);
            aVar.f258836e = f17.getString(4);
            aVar.f258837f = f17.getInt(5);
            aVar.f258838g = f17.getInt(6);
        }
        f17.close();
        return aVar;
    }

    public boolean n0(f21.a aVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingBgInfoStorage", "insert() called with: chattingbginfo = [" + aVar + "]");
        if (aVar == null) {
            return false;
        }
        aVar.f258839h = -1;
        if (((int) this.f258841d.l("chattingbginfo", dm.i4.COL_USERNAME, aVar.a())) == -1) {
            return false;
        }
        java.lang.String str = aVar.f258832a;
        if (str == null) {
            str = "";
        }
        doNotify(str);
        return true;
    }

    public boolean s0(f21.a aVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingBgInfoStorage", "update() called with: info = [" + aVar + "]");
        iz5.a.g(null, aVar != null);
        android.content.ContentValues a17 = aVar.a();
        if (a17.size() > 0) {
            java.lang.String str = aVar.f258832a;
            if (str == null) {
                str = "";
            }
            if (this.f258841d.p("chattingbginfo", a17, "username= ?", new java.lang.String[]{str}) > 0) {
                java.lang.String str2 = aVar.f258832a;
                doNotify(str2 != null ? str2 : "");
                return true;
            }
        }
        return false;
    }
}
