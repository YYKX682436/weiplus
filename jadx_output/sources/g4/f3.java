package g4;

/* loaded from: classes5.dex */
public final class f3 {

    /* renamed from: e, reason: collision with root package name */
    public static final g4.f3 f268291e = new g4.f3(g4.i1.f268367f);

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f268292a;

    /* renamed from: b, reason: collision with root package name */
    public int f268293b;

    /* renamed from: c, reason: collision with root package name */
    public int f268294c;

    /* renamed from: d, reason: collision with root package name */
    public int f268295d;

    public f3(g4.i1 insertEvent) {
        kotlin.jvm.internal.o.g(insertEvent, "insertEvent");
        java.util.List list = insertEvent.f268370b;
        this.f268292a = kz5.n0.V0(list);
        java.util.Iterator it = list.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            i17 += ((g4.x4) it.next()).f268620b.size();
        }
        this.f268293b = i17;
        this.f268294c = insertEvent.f268371c;
        this.f268295d = insertEvent.f268372d;
    }

    public final g4.z4 a(int i17) {
        java.util.List list;
        java.util.ArrayList arrayList;
        int i18 = i17 - this.f268294c;
        int i19 = 0;
        while (true) {
            list = this.f268292a;
            arrayList = (java.util.ArrayList) list;
            if (i18 < ((g4.x4) arrayList.get(i19)).f268620b.size() || i19 >= kz5.c0.h(list)) {
                break;
            }
            i18 -= ((g4.x4) ((java.util.ArrayList) list).get(i19)).f268620b.size();
            i19++;
        }
        g4.x4 x4Var = (g4.x4) arrayList.get(i19);
        int i27 = i17 - this.f268294c;
        int d17 = ((d() - i17) - this.f268295d) - 1;
        java.lang.Integer j07 = kz5.z.j0(((g4.x4) kz5.n0.X(list)).f268619a);
        kotlin.jvm.internal.o.d(j07);
        int intValue = j07.intValue();
        java.lang.Integer h07 = kz5.z.h0(((g4.x4) kz5.n0.i0(list)).f268619a);
        kotlin.jvm.internal.o.d(h07);
        int intValue2 = h07.intValue();
        int i28 = x4Var.f268621c;
        java.util.List list2 = x4Var.f268622d;
        if (list2 != null && kz5.c0.g(list2).m(i18)) {
            i18 = ((java.lang.Number) list2.get(i18)).intValue();
        }
        return new g4.z4(i28, i18, i27, d17, intValue, intValue2);
    }

    public final int b(e06.k kVar) {
        boolean z17;
        java.util.Iterator it = ((java.util.ArrayList) this.f268292a).iterator();
        int i17 = 0;
        while (it.hasNext()) {
            g4.x4 x4Var = (g4.x4) it.next();
            int[] iArr = x4Var.f268619a;
            int length = iArr.length;
            int i18 = 0;
            while (true) {
                if (i18 >= length) {
                    z17 = false;
                    break;
                }
                if (kVar.m(iArr[i18])) {
                    z17 = true;
                    break;
                }
                i18++;
            }
            if (z17) {
                i17 += x4Var.f268620b.size();
                it.remove();
            }
        }
        return i17;
    }

    public java.lang.Object c(int i17) {
        java.util.List list = this.f268292a;
        int size = ((java.util.ArrayList) list).size();
        int i18 = 0;
        while (i18 < size) {
            int size2 = ((g4.x4) ((java.util.ArrayList) list).get(i18)).f268620b.size();
            if (size2 > i17) {
                break;
            }
            i17 -= size2;
            i18++;
        }
        return ((g4.x4) ((java.util.ArrayList) list).get(i18)).f268620b.get(i17);
    }

    public int d() {
        return this.f268294c + this.f268293b + this.f268295d;
    }

    public java.lang.String toString() {
        int i17 = this.f268293b;
        java.util.ArrayList arrayList = new java.util.ArrayList(i17);
        for (int i18 = 0; i18 < i17; i18++) {
            arrayList.add(c(i18));
        }
        return "[(" + this.f268294c + " placeholders), " + kz5.n0.g0(arrayList, null, null, null, 0, null, null, 63, null) + ", (" + this.f268295d + " placeholders)]";
    }
}
