package hk0;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final hk0.d1 f281747a;

    /* renamed from: b, reason: collision with root package name */
    public final hk0.k f281748b;

    public i(hk0.d1 operateType, hk0.k stateData) {
        kotlin.jvm.internal.o.g(operateType, "operateType");
        kotlin.jvm.internal.o.g(stateData, "stateData");
        this.f281747a = operateType;
        this.f281748b = stateData;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hk0.i)) {
            return false;
        }
        hk0.i iVar = (hk0.i) obj;
        return this.f281747a == iVar.f281747a && kotlin.jvm.internal.o.b(this.f281748b, iVar.f281748b);
    }

    public int hashCode() {
        return (this.f281747a.hashCode() * 31) + this.f281748b.hashCode();
    }

    public java.lang.String toString() {
        return "EditDataEvent(operateType=" + this.f281747a + ", stateData=" + this.f281748b + ')';
    }
}
