package r61;

/* loaded from: classes8.dex */
public class w0 extends l75.s0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f392976e = {"CREATE TABLE IF NOT EXISTS invitefriendopen ( username text  PRIMARY KEY , friendtype int  , updatetime int  , reserved1 int  , reserved2 int  , reserved3 text  , reserved4 text  ) "};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f392977d;

    public w0(l75.k0 k0Var) {
        this.f392977d = k0Var;
    }

    public boolean m0(java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select invitefriendopen.username,invitefriendopen.friendtype,invitefriendopen.updatetime,invitefriendopen.reserved1,invitefriendopen.reserved2,invitefriendopen.reserved3,invitefriendopen.reserved4 from invitefriendopen   where invitefriendopen.username = \"");
        java.lang.String str2 = "" + str;
        com.tencent.mm.sdk.platformtools.t8.n(str2);
        sb6.append(str2);
        sb6.append("\"");
        android.database.Cursor f17 = this.f392977d.f(sb6.toString(), null, 2);
        boolean moveToFirst = f17.moveToFirst();
        f17.close();
        return moveToFirst;
    }

    public boolean n0(r61.v0 v0Var) {
        java.lang.String str = v0Var.f392968a;
        if (str == null) {
            str = "";
        }
        boolean m07 = m0(str);
        l75.k0 k0Var = this.f392977d;
        if (!m07) {
            v0Var.f392973f = -1;
            return ((int) k0Var.l("invitefriendopen", dm.i4.COL_USERNAME, v0Var.a())) != -1;
        }
        v0Var.f392973f = -1;
        android.content.ContentValues a17 = v0Var.a();
        java.lang.String str2 = v0Var.f392968a;
        return k0Var.p("invitefriendopen", a17, "username=?", new java.lang.String[]{str2 != null ? str2 : ""}) > 0;
    }
}
