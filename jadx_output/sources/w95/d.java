package w95;

/* loaded from: classes11.dex */
public class d implements java.lang.Comparable {

    /* renamed from: d, reason: collision with root package name */
    public int f444080d;

    /* renamed from: e, reason: collision with root package name */
    public android.net.Uri f444081e;

    /* renamed from: f, reason: collision with root package name */
    public java.io.File f444082f;

    /* renamed from: g, reason: collision with root package name */
    public java.io.File f444083g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f444084h = false;

    /* renamed from: i, reason: collision with root package name */
    public int f444085i = 0;

    /* renamed from: m, reason: collision with root package name */
    public long f444086m = 0;

    /* renamed from: n, reason: collision with root package name */
    public long f444087n = -1;

    /* renamed from: o, reason: collision with root package name */
    public java.util.HashMap f444088o;

    /* renamed from: p, reason: collision with root package name */
    public x95.e f444089p;

    /* renamed from: q, reason: collision with root package name */
    public x95.d f444090q;

    /* renamed from: r, reason: collision with root package name */
    public x95.b f444091r;

    public d(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.NullPointerException("uri is invalid!");
        }
        android.net.Uri parse = android.net.Uri.parse(str);
        this.f444088o = new java.util.HashMap();
        this.f444080d = 2000;
        this.f444081e = parse;
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        ((w95.d) obj).getClass();
        return 0;
    }

    public x95.d h() {
        x95.d dVar = this.f444090q;
        if (dVar != null) {
            return dVar;
        }
        this.f444090q = new x95.c();
        return h();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.io.BufferedInputStream, java.io.InputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void i() {
        /*
            r5 = this;
            x95.e r0 = r5.f444089p
            if (r0 == 0) goto L68
            w95.g r0 = (w95.g) r0
            r0.getClass()
            java.io.File r1 = r5.f444083g
            java.lang.String r0 = r0.f444093a
            if (r1 == 0) goto L5a
            boolean r2 = r1.exists()
            if (r2 == 0) goto L5a
            r2 = 0
            java.io.BufferedInputStream r3 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L51 java.lang.Throwable -> L57
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L51 java.lang.Throwable -> L57
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L51 java.lang.Throwable -> L57
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L51 java.lang.Throwable -> L57
            java.security.DigestInputStream r2 = new java.security.DigestInputStream     // Catch: java.lang.Throwable -> L4d java.lang.Throwable -> L4f
            java.lang.String r1 = "MD5"
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r1)     // Catch: java.lang.Throwable -> L4d java.lang.Throwable -> L4f
            r2.<init>(r3, r1)     // Catch: java.lang.Throwable -> L4d java.lang.Throwable -> L4f
            r1 = 4096(0x1000, float:5.74E-42)
            byte[] r1 = new byte[r1]     // Catch: java.lang.Throwable -> L51 java.lang.Throwable -> L57 java.lang.Throwable -> L57
        L2f:
            int r3 = r2.read(r1)     // Catch: java.lang.Throwable -> L51 java.lang.Throwable -> L57 java.lang.Throwable -> L57
            if (r3 <= 0) goto L36
            goto L2f
        L36:
            java.security.MessageDigest r1 = r2.getMessageDigest()     // Catch: java.lang.Throwable -> L51 java.lang.Throwable -> L57 java.lang.Throwable -> L57
            byte[] r1 = r1.digest()     // Catch: java.lang.Throwable -> L51 java.lang.Throwable -> L57 java.lang.Throwable -> L57
            java.lang.String r1 = w95.e.a(r1)     // Catch: java.lang.Throwable -> L51 java.lang.Throwable -> L57 java.lang.Throwable -> L57
            boolean r0 = r1.equalsIgnoreCase(r0)     // Catch: java.lang.Throwable -> L51 java.lang.Throwable -> L57 java.lang.Throwable -> L57
            if (r0 == 0) goto L57
            w95.f.a(r2)
            r0 = 1
            goto L5b
        L4d:
            r0 = move-exception
            goto L53
        L4f:
            r2 = r3
            goto L57
        L51:
            r0 = move-exception
            r3 = r2
        L53:
            w95.f.a(r3)
            throw r0
        L57:
            w95.f.a(r2)
        L5a:
            r0 = 0
        L5b:
            if (r0 == 0) goto L5e
            goto L68
        L5e:
            x95.a r0 = new x95.a
            r1 = 1202(0x4b2, float:1.684E-42)
            java.lang.String r2 = "File MD5 is invalid."
            r0.<init>(r1, r2)
            throw r0
        L68:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w95.d.i():void");
    }
}
