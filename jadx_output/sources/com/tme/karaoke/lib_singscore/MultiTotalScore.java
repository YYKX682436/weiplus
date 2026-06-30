package com.tme.karaoke.lib_singscore;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J;\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001c"}, d2 = {"Lcom/tme/karaoke/lib_singscore/MultiTotalScore;", "Ljava/io/Serializable;", "stableScore", "", "rhythmScore", "longtoneScore", "dynamicScore", "skillScore", "(IIIII)V", "getDynamicScore", "()I", "getLongtoneScore", "getRhythmScore", "getSkillScore", "getStableScore", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "toString", "", "lib_singscore_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class MultiTotalScore implements java.io.Serializable {
    private final int dynamicScore;
    private final int longtoneScore;
    private final int rhythmScore;
    private final int skillScore;
    private final int stableScore;

    public MultiTotalScore(int i17, int i18, int i19, int i27, int i28) {
        this.stableScore = i17;
        this.rhythmScore = i18;
        this.longtoneScore = i19;
        this.dynamicScore = i27;
        this.skillScore = i28;
    }

    public static /* synthetic */ com.tme.karaoke.lib_singscore.MultiTotalScore copy$default(com.tme.karaoke.lib_singscore.MultiTotalScore multiTotalScore, int i17, int i18, int i19, int i27, int i28, int i29, java.lang.Object obj) {
        if ((i29 & 1) != 0) {
            i17 = multiTotalScore.stableScore;
        }
        if ((i29 & 2) != 0) {
            i18 = multiTotalScore.rhythmScore;
        }
        int i37 = i18;
        if ((i29 & 4) != 0) {
            i19 = multiTotalScore.longtoneScore;
        }
        int i38 = i19;
        if ((i29 & 8) != 0) {
            i27 = multiTotalScore.dynamicScore;
        }
        int i39 = i27;
        if ((i29 & 16) != 0) {
            i28 = multiTotalScore.skillScore;
        }
        return multiTotalScore.copy(i17, i37, i38, i39, i28);
    }

    /* renamed from: component1, reason: from getter */
    public final int getStableScore() {
        return this.stableScore;
    }

    /* renamed from: component2, reason: from getter */
    public final int getRhythmScore() {
        return this.rhythmScore;
    }

    /* renamed from: component3, reason: from getter */
    public final int getLongtoneScore() {
        return this.longtoneScore;
    }

    /* renamed from: component4, reason: from getter */
    public final int getDynamicScore() {
        return this.dynamicScore;
    }

    /* renamed from: component5, reason: from getter */
    public final int getSkillScore() {
        return this.skillScore;
    }

    public final com.tme.karaoke.lib_singscore.MultiTotalScore copy(int stableScore, int rhythmScore, int longtoneScore, int dynamicScore, int skillScore) {
        return new com.tme.karaoke.lib_singscore.MultiTotalScore(stableScore, rhythmScore, longtoneScore, dynamicScore, skillScore);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tme.karaoke.lib_singscore.MultiTotalScore)) {
            return false;
        }
        com.tme.karaoke.lib_singscore.MultiTotalScore multiTotalScore = (com.tme.karaoke.lib_singscore.MultiTotalScore) other;
        return this.stableScore == multiTotalScore.stableScore && this.rhythmScore == multiTotalScore.rhythmScore && this.longtoneScore == multiTotalScore.longtoneScore && this.dynamicScore == multiTotalScore.dynamicScore && this.skillScore == multiTotalScore.skillScore;
    }

    public final int getDynamicScore() {
        return this.dynamicScore;
    }

    public final int getLongtoneScore() {
        return this.longtoneScore;
    }

    public final int getRhythmScore() {
        return this.rhythmScore;
    }

    public final int getSkillScore() {
        return this.skillScore;
    }

    public final int getStableScore() {
        return this.stableScore;
    }

    public int hashCode() {
        return (((((((java.lang.Integer.hashCode(this.stableScore) * 31) + java.lang.Integer.hashCode(this.rhythmScore)) * 31) + java.lang.Integer.hashCode(this.longtoneScore)) * 31) + java.lang.Integer.hashCode(this.dynamicScore)) * 31) + java.lang.Integer.hashCode(this.skillScore);
    }

    public java.lang.String toString() {
        return "MultiTotalScore(stableScore=" + this.stableScore + ", rhythmScore=" + this.rhythmScore + ", longtoneScore=" + this.longtoneScore + ", dynamicScore=" + this.dynamicScore + ", skillScore=" + this.skillScore + ")";
    }
}
