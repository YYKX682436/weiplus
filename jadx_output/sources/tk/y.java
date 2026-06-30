package tk;

/* loaded from: classes4.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f419886a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f419887b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f419888c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f419889d;

    /* renamed from: e, reason: collision with root package name */
    public final float f419890e;

    /* renamed from: f, reason: collision with root package name */
    public final float f419891f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f419892g;

    public y(java.util.List list, java.lang.String content, java.lang.String poiName, java.lang.String poiAddress, float f17, float f18, java.lang.String poiId) {
        kotlin.jvm.internal.o.g(content, "content");
        kotlin.jvm.internal.o.g(poiName, "poiName");
        kotlin.jvm.internal.o.g(poiAddress, "poiAddress");
        kotlin.jvm.internal.o.g(poiId, "poiId");
        this.f419886a = list;
        this.f419887b = content;
        this.f419888c = poiName;
        this.f419889d = poiAddress;
        this.f419890e = f17;
        this.f419891f = f18;
        this.f419892g = poiId;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tk.y)) {
            return false;
        }
        tk.y yVar = (tk.y) obj;
        return kotlin.jvm.internal.o.b(this.f419886a, yVar.f419886a) && kotlin.jvm.internal.o.b(this.f419887b, yVar.f419887b) && kotlin.jvm.internal.o.b(this.f419888c, yVar.f419888c) && kotlin.jvm.internal.o.b(this.f419889d, yVar.f419889d) && java.lang.Float.compare(this.f419890e, yVar.f419890e) == 0 && java.lang.Float.compare(this.f419891f, yVar.f419891f) == 0 && kotlin.jvm.internal.o.b(this.f419892g, yVar.f419892g);
    }

    public int hashCode() {
        java.util.List list = this.f419886a;
        return ((((((((((((list == null ? 0 : list.hashCode()) * 31) + this.f419887b.hashCode()) * 31) + this.f419888c.hashCode()) * 31) + this.f419889d.hashCode()) * 31) + java.lang.Float.hashCode(this.f419890e)) * 31) + java.lang.Float.hashCode(this.f419891f)) * 31) + this.f419892g.hashCode();
    }

    public java.lang.String toString() {
        return "SnsPublishedInfo(photos=" + this.f419886a + ", content=" + this.f419887b + ", poiName=" + this.f419888c + ", poiAddress=" + this.f419889d + ", longitude=" + this.f419890e + ", latitude=" + this.f419891f + ", poiId=" + this.f419892g + ')';
    }
}
