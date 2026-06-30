package jp;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f300970a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f300971b;

    public a() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f300970a = "";
        this.f300971b = arrayList;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jp.a)) {
            return false;
        }
        jp.a aVar = (jp.a) obj;
        return kotlin.jvm.internal.o.b(this.f300970a, aVar.f300970a) && kotlin.jvm.internal.o.b(this.f300971b, aVar.f300971b);
    }

    public int hashCode() {
        return (this.f300970a.hashCode() * 31) + this.f300971b.hashCode();
    }

    public java.lang.String toString() {
        return "FullScreenMpLinkInfo(urlPrefix=" + this.f300970a + ", showTypeList=" + this.f300971b + ')';
    }
}
