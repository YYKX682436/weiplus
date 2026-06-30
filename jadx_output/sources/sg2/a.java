package sg2;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f407881a;

    public a(java.lang.String str) {
        this.f407881a = str;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sg2.a) && kotlin.jvm.internal.o.b(this.f407881a, ((sg2.a) obj).f407881a);
    }

    public int hashCode() {
        java.lang.String str = this.f407881a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public java.lang.String toString() {
        return "AnchorFileStatus(d_lua=" + this.f407881a + ')';
    }
}
