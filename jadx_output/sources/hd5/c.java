package hd5;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f280589a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f280590b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f280591c;

    public c(boolean z17, java.lang.String afterReplaceContent, boolean z18) {
        kotlin.jvm.internal.o.g(afterReplaceContent, "afterReplaceContent");
        this.f280589a = z17;
        this.f280590b = afterReplaceContent;
        this.f280591c = z18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hd5.c)) {
            return false;
        }
        hd5.c cVar = (hd5.c) obj;
        return this.f280589a == cVar.f280589a && kotlin.jvm.internal.o.b(this.f280590b, cVar.f280590b) && this.f280591c == cVar.f280591c;
    }

    public int hashCode() {
        return (((java.lang.Boolean.hashCode(this.f280589a) * 31) + this.f280590b.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f280591c);
    }

    public java.lang.String toString() {
        return "ProcessTextInfo(isNeedReplace=" + this.f280589a + ", afterReplaceContent=" + this.f280590b + ", isSpecialForNeatText=" + this.f280591c + ')';
    }
}
