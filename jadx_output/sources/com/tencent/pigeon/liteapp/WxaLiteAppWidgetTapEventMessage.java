package com.tencent.pigeon.liteapp;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u0017\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005HÆ\u0003J+\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u000e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0014J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/tencent/pigeon/liteapp/WxaLiteAppWidgetTapEventMessage;", "", "appUuid", "", "params", "", "(JLjava/util/Map;)V", "getAppUuid", "()J", "getParams", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toList", "", "toString", "", "Companion", "wxa_lite_app_widget_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class WxaLiteAppWidgetTapEventMessage {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.liteapp.WxaLiteAppWidgetTapEventMessage.Companion INSTANCE = new com.tencent.pigeon.liteapp.WxaLiteAppWidgetTapEventMessage.Companion(null);
    private final long appUuid;
    private final java.util.Map<java.lang.Object, java.lang.Object> params;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/liteapp/WxaLiteAppWidgetTapEventMessage$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/liteapp/WxaLiteAppWidgetTapEventMessage;", "list", "", "wxa_lite_app_widget_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.liteapp.WxaLiteAppWidgetTapEventMessage fromList(java.util.List<? extends java.lang.Object> list) {
            long longValue;
            kotlin.jvm.internal.o.g(list, "list");
            java.lang.Object obj = list.get(0);
            if (obj instanceof java.lang.Integer) {
                longValue = ((java.lang.Number) obj).intValue();
            } else {
                kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.Long");
                longValue = ((java.lang.Long) obj).longValue();
            }
            java.lang.Object obj2 = list.get(1);
            kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.Any, kotlin.Any?>");
            return new com.tencent.pigeon.liteapp.WxaLiteAppWidgetTapEventMessage(longValue, (java.util.Map) obj2);
        }
    }

    public WxaLiteAppWidgetTapEventMessage(long j17, java.util.Map<java.lang.Object, ? extends java.lang.Object> params) {
        kotlin.jvm.internal.o.g(params, "params");
        this.appUuid = j17;
        this.params = params;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.tencent.pigeon.liteapp.WxaLiteAppWidgetTapEventMessage copy$default(com.tencent.pigeon.liteapp.WxaLiteAppWidgetTapEventMessage wxaLiteAppWidgetTapEventMessage, long j17, java.util.Map map, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            j17 = wxaLiteAppWidgetTapEventMessage.appUuid;
        }
        if ((i17 & 2) != 0) {
            map = wxaLiteAppWidgetTapEventMessage.params;
        }
        return wxaLiteAppWidgetTapEventMessage.copy(j17, map);
    }

    /* renamed from: component1, reason: from getter */
    public final long getAppUuid() {
        return this.appUuid;
    }

    public final java.util.Map<java.lang.Object, java.lang.Object> component2() {
        return this.params;
    }

    public final com.tencent.pigeon.liteapp.WxaLiteAppWidgetTapEventMessage copy(long appUuid, java.util.Map<java.lang.Object, ? extends java.lang.Object> params) {
        kotlin.jvm.internal.o.g(params, "params");
        return new com.tencent.pigeon.liteapp.WxaLiteAppWidgetTapEventMessage(appUuid, params);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.liteapp.WxaLiteAppWidgetTapEventMessage)) {
            return false;
        }
        com.tencent.pigeon.liteapp.WxaLiteAppWidgetTapEventMessage wxaLiteAppWidgetTapEventMessage = (com.tencent.pigeon.liteapp.WxaLiteAppWidgetTapEventMessage) other;
        return this.appUuid == wxaLiteAppWidgetTapEventMessage.appUuid && kotlin.jvm.internal.o.b(this.params, wxaLiteAppWidgetTapEventMessage.params);
    }

    public final long getAppUuid() {
        return this.appUuid;
    }

    public final java.util.Map<java.lang.Object, java.lang.Object> getParams() {
        return this.params;
    }

    public int hashCode() {
        return (java.lang.Long.hashCode(this.appUuid) * 31) + this.params.hashCode();
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.c0.i(java.lang.Long.valueOf(this.appUuid), this.params);
    }

    public java.lang.String toString() {
        return "WxaLiteAppWidgetTapEventMessage(appUuid=" + this.appUuid + ", params=" + this.params + ')';
    }
}
