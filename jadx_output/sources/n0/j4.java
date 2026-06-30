package n0;

/* loaded from: classes14.dex */
public final class j4 {

    /* renamed from: a, reason: collision with root package name */
    public final n0.k4 f333569a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f333570b;

    /* renamed from: c, reason: collision with root package name */
    public final int f333571c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object[] f333572d;

    /* renamed from: e, reason: collision with root package name */
    public final int f333573e;

    /* renamed from: f, reason: collision with root package name */
    public int f333574f;

    /* renamed from: g, reason: collision with root package name */
    public int f333575g;

    /* renamed from: h, reason: collision with root package name */
    public int f333576h;

    /* renamed from: i, reason: collision with root package name */
    public int f333577i;

    /* renamed from: j, reason: collision with root package name */
    public int f333578j;

    /* renamed from: k, reason: collision with root package name */
    public int f333579k;

    public j4(n0.k4 table) {
        kotlin.jvm.internal.o.g(table, "table");
        this.f333569a = table;
        this.f333570b = table.f333590d;
        int i17 = table.f333591e;
        this.f333571c = i17;
        this.f333572d = table.f333592f;
        this.f333573e = table.f333593g;
        this.f333575g = i17;
        this.f333576h = -1;
    }

    public final n0.d a(int i17) {
        java.util.ArrayList arrayList = this.f333569a.f333597n;
        int n17 = n0.l4.n(arrayList, i17, this.f333571c);
        if (n17 < 0) {
            n0.d dVar = new n0.d(i17);
            arrayList.add(-(n17 + 1), dVar);
            return dVar;
        }
        java.lang.Object obj = arrayList.get(n17);
        kotlin.jvm.internal.o.f(obj, "get(location)");
        return (n0.d) obj;
    }

    public final void b() {
        n0.k4 k4Var = this.f333569a;
        k4Var.getClass();
        if (!(k4Var.f333594h > 0)) {
            throw new java.lang.IllegalArgumentException("Unexpected reader close()".toString());
        }
        k4Var.f333594h--;
    }

    public final void c() {
        if (this.f333577i == 0) {
            if (!(this.f333574f == this.f333575g)) {
                throw new java.lang.IllegalArgumentException("endGroup() not called at the end of a group".toString());
            }
            int i17 = (this.f333576h * 5) + 2;
            int[] iArr = this.f333570b;
            int i18 = iArr[i17];
            this.f333576h = i18;
            this.f333575g = i18 < 0 ? this.f333571c : i18 + iArr[(i18 * 5) + 3];
        }
    }

    public final java.lang.Object d() {
        int m17;
        int i17 = this.f333574f;
        if (i17 >= this.f333575g) {
            return 0;
        }
        int[] iArr = this.f333570b;
        if (!n0.l4.d(iArr, i17)) {
            return n0.n.f333620a;
        }
        int i18 = i17 * 5;
        if (i18 >= iArr.length) {
            m17 = iArr.length;
        } else {
            m17 = n0.l4.m(iArr[i18 + 1] >> 29) + iArr[i18 + 4];
        }
        return this.f333572d[m17];
    }

    public final int e() {
        int i17 = this.f333574f;
        if (i17 >= this.f333575g) {
            return 0;
        }
        return this.f333570b[i17 * 5];
    }

    public final java.lang.Object f(int i17, int i18) {
        int[] iArr = this.f333570b;
        int j17 = n0.l4.j(iArr, i17);
        int i19 = i17 + 1;
        int i27 = j17 + i18;
        if (i27 < (i19 < this.f333571c ? n0.l4.b(iArr, i19) : this.f333573e)) {
            return this.f333572d[i27];
        }
        int i28 = n0.o.f333629a;
        return n0.n.f333620a;
    }

    public final int g(int i17) {
        return n0.l4.c(this.f333570b, i17);
    }

    public final boolean h(int i17) {
        return n0.l4.f(this.f333570b, i17);
    }

    public final java.lang.Object i(int i17) {
        int[] iArr = this.f333570b;
        if (!n0.l4.f(iArr, i17)) {
            return null;
        }
        if (n0.l4.f(iArr, i17)) {
            return this.f333572d[iArr[(i17 * 5) + 4]];
        }
        int i18 = n0.o.f333629a;
        return n0.n.f333620a;
    }

    public final java.lang.Object j(int[] iArr, int i17) {
        if (n0.l4.e(iArr, i17)) {
            return this.f333572d[n0.l4.i(iArr, i17)];
        }
        return null;
    }

    public final int k(int i17) {
        return this.f333570b[(i17 * 5) + 2];
    }

    public final void l(int i17) {
        if (!(this.f333577i == 0)) {
            throw new java.lang.IllegalArgumentException("Cannot reposition while in an empty region".toString());
        }
        this.f333574f = i17;
        int[] iArr = this.f333570b;
        int i18 = this.f333571c;
        int i19 = i17 < i18 ? iArr[(i17 * 5) + 2] : -1;
        this.f333576h = i19;
        if (i19 < 0) {
            this.f333575g = i18;
        } else {
            this.f333575g = i19 + n0.l4.c(iArr, i19);
        }
        this.f333578j = 0;
        this.f333579k = 0;
    }

    public final int m() {
        if (!(this.f333577i == 0)) {
            throw new java.lang.IllegalArgumentException("Cannot skip while in an empty region".toString());
        }
        int i17 = this.f333574f;
        int[] iArr = this.f333570b;
        int h17 = n0.l4.f(iArr, i17) ? 1 : n0.l4.h(iArr, this.f333574f);
        int i18 = this.f333574f;
        this.f333574f = i18 + n0.l4.c(iArr, i18);
        return h17;
    }

    public final void n() {
        if (!(this.f333577i == 0)) {
            throw new java.lang.IllegalArgumentException("Cannot skip the enclosing group while in an empty region".toString());
        }
        this.f333574f = this.f333575g;
    }

    public final void o() {
        if (this.f333577i <= 0) {
            int i17 = this.f333574f;
            int[] iArr = this.f333570b;
            if (!(iArr[(i17 * 5) + 2] == this.f333576h)) {
                throw new java.lang.IllegalArgumentException("Invalid slot table detected".toString());
            }
            this.f333576h = i17;
            this.f333575g = iArr[(i17 * 5) + 3] + i17;
            int i18 = i17 + 1;
            this.f333574f = i18;
            this.f333578j = n0.l4.j(iArr, i17);
            this.f333579k = i17 >= this.f333571c - 1 ? this.f333573e : iArr[(i18 * 5) + 4];
        }
    }

    public java.lang.String toString() {
        return "SlotReader(current=" + this.f333574f + ", key=" + e() + ", parent=" + this.f333576h + ", end=" + this.f333575g + ')';
    }
}
