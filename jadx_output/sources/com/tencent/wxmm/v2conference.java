package com.tencent.wxmm;

/* loaded from: classes14.dex */
public class v2conference {
    private static final java.lang.String TAG = "WXMM.Conference";
    private byte _hellAccFlag_;
    private com.tencent.wxmm.IConfCallBack mUiConfCallback = null;
    public int defaultWidth = 640;
    public int defaultHeight = 480;
    public int maxMemberSize = 100;
    public byte[] remoteImgBuffer = null;
    public int field_remoteImgLength = 0;
    public int field_remoteImgHeight = 0;
    public int field_remoteImgWidth = 0;
    public int field_remoteImgMember = -1;
    public int field_remoteImgFormat = 0;
    public int field_remoteScreenImgLength = 0;
    public int field_remoteScreenImgHeight = 0;
    public int field_remoteScreenImgWidth = 0;
    public int field_remoteScreenImgMember = -1;
    public int field_remoteScreenImgFormat = 0;
    public int field_HWEncW = 0;
    public int field_HWEncH = 0;
    public int field_localImgWidth = 0;
    public int field_localImgHeight = 0;
    public int[] audioSampleRate = {8000};
    public int[] audioFrameLen = {20};
    public int[] audioChannels = {1};
    public java.nio.ByteBuffer videoBuffer = null;

    static {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("c++_shared");
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/wxmm/v2conference", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        com.tencent.cso.CsoLoader.e((java.lang.String) arrayList.get(0));
        yj0.a.f(obj, "com/tencent/wxmm/v2conference", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add("ilink2");
        java.lang.Object obj2 = new java.lang.Object();
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/wxmm/v2conference", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        com.tencent.cso.CsoLoader.e((java.lang.String) arrayList2.get(0));
        yj0.a.f(obj2, "com/tencent/wxmm/v2conference", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add("confService");
        java.lang.Object obj3 = new java.lang.Object();
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(obj3, arrayList3.toArray(), "com/tencent/wxmm/v2conference", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        com.tencent.cso.CsoLoader.e((java.lang.String) arrayList3.get(0));
        yj0.a.f(obj3, "com/tencent/wxmm/v2conference", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
    }

    private native int GetVideoData(byte[] bArr, int i17);

    public native int Accept(int i17);

    public native int Ack();

    public native int Add(byte[] bArr, int i17);

    public byte[] CallbackFromConferenceSDK(int i17, int i18, byte[] bArr) {
        com.tencent.wxmm.IConfCallBack iConfCallBack = this.mUiConfCallback;
        if (iConfCallBack != null) {
            return iConfCallBack.callBackFromConf(i17, i18, bArr);
        }
        return null;
    }

    public void CallbackOnVideoFrameFromSDK(int i17, int i18, int i19, int i27) {
        com.tencent.wxmm.IConfCallBack iConfCallBack = this.mUiConfCallback;
        if (iConfCallBack != null) {
            iConfCallBack.callbackVideoFrame(i17, this.videoBuffer, i18, i19, i27);
        }
    }

    public void CallbackWriteLogFromSDK(int i17, java.lang.String str, java.lang.String str2, int i18, java.lang.String str3, java.lang.String str4, int i19) {
        com.tencent.wxmm.IConfCallBack iConfCallBack = this.mUiConfCallback;
        if (iConfCallBack != null) {
            iConfCallBack.callbackWriteLog(i17, str, str2, i18, str3, str4, i19);
        }
    }

    public native int ExitRoom(int i17);

    public int GetAllActiveMembers(int[] iArr, int i17) {
        if (iArr == null || i17 <= 0) {
            return -1;
        }
        return GetVADMembers(iArr, i17);
    }

    public native int GetAudioData(byte[] bArr, int i17);

    public native int GetAudioDataToCustom(byte[] bArr, int i17);

    public native int GetAudioDataToPlayInLiveMode(byte[] bArr, int i17);

    public int GetAudioDeviceFmt(com.tencent.wxmm.AudDataFmt audDataFmt) {
        int GetAudioFormat = GetAudioFormat(this.audioSampleRate, this.audioFrameLen, this.audioChannels);
        audDataFmt.nChannesl = this.audioChannels[0];
        audDataFmt.nFramelen = this.audioFrameLen[0];
        audDataFmt.nSamplerate = this.audioSampleRate[0];
        return GetAudioFormat;
    }

    public native int GetAudioFormat(int[] iArr, int[] iArr2, int[] iArr3);

    public native int GetConfRecordAudioData(byte[] bArr, int i17);

    public int GetDecodeVideoData(byte[] bArr, int i17) {
        return GetVideoData(bArr, i17);
    }

    public java.nio.ByteBuffer GetDirectByteBuffer(int i17) {
        java.nio.ByteBuffer byteBuffer = this.videoBuffer;
        if (byteBuffer == null) {
            this.videoBuffer = java.nio.ByteBuffer.allocateDirect(i17);
        } else if (byteBuffer.capacity() < i17) {
            this.videoBuffer = java.nio.ByteBuffer.allocateDirect(i17);
        }
        return this.videoBuffer;
    }

    public native int GetVADMembers(int[] iArr, int i17);

    public native int GetVoiceActivity(int i17);

    public native int Hangup(int i17);

    public native int ImageConvert(com.tencent.wxmm.ImagePlane imagePlane, com.tencent.wxmm.ImagePlane imagePlane2, byte[] bArr, byte[] bArr2);

    public native int Init(byte[] bArr, int i17);

    public int InitSDK(byte[] bArr, int i17, com.tencent.wxmm.IConfCallBack iConfCallBack) {
        this.mUiConfCallback = iConfCallBack;
        this.remoteImgBuffer = new byte[((this.defaultWidth * this.defaultHeight) * 3) / 2];
        return Init(bArr, i17);
    }

    public native int Invite(byte[] bArr, int i17);

    public native int JoinRoom(byte[] bArr, int i17);

    public native int OnNetworkChange(int i17, byte[] bArr);

    public native int PutExternalplayAudioData(byte[] bArr, int i17, int i18, int i19, int i27);

    public native int PutProcessedAudioDataToEncodeInLiveMode(byte[] bArr, int i17);

    public native int RecvNotify(byte[] bArr, int i17, int i18);

    public native int SendAudioData(byte[] bArr, int i17, int i18);

    public native int SendAudioDataFromCustom(byte[] bArr, int i17);

    public native int SendCmdMsg(byte[] bArr, int i17);

    public native int SendVideoData(byte[] bArr, int i17, int i18, int i19, int i27);

    public native int SetAppCmd(int i17, byte[] bArr, int i18);

    public native int SetAudioDevFormat(int i17, int i18, int i19, int i27, int i28);

    public native int SetAudioPlayStatus(int i17, int i18);

    public void SetUICallback(com.tencent.wxmm.IConfCallBack iConfCallBack) {
        this.mUiConfCallback = iConfCallBack;
    }

    public native int StartPublish(byte[] bArr, int i17);

    public native int StopPublish();

    public native int SubscribeVideo(byte[] bArr, int i17);

    public native int SwitchAV(int i17, int i18, int i19);

    public native int SwitchAudio(int i17);

    public native int SwitchVideo(int i17);

    public native int UnInit();

    public int UninitSDK() {
        this.mUiConfCallback = null;
        UnInit();
        return 0;
    }

    public native int UpdateAuthKey(byte[] bArr, int i17);

    public native int imgClip(byte[] bArr, int i17, int i18, byte[] bArr2, int i19, int i27, int i28, int i29);

    public native int sendResponse(byte[] bArr, int i17, int i18, int i19);

    public native int videoHWProcess(byte[] bArr, int i17, int i18, int i19, int i27, byte[] bArr2, int i28, int i29);

    public native int videoTrans(byte[] bArr, int i17, int i18, int i19, int i27, int[] iArr);
}
