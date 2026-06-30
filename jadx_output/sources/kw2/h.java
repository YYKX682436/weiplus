package kw2;

/* loaded from: classes15.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public boolean f313017a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f313018b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f313019c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f313020d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f313021e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f313022f;

    public h(boolean z17, boolean z18, boolean z19, boolean z27, boolean z28, java.util.ArrayList playItemList) {
        kotlin.jvm.internal.o.g(playItemList, "playItemList");
        this.f313017a = z17;
        this.f313018b = z18;
        this.f313019c = z19;
        this.f313020d = z27;
        this.f313021e = z28;
        this.f313022f = playItemList;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kw2.h)) {
            return false;
        }
        kw2.h hVar = (kw2.h) obj;
        return this.f313017a == hVar.f313017a && this.f313018b == hVar.f313018b && this.f313019c == hVar.f313019c && this.f313020d == hVar.f313020d && this.f313021e == hVar.f313021e && kotlin.jvm.internal.o.b(this.f313022f, hVar.f313022f);
    }

    public int hashCode() {
        return (((((((((java.lang.Boolean.hashCode(this.f313017a) * 31) + java.lang.Boolean.hashCode(this.f313018b)) * 31) + java.lang.Boolean.hashCode(this.f313019c)) * 31) + java.lang.Boolean.hashCode(this.f313020d)) * 31) + java.lang.Boolean.hashCode(this.f313021e)) * 31) + this.f313022f.hashCode();
    }

    public java.lang.String toString() {
        return "PlaySession(hitPrepare=" + this.f313017a + ", hitStart=" + this.f313018b + ", hitStop=" + this.f313019c + ", allFileDownloadComplete=" + this.f313020d + ", onlyPreRender=" + this.f313021e + ", playItemList=" + this.f313022f + ')';
    }
}
