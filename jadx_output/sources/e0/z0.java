package e0;

/* loaded from: classes14.dex */
public final class z0 {

    /* renamed from: a, reason: collision with root package name */
    public int f245730a;

    /* renamed from: b, reason: collision with root package name */
    public int f245731b;

    /* renamed from: c, reason: collision with root package name */
    public final n0.v2 f245732c;

    /* renamed from: d, reason: collision with root package name */
    public final n0.v2 f245733d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f245734e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f245735f;

    public z0(int i17, int i18) {
        this.f245730a = i17;
        this.f245731b = i18;
        this.f245732c = n0.s4.c(java.lang.Integer.valueOf(i17), null, 2, null);
        this.f245733d = n0.s4.c(java.lang.Integer.valueOf(this.f245731b), null, 2, null);
    }

    public final void a(int i17, int i18) {
        if (!(((float) i17) >= 0.0f)) {
            throw new java.lang.IllegalArgumentException(("Index should be non-negative (" + i17 + ')').toString());
        }
        if (!(i17 == this.f245730a)) {
            this.f245730a = i17;
            ((n0.q4) this.f245732c).setValue(java.lang.Integer.valueOf(i17));
        }
        if (i18 != this.f245731b) {
            this.f245731b = i18;
            ((n0.q4) this.f245733d).setValue(java.lang.Integer.valueOf(i18));
        }
    }
}
