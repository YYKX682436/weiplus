package r61;

/* loaded from: classes11.dex */
public class o0 {

    /* renamed from: g, reason: collision with root package name */
    public int f392929g = -1;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f392923a = "";

    /* renamed from: b, reason: collision with root package name */
    public int f392924b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f392925c = 0;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f392926d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f392927e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f392928f = "";

    public android.content.ContentValues a() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if ((this.f392929g & 1) != 0) {
            java.lang.String str = this.f392923a;
            if (str == null) {
                str = "";
            }
            contentValues.put(dm.i4.COL_USERNAME, str);
        }
        if ((this.f392929g & 2) != 0) {
            contentValues.put("sex", java.lang.Integer.valueOf(this.f392924b));
        }
        if ((this.f392929g & 4) != 0) {
            contentValues.put("personalcard", java.lang.Integer.valueOf(this.f392925c));
        }
        if ((this.f392929g & 8) != 0) {
            java.lang.String str2 = this.f392926d;
            if (str2 == null) {
                str2 = "";
            }
            contentValues.put("province", str2);
        }
        if ((this.f392929g & 16) != 0) {
            java.lang.String str3 = this.f392927e;
            if (str3 == null) {
                str3 = "";
            }
            contentValues.put("city", str3);
        }
        if ((this.f392929g & 32) != 0) {
            java.lang.String str4 = this.f392928f;
            contentValues.put("signature", str4 != null ? str4 : "");
        }
        return contentValues;
    }
}
