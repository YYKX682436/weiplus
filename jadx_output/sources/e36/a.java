package e36;

/* loaded from: classes14.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f247594a;

    /* renamed from: b, reason: collision with root package name */
    public int f247595b;

    /* renamed from: c, reason: collision with root package name */
    public int f247596c;

    /* renamed from: d, reason: collision with root package name */
    public int f247597d = 0;

    public a(byte[] bArr, int i17, int i18) {
        this.f247594a = bArr;
        this.f247595b = i18 + i17;
        this.f247596c = i17;
    }

    public double a() {
        return java.lang.Double.longBitsToDouble(((d() & 255) << 8) | (d() & 255) | ((d() & 255) << 16) | ((d() & 255) << 24) | ((d() & 255) << 32) | ((d() & 255) << 40) | ((d() & 255) << 48) | ((d() & 255) << 56));
    }

    public float b() {
        return java.lang.Float.intBitsToFloat((d() & 255) | ((d() & 255) << 8) | ((d() & 255) << 16) | ((d() & 255) << 24));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int[] c(int i17) {
        int i18;
        int i19;
        int i27;
        byte[] bArr = this.f247594a;
        int i28 = bArr[i17];
        int i29 = i17 + 1;
        if (i28 >= 0) {
            return new int[]{i28, i29};
        }
        int i37 = i28 & 127;
        int i38 = bArr[i29];
        if (i38 >= 0) {
            i18 = i29 + 1;
            i27 = i38 << 7;
        } else {
            int i39 = i38 & 127;
            i37 |= i39 << 7;
            if (i38 >= 0) {
                i18 = i29 + 1;
                i27 = i38 << 14;
            } else {
                i37 |= i39 << 14;
                if (i38 < 0) {
                    int i47 = i37 | (i39 << 21) | (i38 << 28);
                    i18 = i29 + 1;
                    if (i38 >= 0) {
                        i19 = i47;
                        return new int[]{i19, i18};
                    }
                    for (int i48 = 0; i48 < 5; i48++) {
                        if (bArr[i18] >= 0) {
                            return new int[]{i38, i18 + 1};
                        }
                    }
                    throw new e36.b("CodedInputStream encountered a malformed varint.");
                }
                i18 = i29 + 1;
                i27 = i38 << 21;
            }
        }
        i19 = i27 | i37;
        return new int[]{i19, i18};
    }

    public final byte d() {
        if (this.f247596c == this.f247595b) {
            i(true);
        }
        int i17 = this.f247596c;
        this.f247596c = i17 + 1;
        return this.f247594a[i17];
    }

    public final byte[] e(int i17) {
        if (i17 < 0) {
            throw new e36.b("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i18 = this.f247597d;
        int i19 = this.f247596c;
        if (i18 + i19 + i17 > Integer.MAX_VALUE) {
            j((Integer.MAX_VALUE - i18) - i19);
            throw e36.b.a();
        }
        int i27 = this.f247595b;
        int i28 = i27 - i19;
        byte[] bArr = this.f247594a;
        if (i17 <= i28) {
            byte[] bArr2 = new byte[i17];
            java.lang.System.arraycopy(bArr, i19, bArr2, 0, i17);
            this.f247596c += i17;
            return bArr2;
        }
        if (i17 >= 2048) {
            this.f247597d = i18 + i27;
            this.f247596c = 0;
            this.f247595b = 0;
            int i29 = i17 - i28;
            java.util.LinkedList linkedList = new java.util.LinkedList();
            while (i29 > 0) {
                int min = java.lang.Math.min(i29, 2048);
                byte[] bArr3 = new byte[min];
                if (min > 0) {
                    throw e36.b.a();
                }
                i29 -= min;
                linkedList.add(bArr3);
            }
            byte[] bArr4 = new byte[i17];
            java.lang.System.arraycopy(bArr, i19, bArr4, 0, i28);
            for (int i37 = 0; i37 < linkedList.size(); i37++) {
                byte[] bArr5 = (byte[]) linkedList.get(i37);
                java.lang.System.arraycopy(bArr5, 0, bArr4, i28, bArr5.length);
                i28 += bArr5.length;
            }
            return bArr4;
        }
        byte[] bArr6 = new byte[i17];
        java.lang.System.arraycopy(bArr, i19, bArr6, 0, i28);
        this.f247596c = this.f247595b;
        i(true);
        while (true) {
            int i38 = i17 - i28;
            int i39 = this.f247595b;
            if (i38 <= i39) {
                java.lang.System.arraycopy(bArr, 0, bArr6, i28, i38);
                this.f247596c = i38;
                return bArr6;
            }
            java.lang.System.arraycopy(bArr, 0, bArr6, i28, i39);
            int i47 = this.f247595b;
            i28 += i47;
            this.f247596c = i47;
            i(true);
        }
    }

    public final int f() {
        int i17;
        byte d17 = d();
        if (d17 >= 0) {
            return d17;
        }
        int i18 = d17 & Byte.MAX_VALUE;
        byte d18 = d();
        if (d18 >= 0) {
            i17 = d18 << 7;
        } else {
            i18 |= (d18 & Byte.MAX_VALUE) << 7;
            byte d19 = d();
            if (d19 >= 0) {
                i17 = d19 << 14;
            } else {
                i18 |= (d19 & Byte.MAX_VALUE) << 14;
                byte d27 = d();
                if (d27 < 0) {
                    int i19 = i18 | ((d27 & Byte.MAX_VALUE) << 21);
                    byte d28 = d();
                    int i27 = i19 | (d28 << 28);
                    if (d28 >= 0) {
                        return i27;
                    }
                    for (int i28 = 0; i28 < 5; i28++) {
                        if (d() >= 0) {
                            return i27;
                        }
                    }
                    throw new e36.b("CodedInputStream encountered a malformed varint.");
                }
                i17 = d27 << 21;
            }
        }
        return i18 | i17;
    }

    public long g() {
        long j17 = 0;
        for (int i17 = 0; i17 < 64; i17 += 7) {
            j17 |= (r3 & Byte.MAX_VALUE) << i17;
            if ((d() & 128) == 0) {
                return j17;
            }
        }
        throw new e36.b("CodedInputStream encountered a malformed varint.");
    }

    public java.lang.String h() {
        int f17 = f();
        int i17 = this.f247595b;
        int i18 = this.f247596c;
        if (f17 >= i17 - i18 || f17 <= 0) {
            return new java.lang.String(e(f17), com.tencent.mapsdk.internal.rv.f51270c);
        }
        java.lang.String str = new java.lang.String(this.f247594a, i18, f17, com.tencent.mapsdk.internal.rv.f51270c);
        this.f247596c += f17;
        return str;
    }

    public final boolean i(boolean z17) {
        int i17 = this.f247596c;
        int i18 = this.f247595b;
        if (i17 < i18) {
            throw new java.lang.IllegalStateException("refillBuffer() called when buffer wasn't empty.");
        }
        int i19 = this.f247597d;
        if (i19 + i18 == Integer.MAX_VALUE) {
            if (z17) {
                throw e36.b.a();
            }
            return false;
        }
        this.f247597d = i19 + i18;
        this.f247596c = 0;
        this.f247595b = -1;
        this.f247595b = 0;
        if (z17) {
            throw e36.b.a();
        }
        return false;
    }

    public final void j(int i17) {
        if (i17 < 0) {
            throw new e36.b("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i18 = this.f247597d;
        int i19 = this.f247596c;
        if (i18 + i19 + i17 > Integer.MAX_VALUE) {
            j((Integer.MAX_VALUE - i18) - i19);
            throw e36.b.a();
        }
        int i27 = this.f247595b - i19;
        if (i17 < i27) {
            this.f247596c = i19 + i17;
            return;
        }
        this.f247597d = i18 + i27;
        this.f247596c = 0;
        this.f247595b = 0;
        if (i27 < i17) {
            throw e36.b.a();
        }
    }
}
