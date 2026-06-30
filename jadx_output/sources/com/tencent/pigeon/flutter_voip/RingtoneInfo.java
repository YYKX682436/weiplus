package com.tencent.pigeon.flutter_voip;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\b\u0018\u0000 \"2\u00020\u0001:\u0001\"B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003JE\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\u000e\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010 J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006#"}, d2 = {"Lcom/tencent/pigeon/flutter_voip/RingtoneInfo;", "", "cover", "", com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, "singerName", "vendor", "feedId", "", "nonceId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V", "getCover", "()Ljava/lang/String;", "getFeedId", "()J", "getNonceId", "getSingerName", "getTitle", "getVendor", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toList", "", "toString", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class RingtoneInfo {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.flutter_voip.RingtoneInfo.Companion INSTANCE = new com.tencent.pigeon.flutter_voip.RingtoneInfo.Companion(null);
    private final java.lang.String cover;
    private final long feedId;
    private final java.lang.String nonceId;
    private final java.lang.String singerName;
    private final java.lang.String title;
    private final java.lang.String vendor;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/flutter_voip/RingtoneInfo$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/flutter_voip/RingtoneInfo;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.flutter_voip.RingtoneInfo fromList(java.util.List<? extends java.lang.Object> list) {
            long longValue;
            kotlin.jvm.internal.o.g(list, "list");
            java.lang.Object obj = list.get(0);
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.String");
            java.lang.String str = (java.lang.String) obj;
            java.lang.Object obj2 = list.get(1);
            kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.String");
            java.lang.String str2 = (java.lang.String) obj2;
            java.lang.Object obj3 = list.get(2);
            kotlin.jvm.internal.o.e(obj3, "null cannot be cast to non-null type kotlin.String");
            java.lang.String str3 = (java.lang.String) obj3;
            java.lang.Object obj4 = list.get(3);
            kotlin.jvm.internal.o.e(obj4, "null cannot be cast to non-null type kotlin.String");
            java.lang.String str4 = (java.lang.String) obj4;
            java.lang.Object obj5 = list.get(4);
            if (obj5 instanceof java.lang.Integer) {
                longValue = ((java.lang.Number) obj5).intValue();
            } else {
                kotlin.jvm.internal.o.e(obj5, "null cannot be cast to non-null type kotlin.Long");
                longValue = ((java.lang.Long) obj5).longValue();
            }
            java.lang.Object obj6 = list.get(5);
            kotlin.jvm.internal.o.e(obj6, "null cannot be cast to non-null type kotlin.String");
            return new com.tencent.pigeon.flutter_voip.RingtoneInfo(str, str2, str3, str4, longValue, (java.lang.String) obj6);
        }
    }

    public RingtoneInfo(java.lang.String cover, java.lang.String title, java.lang.String singerName, java.lang.String vendor, long j17, java.lang.String nonceId) {
        kotlin.jvm.internal.o.g(cover, "cover");
        kotlin.jvm.internal.o.g(title, "title");
        kotlin.jvm.internal.o.g(singerName, "singerName");
        kotlin.jvm.internal.o.g(vendor, "vendor");
        kotlin.jvm.internal.o.g(nonceId, "nonceId");
        this.cover = cover;
        this.title = title;
        this.singerName = singerName;
        this.vendor = vendor;
        this.feedId = j17;
        this.nonceId = nonceId;
    }

    public static /* synthetic */ com.tencent.pigeon.flutter_voip.RingtoneInfo copy$default(com.tencent.pigeon.flutter_voip.RingtoneInfo ringtoneInfo, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, long j17, java.lang.String str5, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            str = ringtoneInfo.cover;
        }
        if ((i17 & 2) != 0) {
            str2 = ringtoneInfo.title;
        }
        java.lang.String str6 = str2;
        if ((i17 & 4) != 0) {
            str3 = ringtoneInfo.singerName;
        }
        java.lang.String str7 = str3;
        if ((i17 & 8) != 0) {
            str4 = ringtoneInfo.vendor;
        }
        java.lang.String str8 = str4;
        if ((i17 & 16) != 0) {
            j17 = ringtoneInfo.feedId;
        }
        long j18 = j17;
        if ((i17 & 32) != 0) {
            str5 = ringtoneInfo.nonceId;
        }
        return ringtoneInfo.copy(str, str6, str7, str8, j18, str5);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getCover() {
        return this.cover;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getSingerName() {
        return this.singerName;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getVendor() {
        return this.vendor;
    }

    /* renamed from: component5, reason: from getter */
    public final long getFeedId() {
        return this.feedId;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getNonceId() {
        return this.nonceId;
    }

    public final com.tencent.pigeon.flutter_voip.RingtoneInfo copy(java.lang.String cover, java.lang.String title, java.lang.String singerName, java.lang.String vendor, long feedId, java.lang.String nonceId) {
        kotlin.jvm.internal.o.g(cover, "cover");
        kotlin.jvm.internal.o.g(title, "title");
        kotlin.jvm.internal.o.g(singerName, "singerName");
        kotlin.jvm.internal.o.g(vendor, "vendor");
        kotlin.jvm.internal.o.g(nonceId, "nonceId");
        return new com.tencent.pigeon.flutter_voip.RingtoneInfo(cover, title, singerName, vendor, feedId, nonceId);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.flutter_voip.RingtoneInfo)) {
            return false;
        }
        com.tencent.pigeon.flutter_voip.RingtoneInfo ringtoneInfo = (com.tencent.pigeon.flutter_voip.RingtoneInfo) other;
        return kotlin.jvm.internal.o.b(this.cover, ringtoneInfo.cover) && kotlin.jvm.internal.o.b(this.title, ringtoneInfo.title) && kotlin.jvm.internal.o.b(this.singerName, ringtoneInfo.singerName) && kotlin.jvm.internal.o.b(this.vendor, ringtoneInfo.vendor) && this.feedId == ringtoneInfo.feedId && kotlin.jvm.internal.o.b(this.nonceId, ringtoneInfo.nonceId);
    }

    public final java.lang.String getCover() {
        return this.cover;
    }

    public final long getFeedId() {
        return this.feedId;
    }

    public final java.lang.String getNonceId() {
        return this.nonceId;
    }

    public final java.lang.String getSingerName() {
        return this.singerName;
    }

    public final java.lang.String getTitle() {
        return this.title;
    }

    public final java.lang.String getVendor() {
        return this.vendor;
    }

    public int hashCode() {
        return (((((((((this.cover.hashCode() * 31) + this.title.hashCode()) * 31) + this.singerName.hashCode()) * 31) + this.vendor.hashCode()) * 31) + java.lang.Long.hashCode(this.feedId)) * 31) + this.nonceId.hashCode();
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.c0.i(this.cover, this.title, this.singerName, this.vendor, java.lang.Long.valueOf(this.feedId), this.nonceId);
    }

    public java.lang.String toString() {
        return "RingtoneInfo(cover=" + this.cover + ", title=" + this.title + ", singerName=" + this.singerName + ", vendor=" + this.vendor + ", feedId=" + this.feedId + ", nonceId=" + this.nonceId + ')';
    }
}
