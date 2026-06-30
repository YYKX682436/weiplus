package com.tencent.pigeon.liteapp;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000fJ\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0013"}, d2 = {"Lcom/tencent/pigeon/liteapp/WxaLiteAppWidgetDestroyMessage;", "", "appUuid", "", "(J)V", "getAppUuid", "()J", "component1", "copy", "equals", "", "other", "hashCode", "", "toList", "", "toString", "", "Companion", "wxa_lite_app_widget_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class WxaLiteAppWidgetDestroyMessage {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.liteapp.WxaLiteAppWidgetDestroyMessage.Companion INSTANCE = new com.tencent.pigeon.liteapp.WxaLiteAppWidgetDestroyMessage.Companion(null);
    private final long appUuid;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/liteapp/WxaLiteAppWidgetDestroyMessage$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/liteapp/WxaLiteAppWidgetDestroyMessage;", "list", "", "wxa_lite_app_widget_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.liteapp.WxaLiteAppWidgetDestroyMessage fromList(java.util.List<? extends java.lang.Object> list) {
            long longValue;
            kotlin.jvm.internal.o.g(list, "list");
            java.lang.Object obj = list.get(0);
            if (obj instanceof java.lang.Integer) {
                longValue = ((java.lang.Number) obj).intValue();
            } else {
                kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.Long");
                longValue = ((java.lang.Long) obj).longValue();
            }
            return new com.tencent.pigeon.liteapp.WxaLiteAppWidgetDestroyMessage(longValue);
        }
    }

    public WxaLiteAppWidgetDestroyMessage(long j17) {
        this.appUuid = j17;
    }

    public static /* synthetic */ com.tencent.pigeon.liteapp.WxaLiteAppWidgetDestroyMessage copy$default(com.tencent.pigeon.liteapp.WxaLiteAppWidgetDestroyMessage wxaLiteAppWidgetDestroyMessage, long j17, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            j17 = wxaLiteAppWidgetDestroyMessage.appUuid;
        }
        return wxaLiteAppWidgetDestroyMessage.copy(j17);
    }

    /* renamed from: component1, reason: from getter */
    public final long getAppUuid() {
        return this.appUuid;
    }

    public final com.tencent.pigeon.liteapp.WxaLiteAppWidgetDestroyMessage copy(long appUuid) {
        return new com.tencent.pigeon.liteapp.WxaLiteAppWidgetDestroyMessage(appUuid);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.tencent.pigeon.liteapp.WxaLiteAppWidgetDestroyMessage) && this.appUuid == ((com.tencent.pigeon.liteapp.WxaLiteAppWidgetDestroyMessage) other).appUuid;
    }

    public final long getAppUuid() {
        return this.appUuid;
    }

    public int hashCode() {
        return java.lang.Long.hashCode(this.appUuid);
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.b0.c(java.lang.Long.valueOf(this.appUuid));
    }

    public java.lang.String toString() {
        return "WxaLiteAppWidgetDestroyMessage(appUuid=" + this.appUuid + ')';
    }
}
