package com.tencent.pigeon.liteapp;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\u0017\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\bHÆ\u0003J?\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\u000e\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001cJ\t\u0010\u001d\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001f"}, d2 = {"Lcom/tencent/pigeon/liteapp/WxaLiteAppWidgetPublishEventToTopPageMessage;", "", "appUuid", "", "nodeId", "eventName", "", com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, "", "(JJLjava/lang/String;Ljava/util/Map;)V", "getAppUuid", "()J", "getData", "()Ljava/util/Map;", "getEventName", "()Ljava/lang/String;", "getNodeId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toList", "", "toString", "Companion", "wxa_lite_app_widget_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class WxaLiteAppWidgetPublishEventToTopPageMessage {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.liteapp.WxaLiteAppWidgetPublishEventToTopPageMessage.Companion INSTANCE = new com.tencent.pigeon.liteapp.WxaLiteAppWidgetPublishEventToTopPageMessage.Companion(null);
    private final long appUuid;
    private final java.util.Map<java.lang.Object, java.lang.Object> data;
    private final java.lang.String eventName;
    private final long nodeId;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/liteapp/WxaLiteAppWidgetPublishEventToTopPageMessage$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/liteapp/WxaLiteAppWidgetPublishEventToTopPageMessage;", "list", "", "wxa_lite_app_widget_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.liteapp.WxaLiteAppWidgetPublishEventToTopPageMessage fromList(java.util.List<? extends java.lang.Object> list) {
            long longValue;
            long longValue2;
            kotlin.jvm.internal.o.g(list, "list");
            java.lang.Object obj = list.get(0);
            if (obj instanceof java.lang.Integer) {
                longValue = ((java.lang.Number) obj).intValue();
            } else {
                kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.Long");
                longValue = ((java.lang.Long) obj).longValue();
            }
            long j17 = longValue;
            java.lang.Object obj2 = list.get(1);
            if (obj2 instanceof java.lang.Integer) {
                longValue2 = ((java.lang.Number) obj2).intValue();
            } else {
                kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.Long");
                longValue2 = ((java.lang.Long) obj2).longValue();
            }
            long j18 = longValue2;
            java.lang.Object obj3 = list.get(2);
            kotlin.jvm.internal.o.e(obj3, "null cannot be cast to non-null type kotlin.String");
            java.lang.Object obj4 = list.get(3);
            kotlin.jvm.internal.o.e(obj4, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.Any, kotlin.Any?>");
            return new com.tencent.pigeon.liteapp.WxaLiteAppWidgetPublishEventToTopPageMessage(j17, j18, (java.lang.String) obj3, (java.util.Map) obj4);
        }
    }

    public WxaLiteAppWidgetPublishEventToTopPageMessage(long j17, long j18, java.lang.String eventName, java.util.Map<java.lang.Object, ? extends java.lang.Object> data) {
        kotlin.jvm.internal.o.g(eventName, "eventName");
        kotlin.jvm.internal.o.g(data, "data");
        this.appUuid = j17;
        this.nodeId = j18;
        this.eventName = eventName;
        this.data = data;
    }

    public static /* synthetic */ com.tencent.pigeon.liteapp.WxaLiteAppWidgetPublishEventToTopPageMessage copy$default(com.tencent.pigeon.liteapp.WxaLiteAppWidgetPublishEventToTopPageMessage wxaLiteAppWidgetPublishEventToTopPageMessage, long j17, long j18, java.lang.String str, java.util.Map map, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            j17 = wxaLiteAppWidgetPublishEventToTopPageMessage.appUuid;
        }
        long j19 = j17;
        if ((i17 & 2) != 0) {
            j18 = wxaLiteAppWidgetPublishEventToTopPageMessage.nodeId;
        }
        long j27 = j18;
        if ((i17 & 4) != 0) {
            str = wxaLiteAppWidgetPublishEventToTopPageMessage.eventName;
        }
        java.lang.String str2 = str;
        if ((i17 & 8) != 0) {
            map = wxaLiteAppWidgetPublishEventToTopPageMessage.data;
        }
        return wxaLiteAppWidgetPublishEventToTopPageMessage.copy(j19, j27, str2, map);
    }

    /* renamed from: component1, reason: from getter */
    public final long getAppUuid() {
        return this.appUuid;
    }

    /* renamed from: component2, reason: from getter */
    public final long getNodeId() {
        return this.nodeId;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getEventName() {
        return this.eventName;
    }

    public final java.util.Map<java.lang.Object, java.lang.Object> component4() {
        return this.data;
    }

    public final com.tencent.pigeon.liteapp.WxaLiteAppWidgetPublishEventToTopPageMessage copy(long appUuid, long nodeId, java.lang.String eventName, java.util.Map<java.lang.Object, ? extends java.lang.Object> data) {
        kotlin.jvm.internal.o.g(eventName, "eventName");
        kotlin.jvm.internal.o.g(data, "data");
        return new com.tencent.pigeon.liteapp.WxaLiteAppWidgetPublishEventToTopPageMessage(appUuid, nodeId, eventName, data);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.liteapp.WxaLiteAppWidgetPublishEventToTopPageMessage)) {
            return false;
        }
        com.tencent.pigeon.liteapp.WxaLiteAppWidgetPublishEventToTopPageMessage wxaLiteAppWidgetPublishEventToTopPageMessage = (com.tencent.pigeon.liteapp.WxaLiteAppWidgetPublishEventToTopPageMessage) other;
        return this.appUuid == wxaLiteAppWidgetPublishEventToTopPageMessage.appUuid && this.nodeId == wxaLiteAppWidgetPublishEventToTopPageMessage.nodeId && kotlin.jvm.internal.o.b(this.eventName, wxaLiteAppWidgetPublishEventToTopPageMessage.eventName) && kotlin.jvm.internal.o.b(this.data, wxaLiteAppWidgetPublishEventToTopPageMessage.data);
    }

    public final long getAppUuid() {
        return this.appUuid;
    }

    public final java.util.Map<java.lang.Object, java.lang.Object> getData() {
        return this.data;
    }

    public final java.lang.String getEventName() {
        return this.eventName;
    }

    public final long getNodeId() {
        return this.nodeId;
    }

    public int hashCode() {
        return (((((java.lang.Long.hashCode(this.appUuid) * 31) + java.lang.Long.hashCode(this.nodeId)) * 31) + this.eventName.hashCode()) * 31) + this.data.hashCode();
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.c0.i(java.lang.Long.valueOf(this.appUuid), java.lang.Long.valueOf(this.nodeId), this.eventName, this.data);
    }

    public java.lang.String toString() {
        return "WxaLiteAppWidgetPublishEventToTopPageMessage(appUuid=" + this.appUuid + ", nodeId=" + this.nodeId + ", eventName=" + this.eventName + ", data=" + this.data + ')';
    }
}
