package f06;

/* loaded from: classes15.dex */
public final class i0 implements java.lang.reflect.WildcardType, java.lang.reflect.Type {

    /* renamed from: f, reason: collision with root package name */
    public static final f06.i0 f258451f = new f06.i0(null, null);

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.reflect.Type f258452d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.reflect.Type f258453e;

    public i0(java.lang.reflect.Type type, java.lang.reflect.Type type2) {
        this.f258452d = type;
        this.f258453e = type2;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof java.lang.reflect.WildcardType) {
            java.lang.reflect.WildcardType wildcardType = (java.lang.reflect.WildcardType) obj;
            if (java.util.Arrays.equals(getUpperBounds(), wildcardType.getUpperBounds()) && java.util.Arrays.equals(getLowerBounds(), wildcardType.getLowerBounds())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.reflect.WildcardType
    public java.lang.reflect.Type[] getLowerBounds() {
        java.lang.reflect.Type type = this.f258453e;
        return type == null ? new java.lang.reflect.Type[0] : new java.lang.reflect.Type[]{type};
    }

    @Override // java.lang.reflect.Type
    public java.lang.String getTypeName() {
        java.lang.reflect.Type type = this.f258453e;
        if (type != null) {
            return "? super " + f06.h0.a(type);
        }
        java.lang.reflect.Type type2 = this.f258452d;
        if (type2 == null || kotlin.jvm.internal.o.b(type2, java.lang.Object.class)) {
            return "?";
        }
        return "? extends " + f06.h0.a(type2);
    }

    @Override // java.lang.reflect.WildcardType
    public java.lang.reflect.Type[] getUpperBounds() {
        java.lang.reflect.Type[] typeArr = new java.lang.reflect.Type[1];
        java.lang.reflect.Type type = this.f258452d;
        if (type == null) {
            type = java.lang.Object.class;
        }
        typeArr[0] = type;
        return typeArr;
    }

    public int hashCode() {
        return java.util.Arrays.hashCode(getUpperBounds()) ^ java.util.Arrays.hashCode(getLowerBounds());
    }

    public java.lang.String toString() {
        return getTypeName();
    }
}
