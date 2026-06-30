package com.tencent.wechat.aff.status;

/* loaded from: classes15.dex */
public class StatusCgiManager extends com.tencent.wechat.zidl2.ClientInvoker {
    private static com.tencent.wechat.aff.status.StatusCgiManager instance = new com.tencent.wechat.aff.status.StatusCgiManager();
    private java.util.concurrent.ConcurrentHashMap<java.lang.Integer, com.tencent.wechat.aff.status.StatusCgiManager.getSelfHistoryDataCallback> getSelfHistoryDataCallbackMap = new java.util.concurrent.ConcurrentHashMap<>();
    private java.util.concurrent.ConcurrentHashMap<java.lang.Integer, com.tencent.wechat.aff.status.StatusCgiManager.GetCustomIconRecommendDataCallback> getCustomIconRecommendDataCallbackMap = new java.util.concurrent.ConcurrentHashMap<>();
    private java.util.concurrent.ConcurrentHashMap<java.lang.Integer, com.tencent.wechat.aff.status.StatusCgiManager.RequestIconConfigListCallback> requestIconConfigListCallbackMap = new java.util.concurrent.ConcurrentHashMap<>();
    private java.util.concurrent.ConcurrentHashMap<java.lang.Integer, com.tencent.wechat.aff.status.StatusCgiManager.CommitPublishStatusTaskCallback> commitPublishStatusTaskCallbackMap = new java.util.concurrent.ConcurrentHashMap<>();
    private java.util.concurrent.ConcurrentHashMap<java.lang.Integer, com.tencent.wechat.aff.status.StatusCgiManager.DeleteSelfStatusCallback> deleteSelfStatusCallbackMap = new java.util.concurrent.ConcurrentHashMap<>();

    /* loaded from: classes15.dex */
    public interface CommitPublishStatusTaskCallback {
        void complete(bw5.tl0 tl0Var);
    }

    /* loaded from: classes15.dex */
    public interface DeleteSelfStatusCallback {
        void complete(bw5.ll0 ll0Var);
    }

    /* loaded from: classes11.dex */
    public interface GetCustomIconRecommendDataCallback {
        void complete(bw5.ll0 ll0Var, bw5.yn0 yn0Var);
    }

    /* loaded from: classes15.dex */
    public interface RequestIconConfigListCallback {
        void complete(bw5.ll0 ll0Var, bw5.fm0 fm0Var);
    }

    /* loaded from: classes15.dex */
    public interface getSelfHistoryDataCallback {
        void complete(com.tencent.wechat.aff.status.StatusCgiError statusCgiError, com.tencent.wechat.aff.status.StatusGetSelfHistoryResp statusGetSelfHistoryResp);
    }

    public StatusCgiManager() {
        createClientInvoker("status.StatusCgiManager@Get", null);
        this.methodInvokeDispatcher.put("OngetSelfHistoryDataComplete", new com.tencent.wechat.zidl2.ClientInvoker.InvokerInterface() { // from class: com.tencent.wechat.aff.status.StatusCgiManager$$a
            @Override // com.tencent.wechat.zidl2.ClientInvoker.InvokerInterface
            public final void invoke(com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
                com.tencent.wechat.aff.status.StatusCgiManager.this.__OngetSelfHistoryDataComplete(invokerCodecDecoder);
            }
        });
        this.methodInvokeDispatcher.put("OnGetCustomIconRecommendDataComplete", new com.tencent.wechat.zidl2.ClientInvoker.InvokerInterface() { // from class: com.tencent.wechat.aff.status.StatusCgiManager$$b
            @Override // com.tencent.wechat.zidl2.ClientInvoker.InvokerInterface
            public final void invoke(com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
                com.tencent.wechat.aff.status.StatusCgiManager.this.__OnGetCustomIconRecommendDataComplete(invokerCodecDecoder);
            }
        });
        this.methodInvokeDispatcher.put("OnRequestIconConfigListComplete", new com.tencent.wechat.zidl2.ClientInvoker.InvokerInterface() { // from class: com.tencent.wechat.aff.status.StatusCgiManager$$c
            @Override // com.tencent.wechat.zidl2.ClientInvoker.InvokerInterface
            public final void invoke(com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
                com.tencent.wechat.aff.status.StatusCgiManager.this.__OnRequestIconConfigListComplete(invokerCodecDecoder);
            }
        });
        this.methodInvokeDispatcher.put("OnCommitPublishStatusTaskComplete", new com.tencent.wechat.zidl2.ClientInvoker.InvokerInterface() { // from class: com.tencent.wechat.aff.status.StatusCgiManager$$d
            @Override // com.tencent.wechat.zidl2.ClientInvoker.InvokerInterface
            public final void invoke(com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
                com.tencent.wechat.aff.status.StatusCgiManager.this.__OnCommitPublishStatusTaskComplete(invokerCodecDecoder);
            }
        });
        this.methodInvokeDispatcher.put("OnDeleteSelfStatusComplete", new com.tencent.wechat.zidl2.ClientInvoker.InvokerInterface() { // from class: com.tencent.wechat.aff.status.StatusCgiManager$$e
            @Override // com.tencent.wechat.zidl2.ClientInvoker.InvokerInterface
            public final void invoke(com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
                com.tencent.wechat.aff.status.StatusCgiManager.this.__OnDeleteSelfStatusComplete(invokerCodecDecoder);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void __OnCommitPublishStatusTaskComplete(com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
        int readUInt32 = invokerCodecDecoder.readUInt32();
        com.tencent.wechat.aff.status.StatusCgiManager.CommitPublishStatusTaskCallback commitPublishStatusTaskCallback = this.commitPublishStatusTaskCallbackMap.get(java.lang.Integer.valueOf(readUInt32));
        if (commitPublishStatusTaskCallback != null) {
            commitPublishStatusTaskCallback.complete((bw5.tl0) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(bw5.tl0.f33507h, invokerCodecDecoder.readBytes()));
            this.commitPublishStatusTaskCallbackMap.remove(java.lang.Integer.valueOf(readUInt32));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void __OnDeleteSelfStatusComplete(com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
        int readUInt32 = invokerCodecDecoder.readUInt32();
        com.tencent.wechat.aff.status.StatusCgiManager.DeleteSelfStatusCallback deleteSelfStatusCallback = this.deleteSelfStatusCallbackMap.get(java.lang.Integer.valueOf(readUInt32));
        if (deleteSelfStatusCallback != null) {
            deleteSelfStatusCallback.complete((bw5.ll0) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(bw5.ll0.f29846h, invokerCodecDecoder.readBytes()));
            this.deleteSelfStatusCallbackMap.remove(java.lang.Integer.valueOf(readUInt32));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void __OnGetCustomIconRecommendDataComplete(com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
        int readUInt32 = invokerCodecDecoder.readUInt32();
        com.tencent.wechat.aff.status.StatusCgiManager.GetCustomIconRecommendDataCallback getCustomIconRecommendDataCallback = this.getCustomIconRecommendDataCallbackMap.get(java.lang.Integer.valueOf(readUInt32));
        if (getCustomIconRecommendDataCallback != null) {
            getCustomIconRecommendDataCallback.complete((bw5.ll0) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(bw5.ll0.f29846h, invokerCodecDecoder.readBytes()), (bw5.yn0) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(bw5.yn0.f35585g, invokerCodecDecoder.readBytes()));
            this.getCustomIconRecommendDataCallbackMap.remove(java.lang.Integer.valueOf(readUInt32));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void __OnRequestIconConfigListComplete(com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
        int readUInt32 = invokerCodecDecoder.readUInt32();
        com.tencent.wechat.aff.status.StatusCgiManager.RequestIconConfigListCallback requestIconConfigListCallback = this.requestIconConfigListCallbackMap.get(java.lang.Integer.valueOf(readUInt32));
        if (requestIconConfigListCallback != null) {
            requestIconConfigListCallback.complete((bw5.ll0) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(bw5.ll0.f29846h, invokerCodecDecoder.readBytes()), (bw5.fm0) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(bw5.fm0.f27369i, invokerCodecDecoder.readBytes()));
            this.requestIconConfigListCallbackMap.remove(java.lang.Integer.valueOf(readUInt32));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void __OngetSelfHistoryDataComplete(com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
        int readUInt32 = invokerCodecDecoder.readUInt32();
        com.tencent.wechat.aff.status.StatusCgiManager.getSelfHistoryDataCallback getselfhistorydatacallback = this.getSelfHistoryDataCallbackMap.get(java.lang.Integer.valueOf(readUInt32));
        if (getselfhistorydatacallback != null) {
            getselfhistorydatacallback.complete((com.tencent.wechat.aff.status.StatusCgiError) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.wechat.aff.status.StatusCgiError.getDefaultInstance(), invokerCodecDecoder.readBytes()), (com.tencent.wechat.aff.status.StatusGetSelfHistoryResp) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.wechat.aff.status.StatusGetSelfHistoryResp.getDefaultInstance(), invokerCodecDecoder.readBytes()));
            this.getSelfHistoryDataCallbackMap.remove(java.lang.Integer.valueOf(readUInt32));
        }
    }

    public static com.tencent.wechat.aff.status.StatusCgiManager getInstance() {
        return instance;
    }

    public void commitPublishStatusTaskAsync(bw5.pn0 pn0Var, com.tencent.wechat.aff.status.StatusCgiManager.CommitPublishStatusTaskCallback commitPublishStatusTaskCallback) {
        try {
            int GenTaskId = (int) this.taskIdConvertor.GenTaskId();
            if (commitPublishStatusTaskCallback != null) {
                this.commitPublishStatusTaskCallbackMap.put(java.lang.Integer.valueOf(GenTaskId), commitPublishStatusTaskCallback);
            }
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("CommitPublishStatusTask");
            invokerCodecEncoder.writeUInt32(GenTaskId);
            invokerCodecEncoder.writeBytes(com.tencent.wechat.zidl2.ZidlUtil.mmpbSerialize(pn0Var));
            invoke(invokerCodecEncoder.getByteBuffer());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("StatusCgiManager.commitPublishStatusTask failed", e17);
        }
    }

    public void deleteSelfStatusAsync(bw5.xl0 xl0Var, com.tencent.wechat.aff.status.StatusCgiManager.DeleteSelfStatusCallback deleteSelfStatusCallback) {
        try {
            int GenTaskId = (int) this.taskIdConvertor.GenTaskId();
            if (deleteSelfStatusCallback != null) {
                this.deleteSelfStatusCallbackMap.put(java.lang.Integer.valueOf(GenTaskId), deleteSelfStatusCallback);
            }
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("DeleteSelfStatus");
            invokerCodecEncoder.writeUInt32(GenTaskId);
            invokerCodecEncoder.writeBytes(com.tencent.wechat.zidl2.ZidlUtil.mmpbSerialize(xl0Var));
            invoke(invokerCodecEncoder.getByteBuffer());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("StatusCgiManager.deleteSelfStatus failed", e17);
        }
    }

    public void getCustomIconRecommendDataAsync(bw5.xn0 xn0Var, com.tencent.wechat.aff.status.StatusCgiManager.GetCustomIconRecommendDataCallback getCustomIconRecommendDataCallback) {
        try {
            int GenTaskId = (int) this.taskIdConvertor.GenTaskId();
            if (getCustomIconRecommendDataCallback != null) {
                this.getCustomIconRecommendDataCallbackMap.put(java.lang.Integer.valueOf(GenTaskId), getCustomIconRecommendDataCallback);
            }
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("GetCustomIconRecommendData");
            invokerCodecEncoder.writeUInt32(GenTaskId);
            invokerCodecEncoder.writeBytes(com.tencent.wechat.zidl2.ZidlUtil.mmpbSerialize(xn0Var));
            invoke(invokerCodecEncoder.getByteBuffer());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("StatusCgiManager.getCustomIconRecommendData failed", e17);
        }
    }

    public void getSelfHistoryDataAsync(com.tencent.wechat.aff.status.StatusGetSelfHistoryReq statusGetSelfHistoryReq, com.tencent.wechat.aff.status.StatusCgiManager.getSelfHistoryDataCallback getselfhistorydatacallback) {
        try {
            int GenTaskId = (int) this.taskIdConvertor.GenTaskId();
            if (getselfhistorydatacallback != null) {
                this.getSelfHistoryDataCallbackMap.put(java.lang.Integer.valueOf(GenTaskId), getselfhistorydatacallback);
            }
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("getSelfHistoryData");
            invokerCodecEncoder.writeUInt32(GenTaskId);
            invokerCodecEncoder.writeBytes(com.tencent.wechat.zidl2.ZidlUtil.mmpbSerialize(statusGetSelfHistoryReq));
            invoke(invokerCodecEncoder.getByteBuffer());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("StatusCgiManager.getSelfHistoryData failed", e17);
        }
    }

    public void requestIconConfigListAsync(bw5.em0 em0Var, com.tencent.wechat.aff.status.StatusCgiManager.RequestIconConfigListCallback requestIconConfigListCallback) {
        try {
            int GenTaskId = (int) this.taskIdConvertor.GenTaskId();
            if (requestIconConfigListCallback != null) {
                this.requestIconConfigListCallbackMap.put(java.lang.Integer.valueOf(GenTaskId), requestIconConfigListCallback);
            }
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("RequestIconConfigList");
            invokerCodecEncoder.writeUInt32(GenTaskId);
            invokerCodecEncoder.writeBytes(com.tencent.wechat.zidl2.ZidlUtil.mmpbSerialize(em0Var));
            invoke(invokerCodecEncoder.getByteBuffer());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("StatusCgiManager.requestIconConfigList failed", e17);
        }
    }
}
