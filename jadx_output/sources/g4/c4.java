package g4;

/* loaded from: classes5.dex */
public final class c4 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f268241a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Integer f268242b;

    /* renamed from: c, reason: collision with root package name */
    public final g4.h3 f268243c;

    /* renamed from: d, reason: collision with root package name */
    public final int f268244d;

    public c4(java.util.List pages, java.lang.Integer num, g4.h3 config, int i17) {
        kotlin.jvm.internal.o.g(pages, "pages");
        kotlin.jvm.internal.o.g(config, "config");
        this.f268241a = pages;
        this.f268242b = num;
        this.f268243c = config;
        this.f268244d = i17;
    }

    public final g4.z3 a(int i17) {
        java.util.List list = this.f268241a;
        int i18 = 0;
        boolean z17 = true;
        if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (!((g4.z3) it.next()).f268653a.isEmpty()) {
                    z17 = false;
                    break;
                }
            }
        }
        if (z17) {
            return null;
        }
        int i19 = i17 - this.f268244d;
        while (i18 < kz5.c0.h(list) && i19 > kz5.c0.h(((g4.z3) list.get(i18)).f268653a)) {
            i19 -= ((g4.z3) list.get(i18)).f268653a.size();
            i18++;
        }
        return i19 < 0 ? (g4.z3) kz5.n0.X(list) : (g4.z3) list.get(i18);
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof g4.c4) {
            g4.c4 c4Var = (g4.c4) obj;
            if (kotlin.jvm.internal.o.b(this.f268241a, c4Var.f268241a) && kotlin.jvm.internal.o.b(this.f268242b, c4Var.f268242b) && kotlin.jvm.internal.o.b(this.f268243c, c4Var.f268243c) && this.f268244d == c4Var.f268244d) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f268241a.hashCode();
        java.lang.Integer num = this.f268242b;
        return hashCode + (num != null ? num.hashCode() : 0) + this.f268243c.hashCode() + java.lang.Integer.hashCode(this.f268244d);
    }

    public java.lang.String toString() {
        return "PagingState(pages=" + this.f268241a + ", anchorPosition=" + this.f268242b + ", config=" + this.f268243c + ", leadingPlaceholderCount=" + this.f268244d + ')';
    }
}
