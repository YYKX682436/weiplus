package mw4;

/* loaded from: classes5.dex */
public final class n {

    /* renamed from: c, reason: collision with root package name */
    public yz5.r f331783c;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f331781a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f331782b = new java.util.ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Set f331784d = new java.util.LinkedHashSet();

    /* renamed from: e, reason: collision with root package name */
    public final mw4.o f331785e = new mw4.o();

    public static mw4.n c(mw4.n nVar, java.lang.String sessionId, java.lang.String trustedOrigin, java.lang.String str, java.lang.String str2, int i17, java.lang.Object obj) {
        java.lang.String str3 = (i17 & 4) != 0 ? null : str;
        java.lang.String str4 = (i17 & 8) != 0 ? null : str2;
        nVar.getClass();
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        kotlin.jvm.internal.o.g(trustedOrigin, "trustedOrigin");
        nVar.f331783c = new mw4.m(str3, str4, trustedOrigin, sessionId, nVar);
        return nVar;
    }

    public final mw4.p a() {
        yz5.q kVar;
        if (((java.util.ArrayList) this.f331781a).isEmpty()) {
            kVar = null;
        } else {
            yz5.r rVar = this.f331783c;
            java.util.List list = this.f331782b;
            if (rVar != null) {
                ((java.util.ArrayList) list).add(0, rVar);
            }
            kVar = new mw4.k(this);
            java.util.ArrayList arrayList = (java.util.ArrayList) list;
            if (!arrayList.isEmpty() && !arrayList.isEmpty()) {
                java.util.ListIterator listIterator = arrayList.listIterator(arrayList.size());
                while (listIterator.hasPrevious()) {
                    kVar = new mw4.j((yz5.r) listIterator.previous(), kVar);
                }
            }
        }
        return new mw4.p(kVar, this.f331785e, null);
    }

    public final mw4.n b(java.lang.String targetUrlPath, yz5.r handler) {
        kotlin.jvm.internal.o.g(targetUrlPath, "targetUrlPath");
        kotlin.jvm.internal.o.g(handler, "handler");
        this.f331784d.add(targetUrlPath);
        ((java.util.ArrayList) this.f331781a).add(new mw4.l(targetUrlPath, handler));
        return this;
    }
}
