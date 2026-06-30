package tt2;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final so2.j5 f421872a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f421873b;

    public e(so2.j5 shopItem, boolean z17, int i17, kotlin.jvm.internal.i iVar) {
        z17 = (i17 & 2) != 0 ? false : z17;
        kotlin.jvm.internal.o.g(shopItem, "shopItem");
        this.f421872a = shopItem;
        this.f421873b = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tt2.e)) {
            return false;
        }
        tt2.e eVar = (tt2.e) obj;
        return kotlin.jvm.internal.o.b(this.f421872a, eVar.f421872a) && this.f421873b == eVar.f421873b;
    }

    public int hashCode() {
        return (this.f421872a.hashCode() * 31) + java.lang.Boolean.hashCode(this.f421873b);
    }

    public java.lang.String toString() {
        return "EditData(shopItem=" + this.f421872a + ", select=" + this.f421873b + ')';
    }
}
