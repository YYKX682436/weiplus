package yw4;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f466947a;

    public a(java.lang.String str) {
        this.f466947a = str;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yw4.a) && kotlin.jvm.internal.o.b(this.f466947a, ((yw4.a) obj).f466947a);
    }

    public int hashCode() {
        java.lang.String str = this.f466947a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public java.lang.String toString() {
        return "MpImgPreloadData(picLinkUseToLocalCache=" + this.f466947a + ')';
    }
}
