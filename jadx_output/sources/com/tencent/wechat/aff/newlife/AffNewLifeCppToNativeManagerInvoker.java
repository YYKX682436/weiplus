package com.tencent.wechat.aff.newlife;

/* loaded from: classes15.dex */
public class AffNewLifeCppToNativeManagerInvoker extends com.tencent.wechat.zidl2.ServerInvoker {
    private com.tencent.wechat.aff.newlife.AffNewLifeCppToNativeManagerBase stub;

    public AffNewLifeCppToNativeManagerInvoker() {
        this.methodInvokeDispatcher.put("FeedJumpInfoSummaryDataChange", new com.tencent.wechat.zidl2.ServerInvoker.InvokerInterface() { // from class: aw5.c$$a
            @Override // com.tencent.wechat.zidl2.ServerInvoker.InvokerInterface
            public final java.nio.ByteBuffer invoke(java.lang.String str, com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
                java.nio.ByteBuffer __feedJumpInfoSummaryDataChange;
                __feedJumpInfoSummaryDataChange = com.tencent.wechat.aff.newlife.AffNewLifeCppToNativeManagerInvoker.this.__feedJumpInfoSummaryDataChange(str, invokerCodecDecoder);
                return __feedJumpInfoSummaryDataChange;
            }
        });
        this.methodInvokeDispatcher.put("JumpInfoDataChange", new com.tencent.wechat.zidl2.ServerInvoker.InvokerInterface() { // from class: aw5.c$$b
            @Override // com.tencent.wechat.zidl2.ServerInvoker.InvokerInterface
            public final java.nio.ByteBuffer invoke(java.lang.String str, com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
                java.nio.ByteBuffer __jumpInfoDataChange;
                __jumpInfoDataChange = com.tencent.wechat.aff.newlife.AffNewLifeCppToNativeManagerInvoker.this.__jumpInfoDataChange(str, invokerCodecDecoder);
                return __jumpInfoDataChange;
            }
        });
        this.methodInvokeDispatcher.put("MentionInfoDataChange", new com.tencent.wechat.zidl2.ServerInvoker.InvokerInterface() { // from class: aw5.c$$c
            @Override // com.tencent.wechat.zidl2.ServerInvoker.InvokerInterface
            public final java.nio.ByteBuffer invoke(java.lang.String str, com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
                java.nio.ByteBuffer __mentionInfoDataChange;
                __mentionInfoDataChange = com.tencent.wechat.aff.newlife.AffNewLifeCppToNativeManagerInvoker.this.__mentionInfoDataChange(str, invokerCodecDecoder);
                return __mentionInfoDataChange;
            }
        });
        this.methodInvokeDispatcher.put("FetchJumpInfoComplete", new com.tencent.wechat.zidl2.ServerInvoker.InvokerInterface() { // from class: aw5.c$$d
            @Override // com.tencent.wechat.zidl2.ServerInvoker.InvokerInterface
            public final java.nio.ByteBuffer invoke(java.lang.String str, com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
                java.nio.ByteBuffer __fetchJumpInfoComplete;
                __fetchJumpInfoComplete = com.tencent.wechat.aff.newlife.AffNewLifeCppToNativeManagerInvoker.this.__fetchJumpInfoComplete(str, invokerCodecDecoder);
                return __fetchJumpInfoComplete;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.nio.ByteBuffer __feedJumpInfoSummaryDataChange(java.lang.String str, com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
        this.stub.feedJumpInfoSummaryDataChange(invokerCodecDecoder.readUInt32(), invokerCodecDecoder.readString(), invokerCodecDecoder.readUInt32(), invokerCodecDecoder.readUInt32(), invokerCodecDecoder.readStringList());
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.nio.ByteBuffer __fetchJumpInfoComplete(java.lang.String str, com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
        this.stub.fetchJumpInfoComplete(invokerCodecDecoder.readUInt32(), com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.wechat.aff.newlife.NewLifeFeedJumpInfo.getDefaultInstance(), invokerCodecDecoder.readBytesList()));
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.nio.ByteBuffer __jumpInfoDataChange(java.lang.String str, com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
        this.stub.jumpInfoDataChange(invokerCodecDecoder.readUInt32(), invokerCodecDecoder.readString(), invokerCodecDecoder.readUInt32(), invokerCodecDecoder.readUInt32(), invokerCodecDecoder.readBytes());
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.nio.ByteBuffer __mentionInfoDataChange(java.lang.String str, com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
        this.stub.mentionInfoDataChange(invokerCodecDecoder.readUInt32(), (com.tencent.wechat.aff.newlife.NewLifeMention) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.wechat.aff.newlife.NewLifeMention.getDefaultInstance(), invokerCodecDecoder.readBytes()), invokerCodecDecoder.readUInt64());
        return null;
    }

    @Override // com.tencent.wechat.zidl2.ServerInvoker
    public void attachStub(java.lang.Object obj) {
        this.stub = (com.tencent.wechat.aff.newlife.AffNewLifeCppToNativeManagerBase) obj;
    }
}
