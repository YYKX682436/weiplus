package com.tencent.pigeon.liteapp;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005HÆ\u0003J%\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u000e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0019\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/tencent/pigeon/liteapp/WxaLiteAppWidgetSubscribeStoreMessage;", "", "appId", "", "pointers", "", "(Ljava/lang/String;Ljava/util/List;)V", "getAppId", "()Ljava/lang/String;", "getPointers", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toList", "toString", "Companion", "wxa_lite_app_widget_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class WxaLiteAppWidgetSubscribeStoreMessage {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.liteapp.WxaLiteAppWidgetSubscribeStoreMessage.Companion INSTANCE = new com.tencent.pigeon.liteapp.WxaLiteAppWidgetSubscribeStoreMessage.Companion(null);
    private final java.lang.String appId;
    private final java.util.List<java.lang.String> pointers;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/liteapp/WxaLiteAppWidgetSubscribeStoreMessage$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/liteapp/WxaLiteAppWidgetSubscribeStoreMessage;", "list", "", "wxa_lite_app_widget_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.liteapp.WxaLiteAppWidgetSubscribeStoreMessage fromList(java.util.List<? extends java.lang.Object> list) {
            kotlin.jvm.internal.o.g(list, "list");
            java.lang.Object obj = list.get(0);
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.String");
            java.lang.Object obj2 = list.get(1);
            kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String?>");
            return new com.tencent.pigeon.liteapp.WxaLiteAppWidgetSubscribeStoreMessage((java.lang.String) obj, (java.util.List) obj2);
        }
    }

    public WxaLiteAppWidgetSubscribeStoreMessage(java.lang.String appId, java.util.List<java.lang.String> pointers) {
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(pointers, "pointers");
        this.appId = appId;
        this.pointers = pointers;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.tencent.pigeon.liteapp.WxaLiteAppWidgetSubscribeStoreMessage copy$default(com.tencent.pigeon.liteapp.WxaLiteAppWidgetSubscribeStoreMessage wxaLiteAppWidgetSubscribeStoreMessage, java.lang.String str, java.util.List list, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            str = wxaLiteAppWidgetSubscribeStoreMessage.appId;
        }
        if ((i17 & 2) != 0) {
            list = wxaLiteAppWidgetSubscribeStoreMessage.pointers;
        }
        return wxaLiteAppWidgetSubscribeStoreMessage.copy(str, list);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getAppId() {
        return this.appId;
    }

    public final java.util.List<java.lang.String> component2() {
        return this.pointers;
    }

    public final com.tencent.pigeon.liteapp.WxaLiteAppWidgetSubscribeStoreMessage copy(java.lang.String appId, java.util.List<java.lang.String> pointers) {
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(pointers, "pointers");
        return new com.tencent.pigeon.liteapp.WxaLiteAppWidgetSubscribeStoreMessage(appId, pointers);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.liteapp.WxaLiteAppWidgetSubscribeStoreMessage)) {
            return false;
        }
        com.tencent.pigeon.liteapp.WxaLiteAppWidgetSubscribeStoreMessage wxaLiteAppWidgetSubscribeStoreMessage = (com.tencent.pigeon.liteapp.WxaLiteAppWidgetSubscribeStoreMessage) other;
        return kotlin.jvm.internal.o.b(this.appId, wxaLiteAppWidgetSubscribeStoreMessage.appId) && kotlin.jvm.internal.o.b(this.pointers, wxaLiteAppWidgetSubscribeStoreMessage.pointers);
    }

    public final java.lang.String getAppId() {
        return this.appId;
    }

    public final java.util.List<java.lang.String> getPointers() {
        return this.pointers;
    }

    public int hashCode() {
        return (this.appId.hashCode() * 31) + this.pointers.hashCode();
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.c0.i(this.appId, this.pointers);
    }

    public java.lang.String toString() {
        return "WxaLiteAppWidgetSubscribeStoreMessage(appId=" + this.appId + ", pointers=" + this.pointers + ')';
    }
}
