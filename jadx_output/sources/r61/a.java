package r61;

/* loaded from: classes11.dex */
public class a {

    /* renamed from: r, reason: collision with root package name */
    public byte[] f392802r;

    /* renamed from: t, reason: collision with root package name */
    public int f392804t;
    public int O = -1;

    /* renamed from: a, reason: collision with root package name */
    public int f392785a = 0;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f392786b = "";

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f392787c = "";

    /* renamed from: d, reason: collision with root package name */
    public long f392788d = 0;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f392789e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f392790f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f392791g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f392792h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f392793i = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f392794j = "";

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f392795k = "";

    /* renamed from: l, reason: collision with root package name */
    public int f392796l = 0;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f392797m = "";

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f392798n = "";

    /* renamed from: o, reason: collision with root package name */
    public int f392799o = 0;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f392800p = "";

    /* renamed from: s, reason: collision with root package name */
    public int f392803s = 0;

    /* renamed from: q, reason: collision with root package name */
    public int f392801q = 0;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f392805u = "";

    /* renamed from: v, reason: collision with root package name */
    public int f392806v = 0;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f392807w = "";

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f392808x = "";

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f392809y = "";

    /* renamed from: z, reason: collision with root package name */
    public int f392810z = 0;
    public java.lang.String A = "";
    public int B = 0;
    public int C = 0;
    public java.lang.String D = "";
    public java.lang.String E = "";
    public java.lang.String F = "";
    public int G = -1;
    public java.lang.String H = "";
    public long I = -1;

    /* renamed from: J, reason: collision with root package name */
    public int f392784J = -1;
    public java.lang.String K = "";
    public java.lang.String L = "";
    public java.lang.String M = "";
    public long N = 0;

    public static int d(java.lang.String str) {
        try {
            return com.tencent.mm.sdk.platformtools.t8.M("0x" + str.substring(0, 8), 0);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AddrUpload", e17, "md5: %s", str);
            return 0;
        }
    }

    public int a() {
        char c17;
        java.lang.String str = this.f392790f;
        if (str == null) {
            str = "";
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            java.lang.String str2 = this.f392791g;
            if (str2 == null) {
                str2 = "";
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                c17 = ' ';
            } else {
                java.lang.String str3 = this.f392791g;
                c17 = (str3 != null ? str3 : "").charAt(0);
            }
        } else {
            java.lang.String str4 = this.f392790f;
            c17 = (str4 != null ? str4 : "").charAt(0);
        }
        if (c17 >= 'a' && c17 <= 'z') {
            return (char) (c17 - ' ');
        }
        if (c17 < 'A' || c17 > 'Z') {
            return 123;
        }
        return c17;
    }

    public void b(android.database.Cursor cursor) {
        java.lang.String string = cursor.getString(1);
        this.f392786b = string;
        this.f392785a = d(string);
        this.f392787c = cursor.getString(2);
        this.f392788d = cursor.getLong(3);
        this.f392789e = cursor.getString(4);
        this.f392790f = cursor.getString(5);
        this.f392791g = cursor.getString(6);
        this.f392792h = cursor.getString(7);
        this.f392793i = cursor.getString(8);
        this.f392794j = cursor.getString(9);
        this.f392795k = cursor.getString(10);
        this.f392796l = cursor.getInt(11);
        this.f392797m = cursor.getString(12);
        this.f392798n = cursor.getString(13);
        int i17 = cursor.getInt(14);
        if (i17 == 65536) {
            this.f392799o = 0;
        } else {
            this.f392799o = i17;
        }
        this.f392801q = cursor.getInt(17);
        this.f392800p = cursor.getString(15);
        this.f392803s = cursor.getInt(18);
        byte[] blob = cursor.getBlob(19);
        this.f392802r = blob;
        if (!com.tencent.mm.sdk.platformtools.t8.M0(blob)) {
            byte[] bArr = this.f392802r;
            try {
                com.tencent.mm.sdk.platformtools.e2 e2Var = new com.tencent.mm.sdk.platformtools.e2();
                int i18 = e2Var.i(bArr);
                if (i18 != 0) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AddrUpload", "parse LVBuffer error:" + i18);
                } else {
                    this.f392805u = e2Var.g();
                    this.f392806v = e2Var.e();
                    this.f392807w = e2Var.g();
                    this.f392808x = e2Var.g();
                    this.f392809y = e2Var.g();
                    this.f392810z = e2Var.e();
                    this.A = e2Var.g();
                    this.B = e2Var.e();
                    this.C = e2Var.e();
                    this.D = e2Var.g();
                    this.E = e2Var.g();
                    this.F = e2Var.g();
                    this.G = e2Var.e();
                    this.H = e2Var.g();
                    this.I = e2Var.f();
                    this.f392784J = e2Var.e();
                    this.K = e2Var.g();
                    this.L = e2Var.g();
                    this.M = e2Var.g();
                    this.N = e2Var.f();
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AddrUpload", e17, "", new java.lang.Object[0]);
            }
        }
        this.f392804t = cursor.getInt(20);
    }

    public android.content.ContentValues c() {
        byte[] bArr;
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if ((this.O & 1) != 0) {
            contentValues.put(dm.i4.COL_ID, java.lang.Integer.valueOf(this.f392785a));
        }
        if ((this.O & 2) != 0) {
            contentValues.put("md5", e());
        }
        if ((this.O & 4) != 0) {
            java.lang.String str = this.f392787c;
            if (str == null) {
                str = "";
            }
            contentValues.put("peopleid", str);
        }
        if ((this.O & 8) != 0) {
            contentValues.put("uploadtime", java.lang.Long.valueOf(this.f392788d));
        }
        if ((this.O & 16) != 0) {
            contentValues.put("realname", h());
        }
        if ((this.O & 32) != 0) {
            java.lang.String str2 = this.f392790f;
            if (str2 == null) {
                str2 = "";
            }
            contentValues.put("realnamepyinitial", str2);
        }
        if ((this.O & 64) != 0) {
            java.lang.String str3 = this.f392791g;
            if (str3 == null) {
                str3 = "";
            }
            contentValues.put("realnamequanpin", str3);
        }
        if ((this.O & 128) != 0) {
            contentValues.put(dm.i4.COL_USERNAME, i());
        }
        if ((this.O & 256) != 0) {
            contentValues.put("nickname", g());
        }
        if ((this.O & 512) != 0) {
            java.lang.String str4 = this.f392794j;
            if (str4 == null) {
                str4 = "";
            }
            contentValues.put("nicknamepyinitial", str4);
        }
        if ((this.O & 1024) != 0) {
            java.lang.String str5 = this.f392795k;
            if (str5 == null) {
                str5 = "";
            }
            contentValues.put("nicknamequanpin", str5);
        }
        if ((this.O & 2048) != 0) {
            contentValues.put("type", java.lang.Integer.valueOf(this.f392796l));
        }
        if ((this.O & 4096) != 0) {
            contentValues.put("moblie", f());
        }
        if ((this.O & 8192) != 0) {
            java.lang.String str6 = this.f392798n;
            if (str6 == null) {
                str6 = "";
            }
            contentValues.put(com.google.android.gms.common.Scopes.EMAIL, str6);
        }
        if ((this.O & 16384) != 0) {
            int i17 = this.f392799o;
            if (i17 == 0) {
                contentValues.put("status", (java.lang.Integer) 65536);
            } else {
                contentValues.put("status", java.lang.Integer.valueOf(i17));
            }
        }
        if ((this.O & 32768) != 0) {
            contentValues.put("reserved1", this.f392800p);
        }
        if ((this.O & 131072) != 0) {
            contentValues.put("reserved3", java.lang.Integer.valueOf(this.f392801q));
        }
        if ((this.O & 262144) != 0) {
            contentValues.put("reserved4", java.lang.Integer.valueOf(this.f392803s));
        }
        if ((this.O & 524288) != 0) {
            try {
                com.tencent.mm.sdk.platformtools.e2 e2Var = new com.tencent.mm.sdk.platformtools.e2();
                e2Var.h();
                e2Var.m(this.f392805u);
                e2Var.k(this.f392806v);
                e2Var.m(this.f392807w);
                e2Var.m(this.f392808x);
                e2Var.m(this.f392809y);
                e2Var.k(this.f392810z);
                e2Var.m(this.A);
                e2Var.k(this.B);
                e2Var.k(this.C);
                e2Var.m(this.D);
                e2Var.m(this.E);
                e2Var.m(this.F);
                e2Var.k(this.G);
                e2Var.m(this.H);
                e2Var.l(this.I);
                e2Var.k(this.f392784J);
                e2Var.m(this.K);
                e2Var.m(this.L);
                e2Var.m(this.M);
                e2Var.l(this.N);
                bArr = e2Var.a();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AddrUpload", e17, "", new java.lang.Object[0]);
                bArr = null;
            }
            this.f392802r = bArr;
            contentValues.put("lvbuf", bArr);
        }
        if ((this.O & 1048576) != 0) {
            contentValues.put("showhead", java.lang.Integer.valueOf(this.f392804t));
        }
        return contentValues;
    }

    public java.lang.String e() {
        java.lang.String str = this.f392786b;
        return str == null ? "" : str;
    }

    public java.lang.String f() {
        java.lang.String str = this.f392797m;
        return str == null ? "" : str;
    }

    public java.lang.String g() {
        java.lang.String str = this.f392793i;
        return str == null ? "" : str;
    }

    public java.lang.String h() {
        java.lang.String str = this.f392789e;
        return str == null ? "" : str;
    }

    public java.lang.String i() {
        java.lang.String str = this.f392792h;
        return str == null ? "" : str;
    }
}
