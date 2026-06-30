package mm2;

/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public mm2.l f329149a;

    /* renamed from: b, reason: collision with root package name */
    public final r45.ce2 f329150b;

    public j(mm2.l playState, r45.ce2 adVideoInfo) {
        kotlin.jvm.internal.o.g(playState, "playState");
        kotlin.jvm.internal.o.g(adVideoInfo, "adVideoInfo");
        this.f329149a = playState;
        this.f329150b = adVideoInfo;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mm2.j)) {
            return false;
        }
        mm2.j jVar = (mm2.j) obj;
        return this.f329149a == jVar.f329149a && kotlin.jvm.internal.o.b(this.f329150b, jVar.f329150b);
    }

    public int hashCode() {
        return (this.f329149a.hashCode() * 31) + this.f329150b.hashCode();
    }

    public java.lang.String toString() {
        return "LivingAdVideoInfo(playState=" + this.f329149a + ", adVideoInfo=" + this.f329150b + ')';
    }
}
