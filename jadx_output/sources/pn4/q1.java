package pn4;

/* loaded from: classes4.dex */
public class q1 implements pn4.j {

    /* renamed from: a, reason: collision with root package name */
    public int f357197a = 0;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.ArrayList f357199c = new java.util.ArrayList(1);

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Queue f357200d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f357201e = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final pn4.e2[] f357198b = new pn4.e2[1];

    public q1(pn4.m1 m1Var) {
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0112 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pn4.q1.a():void");
    }

    public void b(int i17, int i18, int i19, java.lang.String str, android.util.SparseArray sparseArray, java.util.LinkedList linkedList) {
        java.util.HashMap hashMap;
        com.tencent.mm.protobuf.g gVar;
        this.f357197a--;
        if (linkedList == null || sparseArray.size() != linkedList.size()) {
            hashMap = new java.util.HashMap();
            for (int i27 = 0; i27 < sparseArray.size(); i27++) {
                hashMap.put(((pn4.p1) sparseArray.valueAt(i27)).f357174d, java.lang.Integer.valueOf(((pn4.p1) sparseArray.valueAt(i27)).f357180j));
            }
        } else {
            hashMap = null;
        }
        java.util.HashMap hashMap2 = this.f357201e;
        if (linkedList != null) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                r45.dq6 dq6Var = (r45.dq6) it.next();
                pn4.p1 p1Var = (pn4.p1) sparseArray.get(dq6Var.f372668d);
                if (p1Var == null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.TranslateServiceManager", "[onTranslateEnd] message is null! %s %s %s", java.lang.Integer.valueOf(dq6Var.f372668d), java.lang.Integer.valueOf(dq6Var.f372670f), com.tencent.mm.sdk.platformtools.t8.G1(dq6Var.f372669e));
                } else {
                    java.lang.String str2 = dq6Var.f372669e;
                    if (p1Var.f357179i == 1) {
                        java.lang.String str3 = p1Var.f357183m;
                        str2 = c01.w9.A(str2, str3);
                        p1Var.f357171a = c01.w9.A(p1Var.f357171a, str3);
                    }
                    p1Var.f357173c = str2;
                    p1Var.f357181k = dq6Var.f372670f;
                    p1Var.f357176f = dq6Var.f372671g;
                    r45.cu5 cu5Var = dq6Var.f372672h;
                    p1Var.f357177g = (cu5Var == null || (gVar = cu5Var.f371841f) == null) ? null : gVar.f192156a;
                    p1Var.f357178h = dq6Var.f372673i;
                    java.lang.String str4 = p1Var.f357174d;
                    hashMap2.remove(str4);
                    if (hashMap != null) {
                        hashMap.remove(str4);
                    }
                }
            }
        } else {
            for (int i28 = 0; i28 < sparseArray.size(); i28++) {
                pn4.p1 p1Var2 = (pn4.p1) sparseArray.valueAt(i28);
                if (p1Var2.f357179i == 1) {
                    p1Var2.f357171a = c01.w9.A(p1Var2.f357171a, p1Var2.f357183m);
                }
            }
        }
        if (hashMap != null && hashMap.size() > 0) {
            for (java.util.Map.Entry entry : hashMap.entrySet()) {
                hashMap2.remove(entry.getKey());
                entry.getKey();
                entry.getValue();
            }
        }
        java.util.Iterator it6 = this.f357199c.iterator();
        while (it6.hasNext()) {
            ln4.f fVar = (ln4.f) ((pn4.n1) it6.next());
            fVar.getClass();
            for (int i29 = 0; i29 < sparseArray.size(); i29++) {
                pn4.p1 p1Var3 = (pn4.p1) sparseArray.valueAt(i29);
                if (p1Var3 != null) {
                    fVar.f319907a.f319909e.a(new ln4.e(fVar, i19, p1Var3));
                }
            }
        }
        a();
    }
}
