package sm2;

/* loaded from: classes3.dex */
public final class m9 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Integer f409576a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Integer f409577b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.a f409578c;

    /* renamed from: d, reason: collision with root package name */
    public final yz5.l f409579d;

    public m9(java.lang.Integer num, java.lang.Integer num2, yz5.a init, yz5.l lVar) {
        kotlin.jvm.internal.o.g(init, "init");
        this.f409576a = num;
        this.f409577b = num2;
        this.f409578c = init;
        this.f409579d = lVar;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sm2.m9)) {
            return false;
        }
        sm2.m9 m9Var = (sm2.m9) obj;
        return kotlin.jvm.internal.o.b(this.f409576a, m9Var.f409576a) && kotlin.jvm.internal.o.b(this.f409577b, m9Var.f409577b) && kotlin.jvm.internal.o.b(this.f409578c, m9Var.f409578c) && kotlin.jvm.internal.o.b(this.f409579d, m9Var.f409579d);
    }

    public int hashCode() {
        java.lang.Integer num = this.f409576a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        java.lang.Integer num2 = this.f409577b;
        int hashCode2 = (((hashCode + (num2 == null ? 0 : num2.hashCode())) * 31) + this.f409578c.hashCode()) * 31;
        yz5.l lVar = this.f409579d;
        return hashCode2 + (lVar != null ? lVar.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "PluginConfig(stubId=" + this.f409576a + ", defaultVisibility=" + this.f409577b + ", init=" + this.f409578c + ", afterInit=" + this.f409579d + ')';
    }
}
