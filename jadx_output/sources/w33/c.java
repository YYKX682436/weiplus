package w33;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final jz5.l f442709a;

    /* renamed from: b, reason: collision with root package name */
    public final w33.e f442710b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f442711c;

    /* renamed from: d, reason: collision with root package name */
    public final int f442712d;

    public c(jz5.l topTip, w33.e user, boolean z17, int i17) {
        kotlin.jvm.internal.o.g(topTip, "topTip");
        kotlin.jvm.internal.o.g(user, "user");
        this.f442709a = topTip;
        this.f442710b = user;
        this.f442711c = z17;
        this.f442712d = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w33.c)) {
            return false;
        }
        w33.c cVar = (w33.c) obj;
        return kotlin.jvm.internal.o.b(this.f442709a, cVar.f442709a) && kotlin.jvm.internal.o.b(this.f442710b, cVar.f442710b) && this.f442711c == cVar.f442711c && this.f442712d == cVar.f442712d;
    }

    public int hashCode() {
        return (((((this.f442709a.hashCode() * 31) + this.f442710b.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f442711c)) * 31) + java.lang.Integer.hashCode(this.f442712d);
    }

    public java.lang.String toString() {
        return "MentionUserWrapper(topTip=" + this.f442709a + ", user=" + this.f442710b + ", showFooter=" + this.f442711c + ", reportPosition=" + this.f442712d + ')';
    }

    public /* synthetic */ c(jz5.l lVar, w33.e eVar, boolean z17, int i17, int i18, kotlin.jvm.internal.i iVar) {
        this((i18 & 1) != 0 ? new jz5.l(java.lang.Boolean.FALSE, null) : lVar, eVar, (i18 & 4) != 0 ? false : z17, (i18 & 8) != 0 ? -1 : i17);
    }
}
