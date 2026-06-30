package pg5;

/* loaded from: classes12.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.CharSequence f354242a;

    /* renamed from: b, reason: collision with root package name */
    public final int f354243b;

    /* renamed from: c, reason: collision with root package name */
    public final int f354244c;

    /* renamed from: d, reason: collision with root package name */
    public final int f354245d;

    /* renamed from: e, reason: collision with root package name */
    public final int f354246e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f354247f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f354248g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f354249h;

    public a(java.lang.CharSequence source, int i17, int i18, int i19, int i27, boolean z17, boolean z18, boolean z19, int i28, kotlin.jvm.internal.i iVar) {
        i27 = (i28 & 16) != 0 ? 300 : i27;
        z17 = (i28 & 32) != 0 ? true : z17;
        z18 = (i28 & 64) != 0 ? false : z18;
        z19 = (i28 & 128) != 0 ? true : z19;
        kotlin.jvm.internal.o.g(source, "source");
        this.f354242a = source;
        this.f354243b = i17;
        this.f354244c = i18;
        this.f354245d = i19;
        this.f354246e = i27;
        this.f354247f = z17;
        this.f354248g = z18;
        this.f354249h = z19;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pg5.a)) {
            return false;
        }
        pg5.a aVar = (pg5.a) obj;
        return kotlin.jvm.internal.o.b(this.f354242a, aVar.f354242a) && this.f354243b == aVar.f354243b && this.f354244c == aVar.f354244c && this.f354245d == aVar.f354245d && this.f354246e == aVar.f354246e && this.f354247f == aVar.f354247f && this.f354248g == aVar.f354248g && this.f354249h == aVar.f354249h;
    }

    public int hashCode() {
        return (((((((((((((this.f354242a.hashCode() * 31) + java.lang.Integer.hashCode(this.f354243b)) * 31) + java.lang.Integer.hashCode(this.f354244c)) * 31) + java.lang.Integer.hashCode(this.f354245d)) * 31) + java.lang.Integer.hashCode(this.f354246e)) * 31) + java.lang.Boolean.hashCode(this.f354247f)) * 31) + java.lang.Boolean.hashCode(this.f354248g)) * 31) + java.lang.Boolean.hashCode(this.f354249h);
    }

    public java.lang.String toString() {
        return "EmojiProcessRequest(source=" + ((java.lang.Object) this.f354242a) + ", start=" + this.f354243b + ", end=" + this.f354244c + ", processEmojiType=" + this.f354245d + ", maxSysNum=" + this.f354246e + ", needGetResultSpan=" + this.f354247f + ", needClearExistEmojiSpan=" + this.f354248g + ", withSoftBank=" + this.f354249h + ')';
    }
}
