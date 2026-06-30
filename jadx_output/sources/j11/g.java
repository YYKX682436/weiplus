package j11;

/* loaded from: classes11.dex */
public class g extends l75.s0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f297110e = {"CREATE TABLE IF NOT EXISTS getcontactinfov2 ( username text  PRIMARY KEY , inserttime long  , type int  , lastgettime int  , reserved1 int  , reserved2 int  , reserved3 text  , reserved4 text  ) "};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f297111d;

    public g(l75.k0 k0Var) {
        this.f297111d = k0Var;
    }

    public boolean m0(java.lang.String str) {
        if (this.f297111d.delete("getcontactinfov2", "username= ?", new java.lang.String[]{"" + str}) <= 0) {
            return false;
        }
        doNotify(str);
        return true;
    }

    public boolean n0(j11.f fVar) {
        if (fVar == null) {
            return false;
        }
        fVar.f297109i = -1;
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if ((fVar.f297109i & 1) != 0) {
            java.lang.String str = fVar.f297101a;
            if (str == null) {
                str = "";
            }
            contentValues.put(dm.i4.COL_USERNAME, str);
        }
        if ((fVar.f297109i & 2) != 0) {
            contentValues.put("inserttime", java.lang.Long.valueOf(fVar.f297102b));
        }
        if ((fVar.f297109i & 4) != 0) {
            contentValues.put("type", java.lang.Integer.valueOf(fVar.f297103c));
        }
        if ((fVar.f297109i & 8) != 0) {
            contentValues.put("lastgettime", java.lang.Integer.valueOf(fVar.f297104d));
        }
        if ((fVar.f297109i & 16) != 0) {
            contentValues.put("reserved1", java.lang.Integer.valueOf(fVar.f297105e));
        }
        if ((fVar.f297109i & 32) != 0) {
            contentValues.put("reserved2", java.lang.Integer.valueOf(fVar.f297106f));
        }
        if ((fVar.f297109i & 64) != 0) {
            java.lang.String str2 = fVar.f297107g;
            if (str2 == null) {
                str2 = "";
            }
            contentValues.put("reserved3", str2);
        }
        if ((fVar.f297109i & 128) != 0) {
            java.lang.String str3 = fVar.f297108h;
            if (str3 == null) {
                str3 = "";
            }
            contentValues.put("reserved4", str3);
        }
        if (((int) this.f297111d.m("getcontactinfov2", dm.i4.COL_USERNAME, contentValues)) == -1) {
            return false;
        }
        java.lang.String str4 = fVar.f297101a;
        doNotify(str4 != null ? str4 : "");
        return true;
    }
}
