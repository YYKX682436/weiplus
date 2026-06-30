package com.tencent.wechat.zidl2;

/* loaded from: classes15.dex */
public class ServerInvoker {
    private static final java.lang.String TAG = "ServerInvoker";
    public java.util.concurrent.ConcurrentHashMap<java.lang.String, com.tencent.wechat.zidl2.ServerInvoker.InvokerInterface> methodInvokeDispatcher = new java.util.concurrent.ConcurrentHashMap<>();
    public com.tencent.wechat.zidl2.TaskIdConvertor taskIdConvertor = new com.tencent.wechat.zidl2.TaskIdConvertor();
    java.lang.String name = "";
    java.lang.String serverId = "";

    /* loaded from: classes15.dex */
    public interface InvokerInterface {
        java.nio.ByteBuffer invoke(java.lang.String str, com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder);
    }

    private native java.nio.ByteBuffer jniInvoke(java.lang.String str, java.nio.ByteBuffer byteBuffer);

    public void attachStub(java.lang.Object obj) {
        com.tencent.wechat.zlog.Zlog.a(TAG, "AttachStub unimplemented", new java.lang.Object[0]);
    }

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

    public java.nio.ByteBuffer dispatchInvoke(java.nio.ByteBuffer byteBuffer) {
        com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder = new com.tencent.wechat.zidl2.InvokerCodecDecoder(byteBuffer);
        java.lang.String readString = invokerCodecDecoder.readString();
        java.lang.String readString2 = invokerCodecDecoder.readString();
        com.tencent.wechat.zlog.Zlog.a(TAG, "dispatchInvoke " + readString2, new java.lang.Object[0]);
        com.tencent.wechat.zidl2.ServerInvoker.InvokerInterface invokerInterface = this.methodInvokeDispatcher.get(readString2);
        if (invokerInterface != null) {
            return invokerInterface.invoke(readString, invokerCodecDecoder);
        }
        com.tencent.wechat.zlog.Zlog.d(hw5.a.WARN, TAG, "dispatchInvoke method name not found name:" + readString2, new java.lang.Object[0]);
        return null;
    }

    public java.nio.ByteBuffer invoke(java.lang.String str, java.nio.ByteBuffer byteBuffer) {
        byteBuffer.limit();
        com.tencent.wechat.zlog.Zlog.a(TAG, java.lang.String.format("saved limit:%d, arrayoffset:%d, position:%d cap:%d remain:%d", java.lang.Integer.valueOf(byteBuffer.limit()), java.lang.Integer.valueOf(byteBuffer.arrayOffset()), java.lang.Integer.valueOf(byteBuffer.position()), java.lang.Integer.valueOf(byteBuffer.capacity()), java.lang.Integer.valueOf(byteBuffer.remaining())), new java.lang.Object[0]);
        return jniInvoke(str, byteBuffer);
    }
}
