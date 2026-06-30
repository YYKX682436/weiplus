package com.tencent.wechat.aff.websearch;

/* loaded from: classes8.dex */
public class WebsearchPlatformManagerOnLoader {
    static java.lang.String TAG = "WebsearchPlatformManagerOnLoader";
    private static com.tencent.wechat.aff.websearch.WebsearchPlatformManagerOnLoader instance = new com.tencent.wechat.aff.websearch.WebsearchPlatformManagerOnLoader();
    private static com.tencent.wechat.zidl2.ZidlStubCreator webSearchPlatformManagerRegistedCreator = null;

    public static void createWebSearchPlatformManager(java.lang.Object obj) {
        com.tencent.wechat.zlog.Zlog.c(TAG, "createWebSearchPlatformManager begin ".concat(java.lang.String.valueOf(obj)), new java.lang.Object[0]);
        com.tencent.wechat.zidl2.ZidlBaseBridge zidlBaseBridge = (com.tencent.wechat.zidl2.ZidlBaseBridge) obj;
        com.tencent.wechat.zidl2.ZidlStubCreator zidlStubCreator = webSearchPlatformManagerRegistedCreator;
        if (zidlStubCreator == null) {
            com.tencent.wechat.zlog.Zlog.b(TAG, "WebSearchPlatformManager impl not registered yet", new java.lang.Object[0]);
            throw null;
        }
        java.lang.Object createZidlStub = zidlStubCreator.createZidlStub();
        zidlBaseBridge.attachStub(createZidlStub);
        com.tencent.wechat.zlog.Zlog.c(TAG, "createWebSearchPlatformManager done ".concat(java.lang.String.valueOf(createZidlStub)), new java.lang.Object[0]);
    }

    public static com.tencent.wechat.aff.websearch.WebsearchPlatformManagerOnLoader getInstance() {
        return instance;
    }

    public void onLoader() {
    }

    public void registerWebSearchPlatformManager(com.tencent.wechat.zidl2.ZidlStubCreator zidlStubCreator) {
        webSearchPlatformManagerRegistedCreator = zidlStubCreator;
    }
}
