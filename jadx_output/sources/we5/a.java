package we5;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final yb5.d f445299a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.storage.f9 f445300b;

    public a(yb5.d chattingContext, com.tencent.mm.storage.f9 msgInfo) {
        kotlin.jvm.internal.o.g(chattingContext, "chattingContext");
        kotlin.jvm.internal.o.g(msgInfo, "msgInfo");
        this.f445299a = chattingContext;
        this.f445300b = msgInfo;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof we5.a)) {
            return false;
        }
        we5.a aVar = (we5.a) obj;
        return kotlin.jvm.internal.o.b(this.f445299a, aVar.f445299a) && kotlin.jvm.internal.o.b(this.f445300b, aVar.f445300b);
    }

    public int hashCode() {
        return (this.f445299a.hashCode() * 31) + this.f445300b.hashCode();
    }

    public java.lang.String toString() {
        return "AsyncMsgParams(chattingContext=" + this.f445299a + ", msgInfo=" + this.f445300b + ')';
    }
}
