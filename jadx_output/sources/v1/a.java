package v1;

/* loaded from: classes14.dex */
public abstract class a {
    public static final boolean a(java.util.List list) {
        java.util.List list2;
        long j17;
        if (list.size() < 2) {
            return true;
        }
        if (list.size() == 0 || list.size() == 1) {
            list2 = kz5.p0.f313996d;
        } else {
            list2 = new java.util.ArrayList();
            java.lang.Object obj = list.get(0);
            int h17 = kz5.c0.h(list);
            int i17 = 0;
            while (i17 < h17) {
                i17++;
                java.lang.Object obj2 = list.get(i17);
                y1.y yVar = (y1.y) obj2;
                y1.y yVar2 = (y1.y) obj;
                list2.add(new d1.e(d1.f.a(java.lang.Math.abs(d1.e.c(yVar2.d().a()) - d1.e.c(yVar.d().a())), java.lang.Math.abs(d1.e.d(yVar2.d().a()) - d1.e.d(yVar.d().a())))));
                obj = obj2;
            }
        }
        if (list2.size() == 1) {
            j17 = ((d1.e) kz5.n0.X(list2)).f225627a;
        } else {
            if (list2.isEmpty()) {
                throw new java.lang.UnsupportedOperationException("Empty collection can't be reduced.");
            }
            java.lang.Object X = kz5.n0.X(list2);
            int h18 = kz5.c0.h(list2);
            if (1 <= h18) {
                int i18 = 1;
                while (true) {
                    X = new d1.e(d1.e.f(((d1.e) X).f225627a, ((d1.e) list2.get(i18)).f225627a));
                    if (i18 == h18) {
                        break;
                    }
                    i18++;
                }
            }
            j17 = ((d1.e) X).f225627a;
        }
        return d1.e.d(j17) < d1.e.c(j17);
    }

    public static final boolean b(y1.y yVar) {
        kotlin.jvm.internal.o.g(yVar, "<this>");
        y1.l f17 = yVar.f();
        y1.o0 o0Var = y1.i0.f458719a;
        return (y1.m.a(f17, y1.i0.f458724f) == null && y1.m.a(yVar.f(), y1.i0.f458723e) == null) ? false : true;
    }

    public static final void c(y1.y node, o3.l info) {
        kotlin.jvm.internal.o.g(node, "node");
        kotlin.jvm.internal.o.g(info, "info");
        android.support.v4.media.f.a(y1.m.a(node.f(), y1.i0.f458725g));
        y1.y g17 = node.g();
        if (g17 == null || y1.m.a(g17.f(), y1.i0.f458723e) == null) {
            return;
        }
        y1.b bVar = (y1.b) y1.m.a(g17.f(), y1.i0.f458724f);
        if (bVar != null) {
            if (bVar.f458695a < 0 || bVar.f458696b < 0) {
                return;
            }
        }
        if (node.f().d(y1.i0.f458740v)) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.List h17 = g17.h();
            int size = h17.size();
            for (int i17 = 0; i17 < size; i17++) {
                y1.y yVar = (y1.y) h17.get(i17);
                if (yVar.f().d(y1.i0.f458740v)) {
                    arrayList.add(yVar);
                }
            }
            if (!arrayList.isEmpty()) {
                boolean a17 = a(arrayList);
                int size2 = arrayList.size();
                for (int i18 = 0; i18 < size2; i18++) {
                    y1.y yVar2 = (y1.y) arrayList.get(i18);
                    if (yVar2.f458800f == node.f458800f) {
                        int i19 = a17 ? 0 : i18;
                        int i27 = a17 ? i18 : 0;
                        y1.l f17 = yVar2.f();
                        y1.o0 key = y1.i0.f458740v;
                        f17.getClass();
                        kotlin.jvm.internal.o.g(key, "key");
                        java.lang.Object obj = ((java.util.LinkedHashMap) f17.f458766d).get(key);
                        if (obj == null) {
                            obj = java.lang.Boolean.FALSE;
                        }
                        info.o(o3.k.a(i19, 1, i27, 1, false, ((java.lang.Boolean) obj).booleanValue()));
                    }
                }
            }
        }
    }
}
