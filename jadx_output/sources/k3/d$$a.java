package k3;

/* loaded from: classes5.dex */
public final /* synthetic */ class d$$a implements java.util.Comparator {
    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = (byte[]) obj2;
        if (bArr.length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i17 = 0; i17 < bArr.length; i17++) {
            byte b17 = bArr[i17];
            byte b18 = bArr2[i17];
            if (b17 != b18) {
                return b17 - b18;
            }
        }
        return 0;
    }
}
