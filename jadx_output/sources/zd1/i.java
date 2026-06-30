package zd1;

/* loaded from: classes7.dex */
public final class i extends zd1.j {

    /* renamed from: a, reason: collision with root package name */
    public final java.nio.ByteBuffer f471533a;

    /* renamed from: b, reason: collision with root package name */
    public final int f471534b;

    /* renamed from: c, reason: collision with root package name */
    public final int f471535c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(java.nio.ByteBuffer buffer, int i17, int i18) {
        super(null);
        kotlin.jvm.internal.o.g(buffer, "buffer");
        this.f471533a = buffer;
        this.f471534b = i17;
        this.f471535c = i18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zd1.i)) {
            return false;
        }
        zd1.i iVar = (zd1.i) obj;
        return kotlin.jvm.internal.o.b(this.f471533a, iVar.f471533a) && this.f471534b == iVar.f471534b && this.f471535c == iVar.f471535c;
    }

    public int hashCode() {
        return (((this.f471533a.hashCode() * 31) + java.lang.Integer.hashCode(this.f471534b)) * 31) + java.lang.Integer.hashCode(this.f471535c);
    }

    public java.lang.String toString() {
        return "ShapedBuffer(buffer=" + this.f471533a + ", width=" + this.f471534b + ", height=" + this.f471535c + ')';
    }
}
