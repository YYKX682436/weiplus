package j65;

/* loaded from: classes13.dex */
public class u {

    /* renamed from: a, reason: collision with root package name */
    public final android.util.SparseArray f297976a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f297977b;

    public u(android.util.SparseArray sparseArray, byte[] bArr) {
        this.f297976a = sparseArray;
        this.f297977b = bArr;
    }

    public java.lang.String[] a(int i17) {
        android.util.SparseArray sparseArray = this.f297976a;
        int indexOfKey = sparseArray.indexOfKey(i17);
        java.lang.String[] strArr = null;
        if (indexOfKey < 0) {
            return null;
        }
        int length = indexOfKey < sparseArray.size() + (-1) ? ((j65.t) sparseArray.valueAt(indexOfKey + 1)).f297975a[0] : this.f297977b.length;
        j65.t tVar = (j65.t) sparseArray.valueAt(indexOfKey);
        int length2 = tVar.f297975a.length;
        if (length2 > 0) {
            strArr = new java.lang.String[length2];
            for (int i18 = 0; i18 < length2; i18++) {
                int i19 = length2 - 1;
                int[] iArr = tVar.f297975a;
                if (i18 < i19) {
                    byte[] bArr = this.f297977b;
                    int i27 = iArr[i18];
                    strArr[i18] = new java.lang.String(bArr, i27, iArr[i18 + 1] - i27);
                } else {
                    byte[] bArr2 = this.f297977b;
                    int i28 = iArr[i18];
                    strArr[i18] = new java.lang.String(bArr2, i28, length - i28);
                }
            }
        }
        return strArr;
    }
}
