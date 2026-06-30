package com.tme.karaoke.lib_singscore;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/tme/karaoke/lib_singscore/ScoreConfig;", "", "noteData", "", "stcTime", "", "stcToScore", "multiParam", "Lcom/tme/karaoke/lib_singscore/MultiParams;", "([B[I[ILcom/tme/karaoke/lib_singscore/MultiParams;)V", "getMultiParam", "()Lcom/tme/karaoke/lib_singscore/MultiParams;", "getNoteData", "()[B", "getStcTime", "()[I", "getStcToScore", "lib_singscore_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ScoreConfig {
    private final com.tme.karaoke.lib_singscore.MultiParams multiParam;
    private final byte[] noteData;
    private final int[] stcTime;
    private final int[] stcToScore;

    public ScoreConfig(byte[] noteData, int[] stcTime, int[] iArr, com.tme.karaoke.lib_singscore.MultiParams multiParams) {
        kotlin.jvm.internal.o.g(noteData, "noteData");
        kotlin.jvm.internal.o.g(stcTime, "stcTime");
        this.noteData = noteData;
        this.stcTime = stcTime;
        this.stcToScore = iArr;
        this.multiParam = multiParams;
    }

    public final com.tme.karaoke.lib_singscore.MultiParams getMultiParam() {
        return this.multiParam;
    }

    public final byte[] getNoteData() {
        return this.noteData;
    }

    public final int[] getStcTime() {
        return this.stcTime;
    }

    public final int[] getStcToScore() {
        return this.stcToScore;
    }

    public /* synthetic */ ScoreConfig(byte[] bArr, int[] iArr, int[] iArr2, com.tme.karaoke.lib_singscore.MultiParams multiParams, int i17, kotlin.jvm.internal.i iVar) {
        this(bArr, iArr, (i17 & 4) != 0 ? null : iArr2, multiParams);
    }
}
