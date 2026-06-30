package m11;

/* loaded from: classes12.dex */
public class b0 {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f322632J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;

    /* renamed from: a, reason: collision with root package name */
    public long f322633a;

    /* renamed from: b, reason: collision with root package name */
    public long f322634b;

    /* renamed from: c, reason: collision with root package name */
    public int f322635c;

    /* renamed from: d, reason: collision with root package name */
    public int f322636d;

    /* renamed from: h, reason: collision with root package name */
    public int f322640h;

    /* renamed from: i, reason: collision with root package name */
    public int f322641i;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f322643k;

    /* renamed from: n, reason: collision with root package name */
    public int f322646n;

    /* renamed from: o, reason: collision with root package name */
    public long f322647o;

    /* renamed from: p, reason: collision with root package name */
    public int f322648p;

    /* renamed from: r, reason: collision with root package name */
    public int f322650r;

    /* renamed from: v, reason: collision with root package name */
    public boolean f322654v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f322655w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f322656x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f322657y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f322658z;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f322637e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f322638f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f322639g = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f322642j = "";

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f322644l = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f322645m = "";

    /* renamed from: q, reason: collision with root package name */
    public long f322649q = 0;

    /* renamed from: s, reason: collision with root package name */
    public int f322651s = 0;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f322652t = "";

    /* renamed from: u, reason: collision with root package name */
    public int f322653u = 1;

    public void A(java.lang.String str) {
        this.f322644l = str;
        this.K = true;
    }

    public void B(java.lang.String str) {
        this.f322643k = str;
        this.O = true;
    }

    public void C(int i17) {
        this.f322650r = i17;
        this.G = true;
    }

    public void D(int i17) {
        this.f322648p = i17;
        this.E = true;
    }

    public void E(java.lang.String str) {
        this.f322639g = str;
        this.B = true;
    }

    public void F(int i17) {
        this.f322636d = i17;
        this.f322657y = true;
    }

    public void a() {
        this.f322654v = false;
        this.f322655w = false;
        this.f322656x = false;
        this.f322657y = false;
        this.f322658z = false;
        this.A = false;
        this.B = false;
        this.C = false;
        this.D = false;
        this.E = false;
        this.F = false;
        this.G = false;
        this.H = false;
        this.I = false;
        this.f322632J = false;
        this.K = false;
        this.L = false;
        this.M = false;
        this.N = false;
        this.O = false;
        this.P = false;
    }

    public void b(android.database.Cursor cursor, boolean z17) {
        this.f322633a = cursor.getLong(0);
        this.f322634b = cursor.getLong(1);
        this.f322635c = cursor.getInt(2);
        this.f322636d = cursor.getInt(3);
        this.f322637e = cursor.getString(4);
        this.f322639g = cursor.getString(5);
        this.f322646n = cursor.getInt(6);
        this.f322647o = cursor.getLong(7);
        this.f322648p = cursor.getInt(8);
        cursor.getInt(9);
        this.f322649q = cursor.getLong(10);
        this.f322650r = cursor.getInt(11);
        this.f322652t = cursor.getString(12);
        this.f322651s = cursor.getInt(14);
        this.f322653u = cursor.getInt(15);
        this.f322644l = cursor.getString(16);
        this.f322640h = cursor.getInt(17);
        this.f322638f = cursor.getString(18);
        this.f322641i = cursor.getInt(19);
        this.f322642j = cursor.getString(20);
        cursor.getInt(21);
        if (z17) {
            this.f322643k = cursor.getString(23);
            this.f322645m = cursor.getString(22);
        } else {
            this.f322643k = cursor.getString(22);
            this.f322645m = cursor.getString(23);
        }
    }

    public android.content.ContentValues c() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f322654v) {
            contentValues.put(dm.i4.COL_ID, java.lang.Long.valueOf(this.f322633a));
        }
        if (this.f322655w) {
            contentValues.put("msgSvrId", java.lang.Long.valueOf(this.f322634b));
        }
        if (this.f322656x) {
            contentValues.put("offset", java.lang.Integer.valueOf(this.f322635c));
        }
        if (this.f322657y) {
            contentValues.put("totalLen", java.lang.Integer.valueOf(this.f322636d));
        }
        if (this.f322658z) {
            contentValues.put("bigImgPath", this.f322637e);
        }
        if (this.A) {
            contentValues.put("midImgPath", this.f322638f);
        }
        if (this.B) {
            contentValues.put("thumbImgPath", this.f322639g);
        }
        if (this.C) {
            contentValues.put("createtime", java.lang.Integer.valueOf(this.f322646n));
        }
        if (this.D) {
            contentValues.put("msglocalid", java.lang.Long.valueOf(this.f322647o));
        }
        if (this.E) {
            contentValues.put("status", java.lang.Integer.valueOf(this.f322648p));
        }
        if (this.F) {
            contentValues.put("reserved1", java.lang.Long.valueOf(this.f322649q));
        }
        if (this.G) {
            contentValues.put("reserved2", java.lang.Integer.valueOf(this.f322650r));
        }
        if (this.H) {
            contentValues.put("reserved3", this.f322652t);
        }
        if (this.I) {
            contentValues.put("hashdthumb", java.lang.Integer.valueOf(this.f322651s));
        }
        if (this.f322632J) {
            contentValues.put("iscomplete", java.lang.Integer.valueOf(this.f322635c < this.f322636d ? 0 : 1));
        }
        if (this.K) {
            contentValues.put("origImgMD5", this.f322644l);
        }
        if (this.L) {
            contentValues.put("compressType", java.lang.Integer.valueOf(this.f322640h));
        }
        if (this.M) {
            contentValues.put("forwardType", java.lang.Integer.valueOf(this.f322641i));
        }
        if (this.N) {
            contentValues.put("hevcPath", this.f322642j);
        }
        if (this.O) {
            contentValues.put("originSourceMd5", this.f322643k);
        }
        if (this.P) {
            contentValues.put("msgTalker", this.f322645m);
        }
        return contentValues;
    }

    public java.lang.String d() {
        java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(this.f322652t, "msg", null);
        if (d17 != null) {
            return (java.lang.String) d17.get(".msg.img.$aeskey");
        }
        return null;
    }

    public java.lang.String e() {
        return this.f322637e;
    }

    public java.lang.String f() {
        int i17 = this.f322640h;
        java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(this.f322652t, "msg", null);
        if (d17 == null) {
            return null;
        }
        return i17 != 1 ? (java.lang.String) d17.get(".msg.img.$cdnmidimgurl") : (java.lang.String) d17.get(".msg.img.$cdnbigimgurl");
    }

    public long g() {
        return this.f322649q;
    }

    public java.lang.String h() {
        return this.f322638f;
    }

    public java.lang.String i() {
        return this.f322639g;
    }

    public boolean j() {
        return this.f322649q > 0;
    }

    public boolean k() {
        int i17 = this.f322636d;
        return i17 != 0 && i17 == this.f322635c;
    }

    public boolean l() {
        return this.f322647o == 0 && this.f322634b == 0;
    }

    public void m(java.lang.String str) {
        this.f322637e = str;
        this.f322658z = true;
    }

    public void n(java.lang.String str) {
        java.lang.String str2 = this.f322652t;
        if ((str2 == null && str != null) || (str2 != null && !str2.equals(str))) {
            this.H = true;
        }
        this.f322652t = str;
    }

    public void o(int i17) {
        this.f322640h = i17;
        this.L = true;
    }

    public void p(int i17) {
        this.f322646n = i17;
        this.C = true;
    }

    public void q(int i17) {
        this.f322641i = i17;
        this.M = true;
    }

    public void r(long j17) {
        this.f322649q = j17;
        this.F = true;
    }

    public void s(java.lang.String str) {
        this.f322642j = str;
        this.N = true;
    }

    public void t(int i17) {
        if (this.f322653u != i17) {
            this.f322632J = true;
        }
        this.f322653u = i17;
    }

    public void u(long j17) {
        this.f322633a = j17;
        this.f322654v = true;
    }

    public void v(java.lang.String str) {
        this.f322638f = str;
        this.A = true;
    }

    public void w(long j17) {
        this.f322647o = j17;
        this.D = true;
    }

    public void x(long j17) {
        if (this.f322634b != j17) {
            this.f322655w = true;
        }
        this.f322634b = j17;
    }

    public void y(java.lang.String str) {
        this.f322645m = str;
        this.P = true;
    }

    public void z(int i17) {
        if (this.f322635c != i17) {
            this.f322656x = true;
        }
        this.f322635c = i17;
        com.tencent.mars.xlog.Log.e("MicroMsg.Imgfo", "set offset : %d  id:%d total:%d", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(this.f322647o), java.lang.Integer.valueOf(this.f322636d));
        t(i17 < this.f322636d ? 0 : 1);
    }
}
