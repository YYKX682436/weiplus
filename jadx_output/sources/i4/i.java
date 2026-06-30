package i4;

/* loaded from: classes13.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f288346a;

    /* renamed from: b, reason: collision with root package name */
    public final int f288347b;

    /* renamed from: c, reason: collision with root package name */
    public final int f288348c;

    /* renamed from: d, reason: collision with root package name */
    public final int f288349d;

    /* renamed from: e, reason: collision with root package name */
    public final int f288350e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f288351f;

    /* renamed from: g, reason: collision with root package name */
    public int f288352g;

    /* renamed from: h, reason: collision with root package name */
    public int f288353h;

    /* renamed from: i, reason: collision with root package name */
    public float[] f288354i;

    public i(int i17, int i18) {
        this.f288346a = android.graphics.Color.red(i17);
        this.f288347b = android.graphics.Color.green(i17);
        this.f288348c = android.graphics.Color.blue(i17);
        this.f288349d = i17;
        this.f288350e = i18;
    }

    public final void a() {
        if (this.f288351f) {
            return;
        }
        int i17 = this.f288349d;
        int f17 = e3.b.f(-1, i17, 4.5f);
        int f18 = e3.b.f(-1, i17, 3.0f);
        if (f17 != -1 && f18 != -1) {
            this.f288353h = e3.b.i(-1, f17);
            this.f288352g = e3.b.i(-1, f18);
            this.f288351f = true;
            return;
        }
        int f19 = e3.b.f(-16777216, i17, 4.5f);
        int f27 = e3.b.f(-16777216, i17, 3.0f);
        if (f19 == -1 || f27 == -1) {
            this.f288353h = f17 != -1 ? e3.b.i(-1, f17) : e3.b.i(-16777216, f19);
            this.f288352g = f18 != -1 ? e3.b.i(-1, f18) : e3.b.i(-16777216, f27);
            this.f288351f = true;
        } else {
            this.f288353h = e3.b.i(-16777216, f19);
            this.f288352g = e3.b.i(-16777216, f27);
            this.f288351f = true;
        }
    }

    public float[] b() {
        if (this.f288354i == null) {
            this.f288354i = new float[3];
        }
        e3.b.a(this.f288346a, this.f288347b, this.f288348c, this.f288354i);
        return this.f288354i;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i4.i.class != obj.getClass()) {
            return false;
        }
        i4.i iVar = (i4.i) obj;
        return this.f288350e == iVar.f288350e && this.f288349d == iVar.f288349d;
    }

    public int hashCode() {
        return (this.f288349d * 31) + this.f288350e;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(i4.i.class.getSimpleName());
        sb6.append(" [RGB: #");
        sb6.append(java.lang.Integer.toHexString(this.f288349d));
        sb6.append("] [HSL: ");
        sb6.append(java.util.Arrays.toString(b()));
        sb6.append("] [Population: ");
        sb6.append(this.f288350e);
        sb6.append("] [Title Text: #");
        a();
        sb6.append(java.lang.Integer.toHexString(this.f288352g));
        sb6.append("] [Body Text: #");
        a();
        sb6.append(java.lang.Integer.toHexString(this.f288353h));
        sb6.append(']');
        return sb6.toString();
    }
}
