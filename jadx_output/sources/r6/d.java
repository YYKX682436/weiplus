package r6;

/* loaded from: classes13.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f392748a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f392749b;

    /* renamed from: c, reason: collision with root package name */
    public final java.io.File[] f392750c;

    /* renamed from: d, reason: collision with root package name */
    public final java.io.File[] f392751d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f392752e;

    /* renamed from: f, reason: collision with root package name */
    public r6.c f392753f;

    /* renamed from: g, reason: collision with root package name */
    public long f392754g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r6.f f392755h;

    public d(r6.f fVar, java.lang.String str, r6.a aVar) {
        this.f392755h = fVar;
        this.f392748a = str;
        int i17 = fVar.f392763m;
        this.f392749b = new long[i17];
        this.f392750c = new java.io.File[i17];
        this.f392751d = new java.io.File[i17];
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(str);
        sb6.append('.');
        int length = sb6.length();
        for (int i18 = 0; i18 < fVar.f392763m; i18++) {
            sb6.append(i18);
            java.io.File[] fileArr = this.f392750c;
            java.lang.String sb7 = sb6.toString();
            java.io.File file = fVar.f392757d;
            fileArr[i18] = new java.io.File(file, sb7);
            sb6.append(".tmp");
            this.f392751d[i18] = new java.io.File(file, sb6.toString());
            sb6.setLength(length);
        }
    }

    public java.lang.String a() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (long j17 : this.f392749b) {
            sb6.append(' ');
            sb6.append(j17);
        }
        return sb6.toString();
    }
}
