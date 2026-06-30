package com.tme.karaoke.lib_singscore;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\nHÆ\u0003JC\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\""}, d2 = {"Lcom/tme/karaoke/lib_singscore/ScoreResult;", "Ljava/io/Serializable;", "sentenceIndex", "", "pYinScoreResult", "Lcom/tme/karaoke/lib_singscore/MIDIScoreResult;", "acfScoreResult", "multiScoreResult", "Lcom/tme/karaoke/lib_singscore/MultiScoreResult;", "newScores", "", "(ILcom/tme/karaoke/lib_singscore/MIDIScoreResult;Lcom/tme/karaoke/lib_singscore/MIDIScoreResult;Lcom/tme/karaoke/lib_singscore/MultiScoreResult;[B)V", "getAcfScoreResult", "()Lcom/tme/karaoke/lib_singscore/MIDIScoreResult;", "getMultiScoreResult", "()Lcom/tme/karaoke/lib_singscore/MultiScoreResult;", "getNewScores", "()[B", "getPYinScoreResult", "getSentenceIndex", "()I", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "toString", "", "lib_singscore_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ScoreResult implements java.io.Serializable {
    private final com.tme.karaoke.lib_singscore.MIDIScoreResult acfScoreResult;
    private final com.tme.karaoke.lib_singscore.MultiScoreResult multiScoreResult;
    private final byte[] newScores;
    private final com.tme.karaoke.lib_singscore.MIDIScoreResult pYinScoreResult;
    private final int sentenceIndex;

    public ScoreResult(int i17, com.tme.karaoke.lib_singscore.MIDIScoreResult mIDIScoreResult, com.tme.karaoke.lib_singscore.MIDIScoreResult mIDIScoreResult2, com.tme.karaoke.lib_singscore.MultiScoreResult multiScoreResult, byte[] bArr) {
        this.sentenceIndex = i17;
        this.pYinScoreResult = mIDIScoreResult;
        this.acfScoreResult = mIDIScoreResult2;
        this.multiScoreResult = multiScoreResult;
        this.newScores = bArr;
    }

    public static /* synthetic */ com.tme.karaoke.lib_singscore.ScoreResult copy$default(com.tme.karaoke.lib_singscore.ScoreResult scoreResult, int i17, com.tme.karaoke.lib_singscore.MIDIScoreResult mIDIScoreResult, com.tme.karaoke.lib_singscore.MIDIScoreResult mIDIScoreResult2, com.tme.karaoke.lib_singscore.MultiScoreResult multiScoreResult, byte[] bArr, int i18, java.lang.Object obj) {
        if ((i18 & 1) != 0) {
            i17 = scoreResult.sentenceIndex;
        }
        if ((i18 & 2) != 0) {
            mIDIScoreResult = scoreResult.pYinScoreResult;
        }
        com.tme.karaoke.lib_singscore.MIDIScoreResult mIDIScoreResult3 = mIDIScoreResult;
        if ((i18 & 4) != 0) {
            mIDIScoreResult2 = scoreResult.acfScoreResult;
        }
        com.tme.karaoke.lib_singscore.MIDIScoreResult mIDIScoreResult4 = mIDIScoreResult2;
        if ((i18 & 8) != 0) {
            multiScoreResult = scoreResult.multiScoreResult;
        }
        com.tme.karaoke.lib_singscore.MultiScoreResult multiScoreResult2 = multiScoreResult;
        if ((i18 & 16) != 0) {
            bArr = scoreResult.newScores;
        }
        return scoreResult.copy(i17, mIDIScoreResult3, mIDIScoreResult4, multiScoreResult2, bArr);
    }

    /* renamed from: component1, reason: from getter */
    public final int getSentenceIndex() {
        return this.sentenceIndex;
    }

    /* renamed from: component2, reason: from getter */
    public final com.tme.karaoke.lib_singscore.MIDIScoreResult getPYinScoreResult() {
        return this.pYinScoreResult;
    }

    /* renamed from: component3, reason: from getter */
    public final com.tme.karaoke.lib_singscore.MIDIScoreResult getAcfScoreResult() {
        return this.acfScoreResult;
    }

    /* renamed from: component4, reason: from getter */
    public final com.tme.karaoke.lib_singscore.MultiScoreResult getMultiScoreResult() {
        return this.multiScoreResult;
    }

    /* renamed from: component5, reason: from getter */
    public final byte[] getNewScores() {
        return this.newScores;
    }

    public final com.tme.karaoke.lib_singscore.ScoreResult copy(int sentenceIndex, com.tme.karaoke.lib_singscore.MIDIScoreResult pYinScoreResult, com.tme.karaoke.lib_singscore.MIDIScoreResult acfScoreResult, com.tme.karaoke.lib_singscore.MultiScoreResult multiScoreResult, byte[] newScores) {
        return new com.tme.karaoke.lib_singscore.ScoreResult(sentenceIndex, pYinScoreResult, acfScoreResult, multiScoreResult, newScores);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tme.karaoke.lib_singscore.ScoreResult)) {
            return false;
        }
        com.tme.karaoke.lib_singscore.ScoreResult scoreResult = (com.tme.karaoke.lib_singscore.ScoreResult) other;
        return this.sentenceIndex == scoreResult.sentenceIndex && kotlin.jvm.internal.o.b(this.pYinScoreResult, scoreResult.pYinScoreResult) && kotlin.jvm.internal.o.b(this.acfScoreResult, scoreResult.acfScoreResult) && kotlin.jvm.internal.o.b(this.multiScoreResult, scoreResult.multiScoreResult) && kotlin.jvm.internal.o.b(this.newScores, scoreResult.newScores);
    }

    public final com.tme.karaoke.lib_singscore.MIDIScoreResult getAcfScoreResult() {
        return this.acfScoreResult;
    }

    public final com.tme.karaoke.lib_singscore.MultiScoreResult getMultiScoreResult() {
        return this.multiScoreResult;
    }

    public final byte[] getNewScores() {
        return this.newScores;
    }

    public final com.tme.karaoke.lib_singscore.MIDIScoreResult getPYinScoreResult() {
        return this.pYinScoreResult;
    }

    public final int getSentenceIndex() {
        return this.sentenceIndex;
    }

    public int hashCode() {
        int hashCode = java.lang.Integer.hashCode(this.sentenceIndex) * 31;
        com.tme.karaoke.lib_singscore.MIDIScoreResult mIDIScoreResult = this.pYinScoreResult;
        int hashCode2 = (hashCode + (mIDIScoreResult == null ? 0 : mIDIScoreResult.hashCode())) * 31;
        com.tme.karaoke.lib_singscore.MIDIScoreResult mIDIScoreResult2 = this.acfScoreResult;
        int hashCode3 = (hashCode2 + (mIDIScoreResult2 == null ? 0 : mIDIScoreResult2.hashCode())) * 31;
        com.tme.karaoke.lib_singscore.MultiScoreResult multiScoreResult = this.multiScoreResult;
        int hashCode4 = (hashCode3 + (multiScoreResult == null ? 0 : multiScoreResult.hashCode())) * 31;
        byte[] bArr = this.newScores;
        return hashCode4 + (bArr != null ? java.util.Arrays.hashCode(bArr) : 0);
    }

    public java.lang.String toString() {
        return "ScoreResult(sentenceIndex=" + this.sentenceIndex + ", pYinScoreResult=" + this.pYinScoreResult + ", acfScoreResult=" + this.acfScoreResult + ", multiScoreResult=" + this.multiScoreResult + ", newScores=" + java.util.Arrays.toString(this.newScores) + ")";
    }

    public /* synthetic */ ScoreResult(int i17, com.tme.karaoke.lib_singscore.MIDIScoreResult mIDIScoreResult, com.tme.karaoke.lib_singscore.MIDIScoreResult mIDIScoreResult2, com.tme.karaoke.lib_singscore.MultiScoreResult multiScoreResult, byte[] bArr, int i18, kotlin.jvm.internal.i iVar) {
        this(i17, (i18 & 2) != 0 ? null : mIDIScoreResult, (i18 & 4) != 0 ? null : mIDIScoreResult2, (i18 & 8) != 0 ? null : multiScoreResult, (i18 & 16) != 0 ? null : bArr);
    }
}
