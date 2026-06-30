package com.tencent.wxmm;

/* loaded from: classes13.dex */
public class v2service {
    private static final java.lang.String TAG = "WXMM.Voip";
    private byte _hellAccFlag_;
    private com.tencent.wxmm.IVoipCallBack mUiCallBack = null;
    public int defaultWidth = 704;
    public int defaultHeight = 544;
    public byte[] remoteImgBuffer = null;
    public byte[] callbackOutData = null;
    public int field_remoteImgLength = 0;
    public int field_remoteImgHeight = 0;
    public int field_remoteImgWidth = 0;
    public int field_remoteScreenImgLength = 0;
    public int field_remoteScreenImgWidth = 0;
    public int field_remoteScreenImgHeight = 0;

    static {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("c++_shared");
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/wxmm/v2service", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        com.tencent.cso.CsoLoader.e((java.lang.String) arrayList.get(0));
        yj0.a.f(obj, "com/tencent/wxmm/v2service", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add("marsbridgexlog");
        java.lang.Object obj2 = new java.lang.Object();
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/wxmm/v2service", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        com.tencent.cso.CsoLoader.e((java.lang.String) arrayList2.get(0));
        yj0.a.f(obj2, "com/tencent/wxmm/v2service", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add("marsbridgenetwork");
        java.lang.Object obj3 = new java.lang.Object();
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(obj3, arrayList3.toArray(), "com/tencent/wxmm/v2service", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        com.tencent.cso.CsoLoader.e((java.lang.String) arrayList3.get(0));
        yj0.a.f(obj3, "com/tencent/wxmm/v2service", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add("voipService");
        java.lang.Object obj4 = new java.lang.Object();
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(obj4, arrayList4.toArray(), "com/tencent/wxmm/v2service", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        com.tencent.cso.CsoLoader.e((java.lang.String) arrayList4.get(0));
        yj0.a.f(obj4, "com/tencent/wxmm/v2service", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
    }

    private native int Init(byte[] bArr, int i17);

    private native int UnInit();

    public native int Accept(int i17);

    public native int Ack();

    public byte[] ByteArrayCallbackFromVoipSDK(int i17, int i18, byte[] bArr) {
        com.tencent.wxmm.IVoipCallBack iVoipCallBack = this.mUiCallBack;
        if (iVoipCallBack != null) {
            return iVoipCallBack.callBackFromVoip2(i17, i18, bArr);
        }
        return null;
    }

    public native int Hangup(int i17);

    public int InitSDK(byte[] bArr, int i17, com.tencent.wxmm.IVoipCallBack iVoipCallBack) {
        this.mUiCallBack = iVoipCallBack;
        this.remoteImgBuffer = new byte[((this.defaultWidth * this.defaultHeight) * 3) / 2];
        int Init = Init(bArr, i17);
        com.tencent.wxmm.v2helper.Logd(TAG, "protocal init ret :" + Init + " " + i17);
        return Init;
    }

    public int IntCallbackFromVoipSDK(int i17, int i18, byte[] bArr) {
        com.tencent.wxmm.IVoipCallBack iVoipCallBack = this.mUiCallBack;
        if (iVoipCallBack == null) {
            return 0;
        }
        iVoipCallBack.callBackFromVoip1(i17, i18, bArr);
        return 0;
    }

    public native int Invite(int i17, byte[] bArr, int i18, int i19);

    public native int OnNetworkChange(int i17);

    public native int RecvNotify(byte[] bArr, int i17, int i18);

    public native int SwitchAVCmd(int i17);

    public int UninitSDK() {
        this.mUiCallBack = null;
        UnInit();
        return 0;
    }

    public native int UpdateAuthKey(byte[] bArr, int i17);

    public native int playCallback(byte[] bArr, int i17);

    public native int recordCallback(byte[] bArr, int i17);

    public int setAppCmd(int i17) {
        int appCmd = setAppCmd(i17, new byte[]{0}, 1);
        if (appCmd < 0) {
            com.tencent.wxmm.v2helper.Logd(TAG, "setAppCmd: type:" + appCmd + ":ret:" + appCmd);
        }
        return appCmd;
    }

    public native int setAppCmd(int i17, byte[] bArr, int i18);

    public native int videoDecode(byte[] bArr);

    public native int videoEncodeToSend(byte[] bArr, int i17, int i18, int i19, int i27);
}
