package p16;

/* loaded from: classes16.dex */
public abstract class g implements java.lang.Iterable {

    /* renamed from: d, reason: collision with root package name */
    public static final p16.g f351283d = new p16.f0(new byte[0]);

    public static p16.g d(java.util.Iterator it, int i17) {
        if (i17 == 1) {
            return (p16.g) it.next();
        }
        int i18 = i17 >>> 1;
        return d(it, i18).e(d(it, i17 - i18));
    }

    public static p16.f m() {
        return new p16.f(128);
    }

    public p16.g e(p16.g gVar) {
        p16.g gVar2;
        int size = size();
        int size2 = gVar.size();
        if (size + size2 >= 2147483647L) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(53);
            sb6.append("ByteString would be too long: ");
            sb6.append(size);
            sb6.append("+");
            sb6.append(size2);
            throw new java.lang.IllegalArgumentException(sb6.toString());
        }
        int[] iArr = p16.o0.f351330n;
        p16.o0 o0Var = this instanceof p16.o0 ? (p16.o0) this : null;
        if (gVar.size() == 0) {
            return this;
        }
        if (size() == 0) {
            return gVar;
        }
        int size3 = size() + gVar.size();
        if (size3 < 128) {
            int size4 = size();
            int size5 = gVar.size();
            byte[] bArr = new byte[size4 + size5];
            g(bArr, 0, 0, size4);
            gVar.g(bArr, 0, size4, size5);
            return new p16.f0(bArr);
        }
        if (o0Var != null) {
            p16.g gVar3 = o0Var.f351333g;
            if (gVar3.size() + gVar.size() < 128) {
                int size6 = gVar3.size();
                int size7 = gVar.size();
                byte[] bArr2 = new byte[size6 + size7];
                gVar3.g(bArr2, 0, 0, size6);
                gVar.g(bArr2, 0, size6, size7);
                return new p16.o0(o0Var.f351332f, new p16.f0(bArr2));
            }
        }
        if (o0Var != null) {
            p16.g gVar4 = o0Var.f351332f;
            int j17 = gVar4.j();
            p16.g gVar5 = o0Var.f351333g;
            if (j17 > gVar5.j()) {
                if (o0Var.f351335i > gVar.j()) {
                    return new p16.o0(gVar4, new p16.o0(gVar5, gVar));
                }
            }
        }
        if (size3 >= p16.o0.f351330n[java.lang.Math.max(j(), gVar.j()) + 1]) {
            gVar2 = new p16.o0(this, gVar);
        } else {
            p16.l0 l0Var = new p16.l0(null);
            l0Var.a(this);
            l0Var.a(gVar);
            java.util.Stack stack = l0Var.f351320a;
            gVar2 = (p16.g) stack.pop();
            while (!stack.isEmpty()) {
                gVar2 = new p16.o0((p16.g) stack.pop(), gVar2);
            }
        }
        return gVar2;
    }

    public void g(byte[] bArr, int i17, int i18, int i19) {
        if (i17 < 0) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(30);
            sb6.append("Source offset < 0: ");
            sb6.append(i17);
            throw new java.lang.IndexOutOfBoundsException(sb6.toString());
        }
        if (i18 < 0) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder(30);
            sb7.append("Target offset < 0: ");
            sb7.append(i18);
            throw new java.lang.IndexOutOfBoundsException(sb7.toString());
        }
        if (i19 < 0) {
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder(23);
            sb8.append("Length < 0: ");
            sb8.append(i19);
            throw new java.lang.IndexOutOfBoundsException(sb8.toString());
        }
        int i27 = i17 + i19;
        if (i27 > size()) {
            java.lang.StringBuilder sb9 = new java.lang.StringBuilder(34);
            sb9.append("Source end offset < 0: ");
            sb9.append(i27);
            throw new java.lang.IndexOutOfBoundsException(sb9.toString());
        }
        int i28 = i18 + i19;
        if (i28 <= bArr.length) {
            if (i19 > 0) {
                h(bArr, i17, i18, i19);
            }
        } else {
            java.lang.StringBuilder sb10 = new java.lang.StringBuilder(34);
            sb10.append("Target end offset < 0: ");
            sb10.append(i28);
            throw new java.lang.IndexOutOfBoundsException(sb10.toString());
        }
    }

    public abstract void h(byte[] bArr, int i17, int i18, int i19);

    public abstract int j();

    public abstract boolean k();

    public abstract boolean l();

    public abstract int n(int i17, int i18, int i19);

    public abstract int o(int i17, int i18, int i19);

    public abstract int p();

    public abstract java.lang.String r(java.lang.String str);

    public abstract void s(java.io.OutputStream outputStream, int i17, int i18);

    public abstract int size();

    public java.lang.String toString() {
        return java.lang.String.format("<ByteString@%s size=%d>", java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)), java.lang.Integer.valueOf(size()));
    }
}
