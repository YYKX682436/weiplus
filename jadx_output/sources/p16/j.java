package p16;

/* loaded from: classes16.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f351312a;

    /* renamed from: b, reason: collision with root package name */
    public final int f351313b;

    /* renamed from: c, reason: collision with root package name */
    public int f351314c = 0;

    /* renamed from: d, reason: collision with root package name */
    public final java.io.OutputStream f351315d;

    public j(java.io.OutputStream outputStream, byte[] bArr) {
        this.f351315d = outputStream;
        this.f351312a = bArr;
        this.f351313b = bArr.length;
    }

    public static int a(int i17, int i18) {
        return h(i17) + c(i18);
    }

    public static int b(int i17, int i18) {
        return h(i17) + c(i18);
    }

    public static int c(int i17) {
        if (i17 >= 0) {
            return f(i17);
        }
        return 10;
    }

    public static int d(int i17, p16.h0 h0Var) {
        int h17 = h(i17);
        int serializedSize = h0Var.getSerializedSize();
        return h17 + f(serializedSize) + serializedSize;
    }

    public static int e(p16.h0 h0Var) {
        int serializedSize = h0Var.getSerializedSize();
        return f(serializedSize) + serializedSize;
    }

    public static int f(int i17) {
        if ((i17 & (-128)) == 0) {
            return 1;
        }
        if ((i17 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i17) == 0) {
            return 3;
        }
        return (i17 & com.tencent.tinker.loader.shareutil.ShareElfFile.SectionHeader.SHF_MASKPROC) == 0 ? 4 : 5;
    }

    public static int g(long j17) {
        if (((-128) & j17) == 0) {
            return 1;
        }
        if (((-16384) & j17) == 0) {
            return 2;
        }
        if (((-2097152) & j17) == 0) {
            return 3;
        }
        if (((-268435456) & j17) == 0) {
            return 4;
        }
        if (((-34359738368L) & j17) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j17) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j17) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j17) == 0) {
            return 8;
        }
        return (j17 & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public static int h(int i17) {
        return f((i17 << 3) | 0);
    }

    public static p16.j j(java.io.OutputStream outputStream, int i17) {
        return new p16.j(outputStream, new byte[i17]);
    }

    public void i() {
        if (this.f351315d != null) {
            k();
        }
    }

    public final void k() {
        java.io.OutputStream outputStream = this.f351315d;
        if (outputStream == null) {
            throw new p16.i();
        }
        outputStream.write(this.f351312a, 0, this.f351314c);
        this.f351314c = 0;
    }

    public void l(int i17, int i18) {
        x(i17, 0);
        n(i18);
    }

    public void m(int i17, int i18) {
        x(i17, 0);
        n(i18);
    }

    public void n(int i17) {
        if (i17 >= 0) {
            v(i17);
        } else {
            w(i17);
        }
    }

    public void o(int i17, p16.h0 h0Var) {
        x(i17, 2);
        p(h0Var);
    }

    public void p(p16.h0 h0Var) {
        v(h0Var.getSerializedSize());
        h0Var.a(this);
    }

    public void q(int i17) {
        byte b17 = (byte) i17;
        if (this.f351314c == this.f351313b) {
            k();
        }
        int i18 = this.f351314c;
        this.f351314c = i18 + 1;
        this.f351312a[i18] = b17;
    }

    public void r(p16.g gVar) {
        int size = gVar.size();
        int i17 = this.f351314c;
        int i18 = this.f351313b;
        int i19 = i18 - i17;
        byte[] bArr = this.f351312a;
        if (i19 >= size) {
            gVar.g(bArr, 0, i17, size);
            this.f351314c += size;
            return;
        }
        gVar.g(bArr, 0, i17, i19);
        int i27 = i19 + 0;
        int i28 = size - i19;
        this.f351314c = i18;
        k();
        if (i28 <= i18) {
            gVar.g(bArr, i27, 0, i28);
            this.f351314c = i28;
            return;
        }
        if (i27 < 0) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(30);
            sb6.append("Source offset < 0: ");
            sb6.append(i27);
            throw new java.lang.IndexOutOfBoundsException(sb6.toString());
        }
        if (i28 < 0) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder(23);
            sb7.append("Length < 0: ");
            sb7.append(i28);
            throw new java.lang.IndexOutOfBoundsException(sb7.toString());
        }
        int i29 = i27 + i28;
        if (i29 <= gVar.size()) {
            if (i28 > 0) {
                gVar.s(this.f351315d, i27, i28);
            }
        } else {
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder(39);
            sb8.append("Source end offset exceeded: ");
            sb8.append(i29);
            throw new java.lang.IndexOutOfBoundsException(sb8.toString());
        }
    }

    public void s(byte[] bArr) {
        int length = bArr.length;
        int i17 = this.f351314c;
        int i18 = this.f351313b;
        int i19 = i18 - i17;
        byte[] bArr2 = this.f351312a;
        if (i19 >= length) {
            java.lang.System.arraycopy(bArr, 0, bArr2, i17, length);
            this.f351314c += length;
            return;
        }
        java.lang.System.arraycopy(bArr, 0, bArr2, i17, i19);
        int i27 = i19 + 0;
        int i28 = length - i19;
        this.f351314c = i18;
        k();
        if (i28 > i18) {
            this.f351315d.write(bArr, i27, i28);
        } else {
            java.lang.System.arraycopy(bArr, i27, bArr2, 0, i28);
            this.f351314c = i28;
        }
    }

    public void t(int i17) {
        q(i17 & 255);
        q((i17 >> 8) & 255);
        q((i17 >> 16) & 255);
        q((i17 >> 24) & 255);
    }

    public void u(long j17) {
        q(((int) j17) & 255);
        q(((int) (j17 >> 8)) & 255);
        q(((int) (j17 >> 16)) & 255);
        q(((int) (j17 >> 24)) & 255);
        q(((int) (j17 >> 32)) & 255);
        q(((int) (j17 >> 40)) & 255);
        q(((int) (j17 >> 48)) & 255);
        q(((int) (j17 >> 56)) & 255);
    }

    public void v(int i17) {
        while ((i17 & (-128)) != 0) {
            q((i17 & 127) | 128);
            i17 >>>= 7;
        }
        q(i17);
    }

    public void w(long j17) {
        while (((-128) & j17) != 0) {
            q((((int) j17) & 127) | 128);
            j17 >>>= 7;
        }
        q((int) j17);
    }

    public void x(int i17, int i18) {
        v((i17 << 3) | i18);
    }
}
