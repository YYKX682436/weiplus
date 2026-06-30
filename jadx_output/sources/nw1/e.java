package nw1;

/* loaded from: classes14.dex */
public final class e extends hw1.a {

    /* renamed from: a, reason: collision with root package name */
    public final pw1.g f340781a;

    /* renamed from: b, reason: collision with root package name */
    public final android.util.Size f340782b;

    /* renamed from: c, reason: collision with root package name */
    public final int f340783c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f340784d;

    public e(pw1.g renderInfo, android.util.Size drawSize, int i17, boolean z17) {
        kotlin.jvm.internal.o.g(renderInfo, "renderInfo");
        kotlin.jvm.internal.o.g(drawSize, "drawSize");
        this.f340781a = renderInfo;
        this.f340782b = drawSize;
        this.f340783c = i17;
        this.f340784d = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nw1.e)) {
            return false;
        }
        nw1.e eVar = (nw1.e) obj;
        return kotlin.jvm.internal.o.b(this.f340781a, eVar.f340781a) && kotlin.jvm.internal.o.b(this.f340782b, eVar.f340782b) && this.f340783c == eVar.f340783c && this.f340784d == eVar.f340784d;
    }

    public int hashCode() {
        return (((((this.f340781a.hashCode() * 31) + this.f340782b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f340783c)) * 31) + java.lang.Boolean.hashCode(this.f340784d);
    }

    public java.lang.String toString() {
        return "GLTextureRenderMTRTaskInput(renderInfo=" + this.f340781a + ", drawSize=" + this.f340782b + ", texId=" + this.f340783c + ", isOes=" + this.f340784d + ')';
    }
}
