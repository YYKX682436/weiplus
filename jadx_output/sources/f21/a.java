package f21;

/* loaded from: classes8.dex */
public class a {

    /* renamed from: h, reason: collision with root package name */
    public int f258839h = -1;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f258832a = "";

    /* renamed from: b, reason: collision with root package name */
    public int f258833b = 0;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f258834c = "";

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f258835d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f258836e = "";

    /* renamed from: f, reason: collision with root package name */
    public int f258837f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f258838g = 0;

    public android.content.ContentValues a() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if ((this.f258839h & 1) != 0) {
            java.lang.String str = this.f258832a;
            if (str == null) {
                str = "";
            }
            contentValues.put(dm.i4.COL_USERNAME, str);
        }
        if ((this.f258839h & 2) != 0) {
            contentValues.put("bgflag", java.lang.Integer.valueOf(this.f258833b));
        }
        if ((this.f258839h & 4) != 0) {
            java.lang.String str2 = this.f258834c;
            if (str2 == null) {
                str2 = "";
            }
            contentValues.put(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, str2);
        }
        if ((this.f258839h & 8) != 0) {
            java.lang.String str3 = this.f258835d;
            if (str3 == null) {
                str3 = "";
            }
            contentValues.put("reserved1", str3);
        }
        if ((this.f258839h & 16) != 0) {
            java.lang.String str4 = this.f258836e;
            contentValues.put("reserved2", str4 != null ? str4 : "");
        }
        if ((this.f258839h & 32) != 0) {
            contentValues.put("reserved3", java.lang.Integer.valueOf(this.f258837f));
        }
        if ((this.f258839h & 64) != 0) {
            contentValues.put("reserved4", java.lang.Integer.valueOf(this.f258838g));
        }
        return contentValues;
    }
}
