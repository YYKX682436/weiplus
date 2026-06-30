package yg5;

/* loaded from: classes10.dex */
public final class e extends yg5.f {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f462348d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f462349e;

    /* renamed from: f, reason: collision with root package name */
    public final int f462350f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.CharSequence f462351g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f462352h;

    public e(java.lang.String _uniqueId, java.lang.String groupUniqueId, int i17, java.lang.CharSequence name, boolean z17) {
        kotlin.jvm.internal.o.g(_uniqueId, "_uniqueId");
        kotlin.jvm.internal.o.g(groupUniqueId, "groupUniqueId");
        kotlin.jvm.internal.o.g(name, "name");
        this.f462348d = _uniqueId;
        this.f462349e = groupUniqueId;
        this.f462350f = i17;
        this.f462351g = name;
        this.f462352h = z17;
    }

    @Override // xm3.d
    public boolean X(java.lang.Object obj) {
        yg5.f other = (yg5.f) obj;
        kotlin.jvm.internal.o.g(other, "other");
        if (!(other instanceof yg5.e)) {
            return false;
        }
        if (kotlin.jvm.internal.o.b(this.f462348d, other.n())) {
            return this.f462350f == other.getPriority() && this.f462352h == ((yg5.e) other).f462352h;
        }
        return false;
    }

    @Override // yg5.f, xm3.a
    public java.lang.Object clone() {
        return super.clone();
    }

    @Override // yg5.f
    public int getPriority() {
        return this.f462350f;
    }

    @Override // xm3.a, in5.c
    public int h() {
        return 1;
    }

    @Override // yg5.f
    public java.lang.String n() {
        return this.f462348d;
    }
}
