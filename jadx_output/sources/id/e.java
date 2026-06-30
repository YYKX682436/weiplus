package id;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final org.json.JSONObject f290448a;

    /* renamed from: b, reason: collision with root package name */
    public final int f290449b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f290450c;

    public e(org.json.JSONObject result, int i17, java.lang.String username) {
        kotlin.jvm.internal.o.g(result, "result");
        kotlin.jvm.internal.o.g(username, "username");
        this.f290448a = result;
        this.f290449b = i17;
        this.f290450c = username;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof id.e)) {
            return false;
        }
        id.e eVar = (id.e) obj;
        return kotlin.jvm.internal.o.b(this.f290448a, eVar.f290448a) && this.f290449b == eVar.f290449b && kotlin.jvm.internal.o.b(this.f290450c, eVar.f290450c);
    }

    public int hashCode() {
        return (((this.f290448a.hashCode() * 31) + java.lang.Integer.hashCode(this.f290449b)) * 31) + this.f290450c.hashCode();
    }

    public java.lang.String toString() {
        return "PocketMoneySelectResult(result=" + this.f290448a + ", status=" + this.f290449b + ", username=" + this.f290450c + ')';
    }
}
