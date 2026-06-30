package mv0;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final mv0.b f331527a;

    /* renamed from: b, reason: collision with root package name */
    public final int f331528b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f331529c;

    public a(mv0.b ratio, int i17, boolean z17) {
        kotlin.jvm.internal.o.g(ratio, "ratio");
        this.f331527a = ratio;
        this.f331528b = i17;
        this.f331529c = z17;
    }

    public static mv0.a a(mv0.a aVar, mv0.b ratio, int i17, boolean z17, int i18, java.lang.Object obj) {
        if ((i18 & 1) != 0) {
            ratio = aVar.f331527a;
        }
        if ((i18 & 2) != 0) {
            i17 = aVar.f331528b;
        }
        if ((i18 & 4) != 0) {
            z17 = aVar.f331529c;
        }
        aVar.getClass();
        kotlin.jvm.internal.o.g(ratio, "ratio");
        return new mv0.a(ratio, i17, z17);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mv0.a)) {
            return false;
        }
        mv0.a aVar = (mv0.a) obj;
        return kotlin.jvm.internal.o.b(this.f331527a, aVar.f331527a) && this.f331528b == aVar.f331528b && this.f331529c == aVar.f331529c;
    }

    public int hashCode() {
        return (((this.f331527a.hashCode() * 31) + java.lang.Integer.hashCode(this.f331528b)) * 31) + java.lang.Boolean.hashCode(this.f331529c);
    }

    public java.lang.String toString() {
        return "CanvasAspectRatioInfo(ratio=" + this.f331527a + ", iconRes=" + this.f331528b + ", isSelected=" + this.f331529c + ')';
    }

    public /* synthetic */ a(mv0.b bVar, int i17, boolean z17, int i18, kotlin.jvm.internal.i iVar) {
        this(bVar, i17, (i18 & 4) != 0 ? false : z17);
    }
}
