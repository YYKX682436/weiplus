package s1;

/* loaded from: classes14.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    public final u1.w f402061a;

    /* renamed from: b, reason: collision with root package name */
    public n0.g1 f402062b;

    /* renamed from: c, reason: collision with root package name */
    public s1.n2 f402063c;

    /* renamed from: d, reason: collision with root package name */
    public int f402064d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f402065e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f402066f;

    /* renamed from: g, reason: collision with root package name */
    public final s1.l0 f402067g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.Map f402068h;

    /* renamed from: i, reason: collision with root package name */
    public final s1.m2 f402069i;

    /* renamed from: j, reason: collision with root package name */
    public int f402070j;

    /* renamed from: k, reason: collision with root package name */
    public int f402071k;

    /* renamed from: l, reason: collision with root package name */
    public final java.lang.String f402072l;

    public q0(u1.w root, s1.n2 slotReusePolicy) {
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(slotReusePolicy, "slotReusePolicy");
        this.f402061a = root;
        this.f402063c = slotReusePolicy;
        this.f402065e = new java.util.LinkedHashMap();
        this.f402066f = new java.util.LinkedHashMap();
        this.f402067g = new s1.l0(this);
        this.f402068h = new java.util.LinkedHashMap();
        this.f402069i = new s1.m2(null, 1, null);
        this.f402072l = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing,, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";
    }

    public final void a(int i17) {
        this.f402070j = 0;
        u1.w wVar = this.f402061a;
        int i18 = (((o0.f) wVar.o()).f341844d.f341852f - this.f402071k) - 1;
        if (i17 <= i18) {
            s1.m2 m2Var = this.f402069i;
            m2Var.clear();
            java.util.Map map = this.f402065e;
            if (i17 <= i18) {
                int i19 = i17;
                while (true) {
                    java.lang.Object obj = ((java.util.LinkedHashMap) map).get((u1.w) ((o0.f) wVar.o()).get(i19));
                    kotlin.jvm.internal.o.d(obj);
                    m2Var.f402038d.add(((s1.k0) obj).f402019a);
                    if (i19 == i18) {
                        break;
                    } else {
                        i19++;
                    }
                }
            }
            this.f402063c.a(m2Var);
            while (i18 >= i17) {
                u1.w wVar2 = (u1.w) ((o0.f) wVar.o()).get(i18);
                java.lang.Object obj2 = ((java.util.LinkedHashMap) map).get(wVar2);
                kotlin.jvm.internal.o.d(obj2);
                s1.k0 k0Var = (s1.k0) obj2;
                java.lang.Object obj3 = k0Var.f402019a;
                if (m2Var.contains(obj3)) {
                    u1.e0 e0Var = u1.e0.NotUsed;
                    wVar2.getClass();
                    wVar2.E = e0Var;
                    this.f402070j++;
                    ((n0.q4) k0Var.f402023e).setValue(java.lang.Boolean.FALSE);
                } else {
                    wVar.f423693q = true;
                    map.remove(wVar2);
                    n0.f1 f1Var = k0Var.f402021c;
                    if (f1Var != null) {
                        f1Var.dispose();
                    }
                    wVar.F(i18, 1);
                    wVar.f423693q = false;
                }
                this.f402066f.remove(obj3);
                i18--;
            }
        }
        b();
    }

    public final void b() {
        java.util.Map map = this.f402065e;
        int size = map.size();
        u1.w wVar = this.f402061a;
        if (!(size == wVar.o().size())) {
            throw new java.lang.IllegalArgumentException(("Inconsistency between the count of nodes tracked by the state (" + map.size() + ") and the children count on the SubcomposeLayout (" + wVar.o().size() + "). Are you trying to use the state of the disposed SubcomposeLayout?").toString());
        }
        if (!((wVar.o().size() - this.f402070j) - this.f402071k >= 0)) {
            throw new java.lang.IllegalArgumentException(("Incorrect state. Total children " + wVar.o().size() + ". Reusable children " + this.f402070j + ". Precomposed children " + this.f402071k).toString());
        }
        java.util.Map map2 = this.f402068h;
        if (map2.size() == this.f402071k) {
            return;
        }
        throw new java.lang.IllegalArgumentException(("Incorrect state. Precomposed children " + this.f402071k + ". Map size " + map2.size()).toString());
    }

    public final void c(u1.w container, java.lang.Object obj, yz5.p pVar) {
        java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) this.f402065e;
        java.lang.Object obj2 = linkedHashMap.get(container);
        if (obj2 == null) {
            yz5.p pVar2 = s1.j.f402016a;
            obj2 = new s1.k0(obj, s1.j.f402016a, null, 4, null);
            linkedHashMap.put(container, obj2);
        }
        s1.k0 k0Var = (s1.k0) obj2;
        n0.f1 f1Var = k0Var.f402021c;
        boolean c17 = f1Var != null ? f1Var.c() : true;
        if (k0Var.f402020b != pVar || c17 || k0Var.f402022d) {
            kotlin.jvm.internal.o.g(pVar, "<set-?>");
            k0Var.f402020b = pVar;
            x0.m g17 = x0.z.g((x0.m) x0.z.f450962a.a(), null);
            try {
                x0.m i17 = g17.i();
                try {
                    u1.w wVar = this.f402061a;
                    wVar.f423693q = true;
                    yz5.p pVar3 = k0Var.f402020b;
                    n0.f1 f1Var2 = k0Var.f402021c;
                    n0.g1 g1Var = this.f402062b;
                    if (g1Var == null) {
                        throw new java.lang.IllegalStateException("parent composition reference not set".toString());
                    }
                    u0.a c18 = u0.j.c(-34810602, true, new s1.p0(k0Var, pVar3));
                    if (f1Var2 == null || f1Var2.a()) {
                        android.view.ViewGroup.LayoutParams layoutParams = androidx.compose.ui.platform.s5.f10745a;
                        kotlin.jvm.internal.o.g(container, "container");
                        f1Var2 = n0.k1.a(new u1.c2(container), g1Var);
                    }
                    f1Var2.b(c18);
                    k0Var.f402021c = f1Var2;
                    wVar.f423693q = false;
                    g17.c();
                    k0Var.f402022d = false;
                } finally {
                    g17.o(i17);
                }
            } catch (java.lang.Throwable th6) {
                g17.c();
                throw th6;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c7, code lost:
    
        if ((!r2.isEmpty()) == true) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final u1.w d(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s1.q0.d(java.lang.Object):u1.w");
    }
}
