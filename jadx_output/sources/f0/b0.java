package f0;

/* loaded from: classes5.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.compose.foundation.lazy.layout.d f258007a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f258008b;

    /* renamed from: c, reason: collision with root package name */
    public androidx.compose.foundation.lazy.layout.c f258009c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f258010d;

    public b0(androidx.compose.foundation.lazy.layout.d intervals, boolean z17, e06.k nearestItemsRange) {
        java.util.Map map;
        kotlin.jvm.internal.o.g(intervals, "intervals");
        kotlin.jvm.internal.o.g(nearestItemsRange, "nearestItemsRange");
        this.f258007a = intervals;
        this.f258008b = z17;
        int i17 = nearestItemsRange.f246209d;
        if (!(i17 >= 0)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        androidx.compose.foundation.lazy.layout.b0 b0Var = (androidx.compose.foundation.lazy.layout.b0) intervals;
        int min = java.lang.Math.min(nearestItemsRange.f246210e, b0Var.f10393c - 1);
        if (min < i17) {
            map = kz5.q0.f314001d;
        } else {
            java.util.HashMap hashMap = new java.util.HashMap();
            int a17 = androidx.compose.foundation.lazy.layout.e.a(intervals, i17);
            while (i17 <= min) {
                androidx.compose.foundation.lazy.layout.c cVar = (androidx.compose.foundation.lazy.layout.c) ((java.util.ArrayList) b0Var.f10392b).get(a17);
                yz5.l lVar = ((f0.j) cVar.f10396c).f258119a;
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
        this.f258010d = map;
    }

    public final void a(int i17, n0.o oVar, int i18) {
        java.lang.Object obj = n0.e1.f333492a;
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.V(-405085610);
        androidx.compose.foundation.lazy.layout.c b17 = b(i17);
        ((f0.j) b17.f10396c).f258122d.C(f0.y.f258272a, java.lang.Integer.valueOf(i17 - b17.f10394a), y0Var, 6);
        n0.f4 q17 = y0Var.q();
        if (q17 == null) {
            return;
        }
        ((n0.l3) q17).f333608d = new f0.a0(this, i17, i18);
    }

    public final androidx.compose.foundation.lazy.layout.c b(int i17) {
        androidx.compose.foundation.lazy.layout.c cVar = this.f258009c;
        if (cVar != null) {
            int i18 = cVar.f10395b;
            int i19 = cVar.f10394a;
            if (i17 < i18 + i19 && i19 <= i17) {
                return cVar;
            }
        }
        androidx.compose.foundation.lazy.layout.d dVar = this.f258007a;
        kotlin.jvm.internal.o.g(dVar, "<this>");
        androidx.compose.foundation.lazy.layout.c cVar2 = (androidx.compose.foundation.lazy.layout.c) ((java.util.ArrayList) ((androidx.compose.foundation.lazy.layout.b0) dVar).f10392b).get(androidx.compose.foundation.lazy.layout.e.a(dVar, i17));
        this.f258009c = cVar2;
        return cVar2;
    }
}
