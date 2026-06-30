package sw0;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final r45.ol5 f413412a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f413413b;

    public a(r45.ol5 titleInfo, boolean z17) {
        kotlin.jvm.internal.o.g(titleInfo, "titleInfo");
        this.f413412a = titleInfo;
        this.f413413b = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sw0.a)) {
            return false;
        }
        sw0.a aVar = (sw0.a) obj;
        return kotlin.jvm.internal.o.b(this.f413412a, aVar.f413412a) && this.f413413b == aVar.f413413b;
    }

    public int hashCode() {
        return (this.f413412a.hashCode() * 31) + java.lang.Boolean.hashCode(this.f413413b);
    }

    public java.lang.String toString() {
        return "RecommendTitleItem(titleInfo=" + this.f413412a + ", selected=" + this.f413413b + ')';
    }
}
