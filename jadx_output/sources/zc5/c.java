package zc5;

/* loaded from: classes12.dex */
public final class c extends zc5.f {

    /* renamed from: a, reason: collision with root package name */
    public final int f471441a;

    public c(int i17) {
        super(null);
        this.f471441a = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zc5.c) && this.f471441a == ((zc5.c) obj).f471441a;
    }

    public int hashCode() {
        return java.lang.Integer.hashCode(this.f471441a);
    }

    public java.lang.String toString() {
        return "Failed(errorCode=" + this.f471441a + ')';
    }

    public /* synthetic */ c(int i17, int i18, kotlin.jvm.internal.i iVar) {
        this((i18 & 1) != 0 ? 0 : i17);
    }
}
