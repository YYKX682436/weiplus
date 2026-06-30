package r61;

/* loaded from: classes11.dex */
public class e0 {

    /* renamed from: q, reason: collision with root package name */
    public int f392858q = -1;

    /* renamed from: a, reason: collision with root package name */
    public long f392842a = 0;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f392843b = "";

    /* renamed from: c, reason: collision with root package name */
    public int f392844c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f392845d = 0;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f392846e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f392847f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f392848g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f392849h = "";

    /* renamed from: i, reason: collision with root package name */
    public int f392850i = 0;

    /* renamed from: j, reason: collision with root package name */
    public int f392851j = 0;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f392852k = "";

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f392853l = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f392854m = "";

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f392855n = "";

    /* renamed from: o, reason: collision with root package name */
    public int f392856o = 0;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f392857p = "";

    public void a(android.database.Cursor cursor) {
        this.f392842a = cursor.getLong(0);
        this.f392843b = cursor.getString(1);
        this.f392844c = cursor.getInt(2);
        this.f392845d = cursor.getInt(3);
        this.f392846e = cursor.getString(4);
        this.f392847f = cursor.getString(5);
        this.f392848g = cursor.getString(6);
        this.f392849h = cursor.getString(7);
        this.f392850i = cursor.getInt(8);
        this.f392851j = cursor.getInt(9);
        this.f392852k = cursor.getString(10);
        this.f392853l = cursor.getString(11);
        this.f392854m = cursor.getString(12);
        this.f392855n = cursor.getString(13);
        this.f392856o = cursor.getInt(14);
        this.f392857p = cursor.getString(15);
    }

    public android.content.ContentValues b() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if ((this.f392858q & 1) != 0) {
            contentValues.put("fbid", java.lang.Long.valueOf(this.f392842a));
        }
        if ((this.f392858q & 2) != 0) {
            java.lang.String str = this.f392843b;
            if (str == null) {
                str = "";
            }
            contentValues.put("fbname", str);
        }
        if ((this.f392858q & 4) != 0) {
            contentValues.put("fbimgkey", java.lang.Integer.valueOf(this.f392844c));
        }
        if ((this.f392858q & 8) != 0) {
            contentValues.put("status", java.lang.Integer.valueOf(this.f392845d));
        }
        if ((this.f392858q & 16) != 0) {
            java.lang.String str2 = this.f392846e;
            if (str2 == null) {
                str2 = "";
            }
            contentValues.put(dm.i4.COL_USERNAME, str2);
        }
        if ((this.f392858q & 32) != 0) {
            java.lang.String str3 = this.f392847f;
            if (str3 == null) {
                str3 = "";
            }
            contentValues.put("nickname", str3);
        }
        if ((this.f392858q & 64) != 0) {
            java.lang.String str4 = this.f392848g;
            if (str4 == null) {
                str4 = "";
            }
            contentValues.put("nicknamepyinitial", str4);
        }
        if ((this.f392858q & 128) != 0) {
            java.lang.String str5 = this.f392849h;
            if (str5 == null) {
                str5 = "";
            }
            contentValues.put("nicknamequanpin", str5);
        }
        if ((this.f392858q & 256) != 0) {
            contentValues.put("sex", java.lang.Integer.valueOf(this.f392850i));
        }
        if ((this.f392858q & 512) != 0) {
            contentValues.put("personalcard", java.lang.Integer.valueOf(this.f392851j));
        }
        if ((this.f392858q & 1024) != 0) {
            java.lang.String str6 = this.f392852k;
            if (str6 == null) {
                str6 = "";
            }
            contentValues.put("province", str6);
        }
        if ((this.f392858q & 2048) != 0) {
            java.lang.String str7 = this.f392853l;
            if (str7 == null) {
                str7 = "";
            }
            contentValues.put("city", str7);
        }
        if ((this.f392858q & 4096) != 0) {
            java.lang.String str8 = this.f392854m;
            if (str8 == null) {
                str8 = "";
            }
            contentValues.put("signature", str8);
        }
        if ((this.f392858q & 8192) != 0) {
            java.lang.String str9 = this.f392855n;
            if (str9 == null) {
                str9 = "";
            }
            contentValues.put("alias", str9);
        }
        if ((this.f392858q & 16384) != 0) {
            contentValues.put("type", java.lang.Integer.valueOf(this.f392856o));
        }
        if ((this.f392858q & 32768) != 0) {
            java.lang.String str10 = this.f392857p;
            contentValues.put(com.google.android.gms.common.Scopes.EMAIL, str10 != null ? str10 : "");
        }
        return contentValues;
    }
}
