package r61;

/* loaded from: classes8.dex */
public class v0 {

    /* renamed from: f, reason: collision with root package name */
    public int f392973f = -1;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f392968a = "";

    /* renamed from: b, reason: collision with root package name */
    public int f392969b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f392970c = 0;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f392971d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f392972e = "";

    public android.content.ContentValues a() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if ((this.f392973f & 1) != 0) {
            java.lang.String str = this.f392968a;
            if (str == null) {
                str = "";
            }
            contentValues.put(dm.i4.COL_USERNAME, str);
        }
        if ((this.f392973f & 2) != 0) {
            contentValues.put("friendtype", java.lang.Integer.valueOf(this.f392969b));
        }
        if ((this.f392973f & 4) != 0) {
            contentValues.put("updatetime", java.lang.Integer.valueOf(this.f392970c));
        }
        if ((this.f392973f & 8) != 0) {
            contentValues.put("reserved1", (java.lang.Integer) 0);
        }
        if ((this.f392973f & 16) != 0) {
            contentValues.put("reserved2", (java.lang.Integer) 0);
        }
        if ((this.f392973f & 32) != 0) {
            java.lang.String str2 = this.f392971d;
            if (str2 == null) {
                str2 = "";
            }
            contentValues.put("reserved3", str2);
        }
        if ((this.f392973f & 64) != 0) {
            java.lang.String str3 = this.f392972e;
            contentValues.put("reserved4", str3 != null ? str3 : "");
        }
        return contentValues;
    }
}
