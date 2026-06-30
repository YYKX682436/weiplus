package lu;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.storage.f9 f321316a;

    /* renamed from: b, reason: collision with root package name */
    public final oi3.g f321317b;

    public c(com.tencent.mm.storage.f9 msgInfo, oi3.g simpleMsgInfo) {
        kotlin.jvm.internal.o.g(msgInfo, "msgInfo");
        kotlin.jvm.internal.o.g(simpleMsgInfo, "simpleMsgInfo");
        this.f321316a = msgInfo;
        this.f321317b = simpleMsgInfo;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lu.c)) {
            return false;
        }
        lu.c cVar = (lu.c) obj;
        return kotlin.jvm.internal.o.b(this.f321316a, cVar.f321316a) && kotlin.jvm.internal.o.b(this.f321317b, cVar.f321317b);
    }

    public int hashCode() {
        return (this.f321316a.hashCode() * 31) + this.f321317b.hashCode();
    }

    public java.lang.String toString() {
        return "ResolvedQuoteMsg(msgInfo=" + this.f321316a + ", simpleMsgInfo=" + this.f321317b + ')';
    }
}
