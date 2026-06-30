package ml2;

/* loaded from: classes3.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final r45.mu2 f327513a;

    /* renamed from: b, reason: collision with root package name */
    public final int f327514b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f327515c;

    /* renamed from: d, reason: collision with root package name */
    public final ml2.x1 f327516d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f327517e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f327518f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f327519g;

    public h0(r45.mu2 contact, int i17, java.lang.String feedId, ml2.x1 actionType, java.lang.String commentscene, boolean z17, java.lang.String nickName) {
        kotlin.jvm.internal.o.g(contact, "contact");
        kotlin.jvm.internal.o.g(feedId, "feedId");
        kotlin.jvm.internal.o.g(actionType, "actionType");
        kotlin.jvm.internal.o.g(commentscene, "commentscene");
        kotlin.jvm.internal.o.g(nickName, "nickName");
        this.f327513a = contact;
        this.f327514b = i17;
        this.f327515c = feedId;
        this.f327516d = actionType;
        this.f327517e = commentscene;
        this.f327518f = z17;
        this.f327519g = nickName;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ml2.h0)) {
            return false;
        }
        ml2.h0 h0Var = (ml2.h0) obj;
        return kotlin.jvm.internal.o.b(this.f327513a, h0Var.f327513a) && this.f327514b == h0Var.f327514b && kotlin.jvm.internal.o.b(this.f327515c, h0Var.f327515c) && this.f327516d == h0Var.f327516d && kotlin.jvm.internal.o.b(this.f327517e, h0Var.f327517e) && this.f327518f == h0Var.f327518f && kotlin.jvm.internal.o.b(this.f327519g, h0Var.f327519g);
    }

    public int hashCode() {
        return (((((((((((this.f327513a.hashCode() * 31) + java.lang.Integer.hashCode(this.f327514b)) * 31) + this.f327515c.hashCode()) * 31) + this.f327516d.hashCode()) * 31) + this.f327517e.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f327518f)) * 31) + this.f327519g.hashCode();
    }

    public java.lang.String toString() {
        return "HellLiveMixSearchItem(contact=" + this.f327513a + ", pos=" + this.f327514b + ", feedId=" + this.f327515c + ", actionType=" + this.f327516d + ", commentscene=" + this.f327517e + ", liveStatus=" + this.f327518f + ", nickName=" + this.f327519g + ')';
    }
}
