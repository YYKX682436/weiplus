package z06;

/* loaded from: classes16.dex */
public class i extends r06.f1 implements z06.a {
    public final boolean H;
    public final jz5.l I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(o06.m mVar, p06.k kVar, o06.t0 t0Var, o06.g0 g0Var, boolean z17, n16.g gVar, o06.x1 x1Var, o06.o1 o1Var, o06.c cVar, boolean z18, jz5.l lVar) {
        super(mVar, o1Var, kVar, t0Var, g0Var, z17, gVar, cVar, x1Var, false, false, false, false, false, false);
        if (mVar == null) {
            G(0);
            throw null;
        }
        if (kVar == null) {
            G(1);
            throw null;
        }
        if (t0Var == null) {
            G(2);
            throw null;
        }
        if (g0Var == null) {
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
        if (cVar == null) {
            G(6);
            throw null;
        }
        this.H = z18;
        this.I = lVar;
    }

    public static z06.i B0(o06.m mVar, p06.k kVar, o06.t0 t0Var, o06.g0 g0Var, boolean z17, n16.g gVar, o06.x1 x1Var, boolean z18) {
        if (mVar == null) {
            G(7);
            throw null;
        }
        if (kVar == null) {
            G(8);
            throw null;
        }
        if (t0Var == null) {
            G(9);
            throw null;
        }
        if (g0Var == null) {
            G(10);
            throw null;
        }
        if (gVar == null) {
            G(11);
            throw null;
        }
        if (x1Var != null) {
            return new z06.i(mVar, kVar, t0Var, g0Var, z17, gVar, x1Var, null, o06.c.DECLARATION, z18, null);
        }
        G(12);
        throw null;
    }

    public static /* synthetic */ void G(int i17) {
        java.lang.String str = i17 != 21 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        java.lang.Object[] objArr = new java.lang.Object[i17 != 21 ? 3 : 2];
        switch (i17) {
            case 1:
            case 8:
                objArr[0] = "annotations";
                break;
            case 2:
            case 9:
                objArr[0] = "modality";
                break;
            case 3:
            case 10:
                objArr[0] = "visibility";
                break;
            case 4:
            case 11:
                objArr[0] = com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME;
                break;
            case 5:
            case 12:
            case 18:
                objArr[0] = ya.b.SOURCE;
                break;
            case 6:
            case 16:
                objArr[0] = "kind";
                break;
            case 7:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 13:
                objArr[0] = "newOwner";
                break;
            case 14:
                objArr[0] = "newModality";
                break;
            case 15:
                objArr[0] = "newVisibility";
                break;
            case 17:
                objArr[0] = "newName";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
                break;
            case 22:
                objArr[0] = "inType";
                break;
        }
        if (i17 != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i17) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "create";
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            case 21:
                break;
            case 22:
                objArr[2] = "setInType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        java.lang.String format = java.lang.String.format(str, objArr);
        if (i17 == 21) {
            throw new java.lang.IllegalStateException(format);
        }
    }

    @Override // r06.f1, o06.b
    public java.lang.Object B(o06.a aVar) {
        jz5.l lVar = this.I;
        if (lVar == null || !((o06.a) lVar.f302833d).equals(aVar)) {
            return null;
        }
        return lVar.f302834e;
    }

    @Override // r06.f1, o06.m2
    public boolean C() {
        f26.o0 type = getType();
        if (!this.H) {
            return false;
        }
        kotlin.jvm.internal.o.g(type, "type");
        if (!(((l06.o.H(type) || l06.b0.a(type)) && !f26.z2.f(type)) || l06.o.J(type))) {
            return false;
        }
        p06.k kVar = f16.g1.f258728a;
        g26.w wVar = g26.w.f268018a;
        n16.c ENHANCED_NULLABILITY_ANNOTATION = x06.p0.f451299p;
        kotlin.jvm.internal.o.f(ENHANCED_NULLABILITY_ANNOTATION, "ENHANCED_NULLABILITY_ANNOTATION");
        return !wVar.t0(type, ENHANCED_NULLABILITY_ANNOTATION) || l06.o.J(type);
    }

    @Override // z06.a
    public z06.a L(f26.o0 o0Var, java.util.List list, f26.o0 o0Var2, jz5.l lVar) {
        r06.g1 g1Var;
        r06.h1 h1Var;
        if (list == null) {
            G(19);
            throw null;
        }
        if (o0Var2 == null) {
            G(20);
            throw null;
        }
        o06.o1 a17 = a() == this ? null : a();
        z06.i iVar = new z06.i(e(), getAnnotations(), f(), getVisibility(), this.f368540i, getName(), getSource(), a17, j(), this.H, lVar);
        r06.g1 g1Var2 = this.D;
        if (g1Var2 != null) {
            g1Var = r14;
            r06.g1 g1Var3 = new r06.g1(iVar, g1Var2.getAnnotations(), g1Var2.f(), g1Var2.getVisibility(), g1Var2.f368382h, g1Var2.f368383i, g1Var2.f368386o, j(), a17 == null ? null : a17.c(), g1Var2.getSource());
            g1Var.f368389r = g1Var2.f368389r;
            g1Var.w0(o0Var2);
        } else {
            g1Var = null;
        }
        p06.a aVar = this.E;
        if (aVar != null) {
            r06.d1 d1Var = (r06.d1) aVar;
            r06.h1 h1Var2 = new r06.h1(iVar, ((p06.b) aVar).getAnnotations(), d1Var.f(), d1Var.getVisibility(), d1Var.f368382h, d1Var.f368383i, d1Var.f368386o, j(), a17 == null ? null : a17.b(), ((r06.w) aVar).getSource());
            h1Var2.f368389r = h1Var2.f368389r;
            o06.l2 l2Var = (o06.l2) ((r06.h1) aVar).W().get(0);
            if (l2Var == null) {
                r06.h1.G(6);
                throw null;
            }
            h1Var2.f368427s = l2Var;
            h1Var = h1Var2;
        } else {
            h1Var = null;
        }
        iVar.y0(g1Var, h1Var, this.F, this.G);
        yz5.a aVar2 = this.f368542n;
        if (aVar2 != null) {
            iVar.s0(this.f368541m, aVar2);
        }
        iVar.M(i());
        iVar.A0(o0Var2, getTypeParameters(), this.A, o0Var == null ? null : r16.h.h(this, o0Var, p06.i.f350765a), kz5.p0.f313996d);
        return iVar;
    }

    @Override // r06.t1, o06.b
    public boolean i0() {
        return false;
    }

    @Override // r06.f1
    public r06.f1 w0(o06.m mVar, o06.t0 t0Var, o06.g0 g0Var, o06.o1 o1Var, o06.c cVar, n16.g gVar, o06.x1 x1Var) {
        if (mVar == null) {
            G(13);
            throw null;
        }
        if (t0Var == null) {
            G(14);
            throw null;
        }
        if (g0Var == null) {
            G(15);
            throw null;
        }
        if (cVar == null) {
            G(16);
            throw null;
        }
        if (gVar == null) {
            G(17);
            throw null;
        }
        if (x1Var != null) {
            return new z06.i(mVar, getAnnotations(), t0Var, g0Var, this.f368540i, gVar, x1Var, o1Var, cVar, this.H, this.I);
        }
        G(18);
        throw null;
    }

    @Override // r06.f1
    public void z0(f26.o0 o0Var) {
        if (o0Var != null) {
            return;
        }
        G(22);
        throw null;
    }
}
