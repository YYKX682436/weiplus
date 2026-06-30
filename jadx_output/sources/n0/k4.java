package n0;

/* loaded from: classes14.dex */
public final class k4 implements y0.a, java.lang.Iterable, zz5.a {

    /* renamed from: e, reason: collision with root package name */
    public int f333591e;

    /* renamed from: g, reason: collision with root package name */
    public int f333593g;

    /* renamed from: h, reason: collision with root package name */
    public int f333594h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f333595i;

    /* renamed from: m, reason: collision with root package name */
    public int f333596m;

    /* renamed from: d, reason: collision with root package name */
    public int[] f333590d = new int[0];

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object[] f333592f = new java.lang.Object[0];

    /* renamed from: n, reason: collision with root package name */
    public java.util.ArrayList f333597n = new java.util.ArrayList();

    @Override // y0.a
    public java.lang.Iterable d() {
        return this;
    }

    public final int e(n0.d anchor) {
        kotlin.jvm.internal.o.g(anchor, "anchor");
        if (!(!this.f333595i)) {
            n0.e1.c("Use active SlotWriter to determine anchor location instead".toString());
            throw null;
        }
        if (anchor.a()) {
            return anchor.f333477a;
        }
        throw new java.lang.IllegalArgumentException("Anchor refers to a group that was removed".toString());
    }

    public final boolean g(int i17, n0.d anchor) {
        kotlin.jvm.internal.o.g(anchor, "anchor");
        if (!(!this.f333595i)) {
            n0.e1.c("Writer is active".toString());
            throw null;
        }
        if (!(i17 >= 0 && i17 < this.f333591e)) {
            n0.e1.c("Invalid group index".toString());
            throw null;
        }
        if (k(anchor)) {
            int c17 = n0.l4.c(this.f333590d, i17) + i17;
            int i18 = anchor.f333477a;
            if (i17 <= i18 && i18 < c17) {
                return true;
            }
        }
        return false;
    }

    public final n0.j4 h() {
        if (this.f333595i) {
            throw new java.lang.IllegalStateException("Cannot read while a writer is pending".toString());
        }
        this.f333594h++;
        return new n0.j4(this);
    }

    @Override // java.lang.Iterable
    public java.util.Iterator iterator() {
        return new n0.g2(this, 0, this.f333591e);
    }

    public final n0.o4 j() {
        if (!(!this.f333595i)) {
            n0.e1.c("Cannot start a writer when another writer is pending".toString());
            throw null;
        }
        if (!(this.f333594h <= 0)) {
            n0.e1.c("Cannot start a writer when a reader is pending".toString());
            throw null;
        }
        this.f333595i = true;
        this.f333596m++;
        return new n0.o4(this);
    }

    public final boolean k(n0.d anchor) {
        kotlin.jvm.internal.o.g(anchor, "anchor");
        if (!anchor.a()) {
            return false;
        }
        int n17 = n0.l4.n(this.f333597n, anchor.f333477a, this.f333591e);
        return n17 >= 0 && kotlin.jvm.internal.o.b(this.f333597n.get(n17), anchor);
    }
}
