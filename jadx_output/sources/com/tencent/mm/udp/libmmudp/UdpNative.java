package com.tencent.mm.udp.libmmudp;

/* loaded from: classes7.dex */
public class UdpNative {
    public static int INIT_ERROR = -1002;
    public static int NEW_UDP_ERROR = -1000;
    public static int REPEAT_INIT_ERROR = -1001;
    public static int SEND_BUFFER_ERROR = -1003;
    public static java.lang.String TAG = "UdpNative";
    private boolean initCallBackFlag = false;
    volatile long mNativeInst;

    /* loaded from: classes7.dex */
    public interface NativeCallBackInterface {
        void onCallBack(long j17, java.lang.String str);
    }

    public UdpNative(long j17, long j18, long j19) {
        this.mNativeInst = 0L;
        this.mNativeInst = initBindingUdp(j17, j18, j19);
    }

    private native void destoryBindingUdp(long j17);

    private native long initBindingUdp(long j17, long j18, long j19);

    private native int initCallBack(long j17, com.tencent.mm.udp.libmmudp.UdpNative.NativeCallBackInterface nativeCallBackInterface);

    private native void serviceReceive(java.lang.String str, int i17, java.lang.String str2);

    private native void testBindingUdp(long j17);

    private native void testBindingUdp2(long j17);

    private native void testBindingUdp3(long j17);

    private native void updateNativeInterface(long j17, long j18);

    public void destoryUdp() {
        if (this.mNativeInst != -1 && this.initCallBackFlag) {
            this.initCallBackFlag = false;
            destoryBindingUdp(this.mNativeInst);
            this.mNativeInst = -1L;
        }
    }

    public int setCallBack(final com.tencent.mm.udp.libmmudp.UdpNative.NativeCallBackInterface nativeCallBackInterface) {
        if (this.mNativeInst == -1) {
            return NEW_UDP_ERROR;
        }
        if (this.initCallBackFlag) {
            return REPEAT_INIT_ERROR;
        }
        int initCallBack = initCallBack(this.mNativeInst, new com.tencent.mm.udp.libmmudp.UdpNative.NativeCallBackInterface(this) { // from class: com.tencent.mm.udp.libmmudp.UdpNative.1
            @Override // com.tencent.mm.udp.libmmudp.UdpNative.NativeCallBackInterface
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
        testBindingUdp(this.mNativeInst);
    }

    public void testBind2() {
        if (this.mNativeInst == -1) {
            return;
        }
        testBindingUdp2(this.mNativeInst);
    }

    public void testBind3() {
        if (this.mNativeInst == -1) {
            return;
        }
        testBindingUdp3(this.mNativeInst);
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
