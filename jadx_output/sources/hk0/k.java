package hk0;

/* loaded from: classes3.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final hk0.l f281757a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f281758b;

    public k(hk0.l editType, java.lang.String editId) {
        kotlin.jvm.internal.o.g(editType, "editType");
        kotlin.jvm.internal.o.g(editId, "editId");
        this.f281757a = editType;
        this.f281758b = editId;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hk0.k)) {
            return false;
        }
        hk0.k kVar = (hk0.k) obj;
        return this.f281757a == kVar.f281757a && kotlin.jvm.internal.o.b(this.f281758b, kVar.f281758b);
    }

    public int hashCode() {
        return (this.f281757a.hashCode() * 31) + this.f281758b.hashCode();
    }

    public java.lang.String toString() {
        return "EditStateData(editType=" + this.f281757a + ", editId=" + this.f281758b + ')';
    }
}
