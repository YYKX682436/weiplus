package kk;

/* loaded from: classes12.dex */
public abstract class d {
    public static int a(com.tencent.mm.pointers.PByteArray pByteArray, byte[] bArr, byte[] bArr2) {
        if (pByteArray == null || bArr == null || bArr2 == null || bArr.length < 0 || bArr2.length <= 0) {
            return 2;
        }
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        pByteArray.value = bArr3;
        char f17 = kk.o.f(bArr3, bArr, length, bArr2.length, bArr2, 1);
        int i17 = 12;
        if (f17 == 0) {
            return 12;
        }
        int i18 = pByteArray.value[(length - 1) - 8];
        if (i18 > 0 && i18 <= 8) {
            int i19 = (length - i18) - 8;
            byte[] bArr4 = new byte[i19];
            i17 = 0;
            for (int i27 = 0; i27 < i19; i27++) {
                bArr4[i27] = pByteArray.value[i27];
            }
            pByteArray.value = bArr4;
        }
        return i17;
    }

    public static int b(com.tencent.mm.pointers.PByteArray pByteArray, byte[] bArr, byte[] bArr2) {
        if (pByteArray == null || bArr == null || bArr2 == null || bArr.length < 0 || bArr2.length <= 0) {
            return 2;
        }
        int length = 8 - (bArr.length % 8);
        if (length == 0) {
            length = 8;
        }
        int length2 = bArr.length + length;
        byte[] bArr3 = new byte[length2];
        for (int i17 = 0; i17 < bArr.length; i17++) {
            bArr3[i17] = bArr[i17];
        }
        for (int i18 = 0; i18 < length; i18++) {
            bArr3[bArr.length + i18] = (byte) length;
        }
        byte[] bArr4 = new byte[bArr.length + length + 32];
        pByteArray.value = bArr4;
        if (kk.o.f(bArr4, bArr3, length2, bArr2.length, bArr2, 0) == 0) {
            return 11;
        }
        int length3 = bArr.length + length + 8;
        byte[] bArr5 = new byte[length3];
        for (int i19 = 0; i19 < length3; i19++) {
            bArr5[i19] = pByteArray.value[i19];
        }
        pByteArray.value = bArr5;
        return 0;
    }
}
