package d55;

/* loaded from: classes12.dex */
public class p0 {

    /* renamed from: f, reason: collision with root package name */
    public static final m3.g f226604f = new m3.g(20);

    /* renamed from: g, reason: collision with root package name */
    public static final java.text.SimpleDateFormat f226605g = new java.text.SimpleDateFormat("MM-dd HH:mm:ss.SSS", java.util.Locale.US);

    /* renamed from: a, reason: collision with root package name */
    public int f226606a;

    /* renamed from: b, reason: collision with root package name */
    public long f226607b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f226608c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f226609d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f226610e;

    public java.lang.String a() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(f226605g.format(java.lang.Long.valueOf(this.f226607b)));
        sb6.append("  ");
        int i17 = this.f226606a;
        sb6.append(i17 != 4 ? i17 != 5 ? "UNKNOWN" : "WARN" : "INFO");
        sb6.append("/");
        sb6.append(this.f226608c);
        sb6.append("  [");
        sb6.append(this.f226610e);
        sb6.append("]  ");
        sb6.append(this.f226609d);
        return sb6.toString();
    }
}
