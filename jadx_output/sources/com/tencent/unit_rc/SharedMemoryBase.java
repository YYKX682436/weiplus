package com.tencent.unit_rc;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B!\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0016\u001a\u00020\u0011¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00028\u0000H&¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u00028\u00002\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u00002\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0016\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/tencent/unit_rc/SharedMemoryBase;", androidx.exifinterface.media.ExifInterface.GPS_DIRECTION_TRUE, "", "Ljava/nio/ByteBuffer;", com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, "valueFromData", "(Ljava/nio/ByteBuffer;)Ljava/lang/Object;", "value", "Ljz5/f0;", "valueToData", "(Ljava/nio/ByteBuffer;Ljava/lang/Object;)V", "Lcom/tencent/unit_rc/SharedMemoryIndexHolder;", "ih", "get", "(Lcom/tencent/unit_rc/SharedMemoryIndexHolder;)Ljava/lang/Object;", "set", "(Ljava/lang/Object;Lcom/tencent/unit_rc/SharedMemoryIndexHolder;)V", "", "dataSize", "I", "getDataSize", "()I", "cacheSize", "getCacheSize", "Lcom/tencent/unit_rc/ByteBuffer;", "byteBuffer", "Lcom/tencent/unit_rc/ByteBuffer;", "getByteBuffer", "()Lcom/tencent/unit_rc/ByteBuffer;", "<init>", "(Lcom/tencent/unit_rc/ByteBuffer;II)V", "unit_rc_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes13.dex */
public abstract class SharedMemoryBase<T> {
    private final com.tencent.unit_rc.ByteBuffer byteBuffer;
    private final int cacheSize;
    private final int dataSize;

    public SharedMemoryBase(com.tencent.unit_rc.ByteBuffer byteBuffer, int i17, int i18) {
        this.dataSize = i17;
        this.cacheSize = i18;
        if (byteBuffer != null) {
            this.byteBuffer = byteBuffer;
        } else {
            this.byteBuffer = new com.tencent.unit_rc.ByteBuffer((i17 * i18) + 1);
        }
    }

    public static /* synthetic */ java.lang.Object get$default(com.tencent.unit_rc.SharedMemoryBase sharedMemoryBase, com.tencent.unit_rc.SharedMemoryIndexHolder sharedMemoryIndexHolder, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: get");
        }
        if ((i17 & 1) != 0) {
            sharedMemoryIndexHolder = null;
        }
        return sharedMemoryBase.get(sharedMemoryIndexHolder);
    }

    public static /* synthetic */ void set$default(com.tencent.unit_rc.SharedMemoryBase sharedMemoryBase, java.lang.Object obj, com.tencent.unit_rc.SharedMemoryIndexHolder sharedMemoryIndexHolder, int i17, java.lang.Object obj2) {
        if (obj2 != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: set");
        }
        if ((i17 & 2) != 0) {
            sharedMemoryIndexHolder = null;
        }
        sharedMemoryBase.set(obj, sharedMemoryIndexHolder);
    }

    public T get(com.tencent.unit_rc.SharedMemoryIndexHolder ih6) {
        java.nio.ByteBuffer data = this.byteBuffer.getData();
        data.rewind();
        byte b17 = data.get();
        if (b17 < 0 || b17 >= this.cacheSize) {
            throw new java.lang.RuntimeException("index out of range, index: " + ((int) b17) + ", cacheSize: " + this.cacheSize);
        }
        data.position((this.dataSize * b17) + 1);
        T valueFromData = valueFromData(data);
        if (ih6 != null) {
            ih6.setIndex(b17);
        }
        return valueFromData;
    }

    public final com.tencent.unit_rc.ByteBuffer getByteBuffer() {
        return this.byteBuffer;
    }

    public final int getCacheSize() {
        return this.cacheSize;
    }

    public final int getDataSize() {
        return this.dataSize;
    }

    public void set(T value, com.tencent.unit_rc.SharedMemoryIndexHolder ih6) {
        int i17;
        java.nio.ByteBuffer data = this.byteBuffer.getData();
        data.rewind();
        byte b17 = data.get();
        if (b17 < 0 || b17 >= (i17 = this.cacheSize)) {
            throw new java.lang.RuntimeException("index out of range, index: " + ((int) b17) + ", cacheSize: " + this.cacheSize);
        }
        int i18 = (b17 + 1) % i17;
        data.position((this.dataSize * i18) + 1);
        valueToData(data, value);
        data.put(0, (byte) i18);
        if (ih6 == null) {
            return;
        }
        ih6.setIndex(i18);
    }

    public abstract T valueFromData(java.nio.ByteBuffer data);

    public abstract void valueToData(java.nio.ByteBuffer data, T value);
}
