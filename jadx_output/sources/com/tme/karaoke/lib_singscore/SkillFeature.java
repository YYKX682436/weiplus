package com.tme.karaoke.lib_singscore;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003JO\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006$"}, d2 = {"Lcom/tme/karaoke/lib_singscore/SkillFeature;", "Ljava/io/Serializable;", "type", "", "duration", "", "param1", "param2", "param3", "startTime", "endTime", "(IFFFFFF)V", "getDuration", "()F", "getEndTime", "getParam1", "getParam2", "getParam3", "getStartTime", "getType", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "", "hashCode", "toString", "", "lib_singscore_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SkillFeature implements java.io.Serializable {
    private final float duration;
    private final float endTime;
    private final float param1;
    private final float param2;
    private final float param3;
    private final float startTime;
    private final int type;

    public SkillFeature(int i17, float f17, float f18, float f19, float f27, float f28, float f29) {
        this.type = i17;
        this.duration = f17;
        this.param1 = f18;
        this.param2 = f19;
        this.param3 = f27;
        this.startTime = f28;
        this.endTime = f29;
    }

    public static /* synthetic */ com.tme.karaoke.lib_singscore.SkillFeature copy$default(com.tme.karaoke.lib_singscore.SkillFeature skillFeature, int i17, float f17, float f18, float f19, float f27, float f28, float f29, int i18, java.lang.Object obj) {
        if ((i18 & 1) != 0) {
            i17 = skillFeature.type;
        }
        if ((i18 & 2) != 0) {
            f17 = skillFeature.duration;
        }
        float f37 = f17;
        if ((i18 & 4) != 0) {
            f18 = skillFeature.param1;
        }
        float f38 = f18;
        if ((i18 & 8) != 0) {
            f19 = skillFeature.param2;
        }
        float f39 = f19;
        if ((i18 & 16) != 0) {
            f27 = skillFeature.param3;
        }
        float f47 = f27;
        if ((i18 & 32) != 0) {
            f28 = skillFeature.startTime;
        }
        float f48 = f28;
        if ((i18 & 64) != 0) {
            f29 = skillFeature.endTime;
        }
        return skillFeature.copy(i17, f37, f38, f39, f47, f48, f29);
    }

    /* renamed from: component1, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final float getDuration() {
        return this.duration;
    }

    /* renamed from: component3, reason: from getter */
    public final float getParam1() {
        return this.param1;
    }

    /* renamed from: component4, reason: from getter */
    public final float getParam2() {
        return this.param2;
    }

    /* renamed from: component5, reason: from getter */
    public final float getParam3() {
        return this.param3;
    }

    /* renamed from: component6, reason: from getter */
    public final float getStartTime() {
        return this.startTime;
    }

    /* renamed from: component7, reason: from getter */
    public final float getEndTime() {
        return this.endTime;
    }

    public final com.tme.karaoke.lib_singscore.SkillFeature copy(int type, float duration, float param1, float param2, float param3, float startTime, float endTime) {
        return new com.tme.karaoke.lib_singscore.SkillFeature(type, duration, param1, param2, param3, startTime, endTime);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tme.karaoke.lib_singscore.SkillFeature)) {
            return false;
        }
        com.tme.karaoke.lib_singscore.SkillFeature skillFeature = (com.tme.karaoke.lib_singscore.SkillFeature) other;
        return this.type == skillFeature.type && java.lang.Float.compare(this.duration, skillFeature.duration) == 0 && java.lang.Float.compare(this.param1, skillFeature.param1) == 0 && java.lang.Float.compare(this.param2, skillFeature.param2) == 0 && java.lang.Float.compare(this.param3, skillFeature.param3) == 0 && java.lang.Float.compare(this.startTime, skillFeature.startTime) == 0 && java.lang.Float.compare(this.endTime, skillFeature.endTime) == 0;
    }

    public final float getDuration() {
        return this.duration;
    }

    public final float getEndTime() {
        return this.endTime;
    }

    public final float getParam1() {
        return this.param1;
    }

    public final float getParam2() {
        return this.param2;
    }

    public final float getParam3() {
        return this.param3;
    }

    public final float getStartTime() {
        return this.startTime;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        return (((((((((((java.lang.Integer.hashCode(this.type) * 31) + java.lang.Float.hashCode(this.duration)) * 31) + java.lang.Float.hashCode(this.param1)) * 31) + java.lang.Float.hashCode(this.param2)) * 31) + java.lang.Float.hashCode(this.param3)) * 31) + java.lang.Float.hashCode(this.startTime)) * 31) + java.lang.Float.hashCode(this.endTime);
    }

    public java.lang.String toString() {
        return "SkillFeature(type=" + this.type + ", duration=" + this.duration + ", param1=" + this.param1 + ", param2=" + this.param2 + ", param3=" + this.param3 + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ")";
    }
}
