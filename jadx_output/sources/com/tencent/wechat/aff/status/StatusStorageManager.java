package com.tencent.wechat.aff.status;

/* loaded from: classes11.dex */
public class StatusStorageManager extends com.tencent.wechat.zidl2.ClientInvoker {
    private static com.tencent.wechat.aff.status.StatusStorageManager instance = new com.tencent.wechat.aff.status.StatusStorageManager();
    private java.util.concurrent.ConcurrentHashMap<java.lang.Integer, com.tencent.wechat.aff.status.StatusStorageManager.testCallback> testCallbackMap = new java.util.concurrent.ConcurrentHashMap<>();
    private java.util.concurrent.ConcurrentHashMap<java.lang.Integer, com.tencent.wechat.aff.status.StatusStorageManager.InitIconConfigCallback> initIconConfigCallbackMap = new java.util.concurrent.ConcurrentHashMap<>();
    private java.util.concurrent.ConcurrentHashMap<java.lang.Integer, com.tencent.wechat.aff.status.StatusStorageManager.cleanExpireDBCallback> cleanExpireDBCallbackMap = new java.util.concurrent.ConcurrentHashMap<>();
    private java.util.concurrent.ConcurrentHashMap<java.lang.String, com.tencent.wechat.aff.status.StatusStorageManager.StatusInfoChangeEvent> statusInfoChangeEventMap = new java.util.concurrent.ConcurrentHashMap<>();
    private java.util.concurrent.ConcurrentHashMap<java.lang.String, com.tencent.wechat.aff.status.StatusStorageManager.StatusCommentChangeEvent> statusCommentChangeEventMap = new java.util.concurrent.ConcurrentHashMap<>();

    /* loaded from: classes11.dex */
    public interface InitIconConfigCallback {
        void complete();
    }

    /* loaded from: classes11.dex */
    public interface StatusCommentChangeEvent {
        void event(int i17, int i18, bw5.pl0 pl0Var);
    }

    /* loaded from: classes11.dex */
    public interface StatusInfoChangeEvent {
        void event(int i17, int i18, bw5.sm0 sm0Var);
    }

    /* loaded from: classes11.dex */
    public interface cleanExpireDBCallback {
        void complete(bw5.um0 um0Var);
    }

    /* loaded from: classes11.dex */
    public interface testCallback {
        void complete(int i17);
    }

    public StatusStorageManager() {
        createClientInvoker("status.StatusStorageManager@Get", null);
        this.methodInvokeDispatcher.put("OntestComplete", new com.tencent.wechat.zidl2.ClientInvoker.InvokerInterface() { // from class: com.tencent.wechat.aff.status.StatusStorageManager$$a
            @Override // com.tencent.wechat.zidl2.ClientInvoker.InvokerInterface
            public final void invoke(com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
                com.tencent.wechat.aff.status.StatusStorageManager.this.__OntestComplete(invokerCodecDecoder);
            }
        });
        this.methodInvokeDispatcher.put("OnInitIconConfigComplete", new com.tencent.wechat.zidl2.ClientInvoker.InvokerInterface() { // from class: com.tencent.wechat.aff.status.StatusStorageManager$$b
            @Override // com.tencent.wechat.zidl2.ClientInvoker.InvokerInterface
            public final void invoke(com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
                com.tencent.wechat.aff.status.StatusStorageManager.this.__OnInitIconConfigComplete(invokerCodecDecoder);
            }
        });
        this.methodInvokeDispatcher.put("OncleanExpireDBComplete", new com.tencent.wechat.zidl2.ClientInvoker.InvokerInterface() { // from class: com.tencent.wechat.aff.status.StatusStorageManager$$c
            @Override // com.tencent.wechat.zidl2.ClientInvoker.InvokerInterface
            public final void invoke(com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
                com.tencent.wechat.aff.status.StatusStorageManager.this.__OncleanExpireDBComplete(invokerCodecDecoder);
            }
        });
        this.methodInvokeDispatcher.put("OnStatusInfoChangeEvent", new com.tencent.wechat.zidl2.ClientInvoker.InvokerInterface() { // from class: com.tencent.wechat.aff.status.StatusStorageManager$$d
            @Override // com.tencent.wechat.zidl2.ClientInvoker.InvokerInterface
            public final void invoke(com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
                com.tencent.wechat.aff.status.StatusStorageManager.this.__OnStatusInfoChangeEvent(invokerCodecDecoder);
            }
        });
        this.methodInvokeDispatcher.put("OnStatusCommentChangeEvent", new com.tencent.wechat.zidl2.ClientInvoker.InvokerInterface() { // from class: com.tencent.wechat.aff.status.StatusStorageManager$$e
            @Override // com.tencent.wechat.zidl2.ClientInvoker.InvokerInterface
            public final void invoke(com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
                com.tencent.wechat.aff.status.StatusStorageManager.this.__OnStatusCommentChangeEvent(invokerCodecDecoder);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void __OnInitIconConfigComplete(com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
        int readUInt32 = invokerCodecDecoder.readUInt32();
        com.tencent.wechat.aff.status.StatusStorageManager.InitIconConfigCallback initIconConfigCallback = this.initIconConfigCallbackMap.get(java.lang.Integer.valueOf(readUInt32));
        if (initIconConfigCallback != null) {
            initIconConfigCallback.complete();
            this.initIconConfigCallbackMap.remove(java.lang.Integer.valueOf(readUInt32));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void __OnStatusCommentChangeEvent(com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
        this.statusCommentChangeEventMap.size();
        int readUInt32 = invokerCodecDecoder.readUInt32();
        int readUInt322 = invokerCodecDecoder.readUInt32();
        bw5.pl0 pl0Var = (bw5.pl0) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(bw5.pl0.f31726x, invokerCodecDecoder.readBytes());
        for (java.util.Map.Entry<java.lang.String, com.tencent.wechat.aff.status.StatusStorageManager.StatusCommentChangeEvent> entry : this.statusCommentChangeEventMap.entrySet()) {
            entry.getKey();
            entry.getValue().event(readUInt32, readUInt322, pl0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void __OnStatusInfoChangeEvent(com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
        this.statusInfoChangeEventMap.size();
        int readUInt32 = invokerCodecDecoder.readUInt32();
        int readUInt322 = invokerCodecDecoder.readUInt32();
        bw5.sm0 sm0Var = (bw5.sm0) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(bw5.sm0.f33050u, invokerCodecDecoder.readBytes());
        for (java.util.Map.Entry<java.lang.String, com.tencent.wechat.aff.status.StatusStorageManager.StatusInfoChangeEvent> entry : this.statusInfoChangeEventMap.entrySet()) {
            entry.getKey();
            entry.getValue().event(readUInt32, readUInt322, sm0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void __OncleanExpireDBComplete(com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
        int readUInt32 = invokerCodecDecoder.readUInt32();
        com.tencent.wechat.aff.status.StatusStorageManager.cleanExpireDBCallback cleanexpiredbcallback = this.cleanExpireDBCallbackMap.get(java.lang.Integer.valueOf(readUInt32));
        if (cleanexpiredbcallback != null) {
            cleanexpiredbcallback.complete((bw5.um0) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(bw5.um0.f33983i, invokerCodecDecoder.readBytes()));
            this.cleanExpireDBCallbackMap.remove(java.lang.Integer.valueOf(readUInt32));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void __OntestComplete(com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
        int readUInt32 = invokerCodecDecoder.readUInt32();
        com.tencent.wechat.aff.status.StatusStorageManager.testCallback testcallback = this.testCallbackMap.get(java.lang.Integer.valueOf(readUInt32));
        if (testcallback != null) {
            testcallback.complete(invokerCodecDecoder.readInt32());
            this.testCallbackMap.remove(java.lang.Integer.valueOf(readUInt32));
        }
    }

    public static com.tencent.wechat.aff.status.StatusStorageManager getInstance() {
        return instance;
    }

    public void cleanExpireDBAsync(long j17, boolean z17, boolean z18, com.tencent.wechat.aff.status.StatusStorageManager.cleanExpireDBCallback cleanexpiredbcallback) {
        try {
            int GenTaskId = (int) this.taskIdConvertor.GenTaskId();
            if (cleanexpiredbcallback != null) {
                this.cleanExpireDBCallbackMap.put(java.lang.Integer.valueOf(GenTaskId), cleanexpiredbcallback);
            }
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("cleanExpireDB");
            invokerCodecEncoder.writeUInt32(GenTaskId);
            invokerCodecEncoder.writeInt64(j17);
            invokerCodecEncoder.writeBoolean(z17);
            invokerCodecEncoder.writeBoolean(z18);
            invoke(invokerCodecEncoder.getByteBuffer());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("StatusStorageManager.cleanExpireDB failed", e17);
        }
    }

    public void constructStatusInfoCache() {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("constructStatusInfoCache");
            invoke(invokerCodecEncoder.getByteBuffer());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("StatusStorageManager.constructStatusInfoCache failed", e17);
        }
    }

    public bw5.um0 deleteLocalPublishStatusInfo(bw5.sm0 sm0Var) {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("DeleteLocalPublishStatusInfo");
            invokerCodecEncoder.writeBytes(com.tencent.wechat.zidl2.ZidlUtil.mmpbSerialize(sm0Var));
            return (bw5.um0) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(bw5.um0.f33983i, new com.tencent.wechat.zidl2.InvokerCodecDecoder(invoke(invokerCodecEncoder.getByteBuffer())).readBytes());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("StatusStorageManager.deleteLocalPublishStatusInfo failed", e17);
        }
    }

    public bw5.um0 deleteStatusInfoWithId(java.lang.String str, int i17) {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("deleteStatusInfoWithId");
            invokerCodecEncoder.writeString(str);
            invokerCodecEncoder.writeUInt32(i17);
            return (bw5.um0) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(bw5.um0.f33983i, new com.tencent.wechat.zidl2.InvokerCodecDecoder(invoke(invokerCodecEncoder.getByteBuffer())).readBytes());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("StatusStorageManager.deleteStatusInfoWithId failed", e17);
        }
    }

    public bw5.um0 deleteStatusInfoWithUsername(java.lang.String str, int i17) {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("deleteStatusInfoWithUsername");
            invokerCodecEncoder.writeString(str);
            invokerCodecEncoder.writeUInt32(i17);
            return (bw5.um0) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(bw5.um0.f33983i, new com.tencent.wechat.zidl2.InvokerCodecDecoder(invoke(invokerCodecEncoder.getByteBuffer())).readBytes());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("StatusStorageManager.deleteStatusInfoWithUsername failed", e17);
        }
    }

    public bw5.um0 deleteTempStatusInfo(java.lang.String str, long j17, int i17) {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("deleteTempStatusInfo");
            invokerCodecEncoder.writeString(str);
            invokerCodecEncoder.writeInt64(j17);
            invokerCodecEncoder.writeUInt32(i17);
            return (bw5.um0) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(bw5.um0.f33983i, new com.tencent.wechat.zidl2.InvokerCodecDecoder(invoke(invokerCodecEncoder.getByteBuffer())).readBytes());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("StatusStorageManager.deleteTempStatusInfo failed", e17);
        }
    }

    public bw5.um0 getAllCacheStatsInfo() {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("getAllCacheStatsInfo");
            return (bw5.um0) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(bw5.um0.f33983i, new com.tencent.wechat.zidl2.InvokerCodecDecoder(invoke(invokerCodecEncoder.getByteBuffer())).readBytes());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("StatusStorageManager.getAllCacheStatsInfo failed", e17);
        }
    }

    public int getKV(java.lang.String str, int i17) {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("getKV");
            invokerCodecEncoder.writeString(str);
            invokerCodecEncoder.writeInt32(i17);
            return new com.tencent.wechat.zidl2.InvokerCodecDecoder(invoke(invokerCodecEncoder.getByteBuffer())).readInt32();
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("StatusStorageManager.getKV failed", e17);
        }
    }

    public void init(java.lang.String str, java.lang.String str2, int i17, boolean z17, java.lang.String str3) {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
            invokerCodecEncoder.writeString(str);
            invokerCodecEncoder.writeString(str2);
            invokerCodecEncoder.writeUInt32(i17);
            invokerCodecEncoder.writeBoolean(z17);
            invokerCodecEncoder.writeString(str3);
            invoke(invokerCodecEncoder.getByteBuffer());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("StatusStorageManager.init failed", e17);
        }
    }

    public void initIconConfigAsync(bw5.pm0 pm0Var, com.tencent.wechat.aff.status.StatusStorageManager.InitIconConfigCallback initIconConfigCallback) {
        try {
            int GenTaskId = (int) this.taskIdConvertor.GenTaskId();
            if (initIconConfigCallback != null) {
                this.initIconConfigCallbackMap.put(java.lang.Integer.valueOf(GenTaskId), initIconConfigCallback);
            }
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("InitIconConfig");
            invokerCodecEncoder.writeUInt32(GenTaskId);
            invokerCodecEncoder.writeBytes(com.tencent.wechat.zidl2.ZidlUtil.mmpbSerialize(pm0Var));
            invoke(invokerCodecEncoder.getByteBuffer());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("StatusStorageManager.initIconConfig failed", e17);
        }
    }

    public bw5.um0 insertOrReplaceInfo(bw5.sm0 sm0Var) {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("insertOrReplaceInfo");
            invokerCodecEncoder.writeBytes(com.tencent.wechat.zidl2.ZidlUtil.mmpbSerialize(sm0Var));
            return (bw5.um0) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(bw5.um0.f33983i, new com.tencent.wechat.zidl2.InvokerCodecDecoder(invoke(invokerCodecEncoder.getByteBuffer())).readBytes());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("StatusStorageManager.insertOrReplaceInfo failed", e17);
        }
    }

    public boolean markReadUserLatestStatus(java.lang.String str) {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("MarkReadUserLatestStatus");
            invokerCodecEncoder.writeString(str);
            return new com.tencent.wechat.zidl2.InvokerCodecDecoder(invoke(invokerCodecEncoder.getByteBuffer())).readBoolean();
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("StatusStorageManager.markReadUserLatestStatus failed", e17);
        }
    }

    public bw5.um0 selectStatusInfo(bw5.tm0 tm0Var) {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("selectStatusInfo");
            invokerCodecEncoder.writeBytes(com.tencent.wechat.zidl2.ZidlUtil.mmpbSerialize(tm0Var));
            return (bw5.um0) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(bw5.um0.f33983i, new com.tencent.wechat.zidl2.InvokerCodecDecoder(invoke(invokerCodecEncoder.getByteBuffer())).readBytes());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("StatusStorageManager.selectStatusInfo failed", e17);
        }
    }

    public bw5.um0 selectStatusInfoWithId(java.lang.String str) {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("selectStatusInfoWithId");
            invokerCodecEncoder.writeString(str);
            return (bw5.um0) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(bw5.um0.f33983i, new com.tencent.wechat.zidl2.InvokerCodecDecoder(invoke(invokerCodecEncoder.getByteBuffer())).readBytes());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("StatusStorageManager.selectStatusInfoWithId failed", e17);
        }
    }

    public bw5.um0 selectStatusInfoWithUsername(java.lang.String str, int i17, int i18, long j17) {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("selectStatusInfoWithUsername");
            invokerCodecEncoder.writeString(str);
            invokerCodecEncoder.writeInt32(i17);
            invokerCodecEncoder.writeInt32(i18);
            invokerCodecEncoder.writeInt64(j17);
            return (bw5.um0) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(bw5.um0.f33983i, new com.tencent.wechat.zidl2.InvokerCodecDecoder(invoke(invokerCodecEncoder.getByteBuffer())).readBytes());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("StatusStorageManager.selectStatusInfoWithUsername failed", e17);
        }
    }

    public boolean setKV(java.lang.String str, int i17) {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("setKV");
            invokerCodecEncoder.writeString(str);
            invokerCodecEncoder.writeInt32(i17);
            return new com.tencent.wechat.zidl2.InvokerCodecDecoder(invoke(invokerCodecEncoder.getByteBuffer())).readBoolean();
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("StatusStorageManager.setKV failed", e17);
        }
    }

    public void subscribeStatusCommentChangeEvent(java.lang.String str, com.tencent.wechat.aff.status.StatusStorageManager.StatusCommentChangeEvent statusCommentChangeEvent) {
        this.statusCommentChangeEventMap.put(str, statusCommentChangeEvent);
    }

    public void subscribeStatusInfoChangeEvent(java.lang.String str, com.tencent.wechat.aff.status.StatusStorageManager.StatusInfoChangeEvent statusInfoChangeEvent) {
        this.statusInfoChangeEventMap.put(str, statusInfoChangeEvent);
    }

    public void testAsync(java.lang.String str, com.tencent.wechat.aff.status.StatusStorageManager.testCallback testcallback) {
        try {
            int GenTaskId = (int) this.taskIdConvertor.GenTaskId();
            if (testcallback != null) {
                this.testCallbackMap.put(java.lang.Integer.valueOf(GenTaskId), testcallback);
            }
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("test");
            invokerCodecEncoder.writeUInt32(GenTaskId);
            invokerCodecEncoder.writeString(str);
            invoke(invokerCodecEncoder.getByteBuffer());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("StatusStorageManager.test failed", e17);
        }
    }

    public void unSubscribeStatusCommentChangeEvent(java.lang.String str) {
        this.statusCommentChangeEventMap.remove(str);
    }

    public void unSubscribeStatusInfoChangeEvent(java.lang.String str) {
        this.statusInfoChangeEventMap.remove(str);
    }

    public void updateConfig(java.lang.String str) {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("updateConfig");
            invokerCodecEncoder.writeString(str);
            invoke(invokerCodecEncoder.getByteBuffer());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("StatusStorageManager.updateConfig failed", e17);
        }
    }

    public bw5.um0 updateStatusInteractData(java.lang.String str, bw5.vm0 vm0Var) {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("updateStatusInteractData");
            invokerCodecEncoder.writeString(str);
            invokerCodecEncoder.writeBytes(com.tencent.wechat.zidl2.ZidlUtil.mmpbSerialize(vm0Var));
            return (bw5.um0) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(bw5.um0.f33983i, new com.tencent.wechat.zidl2.InvokerCodecDecoder(invoke(invokerCodecEncoder.getByteBuffer())).readBytes());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("StatusStorageManager.updateStatusInteractData failed", e17);
        }
    }

    public bw5.um0 updateStatusPrivateData(java.lang.String str, bw5.gi0 gi0Var) {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("updateStatusPrivateData");
            invokerCodecEncoder.writeString(str);
            invokerCodecEncoder.writeBytes(com.tencent.wechat.zidl2.ZidlUtil.mmpbSerialize(gi0Var));
            return (bw5.um0) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(bw5.um0.f33983i, new com.tencent.wechat.zidl2.InvokerCodecDecoder(invoke(invokerCodecEncoder.getByteBuffer())).readBytes());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("StatusStorageManager.updateStatusPrivateData failed", e17);
        }
    }
}
