package lj3;

/* loaded from: classes14.dex */
public final class b extends ej3.a {

    /* renamed from: a, reason: collision with root package name */
    public final mj3.g f318972a;

    /* renamed from: b, reason: collision with root package name */
    public final is0.c f318973b;

    /* renamed from: c, reason: collision with root package name */
    public final is0.c f318974c;

    public b(mj3.g renderInfo, is0.c inputTexture, is0.c outputTexture) {
        kotlin.jvm.internal.o.g(renderInfo, "renderInfo");
        kotlin.jvm.internal.o.g(inputTexture, "inputTexture");
        kotlin.jvm.internal.o.g(outputTexture, "outputTexture");
        this.f318972a = renderInfo;
        this.f318973b = inputTexture;
        this.f318974c = outputTexture;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lj3.b)) {
            return false;
        }
        lj3.b bVar = (lj3.b) obj;
        return kotlin.jvm.internal.o.b(this.f318972a, bVar.f318972a) && kotlin.jvm.internal.o.b(this.f318973b, bVar.f318973b) && kotlin.jvm.internal.o.b(this.f318974c, bVar.f318974c);
    }

    public int hashCode() {
        return (((this.f318972a.hashCode() * 31) + this.f318973b.hashCode()) * 31) + this.f318974c.hashCode();
    }

    public java.lang.String toString() {
        return "VBRenderMTRTaskInput(renderInfo=" + this.f318972a + ", inputTexture=" + this.f318973b + ", outputTexture=" + this.f318974c + ')';
    }
}
