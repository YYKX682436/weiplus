package hj4;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f281659a;

    public a(java.lang.String str) {
        this.f281659a = str;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hj4.a) && kotlin.jvm.internal.o.b(this.f281659a, ((hj4.a) obj).f281659a);
    }

    public int hashCode() {
        java.lang.String str = this.f281659a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public java.lang.String toString() {
        return "NewMsgInfo(sessionId=" + this.f281659a + ')';
    }
}
