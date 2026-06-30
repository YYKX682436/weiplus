package mj3;

/* loaded from: classes14.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final int f327050a;

    /* renamed from: b, reason: collision with root package name */
    public final int f327051b;

    /* renamed from: c, reason: collision with root package name */
    public final int f327052c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f327053d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f327054e;

    public g(int i17, int i18, int i19, boolean z17, boolean z18) {
        this.f327050a = i17;
        this.f327051b = i18;
        this.f327052c = i19;
        this.f327053d = z17;
        this.f327054e = z18;
    }

    public static mj3.g a(mj3.g gVar, int i17, int i18, int i19, boolean z17, boolean z18, int i27, java.lang.Object obj) {
        if ((i27 & 1) != 0) {
            i17 = gVar.f327050a;
        }
        if ((i27 & 2) != 0) {
            i18 = gVar.f327051b;
        }
        int i28 = i18;
        if ((i27 & 4) != 0) {
            i19 = gVar.f327052c;
        }
        int i29 = i19;
        if ((i27 & 8) != 0) {
            z17 = gVar.f327053d;
        }
        boolean z19 = z17;
        if ((i27 & 16) != 0) {
            z18 = gVar.f327054e;
        }
        gVar.getClass();
        return new mj3.g(i17, i28, i29, z19, z18);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mj3.g)) {
            return false;
        }
        mj3.g gVar = (mj3.g) obj;
        return this.f327050a == gVar.f327050a && this.f327051b == gVar.f327051b && this.f327052c == gVar.f327052c && this.f327053d == gVar.f327053d && this.f327054e == gVar.f327054e;
    }

    public int hashCode() {
        return (((((((java.lang.Integer.hashCode(this.f327050a) * 31) + java.lang.Integer.hashCode(this.f327051b)) * 31) + java.lang.Integer.hashCode(this.f327052c)) * 31) + java.lang.Boolean.hashCode(this.f327053d)) * 31) + java.lang.Boolean.hashCode(this.f327054e);
    }

    public java.lang.String toString() {
        return "RenderInfo(width=" + this.f327050a + ", height=" + this.f327051b + ", rotate=" + this.f327052c + ", mirror=" + this.f327053d + ", centerCrop=" + this.f327054e + ')';
    }

    public /* synthetic */ g(int i17, int i18, int i19, boolean z17, boolean z18, int i27, kotlin.jvm.internal.i iVar) {
        this(i17, i18, i19, (i27 & 8) != 0 ? false : z17, (i27 & 16) != 0 ? true : z18);
    }
}
