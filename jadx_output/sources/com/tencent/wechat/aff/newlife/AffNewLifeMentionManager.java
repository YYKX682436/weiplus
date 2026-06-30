package com.tencent.wechat.aff.newlife;

/* loaded from: classes16.dex */
public class AffNewLifeMentionManager extends com.tencent.wechat.zidl2.ClientInvoker {
    private static com.tencent.wechat.aff.newlife.AffNewLifeMentionManager instance = new com.tencent.wechat.aff.newlife.AffNewLifeMentionManager();
    private java.util.concurrent.ConcurrentHashMap<java.lang.Integer, com.tencent.wechat.aff.newlife.AffNewLifeMentionManager.initCallback> initCallbackMap = new java.util.concurrent.ConcurrentHashMap<>();
    private java.util.concurrent.ConcurrentHashMap<java.lang.String, com.tencent.wechat.aff.newlife.AffNewLifeMentionManager.DataChangeEvent> dataChangeEventMap = new java.util.concurrent.ConcurrentHashMap<>();
    private java.util.concurrent.ConcurrentHashMap<java.lang.Integer, com.tencent.wechat.aff.newlife.AffNewLifeMentionManager.insertCallback> insertCallbackMap = new java.util.concurrent.ConcurrentHashMap<>();
    private java.util.concurrent.ConcurrentHashMap<java.lang.Integer, com.tencent.wechat.aff.newlife.AffNewLifeMentionManager.deleteByIdCallback> deleteByIdCallbackMap = new java.util.concurrent.ConcurrentHashMap<>();
    private java.util.concurrent.ConcurrentHashMap<java.lang.Integer, com.tencent.wechat.aff.newlife.AffNewLifeMentionManager.updateByIdCallback> updateByIdCallbackMap = new java.util.concurrent.ConcurrentHashMap<>();
    private java.util.concurrent.ConcurrentHashMap<java.lang.Integer, com.tencent.wechat.aff.newlife.AffNewLifeMentionManager.getByIdCallback> getByIdCallbackMap = new java.util.concurrent.ConcurrentHashMap<>();
    private java.util.concurrent.ConcurrentHashMap<java.lang.Integer, com.tencent.wechat.aff.newlife.AffNewLifeMentionManager.getBeforeTimeLimitCallback> getBeforeTimeLimitCallbackMap = new java.util.concurrent.ConcurrentHashMap<>();
    private java.util.concurrent.ConcurrentHashMap<java.lang.Integer, com.tencent.wechat.aff.newlife.AffNewLifeMentionManager.getAfterTimeCreateCallback> getAfterTimeCreateCallbackMap = new java.util.concurrent.ConcurrentHashMap<>();
    private java.util.concurrent.ConcurrentHashMap<java.lang.Integer, com.tencent.wechat.aff.newlife.AffNewLifeMentionManager.getLastBufferCallback> getLastBufferCallbackMap = new java.util.concurrent.ConcurrentHashMap<>();
    private java.util.concurrent.ConcurrentHashMap<java.lang.Integer, com.tencent.wechat.aff.newlife.AffNewLifeMentionManager.updateLastBufferCallback> updateLastBufferCallbackMap = new java.util.concurrent.ConcurrentHashMap<>();
    private java.util.concurrent.ConcurrentHashMap<java.lang.Integer, com.tencent.wechat.aff.newlife.AffNewLifeMentionManager.updateLastestMentionReadIdCallback> updateLastestMentionReadIdCallbackMap = new java.util.concurrent.ConcurrentHashMap<>();
    private java.util.concurrent.ConcurrentHashMap<java.lang.Integer, com.tencent.wechat.aff.newlife.AffNewLifeMentionManager.getUnreadMentionListCallback> getUnreadMentionListCallbackMap = new java.util.concurrent.ConcurrentHashMap<>();

    /* loaded from: classes16.dex */
    public interface DataChangeEvent {
        void event(int i17, com.tencent.wechat.aff.newlife.NewLifeMention newLifeMention, long j17);
    }

    /* loaded from: classes16.dex */
    public interface deleteByIdCallback {
        void complete(boolean z17);
    }

    /* loaded from: classes16.dex */
    public interface getAfterTimeCreateCallback {
        void complete(com.tencent.wechat.aff.newlife.NewLifeMentionInfoList newLifeMentionInfoList);
    }

    /* loaded from: classes16.dex */
    public interface getBeforeTimeLimitCallback {
        void complete(com.tencent.wechat.aff.newlife.NewLifeMentionInfoList newLifeMentionInfoList);
    }

    /* loaded from: classes16.dex */
    public interface getByIdCallback {
        void complete(com.tencent.wechat.aff.newlife.NewLifeMention newLifeMention);
    }

    /* loaded from: classes16.dex */
    public interface getLastBufferCallback {
        void complete(byte[] bArr);
    }

    /* loaded from: classes16.dex */
    public interface getUnreadMentionListCallback {
        void complete(com.tencent.wechat.aff.newlife.NewLifeMentionInfoList newLifeMentionInfoList);
    }

    /* loaded from: classes16.dex */
    public interface initCallback {
        void complete(boolean z17);
    }

    /* loaded from: classes16.dex */
    public interface insertCallback {
        void complete(boolean z17);
    }

    /* loaded from: classes16.dex */
    public interface updateByIdCallback {
        void complete(boolean z17);
    }

    /* loaded from: classes16.dex */
    public interface updateLastBufferCallback {
        void complete(boolean z17);
    }

    /* loaded from: classes16.dex */
    public interface updateLastestMentionReadIdCallback {
        void complete(boolean z17);
    }

    public AffNewLifeMentionManager() {
        createClientInvoker("newlife.AffNewLifeMentionManager@Get", null);
        this.methodInvokeDispatcher.put("OninitComplete", new com.tencent.wechat.zidl2.ClientInvoker.InvokerInterface() { // from class: aw5.f$$a
            @Override // com.tencent.wechat.zidl2.ClientInvoker.InvokerInterface
            public final void invoke(com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
                com.tencent.wechat.aff.newlife.AffNewLifeMentionManager.this.__OninitComplete(invokerCodecDecoder);
            }
        });
        this.methodInvokeDispatcher.put("OnDataChangeEvent", new com.tencent.wechat.zidl2.ClientInvoker.InvokerInterface() { // from class: aw5.f$$f
            @Override // com.tencent.wechat.zidl2.ClientInvoker.InvokerInterface
            public final void invoke(com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
                com.tencent.wechat.aff.newlife.AffNewLifeMentionManager.this.__OnDataChangeEvent(invokerCodecDecoder);
            }
        });
        this.methodInvokeDispatcher.put("OninsertComplete", new com.tencent.wechat.zidl2.ClientInvoker.InvokerInterface() { // from class: aw5.f$$g
            @Override // com.tencent.wechat.zidl2.ClientInvoker.InvokerInterface
            public final void invoke(com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
                com.tencent.wechat.aff.newlife.AffNewLifeMentionManager.this.__OninsertComplete(invokerCodecDecoder);
            }
        });
        this.methodInvokeDispatcher.put("OndeleteByIdComplete", new com.tencent.wechat.zidl2.ClientInvoker.InvokerInterface() { // from class: aw5.f$$h
            @Override // com.tencent.wechat.zidl2.ClientInvoker.InvokerInterface
            public final void invoke(com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
                com.tencent.wechat.aff.newlife.AffNewLifeMentionManager.this.__OndeleteByIdComplete(invokerCodecDecoder);
            }
        });
        this.methodInvokeDispatcher.put("OnupdateByIdComplete", new com.tencent.wechat.zidl2.ClientInvoker.InvokerInterface() { // from class: aw5.f$$i
            @Override // com.tencent.wechat.zidl2.ClientInvoker.InvokerInterface
            public final void invoke(com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
                com.tencent.wechat.aff.newlife.AffNewLifeMentionManager.this.__OnupdateByIdComplete(invokerCodecDecoder);
            }
        });
        this.methodInvokeDispatcher.put("OngetByIdComplete", new com.tencent.wechat.zidl2.ClientInvoker.InvokerInterface() { // from class: aw5.f$$j
            @Override // com.tencent.wechat.zidl2.ClientInvoker.InvokerInterface
            public final void invoke(com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
                com.tencent.wechat.aff.newlife.AffNewLifeMentionManager.this.__OngetByIdComplete(invokerCodecDecoder);
            }
        });
        this.methodInvokeDispatcher.put("OngetBeforeTimeLimitComplete", new com.tencent.wechat.zidl2.ClientInvoker.InvokerInterface() { // from class: aw5.f$$k
            @Override // com.tencent.wechat.zidl2.ClientInvoker.InvokerInterface
            public final void invoke(com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
                com.tencent.wechat.aff.newlife.AffNewLifeMentionManager.this.__OngetBeforeTimeLimitComplete(invokerCodecDecoder);
            }
        });
        this.methodInvokeDispatcher.put("OngetAfterTimeCreateComplete", new com.tencent.wechat.zidl2.ClientInvoker.InvokerInterface() { // from class: aw5.f$$l
            @Override // com.tencent.wechat.zidl2.ClientInvoker.InvokerInterface
            public final void invoke(com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
                com.tencent.wechat.aff.newlife.AffNewLifeMentionManager.this.__OngetAfterTimeCreateComplete(invokerCodecDecoder);
            }
        });
        this.methodInvokeDispatcher.put("OngetLastBufferComplete", new com.tencent.wechat.zidl2.ClientInvoker.InvokerInterface() { // from class: aw5.f$$b
            @Override // com.tencent.wechat.zidl2.ClientInvoker.InvokerInterface
            public final void invoke(com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
                com.tencent.wechat.aff.newlife.AffNewLifeMentionManager.this.__OngetLastBufferComplete(invokerCodecDecoder);
            }
        });
        this.methodInvokeDispatcher.put("OnupdateLastBufferComplete", new com.tencent.wechat.zidl2.ClientInvoker.InvokerInterface() { // from class: aw5.f$$c
            @Override // com.tencent.wechat.zidl2.ClientInvoker.InvokerInterface
            public final void invoke(com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
                com.tencent.wechat.aff.newlife.AffNewLifeMentionManager.this.__OnupdateLastBufferComplete(invokerCodecDecoder);
            }
        });
        this.methodInvokeDispatcher.put("OnupdateLastestMentionReadIdComplete", new com.tencent.wechat.zidl2.ClientInvoker.InvokerInterface() { // from class: aw5.f$$d
            @Override // com.tencent.wechat.zidl2.ClientInvoker.InvokerInterface
            public final void invoke(com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
                com.tencent.wechat.aff.newlife.AffNewLifeMentionManager.this.__OnupdateLastestMentionReadIdComplete(invokerCodecDecoder);
            }
        });
        this.methodInvokeDispatcher.put("OngetUnreadMentionListComplete", new com.tencent.wechat.zidl2.ClientInvoker.InvokerInterface() { // from class: aw5.f$$e
            @Override // com.tencent.wechat.zidl2.ClientInvoker.InvokerInterface
            public final void invoke(com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
                com.tencent.wechat.aff.newlife.AffNewLifeMentionManager.this.__OngetUnreadMentionListComplete(invokerCodecDecoder);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void __OnDataChangeEvent(com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
        this.dataChangeEventMap.size();
        int readUInt32 = invokerCodecDecoder.readUInt32();
        com.tencent.wechat.aff.newlife.NewLifeMention newLifeMention = (com.tencent.wechat.aff.newlife.NewLifeMention) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.wechat.aff.newlife.NewLifeMention.getDefaultInstance(), invokerCodecDecoder.readBytes());
        long readUInt64 = invokerCodecDecoder.readUInt64();
        for (java.util.Map.Entry<java.lang.String, com.tencent.wechat.aff.newlife.AffNewLifeMentionManager.DataChangeEvent> entry : this.dataChangeEventMap.entrySet()) {
            entry.getKey();
            entry.getValue().event(readUInt32, newLifeMention, readUInt64);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void __OndeleteByIdComplete(com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
        int readUInt32 = invokerCodecDecoder.readUInt32();
        com.tencent.wechat.aff.newlife.AffNewLifeMentionManager.deleteByIdCallback deletebyidcallback = this.deleteByIdCallbackMap.get(java.lang.Integer.valueOf(readUInt32));
        if (deletebyidcallback != null) {
            deletebyidcallback.complete(invokerCodecDecoder.readBoolean());
            this.deleteByIdCallbackMap.remove(java.lang.Integer.valueOf(readUInt32));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void __OngetAfterTimeCreateComplete(com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
        int readUInt32 = invokerCodecDecoder.readUInt32();
        com.tencent.wechat.aff.newlife.AffNewLifeMentionManager.getAfterTimeCreateCallback getaftertimecreatecallback = this.getAfterTimeCreateCallbackMap.get(java.lang.Integer.valueOf(readUInt32));
        if (getaftertimecreatecallback != null) {
            getaftertimecreatecallback.complete((com.tencent.wechat.aff.newlife.NewLifeMentionInfoList) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.wechat.aff.newlife.NewLifeMentionInfoList.getDefaultInstance(), invokerCodecDecoder.readBytes()));
            this.getAfterTimeCreateCallbackMap.remove(java.lang.Integer.valueOf(readUInt32));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void __OngetBeforeTimeLimitComplete(com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
        int readUInt32 = invokerCodecDecoder.readUInt32();
        com.tencent.wechat.aff.newlife.AffNewLifeMentionManager.getBeforeTimeLimitCallback getbeforetimelimitcallback = this.getBeforeTimeLimitCallbackMap.get(java.lang.Integer.valueOf(readUInt32));
        if (getbeforetimelimitcallback != null) {
            getbeforetimelimitcallback.complete((com.tencent.wechat.aff.newlife.NewLifeMentionInfoList) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.wechat.aff.newlife.NewLifeMentionInfoList.getDefaultInstance(), invokerCodecDecoder.readBytes()));
            this.getBeforeTimeLimitCallbackMap.remove(java.lang.Integer.valueOf(readUInt32));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void __OngetByIdComplete(com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
        int readUInt32 = invokerCodecDecoder.readUInt32();
        com.tencent.wechat.aff.newlife.AffNewLifeMentionManager.getByIdCallback getbyidcallback = this.getByIdCallbackMap.get(java.lang.Integer.valueOf(readUInt32));
        if (getbyidcallback != null) {
            getbyidcallback.complete((com.tencent.wechat.aff.newlife.NewLifeMention) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.wechat.aff.newlife.NewLifeMention.getDefaultInstance(), invokerCodecDecoder.readBytes()));
            this.getByIdCallbackMap.remove(java.lang.Integer.valueOf(readUInt32));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void __OngetLastBufferComplete(com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
        int readUInt32 = invokerCodecDecoder.readUInt32();
        com.tencent.wechat.aff.newlife.AffNewLifeMentionManager.getLastBufferCallback getlastbuffercallback = this.getLastBufferCallbackMap.get(java.lang.Integer.valueOf(readUInt32));
        if (getlastbuffercallback != null) {
            getlastbuffercallback.complete(invokerCodecDecoder.readBytes());
            this.getLastBufferCallbackMap.remove(java.lang.Integer.valueOf(readUInt32));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void __OngetUnreadMentionListComplete(com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
        int readUInt32 = invokerCodecDecoder.readUInt32();
        com.tencent.wechat.aff.newlife.AffNewLifeMentionManager.getUnreadMentionListCallback getunreadmentionlistcallback = this.getUnreadMentionListCallbackMap.get(java.lang.Integer.valueOf(readUInt32));
        if (getunreadmentionlistcallback != null) {
            getunreadmentionlistcallback.complete((com.tencent.wechat.aff.newlife.NewLifeMentionInfoList) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.wechat.aff.newlife.NewLifeMentionInfoList.getDefaultInstance(), invokerCodecDecoder.readBytes()));
            this.getUnreadMentionListCallbackMap.remove(java.lang.Integer.valueOf(readUInt32));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void __OninitComplete(com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
        int readUInt32 = invokerCodecDecoder.readUInt32();
        com.tencent.wechat.aff.newlife.AffNewLifeMentionManager.initCallback initcallback = this.initCallbackMap.get(java.lang.Integer.valueOf(readUInt32));
        if (initcallback != null) {
            initcallback.complete(invokerCodecDecoder.readBoolean());
            this.initCallbackMap.remove(java.lang.Integer.valueOf(readUInt32));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void __OninsertComplete(com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
        int readUInt32 = invokerCodecDecoder.readUInt32();
        com.tencent.wechat.aff.newlife.AffNewLifeMentionManager.insertCallback insertcallback = this.insertCallbackMap.get(java.lang.Integer.valueOf(readUInt32));
        if (insertcallback != null) {
            insertcallback.complete(invokerCodecDecoder.readBoolean());
            this.insertCallbackMap.remove(java.lang.Integer.valueOf(readUInt32));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void __OnupdateByIdComplete(com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
        int readUInt32 = invokerCodecDecoder.readUInt32();
        com.tencent.wechat.aff.newlife.AffNewLifeMentionManager.updateByIdCallback updatebyidcallback = this.updateByIdCallbackMap.get(java.lang.Integer.valueOf(readUInt32));
        if (updatebyidcallback != null) {
            updatebyidcallback.complete(invokerCodecDecoder.readBoolean());
            this.updateByIdCallbackMap.remove(java.lang.Integer.valueOf(readUInt32));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void __OnupdateLastBufferComplete(com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
        int readUInt32 = invokerCodecDecoder.readUInt32();
        com.tencent.wechat.aff.newlife.AffNewLifeMentionManager.updateLastBufferCallback updatelastbuffercallback = this.updateLastBufferCallbackMap.get(java.lang.Integer.valueOf(readUInt32));
        if (updatelastbuffercallback != null) {
            updatelastbuffercallback.complete(invokerCodecDecoder.readBoolean());
            this.updateLastBufferCallbackMap.remove(java.lang.Integer.valueOf(readUInt32));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void __OnupdateLastestMentionReadIdComplete(com.tencent.wechat.zidl2.InvokerCodecDecoder invokerCodecDecoder) {
        int readUInt32 = invokerCodecDecoder.readUInt32();
        com.tencent.wechat.aff.newlife.AffNewLifeMentionManager.updateLastestMentionReadIdCallback updatelastestmentionreadidcallback = this.updateLastestMentionReadIdCallbackMap.get(java.lang.Integer.valueOf(readUInt32));
        if (updatelastestmentionreadidcallback != null) {
            updatelastestmentionreadidcallback.complete(invokerCodecDecoder.readBoolean());
            this.updateLastestMentionReadIdCallbackMap.remove(java.lang.Integer.valueOf(readUInt32));
        }
    }

    public static com.tencent.wechat.aff.newlife.AffNewLifeMentionManager getInstance() {
        return instance;
    }

    public void deleteByIdAsync(java.lang.String str, long j17, com.tencent.wechat.aff.newlife.AffNewLifeMentionManager.deleteByIdCallback deletebyidcallback) {
        try {
            int GenTaskId = (int) this.taskIdConvertor.GenTaskId();
            if (deletebyidcallback != null) {
                this.deleteByIdCallbackMap.put(java.lang.Integer.valueOf(GenTaskId), deletebyidcallback);
            }
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("deleteById");
            invokerCodecEncoder.writeUInt32(GenTaskId);
            invokerCodecEncoder.writeString(str);
            invokerCodecEncoder.writeUInt64(j17);
            invoke(invokerCodecEncoder.getByteBuffer());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("AffNewLifeMentionManager.deleteById failed", e17);
        }
    }

    public void getAfterTimeCreateAsync(java.lang.String str, int i17, long j17, com.tencent.wechat.aff.newlife.AffNewLifeMentionManager.getAfterTimeCreateCallback getaftertimecreatecallback) {
        try {
            int GenTaskId = (int) this.taskIdConvertor.GenTaskId();
            if (getaftertimecreatecallback != null) {
                this.getAfterTimeCreateCallbackMap.put(java.lang.Integer.valueOf(GenTaskId), getaftertimecreatecallback);
            }
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("getAfterTimeCreate");
            invokerCodecEncoder.writeUInt32(GenTaskId);
            invokerCodecEncoder.writeString(str);
            invokerCodecEncoder.writeUInt32(i17);
            invokerCodecEncoder.writeUInt64(j17);
            invoke(invokerCodecEncoder.getByteBuffer());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("AffNewLifeMentionManager.getAfterTimeCreate failed", e17);
        }
    }

    public void getBeforeTimeLimitAsync(java.lang.String str, int i17, int i18, long j17, com.tencent.wechat.aff.newlife.AffNewLifeMentionManager.getBeforeTimeLimitCallback getbeforetimelimitcallback) {
        try {
            int GenTaskId = (int) this.taskIdConvertor.GenTaskId();
            if (getbeforetimelimitcallback != null) {
                this.getBeforeTimeLimitCallbackMap.put(java.lang.Integer.valueOf(GenTaskId), getbeforetimelimitcallback);
            }
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("getBeforeTimeLimit");
            invokerCodecEncoder.writeUInt32(GenTaskId);
            invokerCodecEncoder.writeString(str);
            invokerCodecEncoder.writeUInt32(i17);
            invokerCodecEncoder.writeUInt32(i18);
            invokerCodecEncoder.writeUInt64(j17);
            invoke(invokerCodecEncoder.getByteBuffer());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("AffNewLifeMentionManager.getBeforeTimeLimit failed", e17);
        }
    }

    public void getByIdAsync(java.lang.String str, long j17, com.tencent.wechat.aff.newlife.AffNewLifeMentionManager.getByIdCallback getbyidcallback) {
        try {
            int GenTaskId = (int) this.taskIdConvertor.GenTaskId();
            if (getbyidcallback != null) {
                this.getByIdCallbackMap.put(java.lang.Integer.valueOf(GenTaskId), getbyidcallback);
            }
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("getById");
            invokerCodecEncoder.writeUInt32(GenTaskId);
            invokerCodecEncoder.writeString(str);
            invokerCodecEncoder.writeUInt64(j17);
            invoke(invokerCodecEncoder.getByteBuffer());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("AffNewLifeMentionManager.getById failed", e17);
        }
    }

    public void getLastBufferAsync(java.lang.String str, int i17, com.tencent.wechat.aff.newlife.AffNewLifeMentionManager.getLastBufferCallback getlastbuffercallback) {
        try {
            int GenTaskId = (int) this.taskIdConvertor.GenTaskId();
            if (getlastbuffercallback != null) {
                this.getLastBufferCallbackMap.put(java.lang.Integer.valueOf(GenTaskId), getlastbuffercallback);
            }
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("getLastBuffer");
            invokerCodecEncoder.writeUInt32(GenTaskId);
            invokerCodecEncoder.writeString(str);
            invokerCodecEncoder.writeUInt32(i17);
            invoke(invokerCodecEncoder.getByteBuffer());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("AffNewLifeMentionManager.getLastBuffer failed", e17);
        }
    }

    public void getUnreadMentionListAsync(java.lang.String str, int i17, com.tencent.wechat.aff.newlife.AffNewLifeMentionManager.getUnreadMentionListCallback getunreadmentionlistcallback) {
        try {
            int GenTaskId = (int) this.taskIdConvertor.GenTaskId();
            if (getunreadmentionlistcallback != null) {
                this.getUnreadMentionListCallbackMap.put(java.lang.Integer.valueOf(GenTaskId), getunreadmentionlistcallback);
            }
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("getUnreadMentionList");
            invokerCodecEncoder.writeUInt32(GenTaskId);
            invokerCodecEncoder.writeString(str);
            invokerCodecEncoder.writeUInt32(i17);
            invoke(invokerCodecEncoder.getByteBuffer());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("AffNewLifeMentionManager.getUnreadMentionList failed", e17);
        }
    }

    public void initAsync(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, boolean z17, boolean z18, boolean z19, boolean z27, com.tencent.wechat.aff.newlife.AffNewLifeMentionManager.initCallback initcallback) {
        try {
            int GenTaskId = (int) this.taskIdConvertor.GenTaskId();
            if (initcallback != null) {
                this.initCallbackMap.put(java.lang.Integer.valueOf(GenTaskId), initcallback);
            }
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
            invokerCodecEncoder.writeUInt32(GenTaskId);
            invokerCodecEncoder.writeString(str);
            invokerCodecEncoder.writeString(str2);
            invokerCodecEncoder.writeString(str3);
            invokerCodecEncoder.writeUInt32(i17);
            invokerCodecEncoder.writeBoolean(z17);
            invokerCodecEncoder.writeBoolean(z18);
            invokerCodecEncoder.writeBoolean(z19);
            invokerCodecEncoder.writeBoolean(z27);
            invoke(invokerCodecEncoder.getByteBuffer());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("AffNewLifeMentionManager.init failed", e17);
        }
    }

    public void insertAsync(com.tencent.wechat.aff.newlife.NewLifeMention newLifeMention, java.lang.String str, com.tencent.wechat.aff.newlife.AffNewLifeMentionManager.insertCallback insertcallback) {
        try {
            int GenTaskId = (int) this.taskIdConvertor.GenTaskId();
            if (insertcallback != null) {
                this.insertCallbackMap.put(java.lang.Integer.valueOf(GenTaskId), insertcallback);
            }
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("insert");
            invokerCodecEncoder.writeUInt32(GenTaskId);
            invokerCodecEncoder.writeBytes(com.tencent.wechat.zidl2.ZidlUtil.mmpbSerialize(newLifeMention));
            invokerCodecEncoder.writeString(str);
            invoke(invokerCodecEncoder.getByteBuffer());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("AffNewLifeMentionManager.insert failed", e17);
        }
    }

    public void subscribeDataChangeEvent(java.lang.String str, com.tencent.wechat.aff.newlife.AffNewLifeMentionManager.DataChangeEvent dataChangeEvent) {
        this.dataChangeEventMap.put(str, dataChangeEvent);
    }

    public void unSubscribeDataChangeEvent(java.lang.String str) {
        this.dataChangeEventMap.remove(str);
    }

    public void updateByIdAsync(java.lang.String str, com.tencent.wechat.aff.newlife.NewLifeMention newLifeMention, long j17, com.tencent.wechat.aff.newlife.AffNewLifeMentionManager.updateByIdCallback updatebyidcallback) {
        try {
            int GenTaskId = (int) this.taskIdConvertor.GenTaskId();
            if (updatebyidcallback != null) {
                this.updateByIdCallbackMap.put(java.lang.Integer.valueOf(GenTaskId), updatebyidcallback);
            }
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("updateById");
            invokerCodecEncoder.writeUInt32(GenTaskId);
            invokerCodecEncoder.writeString(str);
            invokerCodecEncoder.writeBytes(com.tencent.wechat.zidl2.ZidlUtil.mmpbSerialize(newLifeMention));
            invokerCodecEncoder.writeUInt64(j17);
            invoke(invokerCodecEncoder.getByteBuffer());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("AffNewLifeMentionManager.updateById failed", e17);
        }
    }

    public void updateLastBufferAsync(java.lang.String str, int i17, byte[] bArr, com.tencent.wechat.aff.newlife.AffNewLifeMentionManager.updateLastBufferCallback updatelastbuffercallback) {
        try {
            int GenTaskId = (int) this.taskIdConvertor.GenTaskId();
            if (updatelastbuffercallback != null) {
                this.updateLastBufferCallbackMap.put(java.lang.Integer.valueOf(GenTaskId), updatelastbuffercallback);
            }
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("updateLastBuffer");
            invokerCodecEncoder.writeUInt32(GenTaskId);
            invokerCodecEncoder.writeString(str);
            invokerCodecEncoder.writeUInt32(i17);
            invokerCodecEncoder.writeBytes(bArr);
            invoke(invokerCodecEncoder.getByteBuffer());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("AffNewLifeMentionManager.updateLastBuffer failed", e17);
        }
    }

    public void updateLastestMentionReadIdAsync(java.lang.String str, int i17, long j17, com.tencent.wechat.aff.newlife.AffNewLifeMentionManager.updateLastestMentionReadIdCallback updatelastestmentionreadidcallback) {
        try {
            int GenTaskId = (int) this.taskIdConvertor.GenTaskId();
            if (updatelastestmentionreadidcallback != null) {
                this.updateLastestMentionReadIdCallbackMap.put(java.lang.Integer.valueOf(GenTaskId), updatelastestmentionreadidcallback);
            }
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("updateLastestMentionReadId");
            invokerCodecEncoder.writeUInt32(GenTaskId);
            invokerCodecEncoder.writeString(str);
            invokerCodecEncoder.writeUInt32(i17);
            invokerCodecEncoder.writeUInt64(j17);
            invoke(invokerCodecEncoder.getByteBuffer());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("AffNewLifeMentionManager.updateLastestMentionReadId failed", e17);
        }
    }
}
