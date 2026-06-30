package u1;

/* loaded from: classes14.dex */
public final class j1 implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final u1.w f423608d;

    /* renamed from: e, reason: collision with root package name */
    public final t1.d f423609e;

    /* renamed from: f, reason: collision with root package name */
    public u1.j1 f423610f;

    /* renamed from: g, reason: collision with root package name */
    public u1.j1 f423611g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f423612h;

    /* renamed from: i, reason: collision with root package name */
    public final o0.i f423613i;

    public j1(u1.w layoutNode, t1.d modifier) {
        kotlin.jvm.internal.o.g(layoutNode, "layoutNode");
        kotlin.jvm.internal.o.g(modifier, "modifier");
        this.f423608d = layoutNode;
        this.f423609e = modifier;
        this.f423613i = new o0.i(new u1.i1[16], 0);
    }

    public final void a() {
        this.f423612h = false;
        o0.i iVar = this.f423613i;
        int i17 = iVar.f341852f;
        if (i17 > 0) {
            java.lang.Object[] objArr = iVar.f341850d;
            int i18 = 0;
            do {
                u1.i1 i1Var = (u1.i1) objArr[i18];
                i1Var.f423603e.B(u1.i1.f423601h);
                i1Var.f423605g = false;
                i18++;
            } while (i18 < i17);
        }
        e(this.f423609e.getKey(), false);
    }

    public final t1.d d(t1.a local) {
        u1.j1 j1Var;
        t1.d d17;
        kotlin.jvm.internal.o.g(local, "local");
        t1.d dVar = this.f423609e;
        if (kotlin.jvm.internal.o.b(dVar.getKey(), local)) {
            return dVar;
        }
        u1.j1 j1Var2 = this.f423611g;
        if (j1Var2 != null && (d17 = j1Var2.d(local)) != null) {
            return d17;
        }
        u1.w p17 = this.f423608d.p();
        if (p17 == null || (j1Var = p17.Q) == null) {
            return null;
        }
        return j1Var.d(local);
    }

    public final void e(t1.a local, boolean z17) {
        jz5.f0 f0Var;
        o0.i r17;
        int i17;
        u1.r1 r1Var;
        if (z17 && kotlin.jvm.internal.o.b(this.f423609e.getKey(), local)) {
            return;
        }
        o0.i iVar = this.f423613i;
        int i18 = iVar.f341852f;
        int i19 = 0;
        if (i18 > 0) {
            java.lang.Object[] objArr = iVar.f341850d;
            int i27 = 0;
            do {
                u1.i1 i1Var = (u1.i1) objArr[i27];
                i1Var.getClass();
                kotlin.jvm.internal.o.g(local, "local");
                if (i1Var.f423604f.f(local) && (r1Var = i1Var.f423602d.f423608d.f423689m) != null) {
                    ((androidx.compose.ui.platform.AndroidComposeView) r1Var).r(i1Var);
                }
                i27++;
            } while (i27 < i18);
        }
        u1.j1 j1Var = this.f423610f;
        if (j1Var != null) {
            j1Var.e(local, true);
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var != null || (i17 = (r17 = this.f423608d.r()).f341852f) <= 0) {
            return;
        }
        java.lang.Object[] objArr2 = r17.f341850d;
        do {
            ((u1.w) objArr2[i19]).P.e(local, true);
            i19++;
        } while (i19 < i17);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        if (this.f423612h) {
            e(this.f423609e.getKey(), false);
        }
        return jz5.f0.f302826a;
    }
}
