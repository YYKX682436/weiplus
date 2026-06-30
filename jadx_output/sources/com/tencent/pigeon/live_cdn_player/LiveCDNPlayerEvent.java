package com.tencent.pigeon.live_cdn_player;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u001d\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u0000 /2\u00020\u0001:\u0001/Bm\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0012\b\u0002\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u000e¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001bJ\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001bJ\u0010\u0010%\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u0015J\u0013\u0010&\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u000eHÆ\u0003Jv\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0012\b\u0002\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u000eHÆ\u0001¢\u0006\u0002\u0010(J\u0013\u0010)\u001a\u00020\f2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\u000e\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000eJ\t\u0010.\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u000b\u0010\u0015R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0017\u0010\u0013R\u001b\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001d\u0010\u001bR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u001e\u0010\u0013¨\u00060"}, d2 = {"Lcom/tencent/pigeon/live_cdn_player/LiveCDNPlayerEvent;", "", "viewId", "", "eventName", "", "progress", "", "width", "height", "state", "isMuted", "", "seiData", "", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/util/List;)V", "getEventName", "()Ljava/lang/String;", "getHeight", "()Ljava/lang/Double;", "Ljava/lang/Double;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getProgress", "getSeiData", "()Ljava/util/List;", "getState", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getViewId", "getWidth", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/util/List;)Lcom/tencent/pigeon/live_cdn_player/LiveCDNPlayerEvent;", "equals", "other", "hashCode", "", "toList", "toString", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class LiveCDNPlayerEvent {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.live_cdn_player.LiveCDNPlayerEvent.Companion INSTANCE = new com.tencent.pigeon.live_cdn_player.LiveCDNPlayerEvent.Companion(null);
    private final java.lang.String eventName;
    private final java.lang.Double height;
    private final java.lang.Boolean isMuted;
    private final java.lang.Double progress;
    private final java.util.List<java.lang.Long> seiData;
    private final java.lang.Long state;
    private final java.lang.Long viewId;
    private final java.lang.Double width;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/live_cdn_player/LiveCDNPlayerEvent$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/live_cdn_player/LiveCDNPlayerEvent;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.live_cdn_player.LiveCDNPlayerEvent fromList(java.util.List<? extends java.lang.Object> list) {
            kotlin.jvm.internal.o.g(list, "list");
            java.lang.Object obj = list.get(0);
            java.lang.Long valueOf = obj instanceof java.lang.Integer ? java.lang.Long.valueOf(((java.lang.Number) obj).intValue()) : (java.lang.Long) obj;
            java.lang.String str = (java.lang.String) list.get(1);
            java.lang.Double d17 = (java.lang.Double) list.get(2);
            java.lang.Double d18 = (java.lang.Double) list.get(3);
            java.lang.Double d19 = (java.lang.Double) list.get(4);
            java.lang.Object obj2 = list.get(5);
            return new com.tencent.pigeon.live_cdn_player.LiveCDNPlayerEvent(valueOf, str, d17, d18, d19, obj2 instanceof java.lang.Integer ? java.lang.Long.valueOf(((java.lang.Number) obj2).intValue()) : (java.lang.Long) obj2, (java.lang.Boolean) list.get(6), (java.util.List) list.get(7));
        }
    }

    public LiveCDNPlayerEvent() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.Long getViewId() {
        return this.viewId;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getEventName() {
        return this.eventName;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.Double getProgress() {
        return this.progress;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.Double getWidth() {
        return this.width;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.Double getHeight() {
        return this.height;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.Long getState() {
        return this.state;
    }

    /* renamed from: component7, reason: from getter */
    public final java.lang.Boolean getIsMuted() {
        return this.isMuted;
    }

    public final java.util.List<java.lang.Long> component8() {
        return this.seiData;
    }

    public final com.tencent.pigeon.live_cdn_player.LiveCDNPlayerEvent copy(java.lang.Long viewId, java.lang.String eventName, java.lang.Double progress, java.lang.Double width, java.lang.Double height, java.lang.Long state, java.lang.Boolean isMuted, java.util.List<java.lang.Long> seiData) {
        return new com.tencent.pigeon.live_cdn_player.LiveCDNPlayerEvent(viewId, eventName, progress, width, height, state, isMuted, seiData);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.live_cdn_player.LiveCDNPlayerEvent)) {
            return false;
        }
        com.tencent.pigeon.live_cdn_player.LiveCDNPlayerEvent liveCDNPlayerEvent = (com.tencent.pigeon.live_cdn_player.LiveCDNPlayerEvent) other;
        return kotlin.jvm.internal.o.b(this.viewId, liveCDNPlayerEvent.viewId) && kotlin.jvm.internal.o.b(this.eventName, liveCDNPlayerEvent.eventName) && kotlin.jvm.internal.o.b(this.progress, liveCDNPlayerEvent.progress) && kotlin.jvm.internal.o.b(this.width, liveCDNPlayerEvent.width) && kotlin.jvm.internal.o.b(this.height, liveCDNPlayerEvent.height) && kotlin.jvm.internal.o.b(this.state, liveCDNPlayerEvent.state) && kotlin.jvm.internal.o.b(this.isMuted, liveCDNPlayerEvent.isMuted) && kotlin.jvm.internal.o.b(this.seiData, liveCDNPlayerEvent.seiData);
    }

    public final java.lang.String getEventName() {
        return this.eventName;
    }

    public final java.lang.Double getHeight() {
        return this.height;
    }

    public final java.lang.Double getProgress() {
        return this.progress;
    }

    public final java.util.List<java.lang.Long> getSeiData() {
        return this.seiData;
    }

    public final java.lang.Long getState() {
        return this.state;
    }

    public final java.lang.Long getViewId() {
        return this.viewId;
    }

    public final java.lang.Double getWidth() {
        return this.width;
    }

    public int hashCode() {
        java.lang.Long l17 = this.viewId;
        int hashCode = (l17 == null ? 0 : l17.hashCode()) * 31;
        java.lang.String str = this.eventName;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.Double d17 = this.progress;
        int hashCode3 = (hashCode2 + (d17 == null ? 0 : d17.hashCode())) * 31;
        java.lang.Double d18 = this.width;
        int hashCode4 = (hashCode3 + (d18 == null ? 0 : d18.hashCode())) * 31;
        java.lang.Double d19 = this.height;
        int hashCode5 = (hashCode4 + (d19 == null ? 0 : d19.hashCode())) * 31;
        java.lang.Long l18 = this.state;
        int hashCode6 = (hashCode5 + (l18 == null ? 0 : l18.hashCode())) * 31;
        java.lang.Boolean bool = this.isMuted;
        int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        java.util.List<java.lang.Long> list = this.seiData;
        return hashCode7 + (list != null ? list.hashCode() : 0);
    }

    public final java.lang.Boolean isMuted() {
        return this.isMuted;
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.c0.i(this.viewId, this.eventName, this.progress, this.width, this.height, this.state, this.isMuted, this.seiData);
    }

    public java.lang.String toString() {
        return "LiveCDNPlayerEvent(viewId=" + this.viewId + ", eventName=" + this.eventName + ", progress=" + this.progress + ", width=" + this.width + ", height=" + this.height + ", state=" + this.state + ", isMuted=" + this.isMuted + ", seiData=" + this.seiData + ')';
    }

    public LiveCDNPlayerEvent(java.lang.Long l17, java.lang.String str, java.lang.Double d17, java.lang.Double d18, java.lang.Double d19, java.lang.Long l18, java.lang.Boolean bool, java.util.List<java.lang.Long> list) {
        this.viewId = l17;
        this.eventName = str;
        this.progress = d17;
        this.width = d18;
        this.height = d19;
        this.state = l18;
        this.isMuted = bool;
        this.seiData = list;
    }

    public /* synthetic */ LiveCDNPlayerEvent(java.lang.Long l17, java.lang.String str, java.lang.Double d17, java.lang.Double d18, java.lang.Double d19, java.lang.Long l18, java.lang.Boolean bool, java.util.List list, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? null : l17, (i17 & 2) != 0 ? null : str, (i17 & 4) != 0 ? null : d17, (i17 & 8) != 0 ? null : d18, (i17 & 16) != 0 ? null : d19, (i17 & 32) != 0 ? null : l18, (i17 & 64) != 0 ? null : bool, (i17 & 128) == 0 ? list : null);
    }
}
