package sj4;

/* loaded from: classes11.dex */
public abstract class a1 {
    public static final pj4.j0 a(java.util.List list) {
        kotlin.jvm.internal.o.g(list, "<this>");
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            pj4.j0 j0Var = (pj4.j0) it.next();
            sj4.z0 z0Var = sj4.z0.f408908a;
            java.lang.String str = j0Var.f355139d;
            boolean z17 = true;
            if (sj4.z0.f408909b.get(str) == null) {
                if (str != null) {
                    java.util.Iterator it6 = ((fs.e) ((fs.c) fs.g.f(bi4.r0.class)).all()).iterator();
                    while (it6.hasNext()) {
                        if (((fs.q) it6.next()).hasKey(str)) {
                            break;
                        }
                    }
                }
                z17 = false;
            }
            if (z17) {
                return j0Var;
            }
        }
        return null;
    }
}
