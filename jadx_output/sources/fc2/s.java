package fc2;

/* loaded from: classes2.dex */
public final class s extends fc2.a {

    /* renamed from: d, reason: collision with root package name */
    public final int f260980d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.model.BaseFinderFeed f260981e;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f260983g;

    /* renamed from: f, reason: collision with root package name */
    public long f260982f = -1;

    /* renamed from: h, reason: collision with root package name */
    public long f260984h = -1;

    public s(int i17) {
        this.f260980d = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fc2.s) && this.f260980d == ((fc2.s) obj).f260980d;
    }

    public int hashCode() {
        return java.lang.Integer.hashCode(this.f260980d);
    }

    public java.lang.String toString() {
        return "HorizontalVideoEvent(actionType=" + this.f260980d + ')';
    }
}
