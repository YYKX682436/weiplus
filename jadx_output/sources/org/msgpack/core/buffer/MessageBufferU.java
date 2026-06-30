package org.msgpack.core.buffer;

/* loaded from: classes7.dex */
public class MessageBufferU extends org.msgpack.core.buffer.h {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final java.nio.ByteBuffer wrap;

    public MessageBufferU(byte[] bArr, int i17, int i18) {
        super(bArr, i17, i18);
        this.wrap = java.nio.ByteBuffer.wrap(bArr, i17, i18).slice();
    }

    private void resetBufferPosition() {
        this.wrap.position(0);
        this.wrap.limit(this.size);
    }

    public byte[] array() {
        if (hasArray()) {
            return this.wrap.array();
        }
        return null;
    }

    public void copyTo(int i17, org.msgpack.core.buffer.h hVar, int i18, int i19) {
        try {
            this.wrap.position(i17);
            hVar.putByteBuffer(i18, this.wrap, i19);
        } finally {
            resetBufferPosition();
        }
    }

    public boolean getBoolean(int i17) {
        return this.wrap.get(i17) != 0;
    }

    @Override // org.msgpack.core.buffer.h
    public byte getByte(int i17) {
        return this.wrap.get(i17);
    }

    public void getBytes(int i17, int i18, java.nio.ByteBuffer byteBuffer) {
        try {
            this.wrap.position(i17);
            this.wrap.limit(i17 + i18);
            byteBuffer.put(this.wrap);
        } finally {
            resetBufferPosition();
        }
    }

    public double getDouble(int i17) {
        return this.wrap.getDouble(i17);
    }

    public float getFloat(int i17) {
        return this.wrap.getFloat(i17);
    }

    @Override // org.msgpack.core.buffer.h
    public int getInt(int i17) {
        return this.wrap.getInt(i17);
    }

    @Override // org.msgpack.core.buffer.h
    public long getLong(int i17) {
        return this.wrap.getLong(i17);
    }

    @Override // org.msgpack.core.buffer.h
    public short getShort(int i17) {
        return this.wrap.getShort(i17);
    }

    @Override // org.msgpack.core.buffer.h
    public boolean hasArray() {
        return !this.wrap.isDirect();
    }

    public void putBoolean(int i17, boolean z17) {
        this.wrap.put(i17, z17 ? (byte) 1 : (byte) 0);
    }

    @Override // org.msgpack.core.buffer.h
    public void putByte(int i17, byte b17) {
        this.wrap.put(i17, b17);
    }

    @Override // org.msgpack.core.buffer.h
    public void putByteBuffer(int i17, java.nio.ByteBuffer byteBuffer, int i18) {
        if (byteBuffer.hasArray()) {
            putBytes(i17, byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), i18);
            byteBuffer.position(byteBuffer.position() + i18);
            return;
        }
        int limit = byteBuffer.limit();
        try {
            byteBuffer.limit(byteBuffer.position() + i18);
            this.wrap.position(i17);
            this.wrap.put(byteBuffer);
        } finally {
            byteBuffer.limit(limit);
        }
    }

    @Override // org.msgpack.core.buffer.h
    public void putBytes(int i17, byte[] bArr, int i18, int i19) {
        try {
            this.wrap.position(i17);
            this.wrap.put(bArr, i18, i19);
        } finally {
            resetBufferPosition();
        }
    }

    public void putDouble(int i17, double d17) {
        this.wrap.putDouble(i17, d17);
    }

    public void putFloat(int i17, float f17) {
        this.wrap.putFloat(i17, f17);
    }

    @Override // org.msgpack.core.buffer.h
    public void putInt(int i17, int i18) {
        this.wrap.putInt(i17, i18);
    }

    @Override // org.msgpack.core.buffer.h
    public void putLong(int i17, long j17) {
        this.wrap.putLong(i17, j17);
    }

    @Override // org.msgpack.core.buffer.h
    public void putMessageBuffer(int i17, org.msgpack.core.buffer.h hVar, int i18, int i19) {
        putByteBuffer(i17, hVar.sliceAsByteBuffer(i18, i19), i19);
    }

    @Override // org.msgpack.core.buffer.h
    public void putShort(int i17, short s17) {
        this.wrap.putShort(i17, s17);
    }

    @Override // org.msgpack.core.buffer.h
    public java.nio.ByteBuffer sliceAsByteBuffer(int i17, int i18) {
        try {
            this.wrap.position(i17);
            this.wrap.limit(i17 + i18);
            return this.wrap.slice();
        } finally {
            resetBufferPosition();
        }
    }

    public byte[] toByteArray() {
        int size = size();
        byte[] bArr = new byte[size];
        getBytes(0, bArr, 0, size);
        return bArr;
    }

    @Override // org.msgpack.core.buffer.h
    public org.msgpack.core.buffer.MessageBufferU slice(int i17, int i18) {
        if (i17 == 0 && i18 == size()) {
            return this;
        }
        int i19 = i17 + i18;
        if (i19 <= size()) {
            try {
                this.wrap.position(i17);
                this.wrap.limit(i19);
                return new org.msgpack.core.buffer.MessageBufferU(this.base, i17 + this.address, i18, this.wrap.slice());
            } finally {
                resetBufferPosition();
            }
        }
        throw new java.lang.IllegalArgumentException();
    }

    public MessageBufferU(java.nio.ByteBuffer byteBuffer) {
        super(byteBuffer);
        this.wrap = byteBuffer.slice();
    }

    private MessageBufferU(java.lang.Object obj, long j17, int i17, java.nio.ByteBuffer byteBuffer) {
        super(obj, j17, i17);
        this.wrap = byteBuffer;
    }

    @Override // org.msgpack.core.buffer.h
    public void getBytes(int i17, byte[] bArr, int i18, int i19) {
        try {
            this.wrap.position(i17);
            this.wrap.get(bArr, i18, i19);
        } finally {
            resetBufferPosition();
        }
    }

    public java.nio.ByteBuffer sliceAsByteBuffer() {
        return sliceAsByteBuffer(0, this.size);
    }
}
