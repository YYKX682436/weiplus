package com.tencent.wechat.aff.newlife;

/* loaded from: classes15.dex */
public class AffNewLifeDartToNativeManagerInvoker extends com.tencent.wechat.zidl2.ServerInvoker implements com.tencent.wechat.aff.newlife.AffNewLifeDartToNativeManagerBase.Callback {
    private com.tencent.wechat.aff.newlife.AffNewLifeDartToNativeManagerBase stub;

    public AffNewLifeDartToNativeManagerInvoker() {
        this.methodInvokeDispatcher.put("SayHhello", new com.tencent.wechat.zidl2.ServerInvoker.InvokerInterface() { // from class: aw5.d$$a
            @Override // com.tencent.wechat.zidl2.ServerInvoker.InvokerInterface
            public final java.nio.ByteBuffer invoke(java.lang.String str, com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
                java.nio.ByteBuffer __sayHhelloAsync;
                __sayHhelloAsync = com.tencent.wechat.aff.newlife.AffNewLifeDartToNativeManagerInvoker.this.__sayHhelloAsync(str, invokerCodecDecoder);
                return __sayHhelloAsync;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.nio.ByteBuffer __sayHhelloAsync(java.lang.String str, com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
        this.stub.sayHhelloAsync((int) this.taskIdConvertor.toServerId(str, ((java.lang.Integer) invokerCodecDecoder.readValue(java.lang.Integer.TYPE)).intValue()), invokerCodecDecoder.readString());
        return null;
    }

    @Override // com.tencent.wechat.zidl2.ServerInvoker
    public void attachStub(java.lang.Object obj) {
        com.tencent.wechat.aff.newlife.AffNewLifeDartToNativeManagerBase affNewLifeDartToNativeManagerBase = (com.tencent.wechat.aff.newlife.AffNewLifeDartToNativeManagerBase) obj;
        affNewLifeDartToNativeManagerBase.setCallback(this);
        this.stub = affNewLifeDartToNativeManagerBase;
    }

    @Override // com.tencent.wechat.aff.newlife.AffNewLifeDartToNativeManagerBase.Callback
    public void onSayHhelloComplete(int i17, java.lang.String str) {
        try {
            com.tencent.wechat.zidl2.TaskIdConvertor.ClientIdContext clientId = this.taskIdConvertor.toClientId(i17);
            if (clientId == null) {
                java.lang.String.format("onSayHhelloComplete taskid:%dnot found!", java.lang.Integer.valueOf(i17));
                return;
            }
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString("OnSayHhelloComplete");
            invokerCodecEncoder.writeValue(java.lang.Integer.valueOf((int) clientId.getTaskId()));
            invokerCodecEncoder.writeString(str);
            invoke(clientId.getClientId(), invokerCodecEncoder.getByteBuffer());
        } catch (java.lang.Exception unused) {
            throw new java.lang.RuntimeException("AffNewLifeDartToNativeManagerInvoker.onSayHhelloComplete failed");
        }
    }
}
