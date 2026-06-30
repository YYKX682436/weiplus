package com.tencent.wechat.zidl2;

/* loaded from: classes15.dex */
public class ClientInvoker {
    private static final java.lang.String TAG = "ClientInvoker";
    private static java.util.concurrent.atomic.AtomicLong idIndex = new java.util.concurrent.atomic.AtomicLong(0);
    private com.tencent.wechat.zidl2.ClientInvoker.Destructor destructor;
    private java.lang.String zidlCreateName;
    public java.util.concurrent.ConcurrentHashMap<java.lang.String, com.tencent.wechat.zidl2.ClientInvoker.InvokerInterface> methodInvokeDispatcher = new java.util.concurrent.ConcurrentHashMap<>();
    public com.tencent.wechat.zidl2.TaskIdConvertor taskIdConvertor = new com.tencent.wechat.zidl2.TaskIdConvertor();
    private java.lang.String clientId = "";
    private java.lang.String serverId = "";
    public long nativeHandler = 0;

    /* loaded from: classes11.dex */
    public static class Destructor extends com.tencent.wechat.zidl2.DestructorThread.Destructor {
        private long nativePointer;

        public Destructor(java.lang.Object obj, long j17) {
            super(obj);
            this.nativePointer = j17;
            com.tencent.wechat.zlog.Zlog.a(com.tencent.wechat.zidl2.ClientInvoker.TAG, "Destructor():   nativePointer: " + j17, new java.lang.Object[0]);
        }

        public static native void jniDestroyClientInvoker(long j17);

        @Override // com.tencent.wechat.zidl2.DestructorThread.Destructor
        public void destruct() {
            com.tencent.wechat.zlog.Zlog.a(com.tencent.wechat.zidl2.ClientInvoker.TAG, "Destructor():   nativePointer: " + this.nativePointer, new java.lang.Object[0]);
            jniDestroyClientInvoker(this.nativePointer);
            this.nativePointer = 0L;
        }
    }

    /* loaded from: classes11.dex */
    public interface InvokerInterface {
        void invoke(com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder);
    }

    private native void jniCreateClientInvoker(java.lang.String str);

    private native void jniCreateClientInvoker(java.lang.String str, java.lang.String str2, java.lang.String str3);

    private native byte[] jniInvoke(byte[] bArr, int i17, long j17);

    public java.lang.String bytesToHexString(byte[] bArr) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (int i17 = 0; i17 < bArr.length; i17++) {
            sb6.append(java.lang.String.format("%02X", java.lang.Byte.valueOf(bArr[i17])));
            if (i17 < bArr.length - 1) {
                sb6.append(" ");
            }
        }
        return sb6.toString();
    }

    public void createClientInvoker(java.lang.String str) {
        this.zidlCreateName = str;
        java.lang.String str2 = this.clientId;
        if (str2 == null || str2.isEmpty()) {
            this.clientId = java.lang.String.format("%s.direct.client.java", str);
        }
        java.lang.String str3 = this.serverId;
        if (str3 == null || str3.isEmpty()) {
            this.serverId = java.lang.String.format("%s.direct.server.java", str);
        }
        jniCreateClientInvoker(str);
        this.destructor = new com.tencent.wechat.zidl2.ClientInvoker.Destructor(this, this.nativeHandler);
    }

    public java.lang.Object createInnerManager(java.lang.String str) {
        com.tencent.wechat.zlog.Zlog.a(TAG, "CreatePropManager unimplemented...name:" + str, new java.lang.Object[0]);
        return null;
    }

    public void dispatchInvoke(java.nio.ByteBuffer byteBuffer) {
        com.tencent.wechat.zlog.Zlog.a(TAG, "dispatchInvoke:" + byteBuffer.remaining(), new java.lang.Object[0]);
        com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder = new com.tencent.wechat.zidl2.InvokerCodecDecoder(byteBuffer);
        java.lang.String readString = invokerCodecDecoder.readString();
        com.tencent.wechat.zidl2.ClientInvoker.InvokerInterface invokerInterface = this.methodInvokeDispatcher.get(readString);
        if (invokerInterface != null) {
            invokerInterface.invoke(invokerCodecDecoder);
            return;
        }
        com.tencent.wechat.zlog.Zlog.d(hw5.a.WARN, TAG, "dispatchInvoke method name not found name:" + readString, new java.lang.Object[0]);
    }

    public void finalize() {
        com.tencent.wechat.zlog.Zlog.a(TAG, " finalize(): " + this + " name: " + this.zidlCreateName, new java.lang.Object[0]);
        super.finalize();
    }

    public java.lang.String getClientId() {
        return this.clientId;
    }

    public java.lang.String getSeverId() {
        return this.serverId;
    }

    public java.lang.String getZidlCreateName() {
        return this.zidlCreateName;
    }

    public java.nio.ByteBuffer invoke(java.nio.ByteBuffer byteBuffer) {
        com.tencent.wechat.zlog.Zlog.a(TAG, java.lang.String.format("invoke info saved limit:%d, arrayoffset:%d, position:%d cap:%d remain:%d", java.lang.Integer.valueOf(byteBuffer.limit()), java.lang.Integer.valueOf(byteBuffer.arrayOffset()), java.lang.Integer.valueOf(byteBuffer.position()), java.lang.Integer.valueOf(byteBuffer.capacity()), java.lang.Integer.valueOf(byteBuffer.remaining())), new java.lang.Object[0]);
        return java.nio.ByteBuffer.wrap(jniInvoke(byteBuffer.array(), byteBuffer.arrayOffset(), this.nativeHandler));
    }

    public void setClientId(java.lang.String str) {
        this.clientId = str;
    }

    public void setServerId(java.lang.String str) {
        this.serverId = str;
    }

    public void createClientInvoker(java.lang.String str, java.lang.String str2) {
        this.zidlCreateName = str;
        long andIncrement = idIndex.getAndIncrement();
        java.lang.String str3 = this.clientId;
        if (str3 == null || str3.isEmpty()) {
            this.clientId = java.lang.String.format("%s.direct.client.java.%d", str, java.lang.Long.valueOf(andIncrement));
        }
        if (str2 == null || str2.isEmpty()) {
            str2 = java.lang.String.format("%s.direct.server.java.%d", str, java.lang.Long.valueOf(andIncrement));
        }
        this.serverId = str2;
        jniCreateClientInvoker(str, this.clientId, str2);
        this.destructor = new com.tencent.wechat.zidl2.ClientInvoker.Destructor(this, this.nativeHandler);
    }
}
