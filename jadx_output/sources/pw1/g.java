package pw1;

/* loaded from: classes14.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final int f358676a;

    /* renamed from: b, reason: collision with root package name */
    public final int f358677b;

    /* renamed from: c, reason: collision with root package name */
    public final int f358678c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f358679d;

    /* renamed from: e, reason: collision with root package name */
    public final int f358680e;

    public g(int i17, int i18, int i19, boolean z17, int i27) {
        this.f358676a = i17;
        this.f358677b = i18;
        this.f358678c = i19;
        this.f358679d = z17;
        this.f358680e = i27;
    }

    public static pw1.g a(pw1.g gVar, int i17, int i18, int i19, boolean z17, int i27, int i28, java.lang.Object obj) {
        if ((i28 & 1) != 0) {
            i17 = gVar.f358676a;
        }
        if ((i28 & 2) != 0) {
            i18 = gVar.f358677b;
        }
        int i29 = i18;
        if ((i28 & 4) != 0) {
            i19 = gVar.f358678c;
        }
        int i37 = i19;
        if ((i28 & 8) != 0) {
            z17 = gVar.f358679d;
        }
        boolean z18 = z17;
        if ((i28 & 16) != 0) {
            i27 = gVar.f358680e;
        }
        gVar.getClass();
        return new pw1.g(i17, i29, i37, z18, i27);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pw1.g)) {
            return false;
        }
        pw1.g gVar = (pw1.g) obj;
        return this.f358676a == gVar.f358676a && this.f358677b == gVar.f358677b && this.f358678c == gVar.f358678c && this.f358679d == gVar.f358679d && this.f358680e == gVar.f358680e;
    }

    public int hashCode() {
        return (((((((java.lang.Integer.hashCode(this.f358676a) * 31) + java.lang.Integer.hashCode(this.f358677b)) * 31) + java.lang.Integer.hashCode(this.f358678c)) * 31) + java.lang.Boolean.hashCode(this.f358679d)) * 31) + java.lang.Integer.hashCode(this.f358680e);
    }

    public java.lang.String toString() {
        return "RenderInfo(width=" + this.f358676a + ", height=" + this.f358677b + ", rotate=" + this.f358678c + ", mirror=" + this.f358679d + ", scaleType=" + this.f358680e + ')';
    }

    public /* synthetic */ g(int i17, int i18, int i19, boolean z17, int i27, int i28, kotlin.jvm.internal.i iVar) {
        this(i17, i18, i19, (i28 & 8) != 0 ? false : z17, (i28 & 16) != 0 ? 0 : i27);
    }
}
