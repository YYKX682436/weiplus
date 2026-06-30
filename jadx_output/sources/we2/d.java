package we2;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f445222a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f445223b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.q f445224c;

    public d(java.lang.String tag, java.lang.Object obj, yz5.q qVar) {
        kotlin.jvm.internal.o.g(tag, "tag");
        this.f445222a = tag;
        this.f445223b = obj;
        this.f445224c = qVar;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof we2.d)) {
            return false;
        }
        we2.d dVar = (we2.d) obj;
        return kotlin.jvm.internal.o.b(this.f445222a, dVar.f445222a) && kotlin.jvm.internal.o.b(this.f445223b, dVar.f445223b) && kotlin.jvm.internal.o.b(this.f445224c, dVar.f445224c);
    }

    public int hashCode() {
        int hashCode = this.f445222a.hashCode() * 31;
        java.lang.Object obj = this.f445223b;
        int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        yz5.q qVar = this.f445224c;
        return hashCode2 + (qVar != null ? qVar.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "CommentSpanItem(tag=" + this.f445222a + ", span=" + this.f445223b + ", customizeSpanSetter=" + this.f445224c + ')';
    }

    public /* synthetic */ d(java.lang.String str, java.lang.Object obj, yz5.q qVar, int i17, kotlin.jvm.internal.i iVar) {
        this(str, obj, (i17 & 4) != 0 ? null : qVar);
    }
}
