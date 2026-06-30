package hr5;

/* loaded from: classes15.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final int f284431a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f284432b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f284433c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f284434d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f284435e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f284436f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f284437g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f284438h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f284439i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f284440j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f284441k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f284442l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f284443m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f284444n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f284445o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f284446p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f284447q;

    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r0v3 */
    public p(int i17) {
        this.f284431a = i17;
        ?? r07 = (i17 & 1) != 0 ? 1 : 0;
        this.f284432b = r07;
        boolean z17 = (i17 & 2) != 0;
        this.f284433c = z17;
        boolean z18 = (i17 & 4) != 0;
        this.f284434d = z18;
        boolean z19 = (i17 & 8) != 0;
        this.f284435e = z19;
        boolean z27 = (i17 & 16) != 0;
        this.f284436f = z27;
        boolean z28 = (i17 & 32) != 0;
        this.f284437g = z28;
        boolean z29 = (i17 & 2048) != 0;
        this.f284438h = z29;
        boolean z37 = (i17 & 64) != 0;
        this.f284439i = z37;
        boolean z38 = (i17 & 128) != 0;
        this.f284440j = z38;
        boolean z39 = (i17 & 256) != 0;
        this.f284441k = z39;
        boolean z47 = (i17 & 512) != 0;
        this.f284442l = z47;
        boolean z48 = (i17 & 1024) != 0;
        this.f284443m = z48;
        int i18 = z17 ? r07 + 1 : r07;
        i18 = z18 ? i18 + 1 : i18;
        i18 = z19 ? i18 + 1 : i18;
        i18 = z27 ? i18 + 1 : i18;
        i18 = z28 ? i18 + 1 : i18;
        i18 = z29 ? i18 + 1 : i18;
        i18 = z37 ? i18 + 1 : i18;
        i18 = z38 ? i18 + 1 : i18;
        i18 = z39 ? i18 + 1 : i18;
        i18 = z47 ? i18 + 1 : i18;
        i18 = z48 ? i18 + 1 : i18;
        this.f284444n = i18 == 0;
        this.f284445o = i18 == 1 && r07 != 0;
        if (i18 != 1 || !z17) {
        }
        this.f284446p = i18 == 1 && z18;
        this.f284447q = jz5.h.b(new hr5.o(this));
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && hr5.p.class == obj.getClass() && this.f284431a == ((hr5.p) obj).f284431a;
    }

    public int hashCode() {
        return this.f284431a;
    }

    public java.lang.String toString() {
        return "ResetParamsDiffResult(" + ((java.lang.String) ((jz5.n) this.f284447q).getValue()) + ')';
    }
}
