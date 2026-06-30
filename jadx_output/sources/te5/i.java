package te5;

/* loaded from: classes9.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f418669a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f418670b;

    /* renamed from: c, reason: collision with root package name */
    public int f418671c;

    /* renamed from: d, reason: collision with root package name */
    public int f418672d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f418673e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f418674f;

    /* renamed from: g, reason: collision with root package name */
    public int f418675g;

    public i(int i17) {
        this.f418669a = i17;
        this.f418672d = com.tencent.mm.R.raw.unknown_default_light;
        this.f418673e = "";
        this.f418674f = "";
        this.f418675g = com.tencent.mm.R.color.f478873jj;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof te5.i) && this.f418669a == ((te5.i) obj).f418669a;
    }

    public int hashCode() {
        return java.lang.Integer.hashCode(this.f418669a);
    }

    public java.lang.String toString() {
        return "FavFileBubbleModel(fileBubbleStatus=" + this.f418669a + ')';
    }

    public /* synthetic */ i(int i17, int i18, kotlin.jvm.internal.i iVar) {
        this((i18 & 1) != 0 ? 0 : i17);
    }
}
