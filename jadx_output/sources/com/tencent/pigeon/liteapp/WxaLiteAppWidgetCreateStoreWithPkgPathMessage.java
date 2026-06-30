package com.tencent.pigeon.liteapp;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u000e\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0017J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u001a"}, d2 = {"Lcom/tencent/pigeon/liteapp/WxaLiteAppWidgetCreateStoreWithPkgPathMessage;", "", "appId", "", "aliveSeconds", "", "pkgPath", "(Ljava/lang/String;JLjava/lang/String;)V", "getAliveSeconds", "()J", "getAppId", "()Ljava/lang/String;", "getPkgPath", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toList", "", "toString", "Companion", "wxa_lite_app_widget_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class WxaLiteAppWidgetCreateStoreWithPkgPathMessage {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.liteapp.WxaLiteAppWidgetCreateStoreWithPkgPathMessage.Companion INSTANCE = new com.tencent.pigeon.liteapp.WxaLiteAppWidgetCreateStoreWithPkgPathMessage.Companion(null);
    private final long aliveSeconds;
    private final java.lang.String appId;
    private final java.lang.String pkgPath;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/liteapp/WxaLiteAppWidgetCreateStoreWithPkgPathMessage$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/liteapp/WxaLiteAppWidgetCreateStoreWithPkgPathMessage;", "list", "", "wxa_lite_app_widget_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.liteapp.WxaLiteAppWidgetCreateStoreWithPkgPathMessage fromList(java.util.List<? extends java.lang.Object> list) {
            long longValue;
            kotlin.jvm.internal.o.g(list, "list");
            java.lang.Object obj = list.get(0);
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.String");
            java.lang.String str = (java.lang.String) obj;
            java.lang.Object obj2 = list.get(1);
            if (obj2 instanceof java.lang.Integer) {
                longValue = ((java.lang.Number) obj2).intValue();
            } else {
                kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.Long");
                longValue = ((java.lang.Long) obj2).longValue();
            }
            java.lang.Object obj3 = list.get(2);
            kotlin.jvm.internal.o.e(obj3, "null cannot be cast to non-null type kotlin.String");
            return new com.tencent.pigeon.liteapp.WxaLiteAppWidgetCreateStoreWithPkgPathMessage(str, longValue, (java.lang.String) obj3);
        }
    }

    public WxaLiteAppWidgetCreateStoreWithPkgPathMessage(java.lang.String appId, long j17, java.lang.String pkgPath) {
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(pkgPath, "pkgPath");
        this.appId = appId;
        this.aliveSeconds = j17;
        this.pkgPath = pkgPath;
    }

    public static /* synthetic */ com.tencent.pigeon.liteapp.WxaLiteAppWidgetCreateStoreWithPkgPathMessage copy$default(com.tencent.pigeon.liteapp.WxaLiteAppWidgetCreateStoreWithPkgPathMessage wxaLiteAppWidgetCreateStoreWithPkgPathMessage, java.lang.String str, long j17, java.lang.String str2, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            str = wxaLiteAppWidgetCreateStoreWithPkgPathMessage.appId;
        }
        if ((i17 & 2) != 0) {
            j17 = wxaLiteAppWidgetCreateStoreWithPkgPathMessage.aliveSeconds;
        }
        if ((i17 & 4) != 0) {
            str2 = wxaLiteAppWidgetCreateStoreWithPkgPathMessage.pkgPath;
        }
        return wxaLiteAppWidgetCreateStoreWithPkgPathMessage.copy(str, j17, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getAppId() {
        return this.appId;
    }

    /* renamed from: component2, reason: from getter */
    public final long getAliveSeconds() {
        return this.aliveSeconds;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getPkgPath() {
        return this.pkgPath;
    }

    public final com.tencent.pigeon.liteapp.WxaLiteAppWidgetCreateStoreWithPkgPathMessage copy(java.lang.String appId, long aliveSeconds, java.lang.String pkgPath) {
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(pkgPath, "pkgPath");
        return new com.tencent.pigeon.liteapp.WxaLiteAppWidgetCreateStoreWithPkgPathMessage(appId, aliveSeconds, pkgPath);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.liteapp.WxaLiteAppWidgetCreateStoreWithPkgPathMessage)) {
            return false;
        }
        com.tencent.pigeon.liteapp.WxaLiteAppWidgetCreateStoreWithPkgPathMessage wxaLiteAppWidgetCreateStoreWithPkgPathMessage = (com.tencent.pigeon.liteapp.WxaLiteAppWidgetCreateStoreWithPkgPathMessage) other;
        return kotlin.jvm.internal.o.b(this.appId, wxaLiteAppWidgetCreateStoreWithPkgPathMessage.appId) && this.aliveSeconds == wxaLiteAppWidgetCreateStoreWithPkgPathMessage.aliveSeconds && kotlin.jvm.internal.o.b(this.pkgPath, wxaLiteAppWidgetCreateStoreWithPkgPathMessage.pkgPath);
    }

    public final long getAliveSeconds() {
        return this.aliveSeconds;
    }

    public final java.lang.String getAppId() {
        return this.appId;
    }

    public final java.lang.String getPkgPath() {
        return this.pkgPath;
    }

    public int hashCode() {
        return (((this.appId.hashCode() * 31) + java.lang.Long.hashCode(this.aliveSeconds)) * 31) + this.pkgPath.hashCode();
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.c0.i(this.appId, java.lang.Long.valueOf(this.aliveSeconds), this.pkgPath);
    }

    public java.lang.String toString() {
        return "WxaLiteAppWidgetCreateStoreWithPkgPathMessage(appId=" + this.appId + ", aliveSeconds=" + this.aliveSeconds + ", pkgPath=" + this.pkgPath + ')';
    }
}
