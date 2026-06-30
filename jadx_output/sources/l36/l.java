package l36;

/* loaded from: classes16.dex */
public final class l {

    /* renamed from: n, reason: collision with root package name */
    public static final l36.l f315539n;

    /* renamed from: o, reason: collision with root package name */
    public static final l36.l f315540o;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f315541a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f315542b;

    /* renamed from: c, reason: collision with root package name */
    public final int f315543c;

    /* renamed from: d, reason: collision with root package name */
    public final int f315544d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f315545e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f315546f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f315547g;

    /* renamed from: h, reason: collision with root package name */
    public final int f315548h;

    /* renamed from: i, reason: collision with root package name */
    public final int f315549i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f315550j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f315551k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f315552l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f315553m;

    static {
        l36.k kVar = new l36.k();
        kVar.f315526a = true;
        f315539n = new l36.l(kVar);
        l36.k kVar2 = new l36.k();
        kVar2.f315529d = true;
        long seconds = java.util.concurrent.TimeUnit.SECONDS.toSeconds(Integer.MAX_VALUE);
        kVar2.f315528c = seconds <= 2147483647L ? (int) seconds : Integer.MAX_VALUE;
        f315540o = new l36.l(kVar2);
    }

    public l(boolean z17, boolean z18, int i17, int i18, boolean z19, boolean z27, boolean z28, int i19, int i27, boolean z29, boolean z37, boolean z38, java.lang.String str) {
        this.f315541a = z17;
        this.f315542b = z18;
        this.f315543c = i17;
        this.f315544d = i18;
        this.f315545e = z19;
        this.f315546f = z27;
        this.f315547g = z28;
        this.f315548h = i19;
        this.f315549i = i27;
        this.f315550j = z29;
        this.f315551k = z37;
        this.f315552l = z38;
        this.f315553m = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l36.l a(l36.i0 r22) {
        /*
            Method dump skipped, instructions count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l36.l.a(l36.i0):l36.l");
    }

    public java.lang.String toString() {
        java.lang.String str = this.f315553m;
        if (str == null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            if (this.f315541a) {
                sb6.append("no-cache, ");
            }
            if (this.f315542b) {
                sb6.append("no-store, ");
            }
            int i17 = this.f315543c;
            if (i17 != -1) {
                sb6.append("max-age=");
                sb6.append(i17);
                sb6.append(", ");
            }
            int i18 = this.f315544d;
            if (i18 != -1) {
                sb6.append("s-maxage=");
                sb6.append(i18);
                sb6.append(", ");
            }
            if (this.f315545e) {
                sb6.append("private, ");
            }
            if (this.f315546f) {
                sb6.append("public, ");
            }
            if (this.f315547g) {
                sb6.append("must-revalidate, ");
            }
            int i19 = this.f315548h;
            if (i19 != -1) {
                sb6.append("max-stale=");
                sb6.append(i19);
                sb6.append(", ");
            }
            int i27 = this.f315549i;
            if (i27 != -1) {
                sb6.append("min-fresh=");
                sb6.append(i27);
                sb6.append(", ");
            }
            if (this.f315550j) {
                sb6.append("only-if-cached, ");
            }
            if (this.f315551k) {
                sb6.append("no-transform, ");
            }
            if (this.f315552l) {
                sb6.append("immutable, ");
            }
            if (sb6.length() == 0) {
                str = "";
            } else {
                sb6.delete(sb6.length() - 2, sb6.length());
                str = sb6.toString();
            }
            this.f315553m = str;
        }
        return str;
    }

    public l(l36.k kVar) {
        this.f315541a = kVar.f315526a;
        this.f315542b = kVar.f315527b;
        this.f315543c = -1;
        this.f315544d = -1;
        this.f315545e = false;
        this.f315546f = false;
        this.f315547g = false;
        this.f315548h = kVar.f315528c;
        this.f315549i = -1;
        this.f315550j = kVar.f315529d;
        this.f315551k = false;
        this.f315552l = false;
    }
}
