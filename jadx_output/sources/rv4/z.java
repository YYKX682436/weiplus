package rv4;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f400563a;

    public z(java.util.List items) {
        kotlin.jvm.internal.o.g(items, "items");
        this.f400563a = items;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rv4.z) && kotlin.jvm.internal.o.b(this.f400563a, ((rv4.z) obj).f400563a);
    }

    public int hashCode() {
        return this.f400563a.hashCode();
    }

    public java.lang.String toString() {
        return "FTSGlobalTeachSettingData(items=" + this.f400563a + ')';
    }
}
