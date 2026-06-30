package com.tencent.wechat.aff.finder;

/* loaded from: classes16.dex */
public class AffFinderProviderInvoker extends com.tencent.wechat.zidl2.ServerInvoker implements com.tencent.wechat.aff.finder.AffFinderProviderBase.Callback {
    private com.tencent.wechat.aff.finder.AffFinderProviderBase stub;

    public AffFinderProviderInvoker() {
        this.methodInvokeDispatcher.put("finderGetCurrentUsername", new com.tencent.wechat.zidl2.ServerInvoker.InvokerInterface() { // from class: yv5.a$$a
            @Override // com.tencent.wechat.zidl2.ServerInvoker.InvokerInterface
            public final java.nio.ByteBuffer invoke(java.lang.String str, com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
                java.nio.ByteBuffer __finderGetCurrentUsername;
                __finderGetCurrentUsername = com.tencent.wechat.aff.finder.AffFinderProviderInvoker.this.__finderGetCurrentUsername(str, invokerCodecDecoder);
                return __finderGetCurrentUsername;
            }
        });
        this.methodInvokeDispatcher.put("curTabSessionID", new com.tencent.wechat.zidl2.ServerInvoker.InvokerInterface() { // from class: yv5.a$$c
            @Override // com.tencent.wechat.zidl2.ServerInvoker.InvokerInterface
            public final java.nio.ByteBuffer invoke(java.lang.String str, com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
                java.nio.ByteBuffer __curTabSessionID;
                __curTabSessionID = com.tencent.wechat.aff.finder.AffFinderProviderInvoker.this.__curTabSessionID(str, invokerCodecDecoder);
                return __curTabSessionID;
            }
        });
        this.methodInvokeDispatcher.put("curContextID", new com.tencent.wechat.zidl2.ServerInvoker.InvokerInterface() { // from class: yv5.a$$h
            @Override // com.tencent.wechat.zidl2.ServerInvoker.InvokerInterface
            public final java.nio.ByteBuffer invoke(java.lang.String str, com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
                java.nio.ByteBuffer __curContextID;
                __curContextID = com.tencent.wechat.aff.finder.AffFinderProviderInvoker.this.__curContextID(str, invokerCodecDecoder);
                return __curContextID;
            }
        });
        this.methodInvokeDispatcher.put("finderGetCGIBaseRequest", new com.tencent.wechat.zidl2.ServerInvoker.InvokerInterface() { // from class: yv5.a$$i
            @Override // com.tencent.wechat.zidl2.ServerInvoker.InvokerInterface
            public final java.nio.ByteBuffer invoke(java.lang.String str, com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
                java.nio.ByteBuffer __finderGetCGIBaseRequest;
                __finderGetCGIBaseRequest = com.tencent.wechat.aff.finder.AffFinderProviderInvoker.this.__finderGetCGIBaseRequest(str, invokerCodecDecoder);
                return __finderGetCGIBaseRequest;
            }
        });
        this.methodInvokeDispatcher.put("finderRedDotWillAddAction", new com.tencent.wechat.zidl2.ServerInvoker.InvokerInterface() { // from class: yv5.a$$j
            @Override // com.tencent.wechat.zidl2.ServerInvoker.InvokerInterface
            public final java.nio.ByteBuffer invoke(java.lang.String str, com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
                java.nio.ByteBuffer __finderRedDotWillAddAction;
                __finderRedDotWillAddAction = com.tencent.wechat.aff.finder.AffFinderProviderInvoker.this.__finderRedDotWillAddAction(str, invokerCodecDecoder);
                return __finderRedDotWillAddAction;
            }
        });
        this.methodInvokeDispatcher.put("finderRedDotHasAddAction", new com.tencent.wechat.zidl2.ServerInvoker.InvokerInterface() { // from class: yv5.a$$k
            @Override // com.tencent.wechat.zidl2.ServerInvoker.InvokerInterface
            public final java.nio.ByteBuffer invoke(java.lang.String str, com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
                java.nio.ByteBuffer __finderRedDotHasAddActionAsync;
                __finderRedDotHasAddActionAsync = com.tencent.wechat.aff.finder.AffFinderProviderInvoker.this.__finderRedDotHasAddActionAsync(str, invokerCodecDecoder);
                return __finderRedDotHasAddActionAsync;
            }
        });
        this.methodInvokeDispatcher.put("finderRedDotWillDisposeAction", new com.tencent.wechat.zidl2.ServerInvoker.InvokerInterface() { // from class: yv5.a$$m
            @Override // com.tencent.wechat.zidl2.ServerInvoker.InvokerInterface
            public final java.nio.ByteBuffer invoke(java.lang.String str, com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
                java.nio.ByteBuffer __finderRedDotWillDisposeAction;
                __finderRedDotWillDisposeAction = com.tencent.wechat.aff.finder.AffFinderProviderInvoker.this.__finderRedDotWillDisposeAction(str, invokerCodecDecoder);
                return __finderRedDotWillDisposeAction;
            }
        });
        this.methodInvokeDispatcher.put("finderRedDotHasDisposeAction", new com.tencent.wechat.zidl2.ServerInvoker.InvokerInterface() { // from class: yv5.a$$n
            @Override // com.tencent.wechat.zidl2.ServerInvoker.InvokerInterface
            public final java.nio.ByteBuffer invoke(java.lang.String str, com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
                java.nio.ByteBuffer __finderRedDotHasDisposeActionAsync;
                __finderRedDotHasDisposeActionAsync = com.tencent.wechat.aff.finder.AffFinderProviderInvoker.this.__finderRedDotHasDisposeActionAsync(str, invokerCodecDecoder);
                return __finderRedDotHasDisposeActionAsync;
            }
        });
        this.methodInvokeDispatcher.put("finderRedDotEnableUseCtrlInfoInNMStrategy", new com.tencent.wechat.zidl2.ServerInvoker.InvokerInterface() { // from class: yv5.a$$o
            @Override // com.tencent.wechat.zidl2.ServerInvoker.InvokerInterface
            public final java.nio.ByteBuffer invoke(java.lang.String str, com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
                java.nio.ByteBuffer __finderRedDotEnableUseCtrlInfoInNMStrategy;
                __finderRedDotEnableUseCtrlInfoInNMStrategy = com.tencent.wechat.aff.finder.AffFinderProviderInvoker.this.__finderRedDotEnableUseCtrlInfoInNMStrategy(str, invokerCodecDecoder);
                return __finderRedDotEnableUseCtrlInfoInNMStrategy;
            }
        });
        this.methodInvokeDispatcher.put("finderRedDotDataReceiveWithPathKey", new com.tencent.wechat.zidl2.ServerInvoker.InvokerInterface() { // from class: yv5.a$$p
            @Override // com.tencent.wechat.zidl2.ServerInvoker.InvokerInterface
            public final java.nio.ByteBuffer invoke(java.lang.String str, com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
                java.nio.ByteBuffer __finderRedDotDataReceiveWithPathKey;
                __finderRedDotDataReceiveWithPathKey = com.tencent.wechat.aff.finder.AffFinderProviderInvoker.this.__finderRedDotDataReceiveWithPathKey(str, invokerCodecDecoder);
                return __finderRedDotDataReceiveWithPathKey;
            }
        });
        this.methodInvokeDispatcher.put("finderRedDotDataChangedWithPathKey", new com.tencent.wechat.zidl2.ServerInvoker.InvokerInterface() { // from class: yv5.a$$l
            @Override // com.tencent.wechat.zidl2.ServerInvoker.InvokerInterface
            public final java.nio.ByteBuffer invoke(java.lang.String str, com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
                java.nio.ByteBuffer __finderRedDotDataChangedWithPathKey;
                __finderRedDotDataChangedWithPathKey = com.tencent.wechat.aff.finder.AffFinderProviderInvoker.this.__finderRedDotDataChangedWithPathKey(str, invokerCodecDecoder);
                return __finderRedDotDataChangedWithPathKey;
            }
        });
        this.methodInvokeDispatcher.put("finderRedDotDataRevokedWithPathKey", new com.tencent.wechat.zidl2.ServerInvoker.InvokerInterface() { // from class: yv5.a$$q
            @Override // com.tencent.wechat.zidl2.ServerInvoker.InvokerInterface
            public final java.nio.ByteBuffer invoke(java.lang.String str, com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
                java.nio.ByteBuffer __finderRedDotDataRevokedWithPathKey;
                __finderRedDotDataRevokedWithPathKey = com.tencent.wechat.aff.finder.AffFinderProviderInvoker.this.__finderRedDotDataRevokedWithPathKey(str, invokerCodecDecoder);
                return __finderRedDotDataRevokedWithPathKey;
            }
        });
        this.methodInvokeDispatcher.put("finderRedDotDataReceiveRedDotBindObjectPathKey", new com.tencent.wechat.zidl2.ServerInvoker.InvokerInterface() { // from class: yv5.a$$r
            @Override // com.tencent.wechat.zidl2.ServerInvoker.InvokerInterface
            public final java.nio.ByteBuffer invoke(java.lang.String str, com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
                java.nio.ByteBuffer __finderRedDotDataReceiveRedDotBindObjectPathKey;
                __finderRedDotDataReceiveRedDotBindObjectPathKey = com.tencent.wechat.aff.finder.AffFinderProviderInvoker.this.__finderRedDotDataReceiveRedDotBindObjectPathKey(str, invokerCodecDecoder);
                return __finderRedDotDataReceiveRedDotBindObjectPathKey;
            }
        });
        this.methodInvokeDispatcher.put("finderRedDotDataChangedAction", new com.tencent.wechat.zidl2.ServerInvoker.InvokerInterface() { // from class: yv5.a$$s
            @Override // com.tencent.wechat.zidl2.ServerInvoker.InvokerInterface
            public final java.nio.ByteBuffer invoke(java.lang.String str, com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
                java.nio.ByteBuffer __finderRedDotDataChangedActionAsync;
                __finderRedDotDataChangedActionAsync = com.tencent.wechat.aff.finder.AffFinderProviderInvoker.this.__finderRedDotDataChangedActionAsync(str, invokerCodecDecoder);
                return __finderRedDotDataChangedActionAsync;
            }
        });
        this.methodInvokeDispatcher.put("reddotPersonalExposeClearSwitch", new com.tencent.wechat.zidl2.ServerInvoker.InvokerInterface() { // from class: yv5.a$$t
            @Override // com.tencent.wechat.zidl2.ServerInvoker.InvokerInterface
            public final java.nio.ByteBuffer invoke(java.lang.String str, com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
                java.nio.ByteBuffer __reddotPersonalExposeClearSwitch;
                __reddotPersonalExposeClearSwitch = com.tencent.wechat.aff.finder.AffFinderProviderInvoker.this.__reddotPersonalExposeClearSwitch(str, invokerCodecDecoder);
                return __reddotPersonalExposeClearSwitch;
            }
        });
        this.methodInvokeDispatcher.put("getPrivateMsgTotalUnreadCountByUsername", new com.tencent.wechat.zidl2.ServerInvoker.InvokerInterface() { // from class: yv5.a$$u
            @Override // com.tencent.wechat.zidl2.ServerInvoker.InvokerInterface
            public final java.nio.ByteBuffer invoke(java.lang.String str, com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
                java.nio.ByteBuffer __getPrivateMsgTotalUnreadCountByUsername;
                __getPrivateMsgTotalUnreadCountByUsername = com.tencent.wechat.aff.finder.AffFinderProviderInvoker.this.__getPrivateMsgTotalUnreadCountByUsername(str, invokerCodecDecoder);
                return __getPrivateMsgTotalUnreadCountByUsername;
            }
        });
        this.methodInvokeDispatcher.put("getCurFinderUnreadCountByUsername", new com.tencent.wechat.zidl2.ServerInvoker.InvokerInterface() { // from class: yv5.a$$v
            @Override // com.tencent.wechat.zidl2.ServerInvoker.InvokerInterface
            public final java.nio.ByteBuffer invoke(java.lang.String str, com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
                java.nio.ByteBuffer __getCurFinderUnreadCountByUsername;
                __getCurFinderUnreadCountByUsername = com.tencent.wechat.aff.finder.AffFinderProviderInvoker.this.__getCurFinderUnreadCountByUsername(str, invokerCodecDecoder);
                return __getCurFinderUnreadCountByUsername;
            }
        });
        this.methodInvokeDispatcher.put("reddotWillRevokeTipsUuidArray", new com.tencent.wechat.zidl2.ServerInvoker.InvokerInterface() { // from class: yv5.a$$w
            @Override // com.tencent.wechat.zidl2.ServerInvoker.InvokerInterface
            public final java.nio.ByteBuffer invoke(java.lang.String str, com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
                java.nio.ByteBuffer __reddotWillRevokeTipsUuidArray;
                __reddotWillRevokeTipsUuidArray = com.tencent.wechat.aff.finder.AffFinderProviderInvoker.this.__reddotWillRevokeTipsUuidArray(str, invokerCodecDecoder);
                return __reddotWillRevokeTipsUuidArray;
            }
        });
        this.methodInvokeDispatcher.put("isRedDotMeetWithCondition", new com.tencent.wechat.zidl2.ServerInvoker.InvokerInterface() { // from class: yv5.a$$x
            @Override // com.tencent.wechat.zidl2.ServerInvoker.InvokerInterface
            public final java.nio.ByteBuffer invoke(java.lang.String str, com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
                java.nio.ByteBuffer __isRedDotMeetWithCondition;
                __isRedDotMeetWithCondition = com.tencent.wechat.aff.finder.AffFinderProviderInvoker.this.__isRedDotMeetWithCondition(str, invokerCodecDecoder);
                return __isRedDotMeetWithCondition;
            }
        });
        this.methodInvokeDispatcher.put("getContact", new com.tencent.wechat.zidl2.ServerInvoker.InvokerInterface() { // from class: yv5.a$$b
            @Override // com.tencent.wechat.zidl2.ServerInvoker.InvokerInterface
            public final java.nio.ByteBuffer invoke(java.lang.String str, com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
                java.nio.ByteBuffer __getContact;
                __getContact = com.tencent.wechat.aff.finder.AffFinderProviderInvoker.this.__getContact(str, invokerCodecDecoder);
                return __getContact;
            }
        });
        this.methodInvokeDispatcher.put("getLocalFinderObject", new com.tencent.wechat.zidl2.ServerInvoker.InvokerInterface() { // from class: yv5.a$$d
            @Override // com.tencent.wechat.zidl2.ServerInvoker.InvokerInterface
            public final java.nio.ByteBuffer invoke(java.lang.String str, com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
                java.nio.ByteBuffer __getLocalFinderObject;
                __getLocalFinderObject = com.tencent.wechat.aff.finder.AffFinderProviderInvoker.this.__getLocalFinderObject(str, invokerCodecDecoder);
                return __getLocalFinderObject;
            }
        });
        this.methodInvokeDispatcher.put("getFeedSessionBuffer", new com.tencent.wechat.zidl2.ServerInvoker.InvokerInterface() { // from class: yv5.a$$e
            @Override // com.tencent.wechat.zidl2.ServerInvoker.InvokerInterface
            public final java.nio.ByteBuffer invoke(java.lang.String str, com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
                java.nio.ByteBuffer __getFeedSessionBuffer;
                __getFeedSessionBuffer = com.tencent.wechat.aff.finder.AffFinderProviderInvoker.this.__getFeedSessionBuffer(str, invokerCodecDecoder);
                return __getFeedSessionBuffer;
            }
        });
        this.methodInvokeDispatcher.put("saveFinderObject", new com.tencent.wechat.zidl2.ServerInvoker.InvokerInterface() { // from class: yv5.a$$f
            @Override // com.tencent.wechat.zidl2.ServerInvoker.InvokerInterface
            public final java.nio.ByteBuffer invoke(java.lang.String str, com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
                java.nio.ByteBuffer __saveFinderObject;
                __saveFinderObject = com.tencent.wechat.aff.finder.AffFinderProviderInvoker.this.__saveFinderObject(str, invokerCodecDecoder);
                return __saveFinderObject;
            }
        });
        this.methodInvokeDispatcher.put("getCacheLocation", new com.tencent.wechat.zidl2.ServerInvoker.InvokerInterface() { // from class: yv5.a$$g
            @Override // com.tencent.wechat.zidl2.ServerInvoker.InvokerInterface
            public final java.nio.ByteBuffer invoke(java.lang.String str, com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
                java.nio.ByteBuffer __getCacheLocation;
                __getCacheLocation = com.tencent.wechat.aff.finder.AffFinderProviderInvoker.this.__getCacheLocation(str, invokerCodecDecoder);
                return __getCacheLocation;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.nio.ByteBuffer __curContextID(java.lang.String str, com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
        java.lang.String curContextID = this.stub.curContextID();
        com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
        invokerCodecEncoder.writeString(curContextID);
        return invokerCodecEncoder.getByteBuffer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.nio.ByteBuffer __curTabSessionID(java.lang.String str, com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
        java.lang.String curTabSessionID = this.stub.curTabSessionID();
        com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
        invokerCodecEncoder.writeString(curTabSessionID);
        return invokerCodecEncoder.getByteBuffer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.nio.ByteBuffer __finderGetCGIBaseRequest(java.lang.String str, com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
        bw5.sc finderGetCGIBaseRequest = this.stub.finderGetCGIBaseRequest(invokerCodecDecoder.readInt32(), invokerCodecDecoder.readInt32());
        com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
        invokerCodecEncoder.writeBytes(com.tencent.wechat.zidl2.ZidlUtil.mmpbSerialize(finderGetCGIBaseRequest));
        return invokerCodecEncoder.getByteBuffer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.nio.ByteBuffer __finderGetCurrentUsername(java.lang.String str, com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
        java.lang.String finderGetCurrentUsername = this.stub.finderGetCurrentUsername();
        com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
        invokerCodecEncoder.writeString(finderGetCurrentUsername);
        return invokerCodecEncoder.getByteBuffer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.nio.ByteBuffer __finderRedDotDataChangedActionAsync(java.lang.String str, com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
        long serverId = this.taskIdConvertor.toServerId(str, invokerCodecDecoder.readUInt64());
        com.tencent.wechat.aff.finder.AffFinderProviderBase affFinderProviderBase = this.stub;
        int readUInt32 = invokerCodecDecoder.readUInt32();
        int readUInt322 = invokerCodecDecoder.readUInt32();
        bw5.e0 e0Var = bw5.e0.f26671g;
        affFinderProviderBase.finderRedDotDataChangedActionAsync(serverId, readUInt32, readUInt322, (bw5.e0) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(e0Var, invokerCodecDecoder.readBytes()), (bw5.e0) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(e0Var, invokerCodecDecoder.readBytes()), invokerCodecDecoder.readString());
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.nio.ByteBuffer __finderRedDotDataChangedWithPathKey(java.lang.String str, com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
        this.stub.finderRedDotDataChangedWithPathKey(invokerCodecDecoder.readString());
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.nio.ByteBuffer __finderRedDotDataReceiveRedDotBindObjectPathKey(java.lang.String str, com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
        this.stub.finderRedDotDataReceiveRedDotBindObjectPathKey(invokerCodecDecoder.readString());
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.nio.ByteBuffer __finderRedDotDataReceiveWithPathKey(java.lang.String str, com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
        this.stub.finderRedDotDataReceiveWithPathKey(invokerCodecDecoder.readString(), invokerCodecDecoder.readBoolean());
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.nio.ByteBuffer __finderRedDotDataRevokedWithPathKey(java.lang.String str, com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
        this.stub.finderRedDotDataRevokedWithPathKey(invokerCodecDecoder.readString());
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.nio.ByteBuffer __finderRedDotEnableUseCtrlInfoInNMStrategy(java.lang.String str, com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
        boolean finderRedDotEnableUseCtrlInfoInNMStrategy = this.stub.finderRedDotEnableUseCtrlInfoInNMStrategy(invokerCodecDecoder.readString(), invokerCodecDecoder.readBoolean(), (bw5.e0) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(bw5.e0.f26671g, invokerCodecDecoder.readBytes()));
        com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
        invokerCodecEncoder.writeBoolean(finderRedDotEnableUseCtrlInfoInNMStrategy);
        return invokerCodecEncoder.getByteBuffer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.nio.ByteBuffer __finderRedDotHasAddActionAsync(java.lang.String str, com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
        this.stub.finderRedDotHasAddActionAsync(this.taskIdConvertor.toServerId(str, invokerCodecDecoder.readUInt64()), (bw5.e0) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(bw5.e0.f26671g, invokerCodecDecoder.readBytes()));
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.nio.ByteBuffer __finderRedDotHasDisposeActionAsync(java.lang.String str, com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
        this.stub.finderRedDotHasDisposeActionAsync(this.taskIdConvertor.toServerId(str, invokerCodecDecoder.readUInt64()), invokerCodecDecoder.readString(), (bw5.e0) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(bw5.e0.f26671g, invokerCodecDecoder.readBytes()));
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.nio.ByteBuffer __finderRedDotWillAddAction(java.lang.String str, com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
        boolean finderRedDotWillAddAction = this.stub.finderRedDotWillAddAction((bw5.e0) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(bw5.e0.f26671g, invokerCodecDecoder.readBytes()));
        com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
        invokerCodecEncoder.writeBoolean(finderRedDotWillAddAction);
        return invokerCodecEncoder.getByteBuffer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.nio.ByteBuffer __finderRedDotWillDisposeAction(java.lang.String str, com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
        boolean finderRedDotWillDisposeAction = this.stub.finderRedDotWillDisposeAction(invokerCodecDecoder.readString());
        com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
        invokerCodecEncoder.writeBoolean(finderRedDotWillDisposeAction);
        return invokerCodecEncoder.getByteBuffer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.nio.ByteBuffer __getCacheLocation(java.lang.String str, com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
        bw5.tj cacheLocation = this.stub.getCacheLocation();
        com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
        invokerCodecEncoder.writeBytes(com.tencent.wechat.zidl2.ZidlUtil.mmpbSerialize(cacheLocation));
        return invokerCodecEncoder.getByteBuffer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.nio.ByteBuffer __getContact(java.lang.String str, com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
        java.util.ArrayList<bw5.ae> contact = this.stub.getContact(invokerCodecDecoder.readString());
        com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
        invokerCodecEncoder.writeBytesList(com.tencent.wechat.zidl2.ZidlUtil.mmpbSerialize(contact));
        return invokerCodecEncoder.getByteBuffer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.nio.ByteBuffer __getCurFinderUnreadCountByUsername(java.lang.String str, com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
        int curFinderUnreadCountByUsername = this.stub.getCurFinderUnreadCountByUsername(invokerCodecDecoder.readString(), invokerCodecDecoder.readBoolean(), invokerCodecDecoder.readUInt32(), invokerCodecDecoder.readUInt32());
        com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
        invokerCodecEncoder.writeUInt32(curFinderUnreadCountByUsername);
        return invokerCodecEncoder.getByteBuffer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.nio.ByteBuffer __getFeedSessionBuffer(java.lang.String str, com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
        java.lang.String feedSessionBuffer = this.stub.getFeedSessionBuffer(invokerCodecDecoder.readString(), bw5.os0.i(invokerCodecDecoder.readInt32()), invokerCodecDecoder.readString());
        com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
        invokerCodecEncoder.writeString(feedSessionBuffer);
        return invokerCodecEncoder.getByteBuffer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.nio.ByteBuffer __getLocalFinderObject(java.lang.String str, com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
        java.util.ArrayList<bw5.yr> localFinderObject = this.stub.getLocalFinderObject(invokerCodecDecoder.readStringList());
        com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
        invokerCodecEncoder.writeBytesList(com.tencent.wechat.zidl2.ZidlUtil.mmpbSerialize(localFinderObject));
        return invokerCodecEncoder.getByteBuffer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.nio.ByteBuffer __getPrivateMsgTotalUnreadCountByUsername(java.lang.String str, com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
        int privateMsgTotalUnreadCountByUsername = this.stub.getPrivateMsgTotalUnreadCountByUsername(invokerCodecDecoder.readString());
        com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
        invokerCodecEncoder.writeUInt32(privateMsgTotalUnreadCountByUsername);
        return invokerCodecEncoder.getByteBuffer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.nio.ByteBuffer __isRedDotMeetWithCondition(java.lang.String str, com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
        boolean isRedDotMeetWithCondition = this.stub.isRedDotMeetWithCondition(invokerCodecDecoder.readString(), (bw5.e0) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(bw5.e0.f26671g, invokerCodecDecoder.readBytes()));
        com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
        invokerCodecEncoder.writeBoolean(isRedDotMeetWithCondition);
        return invokerCodecEncoder.getByteBuffer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.nio.ByteBuffer __reddotPersonalExposeClearSwitch(java.lang.String str, com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
        boolean reddotPersonalExposeClearSwitch = this.stub.reddotPersonalExposeClearSwitch();
        com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
        invokerCodecEncoder.writeBoolean(reddotPersonalExposeClearSwitch);
        return invokerCodecEncoder.getByteBuffer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.nio.ByteBuffer __reddotWillRevokeTipsUuidArray(java.lang.String str, com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
        this.stub.reddotWillRevokeTipsUuidArray(invokerCodecDecoder.readStringList());
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.nio.ByteBuffer __saveFinderObject(java.lang.String str, com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
        this.stub.saveFinderObject(com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(bw5.yr.f35627s2, invokerCodecDecoder.readBytesList()), bw5.os0.i(invokerCodecDecoder.readInt32()), invokerCodecDecoder.readString());
        return null;
    }

    @Override // com.tencent.wechat.zidl2.ServerInvoker
    public void attachStub(java.lang.Object obj) {
        com.tencent.wechat.aff.finder.AffFinderProviderBase affFinderProviderBase = (com.tencent.wechat.aff.finder.AffFinderProviderBase) obj;
        affFinderProviderBase.setCallback(this);
        this.stub = affFinderProviderBase;
    }

    @Override // com.tencent.wechat.aff.finder.AffFinderProviderBase.Callback
    public void onfinderRedDotDataChangedActionComplete(long j17) {
        try {
            com.tencent.wechat.zidl2.TaskIdConvertor.ClientIdContext clientId = this.taskIdConvertor.toClientId(j17);
            if (clientId == null) {
                java.lang.String.format("onfinderRedDotDataChangedActionComplete taskid:%dnot found!", java.lang.Long.valueOf(j17));
                return;
            }
            this.taskIdConvertor.removeServerId(j17);
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString("OnfinderRedDotDataChangedActionComplete");
            invokerCodecEncoder.writeUInt64(clientId.getTaskId());
            invoke(clientId.getClientId(), invokerCodecEncoder.getByteBuffer());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("AffFinderProviderInvoker.onfinderRedDotDataChangedActionComplete failed", e17);
        }
    }

    @Override // com.tencent.wechat.aff.finder.AffFinderProviderBase.Callback
    public void onfinderRedDotHasAddActionComplete(long j17) {
        try {
            com.tencent.wechat.zidl2.TaskIdConvertor.ClientIdContext clientId = this.taskIdConvertor.toClientId(j17);
            if (clientId == null) {
                java.lang.String.format("onfinderRedDotHasAddActionComplete taskid:%dnot found!", java.lang.Long.valueOf(j17));
                return;
            }
            this.taskIdConvertor.removeServerId(j17);
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString("OnfinderRedDotHasAddActionComplete");
            invokerCodecEncoder.writeUInt64(clientId.getTaskId());
            invoke(clientId.getClientId(), invokerCodecEncoder.getByteBuffer());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("AffFinderProviderInvoker.onfinderRedDotHasAddActionComplete failed", e17);
        }
    }

    @Override // com.tencent.wechat.aff.finder.AffFinderProviderBase.Callback
    public void onfinderRedDotHasDisposeActionComplete(long j17) {
        try {
            com.tencent.wechat.zidl2.TaskIdConvertor.ClientIdContext clientId = this.taskIdConvertor.toClientId(j17);
            if (clientId == null) {
                java.lang.String.format("onfinderRedDotHasDisposeActionComplete taskid:%dnot found!", java.lang.Long.valueOf(j17));
                return;
            }
            this.taskIdConvertor.removeServerId(j17);
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString("OnfinderRedDotHasDisposeActionComplete");
            invokerCodecEncoder.writeUInt64(clientId.getTaskId());
            invoke(clientId.getClientId(), invokerCodecEncoder.getByteBuffer());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("AffFinderProviderInvoker.onfinderRedDotHasDisposeActionComplete failed", e17);
        }
    }
}
