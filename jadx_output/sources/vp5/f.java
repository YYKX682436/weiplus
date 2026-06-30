package vp5;

/* loaded from: classes7.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final java.nio.ByteBuffer f439106a;

    /* renamed from: b, reason: collision with root package name */
    public final java.nio.ByteBuffer f439107b;

    /* renamed from: c, reason: collision with root package name */
    public final java.nio.ByteBuffer f439108c;

    public f(java.nio.ByteBuffer foregroundPermission, java.nio.ByteBuffer backgroundPermission, java.nio.ByteBuffer suspendPermission) {
        kotlin.jvm.internal.o.g(foregroundPermission, "foregroundPermission");
        kotlin.jvm.internal.o.g(backgroundPermission, "backgroundPermission");
        kotlin.jvm.internal.o.g(suspendPermission, "suspendPermission");
        this.f439106a = foregroundPermission;
        this.f439107b = backgroundPermission;
        this.f439108c = suspendPermission;
    }

    public final void a(f56.k packer) {
        kotlin.jvm.internal.o.g(packer, "packer");
        packer.f(3);
        java.nio.ByteBuffer duplicate = this.f439106a.duplicate();
        duplicate.rewind();
        int remaining = duplicate.remaining();
        byte[] bArr = new byte[remaining];
        duplicate.get(bArr);
        packer.i(remaining);
        packer.C(bArr);
        java.nio.ByteBuffer duplicate2 = this.f439107b.duplicate();
        duplicate2.rewind();
        int remaining2 = duplicate2.remaining();
        byte[] bArr2 = new byte[remaining2];
        duplicate2.get(bArr2);
        packer.i(remaining2);
        packer.C(bArr2);
        java.nio.ByteBuffer duplicate3 = this.f439108c.duplicate();
        duplicate3.rewind();
        int remaining3 = duplicate3.remaining();
        byte[] bArr3 = new byte[remaining3];
        duplicate3.get(bArr3);
        packer.i(remaining3);
        packer.C(bArr3);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vp5.f)) {
            return false;
        }
        vp5.f fVar = (vp5.f) obj;
        return kotlin.jvm.internal.o.b(this.f439106a, fVar.f439106a) && kotlin.jvm.internal.o.b(this.f439107b, fVar.f439107b) && kotlin.jvm.internal.o.b(this.f439108c, fVar.f439108c);
    }

    public int hashCode() {
        return (((this.f439106a.hashCode() * 31) + this.f439107b.hashCode()) * 31) + this.f439108c.hashCode();
    }

    public java.lang.String toString() {
        return "JsApiPermission(foregroundPermission=" + this.f439106a + ", backgroundPermission=" + this.f439107b + ", suspendPermission=" + this.f439108c + ")";
    }
}
