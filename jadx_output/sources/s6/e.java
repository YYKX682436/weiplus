package s6;

/* loaded from: classes13.dex */
public class e {

    /* renamed from: b, reason: collision with root package name */
    public java.nio.ByteBuffer f403290b;

    /* renamed from: c, reason: collision with root package name */
    public s6.d f403291c;

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f403289a = new byte[256];

    /* renamed from: d, reason: collision with root package name */
    public int f403292d = 0;

    public final boolean a() {
        return this.f403291c.f403279b != 0;
    }

    public s6.d b() {
        byte[] bArr;
        if (this.f403290b == null) {
            throw new java.lang.IllegalStateException("You must call setData() before parseHeader()");
        }
        if (a()) {
            return this.f403291c;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (int i17 = 0; i17 < 6; i17++) {
            sb6.append((char) c());
        }
        if (sb6.toString().startsWith("GIF")) {
            this.f403291c.f403283f = f();
            this.f403291c.f403284g = f();
            int c17 = c();
            s6.d dVar = this.f403291c;
            dVar.f403285h = (c17 & 128) != 0;
            dVar.f403286i = (int) java.lang.Math.pow(2.0d, (c17 & 7) + 1);
            this.f403291c.f403287j = c();
            s6.d dVar2 = this.f403291c;
            c();
            dVar2.getClass();
            if (this.f403291c.f403285h && !a()) {
                s6.d dVar3 = this.f403291c;
                dVar3.f403278a = e(dVar3.f403286i);
                s6.d dVar4 = this.f403291c;
                dVar4.f403288k = dVar4.f403278a[dVar4.f403287j];
            }
        } else {
            this.f403291c.f403279b = 1;
        }
        if (!a()) {
            boolean z17 = false;
            while (!z17 && !a() && this.f403291c.f403280c <= Integer.MAX_VALUE) {
                int c18 = c();
                if (c18 == 33) {
                    int c19 = c();
                    if (c19 == 1) {
                        g();
                    } else if (c19 == 249) {
                        this.f403291c.f403281d = new s6.c();
                        c();
                        int c27 = c();
                        s6.c cVar = this.f403291c.f403281d;
                        int i18 = (c27 & 28) >> 2;
                        cVar.f403273g = i18;
                        if (i18 == 0) {
                            cVar.f403273g = 1;
                        }
                        cVar.f403272f = (c27 & 1) != 0;
                        int f17 = f();
                        if (f17 < 2) {
                            f17 = 10;
                        }
                        s6.c cVar2 = this.f403291c.f403281d;
                        cVar2.f403275i = f17 * 10;
                        cVar2.f403274h = c();
                        c();
                    } else if (c19 == 254) {
                        g();
                    } else if (c19 != 255) {
                        g();
                    } else {
                        d();
                        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                        int i19 = 0;
                        while (true) {
                            bArr = this.f403289a;
                            if (i19 >= 11) {
                                break;
                            }
                            sb7.append((char) bArr[i19]);
                            i19++;
                        }
                        if (sb7.toString().equals("NETSCAPE2.0")) {
                            do {
                                d();
                                if (bArr[0] == 1) {
                                    byte b17 = bArr[1];
                                    byte b18 = bArr[2];
                                    this.f403291c.getClass();
                                }
                                if (this.f403292d > 0) {
                                }
                            } while (!a());
                        } else {
                            g();
                        }
                    }
                } else if (c18 == 44) {
                    s6.d dVar5 = this.f403291c;
                    if (dVar5.f403281d == null) {
                        dVar5.f403281d = new s6.c();
                    }
                    dVar5.f403281d.f403267a = f();
                    this.f403291c.f403281d.f403268b = f();
                    this.f403291c.f403281d.f403269c = f();
                    this.f403291c.f403281d.f403270d = f();
                    int c28 = c();
                    boolean z18 = (c28 & 128) != 0;
                    int pow = (int) java.lang.Math.pow(2.0d, (c28 & 7) + 1);
                    s6.c cVar3 = this.f403291c.f403281d;
                    cVar3.f403271e = (c28 & 64) != 0;
                    if (z18) {
                        cVar3.f403277k = e(pow);
                    } else {
                        cVar3.f403277k = null;
                    }
                    this.f403291c.f403281d.f403276j = this.f403290b.position();
                    c();
                    g();
                    if (!a()) {
                        s6.d dVar6 = this.f403291c;
                        dVar6.f403280c++;
                        ((java.util.ArrayList) dVar6.f403282e).add(dVar6.f403281d);
                    }
                } else if (c18 != 59) {
                    this.f403291c.f403279b = 1;
                } else {
                    z17 = true;
                }
            }
            s6.d dVar7 = this.f403291c;
            if (dVar7.f403280c < 0) {
                dVar7.f403279b = 1;
            }
        }
        return this.f403291c;
    }

    public final int c() {
        try {
            return this.f403290b.get() & 255;
        } catch (java.lang.Exception unused) {
            this.f403291c.f403279b = 1;
            return 0;
        }
    }

    public final void d() {
        int c17 = c();
        this.f403292d = c17;
        if (c17 <= 0) {
            return;
        }
        int i17 = 0;
        while (true) {
            try {
                int i18 = this.f403292d;
                if (i17 >= i18) {
                    return;
                }
                int i19 = i18 - i17;
                this.f403290b.get(this.f403289a, i17, i19);
                i17 += i19;
            } catch (java.lang.Exception unused) {
                android.util.Log.isLoggable("GifHeaderParser", 3);
                this.f403291c.f403279b = 1;
                return;
            }
        }
    }

    public final int[] e(int i17) {
        byte[] bArr = new byte[i17 * 3];
        int[] iArr = null;
        try {
            this.f403290b.get(bArr);
            iArr = new int[256];
            int i18 = 0;
            int i19 = 0;
            while (i18 < i17) {
                int i27 = i19 + 1;
                int i28 = i27 + 1;
                int i29 = i28 + 1;
                int i37 = i18 + 1;
                iArr[i18] = ((bArr[i19] & 255) << 16) | (-16777216) | ((bArr[i27] & 255) << 8) | (bArr[i28] & 255);
                i19 = i29;
                i18 = i37;
            }
        } catch (java.nio.BufferUnderflowException unused) {
            android.util.Log.isLoggable("GifHeaderParser", 3);
            this.f403291c.f403279b = 1;
        }
        return iArr;
    }

    public final int f() {
        return this.f403290b.getShort();
    }

    public final void g() {
        int c17;
        do {
            c17 = c();
            this.f403290b.position(java.lang.Math.min(this.f403290b.position() + c17, this.f403290b.limit()));
        } while (c17 > 0);
    }
}
