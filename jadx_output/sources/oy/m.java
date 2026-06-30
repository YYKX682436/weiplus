package oy;

/* loaded from: classes5.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f349830a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Boolean f349831b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f349832c;

    public m(java.lang.String text, java.lang.Boolean bool, java.util.List consumedMessages) {
        kotlin.jvm.internal.o.g(text, "text");
        kotlin.jvm.internal.o.g(consumedMessages, "consumedMessages");
        this.f349830a = text;
        this.f349831b = bool;
        this.f349832c = consumedMessages;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oy.m)) {
            return false;
        }
        oy.m mVar = (oy.m) obj;
        return kotlin.jvm.internal.o.b(this.f349830a, mVar.f349830a) && kotlin.jvm.internal.o.b(this.f349831b, mVar.f349831b) && kotlin.jvm.internal.o.b(this.f349832c, mVar.f349832c);
    }

    public int hashCode() {
        int hashCode = this.f349830a.hashCode() * 31;
        java.lang.Boolean bool = this.f349831b;
        return ((hashCode + (bool == null ? 0 : bool.hashCode())) * 31) + this.f349832c.hashCode();
    }

    public java.lang.String toString() {
        return "ReadableMessageResult(text=" + this.f349830a + ", isSaid=" + this.f349831b + ", consumedMessages=" + this.f349832c + ')';
    }
}
