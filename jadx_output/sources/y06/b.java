package y06;

/* loaded from: classes16.dex */
public final class b extends r16.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b26.c0 f458661a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.Set f458662b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f458663c;

    public b(b26.c0 c0Var, java.util.Set set, boolean z17) {
        this.f458661a = c0Var;
        this.f458662b = set;
        this.f458663c = z17;
    }

    public static /* synthetic */ void d(int i17) {
        java.lang.Object[] objArr = new java.lang.Object[3];
        if (i17 == 1) {
            objArr[0] = "fromSuper";
        } else if (i17 == 2) {
            objArr[0] = "fromCurrent";
        } else if (i17 == 3) {
            objArr[0] = "member";
        } else if (i17 != 4) {
            objArr[0] = "fakeOverride";
        } else {
            objArr[0] = "overridden";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1";
        if (i17 == 1 || i17 == 2) {
            objArr[2] = "conflict";
        } else if (i17 == 3 || i17 == 4) {
            objArr[2] = "setOverriddenDescriptors";
        } else {
            objArr[2] = "addFakeOverride";
        }
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // r16.p
    public void a(o06.d dVar) {
        if (dVar == null) {
            d(0);
            throw null;
        }
        r16.x.r(dVar, new y06.a(this));
        this.f458662b.add(dVar);
    }

    @Override // r16.p
    public void b(o06.d dVar, java.util.Collection collection) {
        if (dVar == null) {
            d(3);
            throw null;
        }
        if (collection == null) {
            d(4);
            throw null;
        }
        if (!this.f458663c || dVar.j() == o06.c.FAKE_OVERRIDE) {
            super.b(dVar, collection);
        }
    }

    @Override // r16.o
    public void c(o06.d dVar, o06.d dVar2) {
        if (dVar == null) {
            d(1);
            throw null;
        }
        if (dVar2 != null) {
            return;
        }
        d(2);
        throw null;
    }
}
