package ek4;

/* loaded from: classes10.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f253624a;

    /* renamed from: b, reason: collision with root package name */
    public final int f253625b;

    /* renamed from: c, reason: collision with root package name */
    public final int f253626c;

    /* renamed from: d, reason: collision with root package name */
    public final int f253627d;

    /* renamed from: e, reason: collision with root package name */
    public final long f253628e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f253629f;

    /* renamed from: g, reason: collision with root package name */
    public final int f253630g;

    public b(int i17, int i18, int i19, int i27, long j17, java.lang.String desc, int i28) {
        kotlin.jvm.internal.o.g(desc, "desc");
        this.f253624a = i17;
        this.f253625b = i18;
        this.f253626c = i19;
        this.f253627d = i27;
        this.f253628e = j17;
        this.f253629f = desc;
        this.f253630g = i28;
    }

    public static ek4.b a(ek4.b bVar, int i17, int i18, int i19, int i27, long j17, java.lang.String str, int i28, int i29, java.lang.Object obj) {
        int i37 = (i29 & 1) != 0 ? bVar.f253624a : i17;
        int i38 = (i29 & 2) != 0 ? bVar.f253625b : i18;
        int i39 = (i29 & 4) != 0 ? bVar.f253626c : i19;
        int i47 = (i29 & 8) != 0 ? bVar.f253627d : i27;
        long j18 = (i29 & 16) != 0 ? bVar.f253628e : j17;
        java.lang.String desc = (i29 & 32) != 0 ? bVar.f253629f : str;
        int i48 = (i29 & 64) != 0 ? bVar.f253630g : i28;
        bVar.getClass();
        kotlin.jvm.internal.o.g(desc, "desc");
        return new ek4.b(i37, i38, i39, i47, j18, desc, i48);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ek4.b)) {
            return false;
        }
        ek4.b bVar = (ek4.b) obj;
        return this.f253624a == bVar.f253624a && this.f253625b == bVar.f253625b && this.f253626c == bVar.f253626c && this.f253627d == bVar.f253627d && this.f253628e == bVar.f253628e && kotlin.jvm.internal.o.b(this.f253629f, bVar.f253629f) && this.f253630g == bVar.f253630g;
    }

    public int hashCode() {
        return (((((((((((java.lang.Integer.hashCode(this.f253624a) * 31) + java.lang.Integer.hashCode(this.f253625b)) * 31) + java.lang.Integer.hashCode(this.f253626c)) * 31) + java.lang.Integer.hashCode(this.f253627d)) * 31) + java.lang.Long.hashCode(this.f253628e)) * 31) + this.f253629f.hashCode()) * 31) + java.lang.Integer.hashCode(this.f253630g);
    }

    public java.lang.String toString() {
        return "CdnTaskContext(actionType=" + this.f253624a + ", downloadType=" + this.f253625b + ", commentScene=" + this.f253626c + ", downloadStrategy=" + this.f253627d + ", durationMs=" + this.f253628e + ", desc=" + this.f253629f + ", preloadStage=" + this.f253630g + ')';
    }

    public /* synthetic */ b(int i17, int i18, int i19, int i27, long j17, java.lang.String str, int i28, int i29, kotlin.jvm.internal.i iVar) {
        this(i17, i18, i19, i27, (i29 & 16) != 0 ? 0L : j17, (i29 & 32) != 0 ? "" : str, (i29 & 64) != 0 ? 0 : i28);
    }

    public b() {
        this(-1, -1, -1, -1, -1L, "", 0, 64, null);
    }
}
