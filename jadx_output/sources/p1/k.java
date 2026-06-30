package p1;

/* loaded from: classes14.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public final o0.i f350840a = new o0.i(new p1.j[16], 0);

    public boolean a(java.util.Map changes, s1.z parentCoordinates, p1.g internalPointerEvent, boolean z17) {
        kotlin.jvm.internal.o.g(changes, "changes");
        kotlin.jvm.internal.o.g(parentCoordinates, "parentCoordinates");
        kotlin.jvm.internal.o.g(internalPointerEvent, "internalPointerEvent");
        o0.i iVar = this.f350840a;
        int i17 = iVar.f341852f;
        if (i17 <= 0) {
            return false;
        }
        java.lang.Object[] objArr = iVar.f341850d;
        int i18 = 0;
        boolean z18 = false;
        do {
            z18 = ((p1.j) objArr[i18]).a(changes, parentCoordinates, internalPointerEvent, z17) || z18;
            i18++;
        } while (i18 < i17);
        return z18;
    }

    public void b(p1.g internalPointerEvent) {
        kotlin.jvm.internal.o.g(internalPointerEvent, "internalPointerEvent");
        o0.i iVar = this.f350840a;
        int i17 = iVar.f341852f;
        while (true) {
            i17--;
            if (-1 >= i17) {
                return;
            }
            if (((p1.j) iVar.f341850d[i17]).f350833c.i()) {
                iVar.m(i17);
            }
        }
    }

    public final void c() {
        int i17 = 0;
        while (true) {
            o0.i iVar = this.f350840a;
            if (i17 >= iVar.f341852f) {
                return;
            }
            p1.j jVar = (p1.j) iVar.f341850d[i17];
            if (jVar.f350832b.f350926e) {
                i17++;
                jVar.c();
            } else {
                iVar.m(i17);
                jVar.d();
            }
        }
    }
}
