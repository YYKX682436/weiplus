package r06;

/* loaded from: classes16.dex */
public class e1 {

    /* renamed from: a, reason: collision with root package name */
    public o06.m f368398a;

    /* renamed from: b, reason: collision with root package name */
    public o06.t0 f368399b;

    /* renamed from: c, reason: collision with root package name */
    public o06.g0 f368400c;

    /* renamed from: e, reason: collision with root package name */
    public o06.c f368402e;

    /* renamed from: h, reason: collision with root package name */
    public final o06.r1 f368405h;

    /* renamed from: i, reason: collision with root package name */
    public final n16.g f368406i;

    /* renamed from: j, reason: collision with root package name */
    public final f26.o0 f368407j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ r06.f1 f368408k;

    /* renamed from: d, reason: collision with root package name */
    public o06.o1 f368401d = null;

    /* renamed from: f, reason: collision with root package name */
    public f26.q2 f368403f = f26.q2.f259212a;

    /* renamed from: g, reason: collision with root package name */
    public boolean f368404g = true;

    public e1(r06.f1 f1Var) {
        this.f368408k = f1Var;
        this.f368398a = f1Var.e();
        this.f368399b = f1Var.f();
        this.f368400c = f1Var.getVisibility();
        this.f368402e = f1Var.j();
        this.f368405h = f1Var.A;
        this.f368406i = f1Var.getName();
        this.f368407j = f1Var.getType();
    }

    public static /* synthetic */ void a(int i17) {
        java.lang.String str = (i17 == 1 || i17 == 2 || i17 == 3 || i17 == 5 || i17 == 7 || i17 == 9 || i17 == 11 || i17 == 19 || i17 == 13 || i17 == 14 || i17 == 16 || i17 == 17) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i17 == 1 || i17 == 2 || i17 == 3 || i17 == 5 || i17 == 7 || i17 == 9 || i17 == 11 || i17 == 19 || i17 == 13 || i17 == 14 || i17 == 16 || i17 == 17) ? 2 : 3];
        switch (i17) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 7:
            case 9:
            case 11:
            case 13:
            case 14:
            case 16:
            case 17:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
                break;
            case 4:
                objArr[0] = "type";
                break;
            case 6:
                objArr[0] = "modality";
                break;
            case 8:
                objArr[0] = "visibility";
                break;
            case 10:
                objArr[0] = "kind";
                break;
            case 12:
                objArr[0] = "typeParameters";
                break;
            case 15:
                objArr[0] = "substitution";
                break;
            case 18:
                objArr[0] = com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME;
                break;
            default:
                objArr[0] = "owner";
                break;
        }
        if (i17 == 1) {
            objArr[1] = "setOwner";
        } else if (i17 == 2) {
            objArr[1] = "setOriginal";
        } else if (i17 == 3) {
            objArr[1] = "setPreserveSourceElement";
        } else if (i17 == 5) {
            objArr[1] = "setReturnType";
        } else if (i17 == 7) {
            objArr[1] = "setModality";
        } else if (i17 == 9) {
            objArr[1] = "setVisibility";
        } else if (i17 == 11) {
            objArr[1] = "setKind";
        } else if (i17 == 19) {
            objArr[1] = "setName";
        } else if (i17 == 13) {
            objArr[1] = "setTypeParameters";
        } else if (i17 == 14) {
            objArr[1] = "setDispatchReceiverParameter";
        } else if (i17 == 16) {
            objArr[1] = "setSubstitution";
        } else if (i17 != 17) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
        } else {
            objArr[1] = "setCopyOverrides";
        }
        switch (i17) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 7:
            case 9:
            case 11:
            case 13:
            case 14:
            case 16:
            case 17:
            case 19:
                break;
            case 4:
                objArr[2] = "setReturnType";
                break;
            case 6:
                objArr[2] = "setModality";
                break;
            case 8:
                objArr[2] = "setVisibility";
                break;
            case 10:
                objArr[2] = "setKind";
                break;
            case 12:
                objArr[2] = "setTypeParameters";
                break;
            case 15:
                objArr[2] = "setSubstitution";
                break;
            case 18:
                objArr[2] = "setName";
                break;
            default:
                objArr[2] = "setOwner";
                break;
        }
        java.lang.String format = java.lang.String.format(str, objArr);
        if (i17 != 1 && i17 != 2 && i17 != 3 && i17 != 5 && i17 != 7 && i17 != 9 && i17 != 11 && i17 != 19 && i17 != 13 && i17 != 14 && i17 != 16 && i17 != 17) {
            throw new java.lang.IllegalArgumentException(format);
        }
        throw new java.lang.IllegalStateException(format);
    }

    public o06.o1 b() {
        o06.r1 r1Var;
        r06.i1 i1Var;
        r06.g1 g1Var;
        r06.h1 h1Var;
        yz5.a aVar;
        r06.f1 f1Var = this.f368408k;
        f1Var.getClass();
        o06.m mVar = this.f368398a;
        o06.t0 t0Var = this.f368399b;
        o06.g0 g0Var = this.f368400c;
        o06.o1 o1Var = this.f368401d;
        o06.c cVar = this.f368402e;
        n16.g gVar = this.f368406i;
        o06.x1 x1Var = o06.x1.f342004a;
        r06.f1 w07 = f1Var.w0(mVar, t0Var, g0Var, o1Var, cVar, gVar, x1Var);
        java.util.List typeParameters = f1Var.getTypeParameters();
        java.util.ArrayList arrayList = new java.util.ArrayList(typeParameters.size());
        f26.v2 b17 = f26.z.b(typeParameters, this.f368403f, w07, arrayList);
        f26.d3 d3Var = f26.d3.f259145h;
        f26.o0 o0Var = this.f368407j;
        f26.o0 k17 = b17.k(o0Var, d3Var);
        if (k17 != null) {
            f26.d3 d3Var2 = f26.d3.f259144g;
            f26.o0 k18 = b17.k(o0Var, d3Var2);
            if (k18 != null) {
                w07.z0(k18);
            }
            o06.r1 r1Var2 = this.f368405h;
            if (r1Var2 != null) {
                o06.r1 d17 = ((r06.g) r1Var2).d(b17);
                r1Var = d17 != null ? d17 : null;
            }
            o06.r1 r1Var3 = f1Var.B;
            if (r1Var3 != null) {
                r06.g gVar2 = (r06.g) r1Var3;
                f26.o0 k19 = b17.k(gVar2.getType(), d3Var2);
                i1Var = k19 == null ? null : new r06.i1(w07, new z16.d(w07, k19, gVar2.getValue()), gVar2.getAnnotations());
            } else {
                i1Var = null;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it = f1Var.f368420z.iterator();
            while (it.hasNext()) {
                r06.g gVar3 = (r06.g) ((o06.r1) it.next());
                f26.o0 k27 = b17.k(gVar3.getType(), f26.d3.f259144g);
                r06.i1 i1Var2 = k27 == null ? null : new r06.i1(w07, new z16.c(w07, k27, ((z16.f) gVar3.getValue()).a(), gVar3.getValue()), gVar3.getAnnotations());
                if (i1Var2 != null) {
                    arrayList2.add(i1Var2);
                }
            }
            w07.A0(k17, arrayList, r1Var, i1Var, arrayList2);
            r06.g1 g1Var2 = f1Var.D;
            o06.c cVar2 = o06.c.FAKE_OVERRIDE;
            if (g1Var2 == null) {
                g1Var = null;
            } else {
                p06.k annotations = g1Var2.getAnnotations();
                o06.t0 t0Var2 = this.f368399b;
                o06.g0 visibility = f1Var.D.getVisibility();
                if (this.f368402e == cVar2 && o06.f0.e(o06.f0.g(((o06.r) visibility).f341981a.c()))) {
                    visibility = o06.f0.f341948h;
                }
                o06.g0 g0Var2 = visibility;
                r06.g1 g1Var3 = f1Var.D;
                boolean z17 = g1Var3.f368382h;
                boolean z18 = g1Var3.f368383i;
                boolean z19 = g1Var3.f368386o;
                o06.c cVar3 = this.f368402e;
                o06.o1 o1Var2 = this.f368401d;
                g1Var = new r06.g1(w07, annotations, t0Var2, g0Var2, z17, z18, z19, cVar3, o1Var2 == null ? null : o1Var2.c(), x1Var);
            }
            if (g1Var != null) {
                r06.g1 g1Var4 = f1Var.D;
                f26.o0 o0Var2 = g1Var4.f368423s;
                g1Var.f368389r = r06.f1.x0(b17, g1Var4);
                g1Var.w0(o0Var2 != null ? b17.k(o0Var2, f26.d3.f259145h) : null);
            }
            p06.a aVar2 = f1Var.E;
            if (aVar2 == null) {
                h1Var = null;
            } else {
                p06.k annotations2 = ((p06.b) aVar2).getAnnotations();
                o06.t0 t0Var3 = this.f368399b;
                o06.g0 visibility2 = ((r06.d1) f1Var.E).getVisibility();
                if (this.f368402e == cVar2 && o06.f0.e(o06.f0.g(((o06.r) visibility2).f341981a.c()))) {
                    visibility2 = o06.f0.f341948h;
                }
                o06.g0 g0Var3 = visibility2;
                r06.d1 d1Var = (r06.d1) f1Var.E;
                boolean z27 = d1Var.f368382h;
                boolean z28 = d1Var.f368383i;
                boolean z29 = d1Var.f368386o;
                o06.c cVar4 = this.f368402e;
                o06.o1 o1Var3 = this.f368401d;
                h1Var = new r06.h1(w07, annotations2, t0Var3, g0Var3, z27, z28, z29, cVar4, o1Var3 == null ? null : o1Var3.b(), x1Var);
            }
            if (h1Var != null) {
                java.util.List w08 = r06.j0.w0(h1Var, ((r06.h1) f1Var.E).W(), b17, false, false, null);
                if (w08 == null) {
                    w08 = java.util.Collections.singletonList(r06.h1.v0(h1Var, v16.f.e(this.f368398a).o(), ((p06.b) ((o06.l2) ((r06.h1) f1Var.E).W().get(0))).getAnnotations()));
                }
                if (w08.size() != 1) {
                    throw new java.lang.IllegalStateException();
                }
                h1Var.f368389r = r06.f1.x0(b17, f1Var.E);
                o06.l2 l2Var = (o06.l2) w08.get(0);
                if (l2Var == null) {
                    r06.h1.G(6);
                    throw null;
                }
                h1Var.f368427s = l2Var;
            }
            p06.a aVar3 = f1Var.F;
            r06.f0 f0Var = aVar3 == null ? null : new r06.f0(((p06.b) aVar3).getAnnotations(), w07);
            p06.a aVar4 = f1Var.G;
            w07.y0(g1Var, h1Var, f0Var, aVar4 != null ? new r06.f0(((p06.b) aVar4).getAnnotations(), w07) : null);
            if (this.f368404g) {
                o26.u a17 = o26.u.f342614f.a();
                java.util.Iterator it6 = f1Var.i().iterator();
                while (it6.hasNext()) {
                    a17.add(((o06.o1) it6.next()).d(b17));
                }
                w07.M(a17);
            }
            if (!f1Var.C() || (aVar = f1Var.f368542n) == null) {
                return w07;
            }
            w07.s0(f1Var.f368541m, aVar);
            return w07;
        }
        return null;
    }
}
