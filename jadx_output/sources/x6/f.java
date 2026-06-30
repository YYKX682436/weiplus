package x6;

/* loaded from: classes13.dex */
public final class f implements x6.a {
    @Override // x6.a
    public int a(java.lang.Object obj) {
        return ((byte[]) obj).length;
    }

    @Override // x6.a
    public int b() {
        return 1;
    }

    @Override // x6.a
    public java.lang.String getTag() {
        return "ByteArrayPool";
    }

    @Override // x6.a
    public java.lang.Object newArray(int i17) {
        return new byte[i17];
    }
}
