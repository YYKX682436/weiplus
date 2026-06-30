package or;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f347418a;

    /* renamed from: b, reason: collision with root package name */
    public final int f347419b;

    /* renamed from: c, reason: collision with root package name */
    public final int f347420c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Integer f347421d;

    public a(int i17, int i18, int i19) {
        this(i17, i18, i19, null, 8, null);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof or.a)) {
            return false;
        }
        or.a aVar = (or.a) obj;
        return this.f347418a == aVar.f347418a && this.f347419b == aVar.f347419b && this.f347420c == aVar.f347420c && kotlin.jvm.internal.o.b(this.f347421d, aVar.f347421d);
    }

    public int hashCode() {
        int hashCode = ((((java.lang.Integer.hashCode(this.f347418a) * 31) + java.lang.Integer.hashCode(this.f347419b)) * 31) + java.lang.Integer.hashCode(this.f347420c)) * 31;
        java.lang.Integer num = this.f347421d;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public java.lang.String toString() {
        return "EditStickerInfoItem(picIndex=" + this.f347418a + ", editStickerSource=" + this.f347419b + ", editStickerType=" + this.f347420c + ", uploadSucc=" + this.f347421d + ')';
    }

    public a(int i17, int i18, int i19, java.lang.Integer num) {
        this.f347418a = i17;
        this.f347419b = i18;
        this.f347420c = i19;
        this.f347421d = num;
    }

    public /* synthetic */ a(int i17, int i18, int i19, java.lang.Integer num, int i27, kotlin.jvm.internal.i iVar) {
        this(i17, i18, (i27 & 4) != 0 ? 0 : i19, (i27 & 8) != 0 ? null : num);
    }
}
