package e02;

/* loaded from: classes13.dex */
public abstract class p {
    public static void a(java.nio.ByteBuffer byteBuffer) {
        if (byteBuffer.order() != java.nio.ByteOrder.LITTLE_ENDIAN) {
            throw new java.lang.IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }

    public static android.util.Pair b(java.io.RandomAccessFile randomAccessFile, int i17) {
        int i18;
        if (i17 < 0 || i17 > 65535) {
            throw new java.lang.IllegalArgumentException("maxCommentSize: " + i17);
        }
        long length = randomAccessFile.length();
        if (length < 22) {
            return null;
        }
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(((int) java.lang.Math.min(i17, length - 22)) + 22);
        allocate.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        long capacity = length - allocate.capacity();
        randomAccessFile.seek(capacity);
        randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
        a(allocate);
        int capacity2 = allocate.capacity();
        if (capacity2 >= 22) {
            int i19 = capacity2 - 22;
            int min = java.lang.Math.min(i19, 65535);
            for (int i27 = 0; i27 < min; i27++) {
                i18 = i19 - i27;
                if (allocate.getInt(i18) == 101010256 && (allocate.getShort(i18 + 20) & 65535) == i27) {
                    break;
                }
            }
        }
        i18 = -1;
        if (i18 == -1) {
            return null;
        }
        allocate.position(i18);
        java.nio.ByteBuffer slice = allocate.slice();
        slice.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        return android.util.Pair.create(slice, java.lang.Long.valueOf(capacity + i18));
    }

    public static final boolean c(java.io.RandomAccessFile randomAccessFile, long j17) {
        long j18 = j17 - 20;
        if (j18 < 0) {
            return false;
        }
        randomAccessFile.seek(j18);
        return randomAccessFile.readInt() == 1347094023;
    }

    public static void d(java.nio.ByteBuffer byteBuffer, long j17) {
        a(byteBuffer);
        int position = byteBuffer.position() + 16;
        if (j17 >= 0 && j17 <= io.flutter.embedding.android.KeyboardMap.kValueMask) {
            byteBuffer.putInt(byteBuffer.position() + position, (int) j17);
        } else {
            throw new java.lang.IllegalArgumentException("uint32 value of out range: " + j17);
        }
    }
}
