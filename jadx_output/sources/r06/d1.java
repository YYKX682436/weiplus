package r06;

/* loaded from: classes16.dex */
public abstract class d1 extends r06.w implements o06.n1 {

    /* renamed from: h, reason: collision with root package name */
    public boolean f368382h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f368383i;

    /* renamed from: m, reason: collision with root package name */
    public final o06.t0 f368384m;

    /* renamed from: n, reason: collision with root package name */
    public final o06.o1 f368385n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f368386o;

    /* renamed from: p, reason: collision with root package name */
    public final o06.c f368387p;

    /* renamed from: q, reason: collision with root package name */
    public o06.g0 f368388q;

    /* renamed from: r, reason: collision with root package name */
    public o06.n0 f368389r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(o06.t0 t0Var, o06.g0 g0Var, o06.o1 o1Var, p06.k kVar, n16.g gVar, boolean z17, boolean z18, boolean z19, o06.c cVar, o06.x1 x1Var) {
        super(o1Var.e(), kVar, gVar, x1Var);
        if (t0Var == null) {
            G(0);
            throw null;
        }
        if (g0Var == null) {
            G(1);
            throw null;
        }
        if (o1Var == null) {
            G(2);
            throw null;
        }
        if (kVar == null) {
            G(3);
            throw null;
        }
        if (gVar == null) {
            G(4);
            throw null;
        }
        if (x1Var == null) {
            G(5);
            throw null;
        }
        this.f368389r = null;
        this.f368384m = t0Var;
        this.f368388q = g0Var;
        this.f368385n = o1Var;
        this.f368382h = z17;
        this.f368383i = z18;
        this.f368386o = z19;
        this.f368387p = cVar;
    }

    public static /* synthetic */ void G(int i17) {
        java.lang.String str;
        int i18;
        switch (i17) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 7:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i17) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                i18 = 2;
                break;
            case 7:
            default:
                i18 = 3;
                break;
        }
        java.lang.Object[] objArr = new java.lang.Object[i18];
        switch (i17) {
            case 1:
                objArr[0] = "visibility";
                break;
            case 2:
                objArr[0] = "correspondingProperty";
                break;
            case 3:
                objArr[0] = "annotations";
                break;
            case 4:
                objArr[0] = com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME;
                break;
            case 5:
                objArr[0] = ya.b.SOURCE;
                break;
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 7:
                objArr[0] = "substitutor";
                break;
            case 16:
                objArr[0] = "overriddenDescriptors";
                break;
            default:
                objArr[0] = "modality";
                break;
        }
        switch (i17) {
            case 6:
                objArr[1] = "getKind";
                break;
            case 7:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 8:
                objArr[1] = "substitute";
                break;
            case 9:
                objArr[1] = "getTypeParameters";
                break;
            case 10:
                objArr[1] = "getModality";
                break;
            case 11:
                objArr[1] = "getVisibility";
                break;
            case 12:
                objArr[1] = "getCorrespondingVariable";
                break;
            case 13:
                objArr[1] = "getCorrespondingProperty";
                break;
            case 14:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 15:
                objArr[1] = "getOverriddenDescriptors";
                break;
        }
        switch (i17) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                break;
            case 7:
                objArr[2] = "substitute";
                break;
            case 16:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        java.lang.String format = java.lang.String.format(str, objArr);
        switch (i17) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                throw new java.lang.IllegalStateException(format);
            case 7:
            default:
                throw new java.lang.IllegalArgumentException(format);
        }
    }

    @Override // o06.b
    public java.lang.Object B(o06.a aVar) {
        return null;
    }

    @Override // o06.d
    public o06.d H(o06.m mVar, o06.t0 t0Var, o06.g0 g0Var, o06.c cVar, boolean z17) {
        throw new java.lang.UnsupportedOperationException("Accessors must be copied by the corresponding property");
    }

    @Override // o06.d
    public void M(java.util.Collection collection) {
        if (collection != null) {
            return;
        }
        G(16);
        throw null;
    }

    @Override // o06.n0
    public boolean N() {
        return false;
    }

    @Override // o06.b
    public o06.r1 Z() {
        return s0().Z();
    }

    @Override // o06.b
    public o06.r1 c0() {
        return s0().c0();
    }

    @Override // o06.n0, o06.a2
    public o06.n0 d(f26.v2 v2Var) {
        if (v2Var != null) {
            return this;
        }
        G(7);
        throw null;
    }

    @Override // o06.r0
    public boolean e0() {
        return false;
    }

    @Override // o06.r0
    public o06.t0 f() {
        o06.t0 t0Var = this.f368384m;
        if (t0Var != null) {
            return t0Var;
        }
        G(10);
        throw null;
    }

    @Override // o06.b
    public java.util.List getTypeParameters() {
        java.util.List emptyList = java.util.Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        G(9);
        throw null;
    }

    @Override // o06.q, o06.r0
    public o06.g0 getVisibility() {
        o06.g0 g0Var = this.f368388q;
        if (g0Var != null) {
            return g0Var;
        }
        G(11);
        throw null;
    }

    @Override // o06.b
    public boolean i0() {
        return false;
    }

    @Override // o06.r0
    public boolean isExternal() {
        return this.f368383i;
    }

    @Override // o06.n0
    public boolean isInfix() {
        return false;
    }

    @Override // o06.n0
    public boolean isInline() {
        return this.f368386o;
    }

    @Override // o06.n0
    public boolean isOperator() {
        return false;
    }

    @Override // o06.n0
    public boolean isSuspend() {
        return false;
    }

    @Override // o06.d
    public o06.c j() {
        o06.c cVar = this.f368387p;
        if (cVar != null) {
            return cVar;
        }
        G(6);
        throw null;
    }

    @Override // o06.r0
    public boolean l0() {
        return false;
    }

    @Override // o06.n0
    public o06.n0 o0() {
        return this.f368389r;
    }

    @Override // o06.b
    public java.util.List p0() {
        java.util.List p07 = s0().p0();
        if (p07 != null) {
            return p07;
        }
        G(14);
        throw null;
    }

    @Override // o06.n0
    public boolean r() {
        return false;
    }

    @Override // o06.n0
    public boolean r0() {
        return false;
    }

    public o06.o1 s0() {
        o06.o1 o1Var = this.f368385n;
        if (o1Var != null) {
            return o1Var;
        }
        G(13);
        throw null;
    }

    public java.util.Collection u0(boolean z17) {
        java.util.ArrayList arrayList = new java.util.ArrayList(0);
        for (o06.o1 o1Var : s0().i()) {
            o06.p c17 = z17 ? o1Var.c() : o1Var.b();
            if (c17 != null) {
                arrayList.add(c17);
            }
        }
        return arrayList;
    }

    @Override // o06.a2
    public /* bridge */ /* synthetic */ o06.n d(f26.v2 v2Var) {
        d(v2Var);
        return this;
    }
}
