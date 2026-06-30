package lf4;

/* loaded from: classes4.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f318438a;

    /* renamed from: b, reason: collision with root package name */
    public int f318439b;

    /* renamed from: c, reason: collision with root package name */
    public java.util.ArrayList f318440c;

    /* renamed from: d, reason: collision with root package name */
    public int f318441d;

    public m(java.lang.String username, int i17, java.util.ArrayList items, int i18, int i19, kotlin.jvm.internal.i iVar) {
        if ((i19 & 8) != 0) {
            int e17 = c01.id.e();
            ef4.n.f252460a.a();
            i18 = e17 - 86400;
        }
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(items, "items");
        this.f318438a = username;
        this.f318439b = i17;
        this.f318440c = items;
        this.f318441d = i18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lf4.m)) {
            return false;
        }
        lf4.m mVar = (lf4.m) obj;
        return kotlin.jvm.internal.o.b(this.f318438a, mVar.f318438a) && this.f318439b == mVar.f318439b && kotlin.jvm.internal.o.b(this.f318440c, mVar.f318440c) && this.f318441d == mVar.f318441d;
    }

    public int hashCode() {
        return (((((this.f318438a.hashCode() * 31) + java.lang.Integer.hashCode(this.f318439b)) * 31) + this.f318440c.hashCode()) * 31) + java.lang.Integer.hashCode(this.f318441d);
    }

    public java.lang.String toString() {
        return "UserData(username=" + this.f318438a + ", state=" + this.f318439b + ", items=" + this.f318440c + ", timestampBound=" + this.f318441d + ')';
    }
}
