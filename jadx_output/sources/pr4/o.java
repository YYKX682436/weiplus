package pr4;

/* loaded from: classes8.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final pr4.i f358040a;

    public o(pr4.i tierType) {
        kotlin.jvm.internal.o.g(tierType, "tierType");
        this.f358040a = tierType;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pr4.o) && this.f358040a == ((pr4.o) obj).f358040a;
    }

    public int hashCode() {
        return this.f358040a.hashCode();
    }

    public java.lang.String toString() {
        return "WeCoinSubscribeResultInfo(tierType=" + this.f358040a + ')';
    }
}
