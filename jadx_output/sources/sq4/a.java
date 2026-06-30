package sq4;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f411366a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f411367b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f411368c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f411369d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f411370e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f411371f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f411372g;

    public a(boolean z17, boolean z18, boolean z19, boolean z27, boolean z28, boolean z29, boolean z37) {
        this.f411366a = z17;
        this.f411367b = z18;
        this.f411368c = z19;
        this.f411369d = z27;
        this.f411370e = z28;
        this.f411371f = z29;
        this.f411372g = z37;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f411367b ? 1 : 2);
        sb6.append('#');
        sb6.append(this.f411368c ? 3 : 4);
        sb6.append('#');
        if (this.f411366a) {
            sb6.append(this.f411369d ? 5 : 6);
            sb6.append('#');
            sb6.append(this.f411370e ? 7 : 8);
            sb6.append('#');
            sb6.append(this.f411371f ? 9 : 10);
            sb6.append('#');
        }
        sb6.append(this.f411372g ? 14 : 13);
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        return sb7;
    }
}
