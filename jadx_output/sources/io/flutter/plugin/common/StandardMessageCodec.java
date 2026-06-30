package io.flutter.plugin.common;

/* loaded from: classes13.dex */
public class StandardMessageCodec implements io.flutter.plugin.common.MessageCodec<java.lang.Object> {
    private static final byte BIGINT = 5;
    private static final byte BYTE_ARRAY = 8;
    private static final byte DOUBLE = 6;
    private static final byte DOUBLE_ARRAY = 11;
    private static final byte FALSE = 2;
    private static final byte FLOAT_ARRAY = 14;
    public static final io.flutter.plugin.common.StandardMessageCodec INSTANCE = new io.flutter.plugin.common.StandardMessageCodec();
    private static final byte INT = 3;
    private static final byte INT_ARRAY = 9;
    private static final byte LIST = 12;
    private static final boolean LITTLE_ENDIAN;
    private static final byte LONG = 4;
    private static final byte LONG_ARRAY = 10;
    private static final byte MAP = 13;
    private static final byte NULL = 0;
    private static final byte STRING = 7;
    private static final java.lang.String TAG = "StandardMessageCodec#";
    private static final byte TRUE = 1;
    private static final java.nio.charset.Charset UTF8;

    /* loaded from: classes13.dex */
    public static final class ExposedByteArrayOutputStream extends java.io.ByteArrayOutputStream {
        public byte[] buffer() {
            return ((java.io.ByteArrayOutputStream) this).buf;
        }
    }

    static {
        LITTLE_ENDIAN = java.nio.ByteOrder.nativeOrder() == java.nio.ByteOrder.LITTLE_ENDIAN;
        UTF8 = java.nio.charset.Charset.forName("UTF8");
    }

    public static final void readAlignment(java.nio.ByteBuffer byteBuffer, int i17) {
        int position = byteBuffer.position() % i17;
        if (position != 0) {
            byteBuffer.position((byteBuffer.position() + i17) - position);
        }
    }

    public static final byte[] readBytes(java.nio.ByteBuffer byteBuffer) {
        byte[] bArr = new byte[readSize(byteBuffer)];
        byteBuffer.get(bArr);
        return bArr;
    }

    public static final int readSize(java.nio.ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            throw new java.lang.IllegalArgumentException("Message corrupted");
        }
        int i17 = byteBuffer.get() & 255;
        return i17 < 254 ? i17 : i17 == 254 ? byteBuffer.getChar() : byteBuffer.getInt();
    }

    public static final void writeAlignment(java.io.ByteArrayOutputStream byteArrayOutputStream, int i17) {
        int size = byteArrayOutputStream.size() % i17;
        if (size != 0) {
            for (int i18 = 0; i18 < i17 - size; i18++) {
                byteArrayOutputStream.write(0);
            }
        }
    }

    public static final void writeBytes(java.io.ByteArrayOutputStream byteArrayOutputStream, byte[] bArr) {
        writeSize(byteArrayOutputStream, bArr.length);
        byteArrayOutputStream.write(bArr, 0, bArr.length);
    }

    public static final void writeChar(java.io.ByteArrayOutputStream byteArrayOutputStream, int i17) {
        if (LITTLE_ENDIAN) {
            byteArrayOutputStream.write(i17);
            byteArrayOutputStream.write(i17 >>> 8);
        } else {
            byteArrayOutputStream.write(i17 >>> 8);
            byteArrayOutputStream.write(i17);
        }
    }

    public static final void writeDouble(java.io.ByteArrayOutputStream byteArrayOutputStream, double d17) {
        writeLong(byteArrayOutputStream, java.lang.Double.doubleToLongBits(d17));
    }

    public static final void writeFloat(java.io.ByteArrayOutputStream byteArrayOutputStream, float f17) {
        writeInt(byteArrayOutputStream, java.lang.Float.floatToIntBits(f17));
    }

    public static final void writeInt(java.io.ByteArrayOutputStream byteArrayOutputStream, int i17) {
        if (LITTLE_ENDIAN) {
            byteArrayOutputStream.write(i17);
            byteArrayOutputStream.write(i17 >>> 8);
            byteArrayOutputStream.write(i17 >>> 16);
            byteArrayOutputStream.write(i17 >>> 24);
            return;
        }
        byteArrayOutputStream.write(i17 >>> 24);
        byteArrayOutputStream.write(i17 >>> 16);
        byteArrayOutputStream.write(i17 >>> 8);
        byteArrayOutputStream.write(i17);
    }

    public static final void writeLong(java.io.ByteArrayOutputStream byteArrayOutputStream, long j17) {
        if (LITTLE_ENDIAN) {
            byteArrayOutputStream.write((byte) j17);
            byteArrayOutputStream.write((byte) (j17 >>> 8));
            byteArrayOutputStream.write((byte) (j17 >>> 16));
            byteArrayOutputStream.write((byte) (j17 >>> 24));
            byteArrayOutputStream.write((byte) (j17 >>> 32));
            byteArrayOutputStream.write((byte) (j17 >>> 40));
            byteArrayOutputStream.write((byte) (j17 >>> 48));
            byteArrayOutputStream.write((byte) (j17 >>> 56));
            return;
        }
        byteArrayOutputStream.write((byte) (j17 >>> 56));
        byteArrayOutputStream.write((byte) (j17 >>> 48));
        byteArrayOutputStream.write((byte) (j17 >>> 40));
        byteArrayOutputStream.write((byte) (j17 >>> 32));
        byteArrayOutputStream.write((byte) (j17 >>> 24));
        byteArrayOutputStream.write((byte) (j17 >>> 16));
        byteArrayOutputStream.write((byte) (j17 >>> 8));
        byteArrayOutputStream.write((byte) j17);
    }

    public static final void writeSize(java.io.ByteArrayOutputStream byteArrayOutputStream, int i17) {
        if (i17 < 254) {
            byteArrayOutputStream.write(i17);
        } else if (i17 <= 65535) {
            byteArrayOutputStream.write(254);
            writeChar(byteArrayOutputStream, i17);
        } else {
            byteArrayOutputStream.write(255);
            writeInt(byteArrayOutputStream, i17);
        }
    }

    @Override // io.flutter.plugin.common.MessageCodec
    public java.lang.Object decodeMessage(java.nio.ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        byteBuffer.order(java.nio.ByteOrder.nativeOrder());
        java.lang.Object readValue = readValue(byteBuffer);
        if (byteBuffer.hasRemaining()) {
            throw new java.lang.IllegalArgumentException("Message corrupted");
        }
        return readValue;
    }

    @Override // io.flutter.plugin.common.MessageCodec
    public java.nio.ByteBuffer encodeMessage(java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        io.flutter.plugin.common.StandardMessageCodec.ExposedByteArrayOutputStream exposedByteArrayOutputStream = new io.flutter.plugin.common.StandardMessageCodec.ExposedByteArrayOutputStream();
        writeValue(exposedByteArrayOutputStream, obj);
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(exposedByteArrayOutputStream.size());
        allocateDirect.put(exposedByteArrayOutputStream.buffer(), 0, exposedByteArrayOutputStream.size());
        return allocateDirect;
    }

    public final java.lang.Object readValue(java.nio.ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            return readValueOfType(byteBuffer.get(), byteBuffer);
        }
        throw new java.lang.IllegalArgumentException("Message corrupted");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v9 */
    public java.lang.Object readValueOfType(byte b17, java.nio.ByteBuffer byteBuffer) {
        java.lang.Object arrayList;
        int i17 = 0;
        switch (b17) {
            case 0:
                return null;
            case 1:
                return java.lang.Boolean.TRUE;
            case 2:
                return java.lang.Boolean.FALSE;
            case 3:
                return java.lang.Integer.valueOf(byteBuffer.getInt());
            case 4:
                return java.lang.Long.valueOf(byteBuffer.getLong());
            case 5:
                return new java.math.BigInteger(new java.lang.String(readBytes(byteBuffer), UTF8), 16);
            case 6:
                readAlignment(byteBuffer, 8);
                return java.lang.Double.valueOf(byteBuffer.getDouble());
            case 7:
                return new java.lang.String(readBytes(byteBuffer), UTF8);
            case 8:
                return readBytes(byteBuffer);
            case 9:
                int readSize = readSize(byteBuffer);
                int[] iArr = new int[readSize];
                readAlignment(byteBuffer, 4);
                byteBuffer.asIntBuffer().get(iArr);
                byteBuffer.position(byteBuffer.position() + (readSize * 4));
                return iArr;
            case 10:
                int readSize2 = readSize(byteBuffer);
                long[] jArr = new long[readSize2];
                readAlignment(byteBuffer, 8);
                byteBuffer.asLongBuffer().get(jArr);
                byteBuffer.position(byteBuffer.position() + (readSize2 * 8));
                return jArr;
            case 11:
                int readSize3 = readSize(byteBuffer);
                double[] dArr = new double[readSize3];
                readAlignment(byteBuffer, 8);
                byteBuffer.asDoubleBuffer().get(dArr);
                byteBuffer.position(byteBuffer.position() + (readSize3 * 8));
                return dArr;
            case 12:
                int readSize4 = readSize(byteBuffer);
                arrayList = new java.util.ArrayList(readSize4);
                while (i17 < readSize4) {
                    arrayList.add(readValue(byteBuffer));
                    i17++;
                }
                break;
            case 13:
                int readSize5 = readSize(byteBuffer);
                arrayList = new java.util.HashMap();
                while (i17 < readSize5) {
                    arrayList.put(readValue(byteBuffer), readValue(byteBuffer));
                    i17++;
                }
                break;
            case 14:
                int readSize6 = readSize(byteBuffer);
                float[] fArr = new float[readSize6];
                readAlignment(byteBuffer, 4);
                byteBuffer.asFloatBuffer().get(fArr);
                byteBuffer.position(byteBuffer.position() + (readSize6 * 4));
                return fArr;
            default:
                throw new java.lang.IllegalArgumentException("Message corrupted");
        }
        return arrayList;
    }

    public void writeValue(java.io.ByteArrayOutputStream byteArrayOutputStream, java.lang.Object obj) {
        int i17 = 0;
        if (obj == null || obj.equals(null)) {
            byteArrayOutputStream.write(0);
            return;
        }
        if (obj instanceof java.lang.Boolean) {
            byteArrayOutputStream.write(((java.lang.Boolean) obj).booleanValue() ? 1 : 2);
            return;
        }
        if (obj instanceof java.lang.Number) {
            if ((obj instanceof java.lang.Integer) || (obj instanceof java.lang.Short) || (obj instanceof java.lang.Byte)) {
                byteArrayOutputStream.write(3);
                writeInt(byteArrayOutputStream, ((java.lang.Number) obj).intValue());
                return;
            }
            if (obj instanceof java.lang.Long) {
                byteArrayOutputStream.write(4);
                writeLong(byteArrayOutputStream, ((java.lang.Long) obj).longValue());
                return;
            }
            if ((obj instanceof java.lang.Float) || (obj instanceof java.lang.Double)) {
                byteArrayOutputStream.write(6);
                writeAlignment(byteArrayOutputStream, 8);
                writeDouble(byteArrayOutputStream, ((java.lang.Number) obj).doubleValue());
                return;
            } else {
                if (!(obj instanceof java.math.BigInteger)) {
                    throw new java.lang.IllegalArgumentException("Unsupported Number type: " + obj.getClass());
                }
                byteArrayOutputStream.write(5);
                writeBytes(byteArrayOutputStream, ((java.math.BigInteger) obj).toString(16).getBytes(UTF8));
                return;
            }
        }
        if (obj instanceof java.lang.CharSequence) {
            byteArrayOutputStream.write(7);
            writeBytes(byteArrayOutputStream, obj.toString().getBytes(UTF8));
            return;
        }
        if (obj instanceof byte[]) {
            byteArrayOutputStream.write(8);
            writeBytes(byteArrayOutputStream, (byte[]) obj);
            return;
        }
        if (obj instanceof int[]) {
            byteArrayOutputStream.write(9);
            int[] iArr = (int[]) obj;
            writeSize(byteArrayOutputStream, iArr.length);
            writeAlignment(byteArrayOutputStream, 4);
            int length = iArr.length;
            while (i17 < length) {
                writeInt(byteArrayOutputStream, iArr[i17]);
                i17++;
            }
            return;
        }
        if (obj instanceof long[]) {
            byteArrayOutputStream.write(10);
            long[] jArr = (long[]) obj;
            writeSize(byteArrayOutputStream, jArr.length);
            writeAlignment(byteArrayOutputStream, 8);
            int length2 = jArr.length;
            while (i17 < length2) {
                writeLong(byteArrayOutputStream, jArr[i17]);
                i17++;
            }
            return;
        }
        if (obj instanceof double[]) {
            byteArrayOutputStream.write(11);
            double[] dArr = (double[]) obj;
            writeSize(byteArrayOutputStream, dArr.length);
            writeAlignment(byteArrayOutputStream, 8);
            int length3 = dArr.length;
            while (i17 < length3) {
                writeDouble(byteArrayOutputStream, dArr[i17]);
                i17++;
            }
            return;
        }
        if (obj instanceof java.util.List) {
            byteArrayOutputStream.write(12);
            java.util.List list = (java.util.List) obj;
            writeSize(byteArrayOutputStream, list.size());
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                writeValue(byteArrayOutputStream, it.next());
            }
            return;
        }
        if (obj instanceof java.util.Map) {
            byteArrayOutputStream.write(13);
            java.util.Map map = (java.util.Map) obj;
            writeSize(byteArrayOutputStream, map.size());
            for (java.util.Map.Entry entry : map.entrySet()) {
                writeValue(byteArrayOutputStream, entry.getKey());
                writeValue(byteArrayOutputStream, entry.getValue());
            }
            return;
        }
        if (!(obj instanceof float[])) {
            throw new java.lang.IllegalArgumentException("Unsupported value: '" + obj + "' of type '" + obj.getClass() + "'");
        }
        byteArrayOutputStream.write(14);
        float[] fArr = (float[]) obj;
        writeSize(byteArrayOutputStream, fArr.length);
        writeAlignment(byteArrayOutputStream, 4);
        int length4 = fArr.length;
        while (i17 < length4) {
            writeFloat(byteArrayOutputStream, fArr[i17]);
            i17++;
        }
    }
}
