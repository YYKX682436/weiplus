package z61;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final z61.b f470324a;

    /* renamed from: b, reason: collision with root package name */
    public final int f470325b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f470326c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f470327d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f470328e;

    public c(z61.b type, int i17, java.lang.String customInfo, java.lang.String ticket, java.lang.String policyList) {
        kotlin.jvm.internal.o.g(type, "type");
        kotlin.jvm.internal.o.g(customInfo, "customInfo");
        kotlin.jvm.internal.o.g(ticket, "ticket");
        kotlin.jvm.internal.o.g(policyList, "policyList");
        this.f470324a = type;
        this.f470325b = i17;
        this.f470326c = customInfo;
        this.f470327d = ticket;
        this.f470328e = policyList;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z61.c)) {
            return false;
        }
        z61.c cVar = (z61.c) obj;
        return this.f470324a == cVar.f470324a && this.f470325b == cVar.f470325b && kotlin.jvm.internal.o.b(this.f470326c, cVar.f470326c) && kotlin.jvm.internal.o.b(this.f470327d, cVar.f470327d) && kotlin.jvm.internal.o.b(this.f470328e, cVar.f470328e);
    }

    public int hashCode() {
        return (((((((this.f470324a.hashCode() * 31) + java.lang.Integer.hashCode(this.f470325b)) * 31) + this.f470326c.hashCode()) * 31) + this.f470327d.hashCode()) * 31) + this.f470328e.hashCode();
    }

    public java.lang.String toString() {
        return "AccountPolicyAgreeEventObj(type=" + this.f470324a + ", isAgree=" + this.f470325b + ", customInfo=" + this.f470326c + ", ticket=" + this.f470327d + ", policyList=" + this.f470328e + ')';
    }
}
