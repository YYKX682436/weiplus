package v11;

/* loaded from: classes11.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f432318a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f432319b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f432320c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f432321d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f432322e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f432323f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f432324g;

    /* renamed from: h, reason: collision with root package name */
    public final v11.s f432325h;

    public a(java.lang.String text, boolean z17, boolean z18, boolean z19, java.lang.String str, boolean z27, boolean z28, v11.s sVar) {
        kotlin.jvm.internal.o.g(text, "text");
        this.f432318a = text;
        this.f432319b = z17;
        this.f432320c = z18;
        this.f432321d = z19;
        this.f432322e = str;
        this.f432323f = z27;
        this.f432324g = z28;
        this.f432325h = sVar;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v11.a)) {
            return false;
        }
        v11.a aVar = (v11.a) obj;
        return kotlin.jvm.internal.o.b(this.f432318a, aVar.f432318a) && this.f432319b == aVar.f432319b && this.f432320c == aVar.f432320c && this.f432321d == aVar.f432321d && kotlin.jvm.internal.o.b(this.f432322e, aVar.f432322e) && this.f432323f == aVar.f432323f && this.f432324g == aVar.f432324g && kotlin.jvm.internal.o.b(this.f432325h, aVar.f432325h);
    }

    public int hashCode() {
        int hashCode = ((((((this.f432318a.hashCode() * 31) + java.lang.Boolean.hashCode(this.f432319b)) * 31) + java.lang.Boolean.hashCode(this.f432320c)) * 31) + java.lang.Boolean.hashCode(this.f432321d)) * 31;
        java.lang.String str = this.f432322e;
        int hashCode2 = (((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Boolean.hashCode(this.f432323f)) * 31) + java.lang.Boolean.hashCode(this.f432324g)) * 31;
        v11.s sVar = this.f432325h;
        return hashCode2 + (sVar != null ? sVar.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "InlineTextRunUiModel(text=" + this.f432318a + ", bold=" + this.f432319b + ", italic=" + this.f432320c + ", strikethrough=" + this.f432321d + ", linkUrl=" + this.f432322e + ", isInlineCode=" + this.f432323f + ", isInlineMath=" + this.f432324g + ", sourceRange=" + this.f432325h + ')';
    }
}
