package com.tencent.pigeon.ting;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u000e\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0018J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u001c"}, d2 = {"Lcom/tencent/pigeon/ting/TingRecordFormat;", "", "sampleRate", "", "bitRate", "channels", "formatId", "(JJJJ)V", "getBitRate", "()J", "getChannels", "getFormatId", "getSampleRate", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toList", "", "toString", "", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class TingRecordFormat {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.ting.TingRecordFormat.Companion INSTANCE = new com.tencent.pigeon.ting.TingRecordFormat.Companion(null);
    private final long bitRate;
    private final long channels;
    private final long formatId;
    private final long sampleRate;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/ting/TingRecordFormat$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/ting/TingRecordFormat;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.ting.TingRecordFormat fromList(java.util.List<? extends java.lang.Object> list) {
            long longValue;
            long longValue2;
            long longValue3;
            long longValue4;
            kotlin.jvm.internal.o.g(list, "list");
            java.lang.Object obj = list.get(0);
            if (obj instanceof java.lang.Integer) {
                longValue = ((java.lang.Number) obj).intValue();
            } else {
                kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.Long");
                longValue = ((java.lang.Long) obj).longValue();
            }
            long j17 = longValue;
            java.lang.Object obj2 = list.get(1);
            if (obj2 instanceof java.lang.Integer) {
                longValue2 = ((java.lang.Number) obj2).intValue();
            } else {
                kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.Long");
                longValue2 = ((java.lang.Long) obj2).longValue();
            }
            long j18 = longValue2;
            java.lang.Object obj3 = list.get(2);
            if (obj3 instanceof java.lang.Integer) {
                longValue3 = ((java.lang.Number) obj3).intValue();
            } else {
                kotlin.jvm.internal.o.e(obj3, "null cannot be cast to non-null type kotlin.Long");
                longValue3 = ((java.lang.Long) obj3).longValue();
            }
            long j19 = longValue3;
            java.lang.Object obj4 = list.get(3);
            if (obj4 instanceof java.lang.Integer) {
                longValue4 = ((java.lang.Number) obj4).intValue();
            } else {
                kotlin.jvm.internal.o.e(obj4, "null cannot be cast to non-null type kotlin.Long");
                longValue4 = ((java.lang.Long) obj4).longValue();
            }
            return new com.tencent.pigeon.ting.TingRecordFormat(j17, j18, j19, longValue4);
        }
    }

    public TingRecordFormat(long j17, long j18, long j19, long j27) {
        this.sampleRate = j17;
        this.bitRate = j18;
        this.channels = j19;
        this.formatId = j27;
    }

    /* renamed from: component1, reason: from getter */
    public final long getSampleRate() {
        return this.sampleRate;
    }

    /* renamed from: component2, reason: from getter */
    public final long getBitRate() {
        return this.bitRate;
    }

    /* renamed from: component3, reason: from getter */
    public final long getChannels() {
        return this.channels;
    }

    /* renamed from: component4, reason: from getter */
    public final long getFormatId() {
        return this.formatId;
    }

    public final com.tencent.pigeon.ting.TingRecordFormat copy(long sampleRate, long bitRate, long channels, long formatId) {
        return new com.tencent.pigeon.ting.TingRecordFormat(sampleRate, bitRate, channels, formatId);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.ting.TingRecordFormat)) {
            return false;
        }
        com.tencent.pigeon.ting.TingRecordFormat tingRecordFormat = (com.tencent.pigeon.ting.TingRecordFormat) other;
        return this.sampleRate == tingRecordFormat.sampleRate && this.bitRate == tingRecordFormat.bitRate && this.channels == tingRecordFormat.channels && this.formatId == tingRecordFormat.formatId;
    }

    public final long getBitRate() {
        return this.bitRate;
    }

    public final long getChannels() {
        return this.channels;
    }

    public final long getFormatId() {
        return this.formatId;
    }

    public final long getSampleRate() {
        return this.sampleRate;
    }

    public int hashCode() {
        return (((((java.lang.Long.hashCode(this.sampleRate) * 31) + java.lang.Long.hashCode(this.bitRate)) * 31) + java.lang.Long.hashCode(this.channels)) * 31) + java.lang.Long.hashCode(this.formatId);
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.c0.i(java.lang.Long.valueOf(this.sampleRate), java.lang.Long.valueOf(this.bitRate), java.lang.Long.valueOf(this.channels), java.lang.Long.valueOf(this.formatId));
    }

    public java.lang.String toString() {
        return "TingRecordFormat(sampleRate=" + this.sampleRate + ", bitRate=" + this.bitRate + ", channels=" + this.channels + ", formatId=" + this.formatId + ')';
    }
}
