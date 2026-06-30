package lj3;

/* loaded from: classes14.dex */
public final class c extends ej3.b {

    /* renamed from: b, reason: collision with root package name */
    public final mj3.g f318975b;

    /* renamed from: c, reason: collision with root package name */
    public final int f318976c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(mj3.g renderInfo, int i17) {
        super(false, null, 3, null);
        kotlin.jvm.internal.o.g(renderInfo, "renderInfo");
        this.f318975b = renderInfo;
        this.f318976c = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lj3.c)) {
            return false;
        }
        lj3.c cVar = (lj3.c) obj;
        return kotlin.jvm.internal.o.b(this.f318975b, cVar.f318975b) && this.f318976c == cVar.f318976c;
    }

    public int hashCode() {
        return (this.f318975b.hashCode() * 31) + java.lang.Integer.hashCode(this.f318976c);
    }

    public java.lang.String toString() {
        return "VBRenderMTRTaskOutput(renderInfo=" + this.f318975b + ", texId=" + this.f318976c + ')';
    }
}
