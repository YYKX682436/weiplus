package s1;

/* loaded from: classes14.dex */
public final class l0 implements s1.l2 {

    /* renamed from: d, reason: collision with root package name */
    public p2.s f402031d = p2.s.Rtl;

    /* renamed from: e, reason: collision with root package name */
    public float f402032e;

    /* renamed from: f, reason: collision with root package name */
    public float f402033f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ s1.q0 f402034g;

    public l0(s1.q0 q0Var) {
        this.f402034g = q0Var;
    }

    @Override // p2.f
    public int G(float f17) {
        return p2.e.a(this, f17);
    }

    @Override // p2.f
    public float H(long j17) {
        return p2.e.d(this, j17);
    }

    @Override // p2.f
    public float R(float f17) {
        return f17 * getDensity();
    }

    @Override // s1.x0
    public s1.u0 W(int i17, int i18, java.util.Map alignmentLines, yz5.l placementBlock) {
        kotlin.jvm.internal.o.g(alignmentLines, "alignmentLines");
        kotlin.jvm.internal.o.g(placementBlock, "placementBlock");
        return s1.v0.a(this, i17, i18, alignmentLines, placementBlock);
    }

    public java.util.List b(java.lang.Object obj, yz5.p content) {
        kotlin.jvm.internal.o.g(content, "content");
        s1.q0 q0Var = this.f402034g;
        q0Var.getClass();
        q0Var.b();
        u1.w wVar = q0Var.f402061a;
        u1.c0 c0Var = wVar.f423691o;
        if (!(c0Var == u1.c0.Measuring || c0Var == u1.c0.LayingOut)) {
            throw new java.lang.IllegalStateException("subcompose can only be used inside the measure or layout blocks".toString());
        }
        java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) q0Var.f402066f;
        java.lang.Object obj2 = linkedHashMap.get(obj);
        if (obj2 == null) {
            obj2 = (u1.w) q0Var.f402068h.remove(obj);
            if (obj2 != null) {
                int i17 = q0Var.f402071k;
                if (!(i17 > 0)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                q0Var.f402071k = i17 - 1;
            } else {
                obj2 = q0Var.d(obj);
                if (obj2 == null) {
                    int i18 = q0Var.f402064d;
                    u1.w wVar2 = new u1.w(true);
                    wVar.f423693q = true;
                    wVar.t(i18, wVar2);
                    wVar.f423693q = false;
                    obj2 = wVar2;
                }
            }
            linkedHashMap.put(obj, obj2);
        }
        u1.w wVar3 = (u1.w) obj2;
        int indexOf = ((o0.f) wVar.o()).indexOf(wVar3);
        int i19 = q0Var.f402064d;
        if (indexOf < i19) {
            throw new java.lang.IllegalArgumentException("Key " + obj + " was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.");
        }
        if (i19 != indexOf) {
            wVar.f423693q = true;
            wVar.B(indexOf, i19, 1);
            wVar.f423693q = false;
        }
        q0Var.f402064d++;
        q0Var.c(wVar3, obj, content);
        return wVar3.n();
    }

    @Override // p2.f
    public long e(long j17) {
        return p2.e.c(this, j17);
    }

    @Override // p2.f
    public float getDensity() {
        return this.f402032e;
    }

    @Override // p2.f
    public float getFontScale() {
        return this.f402033f;
    }

    @Override // s1.u
    public p2.s getLayoutDirection() {
        return this.f402031d;
    }

    @Override // p2.f
    public float n(int i17) {
        return p2.e.b(this, i17);
    }

    @Override // p2.f
    public float o(float f17) {
        return f17 / getDensity();
    }

    @Override // p2.f
    public long t(long j17) {
        return p2.e.e(this, j17);
    }

    @Override // p2.f
    public long z(float f17) {
        return p2.e.f(this, f17);
    }
}
