package us2;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final vt3.r f430474a;

    /* renamed from: b, reason: collision with root package name */
    public final vt3.p f430475b;

    public c(vt3.r tab, vt3.p templateItem, int i17, kotlin.jvm.internal.i iVar) {
        if ((i17 & 1) != 0) {
            us2.u uVar = us2.u.f430548a;
            tab = us2.u.f430549b;
        }
        kotlin.jvm.internal.o.g(tab, "tab");
        kotlin.jvm.internal.o.g(templateItem, "templateItem");
        this.f430474a = tab;
        this.f430475b = templateItem;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof us2.c)) {
            return false;
        }
        us2.c cVar = (us2.c) obj;
        return kotlin.jvm.internal.o.b(this.f430474a, cVar.f430474a) && kotlin.jvm.internal.o.b(this.f430475b, cVar.f430475b);
    }

    public int hashCode() {
        return (this.f430474a.hashCode() * 31) + this.f430475b.hashCode();
    }

    public java.lang.String toString() {
        return "OnlyPreviewData(tab=" + this.f430474a + ", templateItem=" + this.f430475b + ')';
    }
}
