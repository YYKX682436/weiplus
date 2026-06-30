package g31;

/* loaded from: classes9.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f268061a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f268062b;

    /* renamed from: c, reason: collision with root package name */
    public final int f268063c;

    /* renamed from: d, reason: collision with root package name */
    public final int f268064d;

    /* renamed from: e, reason: collision with root package name */
    public e31.i f268065e;

    public b(java.lang.String bizUsername, java.lang.String templateId, int i17, int i18) {
        kotlin.jvm.internal.o.g(bizUsername, "bizUsername");
        kotlin.jvm.internal.o.g(templateId, "templateId");
        this.f268061a = bizUsername;
        this.f268062b = templateId;
        this.f268063c = i17;
        this.f268064d = i18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g31.b)) {
            return false;
        }
        g31.b bVar = (g31.b) obj;
        return kotlin.jvm.internal.o.b(this.f268061a, bVar.f268061a) && kotlin.jvm.internal.o.b(this.f268062b, bVar.f268062b) && this.f268063c == bVar.f268063c && this.f268064d == bVar.f268064d;
    }

    public int hashCode() {
        return (((((this.f268061a.hashCode() * 31) + this.f268062b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f268063c)) * 31) + java.lang.Integer.hashCode(this.f268064d);
    }

    public java.lang.String toString() {
        return "UpdateSubscribeStatusTask(bizUsername=" + this.f268061a + ", templateId=" + this.f268062b + ", uiStatus=" + this.f268063c + ", businessType=" + this.f268064d + ')';
    }
}
