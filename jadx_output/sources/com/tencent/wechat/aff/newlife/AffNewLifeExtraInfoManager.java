package com.tencent.wechat.aff.newlife;

/* loaded from: classes15.dex */
public class AffNewLifeExtraInfoManager extends com.tencent.wechat.zidl2.ClientInvoker {
    private static com.tencent.wechat.aff.newlife.AffNewLifeExtraInfoManager instance = new com.tencent.wechat.aff.newlife.AffNewLifeExtraInfoManager();
    private java.util.concurrent.ConcurrentHashMap<java.lang.String, com.tencent.wechat.aff.newlife.AffNewLifeExtraInfoManager.FetchJumpInfoCompleteEvent> fetchJumpInfoCompleteEventMap = new java.util.concurrent.ConcurrentHashMap<>();

    /* loaded from: classes15.dex */
    public interface FetchJumpInfoCompleteEvent {
        void event(int i17, java.util.ArrayList<com.tencent.wechat.aff.newlife.NewLifeFeedJumpInfo> arrayList);
    }

    public AffNewLifeExtraInfoManager() {
        createClientInvoker("newlife.AffNewLifeExtraInfoManager@Get", null);
        this.methodInvokeDispatcher.put("OnFetchJumpInfoCompleteEvent", new com.tencent.wechat.zidl2.ClientInvoker.InvokerInterface() { // from class: aw5.e$$a
            @Override // com.tencent.wechat.zidl2.ClientInvoker.InvokerInterface
            public final void invoke(com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
                com.tencent.wechat.aff.newlife.AffNewLifeExtraInfoManager.this.__OnFetchJumpInfoCompleteEvent(invokerCodecDecoder);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void __OnFetchJumpInfoCompleteEvent(com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
        this.fetchJumpInfoCompleteEventMap.size();
        int readUInt32 = invokerCodecDecoder.readUInt32();
        java.util.ArrayList<com.tencent.wechat.aff.newlife.NewLifeFeedJumpInfo> mmpbUnSerialize = com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.wechat.aff.newlife.NewLifeFeedJumpInfo.getDefaultInstance(), invokerCodecDecoder.readBytesList());
        for (java.util.Map.Entry<java.lang.String, com.tencent.wechat.aff.newlife.AffNewLifeExtraInfoManager.FetchJumpInfoCompleteEvent> entry : this.fetchJumpInfoCompleteEventMap.entrySet()) {
            entry.getKey();
            entry.getValue().event(readUInt32, mmpbUnSerialize);
        }
    }

    public static com.tencent.wechat.aff.newlife.AffNewLifeExtraInfoManager getInstance() {
        return instance;
    }

    public void fetchExtraInfo(com.tencent.wechat.aff.newlife.FinderBatchGetObjectAsyncLoadInfoRequest finderBatchGetObjectAsyncLoadInfoRequest) {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("fetchExtraInfo");
            invokerCodecEncoder.writeBytes(com.tencent.wechat.zidl2.ZidlUtil.mmpbSerialize(finderBatchGetObjectAsyncLoadInfoRequest));
            invoke(invokerCodecEncoder.getByteBuffer());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("AffNewLifeExtraInfoManager.fetchExtraInfo failed", e17);
        }
    }

    public com.tencent.wechat.aff.newlife.NewLifeFeedJumpInfo getLocalJumpInfo(java.lang.String str, int i17) {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("getLocalJumpInfo");
            invokerCodecEncoder.writeString(str);
            invokerCodecEncoder.writeUInt32(i17);
            return (com.tencent.wechat.aff.newlife.NewLifeFeedJumpInfo) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.wechat.aff.newlife.NewLifeFeedJumpInfo.getDefaultInstance(), new com.tencent.wechat.zidl2.InvokerCodecDecoder(invoke(invokerCodecEncoder.getByteBuffer())).readBytes());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("AffNewLifeExtraInfoManager.getLocalJumpInfo failed", e17);
        }
    }

    public void saveLocalExtraInfo(byte[] bArr, java.lang.String str, int i17) {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("saveLocalExtraInfo");
            invokerCodecEncoder.writeBytes(bArr);
            invokerCodecEncoder.writeString(str);
            invokerCodecEncoder.writeUInt32(i17);
            invoke(invokerCodecEncoder.getByteBuffer());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("AffNewLifeExtraInfoManager.saveLocalExtraInfo failed", e17);
        }
    }

    public void subscribeFetchJumpInfoCompleteEvent(java.lang.String str, com.tencent.wechat.aff.newlife.AffNewLifeExtraInfoManager.FetchJumpInfoCompleteEvent fetchJumpInfoCompleteEvent) {
        this.fetchJumpInfoCompleteEventMap.put(str, fetchJumpInfoCompleteEvent);
    }

    public void unSubscribeFetchJumpInfoCompleteEvent(java.lang.String str) {
        this.fetchJumpInfoCompleteEventMap.remove(str);
    }
}
