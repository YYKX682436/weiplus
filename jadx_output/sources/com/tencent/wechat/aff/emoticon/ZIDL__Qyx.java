package com.tencent.wechat.aff.emoticon;

/* loaded from: classes11.dex */
class ZIDL__Qyx {
    public static void ZIDL__QyxC2Zdz(java.lang.Object obj) {
        com.tencent.wechat.zlog.Zlog.c("EmoticonCppToNativeOnLoader", "createEmoticonListUpdateEventCenter begin ".concat(java.lang.String.valueOf(obj)), new java.lang.Object[0]);
        com.tencent.wechat.zlog.Zlog.b("EmoticonCppToNativeOnLoader", "EmoticonListUpdateEventCenter impl not registered yet", new java.lang.Object[0]);
        throw null;
    }

    public static void ZIDL__QyxCzbd(java.lang.Object obj) {
        com.tencent.wechat.zlog.Zlog.c("EmoticonCppToNativeOnLoader", "createEmoticonRecoverEventCenter begin ".concat(java.lang.String.valueOf(obj)), new java.lang.Object[0]);
        com.tencent.wechat.zlog.Zlog.b("EmoticonCppToNativeOnLoader", "EmoticonRecoverEventCenter impl not registered yet", new java.lang.Object[0]);
        throw null;
    }

    public static void ZIDL__QyxS27J(java.lang.Object obj) {
        com.tencent.wechat.zlog.Zlog.c("EmoticonCppToNativeOnLoader", "createEmoticonStoreEventCenter begin ".concat(java.lang.String.valueOf(obj)), new java.lang.Object[0]);
        com.tencent.wechat.zlog.Zlog.b("EmoticonCppToNativeOnLoader", "EmoticonStoreEventCenter impl not registered yet", new java.lang.Object[0]);
        throw null;
    }

    public static void ZIDL__QyxexyM(java.lang.Object obj) {
        com.tencent.wechat.zlog.Zlog.c("EmoticonCppToNativeOnLoader", "createEmoticonBoardDataEventCenter begin ".concat(java.lang.String.valueOf(obj)), new java.lang.Object[0]);
        com.tencent.wechat.zlog.Zlog.b("EmoticonCppToNativeOnLoader", "EmoticonBoardDataEventCenter impl not registered yet", new java.lang.Object[0]);
        throw null;
    }

    public static void ZIDL__Qyxf8c6(java.lang.Object obj) {
        com.tencent.wechat.zlog.Zlog.c("EmoticonCppToNativeOnLoader", "createEmoticonPackageListUpdateEventCenter begin ".concat(java.lang.String.valueOf(obj)), new java.lang.Object[0]);
        com.tencent.wechat.zlog.Zlog.b("EmoticonCppToNativeOnLoader", "EmoticonPackageListUpdateEventCenter impl not registered yet", new java.lang.Object[0]);
        throw null;
    }

    public static void ZIDL__QyxtUAH(java.lang.Object obj) {
        com.tencent.wechat.zlog.Zlog.c("EmoticonCppToNativeOnLoader", "createEmoticonDesignerListDataReciever begin ".concat(java.lang.String.valueOf(obj)), new java.lang.Object[0]);
        com.tencent.wechat.zidl2.ZidlBaseBridge zidlBaseBridge = (com.tencent.wechat.zidl2.ZidlBaseBridge) obj;
        com.tencent.wechat.zidl2.ZidlStubCreator zidlStubCreator = com.tencent.wechat.aff.emoticon.c.f216635a;
        if (zidlStubCreator == null) {
            com.tencent.wechat.zlog.Zlog.b("EmoticonCppToNativeOnLoader", "EmoticonDesignerListDataReciever impl not registered yet", new java.lang.Object[0]);
            throw null;
        }
        java.lang.Object createZidlStub = zidlStubCreator.createZidlStub();
        zidlBaseBridge.attachStub(createZidlStub);
        com.tencent.wechat.zlog.Zlog.c("EmoticonCppToNativeOnLoader", "createEmoticonDesignerListDataReciever done ".concat(java.lang.String.valueOf(createZidlStub)), new java.lang.Object[0]);
    }

    public static void ZIDL__QyxtZkp(java.lang.Object obj) {
        com.tencent.wechat.zlog.Zlog.c("EmoticonCppToNativeOnLoader", "createEmoticonDesignerPortfolioPackDataReciever begin ".concat(java.lang.String.valueOf(obj)), new java.lang.Object[0]);
        com.tencent.wechat.zidl2.ZidlBaseBridge zidlBaseBridge = (com.tencent.wechat.zidl2.ZidlBaseBridge) obj;
        com.tencent.wechat.zidl2.ZidlStubCreator zidlStubCreator = com.tencent.wechat.aff.emoticon.c.f216636b;
        if (zidlStubCreator == null) {
            com.tencent.wechat.zlog.Zlog.b("EmoticonCppToNativeOnLoader", "EmoticonDesignerPortfolioPackDataReciever impl not registered yet", new java.lang.Object[0]);
            throw null;
        }
        java.lang.Object createZidlStub = zidlStubCreator.createZidlStub();
        zidlBaseBridge.attachStub(createZidlStub);
        com.tencent.wechat.zlog.Zlog.c("EmoticonCppToNativeOnLoader", "createEmoticonDesignerPortfolioPackDataReciever done ".concat(java.lang.String.valueOf(createZidlStub)), new java.lang.Object[0]);
    }
}
