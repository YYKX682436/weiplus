package ms4;

/* loaded from: classes8.dex */
public final class o implements androidx.lifecycle.f1 {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f331083a;

    /* renamed from: b, reason: collision with root package name */
    public final int f331084b;

    public o(byte[] bArr, int i17) {
        this.f331083a = bArr;
        this.f331084b = i17;
    }

    @Override // androidx.lifecycle.f1
    public androidx.lifecycle.c1 a(java.lang.Class modelClass) {
        kotlin.jvm.internal.o.g(modelClass, "modelClass");
        return new ms4.n(this.f331083a, this.f331084b);
    }
}
