package com.tencent.wechat.aff.finder;

/* loaded from: classes11.dex */
public class FinderDataService extends com.tencent.wechat.zidl2.ClientInvoker {
    private static com.tencent.wechat.aff.finder.FinderDataService instance = new com.tencent.wechat.aff.finder.FinderDataService();
    private java.util.concurrent.ConcurrentHashMap<java.lang.Integer, com.tencent.wechat.aff.finder.FinderDataService.reportMsgReadCGICallback> reportMsgReadCGICallbackMap = new java.util.concurrent.ConcurrentHashMap<>();

    /* loaded from: classes10.dex */
    public interface reportMsgReadCGICallback {
        void complete(boolean z17);
    }

    public FinderDataService() {
        createClientInvoker("finder.FinderDataService@Get", null);
        this.methodInvokeDispatcher.put("OnreportMsgReadCGIComplete", new com.tencent.wechat.zidl2.ClientInvoker.InvokerInterface() { // from class: yv5.b$$a
            @Override // com.tencent.wechat.zidl2.ClientInvoker.InvokerInterface
            public final void invoke(com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
                com.tencent.wechat.aff.finder.FinderDataService.this.__OnreportMsgReadCGIComplete(invokerCodecDecoder);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void __OnreportMsgReadCGIComplete(com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
        int readUInt32 = invokerCodecDecoder.readUInt32();
        com.tencent.wechat.aff.finder.FinderDataService.reportMsgReadCGICallback reportmsgreadcgicallback = this.reportMsgReadCGICallbackMap.get(java.lang.Integer.valueOf(readUInt32));
        if (reportmsgreadcgicallback != null) {
            reportmsgreadcgicallback.complete(invokerCodecDecoder.readBoolean());
            this.reportMsgReadCGICallbackMap.remove(java.lang.Integer.valueOf(readUInt32));
        }
    }

    public static com.tencent.wechat.aff.finder.FinderDataService getInstance() {
        return instance;
    }

    public void configService(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("configService");
            invokerCodecEncoder.writeString(str);
            invokerCodecEncoder.writeString(str2);
            invokerCodecEncoder.writeString(str3);
            invoke(invokerCodecEncoder.getByteBuffer());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("FinderDataService.configService failed", e17);
        }
    }

    public void reportMsgReadCGIAsync(java.lang.String str, java.lang.String str2, bw5.cu cuVar, com.tencent.wechat.aff.finder.FinderDataService.reportMsgReadCGICallback reportmsgreadcgicallback) {
        try {
            int GenTaskId = (int) this.taskIdConvertor.GenTaskId();
            if (reportmsgreadcgicallback != null) {
                this.reportMsgReadCGICallbackMap.put(java.lang.Integer.valueOf(GenTaskId), reportmsgreadcgicallback);
            }
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("reportMsgReadCGI");
            invokerCodecEncoder.writeUInt32(GenTaskId);
            invokerCodecEncoder.writeString(str);
            invokerCodecEncoder.writeString(str2);
            invokerCodecEncoder.writeInt32(cuVar.f26231d);
            invoke(invokerCodecEncoder.getByteBuffer());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("FinderDataService.reportMsgReadCGI failed", e17);
        }
    }

    public void testHello() {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("testHello");
            invoke(invokerCodecEncoder.getByteBuffer());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("FinderDataService.testHello failed", e17);
        }
    }
}
