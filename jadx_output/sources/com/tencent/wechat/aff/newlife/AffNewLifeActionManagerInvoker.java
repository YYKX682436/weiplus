package com.tencent.wechat.aff.newlife;

/* loaded from: classes15.dex */
public class AffNewLifeActionManagerInvoker extends com.tencent.wechat.zidl2.ServerInvoker implements com.tencent.wechat.aff.newlife.AffNewLifeActionManagerBase.Callback {
    private com.tencent.wechat.aff.newlife.AffNewLifeActionManagerBase stub;

    public AffNewLifeActionManagerInvoker() {
        this.methodInvokeDispatcher.put("DoAction", new com.tencent.wechat.zidl2.ServerInvoker.InvokerInterface() { // from class: aw5.b$$a
            @Override // com.tencent.wechat.zidl2.ServerInvoker.InvokerInterface
            public final java.nio.ByteBuffer invoke(java.lang.String str, com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
                java.nio.ByteBuffer __doActionAsync;
                __doActionAsync = com.tencent.wechat.aff.newlife.AffNewLifeActionManagerInvoker.this.__doActionAsync(str, invokerCodecDecoder);
                return __doActionAsync;
            }
        });
        this.methodInvokeDispatcher.put("DoActionSync", new com.tencent.wechat.zidl2.ServerInvoker.InvokerInterface() { // from class: aw5.b$$b
            @Override // com.tencent.wechat.zidl2.ServerInvoker.InvokerInterface
            public final java.nio.ByteBuffer invoke(java.lang.String str, com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
                java.nio.ByteBuffer __doActionSync;
                __doActionSync = com.tencent.wechat.aff.newlife.AffNewLifeActionManagerInvoker.this.__doActionSync(str, invokerCodecDecoder);
                return __doActionSync;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.nio.ByteBuffer __doActionAsync(java.lang.String str, com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
        this.stub.doActionAsync((int) this.taskIdConvertor.toServerId(str, invokerCodecDecoder.readUInt32()), (com.tencent.wechat.aff.newlife.NewLifeActionRequest) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.wechat.aff.newlife.NewLifeActionRequest.getDefaultInstance(), invokerCodecDecoder.readBytes()));
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.nio.ByteBuffer __doActionSync(java.lang.String str, com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
        com.tencent.wechat.aff.newlife.NewLifeActionResponse doActionSync = this.stub.doActionSync((com.tencent.wechat.aff.newlife.NewLifeActionRequest) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.wechat.aff.newlife.NewLifeActionRequest.getDefaultInstance(), invokerCodecDecoder.readBytes()));
        com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
        invokerCodecEncoder.writeBytes(com.tencent.wechat.zidl2.ZidlUtil.mmpbSerialize(doActionSync));
        return invokerCodecEncoder.getByteBuffer();
    }

    @Override // com.tencent.wechat.zidl2.ServerInvoker
    public void attachStub(java.lang.Object obj) {
        com.tencent.wechat.aff.newlife.AffNewLifeActionManagerBase affNewLifeActionManagerBase = (com.tencent.wechat.aff.newlife.AffNewLifeActionManagerBase) obj;
        affNewLifeActionManagerBase.setCallback(this);
        this.stub = affNewLifeActionManagerBase;
    }

    @Override // com.tencent.wechat.aff.newlife.AffNewLifeActionManagerBase.Callback
    public void onDoActionComplete(int i17, com.tencent.wechat.aff.newlife.NewLifeActionResponse newLifeActionResponse) {
        try {
            long j17 = i17;
            com.tencent.wechat.zidl2.TaskIdConvertor.ClientIdContext clientId = this.taskIdConvertor.toClientId(j17);
            if (clientId == null) {
                java.lang.String.format("onDoActionComplete taskid:%dnot found!", java.lang.Integer.valueOf(i17));
                return;
            }
            this.taskIdConvertor.removeServerId(j17);
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString("OnDoActionComplete");
            invokerCodecEncoder.writeUInt32((int) clientId.getTaskId());
            invokerCodecEncoder.writeBytes(com.tencent.wechat.zidl2.ZidlUtil.mmpbSerialize(newLifeActionResponse));
            invoke(clientId.getClientId(), invokerCodecEncoder.getByteBuffer());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("AffNewLifeActionManagerInvoker.onDoActionComplete failed", e17);
        }
    }
}
