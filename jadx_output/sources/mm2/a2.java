package mm2;

/* loaded from: classes3.dex */
public final class a2 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f328743a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f328744b;

    public a2(java.lang.Object msg, boolean z17) {
        kotlin.jvm.internal.o.g(msg, "msg");
        this.f328743a = msg;
        this.f328744b = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mm2.a2)) {
            return false;
        }
        mm2.a2 a2Var = (mm2.a2) obj;
        return kotlin.jvm.internal.o.b(this.f328743a, a2Var.f328743a) && this.f328744b == a2Var.f328744b;
    }

    public int hashCode() {
        return (this.f328743a.hashCode() * 31) + java.lang.Boolean.hashCode(this.f328744b);
    }

    public java.lang.String toString() {
        return "DanmakuMsg(msg=" + this.f328743a + ", mustShow=" + this.f328744b + ')';
    }
}
