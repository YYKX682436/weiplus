package com.tencent.mm.plugin.lite.config;

/* loaded from: classes15.dex */
public class LiteAppConfigModel {
    public com.tencent.mm.plugin.lite.config.LiteAppConfigModel.LiteAppConfigStoreModel store = new com.tencent.mm.plugin.lite.config.LiteAppConfigModel.LiteAppConfigStoreModel();
    public com.tencent.mm.plugin.lite.config.LiteAppConfigModel.LiteAppConfigShareModel share = new com.tencent.mm.plugin.lite.config.LiteAppConfigModel.LiteAppConfigShareModel();
    public com.tencent.mm.plugin.lite.config.LiteAppConfigModel.LiteAppConfigSystemPermissionModel systemPermission = new com.tencent.mm.plugin.lite.config.LiteAppConfigModel.LiteAppConfigSystemPermissionModel();
    public com.tencent.mm.plugin.lite.config.LiteAppConfigModel.LiteAppConfigJsApiModel jsapi = new com.tencent.mm.plugin.lite.config.LiteAppConfigModel.LiteAppConfigJsApiModel();
    public java.util.Map<java.lang.String, com.tencent.mm.plugin.lite.config.LiteAppConfigModel.LiteAppConfigModuleModel> module = new java.util.HashMap();
    public java.util.List<com.tencent.mm.plugin.lite.config.LiteAppConfigModel.LiteAppConfigTriggerAction> triggerActions = new java.util.ArrayList();
    public boolean globalUpdate = false;
    public com.tencent.mm.plugin.lite.config.LiteAppConfigModel.LiteAppConfigCapability capability = new com.tencent.mm.plugin.lite.config.LiteAppConfigModel.LiteAppConfigCapability();

    /* loaded from: classes15.dex */
    public static class LiteAppConfigAction {
        public java.lang.String name = "";
        public java.lang.Object payload = new java.lang.Object();
    }

    /* loaded from: classes8.dex */
    public static class LiteAppConfigCapability {
        public com.tencent.mm.plugin.lite.config.LiteAppConfigModel.LiteAppConfigVoiceToText voiceToText = new com.tencent.mm.plugin.lite.config.LiteAppConfigModel.LiteAppConfigVoiceToText();
        public com.tencent.mm.plugin.lite.config.LiteAppConfigModel.LiteAppWebviewJsApi webviewJsApi = new com.tencent.mm.plugin.lite.config.LiteAppConfigModel.LiteAppWebviewJsApi();
    }

    /* loaded from: classes15.dex */
    public static class LiteAppConfigHandler {
        public java.lang.String type = "";
        public boolean withEventExtra = false;
        public com.tencent.mm.plugin.lite.config.LiteAppConfigModel.LiteAppConfigAction action = new com.tencent.mm.plugin.lite.config.LiteAppConfigModel.LiteAppConfigAction();
    }

    /* loaded from: classes5.dex */
    public static class LiteAppConfigJsApiModel {
        public java.util.List<java.lang.String> allowedJsApiList = new java.util.ArrayList();
    }

    /* loaded from: classes5.dex */
    public static class LiteAppConfigModuleModel {
        public java.util.List<java.lang.String> allowedMethods = new java.util.ArrayList();
        public boolean allowedAll = false;
    }

    /* loaded from: classes9.dex */
    public static class LiteAppConfigShareModel {
        public java.util.List<java.lang.String> allowedShareAppIdList = new java.util.ArrayList();
    }

    /* loaded from: classes15.dex */
    public static class LiteAppConfigStoreModel {
        public java.lang.Boolean scheduleWakeUp = java.lang.Boolean.FALSE;
    }

    /* loaded from: classes10.dex */
    public static class LiteAppConfigSystemPermissionModel {
        public java.lang.String businessScene = "0";
        public java.lang.String businessName = "liteapp";
    }

    /* loaded from: classes5.dex */
    public static class LiteAppConfigTriggerAction {
        public java.util.List<com.tencent.mm.plugin.lite.config.LiteAppConfigModel.LiteAppConfigTriggerWhen> when = new java.util.ArrayList();
        public java.util.List<com.tencent.mm.plugin.lite.config.LiteAppConfigModel.LiteAppConfigHandler> handlers = new java.util.ArrayList();
    }

    /* loaded from: classes5.dex */
    public static class LiteAppConfigTriggerWhen {
        public java.lang.String eventName = "";
        public java.lang.Object condition = new java.lang.Object();
    }

    /* loaded from: classes8.dex */
    public static class LiteAppConfigVoiceToText {
        public int scene = 0;
    }

    /* loaded from: classes8.dex */
    public static class LiteAppWebviewJsApi {
        public java.util.List<java.lang.String> allowedList = new java.util.ArrayList();
    }

    public java.lang.String toString() {
        return new com.google.gson.i().g(this);
    }
}
