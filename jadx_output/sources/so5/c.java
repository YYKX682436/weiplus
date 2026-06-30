package so5;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public int f410799a;

    public c(int i17, int i18, kotlin.jvm.internal.i iVar) {
        this.f410799a = (i18 & 1) != 0 ? 0 : i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof so5.c) && this.f410799a == ((so5.c) obj).f410799a;
    }

    public int hashCode() {
        return java.lang.Integer.hashCode(this.f410799a);
    }

    public java.lang.String toString() {
        return "CodecErrorInfo(errorNum=" + this.f410799a + ')';
    }
}
