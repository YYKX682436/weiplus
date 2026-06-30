package r61;

/* loaded from: classes11.dex */
public class w1 {

    /* renamed from: q, reason: collision with root package name */
    public int f392994q = -1;

    /* renamed from: a, reason: collision with root package name */
    public long f392978a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f392979b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f392980c = 0;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f392981d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f392982e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f392983f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f392984g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f392985h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f392986i = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f392987j = "";

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f392988k = "";

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f392989l = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f392990m = "";

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f392991n = "";

    /* renamed from: o, reason: collision with root package name */
    public int f392992o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f392993p = 0;

    public void a(android.database.Cursor cursor) {
        this.f392978a = cursor.getLong(0);
        int i17 = cursor.getInt(1);
        if (i17 == 65536) {
            this.f392979b = 0;
        } else {
            this.f392979b = i17;
        }
        this.f392980c = cursor.getInt(2);
        this.f392981d = cursor.getString(3);
        this.f392982e = cursor.getString(4);
        this.f392983f = cursor.getString(5);
        this.f392984g = cursor.getString(6);
        this.f392985h = cursor.getString(7);
        this.f392986i = cursor.getString(8);
        this.f392987j = cursor.getString(9);
        this.f392988k = cursor.getString(10);
        this.f392989l = cursor.getString(11);
        this.f392990m = cursor.getString(12);
        cursor.getString(13);
        this.f392991n = cursor.getString(14);
        this.f392992o = cursor.getInt(15);
        this.f392993p = cursor.getInt(16);
    }

    public android.content.ContentValues b() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if ((this.f392994q & 1) != 0) {
            contentValues.put("qq", java.lang.Long.valueOf(this.f392978a));
        }
        if ((this.f392994q & 2) != 0) {
            int i17 = this.f392979b;
            if (i17 == 0) {
                contentValues.put("wexinstatus", (java.lang.Integer) 65536);
            } else {
                contentValues.put("wexinstatus", java.lang.Integer.valueOf(i17));
            }
        }
        if ((this.f392994q & 4) != 0) {
            contentValues.put("groupid", java.lang.Integer.valueOf(this.f392980c));
        }
        if ((this.f392994q & 8) != 0) {
            java.lang.String str = this.f392981d;
            if (str == null) {
                str = "";
            }
            contentValues.put(dm.i4.COL_USERNAME, str);
        }
        if ((this.f392994q & 16) != 0) {
            java.lang.String str2 = this.f392982e;
            if (str2 == null) {
                str2 = "";
            }
            contentValues.put("nickname", str2);
        }
        if ((this.f392994q & 32) != 0) {
            java.lang.String str3 = this.f392983f;
            if (str3 == null) {
                str3 = "";
            }
            contentValues.put("pyinitial", str3);
        }
        if ((this.f392994q & 64) != 0) {
            java.lang.String str4 = this.f392984g;
            if (str4 == null) {
                str4 = "";
            }
            contentValues.put("quanpin", str4);
        }
        if ((this.f392994q & 128) != 0) {
            java.lang.String str5 = this.f392985h;
            if (str5 == null) {
                str5 = "";
            }
            contentValues.put("qqnickname", str5);
        }
        if ((this.f392994q & 256) != 0) {
            java.lang.String str6 = this.f392986i;
            if (str6 == null) {
                str6 = "";
            }
            contentValues.put("qqpyinitial", str6);
        }
        if ((this.f392994q & 512) != 0) {
            java.lang.String str7 = this.f392987j;
            if (str7 == null) {
                str7 = "";
            }
            contentValues.put("qqquanpin", str7);
        }
        if ((this.f392994q & 1024) != 0) {
            java.lang.String str8 = this.f392988k;
            if (str8 == null) {
                str8 = "";
            }
            contentValues.put("qqremark", str8);
        }
        if ((this.f392994q & 2048) != 0) {
            java.lang.String str9 = this.f392989l;
            if (str9 == null) {
                str9 = "";
            }
            contentValues.put("qqremarkpyinitial", str9);
        }
        if ((this.f392994q & 4096) != 0) {
            java.lang.String str10 = this.f392990m;
            if (str10 == null) {
                str10 = "";
            }
            contentValues.put("qqremarkquanpin", str10);
        }
        if ((this.f392994q & 16384) != 0) {
            java.lang.String str11 = this.f392991n;
            contentValues.put("reserved2", str11 != null ? str11 : "");
        }
        if ((this.f392994q & 32768) != 0) {
            contentValues.put("reserved3", java.lang.Integer.valueOf(this.f392992o));
        }
        if ((this.f392994q & 65536) != 0) {
            contentValues.put("reserved4", java.lang.Integer.valueOf(this.f392993p));
        }
        return contentValues;
    }

    public java.lang.String c() {
        java.lang.String str = this.f392988k;
        if (str == null) {
            str = "";
        }
        if (str.length() <= 0) {
            java.lang.String str2 = this.f392985h;
            return str2 == null ? "" : str2;
        }
        java.lang.String str3 = this.f392988k;
        return str3 == null ? "" : str3;
    }

    public java.lang.String toString() {
        return "groupID\t:" + this.f392980c + "\nqq\t:" + this.f392978a + "\nusername\t:" + this.f392981d + "\nnickname\t:" + this.f392982e + "\nwexinStatus\t:" + this.f392979b + "\nreserved3\t:" + this.f392992o + "\nreserved4\t:" + this.f392993p + "\n";
    }
}
