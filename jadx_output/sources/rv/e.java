package rv;

/* loaded from: classes9.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.storage.l4 f399840a;

    /* renamed from: b, reason: collision with root package name */
    public final int f399841b;

    public e(com.tencent.mm.storage.l4 conversation, int i17) {
        kotlin.jvm.internal.o.g(conversation, "conversation");
        this.f399840a = conversation;
        this.f399841b = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rv.e)) {
            return false;
        }
        rv.e eVar = (rv.e) obj;
        return kotlin.jvm.internal.o.b(this.f399840a, eVar.f399840a) && this.f399841b == eVar.f399841b;
    }

    public int hashCode() {
        return (this.f399840a.hashCode() * 31) + java.lang.Integer.hashCode(this.f399841b);
    }

    public java.lang.String toString() {
        return "ConversationInfo(conversation=" + this.f399840a + ", position=" + this.f399841b + ')';
    }
}
