package com.tencent.wechat.zidl2;

/* loaded from: classes15.dex */
public class InvokerCodecDecoder {
    private java.nio.ByteBuffer buffer;

    public InvokerCodecDecoder(java.nio.ByteBuffer byteBuffer) {
        this.buffer = byteBuffer;
        byteBuffer.order(java.nio.ByteOrder.LITTLE_ENDIAN);
    }

    public boolean readBoolean() {
        return this.buffer.get() == 1;
    }

    public java.util.ArrayList<java.lang.Boolean> readBooleanList() {
        int readInt32 = readInt32();
        java.util.ArrayList<java.lang.Boolean> arrayList = new java.util.ArrayList<>();
        for (int i17 = 0; i17 < readInt32; i17++) {
            arrayList.add(java.lang.Boolean.valueOf(readBoolean()));
        }
        return arrayList;
    }

    public byte[] readBytes() {
        byte[] bArr = new byte[readInt32()];
        this.buffer.get(bArr);
        return bArr;
    }

    public java.util.ArrayList<byte[]> readBytesList() {
        int readInt32 = readInt32();
        java.util.ArrayList<byte[]> arrayList = new java.util.ArrayList<>();
        for (int i17 = 0; i17 < readInt32; i17++) {
            arrayList.add(readBytes());
        }
        return arrayList;
    }

    public double readDouble() {
        return this.buffer.getDouble();
    }

    public java.util.ArrayList<java.lang.Double> readDoubleList() {
        int readInt32 = readInt32();
        java.util.ArrayList<java.lang.Double> arrayList = new java.util.ArrayList<>();
        for (int i17 = 0; i17 < readInt32; i17++) {
            arrayList.add(java.lang.Double.valueOf(readDouble()));
        }
        return arrayList;
    }

    public float readFloat() {
        return this.buffer.getFloat();
    }

    public java.util.ArrayList<java.lang.Float> readFloatList() {
        int readInt32 = readInt32();
        java.util.ArrayList<java.lang.Float> arrayList = new java.util.ArrayList<>();
        for (int i17 = 0; i17 < readInt32; i17++) {
            arrayList.add(java.lang.Float.valueOf(readFloat()));
        }
        return arrayList;
    }

    public int readInt32() {
        return this.buffer.getInt();
    }

    public java.util.ArrayList<java.lang.Integer> readInt32List() {
        int readInt32 = readInt32();
        java.util.ArrayList<java.lang.Integer> arrayList = new java.util.ArrayList<>();
        for (int i17 = 0; i17 < readInt32; i17++) {
            arrayList.add(java.lang.Integer.valueOf(readInt32()));
        }
        return arrayList;
    }

    public long readInt64() {
        return this.buffer.getLong();
    }

    public java.util.ArrayList<java.lang.Long> readInt64List() {
        int readInt32 = readInt32();
        java.util.ArrayList<java.lang.Long> arrayList = new java.util.ArrayList<>();
        for (int i17 = 0; i17 < readInt32; i17++) {
            arrayList.add(java.lang.Long.valueOf(readInt64()));
        }
        return arrayList;
    }

    public java.lang.String readString() {
        byte[] bArr = new byte[readInt32()];
        this.buffer.get(bArr);
        return new java.lang.String(bArr);
    }

    public java.util.ArrayList<java.lang.String> readStringList() {
        int readInt32 = readInt32();
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
        for (int i17 = 0; i17 < readInt32; i17++) {
            arrayList.add(readString());
        }
        return arrayList;
    }

    public int readUInt32() {
        return readInt32();
    }

    public java.util.ArrayList<java.lang.Integer> readUInt32List() {
        int readInt32 = readInt32();
        java.util.ArrayList<java.lang.Integer> arrayList = new java.util.ArrayList<>();
        for (int i17 = 0; i17 < readInt32; i17++) {
            arrayList.add(java.lang.Integer.valueOf(readUInt32()));
        }
        return arrayList;
    }

    public long readUInt64() {
        return readInt64();
    }

    public java.util.ArrayList<java.lang.Long> readUInt64List() {
        int readInt32 = readInt32();
        java.util.ArrayList<java.lang.Long> arrayList = new java.util.ArrayList<>();
        for (int i17 = 0; i17 < readInt32; i17++) {
            arrayList.add(java.lang.Long.valueOf(readUInt64()));
        }
        return arrayList;
    }

    public <T> T readValue(java.lang.Class<?> cls) {
        if (cls == java.lang.Integer.class || cls == java.lang.Integer.TYPE) {
            return (T) java.lang.Integer.valueOf(this.buffer.getInt());
        }
        if (cls == java.lang.Long.class || cls == java.lang.Long.TYPE) {
            return (T) java.lang.Long.valueOf(this.buffer.getLong());
        }
        if (cls == java.lang.Float.class || cls == java.lang.Float.TYPE) {
            return (T) java.lang.Float.valueOf(this.buffer.getFloat());
        }
        if (cls == java.lang.Double.class || cls == java.lang.Double.TYPE) {
            return (T) java.lang.Double.valueOf(this.buffer.getDouble());
        }
        if (cls == java.lang.Short.class || cls == java.lang.Short.TYPE) {
            return (T) java.lang.Short.valueOf(this.buffer.getShort());
        }
        if (cls == java.lang.Boolean.class || cls == java.lang.Boolean.TYPE) {
            return (T) java.lang.Byte.valueOf(this.buffer.get());
        }
        throw new java.lang.RuntimeException(java.lang.String.format("Unsupported class %s", cls.getSimpleName()));
    }

    public <T> java.util.ArrayList<T> readValueList(java.lang.Class<?> cls) {
        int readInt32 = readInt32();
        com.tencent.mm.plugin.finder.live.util.b0 b0Var = (java.util.ArrayList<T>) new java.util.ArrayList();
        for (int i17 = 0; i17 < readInt32; i17++) {
            b0Var.add(readValue(cls));
        }
        return b0Var;
    }
}
