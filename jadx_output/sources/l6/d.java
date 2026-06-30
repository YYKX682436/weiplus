package l6;

/* loaded from: classes16.dex */
public class d extends l6.e {

    /* renamed from: h, reason: collision with root package name */
    public int f316714h;

    /* renamed from: i, reason: collision with root package name */
    public l6.g[] f316715i;

    @Override // l6.e
    public int[] a() {
        int i17 = 8;
        int[] iArr = new int[(this.f316714h * 3) + 8];
        java.util.Arrays.fill(iArr, 0);
        iArr[0] = this.f316716a;
        int i18 = this.f316714h;
        iArr[1] = ((i18 * 3) + 8) - 2;
        iArr[2] = this.f316718c;
        iArr[3] = this.f316719d;
        iArr[4] = this.f316720e;
        iArr[5] = this.f316721f;
        iArr[6] = this.f316722g;
        iArr[7] = i18;
        for (int i19 = 0; i19 < this.f316714h; i19++) {
            l6.g gVar = this.f316715i[i19];
            iArr[i17] = gVar.f316725a;
            int i27 = i17 + 1;
            iArr[i27] = gVar.f316726b;
            int i28 = i27 + 1;
            iArr[i28] = gVar.f316727c;
            i17 = i28 + 1;
        }
        return iArr;
    }

    @Override // l6.e
    public java.lang.String toString() {
        return "Continuous{mPointNum=" + this.f316714h + ", mPoint=" + java.util.Arrays.toString(this.f316715i) + '}';
    }
}
