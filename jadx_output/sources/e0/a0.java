package e0;

/* loaded from: classes5.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.compose.foundation.lazy.layout.d f245490a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f245491b;

    /* renamed from: c, reason: collision with root package name */
    public androidx.compose.foundation.lazy.layout.c f245492c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f245493d;

    public a0(androidx.compose.foundation.lazy.layout.d list, java.util.List headerIndexes, e06.k nearestItemsRange) {
        java.util.Map map;
        kotlin.jvm.internal.o.g(list, "list");
        kotlin.jvm.internal.o.g(headerIndexes, "headerIndexes");
        kotlin.jvm.internal.o.g(nearestItemsRange, "nearestItemsRange");
        this.f245490a = list;
        this.f245491b = headerIndexes;
        int i17 = nearestItemsRange.f246209d;
        if (!(i17 >= 0)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        androidx.compose.foundation.lazy.layout.b0 b0Var = (androidx.compose.foundation.lazy.layout.b0) list;
        int min = java.lang.Math.min(nearestItemsRange.f246210e, b0Var.f10393c - 1);
        if (min < i17) {
            map = kz5.q0.f314001d;
        } else {
            java.util.HashMap hashMap = new java.util.HashMap();
            int a17 = androidx.compose.foundation.lazy.layout.e.a(list, i17);
            while (i17 <= min) {
                androidx.compose.foundation.lazy.layout.c cVar = (androidx.compose.foundation.lazy.layout.c) ((java.util.ArrayList) b0Var.f10392b).get(a17);
                yz5.l lVar = ((e0.m) cVar.f10396c).f245644a;
                int i18 = cVar.f10395b;
                int i19 = cVar.f10394a;
                if (lVar != null) {
                    int i27 = i17 - i19;
                    if (i27 == i18) {
                        a17++;
                    } else {
                        hashMap.put(lVar.invoke(java.lang.Integer.valueOf(i27)), java.lang.Integer.valueOf(i17));
                        i17++;
                    }
                } else {
                    a17++;
                    i17 = i19 + i18;
                }
            }
            map = hashMap;
        }
        this.f245493d = map;
    }

    public final void a(e0.g scope, int i17, n0.o oVar, int i18) {
        kotlin.jvm.internal.o.g(scope, "scope");
        java.lang.Object obj = n0.e1.f333492a;
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.V(1922528915);
        androidx.compose.foundation.lazy.layout.c b17 = b(i17);
        ((e0.m) b17.f10396c).f245646c.C(scope, java.lang.Integer.valueOf(i17 - b17.f10394a), y0Var, java.lang.Integer.valueOf(i18 & 14));
        n0.f4 q17 = y0Var.q();
        if (q17 == null) {
            return;
        }
        ((n0.l3) q17).f333608d = new e0.z(this, scope, i17, i18);
    }

    public final androidx.compose.foundation.lazy.layout.c b(int i17) {
        androidx.compose.foundation.lazy.layout.c cVar = this.f245492c;
        if (cVar != null) {
            int i18 = cVar.f10395b;
            int i19 = cVar.f10394a;
            if (i17 < i18 + i19 && i19 <= i17) {
                return cVar;
            }
        }
        androidx.compose.foundation.lazy.layout.d dVar = this.f245490a;
        kotlin.jvm.internal.o.g(dVar, "<this>");
        androidx.compose.foundation.lazy.layout.c cVar2 = (androidx.compose.foundation.lazy.layout.c) ((java.util.ArrayList) ((androidx.compose.foundation.lazy.layout.b0) dVar).f10392b).get(androidx.compose.foundation.lazy.layout.e.a(dVar, i17));
        this.f245492c = cVar2;
        return cVar2;
    }
}
