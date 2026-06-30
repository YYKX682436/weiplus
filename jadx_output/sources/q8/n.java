package q8;

/* loaded from: classes15.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final int f360642a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f360643b;

    /* renamed from: c, reason: collision with root package name */
    public final int f360644c;

    /* renamed from: d, reason: collision with root package name */
    public final int f360645d;

    public n(int i17, byte[] bArr, int i18, int i19) {
        this.f360642a = i17;
        this.f360643b = bArr;
        this.f360644c = i18;
        this.f360645d = i19;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q8.n.class != obj.getClass()) {
            return false;
        }
        q8.n nVar = (q8.n) obj;
        return this.f360642a == nVar.f360642a && this.f360644c == nVar.f360644c && this.f360645d == nVar.f360645d && java.util.Arrays.equals(this.f360643b, nVar.f360643b);
    }

    public int hashCode() {
        return (((((this.f360642a * 31) + java.util.Arrays.hashCode(this.f360643b)) * 31) + this.f360644c) * 31) + this.f360645d;
    }
}
