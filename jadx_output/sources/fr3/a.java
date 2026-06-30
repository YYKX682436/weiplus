package fr3;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f265780a;

    /* renamed from: b, reason: collision with root package name */
    public long f265781b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f265782c;

    /* renamed from: d, reason: collision with root package name */
    public final long f265783d;

    public a(java.lang.String userName, long j17, java.lang.String source, long j18, int i17, kotlin.jvm.internal.i iVar) {
        userName = (i17 & 1) != 0 ? "" : userName;
        j17 = (i17 & 2) != 0 ? 0L : j17;
        source = (i17 & 4) != 0 ? "" : source;
        j18 = (i17 & 8) != 0 ? 0L : j18;
        kotlin.jvm.internal.o.g(userName, "userName");
        kotlin.jvm.internal.o.g(source, "source");
        this.f265780a = userName;
        this.f265781b = j17;
        this.f265782c = source;
        this.f265783d = j18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fr3.a)) {
            return false;
        }
        fr3.a aVar = (fr3.a) obj;
        return kotlin.jvm.internal.o.b(this.f265780a, aVar.f265780a) && this.f265781b == aVar.f265781b && kotlin.jvm.internal.o.b(this.f265782c, aVar.f265782c) && this.f265783d == aVar.f265783d;
    }

    public int hashCode() {
        return (((((this.f265780a.hashCode() * 31) + java.lang.Long.hashCode(this.f265781b)) * 31) + this.f265782c.hashCode()) * 31) + java.lang.Long.hashCode(this.f265783d);
    }

    public java.lang.String toString() {
        return "ConversationData(userName=" + this.f265780a + ", conversationTime=" + this.f265781b + ", source=" + this.f265782c + ", addContactTime=" + this.f265783d + ')';
    }
}
