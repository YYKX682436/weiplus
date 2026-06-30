package r06;

/* loaded from: classes16.dex */
public class i0 implements o06.m0 {

    /* renamed from: a */
    public f26.q2 f368430a;

    /* renamed from: b */
    public o06.m f368431b;

    /* renamed from: c */
    public o06.t0 f368432c;

    /* renamed from: d */
    public o06.g0 f368433d;

    /* renamed from: e */
    public o06.n0 f368434e;

    /* renamed from: f */
    public o06.c f368435f;

    /* renamed from: g */
    public java.util.List f368436g;

    /* renamed from: h */
    public final java.util.List f368437h;

    /* renamed from: i */
    public o06.r1 f368438i;

    /* renamed from: j */
    public o06.r1 f368439j;

    /* renamed from: k */
    public f26.o0 f368440k;

    /* renamed from: l */
    public n16.g f368441l;

    /* renamed from: m */
    public boolean f368442m;

    /* renamed from: n */
    public boolean f368443n;

    /* renamed from: o */
    public boolean f368444o;

    /* renamed from: p */
    public boolean f368445p;

    /* renamed from: q */
    public boolean f368446q;

    /* renamed from: r */
    public java.util.List f368447r;

    /* renamed from: s */
    public p06.k f368448s;

    /* renamed from: t */
    public boolean f368449t;

    /* renamed from: u */
    public final java.util.Map f368450u;

    /* renamed from: v */
    public java.lang.Boolean f368451v;

    /* renamed from: w */
    public boolean f368452w;

    /* renamed from: x */
    public final /* synthetic */ r06.j0 f368453x;

    public i0(r06.j0 j0Var, f26.q2 q2Var, o06.m mVar, o06.t0 t0Var, o06.g0 g0Var, o06.c cVar, java.util.List list, java.util.List list2, o06.r1 r1Var, f26.o0 o0Var, n16.g gVar) {
        if (q2Var == null) {
            q(0);
            throw null;
        }
        if (mVar == null) {
            q(1);
            throw null;
        }
        if (t0Var == null) {
            q(2);
            throw null;
        }
        if (g0Var == null) {
            q(3);
            throw null;
        }
        if (cVar == null) {
            q(4);
            throw null;
        }
        if (list == null) {
            q(5);
            throw null;
        }
        if (list2 == null) {
            q(6);
            throw null;
        }
        if (o0Var == null) {
            q(7);
            throw null;
        }
        this.f368453x = j0Var;
        this.f368434e = null;
        this.f368439j = j0Var.f368463p;
        this.f368442m = true;
        this.f368443n = false;
        this.f368444o = false;
        this.f368445p = false;
        this.f368446q = j0Var.f368473z;
        this.f368447r = null;
        this.f368448s = null;
        this.f368449t = j0Var.A;
        this.f368450u = new java.util.LinkedHashMap();
        this.f368451v = null;
        this.f368452w = false;
        this.f368430a = q2Var;
        this.f368431b = mVar;
        this.f368432c = t0Var;
        this.f368433d = g0Var;
        this.f368435f = cVar;
        this.f368436g = list;
        this.f368437h = list2;
        this.f368438i = r1Var;
        this.f368440k = o0Var;
        this.f368441l = gVar;
    }

    public static /* synthetic */ void q(int i17) {
        java.lang.String str;
        int i18;
        switch (i17) {
            case 9:
            case 11:
            case 13:
            case 15:
            case 16:
            case 18:
            case 20:
            case 22:
            case 24:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 36:
            case 38:
            case 40:
            case 41:
            case 42:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 10:
            case 12:
            case 14:
            case 17:
            case 19:
            case 21:
            case 23:
            case 25:
            case 35:
            case 37:
            case 39:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i17) {
            case 9:
            case 11:
            case 13:
            case 15:
            case 16:
            case 18:
            case 20:
            case 22:
            case 24:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 36:
            case 38:
            case 40:
            case 41:
            case 42:
                i18 = 2;
                break;
            case 10:
            case 12:
            case 14:
            case 17:
            case 19:
            case 21:
            case 23:
            case 25:
            case 35:
            case 37:
            case 39:
            default:
                i18 = 3;
                break;
        }
        java.lang.Object[] objArr = new java.lang.Object[i18];
        switch (i17) {
            case 1:
                objArr[0] = "newOwner";
                break;
            case 2:
                objArr[0] = "newModality";
                break;
            case 3:
                objArr[0] = "newVisibility";
                break;
            case 4:
            case 14:
                objArr[0] = "kind";
                break;
            case 5:
                objArr[0] = "newValueParameterDescriptors";
                break;
            case 6:
                objArr[0] = "newContextReceiverParameters";
                break;
            case 7:
                objArr[0] = "newReturnType";
                break;
            case 8:
                objArr[0] = "owner";
                break;
            case 9:
            case 11:
            case 13:
            case 15:
            case 16:
            case 18:
            case 20:
            case 22:
            case 24:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 36:
            case 38:
            case 40:
            case 41:
            case 42:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                break;
            case 10:
                objArr[0] = "modality";
                break;
            case 12:
                objArr[0] = "visibility";
                break;
            case 17:
                objArr[0] = com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME;
                break;
            case 19:
            case 21:
                objArr[0] = "parameters";
                break;
            case 23:
                objArr[0] = "type";
                break;
            case 25:
                objArr[0] = "contextReceiverParameters";
                break;
            case 35:
                objArr[0] = "additionalAnnotations";
                break;
            case 37:
            default:
                objArr[0] = "substitution";
                break;
            case 39:
                objArr[0] = "userDataKey";
                break;
        }
        switch (i17) {
            case 9:
                objArr[1] = "setOwner";
                break;
            case 10:
            case 12:
            case 14:
            case 17:
            case 19:
            case 21:
            case 23:
            case 25:
            case 35:
            case 37:
            case 39:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                break;
            case 11:
                objArr[1] = "setModality";
                break;
            case 13:
                objArr[1] = "setVisibility";
                break;
            case 15:
                objArr[1] = "setKind";
                break;
            case 16:
                objArr[1] = "setCopyOverrides";
                break;
            case 18:
                objArr[1] = "setName";
                break;
            case 20:
                objArr[1] = "setValueParameters";
                break;
            case 22:
                objArr[1] = "setTypeParameters";
                break;
            case 24:
                objArr[1] = "setReturnType";
                break;
            case 26:
                objArr[1] = "setContextReceiverParameters";
                break;
            case 27:
                objArr[1] = "setExtensionReceiverParameter";
                break;
            case 28:
                objArr[1] = "setDispatchReceiverParameter";
                break;
            case 29:
                objArr[1] = "setOriginal";
                break;
            case 30:
                objArr[1] = "setSignatureChange";
                break;
            case 31:
                objArr[1] = "setPreserveSourceElement";
                break;
            case 32:
                objArr[1] = "setDropOriginalInContainingParts";
                break;
            case 33:
                objArr[1] = "setHiddenToOvercomeSignatureClash";
                break;
            case 34:
                objArr[1] = "setHiddenForResolutionEverywhereBesideSupercalls";
                break;
            case 36:
                objArr[1] = "setAdditionalAnnotations";
                break;
            case 38:
                objArr[1] = "setSubstitution";
                break;
            case 40:
                objArr[1] = "putUserData";
                break;
            case 41:
                objArr[1] = "getSubstitution";
                break;
            case 42:
                objArr[1] = "setJustForTypeSubstitution";
                break;
        }
        switch (i17) {
            case 8:
                objArr[2] = "setOwner";
                break;
            case 9:
            case 11:
            case 13:
            case 15:
            case 16:
            case 18:
            case 20:
            case 22:
            case 24:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 36:
            case 38:
            case 40:
            case 41:
            case 42:
                break;
            case 10:
                objArr[2] = "setModality";
                break;
            case 12:
                objArr[2] = "setVisibility";
                break;
            case 14:
                objArr[2] = "setKind";
                break;
            case 17:
                objArr[2] = "setName";
                break;
            case 19:
                objArr[2] = "setValueParameters";
                break;
            case 21:
                objArr[2] = "setTypeParameters";
                break;
            case 23:
                objArr[2] = "setReturnType";
                break;
            case 25:
                objArr[2] = "setContextReceiverParameters";
                break;
            case 35:
                objArr[2] = "setAdditionalAnnotations";
                break;
            case 37:
                objArr[2] = "setSubstitution";
                break;
            case 39:
                objArr[2] = "putUserData";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        java.lang.String format = java.lang.String.format(str, objArr);
        switch (i17) {
            case 9:
            case 11:
            case 13:
            case 15:
            case 16:
            case 18:
            case 20:
            case 22:
            case 24:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 36:
            case 38:
            case 40:
            case 41:
            case 42:
                throw new java.lang.IllegalStateException(format);
            case 10:
            case 12:
            case 14:
            case 17:
            case 19:
            case 21:
            case 23:
            case 25:
            case 35:
            case 37:
            case 39:
            default:
                throw new java.lang.IllegalArgumentException(format);
        }
    }

    @Override // o06.m0
    public o06.m0 a(o06.r1 r1Var) {
        this.f368439j = r1Var;
        return this;
    }

    @Override // o06.m0
    public o06.m0 b() {
        this.f368446q = true;
        return this;
    }

    @Override // o06.m0
    public o06.n0 build() {
        return this.f368453x.v0(this);
    }

    @Override // o06.m0
    public o06.m0 c(p06.k kVar) {
        if (kVar != null) {
            this.f368448s = kVar;
            return this;
        }
        q(35);
        throw null;
    }

    @Override // o06.m0
    public o06.m0 d() {
        this.f368444o = true;
        return this;
    }

    @Override // o06.m0
    public o06.m0 e(boolean z17) {
        this.f368442m = z17;
        return this;
    }

    @Override // o06.m0
    public o06.m0 f(o06.m mVar) {
        if (mVar != null) {
            this.f368431b = mVar;
            return this;
        }
        q(8);
        throw null;
    }

    @Override // o06.m0
    public o06.m0 g(java.util.List list) {
        if (list != null) {
            this.f368447r = list;
            return this;
        }
        q(21);
        throw null;
    }

    @Override // o06.m0
    public o06.m0 h(o06.g0 g0Var) {
        if (g0Var != null) {
            this.f368433d = g0Var;
            return this;
        }
        q(12);
        throw null;
    }

    @Override // o06.m0
    public o06.m0 i(java.util.List list) {
        if (list != null) {
            this.f368436g = list;
            return this;
        }
        q(19);
        throw null;
    }

    @Override // o06.m0
    public o06.m0 j(o06.a aVar, java.lang.Object obj) {
        if (aVar != null) {
            this.f368450u.put(aVar, obj);
            return this;
        }
        q(39);
        throw null;
    }

    @Override // o06.m0
    public o06.m0 k(o06.c cVar) {
        if (cVar != null) {
            this.f368435f = cVar;
            return this;
        }
        q(14);
        throw null;
    }

    @Override // o06.m0
    public o06.m0 l() {
        this.f368449t = true;
        return this;
    }

    @Override // o06.m0
    public o06.m0 m(f26.o0 o0Var) {
        if (o0Var != null) {
            this.f368440k = o0Var;
            return this;
        }
        q(23);
        throw null;
    }

    @Override // o06.m0
    public o06.m0 n(o06.t0 t0Var) {
        if (t0Var != null) {
            this.f368432c = t0Var;
            return this;
        }
        q(10);
        throw null;
    }

    @Override // o06.m0
    public o06.m0 o(n16.g gVar) {
        if (gVar != null) {
            this.f368441l = gVar;
            return this;
        }
        q(17);
        throw null;
    }

    @Override // o06.m0
    public o06.m0 p() {
        this.f368443n = true;
        return this;
    }
}
