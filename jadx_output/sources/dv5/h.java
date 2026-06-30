package dv5;

/* loaded from: classes16.dex */
public final class h extends dv5.a {

    /* renamed from: c, reason: collision with root package name */
    public short[] f244064c;

    public h(int i17) {
        if (i17 < 0) {
            throw new java.lang.IllegalArgumentException("initSize < 0");
        }
        this.f244064c = new short[i17];
    }

    public void b(short s17) {
        int i17 = this.f244036b;
        short[] sArr = this.f244064c;
        if (sArr.length - i17 < 1) {
            short[] sArr2 = new short[sArr.length + (sArr.length >> 1)];
            java.lang.System.arraycopy(sArr, 0, sArr2, 0, i17);
            this.f244064c = sArr2;
        }
        short[] sArr3 = this.f244064c;
        int i18 = this.f244036b;
        sArr3[i18] = s17;
        this.f244036b = i18 + 1;
    }

    public void c(short s17, short s18) {
        b(s17);
        b(s18);
    }

    public void d(short s17, short s18, short s19) {
        b(s17);
        b(s18);
        b(s19);
    }

    public void e(int i17) {
        b((short) i17);
        b((short) (i17 >> 16));
    }
}
