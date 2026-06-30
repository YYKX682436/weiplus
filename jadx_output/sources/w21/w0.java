package w21;

/* loaded from: classes12.dex */
public class w0 {

    /* renamed from: a, reason: collision with root package name */
    public int f442484a = -1;

    /* renamed from: y, reason: collision with root package name */
    public int f442508y = 0;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f442485b = "";

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f442486c = "";

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f442487d = "";

    /* renamed from: e, reason: collision with root package name */
    public long f442488e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f442489f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f442490g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f442491h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f442492i = 0;

    /* renamed from: j, reason: collision with root package name */
    public long f442493j = 0;

    /* renamed from: k, reason: collision with root package name */
    public long f442494k = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f442495l = 0;

    /* renamed from: m, reason: collision with root package name */
    public long f442496m = 0;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f442497n = "";

    /* renamed from: o, reason: collision with root package name */
    public int f442498o = 0;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f442499p = "";

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f442500q = "";

    /* renamed from: r, reason: collision with root package name */
    public int f442501r = 0;

    /* renamed from: s, reason: collision with root package name */
    public int f442502s = 0;

    /* renamed from: t, reason: collision with root package name */
    public long f442503t = 0;

    /* renamed from: u, reason: collision with root package name */
    public int f442504u = 0;

    /* renamed from: v, reason: collision with root package name */
    public int f442505v = 0;

    /* renamed from: w, reason: collision with root package name */
    public r45.f17 f442506w = null;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f442507x = "";

    public void a(android.database.Cursor cursor) {
        this.f442485b = cursor.getString(0);
        this.f442486c = cursor.getString(1);
        this.f442488e = cursor.getLong(2);
        this.f442489f = cursor.getInt(3);
        this.f442490g = cursor.getInt(4);
        this.f442491h = cursor.getInt(5);
        this.f442492i = cursor.getInt(6);
        this.f442493j = cursor.getLong(7);
        this.f442494k = cursor.getLong(8);
        this.f442487d = cursor.getString(9);
        this.f442495l = cursor.getInt(10);
        this.f442496m = cursor.getLong(11);
        this.f442497n = cursor.getString(12);
        this.f442498o = cursor.getInt(13);
        this.f442499p = cursor.getString(14);
        this.f442500q = cursor.getString(15);
        this.f442501r = cursor.getInt(16);
        this.f442502s = cursor.getInt(17);
        this.f442503t = cursor.getLong(18);
        this.f442504u = cursor.getInt(19);
        this.f442505v = cursor.getInt(20);
        try {
            byte[] blob = cursor.getBlob(21);
            if (blob != null) {
                r45.f17 f17Var = new r45.f17();
                f17Var.parseFrom(blob);
                this.f442506w = f17Var;
            }
        } catch (java.lang.Exception unused) {
        }
        this.f442507x = cursor.getString(22);
    }

    public android.content.ContentValues b() {
        java.lang.String str;
        r45.f17 f17Var;
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if ((this.f442484a & 1) != 0) {
            contentValues.put("FileName", this.f442485b);
        }
        if ((this.f442484a & 2) != 0) {
            contentValues.put("User", this.f442486c);
        }
        if ((this.f442484a & 4) != 0) {
            contentValues.put("MsgId", java.lang.Long.valueOf(this.f442488e));
        }
        if ((this.f442484a & 8) != 0) {
            contentValues.put("NetOffset", java.lang.Integer.valueOf(this.f442489f));
        }
        if ((this.f442484a & 16) != 0) {
            contentValues.put("FileNowSize", java.lang.Integer.valueOf(this.f442490g));
        }
        if ((this.f442484a & 32) != 0) {
            contentValues.put("TotalLen", java.lang.Integer.valueOf(this.f442491h));
        }
        if ((this.f442484a & 64) != 0) {
            contentValues.put("Status", java.lang.Integer.valueOf(this.f442492i));
        }
        if ((this.f442484a & 128) != 0) {
            contentValues.put("CreateTime", java.lang.Long.valueOf(this.f442493j));
        }
        if ((this.f442484a & 256) != 0) {
            contentValues.put("LastModifyTime", java.lang.Long.valueOf(this.f442494k));
        }
        if ((this.f442484a & 512) != 0) {
            contentValues.put("ClientId", this.f442487d);
        }
        if ((this.f442484a & 1024) != 0) {
            contentValues.put("VoiceLength", java.lang.Integer.valueOf(this.f442495l));
        }
        if ((this.f442484a & 2048) != 0) {
            contentValues.put("MsgLocalId", java.lang.Long.valueOf(this.f442496m));
        }
        if ((this.f442484a & 4096) != 0) {
            contentValues.put("Human", this.f442497n);
        }
        if ((this.f442484a & 8192) != 0) {
            contentValues.put("reserved1", java.lang.Integer.valueOf(this.f442498o));
        }
        if ((this.f442484a & 16384) != 0) {
            contentValues.put("reserved2", this.f442499p);
        }
        if ((this.f442484a & 32768) != 0) {
            contentValues.put("MsgSource", this.f442500q);
        }
        if ((this.f442484a & 65536) != 0) {
            contentValues.put("MsgFlag", java.lang.Integer.valueOf(this.f442501r));
        }
        if ((this.f442484a & 131072) != 0) {
            contentValues.put("MsgSeq", java.lang.Integer.valueOf(this.f442502s));
        }
        if ((this.f442484a & 262144) != 0) {
            contentValues.put("MasterBufId", java.lang.Long.valueOf(this.f442503t));
        }
        if ((this.f442484a & 524288) != 0) {
            contentValues.put("checksum", java.lang.Integer.valueOf(this.f442504u));
        }
        if ((this.f442484a & 1048576) != 0) {
            contentValues.put("VoiceFlag", java.lang.Integer.valueOf(this.f442505v));
        }
        if ((this.f442484a & 2097152) != 0 && (f17Var = this.f442506w) != null) {
            try {
                contentValues.put("VoiceInfoExt", f17Var.toByteArray());
            } catch (java.lang.Exception unused) {
            }
        }
        if ((this.f442484a & 4194304) != 0 && (str = this.f442507x) != null) {
            contentValues.put("MsgTalker", str);
        }
        return contentValues;
    }

    public boolean c() {
        return (this.f442505v & 1) != 0;
    }

    public boolean d() {
        int i17 = this.f442492i;
        return (i17 > 1 && i17 <= 3) || i17 == 8;
    }
}
