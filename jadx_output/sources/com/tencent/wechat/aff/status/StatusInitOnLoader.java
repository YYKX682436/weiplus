package com.tencent.wechat.aff.status;

/* loaded from: classes11.dex */
public class StatusInitOnLoader {
    static java.lang.String TAG = "StatusInitOnLoader";
    private static com.tencent.wechat.aff.status.StatusInitOnLoader instance = new com.tencent.wechat.aff.status.StatusInitOnLoader();
    private static com.tencent.wechat.zidl2.ZidlStubCreator statusInitManagerRegistedCreator = null;

    public static void createStatusInitManager(java.lang.Object obj) {
        com.tencent.wechat.zlog.Zlog.c(TAG, "createStatusInitManager begin ".concat(java.lang.String.valueOf(obj)), new java.lang.Object[0]);
        com.tencent.wechat.zidl2.ZidlBaseBridge zidlBaseBridge = (com.tencent.wechat.zidl2.ZidlBaseBridge) obj;
        com.tencent.wechat.zidl2.ZidlStubCreator zidlStubCreator = statusInitManagerRegistedCreator;
        if (zidlStubCreator == null) {
            com.tencent.wechat.zlog.Zlog.b(TAG, "StatusInitManager impl not registered yet", new java.lang.Object[0]);
            throw null;
        }
        java.lang.Object createZidlStub = zidlStubCreator.createZidlStub();
        zidlBaseBridge.attachStub(createZidlStub);
        com.tencent.wechat.zlog.Zlog.c(TAG, "createStatusInitManager done ".concat(java.lang.String.valueOf(createZidlStub)), new java.lang.Object[0]);
    }

    public static com.tencent.wechat.aff.status.StatusInitOnLoader getInstance() {
        return instance;
    }

    public void onLoader() {
    }

    public void registerStatusInitManager(com.tencent.wechat.zidl2.ZidlStubCreator zidlStubCreator) {
        statusInitManagerRegistedCreator = zidlStubCreator;
    }
}
