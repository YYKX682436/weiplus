package zd1;

/* loaded from: classes7.dex */
public final class h extends zd1.j {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f471532a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(java.lang.String str, int i17, kotlin.jvm.internal.i iVar) {
        super(null);
        str = (i17 & 1) != 0 ? null : str;
        this.f471532a = str;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zd1.h) && kotlin.jvm.internal.o.b(this.f471532a, ((zd1.h) obj).f471532a);
    }

    public int hashCode() {
        java.lang.String str = this.f471532a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public java.lang.String toString() {
        return "Failed(errMsg=" + this.f471532a + ')';
    }
}
