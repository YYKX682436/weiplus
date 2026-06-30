package yh2;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final r45.xn1 f462367a;

    /* renamed from: b, reason: collision with root package name */
    public final int f462368b;

    /* renamed from: c, reason: collision with root package name */
    public final int f462369c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f462370d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f462371e;

    public b(r45.xn1 xn1Var, int i17, int i18, int i19, boolean z17, java.util.LinkedList linkedList, int i27, kotlin.jvm.internal.i iVar) {
        z17 = (i27 & 16) != 0 ? false : z17;
        linkedList = (i27 & 32) != 0 ? null : linkedList;
        this.f462367a = xn1Var;
        this.f462368b = i17;
        this.f462369c = i18;
        this.f462370d = z17;
        this.f462371e = linkedList;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yh2.b)) {
            return false;
        }
        yh2.b bVar = (yh2.b) obj;
        return kotlin.jvm.internal.o.b(this.f462367a, bVar.f462367a) && this.f462368b == bVar.f462368b && this.f462369c == bVar.f462369c && this.f462370d == bVar.f462370d && kotlin.jvm.internal.o.b(this.f462371e, bVar.f462371e);
    }

    public int hashCode() {
        r45.xn1 xn1Var = this.f462367a;
        int hashCode = (((((((((xn1Var == null ? 0 : xn1Var.hashCode()) * 31) + java.lang.Integer.hashCode(this.f462368b)) * 31) + java.lang.Integer.hashCode(this.f462369c)) * 31) + java.lang.Integer.hashCode(0)) * 31) + java.lang.Boolean.hashCode(this.f462370d)) * 31;
        java.util.LinkedList linkedList = this.f462371e;
        return hashCode + (linkedList != null ? linkedList.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "FinderLiveContactInfo(contact=" + this.f462367a + ", type=" + this.f462368b + ", onlineCnt=" + this.f462369c + ", offlineCnt=0, isMySelf=" + this.f462370d + ", giftItems=" + this.f462371e + ')';
    }
}
