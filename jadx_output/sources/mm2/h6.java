package mm2;

/* loaded from: classes10.dex */
public final class h6 extends mm2.j6 {

    /* renamed from: a, reason: collision with root package name */
    public final r45.z22 f329113a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h6(r45.z22 songInfo) {
        super(null);
        kotlin.jvm.internal.o.g(songInfo, "songInfo");
        this.f329113a = songInfo;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mm2.h6) && kotlin.jvm.internal.o.b(this.f329113a, ((mm2.h6) obj).f329113a);
    }

    public int hashCode() {
        return this.f329113a.hashCode();
    }

    public java.lang.String toString() {
        return "Preparing(songInfo=" + this.f329113a + ')';
    }
}
