package oo1;

/* loaded from: classes12.dex */
public final class e {

    /* renamed from: i, reason: collision with root package name */
    public static final oo1.a f347133i = new oo1.a(null);

    /* renamed from: a, reason: collision with root package name */
    public final long f347134a;

    /* renamed from: b, reason: collision with root package name */
    public final long f347135b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f347136c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f347137d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f347138e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f347139f;

    /* renamed from: g, reason: collision with root package name */
    public long f347140g = 1024;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashMap f347141h = new java.util.HashMap();

    public e(long j17, long j18, boolean z17) {
        this.f347134a = j17;
        this.f347135b = j18;
        this.f347136c = z17;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0322 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0257 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r27, kotlin.coroutines.Continuation r28) {
        /*
            Method dump skipped, instructions count: 894
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oo1.e.a(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final oo1.b b(java.lang.String str) {
        java.util.HashMap hashMap = this.f347141h;
        oo1.b bVar = (oo1.b) hashMap.get(str);
        if (bVar != null) {
            return bVar;
        }
        oo1.b bVar2 = new oo1.b(str, 0L, 0L, 0L, 0L);
        hashMap.put(str, bVar2);
        return bVar2;
    }
}
