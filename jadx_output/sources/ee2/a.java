package ee2;

/* loaded from: classes3.dex */
public final class a implements he2.b {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f251580d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f251581e;

    /* renamed from: f, reason: collision with root package name */
    public final long f251582f;

    /* renamed from: g, reason: collision with root package name */
    public final he2.b f251583g;

    public a(java.lang.String groupId, java.lang.String groupName, long j17, he2.b commentView) {
        kotlin.jvm.internal.o.g(groupId, "groupId");
        kotlin.jvm.internal.o.g(groupName, "groupName");
        kotlin.jvm.internal.o.g(commentView, "commentView");
        this.f251580d = groupId;
        this.f251581e = groupName;
        this.f251582f = j17;
        this.f251583g = commentView;
    }

    @Override // he2.b
    public android.view.View W() {
        return this.f251583g.W();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ee2.a)) {
            return false;
        }
        ee2.a aVar = (ee2.a) obj;
        return kotlin.jvm.internal.o.b(this.f251580d, aVar.f251580d) && kotlin.jvm.internal.o.b(this.f251581e, aVar.f251581e) && this.f251582f == aVar.f251582f && kotlin.jvm.internal.o.b(this.f251583g, aVar.f251583g);
    }

    public int hashCode() {
        return (((((this.f251580d.hashCode() * 31) + this.f251581e.hashCode()) * 31) + java.lang.Long.hashCode(this.f251582f)) * 31) + this.f251583g.hashCode();
    }

    @Override // he2.b
    public void j(boolean z17) {
        this.f251583g.j(z17);
    }

    public java.lang.String toString() {
        return "ViewPagerItemSelect(groupId=" + this.f251580d + ", groupName=" + this.f251581e + ", lastEnterTimeStamp=" + this.f251582f + ", commentView=" + this.f251583g + ')';
    }

    @Override // he2.b
    public void w(int i17) {
        this.f251583g.w(i17);
    }
}
