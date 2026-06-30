package dh3;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.msg.MsgIdTalker f232486a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f232487b;

    public a(com.tencent.mm.plugin.msg.MsgIdTalker msgIdTalker, java.lang.String toUser) {
        kotlin.jvm.internal.o.g(msgIdTalker, "msgIdTalker");
        kotlin.jvm.internal.o.g(toUser, "toUser");
        this.f232486a = msgIdTalker;
        this.f232487b = toUser;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dh3.a)) {
            return false;
        }
        dh3.a aVar = (dh3.a) obj;
        return kotlin.jvm.internal.o.b(this.f232486a, aVar.f232486a) && kotlin.jvm.internal.o.b(this.f232487b, aVar.f232487b);
    }

    public int hashCode() {
        return (this.f232486a.hashCode() * 31) + this.f232487b.hashCode();
    }

    public java.lang.String toString() {
        return "BatchSendRecord(msgIdTalker=" + this.f232486a + ", toUser=" + this.f232487b + ')';
    }
}
