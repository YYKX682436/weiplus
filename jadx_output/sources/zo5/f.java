package zo5;

/* loaded from: classes14.dex */
public final class f extends zo5.b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f474886a;

    /* renamed from: b, reason: collision with root package name */
    public final int f474887b;

    /* renamed from: c, reason: collision with root package name */
    public final zo5.e f474888c;

    /* renamed from: d, reason: collision with root package name */
    public final android.util.Size f474889d;

    public f(boolean z17, int i17, zo5.e renderInfo, android.util.Size drawSize) {
        kotlin.jvm.internal.o.g(renderInfo, "renderInfo");
        kotlin.jvm.internal.o.g(drawSize, "drawSize");
        this.f474886a = z17;
        this.f474887b = i17;
        this.f474888c = renderInfo;
        this.f474889d = drawSize;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zo5.f)) {
            return false;
        }
        zo5.f fVar = (zo5.f) obj;
        return this.f474886a == fVar.f474886a && this.f474887b == fVar.f474887b && kotlin.jvm.internal.o.b(this.f474888c, fVar.f474888c) && kotlin.jvm.internal.o.b(this.f474889d, fVar.f474889d);
    }

    public int hashCode() {
        return (((((java.lang.Boolean.hashCode(this.f474886a) * 31) + java.lang.Integer.hashCode(this.f474887b)) * 31) + this.f474888c.hashCode()) * 31) + this.f474889d.hashCode();
    }

    public java.lang.String toString() {
        return "TextureRenderParams(isOes=" + this.f474886a + ", inputTextureId=" + this.f474887b + ", renderInfo=" + this.f474888c + ", drawSize=" + this.f474889d + ')';
    }
}
