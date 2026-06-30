package o26;

/* loaded from: classes14.dex */
public final class u extends java.util.AbstractSet {

    /* renamed from: f, reason: collision with root package name */
    public static final o26.s f342614f = new o26.s(null);

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f342615d;

    /* renamed from: e, reason: collision with root package name */
    public int f342616e;

    public u(kotlin.jvm.internal.i iVar) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.AbstractCollection, java.util.Collection, java.util.LinkedHashSet] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(java.lang.Object obj) {
        java.lang.Object[] objArr;
        int i17 = this.f342616e;
        if (i17 == 0) {
            this.f342615d = obj;
        } else if (i17 == 1) {
            if (kotlin.jvm.internal.o.b(this.f342615d, obj)) {
                return false;
            }
            this.f342615d = new java.lang.Object[]{this.f342615d, obj};
        } else if (i17 < 5) {
            java.lang.Object obj2 = this.f342615d;
            kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            java.lang.Object[] objArr2 = (java.lang.Object[]) obj2;
            if (kz5.z.G(objArr2, obj)) {
                return false;
            }
            int i18 = this.f342616e;
            if (i18 == 4) {
                java.lang.Object[] elements = java.util.Arrays.copyOf(objArr2, objArr2.length);
                kotlin.jvm.internal.o.g(elements, "elements");
                ?? linkedHashSet = new java.util.LinkedHashSet(kz5.b1.d(elements.length));
                kz5.z.u0(elements, linkedHashSet);
                linkedHashSet.add(obj);
                objArr = linkedHashSet;
            } else {
                java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr2, i18 + 1);
                kotlin.jvm.internal.o.f(copyOf, "copyOf(...)");
                copyOf[copyOf.length - 1] = obj;
                objArr = copyOf;
            }
            this.f342615d = objArr;
        } else {
            java.lang.Object obj3 = this.f342615d;
            kotlin.jvm.internal.o.e(obj3, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
            if (!kotlin.jvm.internal.m0.d(obj3).add(obj)) {
                return false;
            }
        }
        this.f342616e++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f342615d = null;
        this.f342616e = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(java.lang.Object obj) {
        int i17 = this.f342616e;
        if (i17 == 0) {
            return false;
        }
        if (i17 == 1) {
            return kotlin.jvm.internal.o.b(this.f342615d, obj);
        }
        if (i17 < 5) {
            java.lang.Object obj2 = this.f342615d;
            kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            return kz5.z.G((java.lang.Object[]) obj2, obj);
        }
        java.lang.Object obj3 = this.f342615d;
        kotlin.jvm.internal.o.e(obj3, "null cannot be cast to non-null type kotlin.collections.Set<T of org.jetbrains.kotlin.utils.SmartSet>");
        return ((java.util.Set) obj3).contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public java.util.Iterator iterator() {
        int i17 = this.f342616e;
        if (i17 == 0) {
            return java.util.Collections.emptySet().iterator();
        }
        if (i17 == 1) {
            return new o26.t(this.f342615d);
        }
        if (i17 < 5) {
            java.lang.Object obj = this.f342615d;
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            return new o26.r((java.lang.Object[]) obj);
        }
        java.lang.Object obj2 = this.f342615d;
        kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
        return kotlin.jvm.internal.m0.d(obj2).iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f342616e;
    }
}
