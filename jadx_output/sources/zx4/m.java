package zx4;

/* loaded from: classes8.dex */
public final class m extends zx4.o {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f477166a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(java.lang.String str, int i17, kotlin.jvm.internal.i iVar) {
        super(null);
        str = (i17 & 1) != 0 ? null : str;
        this.f477166a = str;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zx4.m) && kotlin.jvm.internal.o.b(this.f477166a, ((zx4.m) obj).f477166a);
    }

    public int hashCode() {
        java.lang.String str = this.f477166a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public java.lang.String toString() {
        return "Failed(errMsg=" + this.f477166a + ')';
    }
}
