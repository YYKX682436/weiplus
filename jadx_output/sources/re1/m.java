package re1;

/* loaded from: classes13.dex */
public class m implements re1.b {

    /* renamed from: a, reason: collision with root package name */
    public long f394348a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.vfs.r6 f394349b;

    /* renamed from: c, reason: collision with root package name */
    public final re1.g f394350c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f394351d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f394352e = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f394353f = new java.util.HashMap();

    public m(com.tencent.mm.vfs.r6 r6Var, re1.g gVar) {
        this.f394349b = r6Var;
        this.f394350c = gVar;
        android.os.ConditionVariable conditionVariable = new android.os.ConditionVariable();
        new re1.l(this, conditionVariable).start();
        conditionVariable.block();
    }

    public static void a(re1.m mVar) {
        com.tencent.mm.vfs.r6 r6Var = mVar.f394349b;
        if (!r6Var.m()) {
            r6Var.J();
        }
        com.tencent.mm.vfs.r6[] G = r6Var.G();
        if (G == null) {
            return;
        }
        for (com.tencent.mm.vfs.r6 r6Var2 : G) {
            if (r6Var2.C() == 0) {
                r6Var2.l();
            } else {
                re1.i b17 = re1.i.b(r6Var2);
                if (b17 == null) {
                    r6Var2.l();
                } else if (!mVar.b(b17)) {
                    ve1.g.p(3, "SimpleCache", "remove duplicated span " + b17.f394341m, null);
                    mVar.f(b17);
                }
            }
        }
    }

    public final boolean b(re1.i iVar) {
        java.util.HashMap hashMap = this.f394352e;
        java.util.TreeSet treeSet = (java.util.TreeSet) hashMap.get(iVar.f394335d);
        java.lang.String str = iVar.f394335d;
        if (treeSet == null) {
            treeSet = new java.util.TreeSet();
            hashMap.put(str, treeSet);
        }
        boolean add = treeSet.add(iVar);
        long j17 = this.f394348a;
        long j18 = iVar.f394337f;
        this.f394348a = j17 + j18;
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f394353f.get(str);
        if (arrayList != null) {
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                re1.k kVar = (re1.k) ((re1.a) arrayList.get(size));
                kVar.f394344e.add(iVar);
                kVar.f394345f += j18;
                kVar.a(this, 0L);
            }
        }
        re1.k kVar2 = (re1.k) this.f394350c;
        kVar2.f394344e.add(iVar);
        kVar2.f394345f += j18;
        kVar2.a(this, 0L);
        return add;
    }

    public synchronized java.util.NavigableSet c(java.lang.String str) {
        java.util.TreeSet treeSet;
        treeSet = (java.util.TreeSet) this.f394352e.get(str);
        return treeSet == null ? null : new java.util.TreeSet((java.util.SortedSet) treeSet);
    }

    public final re1.i d(re1.i iVar) {
        java.lang.String str = iVar.f394335d;
        java.util.TreeSet treeSet = (java.util.TreeSet) this.f394352e.get(str);
        long j17 = iVar.f394336e;
        if (treeSet == null) {
            return new re1.i(str, j17, -1L, -1L, te1.b.f417768c, false, -1L, null);
        }
        re1.i iVar2 = (re1.i) treeSet.floor(iVar);
        if (iVar2 != null) {
            long j18 = iVar2.f394336e;
            if (j18 <= j17 && j17 < j18 + iVar2.f394337f) {
                if (iVar2.f394341m.m()) {
                    return iVar2;
                }
                g();
                return d(iVar);
            }
        }
        re1.i iVar3 = (re1.i) treeSet.ceiling(iVar);
        if (iVar3 == null) {
            return new re1.i(str, j17, -1L, -1L, te1.b.f417768c, false, -1L, null);
        }
        long j19 = iVar.f394336e;
        return new re1.i(str, j19, iVar3.f394336e - j19, -1L, te1.b.f417768c, false, -1L, null);
    }

    public final void e(re1.i iVar) {
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f394353f.get(iVar.f394335d);
        long j17 = iVar.f394337f;
        if (arrayList != null) {
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                re1.k kVar = (re1.k) ((re1.a) arrayList.get(size));
                kVar.f394344e.remove(iVar);
                kVar.f394345f -= j17;
            }
        }
        re1.k kVar2 = (re1.k) this.f394350c;
        kVar2.f394344e.remove(iVar);
        kVar2.f394345f -= j17;
    }

    public synchronized void f(re1.i iVar) {
        java.util.TreeSet treeSet = (java.util.TreeSet) this.f394352e.get(iVar.f394335d);
        this.f394348a -= iVar.f394337f;
        iVar.f394341m.l();
        if (treeSet == null || treeSet.isEmpty()) {
            this.f394352e.remove(iVar.f394335d);
        }
        e(iVar);
    }

    public final void g() {
        java.util.Iterator it = this.f394352e.entrySet().iterator();
        while (it.hasNext()) {
            java.util.Iterator it6 = ((java.util.TreeSet) ((java.util.Map.Entry) it.next()).getValue()).iterator();
            boolean z17 = true;
            while (it6.hasNext()) {
                re1.i iVar = (re1.i) it6.next();
                if (iVar.f394341m.m()) {
                    z17 = false;
                } else {
                    it6.remove();
                    if (iVar.f394340i) {
                        this.f394348a -= iVar.f394337f;
                    }
                    e(iVar);
                }
            }
            if (z17) {
                it.remove();
            }
        }
    }
}
