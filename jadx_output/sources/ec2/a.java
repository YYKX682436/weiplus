package ec2;

/* loaded from: classes2.dex */
public final class a extends fc2.a {

    /* renamed from: d, reason: collision with root package name */
    public final int f250946d;

    /* renamed from: e, reason: collision with root package name */
    public final long f250947e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f250948f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.storage.FinderItem f250949g;

    /* renamed from: h, reason: collision with root package name */
    public ec2.c f250950h;

    public a(int i17, long j17, java.lang.String str) {
        this.f250946d = i17;
        this.f250947e = j17;
        this.f250948f = str;
        this.f250949g = ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).Vi(j17);
    }

    public final java.lang.String b() {
        return this.f250948f;
    }

    public final ec2.c c() {
        return this.f250950h;
    }

    public final long d() {
        return this.f250947e;
    }

    public final int e() {
        return this.f250946d;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ec2.a)) {
            return false;
        }
        ec2.a aVar = (ec2.a) obj;
        return this.f250946d == aVar.f250946d && this.f250947e == aVar.f250947e && kotlin.jvm.internal.o.b(this.f250948f, aVar.f250948f);
    }

    public int hashCode() {
        int hashCode = ((java.lang.Integer.hashCode(this.f250946d) * 31) + java.lang.Long.hashCode(this.f250947e)) * 31;
        java.lang.String str = this.f250948f;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public java.lang.String toString() {
        return "ActionEvent(type=" + this.f250946d + ", feedId=" + this.f250947e + ", dupFlag=" + this.f250948f + ')';
    }
}
