package com.tencent.pigeon.ting;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 $2\u00020\u0001:\u0001$B9\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003JG\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\u000e\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010!J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013¨\u0006%"}, d2 = {"Lcom/tencent/pigeon/ting/TingAudioRecordConfiguration;", "", com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_FORMAT, "Lcom/tencent/pigeon/ting/TingRecordFormat;", "minTimeInSecond", "", "maxTimeInSecond", "enableLoudnessAnimation", "", "enableSilenceDetect", "enableCalcLoudnessDuration", "(Lcom/tencent/pigeon/ting/TingRecordFormat;JJZZZ)V", "getEnableCalcLoudnessDuration", "()Z", "getEnableLoudnessAnimation", "getEnableSilenceDetect", "getFormat", "()Lcom/tencent/pigeon/ting/TingRecordFormat;", "getMaxTimeInSecond", "()J", "getMinTimeInSecond", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toList", "", "toString", "", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class TingAudioRecordConfiguration {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.ting.TingAudioRecordConfiguration.Companion INSTANCE = new com.tencent.pigeon.ting.TingAudioRecordConfiguration.Companion(null);
    private final boolean enableCalcLoudnessDuration;
    private final boolean enableLoudnessAnimation;
    private final boolean enableSilenceDetect;
    private final com.tencent.pigeon.ting.TingRecordFormat format;
    private final long maxTimeInSecond;
    private final long minTimeInSecond;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/ting/TingAudioRecordConfiguration$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/ting/TingAudioRecordConfiguration;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.ting.TingAudioRecordConfiguration fromList(java.util.List<? extends java.lang.Object> list) {
            long longValue;
            long longValue2;
            kotlin.jvm.internal.o.g(list, "list");
            java.util.List<? extends java.lang.Object> list2 = (java.util.List) list.get(0);
            com.tencent.pigeon.ting.TingRecordFormat fromList = list2 != null ? com.tencent.pigeon.ting.TingRecordFormat.INSTANCE.fromList(list2) : null;
            java.lang.Object obj = list.get(1);
            if (obj instanceof java.lang.Integer) {
                longValue = ((java.lang.Number) obj).intValue();
            } else {
                kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.Long");
                longValue = ((java.lang.Long) obj).longValue();
            }
            long j17 = longValue;
            java.lang.Object obj2 = list.get(2);
            if (obj2 instanceof java.lang.Integer) {
                longValue2 = ((java.lang.Number) obj2).intValue();
            } else {
                kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.Long");
                longValue2 = ((java.lang.Long) obj2).longValue();
            }
            long j18 = longValue2;
            java.lang.Object obj3 = list.get(3);
            kotlin.jvm.internal.o.e(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            boolean booleanValue = ((java.lang.Boolean) obj3).booleanValue();
            java.lang.Object obj4 = list.get(4);
            kotlin.jvm.internal.o.e(obj4, "null cannot be cast to non-null type kotlin.Boolean");
            boolean booleanValue2 = ((java.lang.Boolean) obj4).booleanValue();
            java.lang.Object obj5 = list.get(5);
            kotlin.jvm.internal.o.e(obj5, "null cannot be cast to non-null type kotlin.Boolean");
            return new com.tencent.pigeon.ting.TingAudioRecordConfiguration(fromList, j17, j18, booleanValue, booleanValue2, ((java.lang.Boolean) obj5).booleanValue());
        }
    }

    public TingAudioRecordConfiguration(com.tencent.pigeon.ting.TingRecordFormat tingRecordFormat, long j17, long j18, boolean z17, boolean z18, boolean z19) {
        this.format = tingRecordFormat;
        this.minTimeInSecond = j17;
        this.maxTimeInSecond = j18;
        this.enableLoudnessAnimation = z17;
        this.enableSilenceDetect = z18;
        this.enableCalcLoudnessDuration = z19;
    }

    /* renamed from: component1, reason: from getter */
    public final com.tencent.pigeon.ting.TingRecordFormat getFormat() {
        return this.format;
    }

    /* renamed from: component2, reason: from getter */
    public final long getMinTimeInSecond() {
        return this.minTimeInSecond;
    }

    /* renamed from: component3, reason: from getter */
    public final long getMaxTimeInSecond() {
        return this.maxTimeInSecond;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getEnableLoudnessAnimation() {
        return this.enableLoudnessAnimation;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getEnableSilenceDetect() {
        return this.enableSilenceDetect;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getEnableCalcLoudnessDuration() {
        return this.enableCalcLoudnessDuration;
    }

    public final com.tencent.pigeon.ting.TingAudioRecordConfiguration copy(com.tencent.pigeon.ting.TingRecordFormat format, long minTimeInSecond, long maxTimeInSecond, boolean enableLoudnessAnimation, boolean enableSilenceDetect, boolean enableCalcLoudnessDuration) {
        return new com.tencent.pigeon.ting.TingAudioRecordConfiguration(format, minTimeInSecond, maxTimeInSecond, enableLoudnessAnimation, enableSilenceDetect, enableCalcLoudnessDuration);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.ting.TingAudioRecordConfiguration)) {
            return false;
        }
        com.tencent.pigeon.ting.TingAudioRecordConfiguration tingAudioRecordConfiguration = (com.tencent.pigeon.ting.TingAudioRecordConfiguration) other;
        return kotlin.jvm.internal.o.b(this.format, tingAudioRecordConfiguration.format) && this.minTimeInSecond == tingAudioRecordConfiguration.minTimeInSecond && this.maxTimeInSecond == tingAudioRecordConfiguration.maxTimeInSecond && this.enableLoudnessAnimation == tingAudioRecordConfiguration.enableLoudnessAnimation && this.enableSilenceDetect == tingAudioRecordConfiguration.enableSilenceDetect && this.enableCalcLoudnessDuration == tingAudioRecordConfiguration.enableCalcLoudnessDuration;
    }

    public final boolean getEnableCalcLoudnessDuration() {
        return this.enableCalcLoudnessDuration;
    }

    public final boolean getEnableLoudnessAnimation() {
        return this.enableLoudnessAnimation;
    }

    public final boolean getEnableSilenceDetect() {
        return this.enableSilenceDetect;
    }

    public final com.tencent.pigeon.ting.TingRecordFormat getFormat() {
        return this.format;
    }

    public final long getMaxTimeInSecond() {
        return this.maxTimeInSecond;
    }

    public final long getMinTimeInSecond() {
        return this.minTimeInSecond;
    }

    public int hashCode() {
        com.tencent.pigeon.ting.TingRecordFormat tingRecordFormat = this.format;
        return ((((((((((tingRecordFormat == null ? 0 : tingRecordFormat.hashCode()) * 31) + java.lang.Long.hashCode(this.minTimeInSecond)) * 31) + java.lang.Long.hashCode(this.maxTimeInSecond)) * 31) + java.lang.Boolean.hashCode(this.enableLoudnessAnimation)) * 31) + java.lang.Boolean.hashCode(this.enableSilenceDetect)) * 31) + java.lang.Boolean.hashCode(this.enableCalcLoudnessDuration);
    }

    public final java.util.List<java.lang.Object> toList() {
        java.lang.Object[] objArr = new java.lang.Object[6];
        com.tencent.pigeon.ting.TingRecordFormat tingRecordFormat = this.format;
        objArr[0] = tingRecordFormat != null ? tingRecordFormat.toList() : null;
        objArr[1] = java.lang.Long.valueOf(this.minTimeInSecond);
        objArr[2] = java.lang.Long.valueOf(this.maxTimeInSecond);
        objArr[3] = java.lang.Boolean.valueOf(this.enableLoudnessAnimation);
        objArr[4] = java.lang.Boolean.valueOf(this.enableSilenceDetect);
        objArr[5] = java.lang.Boolean.valueOf(this.enableCalcLoudnessDuration);
        return kz5.c0.i(objArr);
    }

    public java.lang.String toString() {
        return "TingAudioRecordConfiguration(format=" + this.format + ", minTimeInSecond=" + this.minTimeInSecond + ", maxTimeInSecond=" + this.maxTimeInSecond + ", enableLoudnessAnimation=" + this.enableLoudnessAnimation + ", enableSilenceDetect=" + this.enableSilenceDetect + ", enableCalcLoudnessDuration=" + this.enableCalcLoudnessDuration + ')';
    }

    public /* synthetic */ TingAudioRecordConfiguration(com.tencent.pigeon.ting.TingRecordFormat tingRecordFormat, long j17, long j18, boolean z17, boolean z18, boolean z19, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? null : tingRecordFormat, j17, j18, z17, z18, z19);
    }
}
