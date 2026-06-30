package com.tencent.pigeon.sns;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u000e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0014J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/tencent/pigeon/sns/GalleryPickActionData;", "", "actionTrace", "", "shotCompletedTimes", "", "(Ljava/lang/String;J)V", "getActionTrace", "()Ljava/lang/String;", "getShotCompletedTimes", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toList", "", "toString", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class GalleryPickActionData {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.sns.GalleryPickActionData.Companion INSTANCE = new com.tencent.pigeon.sns.GalleryPickActionData.Companion(null);
    private final java.lang.String actionTrace;
    private final long shotCompletedTimes;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/sns/GalleryPickActionData$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/sns/GalleryPickActionData;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.sns.GalleryPickActionData fromList(java.util.List<? extends java.lang.Object> list) {
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
            return new com.tencent.pigeon.sns.GalleryPickActionData(str, longValue);
        }
    }

    public GalleryPickActionData(java.lang.String actionTrace, long j17) {
        kotlin.jvm.internal.o.g(actionTrace, "actionTrace");
        this.actionTrace = actionTrace;
        this.shotCompletedTimes = j17;
    }

    public static /* synthetic */ com.tencent.pigeon.sns.GalleryPickActionData copy$default(com.tencent.pigeon.sns.GalleryPickActionData galleryPickActionData, java.lang.String str, long j17, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            str = galleryPickActionData.actionTrace;
        }
        if ((i17 & 2) != 0) {
            j17 = galleryPickActionData.shotCompletedTimes;
        }
        return galleryPickActionData.copy(str, j17);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getActionTrace() {
        return this.actionTrace;
    }

    /* renamed from: component2, reason: from getter */
    public final long getShotCompletedTimes() {
        return this.shotCompletedTimes;
    }

    public final com.tencent.pigeon.sns.GalleryPickActionData copy(java.lang.String actionTrace, long shotCompletedTimes) {
        kotlin.jvm.internal.o.g(actionTrace, "actionTrace");
        return new com.tencent.pigeon.sns.GalleryPickActionData(actionTrace, shotCompletedTimes);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.sns.GalleryPickActionData)) {
            return false;
        }
        com.tencent.pigeon.sns.GalleryPickActionData galleryPickActionData = (com.tencent.pigeon.sns.GalleryPickActionData) other;
        return kotlin.jvm.internal.o.b(this.actionTrace, galleryPickActionData.actionTrace) && this.shotCompletedTimes == galleryPickActionData.shotCompletedTimes;
    }

    public final java.lang.String getActionTrace() {
        return this.actionTrace;
    }

    public final long getShotCompletedTimes() {
        return this.shotCompletedTimes;
    }

    public int hashCode() {
        return (this.actionTrace.hashCode() * 31) + java.lang.Long.hashCode(this.shotCompletedTimes);
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.c0.i(this.actionTrace, java.lang.Long.valueOf(this.shotCompletedTimes));
    }

    public java.lang.String toString() {
        return "GalleryPickActionData(actionTrace=" + this.actionTrace + ", shotCompletedTimes=" + this.shotCompletedTimes + ')';
    }
}
