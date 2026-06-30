package com.tencent.wechat.aff.newlife;

/* loaded from: classes8.dex */
public class AffFinderCppToNativeManagerInvoker extends com.tencent.wechat.zidl2.ServerInvoker {
    private com.tencent.wechat.aff.newlife.AffFinderCppToNativeManagerBase stub;

    public AffFinderCppToNativeManagerInvoker() {
        this.methodInvokeDispatcher.put("getFinderUserName", new com.tencent.wechat.zidl2.ServerInvoker.InvokerInterface() { // from class: aw5.a$$a
            @Override // com.tencent.wechat.zidl2.ServerInvoker.InvokerInterface
            public final java.nio.ByteBuffer invoke(java.lang.String str, com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
                java.nio.ByteBuffer __getFinderUserName;
                __getFinderUserName = com.tencent.wechat.aff.newlife.AffFinderCppToNativeManagerInvoker.this.__getFinderUserName(str, invokerCodecDecoder);
                return __getFinderUserName;
            }
        });
        this.methodInvokeDispatcher.put("getMultiFinderUserNames", new com.tencent.wechat.zidl2.ServerInvoker.InvokerInterface() { // from class: aw5.a$$b
            @Override // com.tencent.wechat.zidl2.ServerInvoker.InvokerInterface
            public final java.nio.ByteBuffer invoke(java.lang.String str, com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
                java.nio.ByteBuffer __getMultiFinderUserNames;
                __getMultiFinderUserNames = com.tencent.wechat.aff.newlife.AffFinderCppToNativeManagerInvoker.this.__getMultiFinderUserNames(str, invokerCodecDecoder);
                return __getMultiFinderUserNames;
            }
        });
        this.methodInvokeDispatcher.put(com.tencent.mm.plugin.appbrand.jsapi.lbs.e0.NAME, new com.tencent.wechat.zidl2.ServerInvoker.InvokerInterface() { // from class: aw5.a$$c
            @Override // com.tencent.wechat.zidl2.ServerInvoker.InvokerInterface
            public final java.nio.ByteBuffer invoke(java.lang.String str, com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
                java.nio.ByteBuffer __getLocation;
                __getLocation = com.tencent.wechat.aff.newlife.AffFinderCppToNativeManagerInvoker.this.__getLocation(str, invokerCodecDecoder);
                return __getLocation;
            }
        });
        this.methodInvokeDispatcher.put("getFinderCtrlInfoByKeyPath", new com.tencent.wechat.zidl2.ServerInvoker.InvokerInterface() { // from class: aw5.a$$d
            @Override // com.tencent.wechat.zidl2.ServerInvoker.InvokerInterface
            public final java.nio.ByteBuffer invoke(java.lang.String str, com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
                java.nio.ByteBuffer __getFinderCtrlInfoByKeyPath;
                __getFinderCtrlInfoByKeyPath = com.tencent.wechat.aff.newlife.AffFinderCppToNativeManagerInvoker.this.__getFinderCtrlInfoByKeyPath(str, invokerCodecDecoder);
                return __getFinderCtrlInfoByKeyPath;
            }
        });
        this.methodInvokeDispatcher.put("findShowInfoByPath", new com.tencent.wechat.zidl2.ServerInvoker.InvokerInterface() { // from class: aw5.a$$e
            @Override // com.tencent.wechat.zidl2.ServerInvoker.InvokerInterface
            public final java.nio.ByteBuffer invoke(java.lang.String str, com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
                java.nio.ByteBuffer __findShowInfoByPath;
                __findShowInfoByPath = com.tencent.wechat.aff.newlife.AffFinderCppToNativeManagerInvoker.this.__findShowInfoByPath(str, invokerCodecDecoder);
                return __findShowInfoByPath;
            }
        });
        this.methodInvokeDispatcher.put("getFinderBaseReq", new com.tencent.wechat.zidl2.ServerInvoker.InvokerInterface() { // from class: aw5.a$$f
            @Override // com.tencent.wechat.zidl2.ServerInvoker.InvokerInterface
            public final java.nio.ByteBuffer invoke(java.lang.String str, com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
                java.nio.ByteBuffer __getFinderBaseReq;
                __getFinderBaseReq = com.tencent.wechat.aff.newlife.AffFinderCppToNativeManagerInvoker.this.__getFinderBaseReq(str, invokerCodecDecoder);
                return __getFinderBaseReq;
            }
        });
        this.methodInvokeDispatcher.put("getFinderSyncClientInfo", new com.tencent.wechat.zidl2.ServerInvoker.InvokerInterface() { // from class: aw5.a$$g
            @Override // com.tencent.wechat.zidl2.ServerInvoker.InvokerInterface
            public final java.nio.ByteBuffer invoke(java.lang.String str, com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
                java.nio.ByteBuffer __getFinderSyncClientInfo;
                __getFinderSyncClientInfo = com.tencent.wechat.aff.newlife.AffFinderCppToNativeManagerInvoker.this.__getFinderSyncClientInfo(str, invokerCodecDecoder);
                return __getFinderSyncClientInfo;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.nio.ByteBuffer __findShowInfoByPath(java.lang.String str, com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
        com.tencent.wechat.aff.newlife.FinderTipsShowInfo findShowInfoByPath = this.stub.findShowInfoByPath(invokerCodecDecoder.readString());
        com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
        invokerCodecEncoder.writeBytes(com.tencent.wechat.zidl2.ZidlUtil.mmpbSerialize(findShowInfoByPath));
        return invokerCodecEncoder.getByteBuffer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.nio.ByteBuffer __getFinderBaseReq(java.lang.String str, com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
        com.tencent.wechat.aff.newlife.FinderBaseRequest finderBaseReq = this.stub.getFinderBaseReq(invokerCodecDecoder.readUInt32(), invokerCodecDecoder.readUInt32(), invokerCodecDecoder.readUInt32());
        com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
        invokerCodecEncoder.writeBytes(com.tencent.wechat.zidl2.ZidlUtil.mmpbSerialize(finderBaseReq));
        return invokerCodecEncoder.getByteBuffer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.nio.ByteBuffer __getFinderCtrlInfoByKeyPath(java.lang.String str, com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
        com.tencent.wechat.aff.newlife.FinderRedDotCtrlInfo finderCtrlInfoByKeyPath = this.stub.getFinderCtrlInfoByKeyPath(invokerCodecDecoder.readString());
        com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
        invokerCodecEncoder.writeBytes(com.tencent.wechat.zidl2.ZidlUtil.mmpbSerialize(finderCtrlInfoByKeyPath));
        return invokerCodecEncoder.getByteBuffer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.nio.ByteBuffer __getFinderSyncClientInfo(java.lang.String str, com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
        com.tencent.wechat.aff.newlife.FinderSyncClientInfo finderSyncClientInfo = this.stub.getFinderSyncClientInfo((com.tencent.wechat.aff.newlife.SourceInfo) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.wechat.aff.newlife.SourceInfo.getDefaultInstance(), invokerCodecDecoder.readBytes()));
        com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
        invokerCodecEncoder.writeBytes(com.tencent.wechat.zidl2.ZidlUtil.mmpbSerialize(finderSyncClientInfo));
        return invokerCodecEncoder.getByteBuffer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.nio.ByteBuffer __getFinderUserName(java.lang.String str, com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
        java.lang.String finderUserName = this.stub.getFinderUserName();
        com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
        invokerCodecEncoder.writeString(finderUserName);
        return invokerCodecEncoder.getByteBuffer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.nio.ByteBuffer __getLocation(java.lang.String str, com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
        com.tencent.wechat.aff.newlife.SyncLocation location = this.stub.getLocation(invokerCodecDecoder.readUInt32());
        com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
        invokerCodecEncoder.writeBytes(com.tencent.wechat.zidl2.ZidlUtil.mmpbSerialize(location));
        return invokerCodecEncoder.getByteBuffer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.nio.ByteBuffer __getMultiFinderUserNames(java.lang.String str, com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
        java.util.ArrayList<java.lang.String> multiFinderUserNames = this.stub.getMultiFinderUserNames();
        com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
        invokerCodecEncoder.writeStringList(multiFinderUserNames);
        return invokerCodecEncoder.getByteBuffer();
    }

    @Override // com.tencent.wechat.zidl2.ServerInvoker
    public void attachStub(java.lang.Object obj) {
        this.stub = (com.tencent.wechat.aff.newlife.AffFinderCppToNativeManagerBase) obj;
    }
}
