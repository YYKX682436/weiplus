package ml2;

/* loaded from: classes3.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final so2.v1 f327469a;

    /* renamed from: b, reason: collision with root package name */
    public final int f327470b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f327471c;

    /* renamed from: d, reason: collision with root package name */
    public final ml2.x1 f327472d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f327473e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f327474f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f327475g;

    public g0(so2.v1 feed, int i17, java.lang.String feedId, ml2.x1 actionType, java.lang.String commentscene, boolean z17, java.lang.String nickName) {
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(feedId, "feedId");
        kotlin.jvm.internal.o.g(actionType, "actionType");
        kotlin.jvm.internal.o.g(commentscene, "commentscene");
        kotlin.jvm.internal.o.g(nickName, "nickName");
        this.f327469a = feed;
        this.f327470b = i17;
        this.f327471c = feedId;
        this.f327472d = actionType;
        this.f327473e = commentscene;
        this.f327474f = z17;
        this.f327475g = nickName;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ml2.g0)) {
            return false;
        }
        ml2.g0 g0Var = (ml2.g0) obj;
        return kotlin.jvm.internal.o.b(this.f327469a, g0Var.f327469a) && this.f327470b == g0Var.f327470b && kotlin.jvm.internal.o.b(this.f327471c, g0Var.f327471c) && this.f327472d == g0Var.f327472d && kotlin.jvm.internal.o.b(this.f327473e, g0Var.f327473e) && this.f327474f == g0Var.f327474f && kotlin.jvm.internal.o.b(this.f327475g, g0Var.f327475g);
    }

    public int hashCode() {
        return (((((((((((this.f327469a.hashCode() * 31) + java.lang.Integer.hashCode(this.f327470b)) * 31) + this.f327471c.hashCode()) * 31) + this.f327472d.hashCode()) * 31) + this.f327473e.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f327474f)) * 31) + this.f327475g.hashCode();
    }

    public java.lang.String toString() {
        return "HellLiveItem(feed=" + this.f327469a + ", pos=" + this.f327470b + ", feedId=" + this.f327471c + ", actionType=" + this.f327472d + ", commentscene=" + this.f327473e + ", liveStatus=" + this.f327474f + ", nickName=" + this.f327475g + ')';
    }
}
