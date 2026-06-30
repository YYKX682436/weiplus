package com.tencent.wechat.aff.game;

/* loaded from: classes8.dex */
class ZIDL_gfwl {
    public static void ZIDL_gfwlHBPo(java.lang.Object obj) {
        com.tencent.wechat.zlog.Zlog.c("GameCppNativeOnLoader", "createGameSyncCppToNativeManager begin ".concat(java.lang.String.valueOf(obj)), new java.lang.Object[0]);
        com.tencent.wechat.zidl2.ZidlBaseBridge zidlBaseBridge = (com.tencent.wechat.zidl2.ZidlBaseBridge) obj;
        com.tencent.wechat.zidl2.ZidlStubCreator zidlStubCreator = com.tencent.wechat.aff.game.d.f216924a;
        if (zidlStubCreator == null) {
            com.tencent.wechat.zlog.Zlog.b("GameCppNativeOnLoader", "GameSyncCppToNativeManager impl not registered yet", new java.lang.Object[0]);
            throw null;
        }
        java.lang.Object createZidlStub = zidlStubCreator.createZidlStub();
        zidlBaseBridge.attachStub(createZidlStub);
        com.tencent.wechat.zlog.Zlog.c("GameCppNativeOnLoader", "createGameSyncCppToNativeManager done ".concat(java.lang.String.valueOf(createZidlStub)), new java.lang.Object[0]);
    }
}
