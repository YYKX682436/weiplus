package ov4;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f349236a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f349237b;

    /* renamed from: c, reason: collision with root package name */
    public final int f349238c;

    public h(int i17, java.lang.String title, int i18) {
        kotlin.jvm.internal.o.g(title, "title");
        this.f349236a = i17;
        this.f349237b = title;
        this.f349238c = i18;
    }

    public final java.lang.String a() {
        return this.f349236a + '|' + this.f349238c + '|' + fp.s0.b(this.f349237b, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ov4.h)) {
            return false;
        }
        ov4.h hVar = (ov4.h) obj;
        return this.f349236a == hVar.f349236a && kotlin.jvm.internal.o.b(this.f349237b, hVar.f349237b) && this.f349238c == hVar.f349238c;
    }

    public int hashCode() {
        return (((java.lang.Integer.hashCode(this.f349236a) * 31) + this.f349237b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f349238c);
    }

    public java.lang.String toString() {
        return "FTSTeachReportItemInfo(pos=" + this.f349236a + ", title=" + this.f349237b + ", type=" + this.f349238c + ')';
    }
}
