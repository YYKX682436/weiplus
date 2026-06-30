package r06;

/* loaded from: classes16.dex */
public class c0 extends r16.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.Set f368375a;

    public c0(r06.d0 d0Var, java.util.Set set) {
        this.f368375a = set;
    }

    public static /* synthetic */ void d(int i17) {
        java.lang.Object[] objArr = new java.lang.Object[3];
        if (i17 == 1) {
            objArr[0] = "fromSuper";
        } else if (i17 != 2) {
            objArr[0] = "fakeOverride";
        } else {
            objArr[0] = "fromCurrent";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope$4";
        if (i17 == 1 || i17 == 2) {
            objArr[2] = "conflict";
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
        r16.x.r(dVar, null);
        this.f368375a.add(dVar);
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
