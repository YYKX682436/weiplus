package org.msgpack.core.buffer;

/* loaded from: classes7.dex */
public class h {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    static final int ARRAY_BYTE_BASE_OFFSET;
    private static final java.lang.String BIGENDIAN_MESSAGE_BUFFER = "org.msgpack.core.buffer.MessageBufferBE";
    private static final java.lang.String DEFAULT_MESSAGE_BUFFER = "org.msgpack.core.buffer.MessageBuffer";
    private static final java.lang.String UNIVERSAL_MESSAGE_BUFFER = "org.msgpack.core.buffer.MessageBufferU";
    static final boolean isUniversalBuffer;
    static final int javaVersion;
    private static final java.lang.reflect.Constructor<?> mbArrConstructor;
    private static final java.lang.reflect.Constructor<?> mbBBConstructor;
    static final sun.misc.Unsafe unsafe;
    protected final long address;
    protected final java.lang.Object base;
    protected final java.nio.ByteBuffer reference;
    protected final int size;

    /* JADX WARN: Removed duplicated region for block: B:106:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0086 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x010e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0097 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0157 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01ad A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        /*
            Method dump skipped, instructions count: 479
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.msgpack.core.buffer.h.<clinit>():void");
    }

    public h(byte[] bArr, int i17, int i18) {
        this.base = bArr;
        this.address = ARRAY_BYTE_BASE_OFFSET + i17;
        this.size = i18;
        this.reference = null;
    }

    public static org.msgpack.core.buffer.h a(java.lang.reflect.Constructor constructor, java.lang.Object... objArr) {
        try {
            return (org.msgpack.core.buffer.h) constructor.newInstance(objArr);
        } catch (java.lang.IllegalAccessException e17) {
            throw new java.lang.IllegalStateException(e17);
        } catch (java.lang.InstantiationException e18) {
            throw new java.lang.IllegalStateException(e18);
        } catch (java.lang.reflect.InvocationTargetException e19) {
            if (e19.getCause() instanceof java.lang.RuntimeException) {
                throw ((java.lang.RuntimeException) e19.getCause());
            }
            if (e19.getCause() instanceof java.lang.Error) {
                throw ((java.lang.Error) e19.getCause());
            }
            throw new java.lang.IllegalStateException(e19.getCause());
        }
    }

    public static org.msgpack.core.buffer.h allocate(int i17) {
        if (i17 >= 0) {
            return wrap(new byte[i17]);
        }
        throw new java.lang.IllegalArgumentException("size must not be negative");
    }

    public static org.msgpack.core.buffer.h b(byte[] bArr, int i17, int i18) {
        bArr.getClass();
        java.lang.reflect.Constructor<?> constructor = mbArrConstructor;
        return constructor != null ? a(constructor, bArr, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)) : new org.msgpack.core.buffer.h(bArr, i17, i18);
    }

    public static void releaseBuffer(org.msgpack.core.buffer.h hVar) {
        if (isUniversalBuffer || hVar.hasArray()) {
            return;
        }
        if (!org.msgpack.core.buffer.g.f347852e.isInstance(hVar.reference)) {
            unsafe.freeMemory(hVar.address);
            return;
        }
        java.nio.ByteBuffer byteBuffer = hVar.reference;
        try {
            if (javaVersion <= 8) {
                org.msgpack.core.buffer.g.f347849b.invoke(org.msgpack.core.buffer.g.f347848a.invoke(byteBuffer, new java.lang.Object[0]), new java.lang.Object[0]);
            } else {
                org.msgpack.core.buffer.g.f347850c.invoke(unsafe, byteBuffer);
            }
        } catch (java.lang.Throwable th6) {
            throw new java.lang.RuntimeException(th6);
        }
    }

    public static org.msgpack.core.buffer.h wrap(java.nio.ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        java.lang.reflect.Constructor<?> constructor = mbBBConstructor;
        if (constructor != null) {
            return a(constructor, byteBuffer);
        }
        return new org.msgpack.core.buffer.h(byteBuffer);
    }

    public int arrayOffset() {
        return ((int) this.address) - ARRAY_BYTE_BASE_OFFSET;
    }

    public byte getByte(int i17) {
        return unsafe.getByte(this.base, this.address + i17);
    }

    public void getBytes(int i17, byte[] bArr, int i18, int i19) {
        unsafe.copyMemory(this.base, this.address + i17, bArr, ARRAY_BYTE_BASE_OFFSET + i18, i19);
    }

    public int getInt(int i17) {
        return java.lang.Integer.reverseBytes(unsafe.getInt(this.base, this.address + i17));
    }

    public long getLong(int i17) {
        return java.lang.Long.reverseBytes(unsafe.getLong(this.base, this.address + i17));
    }

    public short getShort(int i17) {
        return java.lang.Short.reverseBytes(unsafe.getShort(this.base, this.address + i17));
    }

    public boolean hasArray() {
        return this.base != null;
    }

    public void putByte(int i17, byte b17) {
        unsafe.putByte(this.base, this.address + i17, b17);
    }

    public void putByteBuffer(int i17, java.nio.ByteBuffer byteBuffer, int i18) {
        if (byteBuffer.isDirect()) {
            unsafe.copyMemory((java.lang.Object) null, org.msgpack.core.buffer.g.a(byteBuffer) + byteBuffer.position(), this.base, this.address + i17, i18);
            byteBuffer.position(byteBuffer.position() + i18);
            return;
        }
        if (byteBuffer.hasArray()) {
            unsafe.copyMemory(byteBuffer.array(), ARRAY_BYTE_BASE_OFFSET + byteBuffer.position(), this.base, this.address + i17, i18);
            byteBuffer.position(byteBuffer.position() + i18);
        } else {
            if (hasArray()) {
                byteBuffer.get((byte[]) this.base, i17, i18);
                return;
            }
            for (int i19 = 0; i19 < i18; i19++) {
                unsafe.putByte(this.base, this.address + i17, byteBuffer.get());
            }
        }
    }

    public void putBytes(int i17, byte[] bArr, int i18, int i19) {
        unsafe.copyMemory(bArr, ARRAY_BYTE_BASE_OFFSET + i18, this.base, this.address + i17, i19);
    }

    public void putInt(int i17, int i18) {
        unsafe.putInt(this.base, this.address + i17, java.lang.Integer.reverseBytes(i18));
    }

    public void putLong(int i17, long j17) {
        unsafe.putLong(this.base, i17 + this.address, java.lang.Long.reverseBytes(j17));
    }

    public void putMessageBuffer(int i17, org.msgpack.core.buffer.h hVar, int i18, int i19) {
        unsafe.copyMemory(hVar.base, hVar.address + i18, this.base, i17 + this.address, i19);
    }

    public void putShort(int i17, short s17) {
        unsafe.putShort(this.base, this.address + i17, java.lang.Short.reverseBytes(s17));
    }

    public int size() {
        return this.size;
    }

    public org.msgpack.core.buffer.h slice(int i17, int i18) {
        if (i17 == 0 && i18 == size()) {
            return this;
        }
        if (i17 + i18 <= size()) {
            return new org.msgpack.core.buffer.h(this.base, this.address + i17, i18);
        }
        throw new java.lang.IllegalArgumentException();
    }

    public java.nio.ByteBuffer sliceAsByteBuffer(int i17, int i18) {
        if (hasArray()) {
            return java.nio.ByteBuffer.wrap((byte[]) this.base, (int) ((this.address - ARRAY_BYTE_BASE_OFFSET) + i17), i18);
        }
        long j17 = this.address;
        java.nio.ByteBuffer byteBuffer = this.reference;
        java.lang.reflect.Constructor constructor = org.msgpack.core.buffer.g.f347851d;
        if (constructor == null) {
            throw new java.lang.IllegalStateException("Can't create a new DirectByteBuffer. In JDK17+, two JVM options needs to be set: --add-opens=java.base/java.nio=ALL-UNNAMED and --add-opens=java.base/sun.nio.ch=ALL-UNNAMED");
        }
        try {
            int ordinal = org.msgpack.core.buffer.g.f347853f.ordinal();
            if (ordinal == 0) {
                return (java.nio.ByteBuffer) constructor.newInstance(java.lang.Long.valueOf(j17 + i17), java.lang.Long.valueOf(i18));
            }
            if (ordinal == 1) {
                return (java.nio.ByteBuffer) constructor.newInstance(java.lang.Long.valueOf(j17 + i17), java.lang.Integer.valueOf(i18), byteBuffer);
            }
            if (ordinal == 2) {
                return (java.nio.ByteBuffer) constructor.newInstance(java.lang.Long.valueOf(j17 + i17), java.lang.Integer.valueOf(i18));
            }
            if (ordinal == 3) {
                return (java.nio.ByteBuffer) constructor.newInstance(java.lang.Integer.valueOf(((int) j17) + i17), java.lang.Integer.valueOf(i18));
            }
            if (ordinal == 4) {
                return (java.nio.ByteBuffer) constructor.newInstance(org.msgpack.core.buffer.g.f347854g.invoke(null, java.lang.Long.valueOf(j17 + i17), java.lang.Integer.valueOf(i18)), java.lang.Integer.valueOf(i18), 0);
            }
            throw new java.lang.IllegalStateException("Unexpected value");
        } catch (java.lang.Throwable th6) {
            throw new java.lang.RuntimeException(th6);
        }
    }

    public java.lang.String toHexString(int i17, int i18) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (int i19 = i17; i19 < i18; i19++) {
            if (i19 != i17) {
                sb6.append(" ");
            }
            sb6.append(java.lang.String.format("%02x", java.lang.Byte.valueOf(getByte(i19))));
        }
        return sb6.toString();
    }

    public static org.msgpack.core.buffer.h wrap(byte[] bArr) {
        return b(bArr, 0, bArr.length);
    }

    public h(java.nio.ByteBuffer byteBuffer) {
        if (byteBuffer.isDirect()) {
            if (isUniversalBuffer) {
                this.base = null;
                this.address = 0L;
                this.size = byteBuffer.remaining();
                this.reference = null;
                return;
            }
            this.base = null;
            this.address = org.msgpack.core.buffer.g.a(byteBuffer) + byteBuffer.position();
            this.size = byteBuffer.remaining();
            this.reference = byteBuffer;
            return;
        }
        if (byteBuffer.hasArray()) {
            this.base = byteBuffer.array();
            this.address = ARRAY_BYTE_BASE_OFFSET + byteBuffer.arrayOffset() + byteBuffer.position();
            this.size = byteBuffer.remaining();
            this.reference = null;
            return;
        }
        throw new java.lang.IllegalArgumentException("Only the array-backed ByteBuffer or DirectBuffer is supported");
    }

    public static org.msgpack.core.buffer.h wrap(byte[] bArr, int i17, int i18) {
        return b(bArr, i17, i18);
    }

    public h(java.lang.Object obj, long j17, int i17) {
        this.base = obj;
        this.address = j17;
        this.size = i17;
        this.reference = null;
    }
}
