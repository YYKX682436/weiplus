package com.tme.karaoke.lib_singscore;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J1\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006#"}, d2 = {"Lcom/tme/karaoke/lib_singscore/LoudnessItem;", "Ljava/io/Serializable;", "startMs", "", "endMs", "loudness", "", "valid", "", "(IIFZ)V", "getEndMs", "()I", "setEndMs", "(I)V", "getLoudness", "()F", "setLoudness", "(F)V", "getStartMs", "setStartMs", "getValid", "()Z", "setValid", "(Z)V", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "toString", "", "lib_singscore_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class LoudnessItem implements java.io.Serializable {
    private int endMs;
    private float loudness;
    private int startMs;
    private boolean valid;

    public LoudnessItem() {
        this(0, 0, 0.0f, false, 15, null);
    }

    public static /* synthetic */ com.tme.karaoke.lib_singscore.LoudnessItem copy$default(com.tme.karaoke.lib_singscore.LoudnessItem loudnessItem, int i17, int i18, float f17, boolean z17, int i19, java.lang.Object obj) {
        if ((i19 & 1) != 0) {
            i17 = loudnessItem.startMs;
        }
        if ((i19 & 2) != 0) {
            i18 = loudnessItem.endMs;
        }
        if ((i19 & 4) != 0) {
            f17 = loudnessItem.loudness;
        }
        if ((i19 & 8) != 0) {
            z17 = loudnessItem.valid;
        }
        return loudnessItem.copy(i17, i18, f17, z17);
    }

    /* renamed from: component1, reason: from getter */
    public final int getStartMs() {
        return this.startMs;
    }

    /* renamed from: component2, reason: from getter */
    public final int getEndMs() {
        return this.endMs;
    }

    /* renamed from: component3, reason: from getter */
    public final float getLoudness() {
        return this.loudness;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getValid() {
        return this.valid;
    }

    public final com.tme.karaoke.lib_singscore.LoudnessItem copy(int startMs, int endMs, float loudness, boolean valid) {
        return new com.tme.karaoke.lib_singscore.LoudnessItem(startMs, endMs, loudness, valid);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tme.karaoke.lib_singscore.LoudnessItem)) {
            return false;
        }
        com.tme.karaoke.lib_singscore.LoudnessItem loudnessItem = (com.tme.karaoke.lib_singscore.LoudnessItem) other;
        return this.startMs == loudnessItem.startMs && this.endMs == loudnessItem.endMs && java.lang.Float.compare(this.loudness, loudnessItem.loudness) == 0 && this.valid == loudnessItem.valid;
    }

    public final int getEndMs() {
        return this.endMs;
    }

    public final float getLoudness() {
        return this.loudness;
    }

    public final int getStartMs() {
        return this.startMs;
    }

    public final boolean getValid() {
        return this.valid;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((java.lang.Integer.hashCode(this.startMs) * 31) + java.lang.Integer.hashCode(this.endMs)) * 31) + java.lang.Float.hashCode(this.loudness)) * 31;
        boolean z17 = this.valid;
        int i17 = z17;
        if (z17 != 0) {
            i17 = 1;
        }
        return hashCode + i17;
    }

    public final void setEndMs(int i17) {
        this.endMs = i17;
    }

    public final void setLoudness(float f17) {
        this.loudness = f17;
    }

    public final void setStartMs(int i17) {
        this.startMs = i17;
    }

    public final void setValid(boolean z17) {
        this.valid = z17;
    }

    public java.lang.String toString() {
        return "LoudnessItem(startMs=" + this.startMs + ", endMs=" + this.endMs + ", loudness=" + this.loudness + ", valid=" + this.valid + ")";
    }

    public LoudnessItem(int i17, int i18, float f17, boolean z17) {
        this.startMs = i17;
        this.endMs = i18;
        this.loudness = f17;
        this.valid = z17;
    }

    public /* synthetic */ LoudnessItem(int i17, int i18, float f17, boolean z17, int i19, kotlin.jvm.internal.i iVar) {
        this((i19 & 1) != 0 ? 0 : i17, (i19 & 2) != 0 ? 0 : i18, (i19 & 4) != 0 ? 0.0f : f17, (i19 & 8) != 0 ? false : z17);
    }
}
