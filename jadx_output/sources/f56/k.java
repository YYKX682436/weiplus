package f56;

/* loaded from: classes7.dex */
public abstract class k implements java.io.Closeable, java.io.Flushable {

    /* renamed from: n, reason: collision with root package name */
    public static final boolean f259812n;

    /* renamed from: d, reason: collision with root package name */
    public final int f259813d;

    /* renamed from: e, reason: collision with root package name */
    public final int f259814e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f259815f;

    /* renamed from: g, reason: collision with root package name */
    public final org.msgpack.core.buffer.j f259816g;

    /* renamed from: h, reason: collision with root package name */
    public org.msgpack.core.buffer.h f259817h;

    /* renamed from: i, reason: collision with root package name */
    public int f259818i;

    /* renamed from: m, reason: collision with root package name */
    public java.nio.charset.CharsetEncoder f259819m;

    static {
        boolean z17 = false;
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("android.os.Build$VERSION");
            int i17 = cls.getField("SDK_INT").getInt(cls.getConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]));
            if (i17 >= 14 && i17 < 21) {
                z17 = true;
            }
        } catch (java.lang.ClassNotFoundException | java.lang.IllegalAccessException | java.lang.InstantiationException | java.lang.NoSuchFieldException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException unused) {
        }
        f259812n = z17;
    }

    public k(org.msgpack.core.buffer.j jVar, f56.g gVar) {
        if (jVar == null) {
            throw new java.lang.NullPointerException("MessageBufferOutput is null");
        }
        this.f259816g = jVar;
        this.f259813d = gVar.f259798d;
        this.f259814e = gVar.f259799e;
        this.f259815f = gVar.f259801g;
        this.f259818i = 0;
    }

    public final void A(byte b17, short s17) {
        b(3);
        org.msgpack.core.buffer.h hVar = this.f259817h;
        int i17 = this.f259818i;
        this.f259818i = i17 + 1;
        hVar.putByte(i17, b17);
        this.f259817h.putShort(this.f259818i, s17);
        this.f259818i += 2;
    }

    public f56.k C(byte[] bArr) {
        int length = bArr.length;
        org.msgpack.core.buffer.h hVar = this.f259817h;
        if (hVar != null) {
            int size = hVar.size();
            int i17 = this.f259818i;
            if (size - i17 >= length && length <= this.f259814e) {
                this.f259817h.putBytes(i17, bArr, 0, length);
                this.f259818i += length;
                return this;
            }
        }
        flush();
        org.msgpack.core.buffer.b bVar = (org.msgpack.core.buffer.b) this.f259816g;
        bVar.getClass();
        org.msgpack.core.buffer.h allocate = org.msgpack.core.buffer.h.allocate(length);
        allocate.putBytes(0, bArr, 0, length);
        ((java.util.ArrayList) bVar.f347836d).add(allocate);
        return this;
    }

    public final int a(int i17, java.lang.String str) {
        if (this.f259819m == null) {
            this.f259819m = f56.i.f259809a.newEncoder().onMalformedInput(java.nio.charset.CodingErrorAction.REPLACE).onUnmappableCharacter(java.nio.charset.CodingErrorAction.REPLACE);
        }
        this.f259819m.reset();
        org.msgpack.core.buffer.h hVar = this.f259817h;
        java.nio.ByteBuffer sliceAsByteBuffer = hVar.sliceAsByteBuffer(i17, hVar.size() - i17);
        int position = sliceAsByteBuffer.position();
        java.nio.charset.CoderResult encode = this.f259819m.encode(java.nio.CharBuffer.wrap(str), sliceAsByteBuffer, true);
        if (encode.isError()) {
            try {
                encode.throwException();
            } catch (java.nio.charset.CharacterCodingException e17) {
                throw new f56.l(e17);
            }
        }
        if (encode.isUnderflow() && !encode.isOverflow() && this.f259819m.flush(sliceAsByteBuffer).isUnderflow()) {
            return sliceAsByteBuffer.position() - position;
        }
        return -1;
    }

    public final void b(int i17) {
        org.msgpack.core.buffer.h allocate;
        org.msgpack.core.buffer.h allocate2;
        org.msgpack.core.buffer.h hVar = this.f259817h;
        org.msgpack.core.buffer.j jVar = this.f259816g;
        if (hVar == null) {
            org.msgpack.core.buffer.b bVar = (org.msgpack.core.buffer.b) jVar;
            org.msgpack.core.buffer.h hVar2 = bVar.f347838f;
            if (hVar2 == null || hVar2.size() <= i17) {
                allocate2 = org.msgpack.core.buffer.h.allocate(java.lang.Math.max(bVar.f347837e, i17));
                bVar.f347838f = allocate2;
            } else {
                allocate2 = bVar.f347838f;
            }
            this.f259817h = allocate2;
            return;
        }
        if (this.f259818i + i17 >= hVar.size()) {
            c();
            org.msgpack.core.buffer.b bVar2 = (org.msgpack.core.buffer.b) jVar;
            org.msgpack.core.buffer.h hVar3 = bVar2.f347838f;
            if (hVar3 == null || hVar3.size() <= i17) {
                allocate = org.msgpack.core.buffer.h.allocate(java.lang.Math.max(bVar2.f347837e, i17));
                bVar2.f347838f = allocate;
            } else {
                allocate = bVar2.f347838f;
            }
            this.f259817h = allocate;
        }
    }

    public final void c() {
        int i17 = this.f259818i;
        org.msgpack.core.buffer.b bVar = (org.msgpack.core.buffer.b) this.f259816g;
        ((java.util.ArrayList) bVar.f347836d).add(bVar.f347838f.slice(0, i17));
        if (bVar.f347838f.size() - i17 > bVar.f347837e / 4) {
            org.msgpack.core.buffer.h hVar = bVar.f347838f;
            bVar.f347838f = hVar.slice(i17, hVar.size() - i17);
        } else {
            bVar.f347838f = null;
        }
        this.f259817h = null;
        this.f259818i = 0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        org.msgpack.core.buffer.j jVar = this.f259816g;
        try {
            flush();
        } finally {
            jVar.getClass();
        }
    }

    public f56.k f(int i17) {
        if (i17 < 0) {
            throw new java.lang.IllegalArgumentException("array size must be >= 0");
        }
        if (i17 < 16) {
            v((byte) (i17 | (-112)));
        } else if (i17 < 65536) {
            A((byte) -36, (short) i17);
        } else {
            x((byte) -35, i17);
        }
        return this;
    }

    @Override // java.io.Flushable
    public void flush() {
        if (this.f259818i > 0) {
            c();
        }
        this.f259816g.getClass();
    }

    public f56.k i(int i17) {
        if (i17 < 256) {
            w((byte) -60, (byte) i17);
        } else if (i17 < 65536) {
            A((byte) -59, (short) i17);
        } else {
            x((byte) -58, i17);
        }
        return this;
    }

    public f56.k j(int i17) {
        if (i17 < -32) {
            if (i17 < -32768) {
                x((byte) -46, i17);
            } else if (i17 < -128) {
                A((byte) -47, (short) i17);
            } else {
                w((byte) -48, (byte) i17);
            }
        } else if (i17 < 128) {
            v((byte) i17);
        } else if (i17 < 256) {
            w((byte) -52, (byte) i17);
        } else if (i17 < 65536) {
            A((byte) -51, (short) i17);
        } else {
            x((byte) -50, i17);
        }
        return this;
    }

    public f56.k k(long j17) {
        if (j17 < -32) {
            if (j17 < -32768) {
                if (j17 < -2147483648L) {
                    z((byte) -45, j17);
                } else {
                    x((byte) -46, (int) j17);
                }
            } else if (j17 < -128) {
                A((byte) -47, (short) j17);
            } else {
                w((byte) -48, (byte) j17);
            }
        } else if (j17 < 128) {
            v((byte) j17);
        } else if (j17 < 65536) {
            if (j17 < 256) {
                w((byte) -52, (byte) j17);
            } else {
                A((byte) -51, (short) j17);
            }
        } else if (j17 < 4294967296L) {
            x((byte) -50, (int) j17);
        } else {
            z((byte) -49, j17);
        }
        return this;
    }

    public f56.k l(int i17) {
        if (i17 < 32) {
            v((byte) (i17 | (-96)));
        } else if (this.f259815f && i17 < 256) {
            w((byte) -39, (byte) i17);
        } else if (i17 < 65536) {
            A((byte) -38, (short) i17);
        } else {
            x((byte) -37, i17);
        }
        return this;
    }

    public f56.k p(java.lang.String str) {
        if (str.length() <= 0) {
            l(0);
            return this;
        }
        if (f259812n || str.length() < this.f259813d) {
            q(str);
            return this;
        }
        if (str.length() < 256) {
            b((str.length() * 6) + 2 + 1);
            int a17 = a(this.f259818i + 2, str);
            if (a17 >= 0) {
                if (this.f259815f && a17 < 256) {
                    org.msgpack.core.buffer.h hVar = this.f259817h;
                    int i17 = this.f259818i;
                    this.f259818i = i17 + 1;
                    hVar.putByte(i17, (byte) -39);
                    org.msgpack.core.buffer.h hVar2 = this.f259817h;
                    int i18 = this.f259818i;
                    this.f259818i = i18 + 1;
                    hVar2.putByte(i18, (byte) a17);
                    this.f259818i += a17;
                } else {
                    if (a17 >= 65536) {
                        throw new java.lang.IllegalArgumentException("Unexpected UTF-8 encoder state");
                    }
                    org.msgpack.core.buffer.h hVar3 = this.f259817h;
                    int i19 = this.f259818i;
                    hVar3.putMessageBuffer(i19 + 3, hVar3, i19 + 2, a17);
                    org.msgpack.core.buffer.h hVar4 = this.f259817h;
                    int i27 = this.f259818i;
                    this.f259818i = i27 + 1;
                    hVar4.putByte(i27, (byte) -38);
                    this.f259817h.putShort(this.f259818i, (short) a17);
                    this.f259818i = this.f259818i + 2 + a17;
                }
                return this;
            }
        } else if (str.length() < 65536) {
            b((str.length() * 6) + 3 + 2);
            int a18 = a(this.f259818i + 3, str);
            if (a18 >= 0) {
                if (a18 < 65536) {
                    org.msgpack.core.buffer.h hVar5 = this.f259817h;
                    int i28 = this.f259818i;
                    this.f259818i = i28 + 1;
                    hVar5.putByte(i28, (byte) -38);
                    this.f259817h.putShort(this.f259818i, (short) a18);
                    this.f259818i = this.f259818i + 2 + a18;
                } else {
                    org.msgpack.core.buffer.h hVar6 = this.f259817h;
                    int i29 = this.f259818i;
                    hVar6.putMessageBuffer(i29 + 5, hVar6, i29 + 3, a18);
                    org.msgpack.core.buffer.h hVar7 = this.f259817h;
                    int i37 = this.f259818i;
                    this.f259818i = i37 + 1;
                    hVar7.putByte(i37, (byte) -37);
                    this.f259817h.putInt(this.f259818i, a18);
                    this.f259818i = this.f259818i + 4 + a18;
                }
                return this;
            }
        }
        q(str);
        return this;
    }

    public final void q(java.lang.String str) {
        byte[] bytes = str.getBytes(f56.i.f259809a);
        l(bytes.length);
        int length = bytes.length;
        org.msgpack.core.buffer.h hVar = this.f259817h;
        if (hVar != null) {
            int size = hVar.size();
            int i17 = this.f259818i;
            if (size - i17 >= length && length <= this.f259814e) {
                this.f259817h.putBytes(i17, bytes, 0, length);
                this.f259818i += length;
                return;
            }
        }
        flush();
        org.msgpack.core.buffer.b bVar = (org.msgpack.core.buffer.b) this.f259816g;
        bVar.getClass();
        ((java.util.ArrayList) bVar.f347836d).add(org.msgpack.core.buffer.h.wrap(bytes, 0, length));
    }

    public final void v(byte b17) {
        b(1);
        org.msgpack.core.buffer.h hVar = this.f259817h;
        int i17 = this.f259818i;
        this.f259818i = i17 + 1;
        hVar.putByte(i17, b17);
    }

    public final void w(byte b17, byte b18) {
        b(2);
        org.msgpack.core.buffer.h hVar = this.f259817h;
        int i17 = this.f259818i;
        this.f259818i = i17 + 1;
        hVar.putByte(i17, b17);
        org.msgpack.core.buffer.h hVar2 = this.f259817h;
        int i18 = this.f259818i;
        this.f259818i = i18 + 1;
        hVar2.putByte(i18, b18);
    }

    public final void x(byte b17, int i17) {
        b(5);
        org.msgpack.core.buffer.h hVar = this.f259817h;
        int i18 = this.f259818i;
        this.f259818i = i18 + 1;
        hVar.putByte(i18, b17);
        this.f259817h.putInt(this.f259818i, i17);
        this.f259818i += 4;
    }

    public final void z(byte b17, long j17) {
        b(9);
        org.msgpack.core.buffer.h hVar = this.f259817h;
        int i17 = this.f259818i;
        this.f259818i = i17 + 1;
        hVar.putByte(i17, b17);
        this.f259817h.putLong(this.f259818i, j17);
        this.f259818i += 8;
    }
}
