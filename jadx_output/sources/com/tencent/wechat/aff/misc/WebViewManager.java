package com.tencent.wechat.aff.misc;

/* loaded from: classes15.dex */
public class WebViewManager extends com.tencent.wechat.zidl2.ClientInvoker {
    private static com.tencent.wechat.aff.misc.WebViewManager instance = new com.tencent.wechat.aff.misc.WebViewManager();
    private java.util.concurrent.ConcurrentHashMap<java.lang.Long, com.tencent.wechat.aff.misc.WebViewManager.ReadDynamicMenuConfigCallback> readDynamicMenuConfigCallbackMap = new java.util.concurrent.ConcurrentHashMap<>();

    /* loaded from: classes8.dex */
    public interface ReadDynamicMenuConfigCallback {
        void complete(com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigResp readDynamicMenuConfigResp);
    }

    public WebViewManager() {
        createClientInvoker("misc.WebViewManager@Get");
        this.methodInvokeDispatcher.put("OnReadDynamicMenuConfigComplete", new com.tencent.wechat.zidl2.ClientInvoker.InvokerInterface() { // from class: com.tencent.wechat.aff.misc.WebViewManager$$a
            @Override // com.tencent.wechat.zidl2.ClientInvoker.InvokerInterface
            public final void invoke(com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
                com.tencent.wechat.aff.misc.WebViewManager.this.__OnReadDynamicMenuConfigComplete(invokerCodecDecoder);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void __OnReadDynamicMenuConfigComplete(com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
        long longValue = ((java.lang.Long) invokerCodecDecoder.readValue(java.lang.Long.TYPE)).longValue();
        com.tencent.wechat.aff.misc.WebViewManager.ReadDynamicMenuConfigCallback readDynamicMenuConfigCallback = this.readDynamicMenuConfigCallbackMap.get(java.lang.Long.valueOf(longValue));
        if (readDynamicMenuConfigCallback != null) {
            readDynamicMenuConfigCallback.complete((com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigResp) com.tencent.wechat.zidl2.ZidlUtil.pbUnSerialize(com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigResp.getDefaultInstance(), invokerCodecDecoder.readBytes()));
            this.readDynamicMenuConfigCallbackMap.remove(java.lang.Long.valueOf(longValue));
        }
    }

    public static com.tencent.wechat.aff.misc.WebViewManager getInstance() {
        return instance;
    }

    @Override // com.tencent.wechat.zidl2.ClientInvoker
    public java.lang.Object createInnerManager(java.lang.String str) {
        return null;
    }

    public void readDynamicMenuConfigAsync(com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigReq readDynamicMenuConfigReq, com.tencent.wechat.aff.misc.WebViewManager.ReadDynamicMenuConfigCallback readDynamicMenuConfigCallback) {
        try {
            long GenTaskId = this.taskIdConvertor.GenTaskId();
            if (readDynamicMenuConfigCallback != null) {
                this.readDynamicMenuConfigCallbackMap.put(java.lang.Long.valueOf(GenTaskId), readDynamicMenuConfigCallback);
            }
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString("direct.client.java");
            invokerCodecEncoder.writeString("ReadDynamicMenuConfig");
            invokerCodecEncoder.writeValue(java.lang.Long.valueOf(GenTaskId));
            invokerCodecEncoder.writeBytes(com.tencent.wechat.zidl2.ZidlUtil.pbSerialize(readDynamicMenuConfigReq));
            invoke(invokerCodecEncoder.getByteBuffer());
        } catch (java.lang.Exception unused) {
            throw new java.lang.RuntimeException("WebViewManager.readDynamicMenuConfig failed");
        }
    }
}
