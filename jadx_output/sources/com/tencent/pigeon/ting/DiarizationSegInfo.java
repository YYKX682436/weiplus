package com.tencent.pigeon.ting;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u000e\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001aJ\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u001d"}, d2 = {"Lcom/tencent/pigeon/ting/DiarizationSegInfo;", "", "speakerTag", "", com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT, "beginTimeMs", "", "endTimeMs", "(Ljava/lang/String;Ljava/lang/String;JJ)V", "getBeginTimeMs", "()J", "getEndTimeMs", "getSpeakerTag", "()Ljava/lang/String;", "getText", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toList", "", "toString", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class DiarizationSegInfo {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.ting.DiarizationSegInfo.Companion INSTANCE = new com.tencent.pigeon.ting.DiarizationSegInfo.Companion(null);
    private final long beginTimeMs;
    private final long endTimeMs;
    private final java.lang.String speakerTag;
    private final java.lang.String text;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/ting/DiarizationSegInfo$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/ting/DiarizationSegInfo;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.ting.DiarizationSegInfo fromList(java.util.List<? extends java.lang.Object> list) {
            long longValue;
            long longValue2;
            kotlin.jvm.internal.o.g(list, "list");
            java.lang.Object obj = list.get(0);
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.String");
            java.lang.String str = (java.lang.String) obj;
            java.lang.Object obj2 = list.get(1);
            kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.String");
            java.lang.String str2 = (java.lang.String) obj2;
            java.lang.Object obj3 = list.get(2);
            if (obj3 instanceof java.lang.Integer) {
                longValue = ((java.lang.Number) obj3).intValue();
            } else {
                kotlin.jvm.internal.o.e(obj3, "null cannot be cast to non-null type kotlin.Long");
                longValue = ((java.lang.Long) obj3).longValue();
            }
            long j17 = longValue;
            java.lang.Object obj4 = list.get(3);
            if (obj4 instanceof java.lang.Integer) {
                longValue2 = ((java.lang.Number) obj4).intValue();
            } else {
                kotlin.jvm.internal.o.e(obj4, "null cannot be cast to non-null type kotlin.Long");
                longValue2 = ((java.lang.Long) obj4).longValue();
            }
            return new com.tencent.pigeon.ting.DiarizationSegInfo(str, str2, j17, longValue2);
        }
    }

    public DiarizationSegInfo(java.lang.String speakerTag, java.lang.String text, long j17, long j18) {
        kotlin.jvm.internal.o.g(speakerTag, "speakerTag");
        kotlin.jvm.internal.o.g(text, "text");
        this.speakerTag = speakerTag;
        this.text = text;
        this.beginTimeMs = j17;
        this.endTimeMs = j18;
    }

    public static /* synthetic */ com.tencent.pigeon.ting.DiarizationSegInfo copy$default(com.tencent.pigeon.ting.DiarizationSegInfo diarizationSegInfo, java.lang.String str, java.lang.String str2, long j17, long j18, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            str = diarizationSegInfo.speakerTag;
        }
        if ((i17 & 2) != 0) {
            str2 = diarizationSegInfo.text;
        }
        java.lang.String str3 = str2;
        if ((i17 & 4) != 0) {
            j17 = diarizationSegInfo.beginTimeMs;
        }
        long j19 = j17;
        if ((i17 & 8) != 0) {
            j18 = diarizationSegInfo.endTimeMs;
        }
        return diarizationSegInfo.copy(str, str3, j19, j18);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getSpeakerTag() {
        return this.speakerTag;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getText() {
        return this.text;
    }

    /* renamed from: component3, reason: from getter */
    public final long getBeginTimeMs() {
        return this.beginTimeMs;
    }

    /* renamed from: component4, reason: from getter */
    public final long getEndTimeMs() {
        return this.endTimeMs;
    }

    public final com.tencent.pigeon.ting.DiarizationSegInfo copy(java.lang.String speakerTag, java.lang.String text, long beginTimeMs, long endTimeMs) {
        kotlin.jvm.internal.o.g(speakerTag, "speakerTag");
        kotlin.jvm.internal.o.g(text, "text");
        return new com.tencent.pigeon.ting.DiarizationSegInfo(speakerTag, text, beginTimeMs, endTimeMs);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.ting.DiarizationSegInfo)) {
            return false;
        }
        com.tencent.pigeon.ting.DiarizationSegInfo diarizationSegInfo = (com.tencent.pigeon.ting.DiarizationSegInfo) other;
        return kotlin.jvm.internal.o.b(this.speakerTag, diarizationSegInfo.speakerTag) && kotlin.jvm.internal.o.b(this.text, diarizationSegInfo.text) && this.beginTimeMs == diarizationSegInfo.beginTimeMs && this.endTimeMs == diarizationSegInfo.endTimeMs;
    }

    public final long getBeginTimeMs() {
        return this.beginTimeMs;
    }

    public final long getEndTimeMs() {
        return this.endTimeMs;
    }

    public final java.lang.String getSpeakerTag() {
        return this.speakerTag;
    }

    public final java.lang.String getText() {
        return this.text;
    }

    public int hashCode() {
        return (((((this.speakerTag.hashCode() * 31) + this.text.hashCode()) * 31) + java.lang.Long.hashCode(this.beginTimeMs)) * 31) + java.lang.Long.hashCode(this.endTimeMs);
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.c0.i(this.speakerTag, this.text, java.lang.Long.valueOf(this.beginTimeMs), java.lang.Long.valueOf(this.endTimeMs));
    }

    public java.lang.String toString() {
        return "DiarizationSegInfo(speakerTag=" + this.speakerTag + ", text=" + this.text + ", beginTimeMs=" + this.beginTimeMs + ", endTimeMs=" + this.endTimeMs + ')';
    }
}
