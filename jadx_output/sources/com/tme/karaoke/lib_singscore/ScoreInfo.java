package com.tme.karaoke.lib_singscore;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/tme/karaoke/lib_singscore/ScoreInfo;", "", "sampleRate", "", "channel", "bitDepth", "(III)V", "getBitDepth", "()I", "getChannel", "getSampleRate", "lib_singscore_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ScoreInfo {
    private final int bitDepth;
    private final int channel;
    private final int sampleRate;

    public ScoreInfo(int i17, int i18, int i19) {
        this.sampleRate = i17;
        this.channel = i18;
        this.bitDepth = i19;
    }

    public final int getBitDepth() {
        return this.bitDepth;
    }

    public final int getChannel() {
        return this.channel;
    }

    public final int getSampleRate() {
        return this.sampleRate;
    }
}
