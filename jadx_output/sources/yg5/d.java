package yg5;

/* loaded from: classes10.dex */
public final class d extends yg5.f {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f462343d;

    /* renamed from: e, reason: collision with root package name */
    public final int f462344e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.CharSequence f462345f;

    /* renamed from: g, reason: collision with root package name */
    public final yg5.a f462346g;

    /* renamed from: h, reason: collision with root package name */
    public final yz5.l f462347h;

    public d(java.lang.String _uniqueId, int i17, java.lang.CharSequence charSequence, yg5.a selectMode, yz5.l lVar) {
        kotlin.jvm.internal.o.g(_uniqueId, "_uniqueId");
        kotlin.jvm.internal.o.g(selectMode, "selectMode");
        this.f462343d = _uniqueId;
        this.f462344e = i17;
        this.f462345f = charSequence;
        this.f462346g = selectMode;
        this.f462347h = lVar;
    }

    @Override // xm3.d
    public boolean X(java.lang.Object obj) {
        yg5.f other = (yg5.f) obj;
        kotlin.jvm.internal.o.g(other, "other");
        if (!(other instanceof yg5.d)) {
            return false;
        }
        return kotlin.jvm.internal.o.b(this.f462343d, other.n());
    }

    @Override // yg5.f, xm3.a
    public java.lang.Object clone() {
        return super.clone();
    }

    @Override // yg5.f
    public int getPriority() {
        return this.f462344e;
    }

    @Override // xm3.a, in5.c
    public int h() {
        return 0;
    }

    @Override // yg5.f
    public java.lang.String n() {
        return this.f462343d;
    }
}
