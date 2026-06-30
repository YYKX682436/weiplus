package fo0;

/* loaded from: classes11.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f264841a;

    /* renamed from: b, reason: collision with root package name */
    public final int f264842b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f264843c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f264844d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f264845e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f264846f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.Bitmap f264847g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f264848h;

    public s(boolean z17, int i17, boolean z18, boolean z19, boolean z27, java.lang.String str, android.graphics.Bitmap bitmap, boolean z28, int i18, kotlin.jvm.internal.i iVar) {
        z17 = (i18 & 1) != 0 ? true : z17;
        i17 = (i18 & 2) != 0 ? -1 : i17;
        z18 = (i18 & 4) != 0 ? true : z18;
        z19 = (i18 & 8) != 0 ? true : z19;
        z27 = (i18 & 16) != 0 ? true : z27;
        str = (i18 & 32) != 0 ? null : str;
        bitmap = (i18 & 64) != 0 ? null : bitmap;
        z28 = (i18 & 128) != 0 ? false : z28;
        this.f264841a = z17;
        this.f264842b = i17;
        this.f264843c = z18;
        this.f264844d = z19;
        this.f264845e = z27;
        this.f264846f = str;
        this.f264847g = bitmap;
        this.f264848h = z28;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fo0.s)) {
            return false;
        }
        fo0.s sVar = (fo0.s) obj;
        return this.f264841a == sVar.f264841a && this.f264842b == sVar.f264842b && this.f264843c == sVar.f264843c && this.f264844d == sVar.f264844d && this.f264845e == sVar.f264845e && kotlin.jvm.internal.o.b(this.f264846f, sVar.f264846f) && kotlin.jvm.internal.o.b(this.f264847g, sVar.f264847g) && this.f264848h == sVar.f264848h;
    }

    public int hashCode() {
        int hashCode = ((((((((java.lang.Boolean.hashCode(this.f264841a) * 31) + java.lang.Integer.hashCode(this.f264842b)) * 31) + java.lang.Boolean.hashCode(this.f264843c)) * 31) + java.lang.Boolean.hashCode(this.f264844d)) * 31) + java.lang.Boolean.hashCode(this.f264845e)) * 31;
        java.lang.String str = this.f264846f;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        android.graphics.Bitmap bitmap = this.f264847g;
        return ((hashCode2 + (bitmap != null ? bitmap.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.f264848h);
    }

    public java.lang.String toString() {
        return "MiniWindowInfo(isPlaying=" + this.f264841a + ", showBtnColor=" + this.f264842b + ", enablePlayButton=" + this.f264843c + ", showPlayButton=" + this.f264844d + ", showDeleteButton=" + this.f264845e + ", coverUrl=" + this.f264846f + ", bitmap=" + this.f264847g + ", isAudioOnlyMode=" + this.f264848h + ')';
    }
}
