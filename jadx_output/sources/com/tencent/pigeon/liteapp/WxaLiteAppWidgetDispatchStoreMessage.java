package com.tencent.pigeon.liteapp;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u0017\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006HÆ\u0003J5\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u000e\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0017J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u001f\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001a"}, d2 = {"Lcom/tencent/pigeon/liteapp/WxaLiteAppWidgetDispatchStoreMessage;", "", "appId", "", "actionName", "params", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getActionName", "()Ljava/lang/String;", "getAppId", "getParams", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toList", "", "toString", "Companion", "wxa_lite_app_widget_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class WxaLiteAppWidgetDispatchStoreMessage {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.liteapp.WxaLiteAppWidgetDispatchStoreMessage.Companion INSTANCE = new com.tencent.pigeon.liteapp.WxaLiteAppWidgetDispatchStoreMessage.Companion(null);
    private final java.lang.String actionName;
    private final java.lang.String appId;
    private final java.util.Map<java.lang.Object, java.lang.Object> params;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/liteapp/WxaLiteAppWidgetDispatchStoreMessage$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/liteapp/WxaLiteAppWidgetDispatchStoreMessage;", "list", "", "wxa_lite_app_widget_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.liteapp.WxaLiteAppWidgetDispatchStoreMessage fromList(java.util.List<? extends java.lang.Object> list) {
            kotlin.jvm.internal.o.g(list, "list");
            java.lang.Object obj = list.get(0);
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.String");
            java.lang.Object obj2 = list.get(1);
            kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.String");
            java.lang.Object obj3 = list.get(2);
            kotlin.jvm.internal.o.e(obj3, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.Any, kotlin.Any?>");
            return new com.tencent.pigeon.liteapp.WxaLiteAppWidgetDispatchStoreMessage((java.lang.String) obj, (java.lang.String) obj2, (java.util.Map) obj3);
        }
    }

    public WxaLiteAppWidgetDispatchStoreMessage(java.lang.String appId, java.lang.String actionName, java.util.Map<java.lang.Object, ? extends java.lang.Object> params) {
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(actionName, "actionName");
        kotlin.jvm.internal.o.g(params, "params");
        this.appId = appId;
        this.actionName = actionName;
        this.params = params;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.tencent.pigeon.liteapp.WxaLiteAppWidgetDispatchStoreMessage copy$default(com.tencent.pigeon.liteapp.WxaLiteAppWidgetDispatchStoreMessage wxaLiteAppWidgetDispatchStoreMessage, java.lang.String str, java.lang.String str2, java.util.Map map, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            str = wxaLiteAppWidgetDispatchStoreMessage.appId;
        }
        if ((i17 & 2) != 0) {
            str2 = wxaLiteAppWidgetDispatchStoreMessage.actionName;
        }
        if ((i17 & 4) != 0) {
            map = wxaLiteAppWidgetDispatchStoreMessage.params;
        }
        return wxaLiteAppWidgetDispatchStoreMessage.copy(str, str2, map);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getAppId() {
        return this.appId;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getActionName() {
        return this.actionName;
    }

    public final java.util.Map<java.lang.Object, java.lang.Object> component3() {
        return this.params;
    }

    public final com.tencent.pigeon.liteapp.WxaLiteAppWidgetDispatchStoreMessage copy(java.lang.String appId, java.lang.String actionName, java.util.Map<java.lang.Object, ? extends java.lang.Object> params) {
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(actionName, "actionName");
        kotlin.jvm.internal.o.g(params, "params");
        return new com.tencent.pigeon.liteapp.WxaLiteAppWidgetDispatchStoreMessage(appId, actionName, params);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.liteapp.WxaLiteAppWidgetDispatchStoreMessage)) {
            return false;
        }
        com.tencent.pigeon.liteapp.WxaLiteAppWidgetDispatchStoreMessage wxaLiteAppWidgetDispatchStoreMessage = (com.tencent.pigeon.liteapp.WxaLiteAppWidgetDispatchStoreMessage) other;
        return kotlin.jvm.internal.o.b(this.appId, wxaLiteAppWidgetDispatchStoreMessage.appId) && kotlin.jvm.internal.o.b(this.actionName, wxaLiteAppWidgetDispatchStoreMessage.actionName) && kotlin.jvm.internal.o.b(this.params, wxaLiteAppWidgetDispatchStoreMessage.params);
    }

    public final java.lang.String getActionName() {
        return this.actionName;
    }

    public final java.lang.String getAppId() {
        return this.appId;
    }

    public final java.util.Map<java.lang.Object, java.lang.Object> getParams() {
        return this.params;
    }

    public int hashCode() {
        return (((this.appId.hashCode() * 31) + this.actionName.hashCode()) * 31) + this.params.hashCode();
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.c0.i(this.appId, this.actionName, this.params);
    }

    public java.lang.String toString() {
        return "WxaLiteAppWidgetDispatchStoreMessage(appId=" + this.appId + ", actionName=" + this.actionName + ", params=" + this.params + ')';
    }
}
