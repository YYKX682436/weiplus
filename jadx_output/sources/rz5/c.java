package rz5;

/* loaded from: classes5.dex */
public final class c extends kz5.h implements rz5.a, java.io.Serializable {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Enum[] f401822e;

    public c(java.lang.Enum[] entries) {
        kotlin.jvm.internal.o.g(entries, "entries");
        this.f401822e = entries;
    }

    @Override // kz5.b, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        if (!(obj instanceof java.lang.Enum)) {
            return false;
        }
        java.lang.Enum element = (java.lang.Enum) obj;
        kotlin.jvm.internal.o.g(element, "element");
        return ((java.lang.Enum) kz5.z.U(this.f401822e, element.ordinal())) == element;
    }

    @Override // kz5.b
    public int d() {
        return this.f401822e.length;
    }

    @Override // java.util.List
    public java.lang.Object get(int i17) {
        java.lang.Enum[] enumArr = this.f401822e;
        int length = enumArr.length;
        if (i17 >= 0 && i17 < length) {
            return enumArr[i17];
        }
        throw new java.lang.IndexOutOfBoundsException("index: " + i17 + ", size: " + length);
    }

    @Override // kz5.h, java.util.List
    public final int indexOf(java.lang.Object obj) {
        if (!(obj instanceof java.lang.Enum)) {
            return -1;
        }
        java.lang.Enum element = (java.lang.Enum) obj;
        kotlin.jvm.internal.o.g(element, "element");
        int ordinal = element.ordinal();
        if (((java.lang.Enum) kz5.z.U(this.f401822e, ordinal)) == element) {
            return ordinal;
        }
        return -1;
    }

    @Override // kz5.h, java.util.List
    public final int lastIndexOf(java.lang.Object obj) {
        if (!(obj instanceof java.lang.Enum)) {
            return -1;
        }
        java.lang.Enum element = (java.lang.Enum) obj;
        kotlin.jvm.internal.o.g(element, "element");
        return indexOf(element);
    }
}
