package com.tencent.mm.plugin.talkroom.component;

/* loaded from: classes13.dex */
public class v2engine {
    public native int Close();

    public native int GetAudioData(com.tencent.mm.pointers.PByteArray pByteArray, int i17, com.tencent.mm.pointers.PInt pInt, com.tencent.mm.pointers.PInt pInt2);

    public native int GetStatis(com.tencent.mm.pointers.PByteArray pByteArray, java.lang.String str);

    public native int IsSilenceFrame();

    public native int Open(com.tencent.mm.plugin.talkroom.component.ILiveConEngineCallback_AIDL iLiveConEngineCallback_AIDL, int i17, int i18, int i19, long j17, int i27, byte[] bArr, int i28);

    public native int Send(byte[] bArr, short s17);

    public native int SetCurrentMicId(int i17);

    public native int initLive(int i17, java.lang.String str);

    public native int uninitLive();
}
