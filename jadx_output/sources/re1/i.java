package re1;

/* loaded from: classes13.dex */
public final class i implements java.lang.Comparable {

    /* renamed from: o, reason: collision with root package name */
    public static final java.util.regex.Pattern f394334o = java.util.regex.Pattern.compile("^([^.]+)\\.(\\d+)\\.(\\d+)\\.(\\w+)\\.(\\d+)(\\.v1\\.dat)$");

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f394335d;

    /* renamed from: e, reason: collision with root package name */
    public final long f394336e;

    /* renamed from: f, reason: collision with root package name */
    public final long f394337f;

    /* renamed from: g, reason: collision with root package name */
    public final long f394338g;

    /* renamed from: h, reason: collision with root package name */
    public final te1.b f394339h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f394340i;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.vfs.r6 f394341m;

    /* renamed from: n, reason: collision with root package name */
    public final long f394342n;

    public i(java.lang.String str, long j17, long j18, long j19, te1.b bVar, boolean z17, long j27, com.tencent.mm.vfs.r6 r6Var) {
        this.f394335d = str;
        this.f394336e = j17;
        this.f394337f = j18;
        this.f394338g = j19;
        this.f394339h = bVar;
        this.f394340i = z17;
        this.f394341m = r6Var;
        this.f394342n = j27;
    }

    public static re1.i b(com.tencent.mm.vfs.r6 r6Var) {
        java.lang.String str;
        te1.b bVar;
        java.util.regex.Matcher matcher = f394334o.matcher(r6Var.getName());
        if (!matcher.matches()) {
            return null;
        }
        java.lang.String group = matcher.group(1);
        long parseLong = java.lang.Long.parseLong(matcher.group(2));
        long parseLong2 = java.lang.Long.parseLong(matcher.group(3));
        java.lang.String group2 = matcher.group(4);
        java.util.HashMap hashMap = te1.b.f417772g;
        if (hashMap.containsKey(group2)) {
            bVar = (te1.b) hashMap.get(group2);
        } else {
            try {
                str = new java.lang.String(ve1.b.a(group2), com.tencent.mapsdk.internal.rv.f51270c);
            } catch (java.io.UnsupportedEncodingException unused) {
                str = com.eclipsesource.mmv8.Platform.UNKNOWN;
            }
            te1.b a17 = te1.b.a(str);
            hashMap.put(group2, a17);
            bVar = a17;
        }
        return new re1.i(group, parseLong, r6Var.C(), parseLong2, bVar, true, java.lang.Long.parseLong(matcher.group(5)), r6Var);
    }

    public static com.tencent.mm.vfs.r6 d(com.tencent.mm.vfs.r6 r6Var, java.lang.String str, long j17, long j18, te1.b bVar, long j19) {
        java.lang.String str2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str);
        sb6.append(".");
        sb6.append(j17);
        sb6.append(".");
        sb6.append(j18);
        sb6.append(".");
        if (android.text.TextUtils.isEmpty(bVar.f417774b)) {
            try {
                str2 = ve1.b.b(bVar.f417773a.getBytes(com.tencent.mapsdk.internal.rv.f51270c));
            } catch (java.io.UnsupportedEncodingException unused) {
                str2 = ve1.b.b(te1.b.f417771f);
            }
            bVar.f417774b = str2;
        } else {
            str2 = bVar.f417774b;
        }
        sb6.append(str2);
        sb6.append(".");
        sb6.append(j19);
        sb6.append(".v1.dat");
        return new com.tencent.mm.vfs.r6(r6Var, sb6.toString());
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(re1.i iVar) {
        java.lang.String str = iVar.f394335d;
        java.lang.String str2 = this.f394335d;
        if (!str2.equals(str)) {
            return str2.compareTo(iVar.f394335d);
        }
        long j17 = this.f394336e - iVar.f394336e;
        if (j17 == 0) {
            return 0;
        }
        return j17 < 0 ? -1 : 1;
    }
}
