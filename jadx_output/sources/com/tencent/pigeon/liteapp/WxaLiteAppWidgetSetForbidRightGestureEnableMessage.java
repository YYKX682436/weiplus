package com.tencent.pigeon.liteapp;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0013J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/tencent/pigeon/liteapp/WxaLiteAppWidgetSetForbidRightGestureEnableMessage;", "", "appUuid", "", "enable", "", "(JZ)V", "getAppUuid", "()J", "getEnable", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toList", "", "toString", "", "Companion", "wxa_lite_app_widget_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class WxaLiteAppWidgetSetForbidRightGestureEnableMessage {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.liteapp.WxaLiteAppWidgetSetForbidRightGestureEnableMessage.Companion INSTANCE = new com.tencent.pigeon.liteapp.WxaLiteAppWidgetSetForbidRightGestureEnableMessage.Companion(null);
    private final long appUuid;
    private final boolean enable;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/liteapp/WxaLiteAppWidgetSetForbidRightGestureEnableMessage$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/liteapp/WxaLiteAppWidgetSetForbidRightGestureEnableMessage;", "list", "", "wxa_lite_app_widget_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes9.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.liteapp.WxaLiteAppWidgetSetForbidRightGestureEnableMessage fromList(java.util.List<? extends java.lang.Object> list) {
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
            kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.Boolean");
            return new com.tencent.pigeon.liteapp.WxaLiteAppWidgetSetForbidRightGestureEnableMessage(longValue, ((java.lang.Boolean) obj2).booleanValue());
        }
    }

    public WxaLiteAppWidgetSetForbidRightGestureEnableMessage(long j17, boolean z17) {
        this.appUuid = j17;
        this.enable = z17;
    }

    public static /* synthetic */ com.tencent.pigeon.liteapp.WxaLiteAppWidgetSetForbidRightGestureEnableMessage copy$default(com.tencent.pigeon.liteapp.WxaLiteAppWidgetSetForbidRightGestureEnableMessage wxaLiteAppWidgetSetForbidRightGestureEnableMessage, long j17, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            j17 = wxaLiteAppWidgetSetForbidRightGestureEnableMessage.appUuid;
        }
        if ((i17 & 2) != 0) {
            z17 = wxaLiteAppWidgetSetForbidRightGestureEnableMessage.enable;
        }
        return wxaLiteAppWidgetSetForbidRightGestureEnableMessage.copy(j17, z17);
    }

    /* renamed from: component1, reason: from getter */
    public final long getAppUuid() {
        return this.appUuid;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getEnable() {
        return this.enable;
    }

    public final com.tencent.pigeon.liteapp.WxaLiteAppWidgetSetForbidRightGestureEnableMessage copy(long appUuid, boolean enable) {
        return new com.tencent.pigeon.liteapp.WxaLiteAppWidgetSetForbidRightGestureEnableMessage(appUuid, enable);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.liteapp.WxaLiteAppWidgetSetForbidRightGestureEnableMessage)) {
            return false;
        }
        com.tencent.pigeon.liteapp.WxaLiteAppWidgetSetForbidRightGestureEnableMessage wxaLiteAppWidgetSetForbidRightGestureEnableMessage = (com.tencent.pigeon.liteapp.WxaLiteAppWidgetSetForbidRightGestureEnableMessage) other;
        return this.appUuid == wxaLiteAppWidgetSetForbidRightGestureEnableMessage.appUuid && this.enable == wxaLiteAppWidgetSetForbidRightGestureEnableMessage.enable;
    }

    public final long getAppUuid() {
        return this.appUuid;
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public int hashCode() {
        return (java.lang.Long.hashCode(this.appUuid) * 31) + java.lang.Boolean.hashCode(this.enable);
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.c0.i(java.lang.Long.valueOf(this.appUuid), java.lang.Boolean.valueOf(this.enable));
    }

    public java.lang.String toString() {
        return "WxaLiteAppWidgetSetForbidRightGestureEnableMessage(appUuid=" + this.appUuid + ", enable=" + this.enable + ')';
    }
}
