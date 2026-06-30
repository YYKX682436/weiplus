package zy2;

/* loaded from: classes3.dex */
public final class nc {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f477495a;

    /* renamed from: b, reason: collision with root package name */
    public final long f477496b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f477497c;

    /* renamed from: d, reason: collision with root package name */
    public final r45.nw1 f477498d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f477499e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f477500f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.ImageView f477501g;

    /* renamed from: h, reason: collision with root package name */
    public final c50.e1 f477502h;

    public nc(java.lang.String objectUserName, long j17, java.lang.String objectNonceId, r45.nw1 nw1Var, java.lang.String sessionBuffer, java.lang.String nickName, android.widget.ImageView imageView, c50.e1 e1Var, int i17, kotlin.jvm.internal.i iVar) {
        imageView = (i17 & 64) != 0 ? null : imageView;
        e1Var = (i17 & 128) != 0 ? null : e1Var;
        kotlin.jvm.internal.o.g(objectUserName, "objectUserName");
        kotlin.jvm.internal.o.g(objectNonceId, "objectNonceId");
        kotlin.jvm.internal.o.g(sessionBuffer, "sessionBuffer");
        kotlin.jvm.internal.o.g(nickName, "nickName");
        this.f477495a = objectUserName;
        this.f477496b = j17;
        this.f477497c = objectNonceId;
        this.f477498d = nw1Var;
        this.f477499e = sessionBuffer;
        this.f477500f = nickName;
        this.f477501g = imageView;
        this.f477502h = e1Var;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zy2.nc)) {
            return false;
        }
        zy2.nc ncVar = (zy2.nc) obj;
        return kotlin.jvm.internal.o.b(this.f477495a, ncVar.f477495a) && this.f477496b == ncVar.f477496b && kotlin.jvm.internal.o.b(this.f477497c, ncVar.f477497c) && kotlin.jvm.internal.o.b(this.f477498d, ncVar.f477498d) && kotlin.jvm.internal.o.b(this.f477499e, ncVar.f477499e) && kotlin.jvm.internal.o.b(this.f477500f, ncVar.f477500f) && kotlin.jvm.internal.o.b(this.f477501g, ncVar.f477501g) && kotlin.jvm.internal.o.b(this.f477502h, ncVar.f477502h);
    }

    public int hashCode() {
        int hashCode = ((((this.f477495a.hashCode() * 31) + java.lang.Long.hashCode(this.f477496b)) * 31) + this.f477497c.hashCode()) * 31;
        r45.nw1 nw1Var = this.f477498d;
        int hashCode2 = (((((hashCode + (nw1Var == null ? 0 : nw1Var.hashCode())) * 31) + this.f477499e.hashCode()) * 31) + this.f477500f.hashCode()) * 31;
        android.widget.ImageView imageView = this.f477501g;
        int hashCode3 = (hashCode2 + (imageView == null ? 0 : imageView.hashCode())) * 31;
        c50.e1 e1Var = this.f477502h;
        return hashCode3 + (e1Var != null ? e1Var.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "LiveFluentFeedData(objectUserName=" + this.f477495a + ", feedId=" + this.f477496b + ", objectNonceId=" + this.f477497c + ", liveInfo=" + this.f477498d + ", sessionBuffer=" + this.f477499e + ", nickName=" + this.f477500f + ", thumbView=" + this.f477501g + ", config=" + this.f477502h + ')';
    }
}
