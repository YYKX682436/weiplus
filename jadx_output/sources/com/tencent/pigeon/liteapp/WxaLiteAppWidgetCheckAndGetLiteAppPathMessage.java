package com.tencent.pigeon.liteapp;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u000e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0016J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0019"}, d2 = {"Lcom/tencent/pigeon/liteapp/WxaLiteAppWidgetCheckAndGetLiteAppPathMessage;", "", "appId", "", "checkUpdate", "", "syncCheckUpdate", "(Ljava/lang/String;ZZ)V", "getAppId", "()Ljava/lang/String;", "getCheckUpdate", "()Z", "getSyncCheckUpdate", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toList", "", "toString", "Companion", "wxa_lite_app_widget_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class WxaLiteAppWidgetCheckAndGetLiteAppPathMessage {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.liteapp.WxaLiteAppWidgetCheckAndGetLiteAppPathMessage.Companion INSTANCE = new com.tencent.pigeon.liteapp.WxaLiteAppWidgetCheckAndGetLiteAppPathMessage.Companion(null);
    private final java.lang.String appId;
    private final boolean checkUpdate;
    private final boolean syncCheckUpdate;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/liteapp/WxaLiteAppWidgetCheckAndGetLiteAppPathMessage$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/liteapp/WxaLiteAppWidgetCheckAndGetLiteAppPathMessage;", "list", "", "wxa_lite_app_widget_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.liteapp.WxaLiteAppWidgetCheckAndGetLiteAppPathMessage fromList(java.util.List<? extends java.lang.Object> list) {
            kotlin.jvm.internal.o.g(list, "list");
            java.lang.Object obj = list.get(0);
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.String");
            java.lang.Object obj2 = list.get(1);
            kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.Boolean");
            boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
            java.lang.Object obj3 = list.get(2);
            kotlin.jvm.internal.o.e(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            return new com.tencent.pigeon.liteapp.WxaLiteAppWidgetCheckAndGetLiteAppPathMessage((java.lang.String) obj, booleanValue, ((java.lang.Boolean) obj3).booleanValue());
        }
    }

    public WxaLiteAppWidgetCheckAndGetLiteAppPathMessage(java.lang.String appId, boolean z17, boolean z18) {
        kotlin.jvm.internal.o.g(appId, "appId");
        this.appId = appId;
        this.checkUpdate = z17;
        this.syncCheckUpdate = z18;
    }

    public static /* synthetic */ com.tencent.pigeon.liteapp.WxaLiteAppWidgetCheckAndGetLiteAppPathMessage copy$default(com.tencent.pigeon.liteapp.WxaLiteAppWidgetCheckAndGetLiteAppPathMessage wxaLiteAppWidgetCheckAndGetLiteAppPathMessage, java.lang.String str, boolean z17, boolean z18, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            str = wxaLiteAppWidgetCheckAndGetLiteAppPathMessage.appId;
        }
        if ((i17 & 2) != 0) {
            z17 = wxaLiteAppWidgetCheckAndGetLiteAppPathMessage.checkUpdate;
        }
        if ((i17 & 4) != 0) {
            z18 = wxaLiteAppWidgetCheckAndGetLiteAppPathMessage.syncCheckUpdate;
        }
        return wxaLiteAppWidgetCheckAndGetLiteAppPathMessage.copy(str, z17, z18);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getAppId() {
        return this.appId;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getCheckUpdate() {
        return this.checkUpdate;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getSyncCheckUpdate() {
        return this.syncCheckUpdate;
    }

    public final com.tencent.pigeon.liteapp.WxaLiteAppWidgetCheckAndGetLiteAppPathMessage copy(java.lang.String appId, boolean checkUpdate, boolean syncCheckUpdate) {
        kotlin.jvm.internal.o.g(appId, "appId");
        return new com.tencent.pigeon.liteapp.WxaLiteAppWidgetCheckAndGetLiteAppPathMessage(appId, checkUpdate, syncCheckUpdate);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.liteapp.WxaLiteAppWidgetCheckAndGetLiteAppPathMessage)) {
            return false;
        }
        com.tencent.pigeon.liteapp.WxaLiteAppWidgetCheckAndGetLiteAppPathMessage wxaLiteAppWidgetCheckAndGetLiteAppPathMessage = (com.tencent.pigeon.liteapp.WxaLiteAppWidgetCheckAndGetLiteAppPathMessage) other;
        return kotlin.jvm.internal.o.b(this.appId, wxaLiteAppWidgetCheckAndGetLiteAppPathMessage.appId) && this.checkUpdate == wxaLiteAppWidgetCheckAndGetLiteAppPathMessage.checkUpdate && this.syncCheckUpdate == wxaLiteAppWidgetCheckAndGetLiteAppPathMessage.syncCheckUpdate;
    }

    public final java.lang.String getAppId() {
        return this.appId;
    }

    public final boolean getCheckUpdate() {
        return this.checkUpdate;
    }

    public final boolean getSyncCheckUpdate() {
        return this.syncCheckUpdate;
    }

    public int hashCode() {
        return (((this.appId.hashCode() * 31) + java.lang.Boolean.hashCode(this.checkUpdate)) * 31) + java.lang.Boolean.hashCode(this.syncCheckUpdate);
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.c0.i(this.appId, java.lang.Boolean.valueOf(this.checkUpdate), java.lang.Boolean.valueOf(this.syncCheckUpdate));
    }

    public java.lang.String toString() {
        return "WxaLiteAppWidgetCheckAndGetLiteAppPathMessage(appId=" + this.appId + ", checkUpdate=" + this.checkUpdate + ", syncCheckUpdate=" + this.syncCheckUpdate + ')';
    }
}
