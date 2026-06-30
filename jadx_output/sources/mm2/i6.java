package mm2;

/* loaded from: classes10.dex */
public final class i6 extends mm2.j6 {

    /* renamed from: a, reason: collision with root package name */
    public final r45.z22 f329141a;

    /* renamed from: b, reason: collision with root package name */
    public final om2.p f329142b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f329143c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i6(r45.z22 songInfo, om2.p pVar, boolean z17) {
        super(null);
        kotlin.jvm.internal.o.g(songInfo, "songInfo");
        this.f329141a = songInfo;
        this.f329142b = pVar;
        this.f329143c = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mm2.i6)) {
            return false;
        }
        mm2.i6 i6Var = (mm2.i6) obj;
        return kotlin.jvm.internal.o.b(this.f329141a, i6Var.f329141a) && kotlin.jvm.internal.o.b(this.f329142b, i6Var.f329142b) && this.f329143c == i6Var.f329143c;
    }

    public int hashCode() {
        int hashCode = this.f329141a.hashCode() * 31;
        om2.p pVar = this.f329142b;
        return ((hashCode + (pVar == null ? 0 : pVar.hashCode())) * 31) + java.lang.Boolean.hashCode(this.f329143c);
    }

    public java.lang.String toString() {
        return "Singing(songInfo=" + this.f329141a + ", lyricsResource=" + this.f329142b + ", hasOriginal=" + this.f329143c + ')';
    }
}
