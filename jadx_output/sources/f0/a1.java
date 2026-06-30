package f0;

/* loaded from: classes14.dex */
public final class a1 {

    /* renamed from: a, reason: collision with root package name */
    public int f257999a;

    /* renamed from: b, reason: collision with root package name */
    public int f258000b;

    /* renamed from: c, reason: collision with root package name */
    public final n0.v2 f258001c;

    /* renamed from: d, reason: collision with root package name */
    public final n0.v2 f258002d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f258003e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f258004f;

    public a1(int i17, int i18) {
        this.f257999a = i17;
        this.f258000b = i18;
        this.f258001c = n0.s4.c(java.lang.Integer.valueOf(i17), null, 2, null);
        this.f258002d = n0.s4.c(java.lang.Integer.valueOf(this.f258000b), null, 2, null);
    }

    public final void a(int i17, int i18) {
        if (!(((float) i17) >= 0.0f)) {
            throw new java.lang.IllegalArgumentException(("Index should be non-negative (" + i17 + ')').toString());
        }
        if (!(i17 == this.f257999a)) {
            this.f257999a = i17;
            ((n0.q4) this.f258001c).setValue(java.lang.Integer.valueOf(i17));
        }
        if (i18 != this.f258000b) {
            this.f258000b = i18;
            ((n0.q4) this.f258002d).setValue(java.lang.Integer.valueOf(i18));
        }
    }
}
