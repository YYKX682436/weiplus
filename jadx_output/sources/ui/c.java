package ui;

/* loaded from: classes16.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final ti.u0 f428017a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Queue f428018b = new java.util.LinkedList();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Queue f428019c = new java.util.LinkedList();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Set f428020d = new java.util.HashSet();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Set f428021e = new java.util.HashSet();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Set f428022f = new java.util.HashSet();

    /* renamed from: g, reason: collision with root package name */
    public boolean f428023g;

    public c(ti.u0 u0Var) {
        this.f428017a = u0Var;
    }

    public final void a(ti.v0 v0Var, ti.z0 z0Var, dc.j jVar, java.lang.String str, ti.b1 b1Var) {
        boolean contains;
        if (jVar == null) {
            return;
        }
        java.util.Set set = dc.g.f228616a;
        boolean z17 = false;
        if (jVar instanceof dc.a) {
            dc.a aVar = (dc.a) jVar;
            contains = aVar.f228599h != dc.q.OBJECT ? true : ((java.util.HashSet) dc.g.f228616a).contains(aVar.i().f228606h);
        } else {
            contains = false;
        }
        if (contains) {
            return;
        }
        if (!(jVar instanceof dc.c) ? false : ((java.util.HashSet) dc.g.f228616a).contains(((dc.c) jVar).i().f228606h)) {
            return;
        }
        java.util.HashSet hashSet = (java.util.HashSet) this.f428020d;
        if (hashSet.contains(jVar)) {
            return;
        }
        boolean z18 = v0Var == null;
        java.util.Set set2 = this.f428021e;
        if (z18 || !((java.util.HashSet) set2).contains(jVar)) {
            if (this.f428023g) {
                if (jVar.i() != null && jVar.i().f228606h.equals(java.lang.String.class.getName())) {
                    z17 = true;
                }
                if (z17) {
                    return;
                }
            }
            if (((java.util.HashSet) this.f428022f).contains(jVar)) {
                return;
            }
            ti.z0 z0Var2 = new ti.z0(v0Var, jVar, z0Var, str, b1Var);
            if (z18) {
                hashSet.add(jVar);
                ((java.util.LinkedList) this.f428018b).add(z0Var2);
            } else {
                ((java.util.HashSet) set2).add(jVar);
                ((java.util.LinkedList) this.f428019c).add(z0Var2);
            }
        }
    }
}
