package j65;

/* loaded from: classes13.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    public final android.util.SparseArray f297969a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f297970b;

    public o(android.util.SparseArray sparseArray, byte[] bArr) {
        this.f297969a = sparseArray;
        this.f297970b = bArr;
    }

    public java.lang.String a(int i17, int i18, java.lang.Object... objArr) {
        java.lang.String str;
        java.lang.String str2;
        android.util.SparseArray sparseArray = this.f297969a;
        try {
            int indexOfKey = sparseArray.indexOfKey(i17);
            if (indexOfKey < 0) {
                return null;
            }
            j65.n nVar = (j65.n) sparseArray.valueAt(indexOfKey);
            int length = nVar.f297967a.length;
            int i19 = 0;
            for (int i27 = 0; i27 < length; i27++) {
                if (nVar.f297967a[i27] == i18) {
                    i19 = i27;
                }
            }
            int size = sparseArray.size() - 1;
            int[] iArr = nVar.f297968b;
            if (indexOfKey <= size) {
                if (i19 >= length - 1) {
                    j65.n nVar2 = (j65.n) sparseArray.valueAt(indexOfKey + 1);
                    byte[] bArr = this.f297970b;
                    int i28 = iArr[i19];
                    str2 = new java.lang.String(bArr, i28, nVar2.f297968b[0] - i28);
                    return (com.tencent.mm.sdk.platformtools.t8.K0(str2) && objArr == null) ? str2 : java.lang.String.format(str2, objArr);
                }
                byte[] bArr2 = this.f297970b;
                int i29 = iArr[i19];
                str = new java.lang.String(bArr2, i29, iArr[i19 + 1] - i29);
            } else if (i19 >= length - 1) {
                byte[] bArr3 = this.f297970b;
                int i37 = iArr[i19];
                str = new java.lang.String(bArr3, i37, bArr3.length - i37);
            } else {
                byte[] bArr4 = this.f297970b;
                int i38 = iArr[i19];
                str = new java.lang.String(bArr4, i38, iArr[i19 + 1] - i38);
            }
            str2 = str;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            }
        } catch (java.lang.Exception e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.language.PluralsCollection", "[cpan] getString failed. %s", com.tencent.mm.sdk.platformtools.z3.c(e17));
            return null;
        }
    }
}
