package io.flutter.embedding.android;

/* loaded from: classes15.dex */
public class KeyData {
    private static final int BYTES_PER_FIELD = 8;
    public static final java.lang.String CHANNEL = "flutter/keydata";
    private static final int FIELD_COUNT = 6;
    private static final java.lang.String TAG = "KeyData";
    java.lang.String character;
    io.flutter.embedding.android.KeyData.DeviceType deviceType;
    long logicalKey;
    long physicalKey;
    boolean synthesized;
    long timestamp;
    io.flutter.embedding.android.KeyData.Type type;

    /* loaded from: classes15.dex */
    public enum DeviceType {
        kKeyboard(0),
        kDirectionalPad(1),
        kGamepad(2),
        kJoystick(3),
        kHdmi(4);

        private final long value;

        DeviceType(long j17) {
            this.value = j17;
        }

        public static io.flutter.embedding.android.KeyData.DeviceType fromLong(long j17) {
            int i17 = (int) j17;
            if (i17 == 0) {
                return kKeyboard;
            }
            if (i17 == 1) {
                return kDirectionalPad;
            }
            if (i17 == 2) {
                return kGamepad;
            }
            if (i17 == 3) {
                return kJoystick;
            }
            if (i17 == 4) {
                return kHdmi;
            }
            throw new java.lang.AssertionError("Unexpected DeviceType value");
        }

        public long getValue() {
            return this.value;
        }
    }

    /* loaded from: classes15.dex */
    public enum Type {
        kDown(0),
        kUp(1),
        kRepeat(2);

        private long value;

        Type(long j17) {
            this.value = j17;
        }

        public static io.flutter.embedding.android.KeyData.Type fromLong(long j17) {
            int i17 = (int) j17;
            if (i17 == 0) {
                return kDown;
            }
            if (i17 == 1) {
                return kUp;
            }
            if (i17 == 2) {
                return kRepeat;
            }
            throw new java.lang.AssertionError("Unexpected Type value");
        }

        public long getValue() {
            return this.value;
        }
    }

    public KeyData() {
    }

    public KeyData(java.nio.ByteBuffer byteBuffer) {
        long j17 = byteBuffer.getLong();
        this.timestamp = byteBuffer.getLong();
        this.type = io.flutter.embedding.android.KeyData.Type.fromLong(byteBuffer.getLong());
        this.physicalKey = byteBuffer.getLong();
        this.logicalKey = byteBuffer.getLong();
        this.synthesized = byteBuffer.getLong() != 0;
        this.deviceType = io.flutter.embedding.android.KeyData.DeviceType.fromLong(byteBuffer.getLong());
        if (byteBuffer.remaining() == j17) {
            this.character = null;
            if (j17 != 0) {
                int i17 = (int) j17;
                byte[] bArr = new byte[i17];
                byteBuffer.get(bArr, 0, i17);
                try {
                    this.character = new java.lang.String(bArr, com.tencent.mapsdk.internal.rv.f51270c);
                    return;
                } catch (java.io.UnsupportedEncodingException unused) {
                    throw new java.lang.AssertionError("UTF-8 unsupported");
                }
            }
            return;
        }
        throw new java.lang.AssertionError(java.lang.String.format("Unexpected char length: charSize is %d while buffer has position %d, capacity %d, limit %d", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(byteBuffer.position()), java.lang.Integer.valueOf(byteBuffer.capacity()), java.lang.Integer.valueOf(byteBuffer.limit())));
    }

    public java.nio.ByteBuffer toBytes() {
        try {
            java.lang.String str = this.character;
            byte[] bytes = str == null ? null : str.getBytes(com.tencent.mapsdk.internal.rv.f51270c);
            int length = bytes == null ? 0 : bytes.length;
            java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(length + 56);
            allocateDirect.order(java.nio.ByteOrder.LITTLE_ENDIAN);
            allocateDirect.putLong(length);
            allocateDirect.putLong(this.timestamp);
            allocateDirect.putLong(this.type.getValue());
            allocateDirect.putLong(this.physicalKey);
            allocateDirect.putLong(this.logicalKey);
            allocateDirect.putLong(this.synthesized ? 1L : 0L);
            allocateDirect.putLong(this.deviceType.getValue());
            if (bytes != null) {
                allocateDirect.put(bytes);
            }
            return allocateDirect;
        } catch (java.io.UnsupportedEncodingException unused) {
            throw new java.lang.AssertionError("UTF-8 not supported");
        }
    }
}
