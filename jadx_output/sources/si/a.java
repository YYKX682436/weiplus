package si;

/* loaded from: classes16.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final ti.u0 f408033a;

    public a(java.lang.String str, ti.u0 u0Var) {
        this.f408033a = u0Var;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:115:0x0074. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x03e7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02f7  */
    /* JADX WARN: Type inference failed for: r1v35, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [int] */
    /* JADX WARN: Type inference failed for: r6v41 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ti.a a(long r33, dc.m r35, dc.j r36) {
        /*
            Method dump skipped, instructions count: 1620
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: si.a.a(long, dc.m, dc.j):ti.a");
    }

    public final dc.j b(java.lang.String str, dc.m mVar) {
        dc.e c17 = mVar.c("com.tencent.matrix.resource.analyzer.model.DestroyedActivityInfo");
        if (c17 == null) {
            throw new java.lang.IllegalStateException("Unabled to find destroy activity info class with name: com.tencent.matrix.resource.analyzer.model.DestroyedActivityInfo");
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        fc.n nVar = c17.f228612q;
        int i17 = nVar.f260900d;
        java.lang.Object[] objArr = new java.lang.Object[i17];
        java.lang.Object[] objArr2 = nVar.f260917i;
        int length = objArr2.length;
        int i18 = 0;
        while (true) {
            int i19 = length - 1;
            if (length <= 0) {
                break;
            }
            if (fc.n.p(objArr2, i19)) {
                int i27 = i18 + 1;
                java.lang.Object obj = objArr2[i19];
                if (obj == fc.s.f260927o) {
                    obj = null;
                }
                objArr[i18] = obj;
                i18 = i27;
            }
            length = i19;
        }
        int i28 = 0;
        for (int i29 = 0; i29 < i17; i29++) {
            i28 += ((java.util.ArrayList) ((dc.d) objArr[i29]).f228605a).size();
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(i28);
        int i37 = nVar.f260900d;
        int[] iArr = new int[i37];
        int[] iArr2 = nVar.f260918m;
        java.lang.Object[] objArr3 = nVar.f260917i;
        int length2 = iArr2.length;
        int i38 = 0;
        while (true) {
            int i39 = length2 - 1;
            if (length2 <= 0) {
                break;
            }
            if (fc.n.p(objArr3, i39)) {
                iArr[i38] = iArr2[i39];
                i38++;
            }
            length2 = i39;
        }
        for (int i47 = 0; i47 < i37; i47++) {
            dc.d dVar = (dc.d) nVar.get(iArr[i47]);
            arrayList2.addAll(dVar == null ? new java.util.ArrayList(0) : dVar.f228605a);
        }
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            dc.j jVar = (dc.j) it.next();
            java.util.Set set = dc.g.f228616a;
            java.util.List m17 = ((dc.c) jVar).m();
            java.lang.String a17 = dc.g.a(dc.g.b(m17, "mKey"));
            if (a17.equals(str)) {
                dc.j jVar2 = (dc.j) dc.g.b(m17, "mActivityRef");
                if (jVar2 != null) {
                    return (dc.j) dc.g.b(((dc.c) jVar2).m(), "referent");
                }
            } else {
                arrayList.add(a17);
            }
        }
        throw new java.lang.IllegalStateException("Could not find weak reference with key " + str + " in " + arrayList);
    }
}
