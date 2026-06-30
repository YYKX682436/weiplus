package p16;

/* loaded from: classes16.dex */
public final class h {

    /* renamed from: c, reason: collision with root package name */
    public int f351294c;

    /* renamed from: e, reason: collision with root package name */
    public final java.io.InputStream f351296e;

    /* renamed from: f, reason: collision with root package name */
    public int f351297f;

    /* renamed from: i, reason: collision with root package name */
    public int f351300i;

    /* renamed from: h, reason: collision with root package name */
    public int f351299h = Integer.MAX_VALUE;

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f351292a = new byte[4096];

    /* renamed from: b, reason: collision with root package name */
    public int f351293b = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f351295d = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f351298g = 0;

    public h(java.io.InputStream inputStream) {
        this.f351296e = inputStream;
    }

    public void a(int i17) {
        if (this.f351297f != i17) {
            throw new p16.z("Protocol message end-group tag did not match expected tag.");
        }
    }

    public int b() {
        int i17 = this.f351299h;
        if (i17 == Integer.MAX_VALUE) {
            return -1;
        }
        return i17 - (this.f351298g + this.f351295d);
    }

    public void c(int i17) {
        this.f351299h = i17;
        o();
    }

    public int d(int i17) {
        if (i17 < 0) {
            throw new p16.z("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i18 = i17 + this.f351298g + this.f351295d;
        int i19 = this.f351299h;
        if (i18 > i19) {
            throw p16.z.b();
        }
        this.f351299h = i18;
        o();
        return i19;
    }

    public p16.g e() {
        int k17 = k();
        int i17 = this.f351293b;
        int i18 = this.f351295d;
        if (k17 > i17 - i18 || k17 <= 0) {
            return k17 == 0 ? p16.g.f351283d : new p16.f0(h(k17));
        }
        byte[] bArr = new byte[k17];
        java.lang.System.arraycopy(this.f351292a, i18, bArr, 0, k17);
        p16.f0 f0Var = new p16.f0(bArr);
        this.f351295d += k17;
        return f0Var;
    }

    public int f() {
        return k();
    }

    public p16.h0 g(p16.j0 j0Var, p16.l lVar) {
        int k17 = k();
        if (this.f351300i >= 64) {
            throw new p16.z("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int d17 = d(k17);
        this.f351300i++;
        p16.h0 h0Var = (p16.h0) j0Var.a(this, lVar);
        a(0);
        this.f351300i--;
        c(d17);
        return h0Var;
    }

    public final byte[] h(int i17) {
        if (i17 <= 0) {
            if (i17 == 0) {
                return p16.y.f351369a;
            }
            throw new p16.z("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i18 = this.f351298g;
        int i19 = this.f351295d;
        int i27 = i18 + i19 + i17;
        int i28 = this.f351299h;
        if (i27 > i28) {
            r((i28 - i18) - i19);
            throw p16.z.b();
        }
        byte[] bArr = this.f351292a;
        if (i17 < 4096) {
            byte[] bArr2 = new byte[i17];
            int i29 = this.f351293b - i19;
            java.lang.System.arraycopy(bArr, i19, bArr2, 0, i29);
            int i37 = this.f351293b;
            this.f351295d = i37;
            int i38 = i17 - i29;
            if (i37 - i37 < i38) {
                p(i38);
            }
            java.lang.System.arraycopy(bArr, 0, bArr2, i29, i38);
            this.f351295d = i38;
            return bArr2;
        }
        int i39 = this.f351293b;
        this.f351298g = i18 + i39;
        this.f351295d = 0;
        this.f351293b = 0;
        int i47 = i39 - i19;
        int i48 = i17 - i47;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (i48 > 0) {
            int min = java.lang.Math.min(i48, 4096);
            byte[] bArr3 = new byte[min];
            int i49 = 0;
            while (i49 < min) {
                java.io.InputStream inputStream = this.f351296e;
                int read = inputStream == null ? -1 : inputStream.read(bArr3, i49, min - i49);
                if (read == -1) {
                    throw p16.z.b();
                }
                this.f351298g += read;
                i49 += read;
            }
            i48 -= min;
            arrayList.add(bArr3);
        }
        byte[] bArr4 = new byte[i17];
        java.lang.System.arraycopy(bArr, i19, bArr4, 0, i47);
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            byte[] bArr5 = (byte[]) it.next();
            java.lang.System.arraycopy(bArr5, 0, bArr4, i47, bArr5.length);
            i47 += bArr5.length;
        }
        return bArr4;
    }

    public int i() {
        int i17 = this.f351295d;
        if (this.f351293b - i17 < 4) {
            p(4);
            i17 = this.f351295d;
        }
        this.f351295d = i17 + 4;
        byte[] bArr = this.f351292a;
        return ((bArr[i17 + 3] & 255) << 24) | (bArr[i17] & 255) | ((bArr[i17 + 1] & 255) << 8) | ((bArr[i17 + 2] & 255) << 16);
    }

    public long j() {
        int i17 = this.f351295d;
        if (this.f351293b - i17 < 8) {
            p(8);
            i17 = this.f351295d;
        }
        this.f351295d = i17 + 8;
        byte[] bArr = this.f351292a;
        return ((bArr[i17 + 7] & 255) << 56) | (bArr[i17] & 255) | ((bArr[i17 + 1] & 255) << 8) | ((bArr[i17 + 2] & 255) << 16) | ((bArr[i17 + 3] & 255) << 24) | ((bArr[i17 + 4] & 255) << 32) | ((bArr[i17 + 5] & 255) << 40) | ((bArr[i17 + 6] & 255) << 48);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0079, code lost:
    
        if (r3[r2] < 0) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int k() {
        /*
            r8 = this;
            int r0 = r8.f351295d
            int r1 = r8.f351293b
            if (r1 != r0) goto L8
            goto L7b
        L8:
            int r2 = r0 + 1
            byte[] r3 = r8.f351292a
            r0 = r3[r0]
            if (r0 < 0) goto L13
            r8.f351295d = r2
            return r0
        L13:
            int r1 = r1 - r2
            r4 = 9
            if (r1 >= r4) goto L19
            goto L7b
        L19:
            int r1 = r2 + 1
            r2 = r3[r2]
            int r2 = r2 << 7
            r0 = r0 ^ r2
            long r4 = (long) r0
            r6 = 0
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 >= 0) goto L2c
            r2 = -128(0xffffffffffffff80, double:NaN)
        L29:
            long r2 = r2 ^ r4
            int r0 = (int) r2
            goto L81
        L2c:
            int r2 = r1 + 1
            r1 = r3[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            long r4 = (long) r0
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 < 0) goto L3e
            r0 = 16256(0x3f80, double:8.0315E-320)
            long r0 = r0 ^ r4
            int r0 = (int) r0
        L3c:
            r1 = r2
            goto L81
        L3e:
            int r1 = r2 + 1
            r2 = r3[r2]
            int r2 = r2 << 21
            r0 = r0 ^ r2
            long r4 = (long) r0
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 >= 0) goto L4e
            r2 = -2080896(0xffffffffffe03f80, double:NaN)
            goto L29
        L4e:
            int r2 = r1 + 1
            r1 = r3[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            long r4 = (long) r0
            r6 = 266354560(0xfe03f80, double:1.315966377E-315)
            long r4 = r4 ^ r6
            int r0 = (int) r4
            if (r1 >= 0) goto L3c
            int r1 = r2 + 1
            r2 = r3[r2]
            if (r2 >= 0) goto L81
            int r2 = r1 + 1
            r1 = r3[r1]
            if (r1 >= 0) goto L3c
            int r1 = r2 + 1
            r2 = r3[r2]
            if (r2 >= 0) goto L81
            int r2 = r1 + 1
            r1 = r3[r1]
            if (r1 >= 0) goto L3c
            int r1 = r2 + 1
            r2 = r3[r2]
            if (r2 >= 0) goto L81
        L7b:
            long r0 = r8.m()
            int r0 = (int) r0
            return r0
        L81:
            r8.f351295d = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p16.h.k():int");
    }

    public long l() {
        long j17;
        long j18;
        long j19;
        long j27;
        int i17 = this.f351295d;
        int i18 = this.f351293b;
        if (i18 != i17) {
            int i19 = i17 + 1;
            byte[] bArr = this.f351292a;
            byte b17 = bArr[i17];
            if (b17 >= 0) {
                this.f351295d = i19;
                return b17;
            }
            if (i18 - i19 >= 9) {
                int i27 = i19 + 1;
                long j28 = b17 ^ (bArr[i19] << 7);
                if (j28 < 0) {
                    j18 = (-128) ^ j28;
                } else {
                    int i28 = i27 + 1;
                    long j29 = (bArr[i27] << 14) ^ j28;
                    if (j29 >= 0) {
                        j18 = j29 ^ 16256;
                        i27 = i28;
                    } else {
                        int i29 = i28 + 1;
                        long j37 = j29 ^ (bArr[i28] << 21);
                        if (j37 < 0) {
                            j19 = -2080896;
                        } else {
                            int i37 = i29 + 1;
                            long j38 = j37 ^ (bArr[i29] << 28);
                            if (j38 >= 0) {
                                j27 = 266354560;
                            } else {
                                i29 = i37 + 1;
                                j37 = j38 ^ (bArr[i37] << 35);
                                if (j37 < 0) {
                                    j19 = -34093383808L;
                                } else {
                                    i37 = i29 + 1;
                                    j38 = j37 ^ (bArr[i29] << 42);
                                    if (j38 >= 0) {
                                        j27 = 4363953127296L;
                                    } else {
                                        i29 = i37 + 1;
                                        j37 = j38 ^ (bArr[i37] << 49);
                                        if (j37 < 0) {
                                            j19 = -558586000294016L;
                                        } else {
                                            i37 = i29 + 1;
                                            j17 = (j37 ^ (bArr[i29] << 56)) ^ 71499008037633920L;
                                            if (j17 < 0) {
                                                i29 = i37 + 1;
                                                if (bArr[i37] >= 0) {
                                                    j18 = j17;
                                                    i27 = i29;
                                                }
                                            }
                                            i27 = i37;
                                            j18 = j17;
                                        }
                                    }
                                }
                            }
                            j17 = j38 ^ j27;
                            i27 = i37;
                            j18 = j17;
                        }
                        j18 = j19 ^ j37;
                        i27 = i29;
                    }
                }
                this.f351295d = i27;
                return j18;
            }
        }
        return m();
    }

    public long m() {
        long j17 = 0;
        for (int i17 = 0; i17 < 64; i17 += 7) {
            if (this.f351295d == this.f351293b) {
                p(1);
            }
            int i18 = this.f351295d;
            this.f351295d = i18 + 1;
            j17 |= (r3 & Byte.MAX_VALUE) << i17;
            if ((this.f351292a[i18] & 128) == 0) {
                return j17;
            }
        }
        throw new p16.z("CodedInputStream encountered a malformed varint.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000c, code lost:
    
        if (s(1) == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int n() {
        /*
            r3 = this;
            int r0 = r3.f351295d
            int r1 = r3.f351293b
            r2 = 0
            if (r0 != r1) goto Lf
            r0 = 1
            boolean r1 = r3.s(r0)
            if (r1 != 0) goto Lf
            goto L10
        Lf:
            r0 = r2
        L10:
            if (r0 == 0) goto L15
            r3.f351297f = r2
            return r2
        L15:
            int r0 = r3.k()
            r3.f351297f = r0
            int r1 = r0 >>> 3
            if (r1 == 0) goto L20
            return r0
        L20:
            p16.z r0 = new p16.z
            java.lang.String r1 = "Protocol message contained an invalid tag (zero)."
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p16.h.n():int");
    }

    public final void o() {
        int i17 = this.f351293b + this.f351294c;
        this.f351293b = i17;
        int i18 = this.f351298g + i17;
        int i19 = this.f351299h;
        if (i18 <= i19) {
            this.f351294c = 0;
            return;
        }
        int i27 = i18 - i19;
        this.f351294c = i27;
        this.f351293b = i17 - i27;
    }

    public final void p(int i17) {
        if (!s(i17)) {
            throw p16.z.b();
        }
    }

    public boolean q(int i17, p16.j jVar) {
        int n17;
        int i18 = i17 & 7;
        if (i18 == 0) {
            long l17 = l();
            jVar.v(i17);
            jVar.w(l17);
            return true;
        }
        if (i18 == 1) {
            long j17 = j();
            jVar.v(i17);
            jVar.u(j17);
            return true;
        }
        if (i18 == 2) {
            p16.g e17 = e();
            jVar.v(i17);
            jVar.v(e17.size());
            jVar.r(e17);
            return true;
        }
        if (i18 != 3) {
            if (i18 == 4) {
                return false;
            }
            if (i18 != 5) {
                throw new p16.z("Protocol message tag had invalid wire type.");
            }
            int i19 = i();
            jVar.v(i17);
            jVar.t(i19);
            return true;
        }
        jVar.v(i17);
        do {
            n17 = n();
            if (n17 == 0) {
                break;
            }
        } while (q(n17, jVar));
        int i27 = ((i17 >>> 3) << 3) | 4;
        a(i27);
        jVar.v(i27);
        return true;
    }

    public void r(int i17) {
        int i18 = this.f351293b;
        int i19 = this.f351295d;
        int i27 = i18 - i19;
        if (i17 <= i27 && i17 >= 0) {
            this.f351295d = i19 + i17;
            return;
        }
        if (i17 < 0) {
            throw new p16.z("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i28 = this.f351298g;
        int i29 = i28 + i19 + i17;
        int i37 = this.f351299h;
        if (i29 > i37) {
            r((i37 - i28) - i19);
            throw p16.z.b();
        }
        this.f351295d = i18;
        p(1);
        while (true) {
            int i38 = i17 - i27;
            int i39 = this.f351293b;
            if (i38 <= i39) {
                this.f351295d = i38;
                return;
            } else {
                i27 += i39;
                this.f351295d = i39;
                p(1);
            }
        }
    }

    public final boolean s(int i17) {
        java.io.InputStream inputStream;
        int i18 = this.f351295d;
        int i19 = i18 + i17;
        int i27 = this.f351293b;
        if (i19 <= i27) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(77);
            sb6.append("refillBuffer() called when ");
            sb6.append(i17);
            sb6.append(" bytes were already available in buffer");
            throw new java.lang.IllegalStateException(sb6.toString());
        }
        if (this.f351298g + i18 + i17 <= this.f351299h && (inputStream = this.f351296e) != null) {
            byte[] bArr = this.f351292a;
            if (i18 > 0) {
                if (i27 > i18) {
                    java.lang.System.arraycopy(bArr, i18, bArr, 0, i27 - i18);
                }
                this.f351298g += i18;
                this.f351293b -= i18;
                this.f351295d = 0;
            }
            int i28 = this.f351293b;
            int read = inputStream.read(bArr, i28, bArr.length - i28);
            if (read == 0 || read < -1 || read > bArr.length) {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder(102);
                sb7.append("InputStream#read(byte[]) returned invalid result: ");
                sb7.append(read);
                sb7.append("\nThe InputStream implementation is buggy.");
                throw new java.lang.IllegalStateException(sb7.toString());
            }
            if (read > 0) {
                this.f351293b += read;
                if ((this.f351298g + i17) - 67108864 > 0) {
                    throw new p16.z("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
                }
                o();
                if (this.f351293b >= i17) {
                    return true;
                }
                return s(i17);
            }
        }
        return false;
    }
}
