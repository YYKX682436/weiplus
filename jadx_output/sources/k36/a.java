package k36;

/* loaded from: classes16.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f303944a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f303945b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f303946c;

    /* renamed from: d, reason: collision with root package name */
    public int f303947d;

    /* renamed from: e, reason: collision with root package name */
    public int f303948e;

    /* renamed from: f, reason: collision with root package name */
    public int f303949f;

    /* renamed from: g, reason: collision with root package name */
    public int f303950g;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f303951h;

    /* renamed from: j, reason: collision with root package name */
    public int f303953j;

    /* renamed from: i, reason: collision with root package name */
    public boolean f303952i = true;

    /* renamed from: k, reason: collision with root package name */
    public final java.util.Random f303954k = new java.util.Random();

    public static long d(byte[] bArr, int i17, int i18) {
        long j17 = 0;
        int i19 = i18 > 8 ? i17 + 8 : i18 + i17;
        while (i17 < i19) {
            j17 = (j17 << 8) | (bArr[i17] & 255);
            i17++;
        }
        return (io.flutter.embedding.android.KeyboardMap.kValueMask & j17) | (j17 >>> 32);
    }

    public final byte[] a(byte[] bArr, int i17) {
        try {
            long d17 = d(bArr, i17, 4);
            long d18 = d(bArr, i17 + 4, 4);
            long d19 = d(this.f303951h, 0, 4);
            long d27 = d(this.f303951h, 4, 4);
            long d28 = d(this.f303951h, 8, 4);
            long d29 = d(this.f303951h, 12, 4);
            int i18 = 16;
            long j17 = 3816266640L;
            while (true) {
                int i19 = i18 - 1;
                if (i18 <= 0) {
                    java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream(8);
                    java.io.DataOutputStream dataOutputStream = new java.io.DataOutputStream(byteArrayOutputStream);
                    dataOutputStream.writeInt((int) d17);
                    dataOutputStream.writeInt((int) d18);
                    dataOutputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
                d18 = (d18 - ((((d17 << 4) + d28) ^ (d17 + j17)) ^ ((d17 >>> 5) + d29))) & io.flutter.embedding.android.KeyboardMap.kValueMask;
                d17 = (d17 - ((((d18 << 4) + d19) ^ (d18 + j17)) ^ ((d18 >>> 5) + d27))) & io.flutter.embedding.android.KeyboardMap.kValueMask;
                j17 = (j17 - 2654435769L) & io.flutter.embedding.android.KeyboardMap.kValueMask;
                i18 = i19;
            }
        } catch (java.io.IOException unused) {
            return null;
        }
    }

    public final boolean b(byte[] bArr, int i17, int i18) {
        this.f303949f = 0;
        while (true) {
            int i19 = this.f303949f;
            if (i19 >= 8) {
                byte[] a17 = a(this.f303945b, 0);
                this.f303945b = a17;
                if (a17 == null) {
                    return false;
                }
                this.f303953j += 8;
                this.f303947d += 8;
                this.f303949f = 0;
                return true;
            }
            if (this.f303953j + i19 >= i18) {
                return true;
            }
            byte[] bArr2 = this.f303945b;
            bArr2[i19] = (byte) (bArr2[i19] ^ bArr[(this.f303947d + i17) + i19]);
            this.f303949f = i19 + 1;
        }
    }

    public final void c() {
        byte[] bArr;
        this.f303949f = 0;
        while (true) {
            int i17 = this.f303949f;
            if (i17 >= 8) {
                break;
            }
            if (this.f303952i) {
                byte[] bArr2 = this.f303944a;
                bArr2[i17] = (byte) (bArr2[i17] ^ this.f303945b[i17]);
            } else {
                byte[] bArr3 = this.f303944a;
                bArr3[i17] = (byte) (bArr3[i17] ^ this.f303946c[this.f303948e + i17]);
            }
            this.f303949f = i17 + 1;
        }
        byte[] bArr4 = this.f303944a;
        try {
            long d17 = d(bArr4, 0, 4);
            long d18 = d(bArr4, 4, 4);
            long d19 = d(this.f303951h, 0, 4);
            long d27 = d(this.f303951h, 4, 4);
            long d28 = d(this.f303951h, 8, 4);
            long d29 = d(this.f303951h, 12, 4);
            int i18 = 16;
            long j17 = 0;
            while (true) {
                int i19 = i18 - 1;
                if (i18 <= 0) {
                    break;
                }
                j17 = (j17 + 2654435769L) & io.flutter.embedding.android.KeyboardMap.kValueMask;
                d17 = (d17 + ((((d18 << 4) + d19) ^ (d18 + j17)) ^ ((d18 >>> 5) + d27))) & io.flutter.embedding.android.KeyboardMap.kValueMask;
                d18 = (d18 + ((((d17 << 4) + d28) ^ (d17 + j17)) ^ ((d17 >>> 5) + d29))) & io.flutter.embedding.android.KeyboardMap.kValueMask;
                i18 = i19;
            }
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream(8);
            java.io.DataOutputStream dataOutputStream = new java.io.DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeInt((int) d17);
            dataOutputStream.writeInt((int) d18);
            dataOutputStream.close();
            bArr = byteArrayOutputStream.toByteArray();
        } catch (java.io.IOException unused) {
            bArr = null;
        }
        java.lang.System.arraycopy(bArr, 0, this.f303946c, this.f303947d, 8);
        this.f303949f = 0;
        while (true) {
            int i27 = this.f303949f;
            if (i27 >= 8) {
                java.lang.System.arraycopy(this.f303944a, 0, this.f303945b, 0, 8);
                int i28 = this.f303947d;
                this.f303948e = i28;
                this.f303947d = i28 + 8;
                this.f303949f = 0;
                this.f303952i = false;
                return;
            }
            byte[] bArr5 = this.f303946c;
            int i29 = this.f303947d + i27;
            bArr5[i29] = (byte) (bArr5[i29] ^ this.f303945b[i27]);
            this.f303949f = i27 + 1;
        }
    }
}
