package if3;

/* loaded from: classes12.dex */
public class y implements java.lang.Cloneable {

    /* renamed from: y, reason: collision with root package name */
    public byte[] f291229y;

    /* renamed from: z, reason: collision with root package name */
    public int f291230z = -1;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f291211d = "";

    /* renamed from: e, reason: collision with root package name */
    public int f291212e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f291213f = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f291214g = 0;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f291215h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f291216i = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f291217m = "";

    /* renamed from: n, reason: collision with root package name */
    public int f291218n = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f291219o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f291220p = 0;

    /* renamed from: q, reason: collision with root package name */
    public int f291221q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f291222r = 0;

    /* renamed from: s, reason: collision with root package name */
    public int f291223s = 0;

    /* renamed from: t, reason: collision with root package name */
    public int f291224t = 0;

    /* renamed from: u, reason: collision with root package name */
    public int f291225u = 0;

    /* renamed from: v, reason: collision with root package name */
    public int f291226v = 0;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f291227w = "";

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f291228x = "";

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public if3.y clone() {
        try {
            return (if3.y) super.clone();
        } catch (java.lang.CloneNotSupportedException unused) {
            return null;
        }
    }

    public void b(android.database.Cursor cursor) {
        this.f291211d = cursor.getString(0);
        this.f291212e = cursor.getInt(1);
        this.f291213f = cursor.getLong(2);
        this.f291214g = cursor.getLong(3);
        this.f291215h = cursor.getString(4);
        this.f291216i = cursor.getString(5);
        this.f291217m = cursor.getString(6);
        this.f291218n = cursor.getInt(7);
        this.f291219o = cursor.getInt(8);
        this.f291220p = cursor.getInt(9);
        this.f291221q = cursor.getInt(10);
        this.f291222r = cursor.getInt(11);
        this.f291223s = cursor.getInt(12);
        this.f291224t = cursor.getInt(13);
        this.f291225u = cursor.getInt(14);
        this.f291226v = cursor.getInt(15);
        this.f291227w = cursor.getString(16);
        this.f291228x = cursor.getString(17);
    }

    public java.lang.String c() {
        java.lang.String str = this.f291211d;
        return str == null ? "" : str;
    }

    public java.lang.String d() {
        java.lang.String str = this.f291215h;
        return str == null ? "" : str;
    }

    public java.lang.String e() {
        java.lang.String str = this.f291217m;
        return str == null ? "" : str;
    }

    public java.lang.String toString() {
        return "MasSendInfo{clientid='" + this.f291211d + "', createTime=" + this.f291213f + ", msgType=" + this.f291219o + ", massMsgId='" + this.f291227w + "', flag=" + this.f291230z + '}';
    }
}
