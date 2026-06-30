package com.tencent.wechat.zidl2;

/* loaded from: classes15.dex */
public class ZDirectBuffer {
    private com.tencent.wechat.zidl2.ZDirectBuffer.Destructor destructor;
    private long implHandle;
    private java.nio.ByteBuffer view;

    /* loaded from: classes15.dex */
    public static class Destructor extends com.tencent.wechat.zidl2.DestructorThread.Destructor {
        private long implHandle;

        public Destructor(java.lang.Object obj, long j17) {
            super(obj);
            this.implHandle = j17;
        }

        @Override // com.tencent.wechat.zidl2.DestructorThread.Destructor
        public void destruct() {
            com.tencent.wechat.zidl2.ZDirectBuffer.releaseRef(this.implHandle);
        }
    }

    public ZDirectBuffer(java.nio.ByteBuffer byteBuffer) {
        long newImpl = newImpl(byteBuffer);
        this.implHandle = newImpl;
        this.view = newByteBuffer(newImpl);
        this.destructor = new com.tencent.wechat.zidl2.ZDirectBuffer.Destructor(this.view, this.implHandle);
    }

    public static native void addRef(long j17);

    public static com.tencent.wechat.zidl2.ZDirectBuffer fromByteBuffer(java.nio.ByteBuffer byteBuffer) {
        return new com.tencent.wechat.zidl2.ZDirectBuffer(byteBuffer);
    }

    public static com.tencent.wechat.zidl2.ZDirectBuffer fromImpl(long j17) {
        return new com.tencent.wechat.zidl2.ZDirectBuffer(j17);
    }

    private static native java.nio.ByteBuffer newByteBuffer(long j17);

    private static native long newImpl(java.nio.ByteBuffer byteBuffer);

    public static native void releaseRef(long j17);

    public long getImpl() {
        return this.implHandle;
    }

    public java.nio.ByteBuffer getView() {
        return this.view;
    }

    public void setView(java.nio.ByteBuffer byteBuffer) {
        long newImpl = newImpl(byteBuffer);
        this.implHandle = newImpl;
        this.view = newByteBuffer(newImpl);
        this.destructor = new com.tencent.wechat.zidl2.ZDirectBuffer.Destructor(this.view, this.implHandle);
    }

    public long toImpl() {
        addRef(this.implHandle);
        return this.implHandle;
    }

    public ZDirectBuffer(long j17) {
        this.implHandle = j17;
        this.view = newByteBuffer(j17);
        this.destructor = new com.tencent.wechat.zidl2.ZDirectBuffer.Destructor(this.view, j17);
    }
}
