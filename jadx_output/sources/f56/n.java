package f56;

/* loaded from: classes7.dex */
public class n implements java.io.Closeable {

    /* renamed from: i, reason: collision with root package name */
    public static final org.msgpack.core.buffer.h f259820i = org.msgpack.core.buffer.h.wrap(new byte[0]);

    /* renamed from: d, reason: collision with root package name */
    public final org.msgpack.core.buffer.i f259821d;

    /* renamed from: f, reason: collision with root package name */
    public int f259823f;

    /* renamed from: h, reason: collision with root package name */
    public int f259825h;

    /* renamed from: e, reason: collision with root package name */
    public org.msgpack.core.buffer.h f259822e = f259820i;

    /* renamed from: g, reason: collision with root package name */
    public final org.msgpack.core.buffer.h f259824g = org.msgpack.core.buffer.h.allocate(8);

    public n(org.msgpack.core.buffer.i iVar, f56.h hVar) {
        if (iVar == null) {
            throw new java.lang.NullPointerException("MessageBufferInput is null");
        }
        this.f259821d = iVar;
        hVar.getClass();
    }

    public final void a() {
        org.msgpack.core.buffer.h hVar;
        org.msgpack.core.buffer.a aVar = (org.msgpack.core.buffer.a) this.f259821d;
        if (aVar.f347835e) {
            hVar = null;
        } else {
            aVar.f347835e = true;
            hVar = aVar.f347834d;
        }
        if (hVar == null) {
            throw new f56.d();
        }
        this.f259822e.size();
        this.f259822e = hVar;
        this.f259823f = 0;
    }

    public final org.msgpack.core.buffer.h b(int i17) {
        int i18;
        int size = this.f259822e.size();
        int i19 = this.f259823f;
        int i27 = size - i19;
        if (i27 >= i17) {
            this.f259825h = i19;
            this.f259823f = i19 + i17;
            return this.f259822e;
        }
        org.msgpack.core.buffer.h hVar = this.f259824g;
        if (i27 > 0) {
            hVar.putMessageBuffer(0, this.f259822e, i19, i27);
            i17 -= i27;
            i18 = i27 + 0;
        } else {
            i18 = 0;
        }
        while (true) {
            a();
            int size2 = this.f259822e.size();
            if (size2 >= i17) {
                hVar.putMessageBuffer(i18, this.f259822e, 0, i17);
                this.f259823f = i17;
                this.f259825h = 0;
                return hVar;
            }
            hVar.putMessageBuffer(i18, this.f259822e, 0, size2);
            i17 -= size2;
            i18 += size2;
        }
    }

    public int c() {
        byte readByte = readByte();
        int i17 = readByte & 255;
        if (i17 <= 127 || i17 >= 224) {
            return readByte;
        }
        switch (readByte) {
            case -52:
                return readByte() & 255;
            case -51:
                return b(2).getShort(this.f259825h) & 65535;
            case -50:
                int i18 = b(4).getInt(this.f259825h);
                if (i18 >= 0) {
                    return i18;
                }
                throw new f56.e(java.math.BigInteger.valueOf((i18 & Integer.MAX_VALUE) + 2147483648L));
            case -49:
                long j17 = b(8).getLong(this.f259825h);
                if (j17 < 0 || j17 > 2147483647L) {
                    throw new f56.e(java.math.BigInteger.valueOf(j17 + com.tencent.wcdb.core.Database.DictDefaultMatchValue + 1).setBit(63));
                }
                return (int) j17;
            case -48:
                return readByte();
            case -47:
                return b(2).getShort(this.f259825h);
            case -46:
                return b(4).getInt(this.f259825h);
            case -45:
                long j18 = b(8).getLong(this.f259825h);
                if (j18 < -2147483648L || j18 > 2147483647L) {
                    throw new f56.e(java.math.BigInteger.valueOf(j18));
                }
                return (int) j18;
            default:
                f56.b bVar = f56.b.S[i17];
                f56.b bVar2 = f56.b.f259782m;
                if (bVar == bVar2) {
                    throw new f56.f(java.lang.String.format("Expected %s, but encountered 0xC1 \"NEVER_USED\" byte", com.tencent.tmassistantsdk.downloadservice.DownloadSetting.TYPE_INTEGER));
                }
                if (bVar == bVar2) {
                    bVar.getClass();
                    throw new f56.c("Cannot convert NEVER_USED to ValueType");
                }
                java.lang.String name = bVar.f259796d.name();
                throw new f56.m(java.lang.String.format("Expected %s, but got %s (%02x)", com.tencent.tmassistantsdk.downloadservice.DownloadSetting.TYPE_INTEGER, name.substring(0, 1) + name.substring(1).toLowerCase(), java.lang.Byte.valueOf(readByte)));
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f259822e = f259820i;
        this.f259823f = 0;
        ((org.msgpack.core.buffer.a) this.f259821d).close();
    }

    public final byte readByte() {
        int size = this.f259822e.size();
        int i17 = this.f259823f;
        if (size > i17) {
            byte b17 = this.f259822e.getByte(i17);
            this.f259823f++;
            return b17;
        }
        a();
        if (this.f259822e.size() <= 0) {
            return readByte();
        }
        byte b18 = this.f259822e.getByte(0);
        this.f259823f = 1;
        return b18;
    }
}
