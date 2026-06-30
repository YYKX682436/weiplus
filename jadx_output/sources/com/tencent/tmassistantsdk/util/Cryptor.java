package com.tencent.tmassistantsdk.util;

/* loaded from: classes13.dex */
public class Cryptor {
    protected int contextStart;
    protected int crypt;
    protected byte[] key;
    protected byte[] out;
    protected int padding;
    protected byte[] plain;
    protected int pos;
    protected int preCrypt;
    protected byte[] prePlain;
    protected boolean header = true;
    protected java.util.Random random = new java.util.Random();

    private byte[] decipher(byte[] bArr, int i17) {
        try {
            long unsignedInt = getUnsignedInt(bArr, i17, 4);
            long unsignedInt2 = getUnsignedInt(bArr, i17 + 4, 4);
            long unsignedInt3 = getUnsignedInt(this.key, 0, 4);
            long unsignedInt4 = getUnsignedInt(this.key, 4, 4);
            long unsignedInt5 = getUnsignedInt(this.key, 8, 4);
            long unsignedInt6 = getUnsignedInt(this.key, 12, 4);
            int i18 = 16;
            long j17 = 3816266640L;
            while (true) {
                int i19 = i18 - 1;
                if (i18 <= 0) {
                    java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream(8);
                    java.io.DataOutputStream dataOutputStream = new java.io.DataOutputStream(byteArrayOutputStream);
                    dataOutputStream.writeInt((int) unsignedInt);
                    dataOutputStream.writeInt((int) unsignedInt2);
                    dataOutputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
                unsignedInt2 = (unsignedInt2 - ((((unsignedInt << 4) + unsignedInt5) ^ (unsignedInt + j17)) ^ ((unsignedInt >>> 5) + unsignedInt6))) & io.flutter.embedding.android.KeyboardMap.kValueMask;
                unsignedInt = (unsignedInt - ((((unsignedInt2 << 4) + unsignedInt3) ^ (unsignedInt2 + j17)) ^ ((unsignedInt2 >>> 5) + unsignedInt4))) & io.flutter.embedding.android.KeyboardMap.kValueMask;
                j17 = (j17 - 2654435769L) & io.flutter.embedding.android.KeyboardMap.kValueMask;
                i18 = i19;
            }
        } catch (java.io.IOException unused) {
            return null;
        }
    }

    private boolean decrypt8Bytes(byte[] bArr, int i17, int i18) {
        this.pos = 0;
        while (true) {
            int i19 = this.pos;
            if (i19 >= 8) {
                byte[] decipher = decipher(this.prePlain);
                this.prePlain = decipher;
                if (decipher == null) {
                    return false;
                }
                this.contextStart += 8;
                this.crypt += 8;
                this.pos = 0;
                return true;
            }
            if (this.contextStart + i19 >= i18) {
                return true;
            }
            byte[] bArr2 = this.prePlain;
            bArr2[i19] = (byte) (bArr2[i19] ^ bArr[(this.crypt + i17) + i19]);
            this.pos = i19 + 1;
        }
    }

    private byte[] encipher(byte[] bArr) {
        try {
            long unsignedInt = getUnsignedInt(bArr, 0, 4);
            long unsignedInt2 = getUnsignedInt(bArr, 4, 4);
            long unsignedInt3 = getUnsignedInt(this.key, 0, 4);
            long unsignedInt4 = getUnsignedInt(this.key, 4, 4);
            long unsignedInt5 = getUnsignedInt(this.key, 8, 4);
            long unsignedInt6 = getUnsignedInt(this.key, 12, 4);
            int i17 = 16;
            long j17 = 0;
            while (true) {
                int i18 = i17 - 1;
                if (i17 <= 0) {
                    java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream(8);
                    java.io.DataOutputStream dataOutputStream = new java.io.DataOutputStream(byteArrayOutputStream);
                    dataOutputStream.writeInt((int) unsignedInt);
                    dataOutputStream.writeInt((int) unsignedInt2);
                    dataOutputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
                j17 = (j17 + 2654435769L) & io.flutter.embedding.android.KeyboardMap.kValueMask;
                unsignedInt = (unsignedInt + ((((unsignedInt2 << 4) + unsignedInt3) ^ (unsignedInt2 + j17)) ^ ((unsignedInt2 >>> 5) + unsignedInt4))) & io.flutter.embedding.android.KeyboardMap.kValueMask;
                unsignedInt2 = (unsignedInt2 + ((((unsignedInt << 4) + unsignedInt5) ^ (unsignedInt + j17)) ^ ((unsignedInt >>> 5) + unsignedInt6))) & io.flutter.embedding.android.KeyboardMap.kValueMask;
                i17 = i18;
            }
        } catch (java.io.IOException unused) {
            return null;
        }
    }

    private void encrypt8Bytes() {
        this.pos = 0;
        while (true) {
            int i17 = this.pos;
            if (i17 >= 8) {
                break;
            }
            if (this.header) {
                byte[] bArr = this.plain;
                bArr[i17] = (byte) (bArr[i17] ^ this.prePlain[i17]);
            } else {
                byte[] bArr2 = this.plain;
                bArr2[i17] = (byte) (bArr2[i17] ^ this.out[this.preCrypt + i17]);
            }
            this.pos = i17 + 1;
        }
        java.lang.System.arraycopy(encipher(this.plain), 0, this.out, this.crypt, 8);
        this.pos = 0;
        while (true) {
            int i18 = this.pos;
            if (i18 >= 8) {
                java.lang.System.arraycopy(this.plain, 0, this.prePlain, 0, 8);
                int i19 = this.crypt;
                this.preCrypt = i19;
                this.crypt = i19 + 8;
                this.pos = 0;
                this.header = false;
                return;
            }
            byte[] bArr3 = this.out;
            int i27 = this.crypt + i18;
            bArr3[i27] = (byte) (bArr3[i27] ^ this.prePlain[i18]);
            this.pos = i18 + 1;
        }
    }

    private static long getUnsignedInt(byte[] bArr, int i17, int i18) {
        int i19 = i18 > 8 ? i17 + 8 : i18 + i17;
        long j17 = 0;
        while (i17 < i19) {
            j17 = (j17 << 8) | (bArr[i17] & 255);
            i17++;
        }
        return (io.flutter.embedding.android.KeyboardMap.kValueMask & j17) | (j17 >>> 32);
    }

    private int rand() {
        return this.random.nextInt();
    }

    public byte[] decrypt(byte[] bArr, byte[] bArr2) {
        return decrypt(bArr, 0, bArr.length, bArr2);
    }

    public byte[] encrypt(byte[] bArr, byte[] bArr2) {
        return encrypt(bArr, 0, bArr.length, bArr2);
    }

    public byte[] decrypt(byte[] bArr, int i17, int i18, byte[] bArr2) {
        int i19 = 0;
        this.preCrypt = 0;
        this.crypt = 0;
        this.key = bArr2;
        int i27 = i17 + 8;
        byte[] bArr3 = new byte[i27];
        if (i18 % 8 != 0 || i18 < 16) {
            return null;
        }
        byte[] decipher = decipher(bArr, i17);
        this.prePlain = decipher;
        int i28 = decipher[0] & 7;
        this.pos = i28;
        int i29 = (i18 - i28) - 10;
        if (i29 < 0) {
            return null;
        }
        for (int i37 = i17; i37 < i27; i37++) {
            bArr3[i37] = 0;
        }
        this.out = new byte[i29];
        this.preCrypt = 0;
        this.crypt = 8;
        this.contextStart = 8;
        this.pos++;
        this.padding = 1;
        while (true) {
            int i38 = this.padding;
            if (i38 <= 2) {
                int i39 = this.pos;
                if (i39 < 8) {
                    this.pos = i39 + 1;
                    this.padding = i38 + 1;
                }
                if (this.pos == 8) {
                    if (!decrypt8Bytes(bArr, i17, i18)) {
                        return null;
                    }
                    bArr3 = bArr;
                }
            } else {
                while (i29 != 0) {
                    int i47 = this.pos;
                    if (i47 < 8) {
                        this.out[i19] = (byte) (bArr3[(this.preCrypt + i17) + i47] ^ this.prePlain[i47]);
                        i19++;
                        i29--;
                        this.pos = i47 + 1;
                    }
                    if (this.pos == 8) {
                        this.preCrypt = this.crypt - 8;
                        if (!decrypt8Bytes(bArr, i17, i18)) {
                            return null;
                        }
                        bArr3 = bArr;
                    }
                }
                this.padding = 1;
                while (this.padding < 8) {
                    int i48 = this.pos;
                    if (i48 < 8) {
                        if ((bArr3[(this.preCrypt + i17) + i48] ^ this.prePlain[i48]) != 0) {
                            return null;
                        }
                        this.pos = i48 + 1;
                    }
                    if (this.pos == 8) {
                        this.preCrypt = this.crypt;
                        if (!decrypt8Bytes(bArr, i17, i18)) {
                            return null;
                        }
                        bArr3 = bArr;
                    }
                    this.padding++;
                }
                return this.out;
            }
        }
    }

    public byte[] encrypt(byte[] bArr, int i17, int i18, byte[] bArr2) {
        int i19;
        byte[] bArr3 = new byte[8];
        this.plain = bArr3;
        this.prePlain = new byte[8];
        this.pos = 1;
        this.padding = 0;
        this.preCrypt = 0;
        this.crypt = 0;
        this.key = bArr2;
        this.header = true;
        int i27 = (i18 + 10) % 8;
        this.pos = i27;
        if (i27 != 0) {
            this.pos = 8 - i27;
        }
        this.out = new byte[this.pos + i18 + 10];
        bArr3[0] = (byte) ((rand() & 248) | this.pos);
        int i28 = 1;
        while (true) {
            i19 = this.pos;
            if (i28 > i19) {
                break;
            }
            this.plain[i28] = (byte) (rand() & 255);
            i28++;
        }
        this.pos = i19 + 1;
        for (int i29 = 0; i29 < 8; i29++) {
            this.prePlain[i29] = 0;
        }
        this.padding = 1;
        while (this.padding <= 2) {
            int i37 = this.pos;
            if (i37 < 8) {
                byte[] bArr4 = this.plain;
                this.pos = i37 + 1;
                bArr4[i37] = (byte) (rand() & 255);
                this.padding++;
            }
            if (this.pos == 8) {
                encrypt8Bytes();
            }
        }
        while (i18 > 0) {
            int i38 = this.pos;
            if (i38 < 8) {
                byte[] bArr5 = this.plain;
                this.pos = i38 + 1;
                bArr5[i38] = bArr[i17];
                i18--;
                i17++;
            }
            if (this.pos == 8) {
                encrypt8Bytes();
            }
        }
        this.padding = 1;
        while (true) {
            int i39 = this.padding;
            if (i39 <= 7) {
                int i47 = this.pos;
                if (i47 < 8) {
                    byte[] bArr6 = this.plain;
                    this.pos = i47 + 1;
                    bArr6[i47] = 0;
                    this.padding = i39 + 1;
                }
                if (this.pos == 8) {
                    encrypt8Bytes();
                }
            } else {
                return this.out;
            }
        }
    }

    private byte[] decipher(byte[] bArr) {
        return decipher(bArr, 0);
    }
}
