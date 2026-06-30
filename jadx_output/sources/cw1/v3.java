package cw1;

/* loaded from: classes5.dex */
public final class v3 {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f223369a;

    /* renamed from: b, reason: collision with root package name */
    public final int f223370b;

    /* renamed from: c, reason: collision with root package name */
    public final int f223371c;

    public v3(byte[] hash, int i17) {
        kotlin.jvm.internal.o.g(hash, "hash");
        this.f223369a = hash;
        this.f223370b = i17;
        this.f223371c = (hash[3] & 255) | (((i17 + 31) * 31) + ((hash[0] & 255) << 24)) | ((hash[1] & 255) << 16) | ((hash[2] & 255) << 8);
    }

    public boolean equals(java.lang.Object obj) {
        cw1.v3 v3Var = obj instanceof cw1.v3 ? (cw1.v3) obj : null;
        return v3Var != null && this.f223370b == v3Var.f223370b && java.util.Arrays.equals(this.f223369a, v3Var.f223369a);
    }

    public int hashCode() {
        return this.f223371c;
    }
}
