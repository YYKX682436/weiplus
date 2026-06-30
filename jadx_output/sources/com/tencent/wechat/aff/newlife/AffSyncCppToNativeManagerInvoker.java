package com.tencent.wechat.aff.newlife;

/* loaded from: classes16.dex */
public class AffSyncCppToNativeManagerInvoker extends com.tencent.wechat.zidl2.ServerInvoker {
    private com.tencent.wechat.aff.newlife.AffSyncCppToNativeManagerBase stub;

    public AffSyncCppToNativeManagerInvoker() {
        this.methodInvokeDispatcher.put("debugInfo", new com.tencent.wechat.zidl2.ServerInvoker.InvokerInterface() { // from class: aw5.g$$a
            @Override // com.tencent.wechat.zidl2.ServerInvoker.InvokerInterface
            public final java.nio.ByteBuffer invoke(java.lang.String str, com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
                java.nio.ByteBuffer __debugInfo;
                __debugInfo = com.tencent.wechat.aff.newlife.AffSyncCppToNativeManagerInvoker.this.__debugInfo(str, invokerCodecDecoder);
                return __debugInfo;
            }
        });
        this.methodInvokeDispatcher.put("debugSwitchInfo", new com.tencent.wechat.zidl2.ServerInvoker.InvokerInterface() { // from class: aw5.g$$d
            @Override // com.tencent.wechat.zidl2.ServerInvoker.InvokerInterface
            public final java.nio.ByteBuffer invoke(java.lang.String str, com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
                java.nio.ByteBuffer __debugSwitchInfo;
                __debugSwitchInfo = com.tencent.wechat.aff.newlife.AffSyncCppToNativeManagerInvoker.this.__debugSwitchInfo(str, invokerCodecDecoder);
                return __debugSwitchInfo;
            }
        });
        this.methodInvokeDispatcher.put("handleCmd", new com.tencent.wechat.zidl2.ServerInvoker.InvokerInterface() { // from class: aw5.g$$e
            @Override // com.tencent.wechat.zidl2.ServerInvoker.InvokerInterface
            public final java.nio.ByteBuffer invoke(java.lang.String str, com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
                java.nio.ByteBuffer __handleCmd;
                __handleCmd = com.tencent.wechat.aff.newlife.AffSyncCppToNativeManagerInvoker.this.__handleCmd(str, invokerCodecDecoder);
                return __handleCmd;
            }
        });
        this.methodInvokeDispatcher.put("enableSync", new com.tencent.wechat.zidl2.ServerInvoker.InvokerInterface() { // from class: aw5.g$$f
            @Override // com.tencent.wechat.zidl2.ServerInvoker.InvokerInterface
            public final java.nio.ByteBuffer invoke(java.lang.String str, com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
                java.nio.ByteBuffer __enableSync;
                __enableSync = com.tencent.wechat.aff.newlife.AffSyncCppToNativeManagerInvoker.this.__enableSync(str, invokerCodecDecoder);
                return __enableSync;
            }
        });
        this.methodInvokeDispatcher.put("getConfigSyncKeyPathList", new com.tencent.wechat.zidl2.ServerInvoker.InvokerInterface() { // from class: aw5.g$$g
            @Override // com.tencent.wechat.zidl2.ServerInvoker.InvokerInterface
            public final java.nio.ByteBuffer invoke(java.lang.String str, com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
                java.nio.ByteBuffer __getConfigSyncKeyPathList;
                __getConfigSyncKeyPathList = com.tencent.wechat.aff.newlife.AffSyncCppToNativeManagerInvoker.this.__getConfigSyncKeyPathList(str, invokerCodecDecoder);
                return __getConfigSyncKeyPathList;
            }
        });
        this.methodInvokeDispatcher.put("getNewLifeRequestSyncResult", new com.tencent.wechat.zidl2.ServerInvoker.InvokerInterface() { // from class: aw5.g$$h
            @Override // com.tencent.wechat.zidl2.ServerInvoker.InvokerInterface
            public final java.nio.ByteBuffer invoke(java.lang.String str, com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
                java.nio.ByteBuffer __getNewLifeRequestSyncResult;
                __getNewLifeRequestSyncResult = com.tencent.wechat.aff.newlife.AffSyncCppToNativeManagerInvoker.this.__getNewLifeRequestSyncResult(str, invokerCodecDecoder);
                return __getNewLifeRequestSyncResult;
            }
        });
        this.methodInvokeDispatcher.put("getWebSearchRequestSyncConfig", new com.tencent.wechat.zidl2.ServerInvoker.InvokerInterface() { // from class: aw5.g$$i
            @Override // com.tencent.wechat.zidl2.ServerInvoker.InvokerInterface
            public final java.nio.ByteBuffer invoke(java.lang.String str, com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
                java.nio.ByteBuffer __getWebSearchRequestSyncConfig;
                __getWebSearchRequestSyncConfig = com.tencent.wechat.aff.newlife.AffSyncCppToNativeManagerInvoker.this.__getWebSearchRequestSyncConfig(str, invokerCodecDecoder);
                return __getWebSearchRequestSyncConfig;
            }
        });
        this.methodInvokeDispatcher.put("isShowLookOneLookEntry", new com.tencent.wechat.zidl2.ServerInvoker.InvokerInterface() { // from class: aw5.g$$j
            @Override // com.tencent.wechat.zidl2.ServerInvoker.InvokerInterface
            public final java.nio.ByteBuffer invoke(java.lang.String str, com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
                java.nio.ByteBuffer __isShowLookOneLookEntry;
                __isShowLookOneLookEntry = com.tencent.wechat.aff.newlife.AffSyncCppToNativeManagerInvoker.this.__isShowLookOneLookEntry(str, invokerCodecDecoder);
                return __isShowLookOneLookEntry;
            }
        });
        this.methodInvokeDispatcher.put("isShowWebSearchEntry", new com.tencent.wechat.zidl2.ServerInvoker.InvokerInterface() { // from class: aw5.g$$k
            @Override // com.tencent.wechat.zidl2.ServerInvoker.InvokerInterface
            public final java.nio.ByteBuffer invoke(java.lang.String str, com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
                java.nio.ByteBuffer __isShowWebSearchEntry;
                __isShowWebSearchEntry = com.tencent.wechat.aff.newlife.AffSyncCppToNativeManagerInvoker.this.__isShowWebSearchEntry(str, invokerCodecDecoder);
                return __isShowWebSearchEntry;
            }
        });
        this.methodInvokeDispatcher.put("mergeSyncKey", new com.tencent.wechat.zidl2.ServerInvoker.InvokerInterface() { // from class: aw5.g$$b
            @Override // com.tencent.wechat.zidl2.ServerInvoker.InvokerInterface
            public final java.nio.ByteBuffer invoke(java.lang.String str, com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
                java.nio.ByteBuffer __mergeSyncKey;
                __mergeSyncKey = com.tencent.wechat.aff.newlife.AffSyncCppToNativeManagerInvoker.this.__mergeSyncKey(str, invokerCodecDecoder);
                return __mergeSyncKey;
            }
        });
        this.methodInvokeDispatcher.put("getLiteAppVersionInfo", new com.tencent.wechat.zidl2.ServerInvoker.InvokerInterface() { // from class: aw5.g$$c
            @Override // com.tencent.wechat.zidl2.ServerInvoker.InvokerInterface
            public final java.nio.ByteBuffer invoke(java.lang.String str, com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
                java.nio.ByteBuffer __getLiteAppVersionInfo;
                __getLiteAppVersionInfo = com.tencent.wechat.aff.newlife.AffSyncCppToNativeManagerInvoker.this.__getLiteAppVersionInfo(str, invokerCodecDecoder);
                return __getLiteAppVersionInfo;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.nio.ByteBuffer __debugInfo(java.lang.String str, com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
        java.lang.String debugInfo = this.stub.debugInfo((com.tencent.wechat.aff.newlife.NewLifeSyncRequest) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.wechat.aff.newlife.NewLifeSyncRequest.getDefaultInstance(), invokerCodecDecoder.readBytes()));
        com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
        invokerCodecEncoder.writeString(debugInfo);
        return invokerCodecEncoder.getByteBuffer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.nio.ByteBuffer __debugSwitchInfo(java.lang.String str, com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
        java.lang.String debugSwitchInfo = this.stub.debugSwitchInfo((com.tencent.wechat.aff.newlife.EntranceReportSwitch) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.wechat.aff.newlife.EntranceReportSwitch.getDefaultInstance(), invokerCodecDecoder.readBytes()));
        com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
        invokerCodecEncoder.writeString(debugSwitchInfo);
        return invokerCodecEncoder.getByteBuffer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.nio.ByteBuffer __enableSync(java.lang.String str, com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
        boolean enableSync = this.stub.enableSync(invokerCodecDecoder.readUInt32(), invokerCodecDecoder.readUInt32());
        com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
        invokerCodecEncoder.writeBoolean(enableSync);
        return invokerCodecEncoder.getByteBuffer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.nio.ByteBuffer __getConfigSyncKeyPathList(java.lang.String str, com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
        java.util.ArrayList<java.lang.String> configSyncKeyPathList = this.stub.getConfigSyncKeyPathList(invokerCodecDecoder.readUInt32());
        com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
        invokerCodecEncoder.writeStringList(configSyncKeyPathList);
        return invokerCodecEncoder.getByteBuffer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.nio.ByteBuffer __getLiteAppVersionInfo(java.lang.String str, com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
        com.tencent.wechat.aff.newlife.SearchSyncClientCustomInfo liteAppVersionInfo = this.stub.getLiteAppVersionInfo();
        com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
        invokerCodecEncoder.writeBytes(com.tencent.wechat.zidl2.ZidlUtil.mmpbSerialize(liteAppVersionInfo));
        return invokerCodecEncoder.getByteBuffer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.nio.ByteBuffer __getNewLifeRequestSyncResult(java.lang.String str, com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
        com.tencent.wechat.aff.newlife.NewLifeRequestSyncActionResult newLifeRequestSyncResult = this.stub.getNewLifeRequestSyncResult();
        com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
        invokerCodecEncoder.writeBytes(com.tencent.wechat.zidl2.ZidlUtil.mmpbSerialize(newLifeRequestSyncResult));
        return invokerCodecEncoder.getByteBuffer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.nio.ByteBuffer __getWebSearchRequestSyncConfig(java.lang.String str, com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
        com.tencent.wechat.aff.newlife.WebSearchRequestSyncConfig webSearchRequestSyncConfig = this.stub.getWebSearchRequestSyncConfig();
        com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
        invokerCodecEncoder.writeBytes(com.tencent.wechat.zidl2.ZidlUtil.mmpbSerialize(webSearchRequestSyncConfig));
        return invokerCodecEncoder.getByteBuffer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.nio.ByteBuffer __handleCmd(java.lang.String str, com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
        this.stub.handleCmd(invokerCodecDecoder.readUInt32(), (com.tencent.wechat.aff.newlife.FinderCmdItem) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.wechat.aff.newlife.FinderCmdItem.getDefaultInstance(), invokerCodecDecoder.readBytes()), invokerCodecDecoder.readUInt32(), invokerCodecDecoder.readBoolean());
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.nio.ByteBuffer __isShowLookOneLookEntry(java.lang.String str, com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
        boolean isShowLookOneLookEntry = this.stub.isShowLookOneLookEntry();
        com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
        invokerCodecEncoder.writeBoolean(isShowLookOneLookEntry);
        return invokerCodecEncoder.getByteBuffer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.nio.ByteBuffer __isShowWebSearchEntry(java.lang.String str, com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
        boolean isShowWebSearchEntry = this.stub.isShowWebSearchEntry();
        com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
        invokerCodecEncoder.writeBoolean(isShowWebSearchEntry);
        return invokerCodecEncoder.getByteBuffer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.nio.ByteBuffer __mergeSyncKey(java.lang.String str, com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
        java.lang.String mergeSyncKey = this.stub.mergeSyncKey(invokerCodecDecoder.readString(), invokerCodecDecoder.readString());
        com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
        invokerCodecEncoder.writeString(mergeSyncKey);
        return invokerCodecEncoder.getByteBuffer();
    }

    @Override // com.tencent.wechat.zidl2.ServerInvoker
    public void attachStub(java.lang.Object obj) {
        this.stub = (com.tencent.wechat.aff.newlife.AffSyncCppToNativeManagerBase) obj;
    }
}
