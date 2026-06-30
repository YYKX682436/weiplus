package com.tencent.wechat.zidl2;

/* loaded from: classes15.dex */
public class ServerInvokerFactory {
    private static final java.lang.String TAG = "ServerInvokerFactory";
    private java.util.concurrent.ConcurrentHashMap<java.lang.String, com.tencent.wechat.zidl2.ServerInvokerFactory.CreatorInfo> invokerCreator = new java.util.concurrent.ConcurrentHashMap<>();
    private static java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object> singletonObjectMap = new java.util.concurrent.ConcurrentHashMap<>();
    private static com.tencent.wechat.zidl2.ServerInvokerFactory instance = new com.tencent.wechat.zidl2.ServerInvokerFactory();

    /* loaded from: classes15.dex */
    public class CreatorInfo {
        public java.lang.String invoker;
        public java.lang.String stub;

        public CreatorInfo(java.lang.String str, java.lang.String str2) {
            this.invoker = str;
            this.stub = str2;
        }
    }

    public static java.lang.Object createInvoker(java.lang.String str, java.lang.String str2) {
        try {
            if (!str.endsWith("@Get")) {
                com.tencent.wechat.zlog.Zlog.a(TAG, java.lang.String.format("createInvoker singleton: %s, %s", str, str2), new java.lang.Object[0]);
                return getInstance().createInvokerImpl(str, str2);
            }
            com.tencent.wechat.zlog.Zlog.a(TAG, java.lang.String.format("createInvoker singleton: %s, %s", str, str2), new java.lang.Object[0]);
            synchronized (com.tencent.wechat.zidl2.ServerInvokerFactory.class) {
                if (!singletonObjectMap.containsKey(str)) {
                    com.tencent.wechat.zidl2.ServerInvoker createInvokerImpl = getInstance().createInvokerImpl(str, str2);
                    singletonObjectMap.put(str, createInvokerImpl);
                    return createInvokerImpl;
                }
                com.tencent.wechat.zlog.Zlog.d(hw5.a.WARN, TAG, "createInvoker return singleton instance already created.", new java.lang.Object[0]);
                return singletonObjectMap.get(str);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.wechat.zlog.Zlog.d(hw5.a.WARN, TAG, "createInvoker " + str + "error:" + e17, new java.lang.Object[0]);
            return null;
        }
    }

    public static com.tencent.wechat.zidl2.ServerInvokerFactory getInstance() {
        return instance;
    }

    private native void jniRegisterInvoker(java.lang.String str);

    private native void jniRegisterInvokerV2(java.lang.String str);

    public com.tencent.wechat.zidl2.ServerInvoker createInvokerImpl(java.lang.String str, java.lang.String str2) {
        com.tencent.wechat.zidl2.ServerInvokerFactory.CreatorInfo creatorInfo = this.invokerCreator.get(str);
        java.lang.Object createInstanceFromName = com.tencent.wechat.zidl2.ZidlUtil.createInstanceFromName(creatorInfo.stub);
        com.tencent.wechat.zidl2.ServerInvoker serverInvoker = (com.tencent.wechat.zidl2.ServerInvoker) com.tencent.wechat.zidl2.ZidlUtil.createInstanceFromName(creatorInfo.invoker);
        serverInvoker.name = str;
        serverInvoker.serverId = str2;
        serverInvoker.attachStub(createInstanceFromName);
        return serverInvoker;
    }

    public <TInvoker, TStub> void registerInvoker(java.lang.String str, java.lang.Class<TInvoker> cls, java.lang.Class<TStub> cls2) {
        com.tencent.wechat.zidl2.ServerInvokerFactory.CreatorInfo creatorInfo = new com.tencent.wechat.zidl2.ServerInvokerFactory.CreatorInfo(cls.getName(), cls2.getName());
        java.lang.String name = cls.getName();
        creatorInfo.invoker = name;
        com.tencent.wechat.zlog.Zlog.a(TAG, java.lang.String.format("createInvoker invoker: %s stub:%s", name, creatorInfo.stub), new java.lang.Object[0]);
        this.invokerCreator.put(str, creatorInfo);
        jniRegisterInvoker(str);
    }

    public <TInvoker, TStub> void registerInvokerV2(java.lang.String str, java.lang.Class<TInvoker> cls, java.lang.Class<TStub> cls2) {
        com.tencent.wechat.zidl2.ServerInvokerFactory.CreatorInfo creatorInfo = new com.tencent.wechat.zidl2.ServerInvokerFactory.CreatorInfo(cls.getName(), cls2.getName());
        java.lang.String name = cls.getName();
        creatorInfo.invoker = name;
        com.tencent.wechat.zlog.Zlog.a(TAG, java.lang.String.format("createInvoker invoker: %s stub:%s", name, creatorInfo.stub), new java.lang.Object[0]);
        this.invokerCreator.put(str, creatorInfo);
        jniRegisterInvokerV2(str);
    }
}
