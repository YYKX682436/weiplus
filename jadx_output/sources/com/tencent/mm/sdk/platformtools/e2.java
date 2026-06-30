package com.tencent.mm.sdk.platformtools;

/* loaded from: classes13.dex */
public class e2 {

    /* renamed from: a, reason: collision with root package name */
    public java.nio.ByteBuffer f192547a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f192548b;

    public byte[] a() {
        if (!this.f192548b) {
            throw new java.lang.Exception("Buffer For Parse");
        }
        b(1);
        this.f192547a.put((byte) 125);
        int position = this.f192547a.position();
        byte[] bArr = new byte[position];
        java.lang.System.arraycopy(this.f192547a.array(), 0, bArr, 0, position);
        return bArr;
    }

    public final int b(int i17) {
        if (this.f192547a.limit() - this.f192547a.position() > i17) {
            return 0;
        }
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(this.f192547a.limit() + 4096);
        allocate.put(this.f192547a.array(), 0, this.f192547a.position());
        this.f192547a = allocate;
        return 0;
    }

    public boolean c() {
        return this.f192547a.limit() - this.f192547a.position() <= 1;
    }

    public byte[] d() {
        if (this.f192548b) {
            throw new java.lang.Exception("Buffer For Build");
        }
        int i17 = this.f192547a.getShort();
        if (i17 > 1048576) {
            this.f192547a = null;
            throw new java.lang.Exception("Buffer String Length Error");
        }
        if (i17 == 0) {
            return new byte[0];
        }
        byte[] bArr = new byte[i17];
        this.f192547a.get(bArr, 0, i17);
        return bArr;
    }

    public int e() {
        if (this.f192548b) {
            throw new java.lang.Exception("Buffer For Build");
        }
        return this.f192547a.getInt();
    }

    public long f() {
        if (this.f192548b) {
            throw new java.lang.Exception("Buffer For Build");
        }
        return this.f192547a.getLong();
    }

    public java.lang.String g() {
        if (this.f192548b) {
            throw new java.lang.Exception("Buffer For Build");
        }
        int i17 = this.f192547a.getShort();
        if (i17 > 1048576) {
            this.f192547a = null;
            throw new java.lang.Exception("Buffer String Length Error");
        }
        if (i17 == 0) {
            return "";
        }
        byte[] bArr = new byte[i17];
        this.f192547a.get(bArr, 0, i17);
        return new java.lang.String(bArr, com.tencent.mapsdk.internal.rv.f51270c);
    }

    public int h() {
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(4096);
        this.f192547a = allocate;
        allocate.put((byte) 123);
        this.f192548b = true;
        return 0;
    }

    public int i(byte[] bArr) {
        if (((bArr == null || bArr.length == 0) ? (char) 65535 : bArr[0] != 123 ? (char) 65534 : bArr[bArr.length + (-1)] != 125 ? (char) 65533 : (char) 0) != 0) {
            this.f192547a = null;
            return -1;
        }
        java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(bArr);
        this.f192547a = wrap;
        wrap.position(1);
        this.f192548b = false;
        return 0;
    }

    public int j(byte[] bArr) {
        if (!this.f192548b) {
            throw new java.lang.Exception("Buffer For Parse");
        }
        if (bArr == null) {
            bArr = null;
        }
        if (bArr == null) {
            bArr = new byte[0];
        }
        if (bArr.length > 1048576) {
            throw new java.lang.Exception("Buffer String Length Error");
        }
        b(bArr.length + 2);
        this.f192547a.putShort((short) bArr.length);
        if (bArr.length > 0) {
            this.f192547a.put(bArr);
        }
        return 0;
    }

    public int k(int i17) {
        if (!this.f192548b) {
            throw new java.lang.Exception("Buffer For Parse");
        }
        b(4);
        this.f192547a.putInt(i17);
        return 0;
    }

    public int l(long j17) {
        if (!this.f192548b) {
            throw new java.lang.Exception("Buffer For Parse");
        }
        b(8);
        this.f192547a.putLong(j17);
        return 0;
    }

    public int m(java.lang.String str) {
        if (!this.f192548b) {
            throw new java.lang.Exception("Buffer For Parse");
        }
        byte[] bytes = str != null ? str.getBytes() : null;
        if (bytes == null) {
            bytes = new byte[0];
        }
        if (bytes.length > 1048576) {
            throw new java.lang.Exception("Buffer String Length Error");
        }
        b(bytes.length + 2);
        this.f192547a.putShort((short) bytes.length);
        if (bytes.length > 0) {
            this.f192547a.put(bytes);
        }
        return 0;
    }

    public void n(int i17) {
        java.nio.ByteBuffer byteBuffer = this.f192547a;
        byteBuffer.position(i17 + byteBuffer.position());
    }

    public void o() {
        if (this.f192548b) {
            throw new java.lang.Exception("Buffer For Build");
        }
        short s17 = this.f192547a.getShort();
        if (s17 > 1048576) {
            this.f192547a = null;
            throw new java.lang.Exception("Buffer String Length Error");
        }
        if (s17 == 0) {
            return;
        }
        java.nio.ByteBuffer byteBuffer = this.f192547a;
        byteBuffer.position(byteBuffer.position() + s17);
    }
}
