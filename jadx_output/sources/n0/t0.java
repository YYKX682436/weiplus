package n0;

/* loaded from: classes14.dex */
public final class t0 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f333702d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(int i17) {
        super(3);
        this.f333702d = i17;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        n0.o4 slots = (n0.o4) obj2;
        kotlin.jvm.internal.o.g((n0.e) obj, "<anonymous parameter 0>");
        kotlin.jvm.internal.o.g(slots, "slots");
        kotlin.jvm.internal.o.g((n0.d4) obj3, "<anonymous parameter 2>");
        if (!(slots.f333655m == 0)) {
            throw new java.lang.IllegalArgumentException("Cannot move a group while inserting".toString());
        }
        int i17 = this.f333702d;
        if (!(i17 >= 0)) {
            throw new java.lang.IllegalArgumentException("Parameter offset is out of bounds".toString());
        }
        if (i17 != 0) {
            int i18 = slots.f333660r;
            int i19 = slots.f333661s;
            int i27 = slots.f333649g;
            int i28 = i18;
            while (i17 > 0) {
                i28 += n0.l4.c(slots.f333644b, slots.m(i28));
                if (!(i28 <= i27)) {
                    throw new java.lang.IllegalArgumentException("Parameter offset is out of bounds".toString());
                }
                i17--;
            }
            int c17 = n0.l4.c(slots.f333644b, slots.m(i28));
            int i29 = slots.f333650h;
            int f17 = slots.f(slots.f333644b, slots.m(i28));
            int i37 = i28 + c17;
            int f18 = slots.f(slots.f333644b, slots.m(i37));
            int i38 = f18 - f17;
            slots.q(i38, java.lang.Math.max(slots.f333660r - 1, 0));
            slots.p(c17);
            int[] iArr = slots.f333644b;
            int m17 = slots.m(i37) * 5;
            kz5.v.j(iArr, iArr, slots.m(i18) * 5, m17, (c17 * 5) + m17);
            if (i38 > 0) {
                java.lang.Object[] objArr = slots.f333645c;
                kz5.v.k(objArr, objArr, i29, slots.g(f17 + i38), slots.g(f18 + i38));
            }
            int i39 = f17 + i38;
            int i47 = i39 - i29;
            int i48 = slots.f333652j;
            int i49 = slots.f333653k;
            int length = slots.f333645c.length;
            int i57 = slots.f333654l;
            int i58 = i18 + c17;
            int i59 = i18;
            while (i59 < i58) {
                int m18 = slots.m(i59);
                int i66 = i58;
                int f19 = slots.f(iArr, m18) - i47;
                int i67 = i47;
                if (f19 > (i57 < m18 ? 0 : i48)) {
                    f19 = -(((length - i49) - f19) + 1);
                }
                int i68 = slots.f333652j;
                int i69 = i48;
                int i76 = slots.f333653k;
                int i77 = i49;
                int length2 = slots.f333645c.length;
                if (f19 > i68) {
                    f19 = -(((length2 - i76) - f19) + 1);
                }
                iArr[(m18 * 5) + 4] = f19;
                i59++;
                i58 = i66;
                i47 = i67;
                i48 = i69;
                i49 = i77;
            }
            int i78 = c17 + i37;
            int l17 = slots.l();
            int g17 = n0.l4.g(slots.f333646d, i37, l17);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (g17 >= 0) {
                while (g17 < slots.f333646d.size()) {
                    java.lang.Object obj4 = slots.f333646d.get(g17);
                    kotlin.jvm.internal.o.f(obj4, "anchors[index]");
                    n0.d dVar = (n0.d) obj4;
                    int c18 = slots.c(dVar);
                    if (c18 < i37 || c18 >= i78) {
                        break;
                    }
                    arrayList.add(dVar);
                    slots.f333646d.remove(g17);
                }
            }
            int i79 = i18 - i37;
            int size = arrayList.size();
            for (int i86 = 0; i86 < size; i86++) {
                n0.d dVar2 = (n0.d) arrayList.get(i86);
                int c19 = slots.c(dVar2) + i79;
                if (c19 >= slots.f333647e) {
                    dVar2.f333477a = -(l17 - c19);
                } else {
                    dVar2.f333477a = c19;
                }
                slots.f333646d.add(n0.l4.g(slots.f333646d, c19, l17), dVar2);
            }
            if (!(!slots.A(i37, c17))) {
                n0.e1.c("Unexpectedly removed anchors".toString());
                throw null;
            }
            slots.k(i19, slots.f333649g, i18);
            if (i38 > 0) {
                slots.B(i39, i38, i37 - 1);
            }
        }
        return jz5.f0.f302826a;
    }
}
