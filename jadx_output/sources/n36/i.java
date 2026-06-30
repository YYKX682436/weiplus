package n36;

/* loaded from: classes16.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f334823a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f334824b;

    /* renamed from: c, reason: collision with root package name */
    public final java.io.File[] f334825c;

    /* renamed from: d, reason: collision with root package name */
    public final java.io.File[] f334826d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f334827e;

    /* renamed from: f, reason: collision with root package name */
    public n36.h f334828f;

    /* renamed from: g, reason: collision with root package name */
    public long f334829g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ n36.k f334830h;

    public i(n36.k kVar, java.lang.String str) {
        this.f334830h = kVar;
        this.f334823a = str;
        int i17 = kVar.f334842n;
        this.f334824b = new long[i17];
        this.f334825c = new java.io.File[i17];
        this.f334826d = new java.io.File[i17];
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(str);
        sb6.append('.');
        int length = sb6.length();
        for (int i18 = 0; i18 < kVar.f334842n; i18++) {
            sb6.append(i18);
            java.io.File[] fileArr = this.f334825c;
            java.lang.String sb7 = sb6.toString();
            java.io.File file = kVar.f334836e;
            fileArr[i18] = new java.io.File(file, sb7);
            sb6.append(".tmp");
            this.f334826d[i18] = new java.io.File(file, sb6.toString());
            sb6.setLength(length);
        }
    }

    public n36.j a() {
        x36.h0 h0Var;
        n36.k kVar = this.f334830h;
        if (!java.lang.Thread.holdsLock(kVar)) {
            throw new java.lang.AssertionError();
        }
        x36.h0[] h0VarArr = new x36.h0[kVar.f334842n];
        long[] jArr = (long[]) this.f334824b.clone();
        int i17 = 0;
        while (true) {
            try {
                n36.k kVar2 = this.f334830h;
                if (i17 >= kVar2.f334842n) {
                    return new n36.j(kVar2, this.f334823a, this.f334829g, h0VarArr, jArr);
                }
                s36.b bVar = kVar2.f334835d;
                java.io.File file = this.f334825c[i17];
                ((s36.a) bVar).getClass();
                h0VarArr[i17] = x36.v.e(file);
                i17++;
            } catch (java.io.FileNotFoundException unused) {
                for (int i18 = 0; i18 < kVar.f334842n && (h0Var = h0VarArr[i18]) != null; i18++) {
                    m36.e.c(h0Var);
                }
                try {
                    kVar.w(this);
                    return null;
                } catch (java.io.IOException unused2) {
                    return null;
                }
            }
        }
    }
}
