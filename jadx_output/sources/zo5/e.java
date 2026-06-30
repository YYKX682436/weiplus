package zo5;

/* loaded from: classes14.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final int f474880a;

    /* renamed from: b, reason: collision with root package name */
    public final int f474881b;

    /* renamed from: c, reason: collision with root package name */
    public final int f474882c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f474883d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f474884e;

    /* renamed from: f, reason: collision with root package name */
    public final android.util.Size f474885f;

    public e(int i17, int i18, int i19, boolean z17, boolean z18, android.util.Size size, int i27, kotlin.jvm.internal.i iVar) {
        z17 = (i27 & 8) != 0 ? false : z17;
        z18 = (i27 & 16) != 0 ? true : z18;
        size = (i27 & 32) != 0 ? null : size;
        this.f474880a = i17;
        this.f474881b = i18;
        this.f474882c = i19;
        this.f474883d = z17;
        this.f474884e = z18;
        this.f474885f = size;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zo5.e)) {
            return false;
        }
        zo5.e eVar = (zo5.e) obj;
        return this.f474880a == eVar.f474880a && this.f474881b == eVar.f474881b && this.f474882c == eVar.f474882c && this.f474883d == eVar.f474883d && this.f474884e == eVar.f474884e && kotlin.jvm.internal.o.b(this.f474885f, eVar.f474885f);
    }

    public int hashCode() {
        int hashCode = ((((((((java.lang.Integer.hashCode(this.f474880a) * 31) + java.lang.Integer.hashCode(this.f474881b)) * 31) + java.lang.Integer.hashCode(this.f474882c)) * 31) + java.lang.Boolean.hashCode(this.f474883d)) * 31) + java.lang.Boolean.hashCode(this.f474884e)) * 31;
        android.util.Size size = this.f474885f;
        return hashCode + (size == null ? 0 : size.hashCode());
    }

    public java.lang.String toString() {
        return "RenderInfo(width=" + this.f474880a + ", height=" + this.f474881b + ", rotate=" + this.f474882c + ", mirror=" + this.f474883d + ", centerCrop=" + this.f474884e + ", realSize=" + this.f474885f + ')';
    }
}
