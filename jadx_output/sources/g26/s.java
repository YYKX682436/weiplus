package g26;

/* loaded from: classes16.dex */
public final class s implements s16.b {

    /* renamed from: a, reason: collision with root package name */
    public final f26.l2 f268007a;

    /* renamed from: b, reason: collision with root package name */
    public yz5.a f268008b;

    /* renamed from: c, reason: collision with root package name */
    public final g26.s f268009c;

    /* renamed from: d, reason: collision with root package name */
    public final o06.e2 f268010d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f268011e;

    public s(f26.l2 projection, yz5.a aVar, g26.s sVar, o06.e2 e2Var) {
        kotlin.jvm.internal.o.g(projection, "projection");
        this.f268007a = projection;
        this.f268008b = aVar;
        this.f268009c = sVar;
        this.f268010d = e2Var;
        this.f268011e = jz5.h.a(jz5.i.f302830e, new g26.p(this));
    }

    @Override // f26.c2
    public java.util.Collection a() {
        java.util.List list = (java.util.List) this.f268011e.getValue();
        return list == null ? kz5.p0.f313996d : list;
    }

    public g26.s b(g26.l kotlinTypeRefiner) {
        kotlin.jvm.internal.o.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        f26.l2 a17 = this.f268007a.a(kotlinTypeRefiner);
        kotlin.jvm.internal.o.f(a17, "refine(...)");
        g26.r rVar = this.f268008b != null ? new g26.r(this, kotlinTypeRefiner) : null;
        g26.s sVar = this.f268009c;
        if (sVar == null) {
            sVar = this;
        }
        return new g26.s(a17, rVar, sVar, this.f268010d);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!kotlin.jvm.internal.o.b(g26.s.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedTypeConstructor");
        g26.s sVar = (g26.s) obj;
        g26.s sVar2 = this.f268009c;
        if (sVar2 == null) {
            sVar2 = this;
        }
        g26.s sVar3 = sVar.f268009c;
        if (sVar3 != null) {
            sVar = sVar3;
        }
        return sVar2 == sVar;
    }

    @Override // f26.c2
    public java.util.List getParameters() {
        return kz5.p0.f313996d;
    }

    @Override // s16.b
    public f26.l2 getProjection() {
        return this.f268007a;
    }

    @Override // f26.c2
    public l06.o h() {
        f26.o0 type = this.f268007a.getType();
        kotlin.jvm.internal.o.f(type, "getType(...)");
        return j26.c.e(type);
    }

    public int hashCode() {
        g26.s sVar = this.f268009c;
        return sVar != null ? sVar.hashCode() : super.hashCode();
    }

    @Override // f26.c2
    public o06.j i() {
        return null;
    }

    @Override // f26.c2
    public boolean j() {
        return false;
    }

    public java.lang.String toString() {
        return "CapturedType(" + this.f268007a + ')';
    }

    public /* synthetic */ s(f26.l2 l2Var, yz5.a aVar, g26.s sVar, o06.e2 e2Var, int i17, kotlin.jvm.internal.i iVar) {
        this(l2Var, (i17 & 2) != 0 ? null : aVar, (i17 & 4) != 0 ? null : sVar, (i17 & 8) != 0 ? null : e2Var);
    }
}
