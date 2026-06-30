package com.tme.karaoke.lib_singscore;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0003H\u0016J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/tme/karaoke/lib_singscore/MIDIScoreResult;", "Ljava/io/Serializable;", ya.b.SCORE, "", "totalScore", "sentenceScores", "", "(II[I)V", "getScore", "()I", "getSentenceScores", "()[I", "getTotalScore", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "", "lib_singscore_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class MIDIScoreResult implements java.io.Serializable {
    private final int score;
    private final int[] sentenceScores;
    private final int totalScore;

    public MIDIScoreResult(int i17, int i18, int[] iArr) {
        this.score = i17;
        this.totalScore = i18;
        this.sentenceScores = iArr;
    }

    public static /* synthetic */ com.tme.karaoke.lib_singscore.MIDIScoreResult copy$default(com.tme.karaoke.lib_singscore.MIDIScoreResult mIDIScoreResult, int i17, int i18, int[] iArr, int i19, java.lang.Object obj) {
        if ((i19 & 1) != 0) {
            i17 = mIDIScoreResult.score;
        }
        if ((i19 & 2) != 0) {
            i18 = mIDIScoreResult.totalScore;
        }
        if ((i19 & 4) != 0) {
            iArr = mIDIScoreResult.sentenceScores;
        }
        return mIDIScoreResult.copy(i17, i18, iArr);
    }

    /* renamed from: component1, reason: from getter */
    public final int getScore() {
        return this.score;
    }

    /* renamed from: component2, reason: from getter */
    public final int getTotalScore() {
        return this.totalScore;
    }

    /* renamed from: component3, reason: from getter */
    public final int[] getSentenceScores() {
        return this.sentenceScores;
    }

    public final com.tme.karaoke.lib_singscore.MIDIScoreResult copy(int score, int totalScore, int[] sentenceScores) {
        return new com.tme.karaoke.lib_singscore.MIDIScoreResult(score, totalScore, sentenceScores);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!kotlin.jvm.internal.o.b(com.tme.karaoke.lib_singscore.MIDIScoreResult.class, other != null ? other.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.o.e(other, "null cannot be cast to non-null type com.tme.karaoke.lib_singscore.MIDIScoreResult");
        com.tme.karaoke.lib_singscore.MIDIScoreResult mIDIScoreResult = (com.tme.karaoke.lib_singscore.MIDIScoreResult) other;
        if (this.score != mIDIScoreResult.score || this.totalScore != mIDIScoreResult.totalScore) {
            return false;
        }
        int[] iArr = this.sentenceScores;
        if (iArr != null) {
            int[] iArr2 = mIDIScoreResult.sentenceScores;
            if (iArr2 == null || !java.util.Arrays.equals(iArr, iArr2)) {
                return false;
            }
        } else if (mIDIScoreResult.sentenceScores != null) {
            return false;
        }
        return true;
    }

    public final int getScore() {
        return this.score;
    }

    public final int[] getSentenceScores() {
        return this.sentenceScores;
    }

    public final int getTotalScore() {
        return this.totalScore;
    }

    public int hashCode() {
        int i17 = ((this.score * 31) + this.totalScore) * 31;
        int[] iArr = this.sentenceScores;
        return i17 + (iArr != null ? java.util.Arrays.hashCode(iArr) : 0);
    }

    public java.lang.String toString() {
        return "MIDIScoreResult(score=" + this.score + ", totalScore=" + this.totalScore + ", sentenceScores=" + java.util.Arrays.toString(this.sentenceScores) + ")";
    }
}
