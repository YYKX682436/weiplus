package r06;

/* loaded from: classes16.dex */
public class y0 extends r06.s {

    /* renamed from: n, reason: collision with root package name */
    public final o06.h f368557n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f368558o;

    /* renamed from: p, reason: collision with root package name */
    public o06.t0 f368559p;

    /* renamed from: q, reason: collision with root package name */
    public o06.g0 f368560q;

    /* renamed from: r, reason: collision with root package name */
    public f26.c2 f368561r;

    /* renamed from: s, reason: collision with root package name */
    public java.util.List f368562s;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.Collection f368563t;

    /* renamed from: u, reason: collision with root package name */
    public final e26.c0 f368564u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(o06.m mVar, o06.h hVar, boolean z17, boolean z18, n16.g gVar, o06.x1 x1Var, e26.c0 c0Var) {
        super(c0Var, mVar, gVar, x1Var, z18);
        if (mVar == null) {
            j0(0);
            throw null;
        }
        if (hVar == null) {
            j0(1);
            throw null;
        }
        if (gVar == null) {
            j0(2);
            throw null;
        }
        if (x1Var == null) {
            j0(3);
            throw null;
        }
        if (c0Var == null) {
            j0(4);
            throw null;
        }
        this.f368563t = new java.util.ArrayList();
        this.f368564u = c0Var;
        this.f368557n = hVar;
        this.f368558o = z17;
    }

    public static /* synthetic */ void j0(int i17) {
        java.lang.String str;
        int i18;
        switch (i17) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i17) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                i18 = 2;
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                i18 = 3;
                break;
        }
        java.lang.Object[] objArr = new java.lang.Object[i18];
        switch (i17) {
            case 1:
                objArr[0] = "kind";
                break;
            case 2:
                objArr[0] = com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME;
                break;
            case 3:
                objArr[0] = ya.b.SOURCE;
                break;
            case 4:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 6:
                objArr[0] = "modality";
                break;
            case 9:
                objArr[0] = "visibility";
                break;
            case 12:
                objArr[0] = "supertype";
                break;
            case 14:
                objArr[0] = "typeParameters";
                break;
            case 16:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i17) {
            case 5:
                objArr[1] = "getAnnotations";
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 7:
                objArr[1] = "getModality";
                break;
            case 8:
                objArr[1] = "getKind";
                break;
            case 10:
                objArr[1] = "getVisibility";
                break;
            case 11:
                objArr[1] = "getTypeConstructor";
                break;
            case 13:
                objArr[1] = "getConstructors";
                break;
            case 15:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 17:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 18:
                objArr[1] = "getStaticScope";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
        }
        switch (i17) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                break;
            case 6:
                objArr[2] = "setModality";
                break;
            case 9:
                objArr[2] = "setVisibility";
                break;
            case 12:
                objArr[2] = "addSupertype";
                break;
            case 14:
                objArr[2] = "setTypeParameterDescriptors";
                break;
            case 16:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        java.lang.String format = java.lang.String.format(str, objArr);
        switch (i17) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                throw new java.lang.IllegalStateException(format);
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                throw new java.lang.IllegalArgumentException(format);
        }
    }

    @Override // r06.s0
    public y16.s P(g26.l lVar) {
        if (lVar != null) {
            return y16.r.f458973b;
        }
        j0(16);
        throw null;
    }

    @Override // o06.g
    public java.util.Collection S() {
        java.util.Set emptySet = java.util.Collections.emptySet();
        if (emptySet != null) {
            return emptySet;
        }
        j0(13);
        throw null;
    }

    @Override // o06.g
    public java.util.Collection T() {
        java.util.List emptyList = java.util.Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        j0(19);
        throw null;
    }

    @Override // o06.g
    public o06.j2 d0() {
        return null;
    }

    @Override // o06.r0
    public boolean e0() {
        return false;
    }

    @Override // o06.g, o06.r0
    public o06.t0 f() {
        o06.t0 t0Var = this.f368559p;
        if (t0Var != null) {
            return t0Var;
        }
        j0(7);
        throw null;
    }

    @Override // o06.j
    public f26.c2 g() {
        f26.c2 c2Var = this.f368561r;
        if (c2Var != null) {
            return c2Var;
        }
        j0(11);
        throw null;
    }

    @Override // o06.g
    public boolean g0() {
        return false;
    }

    @Override // p06.a
    public p06.k getAnnotations() {
        int i17 = p06.k.Z0;
        return p06.i.f350765a;
    }

    @Override // o06.g, o06.q, o06.r0
    public o06.g0 getVisibility() {
        o06.g0 g0Var = this.f368560q;
        if (g0Var != null) {
            return g0Var;
        }
        j0(10);
        throw null;
    }

    @Override // o06.g
    public boolean h0() {
        return false;
    }

    @Override // o06.g
    public boolean isInline() {
        return false;
    }

    @Override // o06.g
    public o06.h j() {
        o06.h hVar = this.f368557n;
        if (hVar != null) {
            return hVar;
        }
        j0(8);
        throw null;
    }

    @Override // o06.g
    public boolean k0() {
        return false;
    }

    @Override // o06.r0
    public boolean l0() {
        return false;
    }

    @Override // o06.g, o06.k
    public java.util.List m() {
        java.util.List list = this.f368562s;
        if (list != null) {
            return list;
        }
        j0(15);
        throw null;
    }

    @Override // o06.g
    public y16.s m0() {
        return y16.r.f458973b;
    }

    @Override // o06.k
    public boolean p() {
        return this.f368558o;
    }

    @Override // o06.g
    public o06.f s() {
        return null;
    }

    @Override // o06.g
    public boolean t0() {
        return false;
    }

    public java.lang.String toString() {
        return r06.v.P(this);
    }
}
