package x6;

/* loaded from: classes13.dex */
public final class i implements x6.a {
    @Override // x6.a
    public int a(java.lang.Object obj) {
        return ((int[]) obj).length;
    }

    @Override // x6.a
    public int b() {
        return 4;
    }

    @Override // x6.a
    public java.lang.String getTag() {
        return "IntegerArrayPool";
    }

    @Override // x6.a
    public java.lang.Object newArray(int i17) {
        return new int[i17];
    }
}
