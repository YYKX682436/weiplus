package com.tencent.mm.tcp.libmmtcp;

/* loaded from: classes7.dex */
public class TcpNative {
    public static int INIT_ERROR = -1002;
    public static int NEW_TCP_ERROR = -1000;
    public static int REPEAT_INIT_ERROR = -1001;
    public static int SEND_BUFFER_ERROR = -1003;
    public static java.lang.String TAG = "TcpNative";
    private boolean initCallBackFlag = false;
    volatile long mNativeInst;

    /* loaded from: classes7.dex */
    public interface NativeCallBackInterface {
        void onCallBack(long j17, java.lang.String str);
    }

    public TcpNative(long j17, long j18, long j19) {
        this.mNativeInst = 0L;
        this.mNativeInst = initBindingTcp(j17, j18, j19);
    }

    private native void destoryBindingTcp(long j17);

    private native long initBindingTcp(long j17, long j18, long j19);

    private native int initCallBack(long j17, com.tencent.mm.tcp.libmmtcp.TcpNative.NativeCallBackInterface nativeCallBackInterface);

    private native void serviceReceive(java.lang.String str, int i17, java.lang.String str2);

    private native void testBindingTcp(long j17);

    private native void testBindingTcp2(long j17);

    private native void testBindingTcpServer(long j17);

    private native void updateNativeInterface(long j17, long j18);

    public void destoryTcp() {
        if (this.mNativeInst != -1 && this.initCallBackFlag) {
            this.initCallBackFlag = false;
            destoryBindingTcp(this.mNativeInst);
            this.mNativeInst = -1L;
        }
    }

    public int setCallBack(final com.tencent.mm.tcp.libmmtcp.TcpNative.NativeCallBackInterface nativeCallBackInterface) {
        if (this.mNativeInst == -1) {
            return NEW_TCP_ERROR;
        }
        if (this.initCallBackFlag) {
            return REPEAT_INIT_ERROR;
        }
        int initCallBack = initCallBack(this.mNativeInst, new com.tencent.mm.tcp.libmmtcp.TcpNative.NativeCallBackInterface(this) { // from class: com.tencent.mm.tcp.libmmtcp.TcpNative.1
            @Override // com.tencent.mm.tcp.libmmtcp.TcpNative.NativeCallBackInterface
            public void onCallBack(long j17, java.lang.String str) {
                nativeCallBackInterface.onCallBack(j17, str);
            }
        });
        if (initCallBack != 0) {
            return INIT_ERROR;
        }
        this.initCallBackFlag = true;
        return initCallBack;
    }

    public void testBind() {
        if (this.mNativeInst == -1) {
            return;
        }
        testBindingTcp(this.mNativeInst);
    }

    public void testBind2() {
        if (this.mNativeInst == -1) {
            return;
        }
        testBindingTcp(this.mNativeInst);
    }

    public void testBindServer() {
        if (this.mNativeInst == -1) {
            return;
        }
        testBindingTcpServer(this.mNativeInst);
    }

    public void testServiceReceive(java.lang.String str, int i17, java.lang.String str2) {
        if (this.mNativeInst == -1) {
            return;
        }
        serviceReceive(str, i17, str2);
    }

    public void update(long j17) {
        if (this.mNativeInst == -1) {
            return;
        }
        updateNativeInterface(this.mNativeInst, j17);
    }
}
