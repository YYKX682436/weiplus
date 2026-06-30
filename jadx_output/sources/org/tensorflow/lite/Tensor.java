package org.tensorflow.lite;

/* loaded from: classes13.dex */
public final class Tensor {

    /* renamed from: a, reason: collision with root package name */
    public long f347864a;

    /* renamed from: b, reason: collision with root package name */
    public final org.tensorflow.lite.a f347865b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f347866c;

    public Tensor(long j17) {
        this.f347864a = j17;
        int dtype = dtype(j17);
        for (org.tensorflow.lite.a aVar : org.tensorflow.lite.a.f347874n) {
            if (aVar.f347876d == dtype) {
                this.f347865b = aVar;
                this.f347866c = shape(j17);
                shapeSignature(j17);
                quantizationScale(j17);
                quantizationZeroPoint(j17);
                return;
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("DataType error: DataType ");
        sb6.append(dtype);
        sb6.append(" is not recognized in Java (version ");
        org.tensorflow.lite.TensorFlowLite.a();
        sb6.append(org.tensorflow.lite.TensorFlowLite.nativeRuntimeVersion());
        sb6.append(")");
        throw new java.lang.IllegalArgumentException(sb6.toString());
    }

    private static native java.nio.ByteBuffer buffer(long j17);

    public static int c(java.lang.Object obj) {
        if (obj == null || !obj.getClass().isArray()) {
            return 0;
        }
        if (java.lang.reflect.Array.getLength(obj) != 0) {
            return c(java.lang.reflect.Array.get(obj, 0)) + 1;
        }
        throw new java.lang.IllegalArgumentException("Array lengths cannot be 0.");
    }

    private static native long create(long j17, int i17);

    private static native void delete(long j17);

    private static native int dtype(long j17);

    public static void f(java.lang.Object obj, int i17, int[] iArr) {
        if (iArr == null || i17 == iArr.length) {
            return;
        }
        int length = java.lang.reflect.Array.getLength(obj);
        int i18 = iArr[i17];
        if (i18 == 0) {
            iArr[i17] = length;
        } else if (i18 != length) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Mismatched lengths (%d and %d) in dimension %d", java.lang.Integer.valueOf(iArr[i17]), java.lang.Integer.valueOf(length), java.lang.Integer.valueOf(i17)));
        }
        for (int i19 = 0; i19 < length; i19++) {
            f(java.lang.reflect.Array.get(obj, i19), i17 + 1, iArr);
        }
    }

    public static org.tensorflow.lite.Tensor g(long j17, int i17) {
        return new org.tensorflow.lite.Tensor(create(j17, i17));
    }

    private static native boolean hasDelegateBufferHandle(long j17);

    private static native int index(long j17);

    private static native java.lang.String name(long j17);

    private static native int numBytes(long j17);

    private static native float quantizationScale(long j17);

    private static native int quantizationZeroPoint(long j17);

    private static native void readMultiDimensionalArray(long j17, java.lang.Object obj);

    private static native int[] shape(long j17);

    private static native int[] shapeSignature(long j17);

    private static native void writeDirectBuffer(long j17, java.nio.Buffer buffer);

    private static native void writeMultiDimensionalArray(long j17, java.lang.Object obj);

    private static native void writeScalar(long j17, java.lang.Object obj);

    public final java.nio.ByteBuffer a() {
        return buffer(this.f347864a).order(java.nio.ByteOrder.nativeOrder());
    }

    public void b() {
        delete(this.f347864a);
        this.f347864a = 0L;
    }

    public int[] d(java.lang.Object obj) {
        int c17 = c(obj);
        if (this.f347865b == org.tensorflow.lite.a.STRING) {
            java.lang.Class<?> cls = obj.getClass();
            if (cls.isArray()) {
                while (cls.isArray()) {
                    cls = cls.getComponentType();
                }
                if (java.lang.Byte.TYPE.equals(cls)) {
                    c17--;
                }
            }
        }
        int[] iArr = new int[c17];
        f(obj, 0, iArr);
        return iArr;
    }

    public java.lang.Object e(java.lang.Object obj) {
        if (obj == null) {
            if (hasDelegateBufferHandle(this.f347864a)) {
                return obj;
            }
            throw new java.lang.IllegalArgumentException("Null outputs are allowed only if the Tensor is bound to a buffer handle.");
        }
        l(obj);
        boolean z17 = obj instanceof java.nio.Buffer;
        if (z17) {
            java.nio.Buffer buffer = (java.nio.Buffer) obj;
            int numBytes = numBytes(this.f347864a);
            int capacity = obj instanceof java.nio.ByteBuffer ? buffer.capacity() : buffer.capacity() * this.f347865b.h();
            if (numBytes > capacity) {
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Cannot copy from a TensorFlowLite tensor (%s) with %d bytes to a Java Buffer with %d bytes.", h(), java.lang.Integer.valueOf(numBytes), java.lang.Integer.valueOf(capacity)));
            }
        } else {
            int[] d17 = d(obj);
            if (!java.util.Arrays.equals(d17, this.f347866c)) {
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Cannot copy from a TensorFlowLite tensor (%s) with shape %s to a Java object with shape %s.", h(), java.util.Arrays.toString(this.f347866c), java.util.Arrays.toString(d17)));
            }
        }
        if (z17) {
            java.nio.Buffer buffer2 = (java.nio.Buffer) obj;
            if (buffer2 instanceof java.nio.ByteBuffer) {
                ((java.nio.ByteBuffer) buffer2).put(a());
            } else if (buffer2 instanceof java.nio.FloatBuffer) {
                ((java.nio.FloatBuffer) buffer2).put(a().asFloatBuffer());
            } else if (buffer2 instanceof java.nio.LongBuffer) {
                ((java.nio.LongBuffer) buffer2).put(a().asLongBuffer());
            } else {
                if (!(buffer2 instanceof java.nio.IntBuffer)) {
                    throw new java.lang.IllegalArgumentException("Unexpected output buffer type: " + buffer2);
                }
                ((java.nio.IntBuffer) buffer2).put(a().asIntBuffer());
            }
        } else {
            readMultiDimensionalArray(this.f347864a, obj);
        }
        return obj;
    }

    public java.lang.String h() {
        return name(this.f347864a);
    }

    public int i() {
        int i17 = 1;
        for (int i18 : this.f347866c) {
            i17 *= i18;
        }
        return i17;
    }

    public void j() {
        this.f347866c = shape(this.f347864a);
    }

    public void k(java.lang.Object obj) {
        if (obj == null) {
            if (!hasDelegateBufferHandle(this.f347864a)) {
                throw new java.lang.IllegalArgumentException("Null inputs are allowed only if the Tensor is bound to a buffer handle.");
            }
            return;
        }
        l(obj);
        boolean z17 = obj instanceof java.nio.Buffer;
        if (z17) {
            java.nio.Buffer buffer = (java.nio.Buffer) obj;
            int numBytes = numBytes(this.f347864a);
            int capacity = obj instanceof java.nio.ByteBuffer ? buffer.capacity() : buffer.capacity() * this.f347865b.h();
            if (numBytes != capacity) {
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Cannot copy to a TensorFlowLite tensor (%s) with %d bytes from a Java Buffer with %d bytes.", h(), java.lang.Integer.valueOf(numBytes), java.lang.Integer.valueOf(capacity)));
            }
        } else {
            int[] d17 = d(obj);
            if (!java.util.Arrays.equals(d17, this.f347866c)) {
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Cannot copy to a TensorFlowLite tensor (%s) with shape %s from a Java object with shape %s.", h(), java.util.Arrays.toString(this.f347866c), java.util.Arrays.toString(d17)));
            }
        }
        if (!z17) {
            if (obj.getClass().isArray()) {
                writeMultiDimensionalArray(this.f347864a, obj);
                return;
            } else {
                writeScalar(this.f347864a, obj);
                return;
            }
        }
        java.nio.Buffer buffer2 = (java.nio.Buffer) obj;
        if (buffer2 instanceof java.nio.ByteBuffer) {
            java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) buffer2;
            if (byteBuffer.isDirect() && byteBuffer.order() == java.nio.ByteOrder.nativeOrder()) {
                writeDirectBuffer(this.f347864a, buffer2);
                return;
            } else {
                a().put(byteBuffer);
                return;
            }
        }
        if (buffer2 instanceof java.nio.LongBuffer) {
            java.nio.LongBuffer longBuffer = (java.nio.LongBuffer) buffer2;
            if (longBuffer.isDirect() && longBuffer.order() == java.nio.ByteOrder.nativeOrder()) {
                writeDirectBuffer(this.f347864a, buffer2);
                return;
            } else {
                a().asLongBuffer().put(longBuffer);
                return;
            }
        }
        if (buffer2 instanceof java.nio.FloatBuffer) {
            java.nio.FloatBuffer floatBuffer = (java.nio.FloatBuffer) buffer2;
            if (floatBuffer.isDirect() && floatBuffer.order() == java.nio.ByteOrder.nativeOrder()) {
                writeDirectBuffer(this.f347864a, buffer2);
                return;
            } else {
                a().asFloatBuffer().put(floatBuffer);
                return;
            }
        }
        if (!(buffer2 instanceof java.nio.IntBuffer)) {
            throw new java.lang.IllegalArgumentException("Unexpected input buffer type: " + buffer2);
        }
        java.nio.IntBuffer intBuffer = (java.nio.IntBuffer) buffer2;
        if (intBuffer.isDirect() && intBuffer.order() == java.nio.ByteOrder.nativeOrder()) {
            writeDirectBuffer(this.f347864a, buffer2);
        } else {
            a().asIntBuffer().put(intBuffer);
        }
    }

    public final void l(java.lang.Object obj) {
        org.tensorflow.lite.a aVar;
        if (obj instanceof java.nio.ByteBuffer) {
            return;
        }
        if (obj != null) {
            java.lang.Class<?> cls = obj.getClass();
            boolean isArray = cls.isArray();
            org.tensorflow.lite.a aVar2 = this.f347865b;
            if (!isArray) {
                if (java.lang.Float.class.equals(cls) || (obj instanceof java.nio.FloatBuffer)) {
                    aVar = org.tensorflow.lite.a.FLOAT32;
                } else if (java.lang.Integer.class.equals(cls) || (obj instanceof java.nio.IntBuffer)) {
                    aVar = org.tensorflow.lite.a.INT32;
                } else if (java.lang.Byte.class.equals(cls)) {
                    aVar = org.tensorflow.lite.a.UINT8;
                } else if (java.lang.Long.class.equals(cls) || (obj instanceof java.nio.LongBuffer)) {
                    aVar = org.tensorflow.lite.a.INT64;
                } else if (java.lang.Boolean.class.equals(cls)) {
                    aVar = org.tensorflow.lite.a.BOOL;
                } else if (java.lang.String.class.equals(cls)) {
                    aVar = org.tensorflow.lite.a.STRING;
                }
                if (aVar == aVar2) {
                    return;
                } else {
                    return;
                }
            }
            while (cls.isArray()) {
                cls = cls.getComponentType();
            }
            if (java.lang.Float.TYPE.equals(cls)) {
                aVar = org.tensorflow.lite.a.FLOAT32;
            } else if (java.lang.Integer.TYPE.equals(cls)) {
                aVar = org.tensorflow.lite.a.INT32;
            } else if (java.lang.Byte.TYPE.equals(cls)) {
                aVar = org.tensorflow.lite.a.STRING;
                if (aVar2 != aVar) {
                    aVar = org.tensorflow.lite.a.UINT8;
                }
            } else if (java.lang.Long.TYPE.equals(cls)) {
                aVar = org.tensorflow.lite.a.INT64;
            } else if (java.lang.Boolean.TYPE.equals(cls)) {
                aVar = org.tensorflow.lite.a.BOOL;
            } else if (java.lang.String.class.equals(cls)) {
                aVar = org.tensorflow.lite.a.STRING;
            }
            if (aVar == aVar2 && !aVar.i().equals(aVar2.i())) {
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Cannot convert between a TensorFlowLite tensor with type %s and a Java object of type %s (which is compatible with the TensorFlowLite type %s).", aVar2, obj.getClass().getName(), aVar));
            }
            return;
        }
        throw new java.lang.IllegalArgumentException("DataType error: cannot resolve DataType of ".concat(obj.getClass().getName()));
    }
}
