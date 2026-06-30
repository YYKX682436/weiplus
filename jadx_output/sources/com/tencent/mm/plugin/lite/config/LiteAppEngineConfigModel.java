package com.tencent.mm.plugin.lite.config;

/* loaded from: classes15.dex */
public class LiteAppEngineConfigModel {
    public com.tencent.mm.plugin.lite.config.LiteAppEngineConfigModel.LiteAppEngineConfigStarTaskModel starTask = new com.tencent.mm.plugin.lite.config.LiteAppEngineConfigModel.LiteAppEngineConfigStarTaskModel();
    public com.tencent.mm.plugin.lite.config.LiteAppEngineConfigModel.LiteAppEngineConfigMinimizeTaskModel minimizeTask = new com.tencent.mm.plugin.lite.config.LiteAppEngineConfigModel.LiteAppEngineConfigMinimizeTaskModel();
    public java.util.Map<java.lang.String, com.tencent.mm.plugin.lite.config.LiteAppEngineConfigModel.LiteAppEngineConfigJsApiModel> jsapi = new java.util.HashMap();
    public java.util.Map<java.lang.String, com.tencent.mm.plugin.lite.config.LiteAppEngineConfigModel.LiteAppEngineConfigModuleModel> module = new java.util.HashMap();

    /* loaded from: classes15.dex */
    public static class LiteAppEngineConfigJsApiModel {
        public java.lang.String visibility = "public";
        public java.util.List<java.lang.String> allowedAppIds = new java.util.ArrayList();
    }

    /* loaded from: classes15.dex */
    public static class LiteAppEngineConfigMethodModel {
        public java.lang.String visibility = "public";
        public java.util.List<java.lang.String> allowedAppIds = new java.util.ArrayList();
    }

    /* loaded from: classes15.dex */
    public static class LiteAppEngineConfigMinimizeTaskModel {
        public int aliveCount = 1;
        public int aliveTime = 180;
    }

    /* loaded from: classes15.dex */
    public static class LiteAppEngineConfigModuleModel {
        public java.lang.String visibility = "public";
        public java.util.List<java.lang.String> allowedAppIds = new java.util.ArrayList();
        public java.util.Map<java.lang.String, com.tencent.mm.plugin.lite.config.LiteAppEngineConfigModel.LiteAppEngineConfigMethodModel> methods = new java.util.HashMap();
    }

    /* loaded from: classes15.dex */
    public static class LiteAppEngineConfigStarTaskModel {
        public int aliveCount = 1;
        public int aliveTime = 180;
    }

    public java.lang.String toString() {
        return new com.google.gson.i().g(this);
    }
}
