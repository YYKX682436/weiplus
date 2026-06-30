package oc5;

/* loaded from: classes3.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashSet f344465a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.HashMap f344466b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.HashMap f344467c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f344468d;

    /* renamed from: e, reason: collision with root package name */
    public final int f344469e;

    public m() {
        oc5.e eVar;
        java.util.HashSet hashSet = new java.util.HashSet();
        this.f344465a = hashSet;
        java.util.HashMap hashMap = new java.util.HashMap();
        this.f344466b = hashMap;
        this.f344467c = new java.util.HashMap();
        this.f344468d = new java.util.HashMap();
        hashSet.add(1);
        hashMap.put(1, new oc5.i(this));
        hashSet.add(2);
        hashMap.put(2, new oc5.h(this));
        hashSet.add(6);
        hashMap.put(6, new oc5.g(this));
        java.lang.Integer num = (java.lang.Integer) kz5.n0.Y(hashSet);
        int i17 = 0;
        if (num != null) {
            num.intValue();
            oc5.e eVar2 = (oc5.e) hashMap.get(num);
            if (eVar2 != null) {
                int priority = eVar2.priority();
                int intValue = num.intValue();
                i17 = intValue;
                int i18 = 0;
                for (java.lang.Object obj : hashSet) {
                    int i19 = i18 + 1;
                    if (i18 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    int intValue2 = ((java.lang.Number) obj).intValue();
                    if (i18 != 0 && (eVar = (oc5.e) hashMap.get(java.lang.Integer.valueOf(intValue2))) != null && eVar.priority() < priority) {
                        priority = eVar.priority();
                        i17 = intValue2;
                    }
                    i18 = i19;
                }
            }
        }
        this.f344469e = i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageScanButtonStatusManager", "init minPriorityActionType: %d", java.lang.Integer.valueOf(i17));
    }

    public final boolean a(int i17) {
        oc5.e eVar = (oc5.e) this.f344466b.get(java.lang.Integer.valueOf(i17));
        boolean z17 = false;
        if (eVar == null) {
            return false;
        }
        oc5.f fVar = (oc5.f) eVar;
        int type = fVar.getType();
        oc5.m mVar = fVar.f344408a;
        boolean z18 = mVar.d(type, 2) == 1;
        mVar.e(fVar.getType());
        fVar.getType();
        if (z18) {
            java.util.Iterator it = mVar.f344465a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z17 = z18;
                    break;
                }
                int intValue = ((java.lang.Number) it.next()).intValue();
                oc5.e eVar2 = (oc5.e) mVar.f344466b.get(java.lang.Integer.valueOf(intValue));
                if (eVar2 != null && fVar.priority() < eVar2.priority()) {
                    z18 = z18 && !(mVar.d(intValue, 2) == 1);
                    if (!z18) {
                        break;
                    }
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageScanButtonStatusManager", "canShow type: %d, show: %b", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
        return z17;
    }

    public final void b(int i17) {
        wu5.c cVar = (wu5.c) this.f344468d.get(java.lang.Integer.valueOf(i17));
        if (cVar != null) {
            cVar.cancel(false);
        }
    }

    public final void c(int i17, yz5.p pVar) {
        java.util.HashMap hashMap = this.f344466b;
        oc5.e eVar = (oc5.e) hashMap.get(java.lang.Integer.valueOf(i17));
        if (eVar == null) {
            return;
        }
        java.util.Iterator it = this.f344465a.iterator();
        while (it.hasNext()) {
            oc5.e eVar2 = (oc5.e) hashMap.get(java.lang.Integer.valueOf(((java.lang.Number) it.next()).intValue()));
            if (eVar2 != null) {
                pVar.invoke(eVar, eVar2);
            }
        }
    }

    public final int d(int i17, int i18) {
        java.lang.Integer num = (java.lang.Integer) this.f344467c.get(java.lang.Integer.valueOf(i17));
        if (num == null) {
            return i18;
        }
        num.intValue();
        return num.intValue();
    }

    public final java.lang.Integer e(int i17) {
        return (java.lang.Integer) this.f344467c.get(java.lang.Integer.valueOf(i17));
    }

    public final boolean f(int i17) {
        oc5.e eVar = (oc5.e) this.f344466b.get(java.lang.Integer.valueOf(i17));
        if (eVar == null) {
            return false;
        }
        oc5.f fVar = (oc5.f) eVar;
        return fVar.f344409b && fVar.b();
    }

    public final void g(int i17, int i18) {
        if (((oc5.e) this.f344466b.get(java.lang.Integer.valueOf(i17))) == null) {
            return;
        }
        java.lang.Integer e17 = e(i17);
        java.util.HashMap hashMap = this.f344467c;
        if (e17 == null || e17.intValue() != 4) {
            hashMap.put(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            return;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.ImageScanButtonStatusManager", "updateStatus type: %d over time limit, status: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i18 == 1 || i18 == 3) {
            hashMap.put(java.lang.Integer.valueOf(i17), 7);
        }
    }
}
