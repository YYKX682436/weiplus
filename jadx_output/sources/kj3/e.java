package kj3;

/* loaded from: classes14.dex */
public final class e extends ej3.a {

    /* renamed from: a, reason: collision with root package name */
    public final mj3.g f308447a;

    /* renamed from: b, reason: collision with root package name */
    public final android.util.Size f308448b;

    /* renamed from: c, reason: collision with root package name */
    public final int f308449c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f308450d;

    public e(mj3.g renderInfo, android.util.Size drawSize, int i17, boolean z17) {
        kotlin.jvm.internal.o.g(renderInfo, "renderInfo");
        kotlin.jvm.internal.o.g(drawSize, "drawSize");
        this.f308447a = renderInfo;
        this.f308448b = drawSize;
        this.f308449c = i17;
        this.f308450d = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kj3.e)) {
            return false;
        }
        kj3.e eVar = (kj3.e) obj;
        return kotlin.jvm.internal.o.b(this.f308447a, eVar.f308447a) && kotlin.jvm.internal.o.b(this.f308448b, eVar.f308448b) && this.f308449c == eVar.f308449c && this.f308450d == eVar.f308450d;
    }

    public int hashCode() {
        return (((((this.f308447a.hashCode() * 31) + this.f308448b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f308449c)) * 31) + java.lang.Boolean.hashCode(this.f308450d);
    }

    public java.lang.String toString() {
        return "GLTextureRenderMTRTaskInput(renderInfo=" + this.f308447a + ", drawSize=" + this.f308448b + ", texId=" + this.f308449c + ", isOes=" + this.f308450d + ')';
    }
}
