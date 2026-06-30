package fc2;

/* loaded from: classes2.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final so2.j5 f260977a;

    /* renamed from: b, reason: collision with root package name */
    public final int f260978b;

    /* renamed from: c, reason: collision with root package name */
    public in5.v0 f260979c;

    public r(so2.j5 feed, int i17, in5.v0 v0Var, int i18, kotlin.jvm.internal.i iVar) {
        v0Var = (i18 & 4) != 0 ? null : v0Var;
        kotlin.jvm.internal.o.g(feed, "feed");
        this.f260977a = feed;
        this.f260978b = i17;
        this.f260979c = v0Var;
    }

    public final int a() {
        return this.f260978b;
    }

    public final so2.j5 b() {
        return this.f260977a;
    }

    public final in5.v0 c() {
        return this.f260979c;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fc2.r)) {
            return false;
        }
        fc2.r rVar = (fc2.r) obj;
        return kotlin.jvm.internal.o.b(this.f260977a, rVar.f260977a) && this.f260978b == rVar.f260978b && kotlin.jvm.internal.o.b(this.f260979c, rVar.f260979c);
    }

    public int hashCode() {
        int hashCode = ((this.f260977a.hashCode() * 31) + java.lang.Integer.hashCode(this.f260978b)) * 31;
        in5.v0 v0Var = this.f260979c;
        return hashCode + (v0Var == null ? 0 : v0Var.hashCode());
    }

    public java.lang.String toString() {
        return "FlowScrollEventFeedData(feed=" + this.f260977a + ", dataPos=" + this.f260978b + ", showInfo=" + this.f260979c + ')';
    }
}
