package com.tencent.wechat.zidl2;

/* loaded from: classes13.dex */
public class InvokerCodecEncoder {
    private static final int CAPACITY = 4096;
    private java.nio.ByteBuffer buffer;

    public InvokerCodecEncoder() {
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(4096);
        this.buffer = allocateDirect;
        allocateDirect.order(java.nio.ByteOrder.LITTLE_ENDIAN);
    }

    private void ensureCapacity(int i17) {
        if (this.buffer.remaining() < i17) {
            int capacity = this.buffer.capacity();
            do {
                capacity *= 2;
            } while (capacity - this.buffer.position() < i17);
            java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(capacity);
            allocateDirect.order(java.nio.ByteOrder.LITTLE_ENDIAN);
            this.buffer.flip();
            allocateDirect.put(this.buffer);
            this.buffer = allocateDirect;
        }
    }

    public void clear() {
        this.buffer.clear();
    }

    public java.nio.ByteBuffer getByteBuffer() {
        this.buffer.flip();
        return this.buffer;
    }

    public void writeBoolean(boolean z17) {
        this.buffer.put(z17 ? (byte) 1 : (byte) 0);
    }

    public void writeBooleanList(java.util.ArrayList<java.lang.Boolean> arrayList) {
        writeInt32(arrayList.size());
        java.util.Iterator<java.lang.Boolean> it = arrayList.iterator();
        while (it.hasNext()) {
            writeBoolean(it.next().booleanValue());
        }
    }

    public void writeBytes(byte[] bArr) {
        ensureCapacity(bArr.length + 4);
        this.buffer.putInt(bArr.length);
        this.buffer.put(bArr);
    }

    public void writeBytesList(java.util.ArrayList<byte[]> arrayList) {
        writeInt32(arrayList.size());
        java.util.Iterator<byte[]> it = arrayList.iterator();
        while (it.hasNext()) {
            writeBytes(it.next());
        }
    }

    public void writeDouble(double d17) {
        this.buffer.putDouble(d17);
    }

    public void writeDoubleList(java.util.ArrayList<java.lang.Double> arrayList) {
        writeInt32(arrayList.size());
        java.util.Iterator<java.lang.Double> it = arrayList.iterator();
        while (it.hasNext()) {
            writeDouble(it.next().doubleValue());
        }
    }

    public void writeFloat(float f17) {
        this.buffer.putFloat(f17);
    }

    public void writeFloatList(java.util.ArrayList<java.lang.Float> arrayList) {
        writeInt32(arrayList.size());
        java.util.Iterator<java.lang.Float> it = arrayList.iterator();
        while (it.hasNext()) {
            writeFloat(it.next().floatValue());
        }
    }

    public void writeInt32(int i17) {
        ensureCapacity(4);
        this.buffer.putInt(i17);
    }

    public void writeInt32List(java.util.ArrayList<java.lang.Integer> arrayList) {
        writeInt32(arrayList.size());
        java.util.Iterator<java.lang.Integer> it = arrayList.iterator();
        while (it.hasNext()) {
            writeInt32(it.next().intValue());
        }
    }

    public void writeInt64(long j17) {
        ensureCapacity(8);
        this.buffer.putLong(j17);
    }

    public void writeInt64List(java.util.ArrayList<java.lang.Long> arrayList) {
        writeInt32(arrayList.size());
        java.util.Iterator<java.lang.Long> it = arrayList.iterator();
        while (it.hasNext()) {
            writeInt64(it.next().longValue());
        }
    }

    public void writeString(java.lang.String str) {
        byte[] bytes = str.getBytes(java.nio.charset.StandardCharsets.UTF_8);
        ensureCapacity(bytes.length + 4);
        this.buffer.putInt(bytes.length);
        this.buffer.put(bytes);
    }

    public void writeStringList(java.util.ArrayList<java.lang.String> arrayList) {
        writeInt32(arrayList.size());
        java.util.Iterator<java.lang.String> it = arrayList.iterator();
        while (it.hasNext()) {
            writeString(it.next());
        }
    }

    public void writeUInt32(int i17) {
        writeInt32(i17);
    }

    public void writeUInt32List(java.util.ArrayList<java.lang.Integer> arrayList) {
        writeInt32(arrayList.size());
        java.util.Iterator<java.lang.Integer> it = arrayList.iterator();
        while (it.hasNext()) {
            writeUInt32(it.next().intValue());
        }
    }

    public void writeUInt64(long j17) {
        writeInt64(j17);
    }

    public void writeUInt64List(java.util.ArrayList<java.lang.Long> arrayList) {
        writeInt32(arrayList.size());
        java.util.Iterator<java.lang.Long> it = arrayList.iterator();
        while (it.hasNext()) {
            writeUInt64(it.next().longValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> void writeValue(T t17) {
        java.lang.Class<?> cls = t17.getClass();
        if (cls == java.lang.Integer.class) {
            this.buffer.putInt(((java.lang.Integer) t17).intValue());
            return;
        }
        if (cls == java.lang.Long.class) {
            this.buffer.putLong(((java.lang.Long) t17).longValue());
            return;
        }
        if (cls == java.lang.Float.class) {
            this.buffer.putFloat(((java.lang.Float) t17).floatValue());
            return;
        }
        if (cls == java.lang.Double.class) {
            this.buffer.putDouble(((java.lang.Double) t17).doubleValue());
            return;
        }
        if (cls == java.lang.Short.class) {
            this.buffer.putShort(((java.lang.Short) t17).shortValue());
        } else {
            if (cls != java.lang.Boolean.class) {
                throw new java.lang.RuntimeException(java.lang.String.format("Unsupported class %s", cls.getSimpleName()));
            }
            this.buffer.put(((java.lang.Boolean) t17).booleanValue() ? (byte) 1 : (byte) 0);
        }
    }

    public <T> void writeValueList(java.util.ArrayList<T> arrayList) {
        writeInt32(arrayList.size());
        java.util.Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            writeValue(it.next());
        }
    }
}
